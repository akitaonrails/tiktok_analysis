package X;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.AnimFactoryConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0kac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325200kac implements InterfaceC1320130kSR {
    public static final C01GW<Field> LJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(38));
    public static final C01GW<Field> LJFF = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(39));
    public static C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> LJI;
    public final Context LIZ;
    public final C1329330khH LIZIZ;
    public final String LIZJ;
    public final AnimFactoryConfig LIZLLL;

    @Override // X.InterfaceC1320130kSR
    public final boolean LIZIZ(AbstractC1327750kej abstractC1327750kej) {
        this.LIZIZ.getClass();
        return abstractC1327750kej instanceof C1329380khM;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    @Override // X.InterfaceC1320130kSR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable LIZJ(X.AbstractC1327750kej r10) {
        /*
            r9 = this;
            com.bytedance.android.livesdk.livesetting.AnimFactoryConfig r0 = r9.LIZLLL
            boolean r0 = r0.getEnableShareKey()
            r7 = 0
            if (r0 == 0) goto L1c
            java.lang.String r0 = r9.LIZJ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1c
            boolean r0 = r10 instanceof X.C1329380khM
            if (r0 == 0) goto L1c
            if (r10 == 0) goto L1c
            java.lang.String r0 = r9.LIZJ
            r10.setSourceUri(r0)
        L1c:
            X.0khH r0 = r9.LIZIZ
            com.facebook.fresco.animation.drawable.AnimatedDrawable2 r4 = r0.LIZJ(r10)
            com.bytedance.android.livesdk.livesetting.AnimFactoryConfig r0 = r9.LIZLLL
            boolean r0 = r0.getDisableReusingBitmap()
            if (r0 == 0) goto L58
            com.bytedance.android.livesdk.livesetting.AnimFactoryConfig r0 = r9.LIZLLL
            boolean r0 = r0.getEnableMemoryOpt()
            r8 = 1
            if (r0 == 0) goto L4b
            X.0pTE r0 = X.C1BCA.LJIIIIZZ()
            long r5 = r0.LIZIZ
            com.bytedance.android.livesdk.livesetting.LiveFrescoCustomAnimFactorySetting r0 = com.bytedance.android.livesdk.livesetting.LiveFrescoCustomAnimFactorySetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.LiveFrescoCustomAnimFactoryConfig r0 = r0.getValue()
            int r1 = r0.getMemorySize()
            r0 = 1048576(0x100000, float:1.469368E-39)
            int r1 = r1 * r0
            long r1 = (long) r1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L58
        L4b:
            java.lang.String r3 = "LiveCustomCacheDrawableFactory"
            if (r8 == 0) goto L71
            if (r4 == 0) goto L53
            X.0khr r7 = r4.LLILZIL
        L53:
            boolean r0 = r7 instanceof com.facebook.fresco.animation.bitmap.cache.FrescoFrameCache
            if (r0 == 0) goto L71
            goto L5a
        L58:
            r8 = 0
            goto L4b
        L5a:
            X.01GW<java.lang.reflect.Field> r0 = X.C1325200kac.LJ     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L6a
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L71
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L6a
            r1.set(r7, r0)     // Catch: java.lang.Throwable -> L6a
            goto L71
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C20441214yg.LJI(r3, r0)
        L71:
            com.bytedance.android.livesdk.livesetting.AnimFactoryConfig r0 = r9.LIZLLL
            boolean r0 = r0.getEnableSingleCache()
            if (r0 == 0) goto Lb0
            boolean r0 = r10 instanceof X.C1329380khM
            if (r0 == 0) goto Lb0
            X.0khM r10 = (X.C1329380khM) r10
            if (r10 == 0) goto Lb0
            X.0khS r1 = r10.LIZIZ()
            if (r1 == 0) goto Lb0
            X.0khi r0 = r1.LIZ
            if (r0 == 0) goto Lb0
            int r0 = r0.getFrameCount()
            if (r0 <= 0) goto Lb0
            if (r4 == 0) goto Lb0
            if (r1 == 0) goto Lb0
            X.0kaK r2 = r9.LIZLLL(r1)     // Catch: java.lang.Throwable -> La9
            X.01GW<java.lang.reflect.Field> r0 = X.C1325200kac.LJFF     // Catch: java.lang.Throwable -> La9
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> La9
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> La9
            if (r1 == 0) goto Lb0
            X.0khr r0 = r4.LLILZIL     // Catch: java.lang.Throwable -> La9
            r1.set(r0, r2)     // Catch: java.lang.Throwable -> La9
            return r4
        La9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C20441214yg.LJI(r3, r0)
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1325200kac.LIZJ(X.0kej):android.graphics.drawable.Drawable");
    }

    public final C1325020kaK LIZLLL(C1329440khS c1329440khS) {
        int iHashCode;
        int size;
        if (TextUtils.isEmpty(c1329440khS.LJ)) {
            iHashCode = c1329440khS.hashCode();
        } else {
            iHashCode = c1329440khS.LJ.hashCode();
        }
        final C1322470kWD c1322470kWD = new C1322470kWD(iHashCode);
        if (LJI == null) {
            LJI = C1328200kfS.LIZ(new C1329100kgu((ActivityManager) C786410Ut5.H2(this.LIZ, "activity")), C1328220kfU.LIZIZ(), new C1329540khc());
        }
        final C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khF = LJI;
        final AnimFactoryConfig animFactoryConfig = this.LIZLLL;
        C1325020kaK c1325020kaK = new C1325020kaK(c1322470kWD, c1329310khF, animFactoryConfig) { // from class: X.0kaN
            public final AnimFactoryConfig LJ;

            @Override // X.C1325020kaK
            public final void LIZIZ(int i) {
                if (!this.LJ.getEnableClearOpt()) {
                    super.LIZIZ(i);
                }
            }

            {
                this.LJ = animFactoryConfig;
            }
        };
        synchronized (c1329440khS) {
            List<C1323050kX9<Bitmap>> list = c1329440khS.LIZLLL;
            if (list != null) {
                size = ((ArrayList) list).size();
            } else {
                size = 0;
            }
        }
        if (size > 0) {
            int i = 0;
            do {
                if (c1329440khS.LIZJ(i)) {
                    C1323050kX9 c1323050kX9LJIJJLI = null;
                    try {
                        c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(new C1325120kaU(c1329440khS.LIZIZ(i), C1328060kfE.LIZLLL, 0));
                        c1325020kaK.LIZ(c1323050kX9LJIJJLI, i);
                        C1323050kX9.LJII(c1323050kX9LJIJJLI);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1323050kX9.LJII(c1323050kX9LJIJJLI);
                        throw th;
                    }
                }
                i++;
            } while (i < size);
        }
        return c1325020kaK;
    }

    @Override // X.InterfaceC1320130kSR
    public final Drawable LIZ(AbstractC1327750kej abstractC1327750kej, Drawable drawable) {
        return this.LIZIZ.LIZ(abstractC1327750kej, drawable);
    }

    public C1325200kac(Context context, C1329330khH c1329330khH, String str, AnimFactoryConfig animFactoryConfig) {
        this.LIZ = context;
        this.LIZIZ = c1329330khH;
        this.LIZJ = str;
        this.LIZLLL = animFactoryConfig;
    }
}
