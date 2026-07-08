package X;

import Y.ALAdapterS12S0200000_17;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0g4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151750g4r implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public static final void run$0(C1151750g4r c1151750g4r) {
        ((C1295960jpS) c1151750g4r.l0).removeAnimatorListener((ALAdapterS12S0200000_17) c1151750g4r.l1);
        ((C1087890ePr) c1151750g4r.l2).LIZIZ((C1295960jpS) c1151750g4r.l0);
    }

    public static final void run$1(C1151750g4r c1151750g4r) {
        C1106110etF c1106110etF = (C1106110etF) c1151750g4r.l0;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) c1151750g4r.l1;
        DataChannel dataChannel = (DataChannel) c1151750g4r.l2;
        C19EG c19eg = c1106110etF.LLJ;
        if (c19eg != null && c19eg.getResources().getConfiguration().orientation == 1) {
            C785230UrB c785230UrB = new C785230UrB(interfaceC1103130eoR.getContentView());
            c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            c785230UrB.LJIIIZ = true;
            c785230UrB.LIZLLL(2131851142);
            c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0etE
                @Override // X.InterfaceC254600ye
                public final void onShow() {
                    InterfaceC1106030et7.m7.LJFF(Boolean.TRUE);
                }
            };
            c785230UrB.LJIILLIIL = new C1151840g50(c1106110etF, 2);
            C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.LIVE_SHARE_TO_STORY, dataChannel);
        }
    }

    public static final void run$2(C1151750g4r c1151750g4r) {
        ((C1295960jpS) c1151750g4r.l0).removeAnimatorListener((ALAdapterS12S0200000_17) c1151750g4r.l1);
        C1087880ePq c1087880ePq = (C1087880ePq) c1151750g4r.l2;
        C1295960jpS c1295960jpS = (C1295960jpS) c1151750g4r.l0;
        c1087880ePq.getClass();
        C786410Ut5.LLD(4, c1295960jpS);
        if (c1087880ePq.LIZ.size() >= 5) {
            C786410Ut5.LJJJLZIJ(c1295960jpS, c1087880ePq.LIZIZ.LIZLLL);
        } else {
            c1087880ePq.LIZ.add(c1295960jpS);
        }
    }

    public C1151750g4r(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
