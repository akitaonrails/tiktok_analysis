package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VXN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VXN implements C0VXO {
    public String LIZ;

    public C0VXN() {
    }

    public C0VXN(String str) {
        this.LIZ = str;
    }

    public final List LIZ(long j, String str) {
        boolean z;
        String strReplace;
        long j2;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            File[] fileArrListFiles = new C0VSJ(str).listFiles();
            if (fileArrListFiles == null) {
                return arrayList;
            }
            if (this.LIZ == null) {
                this.LIZ = C802270VdZ.LIZJ();
            }
            if (!this.LIZ.contains(":")) {
                z = true;
            } else {
                z = false;
            }
            if (this.LIZ.contains(":")) {
                strReplace = this.LIZ.replace(":", "-");
            } else {
                strReplace = this.LIZ;
            }
            File file = null;
            File file2 = null;
            long j3 = 0;
            long j4 = 0;
            for (File file3 : fileArrListFiles) {
                String name = file3.getName();
                if (name.endsWith(".hot") && ((!z || !file3.getName().contains("-")) && ((z || file3.getName().contains("-")) && name.contains(strReplace)))) {
                    String[] strArrSplit = name.split("_");
                    if (strArrSplit.length >= 4) {
                        j2 = CastLongProtector.parseLong(strArrSplit[3]);
                    } else if (strArrSplit.length > 1) {
                        j2 = CastLongProtector.parseLong(strArrSplit[0]);
                    } else {
                        j2 = -1;
                    }
                    if (j <= 0 || j2 <= j) {
                        if (j3 < j2) {
                            file = file2;
                            j4 = j3;
                            file2 = file3;
                            j3 = j2;
                        } else if (j4 < j2) {
                            j4 = j2;
                            file = file3;
                        }
                    }
                }
            }
            if (file != null && file.length() > 0) {
                arrayList.add(file.getAbsolutePath());
            }
            if (file2 != null && file2.length() > 0) {
                arrayList.add(file2.getAbsolutePath());
                return arrayList;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C801940Vd2.LIZJ(e);
        }
        return arrayList;
    }
}
