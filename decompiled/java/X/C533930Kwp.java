package X;

import android.app.Application;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Kwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533930Kwp {
    public static final boolean LJFF() {
        return LIZLLL("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static final boolean LIZJ() {
        return C0CHQ.LIZ().LJJJI().checkImageAndVideoReadStoragePermissionGranted();
    }

    public static final boolean LIZ(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LIZIZ(String[] strArr) {
        return LIZ(LJ(strArr));
    }

    public static final boolean LIZLLL(String str) {
        return LIZIZ(new String[]{str});
    }

    public static final int[] LJ(String[] strArr) {
        Application application = C0CHQ.LIZ;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(C838410Wul.LIZ(application, str)));
        }
        return C13LP.LLII(arrayList);
    }

    public static final String[] LJI(int[] iArr, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (iArr != null && strArr != null) {
            int length = iArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = iArr[i];
                int i4 = i2 + 1;
                if (i2 <= strArr.length && i3 == -1) {
                    arrayList.add(strArr[i2]);
                }
                i++;
                i2 = i4;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
