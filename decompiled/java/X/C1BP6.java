package X;

import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.pia.core.bridge.protocol.ProtocolMessage;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;

/* JADX INFO: renamed from: X.1BP6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BP6 implements InterfaceC21281518Qb {
    public final C1BP0 LIZ;
    public final C2204051BNz LIZIZ;
    public final C2204311BOz LIZJ;
    public boolean LIZLLL;
    public final C1BPD<n> LJ = new C1BPD<>();
    public C1BQC LJFF = null;
    public int LJI = 0;
    public final SparseArray<InterfaceC1530550pvp<C2204551BPx>> LJII = new SparseArray<>();

    public static void LIZLLL(InterfaceC1530550pvp interfaceC1530550pvp, Object obj) {
        if (interfaceC1530550pvp != null) {
            try {
                interfaceC1530550pvp.accept(obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1BPP.LIZJ(4, "[Bridge] invoke callback error:", th);
            }
        }
    }

    @Override // X.InterfaceC21281518Qb
    public final void LIZ(final Object obj, final String str) {
        C1287700jc8.LIZJ(new Runnable() { // from class: X.1BPA
            public final /* synthetic */ InterfaceC1530550pvp LLILZ = null;
            public final /* synthetic */ InterfaceC1530550pvp LLILZIL = null;

            @Override // java.lang.Runnable
            public final void run() {
                n nVar;
                int i;
                final C1BP6 c1bp6 = this.LL;
                final Object obj2 = obj;
                final String str2 = str;
                final InterfaceC1530550pvp interfaceC1530550pvp = this.LLILZ;
                final InterfaceC1530550pvp interfaceC1530550pvp2 = this.LLILZIL;
                c1bp6.getClass();
                C1C7U.LIZ("PiaBridge@7fb5.send$1L");
                if (obj2 != null) {
                    try {
                        if (obj2 instanceof n) {
                            nVar = (n) obj2;
                        } else {
                            try {
                                nVar = (n) GsonUtils.LIZ().LJIJJLI(obj2);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c1bp6.LIZJ(-3, str2, "parse data failed.", th);
                                C1BP6.LIZLLL(interfaceC1530550pvp, new C1BQ0());
                                C1C7U.LIZIZ("PiaBridge@7fb5.send$1L");
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1BP6.LIZLLL(interfaceC1530550pvp, new C1BQ0(th2.toString()));
                    }
                } else {
                    nVar = null;
                }
                if (interfaceC1530550pvp2 == null && interfaceC1530550pvp == null) {
                    i = 0;
                } else {
                    InterfaceC1530550pvp<C2204551BPx> interfaceC1530550pvp3 = new InterfaceC1530550pvp() { // from class: X.1BPI
                        @Override // X.InterfaceC1530550pvp
                        public final void accept(Object obj3) {
                            C1BP6 c1bp62 = c1bp6;
                            InterfaceC1530550pvp interfaceC1530550pvp4 = interfaceC1530550pvp2;
                            String str3 = str2;
                            InterfaceC1530550pvp interfaceC1530550pvp5 = interfaceC1530550pvp;
                            C2204551BPx c2204551BPx = (C2204551BPx) obj3;
                            c1bp62.getClass();
                            try {
                                int i2 = c2204551BPx.LIZIZ;
                                if (i2 == 1) {
                                    if (interfaceC1530550pvp4 != null) {
                                        Class<?> clsLIZ = C1297420jro.LIZ(interfaceC1530550pvp4, InterfaceC1530550pvp.class, 0);
                                        if (clsLIZ.isInstance(c2204551BPx.LIZJ)) {
                                            interfaceC1530550pvp4.accept(c2204551BPx.LIZJ);
                                            return;
                                        } else {
                                            interfaceC1530550pvp4.accept(GsonUtils.LIZ().LIZJ(c2204551BPx.LIZJ, clsLIZ));
                                            return;
                                        }
                                    }
                                    return;
                                }
                                if (i2 < 1 && interfaceC1530550pvp5 != null) {
                                    c1bp62.LIZJ(i2, str3, c2204551BPx.LIZLLL, null);
                                    interfaceC1530550pvp5.accept(new C2204191BOn(c2204551BPx.LIZIZ, c2204551BPx.LIZLLL));
                                }
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                c1bp62.LIZJ(-4, str3, "invoke callback failed.", th3);
                                C1BP6.LIZLLL(interfaceC1530550pvp5, new C1BQ1(th3.toString()));
                            }
                        }
                    };
                    SparseArray<InterfaceC1530550pvp<C2204551BPx>> sparseArray = c1bp6.LJII;
                    int i2 = c1bp6.LJI - 1;
                    c1bp6.LJI = i2;
                    sparseArray.append(i2, interfaceC1530550pvp3);
                    i = c1bp6.LJI;
                }
                n nVarLIZIZ = ProtocolMessage.LIZIZ(new C1BQ2(i, str2, nVar));
                if (nVarLIZIZ == null) {
                    c1bp6.LIZJ(-3, str2, "create protocol message failed.", null);
                    C1BP6.LIZLLL(interfaceC1530550pvp, new C1BQ0());
                } else {
                    c1bp6.LJ.LIZ(nVarLIZIZ);
                }
                C1C7U.LIZIZ("PiaBridge@7fb5.send$1L");
            }
        });
    }

    public C1BP6(C1BP0 c1bp0, C2204051BNz c2204051BNz, C2204311BOz c2204311BOz) {
        this.LIZ = c1bp0;
        this.LIZIZ = c2204051BNz;
        this.LIZJ = c2204311BOz;
    }

    public final void LIZIZ(final InterfaceC1530550pvp interfaceC1530550pvp, final InterfaceC1530550pvp interfaceC1530550pvp2, final n nVar, final String str) {
        C1287700jc8.LIZJ(new Runnable() { // from class: X.1BP2
            /* JADX WARN: Removed duplicated region for block: B:48:0x00fd A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0014, B:5:0x0029, B:7:0x0031, B:9:0x0053, B:11:0x005f, B:14:0x006f, B:16:0x0075, B:17:0x0078, B:18:0x0085, B:20:0x0091, B:23:0x009e, B:26:0x00a6, B:28:0x00b4, B:30:0x00c4, B:48:0x00fd, B:51:0x010e, B:37:0x00da, B:40:0x00ee, B:35:0x00cd), top: B:58:0x0014, inners: #0 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 310
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1BP2.run():void");
            }
        });
    }

    public final void LIZJ(int i, String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("name=");
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(", message=");
            sb.append(str2);
        }
        if (th != null) {
            sb.append(", error=");
            sb.append(Log.getStackTraceString(th));
        }
        this.LIZIZ.LJII.LIZIZ("bridge", i, sb.toString());
    }
}
