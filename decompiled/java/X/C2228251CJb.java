package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1CJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228251CJb implements InterfaceC2228261CJc, InterfaceC972900bQO {
    public final InterfaceC2228261CJc LL;

    @Override // X.InterfaceC2228261CJc
    public final long LIZJ() {
        return this.LL.LIZJ();
    }

    @Override // X.InterfaceC2228261CJc
    public final void LIZLLL(long j, long j2) {
        this.LL.LIZLLL(j, j2);
    }

    @Override // X.InterfaceC2228261CJc
    public final void LJ(long j, String str) {
        this.LL.LJ(j, str);
    }

    @Override // X.InterfaceC2228261CJc
    public final void LJFF(long j, C1283980jW8 c1283980jW8, long j2) {
        this.LL.LJFF(j, c1283980jW8, j2);
    }

    @Override // X.InterfaceC2228261CJc
    public final void LJI(String str, List list) {
        this.LL.LJI(str, list);
    }

    @Override // X.InterfaceC2228261CJc
    public final void LJII(long j, long j2, long j3) {
        this.LL.LJII(j, j2, j3);
    }

    @Override // X.InterfaceC2228261CJc
    public final long LJIIIIZZ() {
        return this.LL.LJIIIIZZ();
    }

    public C2228251CJb(C2181481AZe c2181481AZe) {
        this.LL = c2181481AZe;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        InputStream byteArrayInputStream2;
        C2226551CCn c2226551CCnDecode;
        InputStream byteArrayInputStream3;
        InputStream byteArrayInputStream4;
        InputStream byteArrayInputStream5;
        if (j == 8254945816693533831L) {
            try {
                C1CJU c1cju = new C1CJU(Long.valueOf(LJIIIIZZ()));
                return new C972940bQS(C2231651CWd.LIZLLL(C1CJU.ADAPTER.encodedSize(c1cju), new AwS613S0100000_34(c1cju, 120)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return C972930bQR.LIZ();
            }
        }
        if (j == -7381483861826428853L) {
            try {
                C1CJU c1cju2 = new C1CJU(Long.valueOf(LIZJ()));
                return new C972940bQS(C2231651CWd.LIZLLL(C1CJU.ADAPTER.encodedSize(c1cju2), new AwS613S0100000_34(c1cju2, 119)));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return C972930bQR.LIZ();
            }
        }
        boolean z = true;
        if (j == -2442551419145261748L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C1CH7 c1ch7Decode = C1CH7.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    LJ(c1ch7Decode.container.longValue(), c1ch7Decode.source);
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
        } else {
            if (j == -4947805153343938294L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream2 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream2 = new ByteArrayInputStream(new byte[0]);
                    }
                    c2226551CCnDecode = C2226551CCn.ADAPTER.decode(byteArrayInputStream2);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                } catch (Exception e5) {
                    e = e5;
                    z = false;
                }
                try {
                    LJI(c2226551CCnDecode.source, c2226551CCnDecode.containers);
                    return new C972940bQS(null);
                } catch (Exception e6) {
                    e = e6;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    return C972930bQR.LIZ();
                }
            }
            if (j == 5457220172601765197L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream3 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream3 = new ByteArrayInputStream(new byte[0]);
                    }
                    C2228331CJj c2228331CJjDecode = C2228331CJj.ADAPTER.decode(byteArrayInputStream3);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    try {
                        LJFF(c2228331CJjDecode.container.longValue(), C2231651CWd.LJJIII(c2228331CJjDecode.frame), c2228331CJjDecode.z_order.longValue());
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
            } else if (j == 5198776329942930685L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream4 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream4 = new ByteArrayInputStream(new byte[0]);
                    }
                    C2228301CJg c2228301CJgDecode = C2228301CJg.ADAPTER.decode(byteArrayInputStream4);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    try {
                        LJII(c2228301CJgDecode.parent.longValue(), c2228301CJgDecode.child.longValue(), c2228301CJgDecode.z_order.longValue());
                        return new C972940bQS(null);
                    } catch (Exception e9) {
                        e = e9;
                        TryCatchGuardChecker.doCheck(e);
                        if (!z && byteBuffer != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                        }
                        return C972930bQR.LIZ();
                    }
                } catch (Exception e10) {
                    e = e10;
                    z = false;
                }
            } else if (j == 8654053758303335296L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream5 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream5 = new ByteArrayInputStream(new byte[0]);
                    }
                    C2228271CJd c2228271CJdDecode = C2228271CJd.ADAPTER.decode(byteArrayInputStream5);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    try {
                        LIZLLL(c2228271CJdDecode.parent.longValue(), c2228271CJdDecode.child.longValue());
                        return new C972940bQS(null);
                    } catch (Exception e11) {
                        e = e11;
                        TryCatchGuardChecker.doCheck(e);
                        if (!z && byteBuffer != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                        }
                        return C972930bQR.LIZ();
                    }
                } catch (Exception e12) {
                    e = e12;
                    z = false;
                }
            } else {
                return new C972940bQS(null);
            }
        }
    }
}
