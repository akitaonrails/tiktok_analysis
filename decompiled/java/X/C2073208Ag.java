package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.08Ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2073208Ag {
    public static ArrayList<Long> LIZ() {
        ArrayList<Long> arrayList = new ArrayList<>();
        for (File file : new C0VSJ("/proc/self/task/").listFiles(new FilenameFilter() { // from class: X.08Af
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                try {
                    CastLongProtector.parseLong(str);
                    return true;
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }
        })) {
            arrayList.add(Long.valueOf(CastLongProtector.parseLong(file.getName())));
        }
        return arrayList;
    }
}
