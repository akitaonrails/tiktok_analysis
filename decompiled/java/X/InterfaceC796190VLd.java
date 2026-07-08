package X;

import java.io.Closeable;

/* JADX INFO: renamed from: X.0VLd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC796190VLd extends Closeable {
    C0VLF LJLJJI();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
