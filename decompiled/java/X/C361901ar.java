package X;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: X.01ar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C361901ar {
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
}
