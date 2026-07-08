package X;

import android.content.Context;
import android.os.StatFs;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.SearchDynamicImageDiskCacheExperiment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0VSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798220VSy {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C798230VSz());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.13BV] */
    public static int LIZ(int i, int i2) {
        ?? arrayList;
        double dDoubleValue;
        int iIntValue;
        int iIntValue2;
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            File fileX2 = C786410Ut5.x2(contextLIZ);
            if (fileX2 == null && (fileX2 = C786410Ut5.w2(contextLIZ)) == null) {
                return i;
            }
            long j = 1024;
            long jLLFFF = (C2204961BRm.LLFFF(new StatFs(fileX2.getPath()), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+wc5rc1T+tTDpbnk0k0fjDxTOMUFfIAcQ5Kz4qJgmkzJdY3n2Vw5/Ly2g8eJ3XT/o=", null)) / j) / j;
            if (jLLFFF > 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        C01GW c01gw = SearchDynamicImageDiskCacheExperiment.LIZIZ;
                        Double d = ((SearchDynamicImageDiskCacheExperiment.Config) c01gw.getValue()).percentOfFreeSpace;
                        if (d != null) {
                            dDoubleValue = d.doubleValue();
                        } else {
                            dDoubleValue = 0.005d;
                        }
                        Integer num = ((SearchDynamicImageDiskCacheExperiment.Config) c01gw.getValue()).sizeMbMin;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 20;
                        }
                        Integer num2 = ((SearchDynamicImageDiskCacheExperiment.Config) c01gw.getValue()).sizeMbMax;
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 100;
                        }
                        if (dDoubleValue > 0.0d && iIntValue > 0 && iIntValue2 > 0 && iIntValue <= iIntValue2) {
                            return (int) C13LZ.LIZJ(jLLFFF * dDoubleValue, iIntValue, iIntValue2);
                        }
                        return i;
                    }
                    return i;
                }
                String str = ((SearchDynamicImageDiskCacheExperiment.Config) SearchDynamicImageDiskCacheExperiment.LIZIZ.getValue()).bucketData;
                if (str == null) {
                    str = "";
                }
                if (a0.LJJJIL(str)) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                    Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(a0.LJLIIIL((String) it2.next()).toString());
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (((String) obj).length() > 0) {
                            arrayList3.add(obj);
                        }
                    }
                    if (arrayList3.size() % 2 != 0) {
                        arrayList = C13BV.INSTANCE;
                    } else {
                        arrayList = new ArrayList();
                        for (int i3 = 0; i3 < arrayList3.size(); i3 += 2) {
                            try {
                                arrayList.add(new C0VT0(CastLongProtector.parseLong((String) ListProtector.get(arrayList3, i3)), CastIntegerProtector.parseInt((String) ListProtector.get(arrayList3, i3 + 1))));
                            } catch (NumberFormatException e) {
                                TryCatchGuardChecker.doCheck(e);
                                arrayList = C13BV.INSTANCE;
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return i;
                }
                long j2 = jLLFFF / 1024;
                for (C0VT0 c0vt0 : arrayList) {
                    long j3 = c0vt0.LIZ;
                    if (j3 == -1 || j2 < j3) {
                        return c0vt0.LIZIZ;
                    }
                }
                return i;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return i;
    }
}
