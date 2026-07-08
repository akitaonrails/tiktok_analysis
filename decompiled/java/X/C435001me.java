package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.ShareStreakUtil$showErrorToast$2", f = "StreakShareUtil.kt", l = {}, m = "invokeSuspend")
public final class C435001me extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C435001me(InterfaceC1364105Vn<? super C435001me> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435001me(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareStreakUtil@bf84.showErrorToast$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Activity activityLIZIZ = null;
        if (abstractC1387200mCcLJ != null) {
            activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
        }
        if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
            String string = activityLIZIZ.getString(2131832125);
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ShareStreakUtil@bf84.showErrorToast$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ShareStreakUtil@bf84.showErrorToast$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C435001me(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
