package X;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/* JADX INFO: renamed from: X.13SM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13SM extends C13SN {
    /* JADX WARN: Illegal instructions before constructor call */
    public C13SM(C13SD c13sd) {
        FileOutputStream fileOutputStream = c13sd.LIZ;
        super(new OutputStreamWriter(fileOutputStream == null ? null : fileOutputStream));
    }
}
