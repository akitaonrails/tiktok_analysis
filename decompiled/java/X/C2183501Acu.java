package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1Acu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183501Acu implements InterfaceC2183461Acq, InterfaceC972900bQO {
    public final InterfaceC2183461Acq LL;

    @Override // X.InterfaceC2183461Acq
    public final void LIZ(C1AZU c1azu, C1283230jUv c1283230jUv, C1CXK c1cxk, C1CXK c1cxk2) {
        this.LL.LIZ(c1azu, c1283230jUv, c1cxk, c1cxk2);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LIZJ(C1AZU c1azu, C2182171Aal c2182171Aal, C2181851AaF c2181851AaF) {
        this.LL.LIZJ(c1azu, c2182171Aal, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LIZLLL(C1AZU c1azu, C1AZU c1azu2, C2181851AaF c2181851AaF) {
        this.LL.LIZLLL(c1azu, c1azu2, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJ(C1AZU c1azu, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        this.LL.LJ(c1azu, c1283230jUv, z, z2);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJFF(C1AZU c1azu, C2182221Aaq c2182221Aaq, C2181851AaF c2181851AaF) {
        this.LL.LJFF(c1azu, c2182221Aaq, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final C2181531AZj LJI(C1AZU c1azu, C2181531AZj c2181531AZj, C2181851AaF c2181851AaF) {
        return this.LL.LJI(c1azu, c2181531AZj, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJII(C1AZU c1azu, List<C2181741Aa4> list, C2182111Aaf c2182111Aaf, C2181851AaF c2181851AaF) {
        this.LL.LJII(c1azu, list, c2182111Aaf, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIIIZZ(C1AZU c1azu, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        this.LL.LJIIIIZZ(c1azu, c1283230jUv, z, z2);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIIZ(C1AZU c1azu, C1283230jUv c1283230jUv, C1CXJ c1cxj, C1CXJ c1cxj2) {
        this.LL.LJIIIZ(c1azu, c1283230jUv, c1cxj, c1cxj2);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIJ(C1AZU c1azu, C1283230jUv c1283230jUv, C1CWQ c1cwq, C1CWQ c1cwq2) {
        this.LL.LJIIJ(c1azu, c1283230jUv, c1cwq, c1cwq2);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIJJI(C1AZU c1azu, C1AZU c1azu2, C2181851AaF c2181851AaF) {
        this.LL.LJIIJJI(c1azu, c1azu2, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIL(C1AZU c1azu, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        this.LL.LJIIL(c1azu, c1283230jUv, z, z2);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIILIIL(C1AZU c1azu, C2182221Aaq c2182221Aaq, C2181851AaF c2181851AaF) {
        this.LL.LJIILIIL(c1azu, c2182221Aaq, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIILJJIL(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
        this.LL.LJIILJJIL(c1azu, str, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIILL(C1AZU c1azu, C1283230jUv c1283230jUv, C1CX5 c1cx5, C1CX5 c1cx52) {
        this.LL.LJIILL(c1azu, c1283230jUv, c1cx5, c1cx52);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIILLIIL(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
        this.LL.LJIILLIIL(c1azu, str, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIZILJ(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
        this.LL.LJIIZILJ(c1azu, str, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIJ(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
        this.LL.LJIJ(c1azu, str, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIJI(C1AZU c1azu, C2182031AaX c2182031AaX, List<C2181811AaB> list, C2181851AaF c2181851AaF) {
        this.LL.LJIJI(c1azu, c2182031AaX, list, c2181851AaF);
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIJJ(C1AZU c1azu, C2182171Aal c2182171Aal, C2181851AaF c2181851AaF) {
        this.LL.LJIJJ(c1azu, c2182171Aal, c2181851AaF);
    }

    public C2183501Acu(C2181491AZf c2181491AZf) {
        this.LL = c2181491AZf;
    }

    public final C972940bQS LJIJJLI(ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        boolean z = false;
        try {
            if (byteBuffer != null) {
                byteArrayInputStream = new C19924412xW(byteBuffer);
            } else {
                byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
            }
            C1CWC c1cwcDecode = C1CWC.ADAPTER.decode(byteArrayInputStream);
            if (byteBuffer != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
            }
            z = true;
            LJIIL(C2231651CWd.LJIILIIL(c1cwcDecode.arch_type), C2231651CWd.LJJIJLIJ(c1cwcDecode.identity), c1cwcDecode.old_state.booleanValue(), c1cwcDecode.new_state.booleanValue());
            return new C972940bQS(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!z && byteBuffer != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
            }
            return C972930bQR.LIZ();
        }
    }

    public final C972940bQS LJIL(ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        boolean z = false;
        try {
            if (byteBuffer != null) {
                byteArrayInputStream = new C19924412xW(byteBuffer);
            } else {
                byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
            }
            C1CWC c1cwcDecode = C1CWC.ADAPTER.decode(byteArrayInputStream);
            if (byteBuffer != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
            }
            z = true;
            LJIIIIZZ(C2231651CWd.LJIILIIL(c1cwcDecode.arch_type), C2231651CWd.LJJIJLIJ(c1cwcDecode.identity), c1cwcDecode.old_state.booleanValue(), c1cwcDecode.new_state.booleanValue());
            return new C972940bQS(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!z && byteBuffer != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
            }
            return C972930bQR.LIZ();
        }
    }

    public final C972940bQS LJJ(ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        boolean z = false;
        try {
            if (byteBuffer != null) {
                byteArrayInputStream = new C19924412xW(byteBuffer);
            } else {
                byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
            }
            C1CWI c1cwiDecode = C1CWI.ADAPTER.decode(byteArrayInputStream);
            if (byteBuffer != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
            }
            z = true;
            LJIILL(C2231651CWd.LJIILIIL(c1cwiDecode.arch_type), C2231651CWd.LJJIJLIJ(c1cwiDecode.identity), C2231651CWd.LJJJIL(c1cwiDecode.old_state), C2231651CWd.LJJJIL(c1cwiDecode.new_state));
            return new C972940bQS(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!z && byteBuffer != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
            }
            return C972930bQR.LIZ();
        }
    }

    public final C972940bQS LJJI(ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        boolean z = false;
        try {
            if (byteBuffer != null) {
                byteArrayInputStream = new C19924412xW(byteBuffer);
            } else {
                byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
            }
            C1CWA c1cwaDecode = C1CWA.ADAPTER.decode(byteArrayInputStream);
            if (byteBuffer != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
            }
            z = true;
            LIZ(C2231651CWd.LJIILIIL(c1cwaDecode.arch_type), C2231651CWd.LJJIJLIJ(c1cwaDecode.identity), C2231651CWd.LJJIZ(c1cwaDecode.old_state), C2231651CWd.LJJIZ(c1cwaDecode.new_state));
            return new C972940bQS(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!z && byteBuffer != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
            }
            return C972930bQR.LIZ();
        }
    }

    public final C972940bQS LJJIFFI(ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        boolean z = false;
        try {
            if (byteBuffer != null) {
                byteArrayInputStream = new C19924412xW(byteBuffer);
            } else {
                byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
            }
            C1CWC c1cwcDecode = C1CWC.ADAPTER.decode(byteArrayInputStream);
            if (byteBuffer != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
            }
            z = true;
            LJ(C2231651CWd.LJIILIIL(c1cwcDecode.arch_type), C2231651CWd.LJJIJLIJ(c1cwcDecode.identity), c1cwcDecode.old_state.booleanValue(), c1cwcDecode.new_state.booleanValue());
            return new C972940bQS(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!z && byteBuffer != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
            }
            return C972930bQR.LIZ();
        }
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        InputStream byteArrayInputStream2;
        InputStream byteArrayInputStream3;
        InputStream byteArrayInputStream4;
        InputStream byteArrayInputStream5;
        C1CS1 c1cs1Decode;
        InputStream byteArrayInputStream6;
        C2230531CRv c2230531CRvDecode;
        InputStream byteArrayInputStream7;
        C2230531CRv c2230531CRvDecode2;
        InputStream byteArrayInputStream8;
        InputStream byteArrayInputStream9;
        InputStream byteArrayInputStream10;
        InputStream byteArrayInputStream11;
        InputStream byteArrayInputStream12;
        C2182111Aaf c2182111AafLJJI;
        InputStream byteArrayInputStream13;
        C2233491CbL c2233491CbLDecode;
        InputStream byteArrayInputStream14;
        InputStream byteArrayInputStream15;
        boolean z = true;
        if (j == 4008712016968332837L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2230561CRy c2230561CRyDecode = C2230561CRy.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    LJIIJJI(C2231651CWd.LJIILIIL(c2230561CRyDecode.old_arch_type), C2231651CWd.LJIILIIL(c2230561CRyDecode.new_arch_type), C2231651CWd.LJJJLZIJ(c2230561CRyDecode.source));
                    return new C972940bQS(null);
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    return C972930bQR.LIZ();
                }
            } catch (Exception e2) {
                e = e2;
                z = false;
            }
        } else if (j == -2724612125577774393L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream2 = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream2 = new ByteArrayInputStream(new byte[0]);
                }
                C2230561CRy c2230561CRyDecode2 = C2230561CRy.ADAPTER.decode(byteArrayInputStream2);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    LIZLLL(C2231651CWd.LJIILIIL(c2230561CRyDecode2.old_arch_type), C2231651CWd.LJIILIIL(c2230561CRyDecode2.new_arch_type), C2231651CWd.LJJJLZIJ(c2230561CRyDecode2.source));
                    return new C972940bQS(null);
                } catch (Exception e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    return C972930bQR.LIZ();
                }
            } catch (Exception e4) {
                e = e4;
                z = false;
            }
        } else if (j == -6845203941610945661L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream3 = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream3 = new ByteArrayInputStream(new byte[0]);
                }
                C2230531CRv c2230531CRvDecode3 = C2230531CRv.ADAPTER.decode(byteArrayInputStream3);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    LJIILLIIL(C2231651CWd.LJIILIIL(c2230531CRvDecode3.arch_type), c2230531CRvDecode3.layout_key, C2231651CWd.LJJJLZIJ(c2230531CRvDecode3.source));
                    return new C972940bQS(null);
                } catch (Exception e5) {
                    e = e5;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    return C972930bQR.LIZ();
                }
            } catch (Exception e6) {
                e = e6;
                z = false;
            }
        } else if (j == 1122154571359654917L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream4 = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream4 = new ByteArrayInputStream(new byte[0]);
                }
                C2230531CRv c2230531CRvDecode4 = C2230531CRv.ADAPTER.decode(byteArrayInputStream4);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    LJIJ(C2231651CWd.LJIILIIL(c2230531CRvDecode4.arch_type), c2230531CRvDecode4.layout_key, C2231651CWd.LJJJLZIJ(c2230531CRvDecode4.source));
                    return new C972940bQS(null);
                } catch (Exception e7) {
                    e = e7;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    return C972930bQR.LIZ();
                }
            } catch (Exception e8) {
                e = e8;
                z = false;
            }
        } else {
            if (j == -3031820250027232066L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream5 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream5 = new ByteArrayInputStream(new byte[0]);
                    }
                    c1cs1Decode = C1CS1.ADAPTER.decode(byteArrayInputStream5);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                } catch (Exception e9) {
                    e = e9;
                    z = false;
                }
                try {
                    LJIJJ(C2231651CWd.LJIILIIL(c1cs1Decode.arch_type), C2231651CWd.LJJIIJ(c1cs1Decode.result), C2231651CWd.LJJJLZIJ(c1cs1Decode.source));
                    return new C972940bQS(null);
                } catch (Exception e10) {
                    e = e10;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    return C972930bQR.LIZ();
                }
            }
            if (j == 2028905699137021014L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream6 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream6 = new ByteArrayInputStream(new byte[0]);
                    }
                    c2230531CRvDecode = C2230531CRv.ADAPTER.decode(byteArrayInputStream6);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                } catch (Exception e11) {
                    e = e11;
                    z = false;
                }
                try {
                    LJIILJJIL(C2231651CWd.LJIILIIL(c2230531CRvDecode.arch_type), c2230531CRvDecode.layout_key, C2231651CWd.LJJJLZIJ(c2230531CRvDecode.source));
                    return new C972940bQS(null);
                } catch (Exception e12) {
                    e = e12;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    return C972930bQR.LIZ();
                }
            }
            if (j == -6897554219611873465L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream7 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream7 = new ByteArrayInputStream(new byte[0]);
                    }
                    c2230531CRvDecode2 = C2230531CRv.ADAPTER.decode(byteArrayInputStream7);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                } catch (Exception e13) {
                    e = e13;
                    z = false;
                }
                try {
                    LJIIZILJ(C2231651CWd.LJIILIIL(c2230531CRvDecode2.arch_type), c2230531CRvDecode2.layout_key, C2231651CWd.LJJJLZIJ(c2230531CRvDecode2.source));
                    return new C972940bQS(null);
                } catch (Exception e14) {
                    e = e14;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    return C972930bQR.LIZ();
                }
            }
            if (j == 7669728532113364894L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream8 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream8 = new ByteArrayInputStream(new byte[0]);
                    }
                    C2230511CRt c2230511CRtDecode = C2230511CRt.ADAPTER.decode(byteArrayInputStream8);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    try {
                        LJIILIIL(C2231651CWd.LJIILIIL(c2230511CRtDecode.arch_type), C2231651CWd.LJJ(c2230511CRtDecode.error), C2231651CWd.LJJJLZIJ(c2230511CRtDecode.source));
                        return new C972940bQS(null);
                    } catch (Exception e15) {
                        e = e15;
                        TryCatchGuardChecker.doCheck(e);
                        if (!z && byteBuffer != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                        }
                        return C972930bQR.LIZ();
                    }
                } catch (Exception e16) {
                    e = e16;
                    z = false;
                }
            } else if (j == -3362123159861145506L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream9 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream9 = new ByteArrayInputStream(new byte[0]);
                    }
                    C2230511CRt c2230511CRtDecode2 = C2230511CRt.ADAPTER.decode(byteArrayInputStream9);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    try {
                        LJFF(C2231651CWd.LJIILIIL(c2230511CRtDecode2.arch_type), C2231651CWd.LJJ(c2230511CRtDecode2.error), C2231651CWd.LJJJLZIJ(c2230511CRtDecode2.source));
                        return new C972940bQS(null);
                    } catch (Exception e17) {
                        e = e17;
                        TryCatchGuardChecker.doCheck(e);
                        if (!z && byteBuffer != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                        }
                        return C972930bQR.LIZ();
                    }
                } catch (Exception e18) {
                    e = e18;
                    z = false;
                }
            } else if (j == 5122211816710817468L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream10 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream10 = new ByteArrayInputStream(new byte[0]);
                    }
                    C1CS4 c1cs4Decode = C1CS4.ADAPTER.decode(byteArrayInputStream10);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    try {
                        C1CS7 c1cs7 = new C1CS7(LJI(C2231651CWd.LJIILIIL(c1cs4Decode.arch_type), C2231651CWd.LJIIJJI(c1cs4Decode.model), C2231651CWd.LJJJLZIJ(c1cs4Decode.source)).LIZ());
                        return new C972940bQS(C2231651CWd.LIZLLL(C1CS7.ADAPTER.encodedSize(c1cs7), new AwS612S0100000_33(c1cs7, 166)));
                    } catch (Exception e19) {
                        e = e19;
                        TryCatchGuardChecker.doCheck(e);
                        if (!z && byteBuffer != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                        }
                        return C972930bQR.LIZ();
                    }
                } catch (Exception e20) {
                    e = e20;
                    z = false;
                }
            } else if (j == 7432995964502845473L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream11 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream11 = new ByteArrayInputStream(new byte[0]);
                    }
                    C1CS1 c1cs1Decode2 = C1CS1.ADAPTER.decode(byteArrayInputStream11);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    try {
                        LIZJ(C2231651CWd.LJIILIIL(c1cs1Decode2.arch_type), C2231651CWd.LJJIIJ(c1cs1Decode2.result), C2231651CWd.LJJJLZIJ(c1cs1Decode2.source));
                        return new C972940bQS(null);
                    } catch (Exception e21) {
                        e = e21;
                        TryCatchGuardChecker.doCheck(e);
                        if (!z && byteBuffer != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                        }
                        return C972930bQR.LIZ();
                    }
                } catch (Exception e22) {
                    e = e22;
                    z = false;
                }
            } else if (j == 5691624460585968952L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream12 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream12 = new ByteArrayInputStream(new byte[0]);
                    }
                    C2233371Cb9 c2233371Cb9Decode = C2233371Cb9.ADAPTER.decode(byteArrayInputStream12);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    try {
                        C1AZU c1azuLJIILIIL = C2231651CWd.LJIILIIL(c2233371Cb9Decode.arch_type);
                        List<C1CZJ> list = c2233371Cb9Decode.changed_windows_info;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<C1CZJ> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(C2231651CWd.LJJIIJZLJL(it2.next()));
                        }
                        C2233351Cb7 c2233351Cb7 = c2233371Cb9Decode.new_layout_extra;
                        if (c2233351Cb7 != null) {
                            c2182111AafLJJI = C2231651CWd.LJJI(c2233351Cb7);
                        } else {
                            c2182111AafLJJI = null;
                        }
                        LJII(c1azuLJIILIIL, arrayList, c2182111AafLJJI, C2231651CWd.LJJJLZIJ(c2233371Cb9Decode.source));
                        return new C972940bQS(null);
                    } catch (Exception e23) {
                        e = e23;
                        TryCatchGuardChecker.doCheck(e);
                        if (!z && byteBuffer != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                        }
                        return C972930bQR.LIZ();
                    }
                } catch (Exception e24) {
                    e = e24;
                    z = false;
                }
            } else {
                if (j == -6210753110866978484L) {
                    try {
                        if (byteBuffer != null) {
                            byteArrayInputStream13 = new C19924412xW(byteBuffer);
                        } else {
                            byteArrayInputStream13 = new ByteArrayInputStream(new byte[0]);
                        }
                        c2233491CbLDecode = C2233491CbL.ADAPTER.decode(byteArrayInputStream13);
                        if (byteBuffer != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                        }
                    } catch (Exception e25) {
                        e = e25;
                        z = false;
                    }
                    try {
                        C1AZU c1azuLJIILIIL2 = C2231651CWd.LJIILIIL(c2233491CbLDecode.arch_type);
                        C2233581CbU c2233581CbU = c2233491CbLDecode.layout_state;
                        C2182031AaX c2182031AaX = new C2182031AaX(c2233581CbU.layout_id, c2233581CbU.layout_key, c2233581CbU.multi_guest_layout_extra, c2233581CbU.cohost_layout_extra, c2233581CbU.multi_guest_layout_non_sei_extra, c2233581CbU.cohost_layout_non_sei_extra);
                        List<C2233171Cap> list2 = c2233491CbLDecode.spot_list;
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<C2233171Cap> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(C2231651CWd.LJJJJJ(it3.next()));
                        }
                        LJIJI(c1azuLJIILIIL2, c2182031AaX, arrayList2, C2231651CWd.LJJJLZIJ(c2233491CbLDecode.source));
                        return new C972940bQS(null);
                    } catch (Exception e26) {
                        e = e26;
                        TryCatchGuardChecker.doCheck(e);
                        if (!z && byteBuffer != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                        }
                        return C972930bQR.LIZ();
                    }
                }
                if (j == 1499628552964511473L) {
                    try {
                        if (byteBuffer != null) {
                            byteArrayInputStream14 = new C19924412xW(byteBuffer);
                        } else {
                            byteArrayInputStream14 = new ByteArrayInputStream(new byte[0]);
                        }
                        C1CWL c1cwlDecode = C1CWL.ADAPTER.decode(byteArrayInputStream14);
                        if (byteBuffer != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                        }
                        try {
                            LJIIJ(C2231651CWd.LJIILIIL(c1cwlDecode.arch_type), C2231651CWd.LJJIJLIJ(c1cwlDecode.identity), C2231651CWd.LJIIL(c1cwlDecode.old_state), C2231651CWd.LJIIL(c1cwlDecode.new_state));
                            return new C972940bQS(null);
                        } catch (Exception e27) {
                            e = e27;
                            TryCatchGuardChecker.doCheck(e);
                            if (!z && byteBuffer != null) {
                                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                            }
                            return C972930bQR.LIZ();
                        }
                    } catch (Exception e28) {
                        e = e28;
                        z = false;
                    }
                } else if (j == 8919463792602166006L) {
                    try {
                        if (byteBuffer != null) {
                            byteArrayInputStream15 = new C19924412xW(byteBuffer);
                        } else {
                            byteArrayInputStream15 = new ByteArrayInputStream(new byte[0]);
                        }
                        C1CWF c1cwfDecode = C1CWF.ADAPTER.decode(byteArrayInputStream15);
                        if (byteBuffer != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                        }
                        try {
                            LJIIIZ(C2231651CWd.LJIILIIL(c1cwfDecode.arch_type), C2231651CWd.LJJIJLIJ(c1cwfDecode.identity), C2231651CWd.LJJIJL(c1cwfDecode.old_state), C2231651CWd.LJJIJL(c1cwfDecode.new_state));
                            return new C972940bQS(null);
                        } catch (Exception e29) {
                            e = e29;
                            TryCatchGuardChecker.doCheck(e);
                            if (!z && byteBuffer != null) {
                                MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                            }
                            return C972930bQR.LIZ();
                        }
                    } catch (Exception e30) {
                        e = e30;
                        z = false;
                    }
                } else {
                    if (j == -1760945256101391124L) {
                        return LJIJJLI(byteBuffer);
                    }
                    if (j == -1101671546793953587L) {
                        return LJIL(byteBuffer);
                    }
                    if (j == 8923289543846543619L) {
                        return LJJIFFI(byteBuffer);
                    }
                    if (j == 2561744288660213112L) {
                        return LJJI(byteBuffer);
                    }
                    if (j == -7504551886245666238L) {
                        return LJJ(byteBuffer);
                    }
                    return new C972940bQS(null);
                }
            }
        }
    }
}
