package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS40S0010000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10Iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19224310Iv extends C193N<C05YF, C190Z, C19224710Iz> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI;
    public boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final Function0<C190Z> LLJILJILJ;
    public final C19224710Iz LLJILLL;
    public final InterfaceC1738600vLO LLJJ;
    public final C10J3 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19224310Iv.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19224310Iv.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIJI = 8;
    }

    public final C19EG O4() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJJIII[1]);
    }

    public final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJJIII[0]);
    }

    public final String getEnterFrom() {
        return (String) this.LLJI.getValue();
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        this.LLJ = !T2().LJII;
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJILLL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJ;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJJI;
    }

    public C19224710Iz K4() {
        return this.LLJILLL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJILJILJ;
    }

    public final void T4(boolean z) {
        Map<String, String> mapLIZ = C1403740mdI.LIZ(P4(), getEnterFrom());
        if (!z) {
            C20684815ws.LJIILLIIL("turn_off_mature_themes", mapLIZ);
        }
        P4().getCreativeFlowData().getPublishConfig().setMatureTheme(z ? 1 : 0);
        this.LLJ = !z;
        i3(new AwS40S0010000_28(z, 18));
    }

    public C19224310Iv(C1DRG c1drg, C10J3 c10j3) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(c10j3, 555));
        this.LLJILJIL = C1703840uRK.LIZIZ.LIZJ();
        this.LLJILJILJ = new AwS429S0200000_28(this, c10j3, 58);
        this.LLJILLL = new C19224710Iz(null, new AwS572S0100000_28(this, 554), new C19332510kF(this, 10), new AwS607S0100000_28(this, 152), 1);
        this.LLJJ = EnumC214771193h.MATURE_THEME;
        this.LLJJI = c10j3;
    }
}
