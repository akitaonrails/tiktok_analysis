package X;

import com.ss.android.ugc.aweme.IDuetDownloadService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0drC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066400drC extends AbstractC1066970ds7 {
    public final C01GW LLJI = C452501pT.LIZIZ(new C1066410drD());

    @Override // X.AbstractC1066970ds7
    public final boolean LJJIJIL() {
        return false;
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(null, null, new AwS560S0100000_16(this, 693), null, null, 27);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1066400drC();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.CT_DUET_ANCHOR.getTYPE();
    }

    public final boolean LJJIL(long j) {
        if (j > ((Number) this.LLJI.getValue()).intValue()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "show_duet_v2_anchor", true) == 1) {
            return super.LJJJJLL(list);
        }
        C19719612Di.LJJIIJ(list, new AwS595S0100000_16(this, 231), true);
        return EnumC1050190dR3.NOT_FOUND;
    }

    public final void LJJLIIIJJI(String str) {
        IDuetDownloadService iDuetDownloadService;
        if (str != null && str.length() != 0 && (iDuetDownloadService = (IDuetDownloadService) PluggableExtentionKt.pluggableSpi$default(IDuetDownloadService.class, false, false, false, 14, null)) != null) {
            iDuetDownloadService.LJFF(LJIILJJIL(), str, C2097608Jq.LJIIIIZZ(new Pair("duet_shoot_way", "duet"), new Pair("duet_entrance_type", "anchor")), LJIJJLI());
        }
    }

    @Override // X.AbstractC1066970ds7, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        super.p1(c2344009Gk);
        IDuetDownloadService iDuetDownloadService = (IDuetDownloadService) PluggableExtentionKt.pluggableSpi$default(IDuetDownloadService.class, false, false, false, 14, null);
        if (iDuetDownloadService != null) {
            iDuetDownloadService.LIZJ(LJIIZILJ(), LJIJJLI(), "anchor");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[PHI: r2
      0x0083: PHI (r2v6 java.lang.String) = (r2v1 java.lang.String), (r2v7 java.lang.String) binds: [B:32:0x0081, B:30:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[PHI: r2
      0x0096: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v6 java.lang.String) binds: [B:32:0x0081, B:34:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // X.AbstractC1066970ds7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(android.view.View r19, X.C2344009Gk r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1066400drC.LJJIJL(android.view.View, X.09Gk, java.lang.String):void");
    }
}
