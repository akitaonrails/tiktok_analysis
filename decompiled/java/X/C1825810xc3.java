package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825810xc3 extends AbstractC1826160xcc<C1825990xcL, AbstractC991520buQ<? extends Unit>> {
    public final InterfaceC1826050xcR LIZ;

    public C1825810xc3(C490610JLv c490610JLv) {
        this.LIZ = c490610JLv;
    }

    public final void LIZ(C1825990xcL c1825990xcL) {
        PcsDialogAbility pcsDialogAbility;
        try {
            InterfaceC665370Q7z interfaceC665370Q7z = c1825990xcL.LJ;
            if (interfaceC665370Q7z != null && (pcsDialogAbility = (PcsDialogAbility) C1558520qew.LIZ(interfaceC665370Q7z, PcsDialogAbility.class, null)) != null) {
                pcsDialogAbility.cj0();
            }
            if (c1825990xcL.LIZIZ.LLILZ.length() == 0) {
                new C991530buR(new IllegalArgumentException("Course schema is empty"), "Cannot open course without schema");
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", "service_plus_pannel");
            String str = c1825990xcL.LIZJ;
            if (str != null) {
                linkedHashMap.put("show_entrance", str);
            }
            this.LIZ.LIZLLL(c1825990xcL.LIZ, c1825990xcL.LIZIZ.LLILZ, linkedHashMap);
            C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_course_unpaid_video_click_count");
            C1822730xX5.LIZIZ(new C1822950xXR("click", "course", Long.valueOf(c1825990xcL.LIZIZ.LL), null, null, null, c1825990xcL.LIZLLL, (C1822330xWR) c1825990xcL.LJFF.getValue(), 56));
            new C991510buP(Unit.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            new C991530buR(e, "Failed to open course");
        }
    }
}
