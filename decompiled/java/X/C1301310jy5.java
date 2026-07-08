package X;

/* JADX INFO: renamed from: X.0jy5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1301310jy5 {
    public final InterfaceC1301360jyA LIZ;
    public final InterfaceC1289750jfR LIZIZ;

    public final void LIZ(String str) {
        InterfaceC1289750jfR interfaceC1289750jfR = this.LIZIZ;
        if (interfaceC1289750jfR != null) {
            ((C1301480jyM) interfaceC1289750jfR).LIZJ(str);
            return;
        }
        InterfaceC1301360jyA interfaceC1301360jyA = this.LIZ;
        if (interfaceC1301360jyA == null) {
            return;
        }
        interfaceC1301360jyA.reject(str);
    }

    public final void LIZIZ(byte[] bArr) {
        InterfaceC1289750jfR interfaceC1289750jfR = this.LIZIZ;
        if (interfaceC1289750jfR != null) {
            ((C1301480jyM) interfaceC1289750jfR).LIZLLL(bArr.length);
            ((C1301480jyM) this.LIZIZ).LIZ(bArr, bArr.length);
            ((C1301480jyM) this.LIZIZ).LIZIZ();
            return;
        }
        InterfaceC1301360jyA interfaceC1301360jyA = this.LIZ;
        if (interfaceC1301360jyA == null) {
            return;
        }
        interfaceC1301360jyA.LIZ(bArr, bArr.length);
    }

    public C1301310jy5(InterfaceC1301360jyA interfaceC1301360jyA, C1301480jyM c1301480jyM) {
        this.LIZ = interfaceC1301360jyA;
        this.LIZIZ = c1301480jyM;
    }
}
