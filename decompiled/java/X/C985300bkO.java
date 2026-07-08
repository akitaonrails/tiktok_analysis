package X;

import Y.AfS184S0100000_15;
import Y.AfS5S0100100_15;
import com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.matching.view.IndividualMatchQuitRequestFragment;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0bkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985300bkO extends AbstractC985290bkN {
    public final C976790bWf LLILLJJLI;
    public InterfaceC420801kM LLILLL;

    @Override // X.AbstractC985290bkN
    public final void LJIIJ() {
        InterfaceC420801kM interfaceC420801kM;
        InterfaceC420801kM interfaceC420801kM2 = this.LLILLL;
        if (interfaceC420801kM2 != null && !interfaceC420801kM2.isDisposed() && (interfaceC420801kM = this.LLILLL) != null) {
            interfaceC420801kM.dispose();
        }
        this.LLILLL = ((C0J1N) C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(20L).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00DS
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return Long.valueOf(20 - ((Number) obj).longValue());
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(LJII())).LIZ(new AfS184S0100000_15(this, 105), new C09JN() { // from class: X.00RE
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IndividualMatchQuitRequestPresenter@d289.startRejectTimer$3");
                C20441214yg.LJFF("IndividualMatchMateQuitPresenter", "count down", (Throwable) obj);
                C1C7U.LIZIZ("IndividualMatchQuitRequestPresenter@d289.startRejectTimer$3");
            }
        });
    }

    public final void LJIILIIL() {
        InterfaceC420801kM interfaceC420801kM;
        InterfaceC420801kM interfaceC420801kM2 = this.LLILLL;
        if (interfaceC420801kM2 == null || interfaceC420801kM2.isDisposed() || (interfaceC420801kM = this.LLILLL) == null) {
            return;
        }
        interfaceC420801kM.dispose();
    }

    @Override // X.AbstractC985290bkN
    public final void LJIIIZ() {
        long channelId = C915980Zwa.LJII().getChannelId();
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        long jLJJJJJL = interfaceC973730bRjYf2 != null ? interfaceC973730bRjYf2.LJJJJJL() : 0L;
        C974540bT2.LIZ.LJL();
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).approvalQuit(channelId, jLJJJJJL, 1).LIZJ(LJII())).LIZ(new AfS5S0100100_15(jLJJJJJL, this, 8), new C09JN() { // from class: X.0bkP
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IndividualMatchQuitRequestPresenter@d289.approveRequest$2");
                C974540bT2.LIZ.LJLI((Throwable) obj);
                C1C7U.LIZIZ("IndividualMatchQuitRequestPresenter@d289.approveRequest$2");
            }
        });
        C973660bRc.LIZ.LJLILLLLZI(true, false);
    }

    @Override // X.AbstractC985290bkN
    public final void LJIIJJI() {
        LJIILIIL();
    }

    @Override // X.AbstractC985290bkN
    public final void LJIIL(boolean z) {
        long jLJJJJJL;
        int i;
        long channelId = C915980Zwa.LJII().getChannelId();
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            jLJJJJJL = interfaceC973730bRjYf2.LJJJJJL();
        } else {
            jLJJJJJL = 0;
        }
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        C974540bT2.LIZ.LJL();
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).approvalQuit(channelId, jLJJJJJL, i).LIZJ(LJII())).LIZ(new AfS5S0100100_15(jLJJJJJL, this, 9), new C09JN() { // from class: X.0bkQ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IndividualMatchQuitRequestPresenter@d289.rejectRequest$2");
                Throwable th = (Throwable) obj;
                if (th != null) {
                    C974540bT2.LIZ.LJLI(th);
                }
                C1C7U.LIZIZ("IndividualMatchQuitRequestPresenter@d289.rejectRequest$2");
            }
        });
        C973660bRc.LIZ.LJLILLLLZI(false, z);
    }

    public C985300bkO(IndividualMatchQuitRequestFragment individualMatchQuitRequestFragment, C976790bWf c976790bWf) {
        super(individualMatchQuitRequestFragment);
        this.LLILLJJLI = c976790bWf;
    }
}
