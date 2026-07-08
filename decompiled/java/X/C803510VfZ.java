package X;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: X.0VfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803510VfZ implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith("ai_");
    }
}
