package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakShareInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05eF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.StreakShareDataCenter$getShareInfo$result$1$deferred$1$1", f = "StreakShareDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C1402105eF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StreakShareInfo>, Object> {
    public C1402105eF(InterfaceC1364105Vn<? super C1402105eF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1402105eF(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakShareDataCenter@91cf.getShareInfo$result$1$deferred$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C15520065u.LIZIZ.getClass();
        StreakShareInfo streakShareInfoLIZIZ = C15520065u.LIZIZ(C15520065u.LIZ());
        C1C7U.LIZIZ("StreakShareDataCenter@91cf.getShareInfo$result$1$deferred$1$1");
        return streakShareInfoLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StreakShareInfo> interfaceC1364105Vn) {
        return new C1402105eF(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
