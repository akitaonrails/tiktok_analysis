package X;

import Y.AObserverS209S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS6S0002000_5;
import kotlin.jvm.internal.AwS93S0110000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZJ extends C0ETZ<InterfaceC362600EJm, C0EZS, C0EZP, C0EZM> implements InterfaceC362600EJm {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final int LLJLL;
    public final C372500Ej2 LLJJI;
    public final Function0<Unit> LLJJIII;
    public final C1DRG LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public boolean LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final Function0<C0EZS> LLJL;
    public final C385670FAf<Boolean> LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EZJ.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EZJ.class, "previewApi", "getPreviewApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EZJ.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EZJ.class, "generatingApi", "getGeneratingApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/i2v/I2vTrackGeneratingApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0EZJ.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0EZJ.class, "bottomBarApiComponent", "getBottomBarApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0EZJ.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0EZJ.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLJLL = 8;
    }

    private final C0EGY H4() {
        return (C0EGY) this.LLJJJJLIIL.getValue(this, LLJLILLLLZIIL[5]);
    }

    public final InterfaceC360800ECo K4() {
        return (InterfaceC360800ECo) this.LLJJIJIIJIL.getValue(this, LLJLILLLLZIIL[0]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJL.getValue(this, LLJLILLLLZIIL[6]);
    }

    public final C0EOK O4() {
        return (C0EOK) this.LLJJJ.getValue(this, LLJLILLLLZIIL[2]);
    }

    public final C0EY2 P4() {
        return (C0EY2) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLILLLLZIIL[7]);
    }

    public final InterfaceC363160ELq T4() {
        return (InterfaceC363160ELq) this.LLJJJIL.getValue(this, LLJLILLLLZIIL[3]);
    }

    public final InterfaceC361710EGb Z4() {
        return (InterfaceC361710EGb) this.LLJJIJIL.getValue(this, LLJLILLLLZIIL[1]);
    }

    public final InterfaceC361710EGb d5() {
        return (InterfaceC361710EGb) this.LLJJJJ.getValue(this, LLJLILLLLZIIL[4]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EZP> o2() {
        return AFwS191S0000000_5.get$arr$(235);
    }

    @Override // X.InterfaceC362600EJm
    public void t61() {
        if (this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = true;
        i3(AFwS234S0000000_5.get$arr$(341));
        n5(0);
        InterfaceC359940E9g interfaceC359940E9gAZ0 = H4().AZ0();
        if (interfaceC359940E9gAZ0 != null) {
            interfaceC359940E9gAZ0.LIZ(true);
        }
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EZM> w2() {
        return new AwS549S0100000_5(this, 798);
    }

    public final void k5() {
        InterfaceC372610EjD interfaceC372610EjD = (InterfaceC372610EjD) getDiContainer().LJIIL(null, InterfaceC372610EjD.class);
        if (interfaceC372610EjD != null) {
            interfaceC372610EjD.ol();
        }
    }

    @Override // X.InterfaceC362600EJm
    public boolean onBackPressed() {
        if (!Intrinsics.LJFF(T2().LIZ, Boolean.TRUE)) {
            return false;
        }
        t61();
        if (!C293800BfO.LIZ()) {
            return true;
        }
        C361680EFy.LJJJZ(LJJJLIIL(), "click_system_exit", C1428470nHB.LJIILL(LJJJLIIL()));
        return true;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        C0E55 player;
        MutableLiveData mutableLiveDataLIZLLL;
        LiveState<Long> liveStateJq;
        super.onCreate();
        InterfaceC360800ECo interfaceC360800ECoK4 = K4();
        if (interfaceC360800ECoK4 != null && (liveStateJq = interfaceC360800ECoK4.jq()) != null) {
            liveStateJq.LJIIIZ(this, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 715));
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (player = c0e48F4.getPlayer()) == null || (mutableLiveDataLIZLLL = player.LIZLLL()) == null) {
            return;
        }
        mutableLiveDataLIZLLL.observe(this, new AObserverS209S0100000_5(this, 89));
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        i3(new AwS584S0100000_5(this, 716));
    }

    @Override // X.InterfaceC362600EJm
    public C385670FAf<Boolean> BK0() {
        return this.LLJLIL;
    }

    @Override // ge.i
    public Function0<C0EZS> E3() {
        return this.LLJL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIJI;
    }

    private final void n5(int i) {
        View viewFindViewById = C1664590tQ1.LJII(this).findViewById(R.id.b_0);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
        View viewFindViewById2 = C1664590tQ1.LJII(this).findViewById(R.id.gcw);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(i, viewFindViewById2);
        }
    }

    @Override // X.InterfaceC362600EJm
    public void uy2(boolean z) {
        INLEMediaSession iNLEMediaSessionF1;
        if (this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = true;
        i3(new AwS93S0110000_5(z, this, 12));
        InterfaceC361710EGb interfaceC361710EGbZ4 = Z4();
        if (interfaceC361710EGbZ4 != null) {
            interfaceC361710EGbZ4.LR1(false);
        }
        InterfaceC361710EGb interfaceC361710EGbZ42 = Z4();
        if (interfaceC361710EGbZ42 != null) {
            interfaceC361710EGbZ42.dP1(false);
        }
        C0EOK c0eokO4 = O4();
        if (c0eokO4 != null) {
            c0eokO4.O2(false);
        }
        C0EOK c0eokO42 = O4();
        if (c0eokO42 != null) {
            c0eokO42.PF0(false);
        }
        n5(4);
        InterfaceC359940E9g interfaceC359940E9gAZ0 = H4().AZ0();
        if (interfaceC359940E9gAZ0 != null) {
            interfaceC359940E9gAZ0.LIZ(false);
        }
        if (C0BTF.LIZ()) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null) {
                iNLEMediaSessionF1 = c0e48F4.f1();
            } else {
                iNLEMediaSessionF1 = null;
            }
            C0E4A.LIZJ(iNLEMediaSessionF1);
        }
    }

    public final void t5(int i, int i2) {
        i3(new AwS6S0002000_5(i, i2, 2));
    }

    public C0EZJ(C372500Ej2 c372500Ej2, C19A3 c19a3, Function0<Unit> function0, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c372500Ej2;
        this.LLJJIII = function0;
        this.LLJJIJI = c1drg;
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC363160ELq.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJL = new AwS549S0100000_5(this, 799);
        this.LLJLIL = Z1(new C2217381BqS() { // from class: X.0EZL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EZP) obj).LIZ;
            }
        });
    }
}
