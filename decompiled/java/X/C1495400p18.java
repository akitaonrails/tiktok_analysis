package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import xlp.c;

/* JADX INFO: renamed from: X.0p18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495400p18 implements C0X0W {
    public final List<InterfaceC836900WsK> LIZ;
    public final C1495430p1B LIZIZ;
    public final InterfaceC1495410p19 LIZJ;
    public final C1495650p1X LIZLLL;
    public final int LJ;
    public final Request LJFF;
    public final InterfaceC1495580p1Q LJI;
    public final AbstractC1494940p0O LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public int LJIIJJI;

    @Override // X.C0X0W
    public final int LIZIZ() {
        return this.LJIIIZ;
    }

    @Override // X.C0X0W
    public final int LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.C0X0W
    public final InterfaceC1495580p1Q call() {
        return this.LJI;
    }

    @Override // X.C0X0W
    public final Request request() {
        return this.LJFF;
    }

    @Override // X.C0X0W
    public final C0XLY LIZ(Request request) {
        return LJ(request, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // X.C0X0W
    public final C1495400p18 LIZLLL(int i, TimeUnit timeUnit) {
        return new C1495400p18(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, c.LIZLLL(timeUnit, i), this.LJIIIZ, this.LJIIJ);
    }

    public final C1495400p18 LJFF(int i, TimeUnit timeUnit) {
        return new C1495400p18(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, c.LIZLLL(timeUnit, i), this.LJIIJ);
    }

    public final C1495400p18 LJI(int i, TimeUnit timeUnit) {
        return new C1495400p18(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, c.LIZLLL(timeUnit, i));
    }

    public final C0XLY LJ(Request request, C1495430p1B c1495430p1B, InterfaceC1495410p19 interfaceC1495410p19, C1495650p1X c1495650p1X) {
        if (this.LJ < this.LIZ.size()) {
            this.LJIIJJI++;
            if (this.LIZJ != null && !this.LIZLLL.LJIIJ(request.url())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("network interceptor ");
                sbLIZ.append(ListProtector.get(this.LIZ, this.LJ - 1));
                sbLIZ.append(" must retain the same host and port");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (this.LIZJ != null && this.LJIIJJI > 1) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("network interceptor ");
                sbLIZ2.append(ListProtector.get(this.LIZ, this.LJ - 1));
                sbLIZ2.append(" must call proceed() exactly once");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            List<InterfaceC836900WsK> list = this.LIZ;
            int i = this.LJ;
            C1495400p18 c1495400p18 = new C1495400p18(list, c1495430p1B, interfaceC1495410p19, c1495650p1X, i + 1, request, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ);
            InterfaceC836900WsK interfaceC836900WsK = (InterfaceC836900WsK) ListProtector.get(list, i);
            C0XLY c0xlyIntercept = interfaceC836900WsK.intercept(c1495400p18);
            if (interfaceC1495410p19 != null && this.LJ + 1 < this.LIZ.size() && c1495400p18.LJIIJJI != 1) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("network interceptor ");
                sbLIZ3.append(interfaceC836900WsK);
                sbLIZ3.append(" must call proceed() exactly once");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (c0xlyIntercept != null) {
                if (c0xlyIntercept.LLIZ != null) {
                    return c0xlyIntercept;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("interceptor ");
                sbLIZ4.append(interfaceC836900WsK);
                sbLIZ4.append(" returned a response with no body");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4));
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("interceptor ");
            sbLIZ5.append(interfaceC836900WsK);
            sbLIZ5.append(" returned null");
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ5));
        }
        throw new AssertionError();
    }

    public C1495400p18(List<InterfaceC836900WsK> list, C1495430p1B c1495430p1B, InterfaceC1495410p19 interfaceC1495410p19, C1495650p1X c1495650p1X, int i, Request request, InterfaceC1495580p1Q interfaceC1495580p1Q, AbstractC1494940p0O abstractC1494940p0O, int i2, int i3, int i4) {
        this.LIZ = list;
        this.LIZLLL = c1495650p1X;
        this.LIZIZ = c1495430p1B;
        this.LIZJ = interfaceC1495410p19;
        this.LJ = i;
        this.LJFF = request;
        this.LJI = interfaceC1495580p1Q;
        this.LJII = abstractC1494940p0O;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = i3;
        this.LJIIJ = i4;
    }
}
