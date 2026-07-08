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
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.193y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214788193y extends AbstractC2255721DQs<InterfaceC1445380niS> implements InterfaceC1445380niS, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C1DRG LL;
    public C214799194j LLJI;
    public InterfaceC214787193x LLJIJIL;
    public boolean LLJILJILJ;
    public Function1<? super Integer, Unit> LLJILLL;
    public Integer LLJJ;
    public boolean LLJJI;
    public DialogInterface.OnDismissListener LLJJIII;
    public PostBtnConfigure LLJJIJIIJIL;
    public Function0<Unit> LLJJIJIL;
    public final InterfaceC1445380niS LLILLJJLI = this;
    public final String LLILLL = "VisibilityOptionPanelComponent";
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C193M.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final VideoPublishViewModel LLIZLLLIL = new VideoPublishViewModel();
    public final MutableLiveData<Lifecycle.Event> LLJ = new MutableLiveData<>();
    public final List<C193Z> LLJILJIL = new ArrayList();
    public int LLJJIJI = -1;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214788193y.class, "publishOptionsManagerApi", "getPublishOptionsManagerApi()Lcom/ss/android/ugc/aweme/shortvideo/component/option/manager/PublishOptionsManagerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C214788193y.class, "permissionOptionApi", "getPermissionOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C214788193y.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C214788193y.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJJIL = 8;
    }

    public final void Z1() {
        C1556730qc3 c1556730qc3;
        AbstractC343940De4 abstractC343940De4;
        this.LLJJI = false;
        this.LLJJ = null;
        C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
        int iLJII = currentUser != null ? currentUser.LJII() : 0;
        C1444600nhC.LIZ.getClass();
        boolean z = C1444600nhC.LIZ() && !W2(w2());
        C10CD c10cd = C10CD.LIZ;
        VideoPublishEditModel videoPublishEditModelW2 = w2();
        int i = this.LLJJIJI;
        int iHu0 = G2().hu0();
        if (z) {
            VideoPublishEditModel videoPublishEditModelW22 = w2();
            c10cd.getClass();
            c1556730qc3 = new C1556730qc3(C10CD.LIZJ(videoPublishEditModelW22), false);
        } else {
            c1556730qc3 = null;
        }
        c10cd.getClass();
        C10CD.LJ(videoPublishEditModelW2, "video_post_page", i, iHu0, iLJII, c1556730qc3);
        this.LLJILJILJ = false;
        this.LLJILLL = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        DialogInterface.OnDismissListener onDismissListener = this.LLJJIII;
        if (onDismissListener != null) {
            C214799194j c214799194j = this.LLJI;
            if (c214799194j == null || (abstractC343940De4 = c214799194j.LLLJIL) == null) {
                abstractC343940De4 = C343970De7.LIZ;
            }
            onDismissListener.onDismiss(new DialogInterfaceC1444430ngv(abstractC343940De4));
        }
        this.LLJJIII = null;
    }

    private final InterfaceC855150Xgf G2() {
        return (InterfaceC855150Xgf) this.LLILZIL.getValue(this, LLJJJ[1]);
    }

    private final C193M H2() {
        return (C193M) this.LLILZ.getValue(this, LLJJJ[0]);
    }

    private final AbstractC214814194y T2() {
        return (AbstractC214814194y) this.LLIZ.getValue(this, LLJJJ[3]);
    }

    @Override // X.InterfaceC1445380niS
    public void Sm1() {
        C19721612Ec c19721612Ec;
        Function0<Unit> function0 = this.LLJJIJIL;
        if (function0 != null) {
            function0.invoke();
        }
        InterfaceC214787193x interfaceC214787193x = this.LLJIJIL;
        if ((interfaceC214787193x instanceof C19721612Ec) && (c19721612Ec = (C19721612Ec) interfaceC214787193x) != null) {
            c19721612Ec.LLJILJIL = C1419790n3B.LIZ;
        }
        C214799194j c214799194j = this.LLJI;
        if (c214799194j != null) {
            c214799194j.LLLLIL();
        }
    }

    public final void m3() {
        C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
        int iLJII = currentUser != null ? currentUser.LJII() : 0;
        C10CD c10cd = C10CD.LIZ;
        VideoPublishEditModel videoPublishEditModelW2 = w2();
        int iHu0 = G2().hu0();
        VideoPublishEditModel videoPublishEditModelW22 = w2();
        c10cd.getClass();
        C10CD.LJFF(videoPublishEditModelW2, "video_post_page", iHu0, C10CD.LIZJ(videoPublishEditModelW22), false, iLJII);
    }

    public final VideoPublishEditModel w2() {
        return (VideoPublishEditModel) this.LLILZLL.getValue(this, LLJJJ[2]);
    }

    public final String i3() {
        String str = w2().creativeModel.transientPostPageModel.LJJIIJZLJL;
        return str == null ? "" : str;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        H2().yg2(C193J.LIZ).LIZ(this, new AObjectS249S0100000_32(this, 8));
        G2().JN2().LJIIIZ(this, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 141));
    }

    @Override // X.InterfaceC1445380niS
    public PostBtnConfigure Wj0() {
        return this.LLJJIJIIJIL;
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

    public InterfaceC1445380niS o2() {
        return this.LLILLJJLI;
    }

    public C214788193y(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final List<C19223110Ij> W1(PostBtnConfigure postBtnConfigure) {
        boolean z;
        Iterable iterableLIZ;
        int i = 0;
        if (postBtnConfigure != null && postBtnConfigure.getEnable()) {
            z = true;
        } else {
            z = false;
        }
        List<C193Z> list = this.LLJILJIL;
        ArrayList arrayList = new ArrayList();
        for (C193Z c193z : list) {
            InterfaceC1738600vLO interfaceC1738600vLO = c193z.LIZ;
            if (interfaceC1738600vLO == EnumC214771193h.VISIBILITY_POST_BUTTON) {
                if (z) {
                    iterableLIZ = Collections.singletonList(C214767193d.LIZ(c193z));
                } else {
                    iterableLIZ = C13BV.INSTANCE;
                }
            } else if (interfaceC1738600vLO == EnumC214771193h.VISIBILITY_HINT) {
                C10CE c10ce = C10CE.LIZ;
                VideoPublishEditModel videoPublishEditModelW2 = w2();
                c10ce.getClass();
                if (C10CE.LIZLLL(videoPublishEditModelW2)) {
                    iterableLIZ = Collections.singletonList(C214767193d.LIZ(c193z));
                } else {
                    iterableLIZ = C13BV.INSTANCE;
                }
            } else if (interfaceC1738600vLO == EnumC214771193h.VISIBILITY_RADIO_GROUP) {
                iterableLIZ = C214781193r.LIZ(Collections.singletonList(c193z), true);
            } else {
                iterableLIZ = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(iterableLIZ, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it2 = arrayList2.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((C19223110Ij) it2.next()).LIZIZ, EnumC214771193h.VISIBILITY_RADIO_GROUP.getKey())) {
                if (i2 >= 0) {
                    if (C10BZ.LIZ()) {
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (Intrinsics.LJFF(((C19223110Ij) it3.next()).LIZIZ, EnumC214771193h.VISIBILITY_HINT.getKey())) {
                                if (i >= 0) {
                                    arrayList2.addFirst(ListProtector.remove(arrayList2, i));
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                    return arrayList2;
                }
            } else {
                i2++;
            }
        }
        return C13BV.INSTANCE;
    }

    private final boolean W2(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getAdsAuthorizationSwitch()) {
            if (videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getSparkAdsAuth() != null && !Intrinsics.LJFF(videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getSparkAdsAuth(), "{}")) {
                return true;
            }
            return false;
        }
        return true;
    }

    private final void q3(NavigationScene navigationScene) {
        C214799194j c214799194j = this.LLJI;
        if (c214799194j != null) {
            c214799194j.LLLLL(T2());
            return;
        }
        InterfaceC214787193x interfaceC214787193x = this.LLJIJIL;
        if (interfaceC214787193x != null) {
            interfaceC214787193x.LJJLJLI(navigationScene);
        }
    }

    public final void X1(Lifecycle.Event event) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LLJ.setValue(event);
        } else {
            this.LLJ.postValue(event);
        }
    }

    public final void c3(int i) {
        C214799194j c214799194j;
        if (this.LLJJIJIL != null) {
            return;
        }
        try {
            if (C1444740nhQ.LIZ(w2(), i)) {
                return;
            }
            C1444600nhC.LIZ.getClass();
            if (!C1444600nhC.LIZ() && (c214799194j = this.LLJI) != null) {
                c214799194j.LLLLIL();
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1445380niS
    public void LLLLZLLLI(LifecycleOwner lifecycleOwner, Function1<? super Lifecycle.Event, Unit> function1) {
        this.LLJ.observe(lifecycleOwner, new C1405280mfm(function1));
    }

    @Override // X.InterfaceC1445380niS
    public void kW0(PostBtnConfigure postBtnConfigure, Function1<? super Integer, Unit> function1, Function0<Unit> function0, DialogInterface.OnDismissListener onDismissListener) {
        Scene scene;
        View view;
        String string;
        C19721612Ec c12ez;
        if (this.LLJILJIL.isEmpty()) {
            return;
        }
        this.LLJJI = true;
        this.LLJJIJI = G2().hu0();
        this.LLJJ = Integer.valueOf(G2().hu0());
        this.LLJJIJIIJIL = postBtnConfigure;
        this.LLJJIJIL = function0;
        this.LLJJIII = onDismissListener;
        if (function1 != null) {
            this.LLJILLL = function1;
            this.LLJILJILJ = true;
        } else {
            this.LLJILLL = null;
            this.LLJILJILJ = false;
        }
        List<C19223110Ij> listW1 = W1(postBtnConfigure);
        this.LLIZLLLIL.LLILZIL = listW1;
        InterfaceC214787193x interfaceC214787193x = this.LLJIJIL;
        if (interfaceC214787193x == null) {
            Bundle bundle = new Bundle();
            if (C10BZ.LIZ()) {
                string = C10BV.LIZ(T2().requireSceneContext(), w2());
            } else {
                string = T2().getString(2131858432);
            }
            C786410Ut5.LJJJI("key_nav_bar_title", string, bundle);
            bundle.putBoolean("key_is_single_section", true);
            C1428470nHB.LLIL(bundle, w2());
            if (C10BZ.LIZ()) {
                c12ez = C19721412Ea.LIZ(bundle, this.LLIZLLLIL, H2());
            } else {
                c12ez = new C12EZ(this.LLIZLLLIL, H2());
                c12ez.mArguments = bundle;
            }
            this.LLJIJIL = c12ez;
        } else {
            interfaceC214787193x.LJLIIL(listW1);
        }
        if (this.LLJI == null) {
            C18YA c18ya = new C18YA();
            c18ya.LIZ(new AwS576S0100000_32(this, 297));
            C214799194j c214799194j = c18ya.LIZ;
            c214799194j.LLLII = true;
            c214799194j.LLLI = false;
            C1546210qL5.LIZ.getClass();
            c18ya.LIZ.LLLIZZ = Float.valueOf(C1546210qL5.LIZ(26));
            if (C10BZ.LIZ()) {
                c18ya.LIZ.LLLILZLLLI = Boolean.TRUE;
            }
            c18ya.LIZ.LLL = 100;
            c18ya.LIZ.LLJZ = new AwS576S0100000_32(this, 298);
            c18ya.LIZ.LLJLLIL = new AwS576S0100000_32(this, 299);
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            C214799194j c214799194j2 = c18ya.LIZ;
            c214799194j2.LLJLLL = awS576S0100000_32;
            this.LLJI = c214799194j2;
        }
        X1(Lifecycle.Event.ON_CREATE);
        q3(C1447800nmM.LIZIZ(T2()));
        Object obj = this.LLJIJIL;
        if ((obj instanceof C19721612Ec) && (scene = (Scene) obj) != null && (view = scene.mView) != null) {
            HandlerHook.viewPost(view, new ARunnableS132S0100000_32(this, 44));
        }
    }
}
