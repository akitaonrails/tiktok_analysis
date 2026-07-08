package X;

import java.io.File;

/* JADX INFO: renamed from: X.0VMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796550VMn implements InterfaceC796190VLd, InterfaceC796580VMq {
    public C796520VMk LL;
    public boolean LLILLJJLI;

    @Override // X.InterfaceC796190VLd
    public final synchronized C0VLF LJLJJI() {
        if (!this.LLILLJJLI) {
            LIZIZ(true);
            this.LLILLJJLI = true;
        }
        throw null;
    }

    @Override // X.InterfaceC796190VLd, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // X.InterfaceC796580VMq
    public final InterfaceC796190VLd getDelegate() {
        return null;
    }

    @Override // X.InterfaceC796190VLd
    public final String getDatabaseName() {
        throw null;
    }

    public static final void LIZ(File file) {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    public final void LIZIZ(boolean z) {
        getDatabaseName();
        throw null;
    }

    @Override // X.InterfaceC796190VLd
    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }
}
