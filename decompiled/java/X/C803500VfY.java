package X;

/* JADX INFO: renamed from: X.0VfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C803500VfY extends AbstractC803260VfA<byte[]> {
    @Override // X.AbstractC803260VfA
    public final int LIZJ(byte[] bArr) {
        return bArr.length;
    }

    @Override // X.AbstractC803260VfA
    public final void LIZIZ(byte[] bArr, int i, char[] cArr, int i2, int i3) {
        byte[] bArr2 = bArr;
        for (int i4 = 0; i4 < i3; i4++) {
            cArr[i2 + i4] = (char) bArr2[i + i4];
        }
    }
}
