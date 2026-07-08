package X;

import Y.AComparatorS32S0000000_13;
import Y.ARunnableS0S1201000_4;
import Y.ARunnableS0S3101200_13;
import Y.ARunnableS10S1100000_4;
import Y.ARunnableS10S1200000_4;
import Y.ARunnableS13S0400000_4;
import Y.ARunnableS1S1101000_4;
import Y.ARunnableS1S2200200_13;
import Y.ARunnableS5S1300000_4;
import Y.ARunnableS73S0200000_4;
import android.text.TextUtils;
import com.bytedance.apm.config.SlardarConfigManagerImpl;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793770VBv {
    public static boolean LIZ = false;
    public static C0VSJ LIZIZ = null;
    public static long LIZJ = -1;
    public static boolean LIZLLL;
    public static MappedByteBuffer LJ;
    public static final AtomicLong LJFF = new AtomicLong(0);

    public static void LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C792400V6o.LJI());
            sbLIZ.append("_");
            sbLIZ.append(LJFF.getAndAdd(1L));
            jSONObject2.put("_debug_uuid", C2188811AlT.LIZIZ(sbLIZ));
            jSONObject.put("_debug_self", jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LIZJ(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        ApmDelegate apmDelegate = C788700Uwm.LIZ;
        if (apmDelegate.LLIZ && (slardarConfigManagerImpl = apmDelegate.LLILZLL) != null) {
            return slardarConfigManagerImpl.getServiceSwitch(str);
        }
        return false;
    }

    public static void LJI(C305780Byi c305780Byi) {
        C807330Vlj.LIZIZ.LIZIZ(c305780Byi.LJ, c305780Byi.LIZ, false);
        if (C0V6Y.LJFF(Boolean.TRUE, c305780Byi.LIZ, c305780Byi.LJ)) {
            LJIIL(c305780Byi.LIZ, null);
            return;
        }
        JSONObject jSONObject = c305780Byi.LJ;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.isNull("timestamp")) {
            try {
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LIZIZ(jSONObject);
        C787900UvU.LIZ.LIZJ(new ARunnableS73S0200000_4(c305780Byi, jSONObject, 51));
        if (!C792400V6o.LIZJ) {
            return;
        }
        C0VD9.LIZ().LIZIZ(new ARunnableS13S0400000_4(c305780Byi, LJIILIIL(c305780Byi.LIZJ, true), LJIILIIL(c305780Byi.LIZLLL, true), LJIILIIL(jSONObject, true), 7));
    }

    public static JSONObject LJIILJJIL(JSONObject jSONObject) {
        if (LIZ) {
            return C0V3O.LJI(jSONObject);
        }
        if (LIZLLL) {
            return LJIILL(jSONObject);
        }
        return LJIILLIIL(jSONObject);
    }

    public static JSONObject LJIILL(JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                if (itKeys != null) {
                    jSONObject2 = new JSONObject();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject2.isNull("timestamp")) {
            jSONObject2.put("timestamp", System.currentTimeMillis());
        }
        return jSONObject2;
    }

    public static JSONObject LJIILLIIL(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        }
        if (jSONObject.isNull("timestamp")) {
            jSONObject.put("timestamp", System.currentTimeMillis());
        }
        return jSONObject;
    }

    public static void LJ(final String str, JSONObject jSONObject) {
        final JSONObject jSONObjectLJIILLIIL;
        C829760Wgo.LIZ(str, null, null, null, jSONObject);
        C807330Vlj.LIZIZ.LIZIZ(jSONObject, str, true);
        if (C0V6Y.LJFF(Boolean.FALSE, str, jSONObject)) {
            LJIIL(str, jSONObject);
            return;
        }
        if (LIZLLL) {
            jSONObjectLJIILLIIL = LJIILL(jSONObject);
        } else {
            jSONObjectLJIILLIIL = LJIILLIIL(jSONObject);
        }
        LIZIZ(jSONObjectLJIILLIIL);
        C787900UvU.LIZ.LIZJ(new Runnable() { // from class: X.0V6W
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ApmAgent@713b.monitorCommonLog$1");
                try {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObjectLJIILLIIL;
                    boolean z = C0V6Y.LIZ;
                    boolean zLJI = MethodIDManager.LJI(137663);
                    if (TextUtils.isEmpty(str2)) {
                        if (C792190V5t.LIZ()) {
                            C792910V8n.LIZ("APM-CommonEvent", "logType must be not empty");
                        }
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                    } else {
                        C0V6Y.LIZIZ(new C0V6V(str2, jSONObject2));
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ApmAgent@713b.monitorCommonLog$1");
            }
        });
        if (!C792400V6o.LIZJ) {
            return;
        }
        C0VD9.LIZ().LIZIZ(new ARunnableS10S1100000_4(LJIILIIL(jSONObjectLJIILLIIL, true), str, 7));
    }

    public static void LJIIL(String str, JSONObject jSONObject) {
        if (C792400V6o.LJIIIIZZ()) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C793430VAn.LIZ(jSONObject, str, false);
        }
    }

    public static JSONObject LJIILIIL(JSONObject jSONObject, boolean z) {
        if (!LIZ && LIZLLL) {
            return C0V3O.LIZIZ(jSONObject);
        }
        if (!z) {
            return jSONObject;
        }
        return C0V3O.LJI(jSONObject);
    }

    public static void LJIIZILJ(String str, String str2) {
        long j;
        long j2;
        try {
            synchronized (C793770VBv.class) {
                try {
                    String strLIZIZ = C792400V6o.LIZIZ();
                    long id = C786410Ut5.u3().getId();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String str3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(str);
                    stringBuffer.append("#");
                    stringBuffer.append(id);
                    stringBuffer.append("#");
                    stringBuffer.append(jCurrentTimeMillis);
                    stringBuffer.append("#");
                    stringBuffer.append(str3);
                    stringBuffer.append("\n");
                    stringBuffer.append(str2);
                    stringBuffer.append("\n");
                    byte[] bytes = stringBuffer.toString().getBytes("UTF-8");
                    String absolutePath = C786410Ut5.y2(C792400V6o.LIZ, null).getAbsolutePath();
                    if (LJ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(absolutePath);
                        sbLIZ.append("/logs");
                        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(absolutePath);
                        sbLIZ2.append("/logs/proc: ");
                        sbLIZ2.append(strLIZIZ);
                        LIZIZ = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(absolutePath);
                        sbLIZ3.append("/logs/proc: ");
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append("/");
                        sbLIZ3.append(str3);
                        C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3));
                        if (!c0vsj.exists()) {
                            c0vsj.mkdirs();
                        }
                        if (!LIZIZ.exists()) {
                            LIZIZ.mkdirs();
                        }
                        c0vsj2.createNewFile();
                        FileChannel channel = new RandomAccessFile(c0vsj2, "rw").getChannel();
                        FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                        if (C792400V6o.LJIIIZ()) {
                            j2 = 2097152;
                        } else {
                            j2 = 262144;
                        }
                        LJ = channel.map(mapMode, 0L, j2);
                    }
                    if (LJ.remaining() < bytes.length) {
                        LJ.force();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(absolutePath);
                        sbLIZ4.append("/logs/proc: ");
                        sbLIZ4.append(strLIZIZ);
                        sbLIZ4.append("/");
                        sbLIZ4.append(str3);
                        FileChannel channel2 = new RandomAccessFile(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4)), "rw").getChannel();
                        FileChannel.MapMode mapMode2 = FileChannel.MapMode.READ_WRITE;
                        if (C792400V6o.LJIIIZ()) {
                            j = 2097152;
                        } else {
                            j = 262144;
                        }
                        LJ = channel2.map(mapMode2, 0L, j);
                    }
                    LJ.put(bytes);
                    if (LIZJ == -1 || System.currentTimeMillis() - LIZJ > 3600000) {
                        if ((C08SC.LIZLLL(LIZIZ) > 1073741824 || C08SC.LIZJ(C792400V6o.LIZ).getFreeSpace() < 1073741824) && C792400V6o.LJIIIZ() && LIZIZ.exists()) {
                            File[] fileArrListFiles = LIZIZ.listFiles();
                            Arrays.sort(fileArrListFiles, new AComparatorS32S0000000_13(39));
                            int length = 60;
                            if (fileArrListFiles.length <= 60) {
                                length = fileArrListFiles.length;
                            }
                            for (int i = 0; i < length; i++) {
                                fileArrListFiles[i].delete();
                            }
                        }
                        LIZJ = System.currentTimeMillis();
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
        }
    }

    public static void LJFF(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        Iterator<String> itKeys;
        C807330Vlj.LIZIZ.LIZIZ(jSONObject2, str, false);
        if (C0V6Y.LJFF(Boolean.TRUE, str, jSONObject2)) {
            LJIIL(str, jSONObject);
            return;
        }
        JSONObject jSONObjectLJIILLIIL = LJIILLIIL(jSONObject2);
        LIZIZ(jSONObjectLJIILLIIL);
        if (LIZLLL) {
            if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
                try {
                    jSONObject3 = new JSONObject();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject3.put(next, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject3 = jSONObject;
                }
            } else {
                jSONObject3 = null;
            }
        } else {
            jSONObject3 = jSONObject;
        }
        C0V6Y.LIZJ(new C0V6X(str, 0, jSONObject3, null, null, jSONObjectLJIILLIIL));
        if (!C792400V6o.LIZJ) {
            return;
        }
        C0VD9.LIZ().LIZIZ(new ARunnableS10S1200000_4(LJIILIIL(jSONObject, true), LJIILIIL(jSONObjectLJIILLIIL, true), str, 3));
    }

    public static void LJIIJJI(String str, int i, JSONObject jSONObject) {
        JSONObject jSONObjectLJIILLIIL;
        C807330Vlj.LIZIZ.LIZIZ(jSONObject, str, false);
        if (C0V6Y.LJFF(Boolean.TRUE, str, jSONObject)) {
            LJIIL(str, jSONObject);
            return;
        }
        if (LIZLLL) {
            jSONObjectLJIILLIIL = LJIILL(jSONObject);
        } else {
            jSONObjectLJIILLIIL = LJIILLIIL(jSONObject);
        }
        LIZIZ(jSONObjectLJIILLIIL);
        C0V6Y.LIZLLL(str, i, null, null, jSONObjectLJIILLIIL);
        if (!C792400V6o.LIZJ) {
            return;
        }
        C0VD9.LIZ().LIZIZ(new ARunnableS1S1101000_4(i, str, LJIILIIL(jSONObjectLJIILLIIL, true), 2));
    }

    public static void LJII(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObjectLJIILLIIL;
        C829760Wgo.LIZ(str, jSONObject, jSONObject2, jSONObject3, null);
        C807330Vlj.LIZIZ.LIZIZ(jSONObject3, str, false);
        if (C0V6Y.LJFF(Boolean.TRUE, str, jSONObject3)) {
            LJIIL(str, jSONObject);
            return;
        }
        if (LIZLLL) {
            jSONObjectLJIILLIIL = LJIILL(jSONObject3);
        } else {
            jSONObjectLJIILLIIL = LJIILLIIL(jSONObject3);
        }
        LIZIZ(jSONObjectLJIILLIIL);
        C0V6Y.LIZLLL(str, 0, LJIILIIL(jSONObject, true), LJIILIIL(jSONObject2, true), jSONObjectLJIILLIIL);
        if (!C792400V6o.LIZJ) {
            return;
        }
        C0VD9.LIZ().LIZIZ(new ARunnableS5S1300000_4(LJIILIIL(jSONObject, true), LJIILIIL(jSONObject2, true), str, LJIILIIL(jSONObjectLJIILLIIL, true), 7));
    }

    public static void LJIIIZ(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C807330Vlj.LIZIZ.LIZIZ(jSONObject2, str, false);
        if (C0V6Y.LJFF(Boolean.TRUE, str, jSONObject2)) {
            LJIIL(str, jSONObject);
            return;
        }
        JSONObject jSONObjectLJIILJJIL = LJIILJJIL(jSONObject2);
        LIZIZ(jSONObjectLJIILJJIL);
        C0V6Y.LIZJ(new C0V6X(str, i, LJIILIIL(jSONObject, true), null, null, LJIILIIL(jSONObjectLJIILJJIL, false)));
        if (!C792400V6o.LIZJ) {
            return;
        }
        C0VD9.LIZ().LIZIZ(new ARunnableS0S1201000_4(LJIILIIL(jSONObject, true), i, str, LJIILIIL(jSONObject2, true), 4));
    }

    public static void LJIJ(long j, String str, String str2, String str3) {
        C0V8S.LIZ.LJFF(j, str, str2, str3, null, null);
    }

    public static void LJIIJ(final String str, final int i, final JSONObject jSONObject, final JSONObject jSONObject2, JSONObject jSONObject3) {
        C807330Vlj.LIZIZ.LIZIZ(jSONObject3, str, false);
        if (C0V6Y.LJFF(Boolean.TRUE, str, jSONObject3)) {
            LJIIL(str, jSONObject);
            return;
        }
        final JSONObject jSONObjectLJIILJJIL = LJIILJJIL(jSONObject3);
        LIZIZ(jSONObjectLJIILJJIL);
        C787900UvU.LIZ.LIZJ(new Runnable() { // from class: X.0V6k
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ApmAgent@713b.monitorStatusAndEvent$1");
                try {
                    C0V6Y.LIZLLL(str, i, C793770VBv.LJIILIIL(jSONObject, true), C793770VBv.LJIILIIL(jSONObject2, true), C793770VBv.LJIILIIL(jSONObjectLJIILJJIL, false));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ApmAgent@713b.monitorStatusAndEvent$1");
            }
        });
        if (!C792400V6o.LIZJ) {
            return;
        }
        final JSONObject jSONObjectLJIILIIL = LJIILIIL(jSONObject, true);
        final JSONObject jSONObjectLJIILIIL2 = LJIILIIL(jSONObject2, true);
        final JSONObject jSONObjectLJIILIIL3 = LJIILIIL(jSONObjectLJIILJJIL, true);
        C0VD9.LIZ().LIZIZ(new Runnable() { // from class: X.0C43
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ApmAgent@713b.monitorStatusAndEvent$2");
                try {
                    JSONObject jSONObjectLIZ = new C790600Uzq(str, i, null, jSONObjectLJIILIIL, jSONObjectLJIILIIL2, jSONObjectLJIILIIL3).LIZ();
                    if (jSONObjectLIZ != null) {
                        C793770VBv.LJIIZILJ("monitorStatusAndEvent", C786410Ut5.J3(jSONObjectLIZ));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ApmAgent@713b.monitorStatusAndEvent$2");
            }
        });
    }

    public static void LIZ(String str, long j, long j2, String str2, InterfaceC794220VDo interfaceC794220VDo, InterfaceC794020VCu interfaceC794020VCu) {
        ApmDelegate apmDelegate = C788700Uwm.LIZ;
        if (apmDelegate.LLJILLL) {
            C787900UvU.LIZ.LJII(new ARunnableS1S2200200_13(interfaceC794020VCu, str, interfaceC794220VDo, str2, j, j2, 0));
        } else if (interfaceC794020VCu != null) {
            interfaceC794020VCu.LIZ(C2404309bV.LIZ(false, 9, null, null), false);
        }
        if (apmDelegate.LLJJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("alog_scene: ");
            sbLIZ.append(str2);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZLLL(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        if (C0VC7.LIZ) {
            ((LinkedBlockingDeque) C0VC7.LIZLLL).add(new C0VCQ(j, j2, str, str2, str3, i, jSONObject, null, null));
        } else {
            JSONObject jSONObjectLJIILJJIL = LJIILJJIL(jSONObject);
            C787900UvU.LIZ.LIZJ(new ARunnableS0S3101200_13(j, j2, str, str2, str3, i, jSONObjectLJIILJJIL, 1));
            if (!C792400V6o.LIZJ) {
                return;
            }
            C0VD9.LIZ().LIZIZ(new ARunnableS0S3101200_13(j, j2, str, str2, str3, i, jSONObjectLJIILJJIL, 2));
        }
    }

    public static void LJIIIIZZ(final long j, final long j2, final String str, final String str2, final String str3, final int i, JSONObject jSONObject) {
        if (C0VC7.LIZ) {
            ((LinkedBlockingDeque) C0VC7.LIZIZ).add(new C0VCQ(j, j2, str, str2, str3, i, jSONObject, null, null));
        } else {
            final JSONObject jSONObjectLJIILJJIL = LJIILJJIL(jSONObject);
            C787900UvU.LIZ.LIZJ(new Runnable() { // from class: X.0Uvb
                public final void LIZ() {
                    C791870V4n.LIZ(str);
                    C787960Uva.LIZ.LIZJ(new C790240UzG("api_all", j, j2, str, str2, str3, i, C793770VBv.LJIILIIL(jSONObjectLJIILJJIL, false)));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ApmAgent@713b.monitorSLA$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ApmAgent@713b.monitorSLA$1");
                }
            });
            if (!C792400V6o.LIZJ) {
                return;
            }
            C0VD9.LIZ().LIZIZ(new ARunnableS0S3101200_13(j, j2, str, str2, str3, i, jSONObjectLJIILJJIL, 0));
        }
    }
}
