package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttffmpeg.FFmpegLibLoaderWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08Tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2122208Tc {
    public static volatile EnumC2122308Td LIZ = EnumC2122308Td.NOT_LOAD;
    public static final C08OY LIZIZ = new C08OY();

    public static void LIZIZ() {
        try {
            Class.forName("com.ss.android.ttve.nativePort.TENativeLibsLoader").getDeclaredMethod("loadAllLibs", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (LIZ == EnumC2122308Td.LOADED) {
                return;
            }
            List<String> listLIZ = LIZ();
            ArrayList arrayList = (ArrayList) listLIZ;
            arrayList.size();
            for (int i = 0; i < arrayList.size(); i++) {
                if (!((String) ListProtector.get(listLIZ, i)).contentEquals("c++_shared") && !((String) ListProtector.get(listLIZ, i)).contentEquals("ttboringssl") && !((String) ListProtector.get(listLIZ, i)).contentEquals("ttcrypto")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("lib");
                    sbLIZ.append((String) ListProtector.get(listLIZ, i));
                    sbLIZ.append(".so");
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            LIZ = EnumC2122308Td.LOADING;
            if (C08OY.LIZ(listLIZ)) {
                LIZ = EnumC2122308Td.LOADED;
            } else {
                LIZ = EnumC2122308Td.NOT_LOAD;
            }
        }
    }

    static {
        new ArrayList();
    }

    public static List<String> LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        arrayList.add("iesapplogger");
        arrayList.add("bytevc0");
        arrayList.add("ByteVC1_dec");
        arrayList.add("bvcparser");
        arrayList.add("fdk-aac");
        arrayList.add("sscronet");
        arrayList.addAll(FFmpegLibLoaderWrapper.LIZIZ());
        arrayList.add("yuv");
        arrayList.add("ttheif_dec");
        arrayList.add("bytebench");
        return arrayList;
    }

    public static synchronized void LIZJ() {
        LIZIZ();
    }
}
