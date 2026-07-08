package X;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: X.0kgy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1329140kgy extends AbstractC1330070kiT<byte[]> implements InterfaceC1330410kj1 {
    public final int[] LLJI;

    @Override // X.AbstractC1330070kiT
    public final int LJIIJ(int i) {
        return i;
    }

    @Override // X.AbstractC1330070kiT
    public final byte[] LIZIZ(int i) {
        return new byte[i];
    }

    @Override // X.AbstractC1330070kiT
    public final void LJFF(byte[] bArr) {
        bArr.getClass();
    }

    @Override // X.AbstractC1330070kiT
    public final int LJIIIIZZ(int i) {
        if (i > 0) {
            for (int i2 : this.LLJI) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new C0VFX(Integer.valueOf(i));
    }

    @Override // X.AbstractC1330070kiT
    public final int LJIIIZ(byte[] bArr) {
        byte[] bArr2 = bArr;
        bArr2.getClass();
        return bArr2.length;
    }

    public C1329140kgy(InterfaceC1328250kfX interfaceC1328250kfX, C1329300khE c1329300khE, C1330500kjA c1330500kjA) {
        super(interfaceC1328250kfX, c1329300khE, c1330500kjA);
        SparseIntArray sparseIntArray = c1329300khE.LIZJ;
        this.LLJI = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.LLJI[i] = sparseIntArray.keyAt(i);
        }
        this.LLILLJJLI.LIZ(this);
        this.LLJ.LIZJ();
    }
}
