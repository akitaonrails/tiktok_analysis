package X;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11Ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19508811Ug {
    public final InterfaceC1631630sYr<InterfaceC2221271Bwj, Long, Integer, Boolean, Unit> LIZ;
    public final ArrayList<byte[]> LIZIZ = new ArrayList<>();
    public long LIZJ;
    public int LIZLLL;
    public int LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C19508811Ug(InterfaceC1631630sYr<? super InterfaceC2221271Bwj, ? super Long, ? super Integer, ? super Boolean, Unit> interfaceC1631630sYr) {
        this.LIZ = interfaceC1631630sYr;
    }

    public final void LIZ(int i, long j, boolean z) {
        byte[] bArr;
        System.nanoTime();
        ArrayList<byte[]> arrayList = this.LIZIZ;
        if (arrayList != null && !arrayList.isEmpty() && i > 0) {
            bArr = new byte[i];
            int length = 0;
            for (byte[] bArr2 : arrayList) {
                if (bArr2 != null && bArr2.length != 0) {
                    System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                    length += bArr2.length;
                }
            }
        } else {
            bArr = new byte[0];
        }
        this.LIZIZ.clear();
        this.LIZ.invoke(new C199555136b(bArr), Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z));
        System.nanoTime();
    }
}
