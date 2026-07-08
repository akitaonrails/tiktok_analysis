package X;

import Y.AObjectS246S0100000_25;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionListHandler;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionSceneViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642180sps extends AbstractC1643610ssB<OptionSceneViewModel> implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final int LLJ;
    public final C1664750tQH LLJI;
    public final C1664750tQH LLJIJIL;
    public final C1642430sqH LLJILJIL;
    public final AwS569S0100000_25 LLJILJILJ = new AwS569S0100000_25(this, 58);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1642180sps.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1642180sps.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC1643600ssA
    public final void o2() {
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        if (!C297310Bl3.LIZ()) {
            ((InterfaceC1625000sOA) this.LLJIJIL.getValue(this, LLJILLL[1])).sk(new OptionListHandler(this, this.LLIZ));
        }
        C1664750tQH c1664750tQH = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        ((InterfaceC1648570t0B) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0])).cJ0().LIZ(this, new AObjectS246S0100000_25(this, 1));
        ((InterfaceC1648570t0B) this.LLJI.getValue(this, interfaceC2217461BqaArr[0])).xM2().LIZ(this, new AObjectS246S0100000_25(this, 2));
        if (this.LLIZLLLIL.isAdded(this.LLJILJIL)) {
            return;
        }
        this.LLIZLLLIL.add(this.LLJ, this.LLJILJIL, "OptionPanelScene");
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<OptionSceneViewModel> W1() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C1642180sps(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
        this.LLJ = i;
        this.LLJI = C1664770tQJ.LIZ(c1drg, e0.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1625000sOA.class, null);
        this.LLJILJIL = new C1642430sqH(c1drg);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }
}
