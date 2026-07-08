package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467200oHe implements InterfaceC1467720oIU {
    public final InterfaceC1467720oIU LIZIZ;
    public C1466990oHJ LIZJ;

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZ(int i, String str) {
        return null;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZIZ(int i, long j) {
        return this.LIZIZ.LIZIZ(i, j);
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZJ(int i, int i2) {
        return null;
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

    public final String LJIIJJI() {
        return LJIIIZ().k6;
    }

    public C1467200oHe(InterfaceC1467720oIU interfaceC1467720oIU) {
        this.LIZIZ = interfaceC1467720oIU;
    }

    @Override // X.InterfaceC1699160uJm
    public final int LJIIIIZZ(int i) {
        return LJIIJ(i);
    }

    public final int LJIIJ(int i) {
        if (i != 302) {
            if (i != 427) {
                if (i != 571) {
                    if (i != 603) {
                        if (i != 656) {
                            if (i != 764) {
                                if (i != 767) {
                                    if (i != 4302) {
                                        if (i != 5010) {
                                            if (i != 424) {
                                                if (i == 425) {
                                                    return LJIIIZ().f175i0;
                                                }
                                                return 0;
                                            }
                                            return LJIIIZ().f174h0;
                                        }
                                        if (LJIIIZ().LJJLIIIJL) {
                                            return 1;
                                        }
                                        return 0;
                                    }
                                    if (LJIIIZ().C5) {
                                        return 1;
                                    }
                                    return 0;
                                }
                                if (LJIIIZ().m0) {
                                    return 1;
                                }
                                return 0;
                            }
                            return LJIIIZ().n0;
                        }
                        if (LJIIIZ().F3) {
                            return 1;
                        }
                        return 0;
                    }
                    return LJIIIZ().D1;
                }
                return LJIIIZ().Y1;
            }
            if (LJIIIZ().f0) {
                return 1;
            }
            return 0;
        }
        return LJIIIZ().LLIIIILZ;
    }
}
