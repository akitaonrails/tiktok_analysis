package X;

import android.app.Activity;
import android.os.Build;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SLF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SLF {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static boolean LJFF;
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(444));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(443));

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:14:0x001e, B:16:0x0022, B:12:0x0018, B:18:0x0028, B:20:0x002c), top: B:25:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ() {
        /*
            java.lang.String r1 = X.C0SLF.LIZLLL
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L16
            java.lang.String r0 = "HOME"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L16
            r1 = 0
        Lf:
            java.lang.String r0 = X.C0SLF.LJ
            if (r1 == 0) goto L28
            if (r0 == 0) goto L1e
            goto L18
        L16:
            r1 = 1
            goto Lf
        L18:
            boolean r0 = LIZLLL(r0)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L28
        L1e:
            boolean r0 = X.C0SLF.LIZIZ     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L28
            X.C08H2.LIZLLL()     // Catch: java.lang.Throwable -> L32
            X.C0SLF.LIZIZ = r2     // Catch: java.lang.Throwable -> L32
            return
        L28:
            boolean r0 = X.C0SLF.LIZIZ     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L3b
            X.C08H2.LIZJ()     // Catch: java.lang.Throwable -> L32
            X.C0SLF.LIZIZ = r3     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "PhotoKita run error"
            X.C1AF0.LJFF(r1, r0)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SLF.LIZJ():void");
    }

    public static boolean LIZLLL(String str) {
        List<String> list;
        if (Build.VERSION.SDK_INT >= 34 || !C0SLG.LIZ().enable || C20737116Cr.LIZ() >= C0SLG.LIZ().lowEndScore || (list = C0SLG.LIZ().scene) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static void LIZ(Aweme aweme, String str) {
        int i;
        if (str == null || C20737116Cr.LIZJ() || !LIZLLL(str)) {
            return;
        }
        if (aweme != null) {
            try {
                if (!AwemeExtKt.isPhotoMode(aweme) || AwemeExtKt.isAdTraffic(aweme)) {
                    if (LIZ && LIZIZ) {
                        C08H2.LIZJ();
                        LIZIZ = false;
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "PhotoKita run error");
                return;
            }
        }
        LJFF = false;
        if (!LIZ) {
            Activity activityLIZ = C2421209eE.LIZ();
            if (activityLIZ == null) {
                return;
            }
            if (C20737116Cr.LIZ() < C0SLG.LIZ().superLowEndScore) {
                i = C0SLG.LIZ().superLowEndPer;
            } else {
                i = C0SLG.LIZ().lowEndPer;
            }
            C08H2.LIZ(i, activityLIZ, C0SLG.LIZ().enableGesture, false);
            C2090408Gw.LIZ(i);
            LIZ = true;
            LIZIZ = true;
            C08H2.LIZLLL = (ArrayList) SettingsManager.LIZLLL().LJIIIIZZ("kita_disable_activity_name", ArrayList.class, C0SLQ.LIZ);
            DoFrameController.LIZ(new C08IV() { // from class: X.08IW
                @Override // X.C08IV
                public final void LIZ() {
                    C2090208Gu.LIZ();
                }
            });
            return;
        }
        if (!LIZIZ) {
            C08H2.LIZLLL();
            LIZIZ = true;
        }
    }

    public static void LIZIZ(String str, boolean z) {
        if (str != null && LIZ && !C0SLG.LIZ().enableGesture && C0SLG.LIZ().disableOnEnter && LIZLLL(str)) {
            try {
                if (z) {
                    if (LIZIZ) {
                        C08H2.LIZJ();
                        LIZIZ = false;
                        return;
                    }
                    return;
                }
                if (!LIZIZ) {
                    C08H2.LIZLLL();
                    LIZIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "PhotoKita run error");
            }
        }
    }
}
