package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.AIDubbing;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS118S0110000_32;
import kotlin.jvm.internal.AwS44S0010000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.1920, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1920 extends C193N<InterfaceC856270XiT, C190Z, C19224710Iz> implements InterfaceC856270XiT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final MutableLiveData<Boolean> LLJIJIL;
    public final LiveData<Boolean> LLJILJIL;
    public final Function0<C190Z> LLJILJILJ;
    public final C19224710Iz LLJILLL;
    public final InterfaceC1738600vLO LLJJ;
    public final C10J3 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1920.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1920.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AnonymousClass1920.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/publish/OnAddAnchorListenerReceiver;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(AnonymousClass1920.class, "moreOptionApiComponent", "getMoreOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/option/more/MoreOptionApiComponent;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    private final C190Y Z4() {
        return (C190Y) this.LLJ.getValue(this, LLJJIII[2]);
    }

    public final C19EG O4() {
        return (C19EG) this.LLIZ.getValue(this, LLJJIII[0]);
    }

    public final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJIII[1]);
    }

    @Override // X.InterfaceC856270XiT
    public boolean RM1() {
        Boolean value = this.LLJIJIL.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return false;
    }

    public final InterfaceC855180Xgi T4() {
        return (InterfaceC855180Xgi) this.LLJI.getValue(this, LLJJIII[3]);
    }

    private final void n5() {
        if (C1420670n4b.LJIIJJI(P4()) && P4().creativeModel.aiDubbing == null) {
            C1420670n4b.LJIILL(P4(), null, true);
        }
        boolean zLIZIZ = C1420670n4b.LIZIZ(P4());
        this.LLJIJIL.setValue(Boolean.valueOf(zLIZIZ));
        i3(new AwS44S0010000_32(zLIZIZ, 1));
        t5();
    }

    private final void t5() {
        Z4().registerOnAddAnchorListener(new AwS576S0100000_32(this, 168));
    }

    @Override // X.InterfaceC856270XiT
    public void O1() {
        AIDubbing aIDubbing;
        boolean zLIZIZ = C1420670n4b.LIZIZ(P4());
        if (zLIZIZ && ((aIDubbing = P4().creativeModel.aiDubbing) == null || aIDubbing.getEnableVideoAIDubbing() == null)) {
            C1420670n4b.LJIILL(P4(), null, true);
        }
        this.LLJIJIL.setValue(Boolean.valueOf(zLIZIZ));
        i3(new AwS118S0110000_32(this, zLIZIZ, 0));
    }

    public final void d5() {
        String strLJI = C1420670n4b.LJI(O4(), P4());
        if (strLJI != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(O4());
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJ(strLJI);
            c1389890mGx.LJIIJJI();
        }
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

    @Override // X.C193N, X.C193O
    public void Q3() {
        n5();
    }

    @Override // X.InterfaceC856270XiT
    public LiveData<Boolean> dI() {
        return this.LLJILJIL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJILJILJ;
    }

    public AnonymousClass1920(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C190Y.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC855180Xgi.class, null);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.LLJIJIL = mutableLiveData;
        this.LLJILJIL = mutableLiveData;
        this.LLJILJILJ = new AwS576S0100000_32(this, 167);
        this.LLJILLL = new C19224710Iz(new AwS576S0100000_32(this, 166), null, new C19LY(this, 0), new AwS611S0100000_32(this, 64), 2);
        this.LLJJ = EnumC214771193h.AI_DUBBING;
        this.LLJJI = AnonymousClass1937.LIZ;
    }

    public final void k5(boolean z) {
        boolean zRM1 = RM1();
        C1420670n4b.LJIILL(P4(), null, z);
        this.LLJIJIL.setValue(Boolean.valueOf(z));
        i3(new AwS44S0010000_32(z, 0));
        v5(zRM1, z);
    }

    @Override // X.InterfaceC856270XiT
    public void xL0(boolean z) {
        this.LLJIJIL.setValue(Boolean.valueOf(z));
        C1420670n4b.LJIILL(P4(), null, z);
        i3(new AwS118S0110000_32(this, z, 1));
    }

    private final void v5(boolean z, boolean z2) {
        String str;
        if (!z) {
            if (z2) {
                str = "creator_auth_on";
            } else {
                return;
            }
        } else if (z2) {
            return;
        } else {
            str = "creator_auth_off";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", P4().getEnterFrom());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(P4()));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(P4()));
        c0lab.LJ("action_type", str);
        C20684815ws.LJIILLIIL("ai_dubbing_toggle", c0lab.LIZ);
    }
}
