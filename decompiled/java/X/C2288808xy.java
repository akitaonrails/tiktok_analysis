package X;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2288808xy {
    public static volatile Pair<? extends UploadImageConfig, String> LIZIZ;
    public static volatile C2207811Bb1 LIZJ;
    public static volatile C2290008yA LIZLLL;
    public static volatile String LJ;
    public static volatile String LJFF;
    public static volatile long LJI;
    public static volatile long LJII;
    public static AnonymousClass0956 LJIIJ;
    public static WeakReference<InterfaceC2273608vW> LJIIJJI;
    public static final C2288808xy LIZ = new C2288808xy();
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public static final C054G LJIIIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(C23118094a.LIZ()));

    public static void LJ() {
        LJFF = null;
        C2207811Bb1 c2207811Bb1 = LIZJ;
        if (c2207811Bb1 != null) {
            c2207811Bb1.LIZJ();
        }
        LIZJ = null;
        LJ = null;
        LIZLLL = null;
        LJIIIIZZ.set(false);
        C201955140j.LJIILIIL("AIMusicConfigHelper", "resetPreload");
        C201955140j.LJIILIIL("AIMusicConfigHelper", "reset");
    }

    public static boolean LIZ() {
        long jCurrentTimeMillis = (System.currentTimeMillis() - LJI) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkAuthKeyCacheValid delt:");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", goal:");
        sbLIZ.append(C2290608yG.LIZ());
        C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ));
        return LJI > 0 && jCurrentTimeMillis < ((long) C2290608yG.LIZ());
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ame-extract-frames-");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".zip");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LJFF);
        sbLIZ2.append(File.separator);
        sbLIZ2.append(strLIZIZ);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
        File parentFile = c0vsj.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("resetAuthKey createUploadFile:");
        sbLIZ3.append(c0vsj.getAbsolutePath());
        C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ3));
        return c0vsj.getAbsolutePath();
    }

    public static void LIZJ() {
        Pair<? extends UploadImageConfig, String> pair;
        UploadImageConfig first;
        C2207811Bb1 c2207811Bb1;
        if (!C2290708yH.LIZ() || (pair = LIZIZ) == null || (first = pair.getFirst()) == null) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = LJIIIIZZ;
            if (atomicBoolean.get()) {
                return;
            }
            synchronized (LIZ) {
                try {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    LJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    C1458410o3T.LIZ.getClass();
                    sbLIZ.append(C570490MZb.LIZJ((String) C1458410o3T.LIZJ.getValue()));
                    sbLIZ.append(SystemClock.elapsedRealtime());
                    C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                    if (!c0vsj.exists()) {
                        c0vsj.mkdir();
                    }
                    LJFF = c0vsj.getAbsolutePath();
                    LJ = LIZIZ();
                    LIZJ = new C2207811Bb1(first);
                    C2207811Bb1 c2207811Bb12 = LIZJ;
                    if (c2207811Bb12 != null) {
                        c2207811Bb12.LIZJ.setPreheatUploader(1);
                    }
                    String str = LJ;
                    if (str != null) {
                        LIZLLL = new C2290008yA(Uri.parse(str));
                    }
                    C2207811Bb1 c2207811Bb13 = LIZJ;
                    if (c2207811Bb13 != null) {
                        c2207811Bb13.LIZJ.setMediaDataReader(LIZLLL, 1);
                    }
                    if (((Boolean) C2290908yJ.LIZ.getValue()).booleanValue() && (c2207811Bb1 = LIZJ) != null) {
                        c2207811Bb1.LIZJ.enableStartLockOpt();
                    }
                    C2207811Bb1 c2207811Bb14 = LIZJ;
                    if (c2207811Bb14 != null) {
                        c2207811Bb14.LJIILIIL();
                    }
                    C201955140j.LJIILIIL("AIMusicConfigHelper", "initUploader uploader start");
                    atomicBoolean.set(true);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (C564610MCl th) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Pair<? extends com.ss.android.ugc.aweme.publish.model.UploadImageConfig, java.lang.String>> r9) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2288808xy.LIZLLL(X.05Vn):java.lang.Object");
    }
}
