package X;

import java.io.File;

/* JADX INFO: renamed from: X.0krZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1335710krZ implements InterfaceC1335610krP {
    public final String LIZ;
    public final C1335740krc LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    @Override // X.InterfaceC1335610krP
    public final long getSize() {
        if (this.LIZJ < 0) {
            this.LIZJ = this.LIZIZ.LIZ();
        }
        return this.LIZJ;
    }

    @Override // X.InterfaceC1335610krP
    public final long getTimestamp() {
        if (this.LIZLLL < 0) {
            this.LIZLLL = this.LIZIZ.LIZ.lastModified();
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1335610krP
    public final String getId() {
        return this.LIZ;
    }

    public C1335710krZ(String str, File file) {
        str.getClass();
        this.LIZ = str;
        this.LIZIZ = new C1335740krc(file);
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
    }
}
