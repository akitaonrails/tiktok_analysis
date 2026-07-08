package X;

import Y.AObjectS240S0100000_5;
import android.content.Context;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS18S1201000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS5S0410000_5;
import kotlin.jvm.internal.AwS91S0201000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Ezj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382850Ezj extends C0ETZ<InterfaceC379180Eto, C0F11, C382840Ezi, C0F0B> implements InterfaceC379180Eto {
    public static final C382940Ezs LLJJJJLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C376260Ep6 LLJJI;
    public final C1DRG LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final Function0<C0F11> LLJJJIL;
    public final Function0<C382840Ezi> LLJJJJ;
    public final Function0<C0F0B> LLJJJJJIL;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Ezs] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C382850Ezj.class, "modelSelectionApi", "getModelSelectionApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/modelselect/EPAIGCModelSelectApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C382850Ezj.class, "styleSelectionApi", "getStyleSelectionApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/styleselect/EPAIGCStyleSelectApiComponent;", 0), new C2217381BqS(C382850Ezj.class, "editTextApi", "getEditTextApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/edittext/EPAIGCEditTextApiComponent;", 0), new C2217381BqS(C382850Ezj.class, "promptRewriteSelectionApi", "getPromptRewriteSelectionApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/promptrephraser/EPAICreatePromptRephraserApiComponent;", 0)};
        LLJJJJLIIL = new Object() { // from class: X.0Ezs
        };
        LLJJLIIIJLLLLLLLZ = 8;
    }

    public final InterfaceC379090Etf H4() {
        return (InterfaceC379090Etf) this.LLJJIJIL.getValue(this, LLJJL[2]);
    }

    public final InterfaceC379250Etv K4() {
        return (InterfaceC379250Etv) this.LLJJIJI.getValue(this, LLJJL[0]);
    }

    public final InterfaceC379280Ety P4() {
        return (InterfaceC379280Ety) this.LLJJJ.getValue(this, LLJJL[3]);
    }

    public final InterfaceC376280Ep8 T4() {
        return (InterfaceC376280Ep8) this.LLJJIJIIJIL.getValue(this, LLJJL[1]);
    }

    @Override // X.InterfaceC379180Eto
    public int B40() {
        return T2().LIZJ.getValue();
    }

    @Override // X.InterfaceC379180Eto
    public String BV() {
        return T2().LJJI;
    }

    @Override // X.InterfaceC379180Eto
    public EnumC378720Et4 N7() {
        return T2().LIZ;
    }

    @Override // X.InterfaceC379180Eto
    public int WO0() {
        Integer num = T2().LJJIFFI;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void Z4() {
        K4().XN1(true);
    }

    public final void d5() {
        P4().cF(true);
    }

    public final void k5() {
        T4().AE(true);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        T4().rl0().LIZ(this, new AObjectS240S0100000_5(this, 48));
        P4().YX().LIZ(this, new AObjectS240S0100000_5(this, 49));
    }

    @Override // X.InterfaceC379180Eto
    public Pair<String, String> qM2() {
        return new Pair<>(T2().LIZLLL, T2().LJ);
    }

    public final void v5() {
        int i;
        String string;
        String string2;
        Integer num = T2().LJIJJLI;
        String str = "";
        if (num != null) {
            InterfaceC379090Etf interfaceC379090EtfH4 = H4();
            Context sceneContext = this.LLJJI.getSceneContext();
            if (sceneContext != null && (string2 = sceneContext.getString(num.intValue())) != null) {
                str = string2;
            }
            interfaceC379090EtfH4.Xk1(str);
            return;
        }
        EnumC378720Et4 enumC378720Et4 = T2().LIZ;
        int i2 = T2().LJIILL;
        int i3 = C379480EuI.LIZ[enumC378720Et4.ordinal()];
        if (i3 != 1) {
            i = 2131825456;
            if (i3 == 2) {
                if (i2 == 1) {
                    i = 2131834192;
                } else if (i2 == 2) {
                    i = 2131834191;
                }
            }
        } else {
            i = i2 == 0 ? 2131825455 : 2131825368;
        }
        InterfaceC379090Etf interfaceC379090EtfH42 = H4();
        Context sceneContext2 = this.LLJJI.getSceneContext();
        if (sceneContext2 != null && (string = sceneContext2.getString(i)) != null) {
            str = string;
        }
        interfaceC379090EtfH42.Xk1(str);
    }

    @Override // ge.i
    public Function0<C0F11> E3() {
        return this.LLJJJIL;
    }

    public final C376260Ep6 O4() {
        return this.LLJJI;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C382840Ezi> o2() {
        return this.LLJJJJ;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0F0B> w2() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC379180Eto
    public void xD1() {
        hide();
    }

    @Override // X.InterfaceC379180Eto
    public void Af0(boolean z) {
        i3(new AwS20S0010000_5(z, 4));
    }

    public final void C5(int i) {
        Integer numValueOf;
        Integer num = (Integer) C13LP.LJJJLZIJ(i, T2().LJJ);
        if (num != null) {
            numValueOf = Integer.valueOf(num.intValue() * LSPassThroughRecordSizeConfig.DEFAULT);
        } else {
            numValueOf = null;
        }
        i3(new AwS91S0201000_5(i, numValueOf, this, 2));
    }

    @Override // X.InterfaceC379180Eto
    public void Ct1(boolean z) {
        i3(new AwS20S0010000_5(z, 6));
    }

    @Override // X.InterfaceC379180Eto
    public void Dw0(boolean z) {
        i3(new AwS20S0010000_5(z, 7));
    }

    @Override // X.InterfaceC379180Eto
    public void KI(Integer num) {
        i3(new AwS584S0100000_5(num, 219));
        v5();
    }

    @Override // X.InterfaceC379180Eto
    public void of(boolean z) {
        i3(new AwS20S0010000_5(z, 8));
        if (z) {
            show();
        } else {
            hide();
        }
    }

    @Override // X.InterfaceC379180Eto
    public void rv2(EnumC382880Ezm enumC382880Ezm) {
        i3(new AwS584S0100000_5(enumC382880Ezm, 220));
    }

    @Override // X.InterfaceC379180Eto
    public void sY1(boolean z) {
        i3(new AwS20S0010000_5(z, 5));
    }

    public final void x5(int i) {
        String string;
        String str = (String) C13LP.LJJJLZIJ(i, T2().LJIL);
        String str2 = null;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            str2 = string;
        }
        i3(new AwS18S1201000_5(i, str2, this, T2().LIZ, 0));
    }

    @Override // X.InterfaceC379180Eto
    public void zy(C378970EtT c378970EtT) {
        boolean z;
        C378940EtQ c378940EtQ = c378970EtT.LIZJ;
        EnumC378720Et4 enumC378720Et4 = T2().LIZ;
        EnumC378720Et4 enumC378720Et42 = c378970EtT.LIZIZ;
        if (enumC378720Et4 != enumC378720Et42 && enumC378720Et4 != EnumC378720Et4.NONE) {
            z = true;
        } else {
            z = false;
        }
        i3(new AwS5S0410000_5(z, enumC378720Et4, enumC378720Et42, c378970EtT, c378940EtQ, 1));
        n5(c378940EtQ.LJII, c378940EtQ.LJIIIIZZ);
    }

    public C382850Ezj(C376260Ep6 c376260Ep6, C1DRG c1drg) {
        super(c376260Ep6, c1drg);
        this.LLJJI = c376260Ep6;
        this.LLJJIII = c1drg;
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379250Etv.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC376280Ep8.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379090Etf.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379280Ety.class, null);
        this.LLJJJIL = AFwS191S0000000_5.get$arr$(87);
        this.LLJJJJ = AFwS191S0000000_5.get$arr$(86);
        this.LLJJJJJIL = new AwS549S0100000_5(this, 201);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n5(boolean r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382850Ezj.n5(boolean, java.lang.String):void");
    }

    @Override // X.InterfaceC379180Eto
    public void os2(String str, String str2, String str3, Integer num) {
        i3(new C382870Ezl(str, this, str2, str3, num));
    }
}
