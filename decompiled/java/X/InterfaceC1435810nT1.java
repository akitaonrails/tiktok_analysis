package X;

/* JADX INFO: renamed from: X.0nT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1435810nT1 {
    void LIZ(InterfaceC2221271Bwj interfaceC2221271Bwj, long j, int i, boolean z);

    int LIZIZ();

    boolean LIZJ(int i, long j, boolean z);

    void LIZLLL();

    void LJ();

    void LJFF();

    void cancelUpload();

    int consume(int i, byte[] bArr, int i2);

    void disableDeleteCacheWhenEnd(boolean z);

    long getCrc32ByOffset(long j, long j2);

    long getHeaderSize();

    long getNoConsumeBufferSize(long j, int i);

    boolean isProduceFinish();

    void stopUpload(boolean z);

    int streamConsume(long j, byte[] bArr, int i, int i2);
}
