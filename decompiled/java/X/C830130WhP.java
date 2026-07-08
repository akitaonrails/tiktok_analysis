package X;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.0WhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C830130WhP implements InterfaceC830190WhV {
    public final File LIZ;
    public final C0VSV LIZIZ;

    @Override // X.InterfaceC830190WhV
    public final void LIZ() throws Exception {
        AbstractC830080WhK.LIZJ(this.LIZIZ);
        if (this.LIZ.delete()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("could not delete temporary file: ");
        sbLIZ.append(this.LIZ.getAbsolutePath());
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C830130WhP(C0VSJ c0vsj) throws IOException {
        File fileCreateTempFile = File.createTempFile("NanoHTTPD-", "", c0vsj);
        this.LIZ = fileCreateTempFile;
        this.LIZIZ = new C0VSV(fileCreateTempFile);
    }
}
