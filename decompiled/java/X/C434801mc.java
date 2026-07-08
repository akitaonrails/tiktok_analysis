package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.triggers.StreakPetInvitationTrigger$showErrorToast$1", f = "StreakPetInvitationTrigger.kt", l = {}, m = "invokeSuspend")
public final class C434801mc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434801mc(String str, InterfaceC1364105Vn<? super C434801mc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434801mc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetInvitationTrigger@b0cc.showErrorToast$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Activity activityLIZIZ = null;
        if (abstractC1387200mCcLJ != null) {
            activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
        }
        if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
            String string = this.LL;
            if (string.length() == 0) {
                string = activityLIZIZ.getString(2131832125);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StreakPetInvitationTrigger@b0cc.showErrorToast$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetInvitationTrigger@b0cc.showErrorToast$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
