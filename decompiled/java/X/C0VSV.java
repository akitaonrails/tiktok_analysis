package X;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: X.0VSV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSV extends FileOutputStream {
    public C0VSV(File file) {
        super(C0VSH.LIZ(file));
    }

    public C0VSV(String str) {
        super(C0VSH.LIZIZ(str));
    }

    public C0VSV(FileDescriptor fileDescriptor) {
        super(fileDescriptor);
    }

    public C0VSV(File file, boolean z) {
        super(C0VSH.LIZ(file), z);
    }

    public C0VSV(String str, boolean z) {
        super(C0VSH.LIZIZ(str), z);
    }
}
