package X;

import Y.AComparatorS32S0000000_13;
import android.util.Log;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.watson.assist.utils.FileUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0VAI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VAI {
    public static int LIZ = -1;
    public static String LIZIZ;
    public static List<C0VA6> LIZJ;
    public static List<Integer> LIZLLL;
    public static List<Integer> LJ;

    public static synchronized List<C0VA6> LIZ() {
        List<C0VA6> list = LIZJ;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = new C0VSJ("/sys/devices/system/cpu/cpufreq").listFiles(new FilenameFilter() { // from class: X.0VAM
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return Pattern.matches("policy[0-9]", str);
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            LIZJ = arrayList;
            return arrayList;
        }
        Arrays.sort(fileArrListFiles, new AComparatorS32S0000000_13(8));
        for (File file : fileArrListFiles) {
            C0VA6 c0va6 = new C0VA6(file.getName());
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(file.getAbsolutePath());
            sbLIZ.append("/scaling_available_frequencies");
            try {
                FileUtils.LIZJ(C2188811AlT.LIZIZ(sbLIZ), new C0VAN() { // from class: X.0VAJ
                    @Override // X.C0VAN
                    public final void LIZ(String str) {
                        if (!str.isEmpty()) {
                            for (String str2 : str.split(" ")) {
                                arrayList2.add(Long.valueOf(CastLongProtector.parseLong(str2)));
                            }
                        }
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Log.getStackTraceString(e);
                boolean z = C2040807z4.LIZ;
            }
            try {
                FileUtils.LIZJ(file.getAbsolutePath() + "/affected_cpus", new C0VAN() { // from class: X.0VAK
                    @Override // X.C0VAN
                    public final void LIZ(String str) {
                        if (!str.isEmpty()) {
                            for (String str2 : str.split(" ")) {
                                arrayList3.add(Integer.valueOf(CastIntegerProtector.parseInt(str2)));
                            }
                        }
                    }
                });
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                Log.getStackTraceString(e2);
                boolean z2 = C2040807z4.LIZ;
            }
            c0va6.LIZJ = arrayList2;
            c0va6.LIZIZ = arrayList3;
            arrayList.add(c0va6);
        }
        LIZJ = arrayList;
        return arrayList;
    }

    public static int LIZIZ() {
        if (LIZ == -1) {
            File[] fileArrListFiles = new C0VSJ("/sys/devices/system/cpu").listFiles(new FilenameFilter() { // from class: X.0VAL
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]", str);
                }
            });
            LIZ = fileArrListFiles == null ? 1 : fileArrListFiles.length;
        }
        return LIZ;
    }

    public static String LIZJ() {
        String str = LIZIZ;
        if (str != null) {
            return str;
        }
        Method method = C2040707z3.LIZ;
        String str2 = "";
        if (method != null) {
            try {
                str2 = (String) C2204961BRm.a0(method, null, new Object[]{"ro.board.platform", ""}, new C0WZX("dzBzEgAjS8/YVFkiQFyTZ17d7BzqoAoS7urIfx2mZIzDV8zN5+ga3N+/ywdI6exHPKg=", null));
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (IllegalArgumentException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        LIZIZ = str2;
        return str2;
    }
}
