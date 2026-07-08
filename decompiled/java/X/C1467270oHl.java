package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467270oHl implements InterfaceC1467720oIU {
    public final InterfaceC1467720oIU LIZIZ;
    public C1466990oHJ LIZJ;

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZ(int i, String str) {
        return this.LIZIZ.LIZ(i, str);
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZIZ(int i, long j) {
        return this.LIZIZ.LIZIZ(i, j);
    }

    @Override // X.InterfaceC1467440oI2
    public final Map<Integer, C1467880oIk> LIZLLL() {
        return this.LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC1467560oIE
    public final /* synthetic */ C1467880oIk LJ(int i, JSONObject jSONObject) {
        return null;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LJFF(float f, int i) {
        return this.LIZIZ.LJFF(f, i);
    }

    @Override // X.InterfaceC1467440oI2
    public final Map<Integer, C1467880oIk> LJI() {
        return this.LIZIZ.LJI();
    }

    @Override // X.InterfaceC1467440oI2
    public final void LJII() {
        throw null;
    }

    @Override // X.InterfaceC1467440oI2
    public final long getNativeHandle() {
        return this.LIZIZ.getNativeHandle();
    }

    @Override // X.InterfaceC1467440oI2
    public final void release() {
        this.LIZIZ.release();
    }

    public final C1466990oHJ LJIIIZ() {
        C1466990oHJ c1466990oHJ = this.LIZJ;
        if (c1466990oHJ != null) {
            return c1466990oHJ;
        }
        return null;
    }

    public C1467270oHl(InterfaceC1467720oIU interfaceC1467720oIU) {
        this.LIZIZ = interfaceC1467720oIU;
    }

    @Override // X.InterfaceC1699160uJm
    public final int LJIIIIZZ(int i) {
        return LJIIJ(i);
    }

    public final int LJIIJ(int i) {
        if (i != 36) {
            if (i != 56) {
                if (i != 1310) {
                    if (i != 4005) {
                        if (i != 42049) {
                            return 0;
                        }
                        return LJIIIZ().LLLLLLLZIL;
                    }
                    return LJIIIZ().V2;
                }
                return LJIIIZ().T4;
            }
            return LJIIIZ().LLII;
        }
        return LJIIIZ().LLIFFJFJJ;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZJ(int i, int i2) {
        if (i == 56) {
            LJIIIZ().LLII = i2;
            return null;
        }
        return null;
    }
}
