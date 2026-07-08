package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakShareInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05wW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.StreakShareDataCenter$getShareInfo$1", f = "StreakShareDataCenter.kt", l = {86}, m = "invokeSuspend")
public final class C1515405wW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StreakShareInfo>, Object> {
    public int LL;

    public C1515405wW(InterfaceC1364105Vn<? super C1515405wW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1515405wW(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakShareDataCenter@91cf.getShareInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C15520065u c15520065u = C15520065u.LIZIZ;
            this.LL = 1;
            obj = c15520065u.LIZLLL(C06FV.LIZ().shareInfoRequestRetryCount, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StreakShareDataCenter@91cf.getShareInfo$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StreakShareDataCenter@91cf.getShareInfo$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StreakShareInfo> interfaceC1364105Vn) {
        return new C1515405wW(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
