package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.ugc.effectplatform.util.CppEffectUtilKt;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19997613Mg {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(6));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(0));

    public static final boolean LIZ(String str) {
        Long lLJIILIIL;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C13SS.LIZ.getClass();
            C13SS.LIZIZ("EffectUtils", "checkEffectChildrenFileBlocking called on MAIN thread. This blocks IO and should be migrated.", null);
        }
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            boolean z = false;
            try {
                String canonicalPath = new C0VSJ(str).getCanonicalPath();
                Set<String> set = C08RK.LIZ;
                boolean z2 = true;
                if (!set.contains(canonicalPath)) {
                    C0VSJ c0vsj = new C0VSJ(str);
                    if (c0vsj.isDirectory()) {
                        C0VSJ c0vsj2 = new C0VSJ(c0vsj, "effect_dir.ok");
                        if (c0vsj2.exists()) {
                            List listLJJLIIIJ = a0.LJJLIIIJ(C09BH.LJI(c0vsj2, Charsets.UTF_8), new char[]{' '}, false, 0, 6);
                            if (listLJJLIIIJ.size() == 3 && Intrinsics.LJFF(listLJJLIIIJ.get(0), "v1") && (lLJIILIIL = C2095008Iq.LJIILIIL((String) listLJJLIIIJ.get(1))) != null) {
                                long jLongValue = lLJIILIIL.longValue();
                                Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) listLJJLIIIJ.get(2));
                                if (numLJIIJJI != null) {
                                    int iIntValue = numLJIIJJI.intValue();
                                    long jLastModified = c0vsj.lastModified();
                                    File[] fileArrListFiles = c0vsj.listFiles();
                                    if (fileArrListFiles != null) {
                                        int length = fileArrListFiles.length;
                                        if (jLongValue == jLastModified && iIntValue == length) {
                                            set.add(canonicalPath);
                                        } else {
                                            z2 = false;
                                        }
                                        z = z2;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    z = z2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if (boolValueOf.booleanValue()) {
                return boolValueOf.booleanValue();
            }
            boolean zLIZIZ = LIZIZ(str);
            if (!zLIZIZ) {
                return zLIZIZ;
            }
            C08RK.LIZ(str);
            return zLIZIZ;
        }
        return LIZIZ(str);
    }

    public static final boolean LIZIZ(String str) {
        if (C19997713Mh.LIZ && ((ConcurrentHashSet) LIZ.getValue()).contains(str)) {
            C13SS.LIZ.getClass();
            C13SS.LIZ("CKResource", "checkEffectChildrenFile: hit cache, return true directly");
            return true;
        }
        int i = C1700150uLN.LIZ;
        boolean zNativeCheckEffectChildrenFile = CppEffectUtilKt.nativeCheckEffectChildrenFile(str);
        if (C19997713Mh.LIZ && zNativeCheckEffectChildrenFile) {
            ((ConcurrentHashSet) LIZ.getValue()).add(str);
        }
        return zNativeCheckEffectChildrenFile;
    }
}
