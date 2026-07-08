package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825820xc4 extends AbstractC1826160xcc<C1825980xcK, AbstractC991520buQ<? extends Unit>> {
    public final InterfaceC1826050xcR LIZ;

    public C1825820xc4(C490610JLv c490610JLv) {
        this.LIZ = c490610JLv;
    }

    public final void LIZ(C1825980xcK c1825980xcK) {
        PcsDialogAbility pcsDialogAbility;
        try {
            InterfaceC665370Q7z interfaceC665370Q7z = c1825980xcK.LJ;
            if (interfaceC665370Q7z != null && (pcsDialogAbility = (PcsDialogAbility) C1558520qew.LIZ(interfaceC665370Q7z, PcsDialogAbility.class, null)) != null) {
                pcsDialogAbility.cj0();
            }
            if (c1825980xcK.LIZIZ.LLILZ.length() == 0) {
                new C991530buR(new IllegalArgumentException("Calendar schema is empty"), "Cannot open calendar without schema");
                return;
            }
            this.LIZ.LIZJ(c1825980xcK.LIZ, c1825980xcK.LIZIZ.LLILZ, C2097608Jq.LJ());
            C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_calendar_click_count");
            String strValueOf = c1825980xcK.LIZJ;
            if (strValueOf == null) {
                strValueOf = String.valueOf(c1825980xcK.LIZIZ.LL);
            }
            C1822730xX5.LIZIZ(new C1822950xXR("click", "calendly", null, null, null, strValueOf, c1825980xcK.LIZLLL, (C1822330xWR) c1825980xcK.LJFF.getValue(), 28));
            new C991510buP(Unit.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            new C991530buR(e, "Failed to open calendar");
        }
    }
}
