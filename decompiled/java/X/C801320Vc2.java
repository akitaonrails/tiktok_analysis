package X;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: X.0Vc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801320Vc2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                LIZ(file.getPath());
            } else {
                file.delete();
            }
        }
        c0vsj.delete();
    }

    public static boolean LIZIZ(String str) {
        if (str == null) {
            return false;
        }
        return new C0VSJ(str).exists();
    }
}
