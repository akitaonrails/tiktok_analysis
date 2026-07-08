package X;

import Y.ACallableS182S0300000_24;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.services.IInitialChooseLanguageManager;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0ru6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606360ru6 implements IInitialChooseLanguageManager {
    public boolean LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public SoftReference<Context> LIZLLL;
    public WeakReference<Context> LJ;
    public boolean LJFF;
    public DialogC19268110Zr LJI;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1606360ru6() {
        /*
            r7 = this;
            r7.<init>()
            X.0XAv r6 = X.C844470XAv.LIZ
            r6.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r1 = X.C786410Ut5.t2(r0)
            java.lang.String r0 = "en"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r3 = 1
            r0 = r0 ^ 1
            r5 = r0 ^ 1
            r4 = 0
            if (r5 == 0) goto L49
            java.lang.String r0 = "MY"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = r0[r4]
            java.lang.String r0 = X.C2222691Bz1.LIZIZ()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L7d
            r7.LIZJ = r1
            X.10R5 r0 = X.C10R5.LJIIIIZZ
            X.10R5 r0 = X.C10RS.LIZ()
            int r0 = r0.LIZJ()
            if (r0 != r3) goto L49
            r5 = 0
        L49:
            r2 = 2
            if (r5 != 0) goto L52
            X.C1489210or9.LIZ(r2)
        L4f:
            r7.LIZ = r4
            return
        L52:
            r6.getClass()
            android.content.Context r1 = X.C844470XAv.LIZ()
            java.lang.String r0 = "InitialChooseLanguagePreferences"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.KevaImpl.getRepoFromSp(r1, r0, r4)
            java.lang.String r0 = "languageDialogShowState"
            int r0 = r1.getInt(r0, r4)
            if (r0 == 0) goto L6c
            if (r0 == r3) goto L6a
        L69:
            r3 = 0
        L6a:
            r4 = r3
            goto L4f
        L6c:
            java.lang.Boolean r0 = X.C1514430pVp.LIZLLL()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L77
            r2 = 1
        L77:
            X.C1489210or9.LIZ(r2)
            if (r2 != r3) goto L69
            goto L6a
        L7d:
            r5 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1606360ru6.<init>():void");
    }

    public final void LIZ(C19EG c19eg) {
        this.LIZIZ = true;
        if (((Boolean) C0B5T.LIZ.getValue()).booleanValue()) {
            WeakReference<Context> weakReference = this.LJ;
            if (weakReference == null || weakReference.get() == null) {
                this.LJ = new WeakReference<>(c19eg);
            }
        } else {
            SoftReference<Context> softReference = this.LIZLLL;
            if (softReference == null || softReference.get() == null) {
                this.LIZLLL = new SoftReference<>(c19eg);
            }
        }
        LIZIZ(c19eg);
    }

    public final void LIZIZ(Context context) {
        String[] strArr;
        ComponentCallbacks2 componentCallbacks2LIZ;
        if (!this.LJFF) {
            return;
        }
        if (context == null) {
            if (((Boolean) C0B5T.LIZ.getValue()).booleanValue()) {
                WeakReference<Context> weakReference = this.LJ;
                if (weakReference != null) {
                    context = weakReference.get();
                } else {
                    return;
                }
            } else {
                SoftReference<Context> softReference = this.LIZLLL;
                if (softReference == null) {
                    return;
                } else {
                    context = softReference.get();
                }
            }
            if (context == null) {
                return;
            }
        }
        if (C1030680cva.LJIIL) {
            return;
        }
        if (TextUtils.equals(this.LIZJ, "MY")) {
            strArr = new String[]{"ms-MY", "zh-Hant-TW", "en"};
        } else {
            strArr = null;
        }
        if (this.LIZ && (componentCallbacks2LIZ = C1388190mED.LIZ(context)) != null && (componentCallbacks2LIZ instanceof InterfaceC1603190roz)) {
            C128Y curFragment = ((InterfaceC1603190roz) componentCallbacks2LIZ).getCurFragment();
            if (curFragment instanceof InterfaceC1593630rZZ) {
                ComponentCallbacks componentCallbacksUx = ((InterfaceC1593630rZZ) curFragment).ux();
                if ((componentCallbacksUx instanceof InterfaceC1591870rWj) && ((InterfaceC1591870rWj) componentCallbacksUx).wm().equals("FeedRecommendFragment") && this.LIZIZ && strArr != null) {
                    C15O7.LIZIZ(new ACallableS182S0300000_24(this, context, strArr, 0), C15O7.LJIIIIZZ, null);
                }
            }
        }
    }
}
