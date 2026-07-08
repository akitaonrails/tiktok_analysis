package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09Jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.EditGuidePostHelper$markShownSaveLocalComplianceTip$1", f = "EditGuidePostHelper.kt", l = {}, m = "invokeSuspend")
public final class C2352709Jt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2352709Jt(InterfaceC1364105Vn<? super C2352709Jt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2352709Jt(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditGuidePostHelper@3a46.markShownSaveLocalComplianceTip$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1418900n1k.LIZ.getClass();
        ((Keva) C1418900n1k.LIZIZ.getValue()).storeBoolean("key_has_shown_save_local_compliance_tip", true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditGuidePostHelper@3a46.markShownSaveLocalComplianceTip$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2352709Jt(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
