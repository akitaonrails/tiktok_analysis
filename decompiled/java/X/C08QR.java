package X;

import java.io.File;
import java.nio.file.Files;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08QR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08QR extends C09AY implements Function1<File, Boolean> {
    public C08QR() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(File file) {
        boolean z;
        File file2 = file;
        if (C08QS.LIZ && Files.isSymbolicLink(file2.toPath())) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
