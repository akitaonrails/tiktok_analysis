package X;

import Y.AObjectS249S0100000_32;
import Y.ARunnableS132S0100000_32;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.193z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214789193z extends AbstractC2255721DQs<InterfaceC214731191t> implements InterfaceC214731191t, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public final C1DRG LL;
    public C214799194j LLJIJIL;
    public InterfaceC214787193x LLJILJIL;
    public DialogInterface.OnDismissListener LLJJI;
    public boolean LLJJIJI;
    public Function1<? super Integer, Unit> LLJJIJIIJIL;
    public Integer LLJJIJIL;
    public boolean LLJJJ;
    public final InterfaceC214731191t LLILLJJLI = this;
    public final String LLILLL = "EditPrivacySettingsPanelComponent";
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C193M.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC905270ZfJ.class, null);
    public final MutableLiveData<Lifecycle.Event> LLJ = new MutableLiveData<>(Lifecycle.Event.ON_ANY);
    public VideoPublishViewModel LLJI = new VideoPublishViewModel();
    public final List<C193Z> LLJILJILJ = new ArrayList();
    public final List<C193Z> LLJILLL = new ArrayList();
    public final List<C193Z> LLJJ = new ArrayList();
    public int LLJJIII = -1;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214789193z.class, "publishOptionsManagerApi", "getPublishOptionsManagerApi()Lcom/ss/android/ugc/aweme/shortvideo/component/option/manager/PublishOptionsManagerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C214789193z.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C214789193z.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C214789193z.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C214789193z.class, "publishVisibilityRadioOptionApi", "getPublishVisibilityRadioOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/privacy/v2/PublishVisibilityRadioOptionApi;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJJJJ = 8;
    }

    public final void Z1() {
        C1556730qc3 c1556730qc3;
        AbstractC343940De4 abstractC343940De4;
        this.LLJJJ = false;
        this.LLJJIJIL = null;
        C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
        int iLJII = currentUser != null ? currentUser.LJII() : 0;
        C1444600nhC.LIZ.getClass();
        boolean z = C1444600nhC.LIZ() && !c3(G2());
        C10CD c10cd = C10CD.LIZ;
        VideoPublishEditModel videoPublishEditModelG2 = G2();
        int i = this.LLJJIII;
        int i2 = G2().isPrivate;
        if (z) {
            VideoPublishEditModel videoPublishEditModelG22 = G2();
            c10cd.getClass();
            c1556730qc3 = new C1556730qc3(C10CD.LIZJ(videoPublishEditModelG22), false);
        } else {
            c1556730qc3 = null;
        }
        c10cd.getClass();
        C10CD.LJ(videoPublishEditModelG2, "video_edit_page", i, i2, iLJII, c1556730qc3);
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = null;
        DialogInterface.OnDismissListener onDismissListener = this.LLJJI;
        if (onDismissListener != null) {
            C214799194j c214799194j = this.LLJIJIL;
            if (c214799194j == null || (abstractC343940De4 = c214799194j.LLLJIL) == null) {
                abstractC343940De4 = C343970De7.LIZ;
            }
            onDismissListener.onDismiss(new DialogInterfaceC1444430ngv(abstractC343940De4));
        }
        this.LLJJI = null;
    }

    private final C193M H2() {
        return (C193M) this.LLILZ.getValue(this, LLJJJIL[0]);
    }

    private final InterfaceC905270ZfJ T2() {
        return (InterfaceC905270ZfJ) this.LLIZLLLIL.getValue(this, LLJJJIL[4]);
    }

    private final AbstractC214814194y W2() {
        return (AbstractC214814194y) this.LLIZ.getValue(this, LLJJJIL[3]);
    }

    private final C19EG w2() {
        return (C19EG) this.LLILZLL.getValue(this, LLJJJIL[2]);
    }

    public final VideoPublishEditModel G2() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJJJIL[1]);
    }

    public final void i3() {
        C214799194j c214799194j;
        try {
            C1444600nhC.LIZ.getClass();
            if (C1444600nhC.LIZ() || (c214799194j = this.LLJIJIL) == null) {
                return;
            }
            c214799194j.LLLLIL();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void v3() {
        C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
        int iLJII = currentUser != null ? currentUser.LJII() : 0;
        C10CD c10cd = C10CD.LIZ;
        VideoPublishEditModel videoPublishEditModelG2 = G2();
        int i = G2().isPrivate;
        VideoPublishEditModel videoPublishEditModelG22 = G2();
        c10cd.getClass();
        C10CD.LJFF(videoPublishEditModelG2, "video_edit_page", i, C10CD.LIZJ(videoPublishEditModelG22), false, iLJII);
    }

    private final void m3() {
        H2().yg2(C193J.LIZ).LIZ(this, new AObjectS249S0100000_32(this, 9));
        H2().yg2(C193I.LIZ).LIZ(this, new AObjectS249S0100000_32(this, 10));
        H2().yg2(C193F.LIZ).LIZ(this, new AObjectS249S0100000_32(this, 11));
    }

    public final List<C19223110Ij> W1() {
        C19223110Ij c19223110IjLIZ;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        List<C193Z> list = this.LLJILJILJ;
        ArrayList arrayList = new ArrayList();
        for (C193Z c193z : list) {
            if (c193z.LIZ == EnumC214771193h.VISIBILITY_HINT) {
                C10CE c10ce = C10CE.LIZ;
                VideoPublishEditModel videoPublishEditModelG2 = G2();
                c10ce.getClass();
                if (C10CE.LIZLLL(videoPublishEditModelG2)) {
                }
            }
            arrayList.add(c193z);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((C193Z) it2.next()).LIZ != EnumC214771193h.VISIBILITY_HINT) {
                    i++;
                } else if (i >= 0) {
                    c19223110IjLIZ = C214767193d.LIZ((C193Z) ListProtector.remove(arrayList2, i));
                }
            }
            c19223110IjLIZ = null;
            if (C10BZ.LIZ()) {
                if (c19223110IjLIZ != null) {
                    c13dvLIZIZ.add(c19223110IjLIZ);
                }
                c13dvLIZIZ.add(new C19223110Ij(1004, null, 62));
                c13dvLIZIZ.addAll(C214781193r.LIZ(arrayList2, false));
            } else {
                c13dvLIZIZ.addAll(C214781193r.LIZ(arrayList2, false));
                if (c19223110IjLIZ != null) {
                    c13dvLIZIZ.add(c19223110IjLIZ);
                }
            }
        }
        if (!this.LLJILLL.isEmpty()) {
            c13dvLIZIZ.add(new C19223110Ij(1005, null, 62));
            c13dvLIZIZ.addAll(C214781193r.LIZ(this.LLJILLL, false));
        }
        if (!this.LLJJ.isEmpty()) {
            c13dvLIZIZ.add(new C19223110Ij(1002, null, 62));
            c13dvLIZIZ.addAll(C214781193r.LIZ(this.LLJJ, false));
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        m3();
        InterfaceC905270ZfJ interfaceC905270ZfJT2 = T2();
        if (interfaceC905270ZfJT2 != null) {
            interfaceC905270ZfJT2.Zz0(this, new AwS611S0100000_32(this, 147));
        }
    }

    public final String q3() {
        String str = G2().creativeModel.transientPostPageModel.LJJIIJZLJL;
        return str == null ? "" : str;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public String getComponentName() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public InterfaceC214731191t o2() {
        return this.LLILLJJLI;
    }

    public C214789193z(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void B3(NavigationScene navigationScene) {
        C214799194j c214799194j = this.LLJIJIL;
        if (c214799194j != null) {
            c214799194j.LLLLL(W2());
            return;
        }
        InterfaceC214787193x interfaceC214787193x = this.LLJILJIL;
        if (interfaceC214787193x != null) {
            interfaceC214787193x.LJJLJLI(navigationScene);
        }
    }

    private final boolean c3(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getAdsAuthorizationSwitch()) {
            if (videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getSparkAdsAuth() != null && !Intrinsics.LJFF(videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getSparkAdsAuth(), "{}")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void X1(Lifecycle.Event event) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LLJ.setValue(event);
        } else {
            this.LLJ.postValue(event);
        }
    }

    @Override // X.InterfaceC214731191t
    public void LLLLZLLLI(LifecycleOwner lifecycleOwner, Function1<? super Lifecycle.Event, Unit> function1) {
        this.LLJ.observe(lifecycleOwner, new C1405290mfn(function1));
    }

    @Override // X.InterfaceC214731191t
    public void Tl1(DialogInterface.OnDismissListener onDismissListener, Function1<? super Integer, Unit> function1) {
        Scene scene;
        View view;
        C19721612Ec c12ez;
        this.LLJJI = onDismissListener;
        this.LLJJJ = true;
        this.LLJJIII = G2().isPrivate;
        this.LLJJIJIL = Integer.valueOf(G2().isPrivate);
        if (function1 != null) {
            this.LLJJIJIIJIL = function1;
            this.LLJJIJI = true;
        } else {
            this.LLJJIJIIJIL = null;
            this.LLJJIJI = false;
        }
        List<C19223110Ij> listW1 = W1();
        this.LLJI.LLILZIL = listW1;
        InterfaceC214787193x interfaceC214787193x = this.LLJILJIL;
        if (interfaceC214787193x == null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("key_nav_bar_title", W2().getString(((Number) C2274431E0r.LIZIZ.getValue()).intValue()), bundle);
            bundle.putBoolean("key_is_single_section", false);
            C1428470nHB.LLIL(bundle, G2());
            if (C10BZ.LIZ()) {
                c12ez = C19721412Ea.LIZ(bundle, this.LLJI, H2());
            } else {
                c12ez = new C12EZ(this.LLJI, H2());
                c12ez.mArguments = bundle;
            }
            this.LLJILJIL = c12ez;
        } else {
            interfaceC214787193x.LJLIIL(listW1);
        }
        if (this.LLJIJIL == null) {
            C18YA c18ya = new C18YA();
            c18ya.LIZ(new AwS576S0100000_32(this, 306));
            c18ya.LIZIZ(EnumC214804194o.FIXED);
            C214799194j c214799194j = c18ya.LIZ;
            c214799194j.LLJJIJIL = (int) (C12ES.LJIIIIZZ(w2()) * 0.7f);
            c214799194j.LLL = 100;
            c214799194j.LLLII = true;
            c214799194j.LLLI = false;
            c214799194j.LLJJJJJIL = true;
            c18ya.LIZ.LLJZ = new AwS576S0100000_32(this, 307);
            c18ya.LIZ.LLJLLIL = new AwS576S0100000_32(this, 308);
            c18ya.LIZ.LLJLLL = new AwS576S0100000_32(this, 309);
            c18ya.LIZ.LLLIZZ = Float.valueOf(C418440Gaw.LIZIZ(26));
            if (C10BZ.LIZ()) {
                c18ya.LIZ.LLLILZLLLI = Boolean.TRUE;
            }
            this.LLJIJIL = c18ya.LIZ;
        }
        X1(Lifecycle.Event.ON_CREATE);
        B3(C1447800nmM.LIZIZ(W2()));
        Object obj = this.LLJILJIL;
        if ((obj instanceof C19721612Ec) && (scene = (Scene) obj) != null && (view = scene.mView) != null) {
            HandlerHook.viewPost(view, new ARunnableS132S0100000_32(this, 45));
        }
    }
}
