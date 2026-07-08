package X;

import Y.AComparatorS46S0000000_27;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0wYL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785070wYL implements InterfaceC1859700yUi {
    public final InterfaceC497601wk LIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public String LJFF;
    public BPEAHandler LJI;
    public final Object LIZIZ = new Object();
    public final List<C1785080wYM> LIZJ = new ArrayList();
    public final EnumC1782630wUP LJII = EnumC1782630wUP.FIXED;
    public final long LJIIIIZZ = 50;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 843));

    public final void LJII() {
        this.LJFF = null;
        this.LIZLLL = false;
        ((ArrayList) this.LIZJ).clear();
        this.LJIIJ = -1;
        C05IF c05if = (C05IF) this.LJIIJJI.getValue();
        AnonymousClass0956 anonymousClass0956 = c05if.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c05if.LIZLLL = null;
    }

    @Override // X.InterfaceC1859700yUi
    public final void LIZLLL() {
        synchronized (this.LIZIZ) {
            try {
                this.LJ = true;
                LJIIIIZZ();
                LJII();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIIZZ() {
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            LJIIIZ((C1785080wYM) it2.next());
        }
        ((ArrayList) this.LIZJ).clear();
        LJII();
        C05IF c05if = (C05IF) this.LJIIJJI.getValue();
        AnonymousClass0956 anonymousClass0956 = c05if.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c05if.LIZLLL = null;
    }

    public final void LJIIJJI() {
        if (this.LJI == null) {
            this.LJI = new BPEAHandler(Looper.getMainLooper());
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS46S0000000_27(2), this.LIZJ);
        ((ArrayList) this.LIZJ).clear();
        C23250099c.LIZLLL(this.LIZ, null, null, new C1783940wWW(listLJLLLL, this, null), 3);
    }

    @Override // X.InterfaceC1859700yUi
    public final void LJI() {
        System.currentTimeMillis();
        if (this.LIZLLL) {
            this.LIZLLL = false;
            C23250099c.LIZLLL(this.LIZ, null, null, new C1783570wVv(this, null), 3);
        }
    }

    @Override // X.InterfaceC1859700yUi
    public final void LIZ() {
        LJII();
    }

    public C1785070wYL(C054G c054g) {
        this.LIZ = c054g;
    }

    @Override // X.InterfaceC1859700yUi
    public final void LIZIZ(AwS393S0200000_27 awS393S0200000_27) {
        synchronized (this.LIZIZ) {
            try {
                C1785080wYM c1785080wYM = new C1785080wYM(new MessageChunkResult(0, null, null, null, null, 0, 0L, null, null, null, 0, false, false), awS393S0200000_27, new C1785090wYN(System.currentTimeMillis()), this.LJIIJ + 1, true);
                if (this.LIZLLL) {
                    ((ArrayList) this.LIZJ).add(c1785080wYM);
                } else {
                    LJIIJ(c1785080wYM, "handleRequestComplete");
                    LJII();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIZ(C1785080wYM c1785080wYM) {
        if (this.LJIIIZ == -1) {
            this.LJIIIZ = c1785080wYM.LIZLLL - 1;
        }
        this.LJIIIZ = c1785080wYM.LIZLLL;
        c1785080wYM.LIZIZ.invoke(c1785080wYM.LIZJ);
    }

    public final void LJIIJ(C1785080wYM c1785080wYM, String str) {
        int i;
        C1785080wYM c1785080wYM2 = (C1785080wYM) C13LP.LJJLIIIJL(this.LIZJ);
        if (c1785080wYM2 != null) {
            i = c1785080wYM2.LIZLLL;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (c1785080wYM.LIZLLL > i) {
            for (C1785080wYM c1785080wYM3 : (ArrayList) this.LIZJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("-> error process ->processChunkAndCheckIndex");
                C2188811AlT.LIZIZ(sbLIZ);
                LJIIIZ(c1785080wYM3);
            }
            ((ArrayList) this.LIZJ).clear();
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("->processChunkAndCheckIndex");
        C2188811AlT.LIZIZ(sbLIZ2);
        LJIIIZ(c1785080wYM);
    }

    @Override // X.InterfaceC1859700yUi
    public final void LIZJ(MessageChunkResult messageChunkResult, Message message, Function1<? super C1785090wYN, Unit> function1) {
        boolean z;
        String str;
        synchronized (this.LIZIZ) {
            try {
                C1785090wYN c1785090wYN = new C1785090wYN(System.currentTimeMillis());
                int i = messageChunkResult.chunkIndex;
                int i2 = messageChunkResult.event;
                if (i2 > 4) {
                    z = true;
                } else {
                    z = false;
                }
                C1785080wYM c1785080wYM = new C1785080wYM(messageChunkResult, function1, c1785090wYN, i, z);
                this.LJIIJ = i;
                if (this.LJ) {
                    LJIIJ(c1785080wYM, "handleCommonChunk hasStopTyping");
                } else {
                    if (i2 > 4) {
                        String str2 = null;
                        if (message == null) {
                            str = null;
                        } else {
                            str = message.uuid;
                        }
                        C1785140wYS.LJII(str);
                        if (message != null) {
                            str2 = message.uuid;
                        }
                        C1785140wYS.LJI(messageChunkResult.answerIndex, str2);
                    }
                    if (this.LIZLLL) {
                        ((ArrayList) this.LIZJ).add(c1785080wYM);
                    } else {
                        LJIIIZ(c1785080wYM);
                        LJII();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    @Override // X.InterfaceC1859700yUi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult r14, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r15, X.C1859780yUq r16) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1785070wYL.LJ(com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult, com.ss.android.ugc.aweme.tako.ccl.model.api.Message, X.0yUq):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    @Override // X.InterfaceC1859700yUi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult r21, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r22, X.C1858680yT4 r23) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1785070wYL.LJFF(com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult, com.ss.android.ugc.aweme.tako.ccl.model.api.Message, X.0yT4):void");
    }
}
