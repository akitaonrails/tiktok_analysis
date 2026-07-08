package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0EPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364040EPa extends C0ETX<InterfaceC364150EPl, C361240EEg, C361340EEq, C361300EEm> implements InterfaceC364150EPl {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final int LLJLLL;
    public final C19EG LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final int LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final C01GW LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C364040EPa.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/effects/videoeffect/ui/EPVideoEffectPanelContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C364040EPa.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C364040EPa.class, "searchPanelApi", "getSearchPanelApi()Lcom/ss/android/ugc/aweme/editeffect/search/EditEffectSearchPanelApi;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJLLL = 8;
    }

    public InterfaceC364150EPl E5() {
        return this;
    }

    @Override // X.C0ETX
    public void n5() {
    }

    private final InterfaceC1426280nDe R5() {
        return (InterfaceC1426280nDe) this.LLJLILLLLZIIL.getValue(this, LLJLLIL[2]);
    }

    @Override // ge.i
    public Function0<C361240EEg> E3() {
        return new AwS549S0100000_5(this, 518);
    }

    public final C113G M5() {
        return (C113G) this.LLJLL.getValue();
    }

    public final C360020E9o N5() {
        return (C360020E9o) this.LLJL.getValue(this, LLJLLIL[0]);
    }

    public final C0E5S S5() {
        return (C0E5S) this.LLJLIL.getValue(this, LLJLLIL[1]);
    }

    public final C361240EEg U5() {
        return (C361240EEg) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C361340EEq> o2() {
        return new AwS549S0100000_5(this, 515);
    }

    @Override // X.InterfaceC364150EPl
    public boolean onBackPressed() {
        i3(AFwS234S0000000_5.get$arr$(210));
        return true;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C361300EEm> w2() {
        return new AwS549S0100000_5(this, 517);
    }

    @Override // X.InterfaceC364150EPl
    public C113G Id2() {
        return M5();
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC357900E1k interfaceC357900E1kH4 = H4();
        if (interfaceC357900E1kH4 != null) {
            interfaceC357900E1kH4.qc1(true);
        }
        InterfaceC1426280nDe interfaceC1426280nDeR5 = R5();
        if (interfaceC1426280nDeR5 != null) {
            interfaceC1426280nDeR5.Eb(new InterfaceC1426650nEF() { // from class: X.0EPq
                @Override // X.InterfaceC1426650nEF
                public final boolean LIZJ(EffectModel effectModel) {
                    this.LIZ.i3(new AwS584S0100000_5(effectModel, 424));
                    return true;
                }

                @Override // X.InterfaceC1426650nEF
                public final boolean LIZLLL(EffectModel effectModel, int i, boolean z) {
                    this.LIZ.i3(new AwS584S0100000_5(effectModel, 423));
                    return true;
                }

                @Override // X.InterfaceC1426650nEF
                public final boolean LJ(EffectModel effectModel, int i, String str, boolean z, String str2, String str3) {
                    String str4;
                    if (this.LIZ.T2().LIZ.LJJIIZI) {
                        str4 = "editor_pro_panel";
                    } else {
                        str4 = "edit_page_panel";
                    }
                    this.LIZ.i3(new AwS371S0200000_5(effectModel, new EffectSearchModel(str4, "editing_effect", str2, str3, effectModel.resourceId, String.valueOf(i), str, Boolean.valueOf(z), Boolean.TRUE, Boolean.FALSE, null), 86));
                    return true;
                }
            });
        }
        InterfaceC1426280nDe interfaceC1426280nDeR52 = R5();
        if (interfaceC1426280nDeR52 != null) {
            interfaceC1426280nDeR52.VB(new AwS619S0100000_5(this, 13));
        }
    }

    public final void u6() {
        InterfaceC1426280nDe interfaceC1426280nDeR5 = R5();
        if (interfaceC1426280nDeR5 != null) {
            interfaceC1426280nDeR5.LIZ();
        }
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        E5();
        return this;
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r6.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.ss.android.ugc.aweme.effect.EffectModel> m6(java.util.List<com.ss.android.ugc.aweme.effect.EffectModel> r8) {
        /*
            r7 = this;
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r8.iterator()
        L9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.effect.EffectModel r4 = (com.ss.android.ugc.aweme.effect.EffectModel) r4
            java.util.Iterator r3 = r6.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.effect.EffectModel r0 = (com.ss.android.ugc.aweme.effect.EffectModel) r0
            java.lang.String r1 = r0.key
            java.lang.String r0 = r4.key
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L19
            if (r2 != 0) goto L9
        L32:
            r6.add(r4)
            goto L9
        L36:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364040EPa.m6(java.util.List):java.util.List");
    }

    @Override // X.InterfaceC364150EPl
    public void ET0(boolean z) {
        i3(new AwS20S0010000_5(z, 20));
    }

    public final void d6(String str) {
        InterfaceC1426280nDe interfaceC1426280nDeR5 = R5();
        if (interfaceC1426280nDeR5 != null) {
            if (str == null) {
                str = "";
            }
            interfaceC1426280nDeR5.IH(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0EPa, X.0ETX, X.0ETZ] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.effect.EffectModel> H5(int r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364040EPa.H5(int, java.lang.String):java.util.List");
    }

    public C364040EPa(C19A3 c19a3, C19EG c19eg, C1DRG c1drg, int i) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = c19eg;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = i;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 519));
        this.LLJL = C1664770tQJ.LIZ(getDiContainer(), C360020E9o.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1426280nDe.class, null);
        this.LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 516));
    }
}
