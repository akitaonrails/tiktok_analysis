package Y;

import X.C01GW;
import X.C034Y;
import X.C08JS;
import X.C08L6;
import X.C0MAY;
import X.C0VSJ;
import X.C19719612Di;
import X.C1BWL;
import X.C1C7U;
import X.C201955140j;
import X.C20715089p;
import X.C2123008Tk;
import X.C2188811AlT;
import X.C2469009lw;
import X.C570220MYa;
import X.C786410Ut5;
import X.C844470XAv;
import android.content.Context;
import android.widget.Toast;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.AwS88S1000000_3;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS1S1000000_3 implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.List] */
    public final void LIZ$0() {
        ?? arrayList;
        Object objLJ = "unknown";
        C01GW c01gw = C20715089p.LIZ;
        String string = ((Keva) c01gw.getValue()).getString("key_photo_load_fail_event", "");
        if (string == null || string.length() == 0) {
            ((Keva) c01gw.getValue()).storeString("key_photo_load_fail_event", C08JS.LIZLLL(Collections.singletonList(this.s0)));
            return;
        }
        try {
            objLJ = C08JS.LJ(String[].class, string);
            arrayList = objLJ;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            ?? LIZ = C2188811AlT.LIZ();
            LIZ.append("appendMobParam for photomode fail JsonSyntaxException: ");
            String message = e.getMessage();
            ?? r5 = objLJ;
            if (message != null) {
                r5 = message;
            }
            LIZ.append(r5);
            C2188811AlT.LIZIZ(LIZ);
            arrayList = new ArrayList();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            ?? LIZ2 = C2188811AlT.LIZ();
            LIZ2.append("appendMobParam for photomode fail exception: ");
            String message2 = e2.getMessage();
            ?? r52 = objLJ;
            if (message2 != null) {
                r52 = message2;
            }
            LIZ2.append(r52);
            C2188811AlT.LIZIZ(LIZ2);
            arrayList = new ArrayList();
        }
        if (arrayList.contains(this.s0)) {
            return;
        }
        ListProtector.add(arrayList, 0, this.s0);
        int size = arrayList.size();
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("record_photo_load_fail_log_max_count", 5);
        if (size > (iLJ >= 0 ? iLJ : 0)) {
            C19719612Di.LJJIJ(arrayList);
        }
        ((Keva) C20715089p.LIZ.getValue()).storeString("key_photo_load_fail_event", C08JS.LIZLLL(arrayList));
    }

    public final void LIZ$1() {
        try {
            C0VSJ c0vsjLJIIJ = C570220MYa.LJIIJ(this.s0, false);
            if (c0vsjLJIIJ.exists()) {
                C0VSJ c0vsjLJIIJ2 = C570220MYa.LJIIJ(this.s0, true);
                File parentFile = c0vsjLJIIJ2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                c0vsjLJIIJ.renameTo(c0vsjLJIIJ2);
                C0MAY c0may = C0MAY.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Archived log: ");
                sbLIZ.append(this.s0);
                C201955140j.LIZLLL(c0may, "DraftLogService", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0MAY c0may2 = C0MAY.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Archive log failed: ");
            sbLIZ2.append(this.s0);
            C201955140j.LJIIIZ(c0may2, "DraftLogService", C2188811AlT.LIZIZ(sbLIZ2), e);
        }
    }

    public static final void run$0(ARunnableS1S1000000_3 aRunnableS1S1000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoModeFeedbackLog@42dd.updateEventRepo$1");
        try {
            aRunnableS1S1000000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoModeFeedbackLog@42dd.updateEventRepo$1");
    }

    public static final void run$1(ARunnableS1S1000000_3 aRunnableS1S1000000_3) {
        String str = aRunnableS1S1000000_3.s0;
        C1C7U.LIZ("StartRecordFeedParam@26e5.setVideoId$1L");
        KevaImpl.getRepo("start_record_feed_param", 1).storeString("video_id", str);
        C1C7U.LIZIZ("StartRecordFeedParam@26e5.setVideoId$1L");
    }

    public static final void run$2(ARunnableS1S1000000_3 aRunnableS1S1000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("LowMemoryAppKillSelf@69e0.killProcess$2");
        try {
            if (!C2469009lw.LIZIZ(C1BWL.LIZ())) {
                C2469009lw.LIZ(C1BWL.LIZ(), aRunnableS1S1000000_3.s0);
            }
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("LowMemoryAppKillSelf@69e0.killProcess$2");
    }

    public static final void run$3(ARunnableS1S1000000_3 aRunnableS1S1000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcTraceManager@5565.end$1");
        try {
            C08L6 c08l6 = C08L6.LIZ;
            String str = aRunnableS1S1000000_3.s0;
            c08l6.getClass();
            C08L6.LIZIZ(str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcTraceManager@5565.end$1");
    }

    public static final void run$4(ARunnableS1S1000000_3 aRunnableS1S1000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcLynxMultiPrefetchDataStore@421d.remove$1");
        try {
            new AwS88S1000000_3(aRunnableS1S1000000_3.s0, 17);
            C034Y.LIZ();
            C2123008Tk.LIZ.remove(aRunnableS1S1000000_3.s0);
            C2123008Tk.LIZIZ.put(aRunnableS1S1000000_3.s0, Long.valueOf(System.currentTimeMillis()));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcLynxMultiPrefetchDataStore@421d.remove$1");
    }

    public static final void run$5(ARunnableS1S1000000_3 aRunnableS1S1000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("UserConsentGatekeeperTask@3dbb.show$1$1$onSuccess$1");
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("statusString ");
            sbLIZ.append(aRunnableS1S1000000_3.s0);
            C786410Ut5.re(Toast.makeText(contextLIZ, C2188811AlT.LIZIZ(sbLIZ), 1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UserConsentGatekeeperTask@3dbb.show$1$1$onSuccess$1");
    }

    public static final void run$6(ARunnableS1S1000000_3 aRunnableS1S1000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("DraftLogService@b8d8.archiveLog$1");
        try {
            aRunnableS1S1000000_3.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftLogService@b8d8.archiveLog$1");
    }

    public ARunnableS1S1000000_3(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.s0 = str;
                break;
            case 1:
            default:
                this.s0 = str;
                break;
        }
    }
}
