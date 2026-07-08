package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import ge.i;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yHI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851380yHI extends i<InterfaceC1851740yHs, C1851480yHS, C1851430yHN, C1851470yHR> implements InterfaceC379610EuV, InterfaceC1851740yHs {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final Function0<C1851430yHN> LLJJJ;
    public final Function0<C1851470yHR> LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1851380yHI.class, "aiPlaygroundHeaderApi", "getAiPlaygroundHeaderApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundHeaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1851380yHI.class, "aiPlaygroundPromptApi", "getAiPlaygroundPromptApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundPromptApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1851380yHI.class, "aiPlaygroundLogicApi", "getAiPlaygroundLogicApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/logic/AIPlaygroundLogicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1851380yHI.class, "aiPlaygroundLoadingApi", "getAiPlaygroundLoadingApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundLoadingApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1851380yHI.class, "aiPlaygroundUploadApi", "getAiPlaygroundUploadApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundUploadApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1851380yHI.class, "aiPlaygroundSettingsApi", "getAiPlaygroundSettingsApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundSettingsApi;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJJJJJIL = 8;
    }

    private final InterfaceC1851410yHL F4() {
        return (InterfaceC1851410yHL) this.LLJJ.getValue(this, LLJJJJ[0]);
    }

    private final InterfaceC560800Lz4 H4() {
        return (InterfaceC560800Lz4) this.LLJJIJI.getValue(this, LLJJJJ[3]);
    }

    private final InterfaceC560620Lym K4() {
        return (InterfaceC560620Lym) this.LLJJIII.getValue(this, LLJJJJ[2]);
    }

    private final InterfaceC1851400yHK O4() {
        return (InterfaceC1851400yHK) this.LLJJI.getValue(this, LLJJJJ[1]);
    }

    private final InterfaceC1851450yHP P4() {
        return (InterfaceC1851450yHP) this.LLJJIJIL.getValue(this, LLJJJJ[5]);
    }

    private final InterfaceC1851500yHU T4() {
        return (InterfaceC1851500yHU) this.LLJJIJIIJIL.getValue(this, LLJJJJ[4]);
    }

    @Override // X.InterfaceC1851740yHs
    public boolean LJIJ() {
        InterfaceC1851400yHK interfaceC1851400yHKO4;
        String strYQ;
        List<UploadImageParam> listDo1;
        InterfaceC1851400yHK interfaceC1851400yHKO42 = O4();
        if (interfaceC1851400yHKO42 != null && interfaceC1851400yHKO42.LJJIL()) {
            return true;
        }
        InterfaceC1851500yHU interfaceC1851500yHUT4 = T4();
        if ((interfaceC1851500yHUT4 == null || (listDo1 = interfaceC1851500yHUT4.Do1()) == null || !(!listDo1.isEmpty())) && ((interfaceC1851400yHKO4 = O4()) == null || (strYQ = interfaceC1851400yHKO4.yQ()) == null || strYQ.length() <= 0)) {
            i3(AFwS269S0000000_27.get$arr$(38));
            return true;
        }
        i3(AFwS269S0000000_27.get$arr$(37));
        return true;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1851430yHN> o2() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1851470yHR> w2() {
        return this.LLJJJIL;
    }

    public C1851380yHI(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851410yHL.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851400yHK.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC560620Lym.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC560800Lz4.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851500yHU.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851450yHP.class, null);
        this.LLJJJ = AFwS216S0000000_27.get$arr$(86);
        this.LLJJJIL = new AwS571S0100000_27(this, 209);
    }
}
