package X;

import Y.AfS191S0100000_22;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0nSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435620nSi implements InterfaceC1464170oCl, InterfaceC1464160oCk, InterfaceC1464200oCo {
    public final C1431070nLN LL;
    public final int LLILLJJLI;
    public C11JF LLILLL;
    public long LLILZ;
    public long LLILZIL;

    public final void LIZ() {
        C11JF c11jf = this.LLILLL;
        if (c11jf == null || c11jf.isDisposed()) {
            return;
        }
        C11JF c11jf2 = this.LLILLL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LLILLL = null;
    }

    public C1435620nSi(C1431070nLN c1431070nLN, int i) {
        this.LL = c1431070nLN;
        this.LLILLJJLI = i;
        if (i > 0) {
            this.LLILLL = (C11JF) C11NZ.LJJJJLI(i, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(new C19501611Rm(EnumC2272608vM.LL)).LJJLJLI(new AfS191S0100000_22(this, 33));
        }
        this.LLILZ = System.currentTimeMillis();
        this.LLILZIL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1464200oCo
    public final void onCallback(int i, int i2, float f, String str) {
        this.LLILZIL = System.currentTimeMillis();
        if (i == 4176) {
            this.LL.LIZIZ(new C1431390nLt(EnumC1434810nRP.COMPILE, EnumC1436980nUu.VESDK, ""), EnumC2251001D8o.OUTER);
        }
    }

    @Override // X.InterfaceC1464160oCk
    public final void onEncoderDataAvailable(ByteBuffer byteBuffer, long j, int i, boolean z) {
        this.LLILZ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1464170oCl
    public final void onEncoderDataAvailable(byte[] bArr, long j, int i, boolean z) {
        this.LLILZ = System.currentTimeMillis();
    }
}
