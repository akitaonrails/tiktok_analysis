package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825790xc1 extends AbstractC1826160xcc<C1825920xcE, AbstractC991520buQ<? extends Unit>> {
    public final InterfaceC1826050xcR LIZ;

    public C1825790xc1(C490610JLv c490610JLv) {
        this.LIZ = c490610JLv;
    }

    public final void LIZ(C1825920xcE c1825920xcE) {
        PcsDialogAbility pcsDialogAbility;
        try {
            InterfaceC665370Q7z interfaceC665370Q7z = c1825920xcE.LJ;
            if (interfaceC665370Q7z != null && (pcsDialogAbility = (PcsDialogAbility) C1558520qew.LIZ(interfaceC665370Q7z, PcsDialogAbility.class, null)) != null) {
                pcsDialogAbility.cj0();
            }
            if (c1825920xcE.LIZIZ.LLILLL.length() == 0) {
                new C991530buR(new IllegalArgumentException("Form schema is empty"), "Cannot open form without schema");
                return;
            }
            this.LIZ.LIZ(c1825920xcE.LIZ, c1825920xcE.LIZIZ.LLILLL);
            C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_service_bio_form_click_count_live_session");
            C1822730xX5.LJ(EnumC1123040fKY.FORM, (C1822330xWR) c1825920xcE.LJFF.getValue());
            C1822730xX5.LIZIZ(new C1822950xXR("click", "form", null, null, Long.valueOf(c1825920xcE.LIZIZ.LL), null, c1825920xcE.LIZLLL, (C1822330xWR) c1825920xcE.LJFF.getValue(), 44));
            new C991510buP(Unit.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            new C991530buR(e, "Failed to open form");
        }
    }
}
