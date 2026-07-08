package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.LiveSheetAnimationParamsOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizDialogInterceptDegradeSetting;
import com.bytedance.android.livesdkapi.avoidance.setting.LiveNotifySlardarSampleRateSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0fFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119850fFP {
    public static volatile boolean LJJIFFI;
    public static volatile boolean LJJII;
    public static volatile boolean LJJIII;
    public Context LIZ;
    public volatile C783430UoH LIZIZ;
    public volatile InterfaceC783390UoD LIZJ;
    public volatile InterfaceC1119900fFU LIZLLL;
    public volatile InterfaceC1119900fFU LJ;
    public volatile int LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public volatile boolean LJIIJ;
    public volatile boolean LJIIJJI;
    public volatile boolean LJIIL;
    public volatile boolean LJIILIIL;
    public volatile boolean LJIILJJIL;
    public volatile int LJIILL;
    public volatile int LJIILLIIL;
    public volatile C1119880fFS LJIIZILJ;
    public volatile C1119860fFQ LJIJ;
    public volatile C1090420eTw LJIJI;
    public volatile boolean LJIJJ;
    public volatile boolean LJIL;
    public C1119890fFT LJJ;
    public volatile InterfaceC771630UOr LJJI;
    public static volatile Map<String, Integer> LJJIIJZLJL = new HashMap();
    public static volatile SparseArray<String> LJJIIJ = new SparseArray<>();
    public volatile double LJFF = -1.0d;
    public volatile int LJIJJLI = 2;

    static {
        LJJIIJ.put(1, "regular");
        LJJIIJ.put(2, "bold");
        LJJIIJ.put(3, "boldItalic");
        LJJIIJ.put(4, "italic");
        LJJIIJ.put(5, "light");
        LJJIIJ.put(6, "lightItalic");
        LJJIIJ.put(7, "medium");
        LJJIIJ.put(8, "mediumItalic");
        LJJIIJZLJL.put("regular", 400);
        LJJIIJZLJL.put("bold", Integer.valueOf(OppoPermissionPopupMaskDelayExp.DEFAULT));
        LJJIIJZLJL.put("medium", 500);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0fFS] */
    public final InterfaceC1119800fFK LIZIZ() {
        if (this.LJIIZILJ == null && this.LJJI != null) {
            this.LJJI.getClass();
            this.LJIIZILJ = new InterfaceC1119800fFK() { // from class: X.0fFS
            };
        }
        return this.LJIIZILJ;
    }

    public final Context LIZJ() {
        if (this.LIZ == null && this.LJJI != null) {
            this.LJJI.getClass();
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            this.LIZ = iHostAppContext != null ? iHostAppContext.context() : null;
        }
        return this.LIZ;
    }

    public final InterfaceC1119870fFR LIZLLL() {
        if (this.LIZLLL == null && this.LJJI != null) {
            this.LJJI.getClass();
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            this.LIZLLL = iHostResource != null ? iHostResource.Qm2() : null;
        }
        return this.LIZLLL;
    }

    public final int LJ() {
        if (this.LJIILLIIL == 0 && this.LJJI != null) {
            this.LJJI.getClass();
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            this.LJIILLIIL = iHostResource != null ? iHostResource.EB1() : 0;
        }
        if (this.LJIILLIIL != 0) {
            return this.LJIILLIIL;
        }
        if (LIZIZ() == null) {
            return R.style.uy;
        }
        C20441214yg.LJ("DesignManager", "Dark theme overlay is not set.");
        return R.style.uy;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0fFT] */
    public final InterfaceC1090500eU4 LJFF() {
        if (this.LJJ == null && this.LJJI != null) {
            this.LJJI.getClass();
            this.LJJ = new InterfaceC1090500eU4() { // from class: X.0fFT
            };
        }
        return this.LJJ;
    }

    public final InterfaceC783390UoD LJI() {
        if (this.LIZJ == null && this.LJJI != null) {
            this.LJJI.getClass();
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            this.LIZJ = iHostResource != null ? iHostResource.x81() : null;
        }
        return this.LIZJ;
    }

    public final int LJII() {
        if (this.LJI == 0 && this.LJJI != null) {
            this.LJJI.getClass();
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            this.LJI = iHostResource != null ? iHostResource.Xa1() : 0;
        }
        return this.LJI;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0fFL] */
    public final C1119810fFL LJIIIIZZ() {
        if (this.LJJI == null) {
            return null;
        }
        this.LJJI.getClass();
        return new Object() { // from class: X.0fFL
        };
    }

    public final int LJIIIZ() {
        if (this.LJIILL == 0 && this.LJJI != null) {
            this.LJJI.getClass();
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            this.LJIILL = iHostResource != null ? iHostResource.bp0() : 0;
        }
        if (this.LJIILL != 0) {
            return this.LJIILL;
        }
        if (LIZIZ() == null) {
            return R.style.v0;
        }
        C20441214yg.LJ("DesignManager", "Light theme overlay is not set.");
        return R.style.v0;
    }

    public final double LJIIJ() {
        if (this.LJFF < 0.0d && this.LJJI != null) {
            this.LJJI.getClass();
            this.LJFF = LiveNotifySlardarSampleRateSetting.getValue();
        }
        return this.LJFF;
    }

    public final InterfaceC1119910fFV LJIILIIL() {
        if (this.LJIJ == null && this.LJJI != null) {
            this.LJJI.getClass();
            this.LJIJ = new C1119860fFQ();
        }
        return this.LJIJ;
    }

    public final boolean LJIJI() {
        if (!this.LJIIL && this.LJJI != null) {
            this.LJJI.getClass();
            this.LJIIJJI = true;
            this.LJIIL = true;
        }
        return this.LJIIJJI;
    }

    public final boolean LJIJJLI() {
        if (!this.LJIILJJIL && this.LJJI != null) {
            this.LJJI.getClass();
            this.LJIILIIL = true;
            this.LJIILJJIL = true;
        }
        return this.LJIILIIL;
    }

    public final boolean LJIL() {
        if (this.LJJI == null) {
            return false;
        }
        this.LJJI.getClass();
        return LiveSheetAnimationParamsOptSetting.INSTANCE.getValue();
    }

    public final boolean LJJ() {
        if (!this.LJIIIIZZ && this.LJJI != null) {
            this.LJJI.getClass();
            this.LJII = !LiveQuizDialogInterceptDegradeSetting.INSTANCE.getValue();
            this.LJIIIIZZ = true;
        }
        return this.LJII;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJI() {
        /*
            r3 = this;
            X.0UOr r0 = r3.LJJI
            r2 = 0
            if (r0 != 0) goto L6
            return r2
        L6:
            X.0UOr r0 = r3.LJJI
            X.0URJ r0 = (X.C0URJ) r0
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L3a
            X.0UOr r0 = r3.LJJI
            r0.getClass()
            com.bytedance.android.livesdk.livesetting.other.OptimizeLiveTextViewHostSetting r0 = com.bytedance.android.livesdk.livesetting.other.OptimizeLiveTextViewHostSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L3a
            r1 = 1
        L1c:
            X.0UOr r0 = r3.LJJI
            X.0URJ r0 = (X.C0URJ) r0
            boolean r0 = r0.LIZ
            if (r0 != 0) goto L38
            X.0UOr r0 = r3.LJJI
            r0.getClass()
            com.bytedance.android.livesdk.livesetting.other.OptimizeLiveTextViewAudienceSetting r0 = com.bytedance.android.livesdk.livesetting.other.OptimizeLiveTextViewAudienceSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L38
            r0 = 1
        L32:
            if (r1 != 0) goto L36
            if (r0 == 0) goto L37
        L36:
            r2 = 1
        L37:
            return r2
        L38:
            r0 = 0
            goto L32
        L3a:
            r1 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1119850fFP.LJJI():boolean");
    }

    public C1119850fFP() {
        TypedValue.applyDimension(1, 20.0f, Resources.getSystem().getDisplayMetrics());
    }

    public final boolean LJJII() {
        IHostConfig iHostConfig;
        return (LJFF() == null || (iHostConfig = (IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)) == null || iHostConfig.i32().LIZJ() <= 1.0f) ? false : true;
    }

    public static void LIZ(View view) {
        if (view instanceof C16F5) {
            ((C16F5) view).setMaxFontScaleRate(1.0f);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            LIZ(viewGroup.getChildAt(i));
        }
    }

    public final int LJIIJJI(float f) {
        return LJIIL(f, 2.1474836E9f);
    }

    public final int LJIILJJIL(Context context) {
        if (LJIJ(context) && LJIJJ(context)) {
            return LJ();
        }
        return LJIIIZ();
    }

    public final boolean LJIIZILJ(Context context) {
        InterfaceC1119870fFR interfaceC1119870fFRLIZLLL;
        if (!LJIJI() || (interfaceC1119870fFRLIZLLL = LIZLLL()) == null || !interfaceC1119870fFRLIZLLL.LIZJ(context)) {
            return false;
        }
        return true;
    }

    public final boolean LJIJ(Context context) {
        InterfaceC1119870fFR interfaceC1119870fFRLIZLLL;
        if (!LJIJI() || (interfaceC1119870fFRLIZLLL = LIZLLL()) == null || !interfaceC1119870fFRLIZLLL.LIZIZ(context)) {
            return false;
        }
        return true;
    }

    public final boolean LJIJJ(Context context) {
        InterfaceC1119870fFR interfaceC1119870fFRLIZLLL;
        if (!LJIJI() || (interfaceC1119870fFRLIZLLL = LIZLLL()) == null || !interfaceC1119870fFRLIZLLL.LIZ(context)) {
            return false;
        }
        return true;
    }

    public static void LJJIFFI(int i, C783400UoE c783400UoE) {
        ((ConcurrentHashMap) C783380UoC.LIZ.LIZ.LIZ).put(Integer.valueOf(i), c783400UoE);
    }

    public final int LJIIL(float f, float f2) {
        IHostConfig iHostConfig;
        float fLIZJ = 1.0f;
        if (LJFF() != null && (iHostConfig = (IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)) != null) {
            fLIZJ = iHostConfig.i32().LIZJ();
        }
        if (fLIZJ <= f2) {
            f2 = fLIZJ;
        }
        return (int) (f2 * f);
    }

    public static Typeface LJIILLIIL(Context context, int i, float f) {
        Resources system;
        if (context != null) {
            system = context.getResources();
        } else {
            system = Resources.getSystem();
        }
        float f2 = f / system.getDisplayMetrics().density;
        float f3 = 17.0f;
        if (f2 >= 17.0f) {
            f3 = 28.0f;
        }
        return C1697580uHE.LIZ(i, f3, 0.0f, Float.valueOf(f2));
    }

    public static Typeface LJIILL(float f, int i, Context context, boolean z) {
        int iIntValue;
        String str = LJJIIJ.get(i);
        if (((HashMap) LJJIIJZLJL).containsKey(str)) {
            iIntValue = ((Integer) ((HashMap) LJJIIJZLJL).get(str)).intValue();
        } else {
            iIntValue = 400;
        }
        return LJIILLIIL(context, iIntValue, f);
    }
}
