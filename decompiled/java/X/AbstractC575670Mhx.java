package X;

import X.C575620Mhs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Mhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC575670Mhx<T extends C575620Mhs> implements InterfaceC575760Mi6<T> {
    public final T LIZ;
    public final C099F LIZIZ = C090F.LIZIZ();
    public final C569090MTr LIZJ = new C569090MTr();
    public final List<InterfaceC575750Mi5<?, ?>> LIZLLL = new ArrayList();

    @Override // X.InterfaceC575750Mi5
    public final Object LIZLLL(InterfaceC569070MTp interfaceC569070MTp, C575710Mi1 c575710Mi1) {
        return LJFF(this, interfaceC569070MTp, c575710Mi1);
    }

    public abstract Object LJ(C569090MTr c569090MTr, InterfaceC1364105Vn interfaceC1364105Vn);

    @Override // X.InterfaceC575760Mi6
    public final C569090MTr LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC575750Mi5
    public final C099F LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC575750Mi5
    public final /* bridge */ /* synthetic */ C575620Mhs getInput() {
        return this.LIZ;
    }

    public AbstractC575670Mhx(T t) {
        this.LIZ = t;
    }

    @Override // X.InterfaceC575750Mi5
    public final void LIZ(InterfaceC575760Mi6 interfaceC575760Mi6) {
        ((ArrayList) this.LIZLLL).add(interfaceC575760Mi6);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0065 -> B:25:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends X.C575620Mhs> java.lang.Object LJFF(X.AbstractC575670Mhx<T> r9, X.InterfaceC569070MTp r10, X.InterfaceC1364105Vn<java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC575670Mhx.LJFF(X.0Mhx, X.0MTp, X.05Vn):java.lang.Object");
    }
}
