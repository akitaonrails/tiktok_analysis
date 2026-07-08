package X;

import Y.AObserverS229S0100000_27;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yHE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851340yHE extends i<InterfaceC1851410yHL, C1851250yH5, C1851220yH2, C1851260yH6> implements InterfaceC379610EuV, InterfaceC1851410yHL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final Function0<C1851220yH2> LLJJIII;
    public final Function0<C1851260yH6> LLJJIJI;
    public final MutableLiveData<AIGenerationType> LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1851340yHE.class, "aiPlaygroundPromptApi", "getAiPlaygroundPromptApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundPromptApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1851340yHE.class, "aiPlaygroundGenerateApi", "getAiPlaygroundGenerateApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundGenerateApi;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJJ = 8;
    }

    private final InterfaceC1851490yHT F4() {
        return (InterfaceC1851490yHT) this.LLJJI.getValue(this, LLJJIJIL[1]);
    }

    private final InterfaceC1851400yHK H4() {
        return (InterfaceC1851400yHK) this.LLJJ.getValue(this, LLJJIJIL[0]);
    }

    @Override // X.InterfaceC1851410yHL
    public AIGenerationType kY1() {
        return T2().LIZ;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        MutableLiveData<C1838890xx9> mutableLiveDataOP2;
        super.onCreate();
        InterfaceC1851400yHK interfaceC1851400yHKH4 = H4();
        if (interfaceC1851400yHKH4 == null || (mutableLiveDataOP2 = interfaceC1851400yHKH4.oP2()) == null) {
            return;
        }
        mutableLiveDataOP2.observe(this, new AObserverS229S0100000_27(this, 22));
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1851410yHL
    public MutableLiveData<AIGenerationType> iI1() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1851220yH2> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1851260yH6> w2() {
        return this.LLJJIJI;
    }

    public final void O4(AIGenerationType aIGenerationType) {
        if (T2().LIZ != aIGenerationType) {
            i3(new AwS606S0100000_27(aIGenerationType, 79));
            iI1().setValue(aIGenerationType);
        }
    }

    @Override // X.InterfaceC1851410yHL
    public void VV(AIGenerationType aIGenerationType) {
        O4(aIGenerationType);
    }

    @Override // X.InterfaceC1851410yHL
    public void s4(boolean z) {
        i3(new AwS39S0010000_27(z, 7));
    }

    public C1851340yHE(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851400yHK.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851490yHT.class, null);
        this.LLJJIII = AFwS216S0000000_27.get$arr$(89);
        this.LLJJIJI = new AwS571S0100000_27(this, 212);
        this.LLJJIJIIJIL = new MutableLiveData<>();
    }

    public final void K4(String str, boolean z, String str2) {
        if (!z) {
            InterfaceC1851490yHT interfaceC1851490yHTF4 = F4();
            if (interfaceC1851490yHTF4 != null) {
                interfaceC1851490yHTF4.cS0(str);
                return;
            }
            return;
        }
        InterfaceC1851490yHT interfaceC1851490yHTF42 = F4();
        if (interfaceC1851490yHTF42 == null) {
            return;
        }
        interfaceC1851490yHTF42.io2(str, str2);
    }
}
