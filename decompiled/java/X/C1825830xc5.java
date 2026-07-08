package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825830xc5 extends AbstractC1826160xcc<C1825890xcB, AbstractC991520buQ<? extends Unit>> {
    public final InterfaceC1826050xcR LIZ;

    public C1825830xc5(C490610JLv c490610JLv) {
        this.LIZ = c490610JLv;
    }

    public final void LIZ(C1825890xcB c1825890xcB) {
        String str;
        PcsDialogAbility pcsDialogAbility;
        try {
            InterfaceC665370Q7z interfaceC665370Q7z = c1825890xcB.LJI;
            if (interfaceC665370Q7z != null && (pcsDialogAbility = (PcsDialogAbility) C1558520qew.LIZ(interfaceC665370Q7z, PcsDialogAbility.class, null)) != null) {
                pcsDialogAbility.cj0();
            }
            if (c1825890xcB.LIZIZ.length() == 0) {
                new C991530buR(new IllegalArgumentException("Message schema is empty"), "Cannot open DM without schema");
                return;
            }
            this.LIZ.LIZIZ(c1825890xcB.LIZ, c1825890xcB.LIZIZ, c1825890xcB.LIZJ, c1825890xcB.LJ, c1825890xcB.LIZLLL);
            String str2 = c1825890xcB.LIZJ;
            if (str2 != null && str2.length() != 0) {
                str = "suggested_question";
            } else {
                str = "dm";
            }
            C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_service_bio_dm_click_count_live_session");
            C1822730xX5.LJ(EnumC1123040fKY.DM, (C1822330xWR) c1825890xcB.LJII.getValue());
            String str3 = c1825890xcB.LIZLLL;
            if (str3 == null) {
                str3 = "";
            }
            C1822730xX5.LIZIZ(new C1822950xXR("click", str, null, str3, null, null, c1825890xcB.LJFF, (C1822330xWR) c1825890xcB.LJII.getValue(), 52));
            new C991510buP(Unit.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            new C991530buR(e, "Failed to open DM");
        }
    }
}
