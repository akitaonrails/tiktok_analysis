package Y;

import X.C1143680frq;
import X.C1143780fs0;
import X.C1161920gLG;
import X.C1322200kVm;
import X.C1325540kbA;
import X.C1325710kbR;
import X.C1325880kbi;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1537070q6L;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS6S2000000_17 implements Runnable {
    public final int $t;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        IHostResource iHostResource;
        String str;
        String str2 = this.s0;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = this.s1;
        if (str4 == null) {
            str4 = "";
        }
        File fileLJII = C1143780fs0.LJII(str2, str4);
        if (fileLJII != null && fileLJII.exists()) {
            if (C497740JfY.LJII() != null && fileLJII.exists()) {
                C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                Uri uri = C1325880kbi.LIZ;
                c1325540kbALIZ.LJIIZILJ(C1325710kbR.LIZ(Uri.fromFile(fileLJII)), C497740JfY.LJII());
                return;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preLoadImageFromFile,load resource error,filePath:");
                sbLIZ.append(fileLJII.getAbsolutePath());
                C20441214yg.LJ("Gecko_Resource_Loader", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        String str5 = this.s0;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.s1;
        if (str6 == null) {
            str6 = "";
        }
        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6) && (iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class)) != null && (str = (String) ListProtector.get(iHostResource.mN(str5, str6), 0)) != null) {
            str3 = str;
        }
        C1143680frq.LJJIII(str3);
    }

    public static final void run$0(ARunnableS6S2000000_17 aRunnableS6S2000000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GeckoResourceLoader@9f63.preLoadImage$1");
        try {
            aRunnableS6S2000000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeckoResourceLoader@9f63.preLoadImage$1");
    }

    public static final void run$1(ARunnableS6S2000000_17 aRunnableS6S2000000_17) {
        boolean zLIZ;
        C1C7U.LIZ("PromotePreloadHelper@13a3.preloadPromotePage$1");
        try {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            String str = aRunnableS6S2000000_17.s0;
            final String str2 = aRunnableS6S2000000_17.s1;
            C1537060q6K.LJIIJ(str, "live_promote_url_preload", null, new C1537070q6L() { // from class: X.0eyl
                @Override // X.C1537070q6L
                public final void LIZJ(String str3, String str4, C1537080q6M c1537080q6M) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preloadPromotePage preload failed, schema:");
                    sbLIZ.append(str3);
                    C20441214yg.LIZIZ("PromotePreloadHelper", C2188811AlT.LIZIZ(sbLIZ));
                    C1109550eyn.LIZ = false;
                }

                @Override // X.C1537070q6L
                public final void LIZLLL(String str3, String str4, InterfaceC1105930esx interfaceC1105930esx) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preloadPromotePage preload success, schema:");
                    sbLIZ.append(str3);
                    C20441214yg.LIZIZ("PromotePreloadHelper", C2188811AlT.LIZIZ(sbLIZ));
                    C1109550eyn.LIZ = false;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_fe_page_preload_success");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                    c474500IjALIZ.LJJII(str2, "card_type");
                    c474500IjALIZ.LIZ();
                }
            }, true, Boolean.FALSE);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PromotePreloadHelper@13a3.preloadPromotePage$1");
    }

    public ARunnableS6S2000000_17(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
