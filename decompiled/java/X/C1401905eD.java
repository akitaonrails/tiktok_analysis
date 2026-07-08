package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakShareInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.StreakShareDataCenter$preHeat$1$deferred$1", f = "StreakShareDataCenter.kt", l = {103}, m = "invokeSuspend")
public final class C1401905eD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StreakShareInfo>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401905eD(int i, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1401905eD(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakShareDataCenter@91cf.preHeat$1$deferred$1");
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
            long j = this.LLILLJJLI;
            int i2 = this.LLILLL;
            this.LL = 1;
            obj = c15520065u.LIZJ(i2, j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StreakShareDataCenter@91cf.preHeat$1$deferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StreakShareDataCenter@91cf.preHeat$1$deferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StreakShareInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
