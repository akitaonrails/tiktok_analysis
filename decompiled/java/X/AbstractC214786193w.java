package X;

import android.os.IBinder;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.193w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC214786193w extends AbstractC2255721DQs<InterfaceC214732191u> implements InterfaceC214732191u, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public C214799194j LLIZLLLIL;
    public InterfaceC214787193x LLJ;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), C193M.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishViewModel.class, null);
    public final MutableLiveData<Lifecycle.Event> LLIZ = new MutableLiveData<>();
    public final InterfaceC214732191u LLJI = this;
    public final String LLJIJIL = "CombineMoreOptionsPanelComponent";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC214786193w.class, "publishOptionsManagerApi", "getPublishOptionsManagerApi()Lcom/ss/android/ugc/aweme/shortvideo/component/option/manager/PublishOptionsManagerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC214786193w.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AbstractC214786193w.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(AbstractC214786193w.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(AbstractC214786193w.class, "publishViewModel", "getPublishViewModel()Lcom/ss/android/ugc/aweme/shortvideo/ui/viewmodel/VideoPublishViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJILJILJ = 8;
    }

    public abstract List<C19223110Ij> W1();

    public Boolean c3() {
        return null;
    }

    public abstract void i3();

    private final VideoPublishViewModel T2() {
        return (VideoPublishViewModel) this.LLILZLL.getValue(this, LLJILJIL[4]);
    }

    private final AbstractC214814194y W2() {
        return (AbstractC214814194y) this.LLILZIL.getValue(this, LLJILJIL[3]);
    }

    private final C19EG o2() {
        return (C19EG) this.LLILZ.getValue(this, LLJILJIL[2]);
    }

    private final VideoPublishEditModel w2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJILJIL[1]);
    }

    public final C193M G2() {
        return (C193M) this.LLILLJJLI.getValue(this, LLJILJIL[0]);
    }

    @Override // X.InterfaceC214732191u
    public void LIZ() {
        if (this.LLJ == null) {
            T2().LLILZIL = W1();
            C19721512Eb c19721512Eb = C19721512Eb.LIZ;
            boolean z = w2().creativeModel.transientPostPageModel.LJJIIZI;
            VideoPublishEditModel videoPublishEditModelW2 = w2();
            VideoPublishViewModel videoPublishViewModelT2 = T2();
            CommerceToolsTcmModel tcmModel = w2().creativeModel.commerceModel.getTcmModel();
            C193M c193mG2 = G2();
            Boolean boolC3 = c3();
            c19721512Eb.getClass();
            this.LLJ = C19721512Eb.LIZ(z, videoPublishEditModelW2, videoPublishViewModelT2, tcmModel, c193mG2, null, boolC3);
        }
        if (this.LLIZLLLIL == null) {
            C19721512Eb c19721512Eb2 = C19721512Eb.LIZ;
            C19EG c19egO2 = o2();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 278);
            AwS576S0100000_32 awS576S0100000_322 = new AwS576S0100000_32(this, 279);
            AwS576S0100000_32 awS576S0100000_323 = new AwS576S0100000_32(this, 280);
            AwS576S0100000_32 awS576S0100000_324 = new AwS576S0100000_32(this, 281);
            c19721512Eb2.getClass();
            C18YA c18ya = new C18YA();
            c18ya.LIZ(awS576S0100000_32);
            c18ya.LIZIZ(EnumC214804194o.FIXED);
            int iLJIIIIZZ = (int) (C12ES.LJIIIIZZ(c19egO2) * 0.7f);
            C214799194j c214799194j = c18ya.LIZ;
            c214799194j.LLJJIJIL = iLJIIIIZZ;
            c214799194j.LLL = 100;
            c214799194j.LLLII = true;
            c214799194j.LLLI = false;
            c214799194j.LLJJJJJIL = true;
            c214799194j.LLJLLIL = awS576S0100000_323;
            c18ya.LIZ.LLJZ = new AwS576S0100000_32(awS576S0100000_322, 283);
            c18ya.LIZ.LLJLLL = new AwS576S0100000_32(awS576S0100000_324, 284);
            if (C10BZ.LIZ()) {
                C1546210qL5.LIZ.getClass();
                c18ya.LIZ.LLLIZZ = Float.valueOf(C1546210qL5.LIZ(26));
                c18ya.LIZ.LLLILZLLLI = Boolean.TRUE;
            }
            this.LLIZLLLIL = c18ya.LIZ;
        }
        X1(Lifecycle.Event.ON_CREATE);
        q3(C1447800nmM.LIZIZ(W2()));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        i3();
    }

    public final InterfaceC214787193x H2() {
        return this.LLJ;
    }

    public InterfaceC214732191u Z1() {
        return this.LLJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJI;
    }

    @Override // X.AbstractC2255721DQs
    public String getComponentName() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public AbstractC214786193w(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void q3(NavigationScene navigationScene) {
        IBinder windowToken;
        C214799194j c214799194j = this.LLIZLLLIL;
        if (c214799194j != null) {
            c214799194j.LLLLL(W2());
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.J2(o2(), "input_method");
        View view = W2().mView;
        if (view != null) {
            windowToken = view.getWindowToken();
        } else {
            windowToken = null;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 2);
        View currentFocus = o2().getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        InterfaceC214787193x interfaceC214787193x = this.LLJ;
        if (interfaceC214787193x != null) {
            interfaceC214787193x.LJJLJLI(navigationScene);
        }
    }

    public final void X1(Lifecycle.Event event) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LLIZ.setValue(event);
        } else {
            this.LLIZ.postValue(event);
        }
    }

    public final void m3(InterfaceC214787193x interfaceC214787193x) {
        this.LLJ = interfaceC214787193x;
    }

    @Override // X.InterfaceC214732191u
    public void LLLLZLLLI(LifecycleOwner lifecycleOwner, Function1<? super Lifecycle.Event, Unit> function1) {
        this.LLIZ.observe(lifecycleOwner, new C1405260mfk(function1));
    }
}
