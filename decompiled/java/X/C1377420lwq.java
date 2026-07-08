package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377420lwq {
    public static C1377310lwf LJII;
    public static AwS565S0100000_21 LJIIIIZZ;
    public final Activity LIZ;
    public final IESJsBridge LIZIZ;
    public final InterfaceC1541990qEH LIZJ;
    public final C1371600lnS LIZLLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJ;
    public boolean LJFF;
    public final C1377430lwr LJI = new AbstractC1542100qES() { // from class: X.0lwr
        @Override // X.AbstractC1537870q7d
        public final void LJLILLLLZI() {
        }

        @Override // X.AbstractC1537870q7d
        public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
        }

        @Override // X.AbstractC1537870q7d
        public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
            HybridImageSharePackage hybridImageSharePackage;
            C1377420lwq c1377420lwq = this.LL;
            BaseSharePackage baseSharePackage = c1377420lwq.LIZLLL.LJJIIJ;
            if (baseSharePackage instanceof HybridImageSharePackage) {
                hybridImageSharePackage = (HybridImageSharePackage) baseSharePackage;
            } else {
                hybridImageSharePackage = null;
            }
            if (hybridImageSharePackage != null) {
                hybridImageSharePackage.isHybridLoadFinish = true;
            }
            c1377420lwq.LJFF = true;
        }

        @Override // X.AbstractC1537870q7d
        public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
            HybridImageSharePackage hybridImageSharePackage;
            BaseSharePackage baseSharePackage = this.LL.LIZLLL.LJJIIJ;
            if ((baseSharePackage instanceof HybridImageSharePackage) && (hybridImageSharePackage = (HybridImageSharePackage) baseSharePackage) != null) {
                hybridImageSharePackage.isHybridLoadFailed = false;
            }
        }

        @Override // X.AbstractC1537870q7d
        public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
            HybridImageSharePackage hybridImageSharePackage;
            BaseSharePackage baseSharePackage = this.LL.LIZLLL.LJJIIJ;
            if ((baseSharePackage instanceof HybridImageSharePackage) && (hybridImageSharePackage = (HybridImageSharePackage) baseSharePackage) != null) {
                hybridImageSharePackage.isHybridLoadFailed = true;
            }
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[PHI: r10
      0x003c: PHI (r10v5 java.lang.String) = (r10v0 java.lang.String), (r10v6 java.lang.String) binds: [B:19:0x003a, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[PHI: r10
      0x0048: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v5 java.lang.String), (r10v5 java.lang.String) binds: [B:19:0x003a, B:21:0x003e, B:23:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[PHI: r10 r11
      0x004b: PHI (r10v4 java.lang.String) = (r10v1 java.lang.String), (r10v5 java.lang.String) binds: [B:25:0x0049, B:23:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r11v3 java.lang.String) = (r11v0 java.lang.String), (r11v4 java.lang.String) binds: [B:25:0x0049, B:23:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[PHI: r10 r11
      0x0057: PHI (r10v2 java.lang.String) = (r10v1 java.lang.String), (r10v4 java.lang.String), (r10v4 java.lang.String) binds: [B:25:0x0049, B:27:0x004d, B:29:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String), (r11v3 java.lang.String) binds: [B:25:0x0049, B:27:0x004d, B:29:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1377420lwq.LIZ():void");
    }

    public final Bitmap LIZIZ(WebShareInfo.HybridContainerInfo hybridContainerInfo) {
        boolean z;
        Bitmap bitmapLIZLLL;
        String str;
        View viewE1;
        LynxView lynxView;
        String str2;
        InterfaceC1541990qEH kitView;
        View view = this.LJ;
        if (hybridContainerInfo != null && hybridContainerInfo.urlContentType == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (hybridContainerInfo != null) {
                str = hybridContainerInfo.captureViewName;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                    viewE1 = kitView.e1();
                } else {
                    viewE1 = null;
                }
                if (viewE1 instanceof C1537710q7N) {
                    lynxView = (LynxView) viewE1;
                } else {
                    lynxView = null;
                }
                if (lynxView != null) {
                    if (hybridContainerInfo != null) {
                        str2 = hybridContainerInfo.captureViewName;
                    } else {
                        str2 = null;
                    }
                    View viewFindViewByName = lynxView.findViewByName(str2);
                    if (viewFindViewByName != null) {
                        view = viewFindViewByName;
                    }
                }
            }
        }
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout((int) view.getX(), (int) view.getY(), ((int) view.getX()) + view.getMeasuredWidth(), ((int) view.getY()) + view.getMeasuredHeight());
        try {
            bitmapLIZLLL = C842150X1x.LIZLLL(view, CertProviderManagerKt.findCert("bpea-jsb_hybrid_preview_screenshot", 1476435982));
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            bitmapLIZLLL = null;
        }
        if (bitmapLIZLLL == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLIZLLL, 0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lwr] */
    public C1377420lwq(Activity activity, IESJsBridge iESJsBridge, InterfaceC1541990qEH interfaceC1541990qEH, C1371600lnS c1371600lnS) {
        this.LIZ = activity;
        this.LIZIZ = iESJsBridge;
        this.LIZJ = interfaceC1541990qEH;
        this.LIZLLL = c1371600lnS;
    }
}
