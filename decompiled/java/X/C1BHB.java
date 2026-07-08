package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1BHB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BHB extends C2202311BHh {
    public final boolean LIZ;
    public final C1497050p3n LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;

    public final String LJ() {
        String str = this.LIZJ;
        boolean z = false;
        if (str != null && a0.LJJIIZI(str, "target=", false)) {
            z = true;
        }
        if (z) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(this.LIZJ), "target");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            String str2 = this.LIZJ;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    @Override // X.C2202311BHh, X.InterfaceC2202301BHg
    public final void LIZJ(String str) {
        this.LIZJ = str;
    }

    @Override // X.C2202311BHh, X.InterfaceC2202301BHg
    public final void LIZLLL(String str) {
        C1497050p3n c1497050p3n;
        if (this.LIZ && (c1497050p3n = this.LIZIZ) != null) {
            c1497050p3n.LIZ(str);
        }
        if (this.LIZLLL) {
            C1BH6.LIZ.getClass();
            if (Intrinsics.LJFF(C1BH6.LIZIZ, "no_internet") || Intrinsics.LJFF(C1BH6.LIZIZ, "broken")) {
                C1BH6.LIZIZ = "safe";
                SearchLandingPageViewModel searchLandingPageViewModel = C1BH6.LJIIIIZZ;
                if (searchLandingPageViewModel == null) {
                    searchLandingPageViewModel = null;
                }
                searchLandingPageViewModel.vQ2("safe");
                C1BH6.LJFF = true;
            }
            this.LIZLLL = false;
            C1BH6.LJFF = false;
        }
    }

    @Override // X.C2202311BHh, X.InterfaceC2202301BHg
    public final void LIZ(int i, String str) {
        if (!this.LIZLLL) {
            this.LIZLLL = true;
            C1BH6.LIZ.getClass();
            C1BH6.LJFF = true;
        }
    }

    public C1BHB(String str, boolean z, C1497050p3n c1497050p3n) {
        this.LIZ = z;
        this.LIZIZ = c1497050p3n;
        this.LIZJ = str;
    }
}
