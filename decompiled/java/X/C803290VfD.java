package X;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: X.0VfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803290VfD implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        C0VSJ c0vsj = new C0VSJ(file, str);
        if (c0vsj.isDirectory()) {
            C08SE.LIZIZ(c0vsj);
            return false;
        }
        return false;
    }
}
