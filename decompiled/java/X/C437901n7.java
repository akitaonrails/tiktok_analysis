package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01n7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileAITheaterViewModel$refreshCameoInfo$1$2$1", f = "EditProfileAITheaterViewModel.kt", l = {}, m = "invokeSuspend")
public final class C437901n7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Throwable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437901n7(Throwable th, InterfaceC1364105Vn<? super C437901n7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437901n7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View viewLJI;
        C1C7U.LIZ("EditProfileAITheaterViewModel@2219.refreshCameoInfo$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null && (viewLJI = abstractC1387200mCcLJFF.LJI()) != null) {
            Throwable th = this.LL;
            C1389890mGx c1389890mGx = new C1389890mGx(viewLJI);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AI Theater request error: ");
            sbLIZ.append(th.getMessage());
            c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditProfileAITheaterViewModel@2219.refreshCameoInfo$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
