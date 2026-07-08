package Y;

import X.AbstractC2199801B7q;
import X.C01GW;
import X.C1016460cYe;
import X.C1016490cYh;
import X.C1035880d3y;
import X.C1037380d6O;
import X.C1038270d7p;
import X.C1042040dDu;
import X.C1C7U;
import X.C2249208ra;
import X.C2274591E1h;
import X.EnumC565770MGx;
import android.content.Context;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.ss.android.ugc.aweme.ad.service.IAdExternalGuideService;
import com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS2S3300000_16 implements Runnable {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;

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
        C1042040dDu c1042040dDu = (C1042040dDu) this.l3;
        Context context = (Context) this.l4;
        String str = this.s0;
        SSPResponse.Rule rule = (SSPResponse.Rule) this.l5;
        String str2 = this.s1;
        String str3 = this.s2;
        c1042040dDu.getClass();
        C1037380d6O c1037380d6O = C1037380d6O.LIZ;
        C1035880d3y c1035880d3y = c1042040dDu.LIZ;
        c1037380d6O.getClass();
        C1037380d6O.LJ(c1035880d3y, str, context);
        IAdExternalGuideService iAdExternalGuideService = (IAdExternalGuideService) PluggableExtentionKt.pluggableSpi$default(IAdExternalGuideService.class, false, false, false, 14, null);
        if (iAdExternalGuideService == null || iAdExternalGuideService.getStatus() == null || !C1038270d7p.LIZIZ) {
            c1042040dDu.LIZJ(C2274591E1h.LIZ, rule, str, str2, str3);
        }
    }

    public final void LIZ$1() {
        AbstractC2199801B7q abstractC2199801B7qWith;
        C01GW c01gw = C2249208ra.LIZ;
        IBaseDownloadService iBaseDownloadService = (IBaseDownloadService) C2249208ra.LIZ.getValue();
        if (iBaseDownloadService == null || (abstractC2199801B7qWith = iBaseDownloadService.with(this.s0)) == null) {
            return;
        }
        abstractC2199801B7qWith.LJIIIIZZ = (ArrayList) this.l3;
        abstractC2199801B7qWith.LJ = this.s1;
        abstractC2199801B7qWith.LIZJ = this.s2;
        C1016460cYe c1016460cYe = (C1016460cYe) this.l4;
        abstractC2199801B7qWith.LJIIIZ = c1016460cYe.LIZJ;
        abstractC2199801B7qWith.LJIIJJI = (C1016490cYh) this.l5;
        abstractC2199801B7qWith.LJIIJ = c1016460cYe.LJII;
        abstractC2199801B7qWith.LJFF = true;
        abstractC2199801B7qWith.LIZLLL(EnumC565770MGx.VIDEO);
    }

    public static final void run$0(ARunnableS2S3300000_16 aRunnableS2S3300000_16) {
        boolean zLIZ;
        C1C7U.LIZ("RecordingBOCRuleMatcher@5430.showDialog$openBOCRunnable$1");
        try {
            aRunnableS2S3300000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordingBOCRuleMatcher@5430.showDialog$openBOCRunnable$1");
    }

    public static final void run$1(ARunnableS2S3300000_16 aRunnableS2S3300000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleVideoPreloader@8185.preloadVideo$4");
        try {
            aRunnableS2S3300000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleVideoPreloader@8185.preloadVideo$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS2S3300000_16(String str, String str2, ArrayList<String> arrayList, String str3, String str4, C1016460cYe c1016460cYe, C1016490cYh c1016490cYh) {
        this.$t = c1016490cYh;
        this.s0 = str;
        this.l3 = str2;
        this.s1 = arrayList;
        this.s2 = str3;
        this.l4 = str4;
        this.l5 = c1016460cYe;
    }
}
