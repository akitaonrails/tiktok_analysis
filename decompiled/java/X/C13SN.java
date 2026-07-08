package X;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: X.13SN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13SN implements C13SE {
    public final Writer LIZ;

    public final void LIZ() throws IOException {
        this.LIZ.flush();
    }

    @Override // X.C13SE
    public final void close() throws IOException {
        this.LIZ.close();
    }

    public C13SN(Writer writer) {
        this.LIZ = writer;
    }

    public final void LIZIZ(String str) throws IOException {
        this.LIZ.write(str);
    }
}
