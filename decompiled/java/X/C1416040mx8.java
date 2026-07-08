package X;

import Y.AObjectS245S0100000_22;
import Y.AObjectS305S0200000_22;
import Y.ARunnableS122S0100000_22;
import android.view.ViewGroup;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import nv7.c0;

/* JADX INFO: renamed from: X.0mx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416040mx8 extends AbstractC2255721DQs<C0EQY> implements InterfaceC379610EuV, C0EQY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 199));
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public boolean LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1416040mx8.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1416040mx8.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJ = 8;
    }

    public C0EQY X1() {
        return this;
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLIZLLLIL[0]);
    }

    public final InterfaceC377540ErA Z1() {
        return (InterfaceC377540ErA) this.LLILZLL.getValue(this, LLIZLLLIL[1]);
    }

    public final C1414390muT o2() {
        return (C1414390muT) this.LLILZ.getValue();
    }

    private final void W1() {
        C385670FAf<Boolean> c385670FAfLLL;
        InterfaceC377540ErA interfaceC377540ErAZ1 = Z1();
        if (interfaceC377540ErAZ1 != null && (c385670FAfLLL = interfaceC377540ErAZ1.LLL()) != null) {
            c385670FAfLLL.LIZ(this, new AObjectS245S0100000_22(this, 39));
        }
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS601S0100000_22(this, 132));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILLJJLI.add(this.LLILLL, o2(), "Video2ImageSwitcherWithoutMixEditingScene");
        this.LLILLJJLI.show(o2());
        W1();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent && C0MSC.LIZ(getEditModel())) {
            LifecycleOwnerExtensionsKt.LIZIZ(this, 16L, new ARunnableS122S0100000_22(this, 26));
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C0EQY
    public void Bd(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent && this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        if (c1660590tJZ == null) {
            return;
        }
        int iLIZIZ = c1660590tJZ.LIZIZ() + C1660590tJZ.LJFF();
        C1414390muT c1414390muTO2 = o2();
        C370670Eg5 c370670Eg5 = c1414390muTO2.LLJILJIL;
        ViewGroup.LayoutParams layoutParams = null;
        if (c370670Eg5 != null) {
            layoutParams = c370670Eg5.getLayoutParams();
        }
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            C1414130mu3.LLLLZLLIL.getClass();
            marginLayoutParams.bottomMargin = iLIZIZ + C1414130mu3.LLLZ;
            C370670Eg5 c370670Eg52 = c1414390muTO2.LLJILJIL;
            if (c370670Eg52 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c370670Eg52);
                c370670Eg52.setLayoutParams(marginLayoutParams);
            }
        }
        C370670Eg5 c370670Eg53 = c1414390muTO2.LLJILJIL;
        if (c370670Eg53 != null) {
            C337180DJs.LIZJ(c370670Eg53);
        }
    }

    @Override // X.C0EQY
    public void be(boolean z) {
        if (z) {
            this.LLILLJJLI.show(o2());
        } else {
            this.LLILLJJLI.hide(o2());
        }
    }

    public final void w2(InterfaceC1460000o62 interfaceC1460000o62) {
        interfaceC1460000o62.Py1().observe(this, new AObjectS245S0100000_22(this, 40));
        interfaceC1460000o62.ww().observe(this, new AObjectS305S0200000_22(interfaceC1460000o62, this, 3));
    }

    public C1416040mx8(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }
}
