package X;

import Y.AObjectS247S0100000_29;
import android.content.Context;
import ge.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Pd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19750312Pd extends i<InterfaceC19750812Pi, C19750912Pj, C19750612Pg, C19750212Pc> implements InterfaceC19750812Pi, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C12PU LLJJ;
    public final HashMap<String, Boolean> LLJJI;
    public final InterfaceC1731706qJ LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19750312Pd.class, "voiceEventComponent", "getVoiceEventComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voice/business/VoiceEventApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIIJIL = 8;
    }

    private final InterfaceC19753412Qi F4() {
        return (InterfaceC19753412Qi) this.LLJJIII.getValue(this, LLJJIJI[0]);
    }

    public final void H4() {
        this.LLJJI.clear();
        int size = ((ArrayList) F4().OL1().LIZ).size();
        C19750512Pf c19750512PfOL1 = F4().OL1();
        C19750412Pe c19750412Pe = new C19750412Pe(true, size);
        c19750412Pe.LIZJ = new AwS573S0100000_29(this, 245);
        Iterator it2 = ((ArrayList) c19750512PfOL1.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC19750712Ph) it2.next()).LIZ(c19750412Pe);
        }
    }

    @Override // X.InterfaceC19750812Pi
    public void RP() {
        i3(AFwS273S0000000_29.get$arr$(127));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19750612Pg> o2() {
        return AFwS218S0000000_29.get$arr$(164);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19750212Pc> w2() {
        return new AwS573S0100000_29(this, 246);
    }

    @Override // X.InterfaceC19750812Pi
    public void wn2() {
        i3(AFwS273S0000000_29.get$arr$(128));
    }

    public final void Hk2() {
        int size = ((ArrayList) F4().OL1().LIZ).size();
        C19750512Pf c19750512PfOL1 = F4().OL1();
        C19750412Pe c19750412Pe = new C19750412Pe(false, size);
        c19750412Pe.LJ = K4(this.LLJILJILJ.requireSceneContext(), new AwS573S0100000_29(c19750412Pe, 241));
        c19750412Pe.LIZJ = new AwS573S0100000_29(this, 242);
        Iterator it2 = ((ArrayList) c19750512PfOL1.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC19750712Ph) it2.next()).LIZ(c19750412Pe);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJJ.LIZ(new C12PR() { // from class: X.12Pm
            @Override // X.C12PR
            public final void LIZJ() {
            }

            @Override // X.C12PR
            public final void LIZ(String str) {
                if (!Intrinsics.LJFF(str, "ae_voiceChange")) {
                    this.LIZ.i3(AFwS273S0000000_29.get$arr$(124));
                }
            }

            @Override // X.C12PR
            public final void LIZIZ(String str) {
                if (Intrinsics.LJFF(str, "ae_voiceChange")) {
                    this.LIZ.i3(AFwS273S0000000_29.get$arr$(125));
                    C19750312Pd c19750312Pd = this.LIZ;
                    c19750312Pd.LLJJ.LIZLLL("javaClass", new AwS573S0100000_29(c19750312Pd, 243));
                } else {
                    this.LIZ.i3(AFwS273S0000000_29.get$arr$(126));
                    C19750312Pd c19750312Pd2 = this.LIZ;
                    c19750312Pd2.LLJJ.LJ(new AwS573S0100000_29(c19750312Pd2, 244));
                }
            }
        });
        F4().x11().LIZ(this, new AObjectS247S0100000_29(this, 50));
    }

    @Override // X.InterfaceC19750812Pi
    public void cp() {
        H4();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    private final C1397510mTF K4(Context context, Function0<Unit> function0) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131822392);
        C985403tE.LIZ(c1397580mTM, new AwS608S0100000_29(function0, (Function0<Unit>) 181));
        return new C1397510mTF(c1397580mTM);
    }

    public C19750312Pd(C19A3 c19a3, C1DRG c1drg, C12PU c12pu) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c12pu;
        this.LLJJI = new HashMap<>();
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753412Qi.class, null);
    }
}
