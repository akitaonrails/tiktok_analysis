package X;

import java.util.List;

/* JADX INFO: renamed from: X.1Bby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2208401Bby {
    void cancel();

    long getCrc32ByOffset(long j, int i);

    long getValue(int i);

    int readSlice(int i, byte[] bArr, int i2);

    int readSliceByOffset(long j, byte[] bArr, int i, int i2);

    List<Long> readSliceByOffsetAdv(long j, byte[] bArr, int i, int i2);
}
