package X;

import Y.AObserverS218S0100000_14;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.commerce.tools.common.publish.CommerceToolsPublishService;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0ZfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905240ZfG extends AbstractC2255721DQs<InterfaceC855210Xgl> implements InterfaceC855210Xgl, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), List.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), Fragment.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), Bundle.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855180Xgi.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), C856850XjP.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), C214848196g.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
    public final MutableLiveData<Boolean> LLJILJIL;
    public final MutableLiveData<Boolean> LLJILJILJ;
    public InterfaceC855600XhO LLJILLL;
    public ArrayList<InterfaceC856250XiR> LLJJ;
    public ObjectAnimator LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public TextView LLJJIJIIJIL;

    public InterfaceC855210Xgl w2() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C905240ZfG.class, "publishExtensions", "getPublishExtensions()Ljava/util/List;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C905240ZfG.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C905240ZfG.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C905240ZfG.class, "fragment", "getFragment()Landroidx/fragment/app/Fragment;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C905240ZfG.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C905240ZfG.class, "savedInstanceState", "getSavedInstanceState()Landroid/os/Bundle;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C905240ZfG.class, "moreOptionApiComponent", "getMoreOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/option/more/MoreOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C905240ZfG.class, "titleModule", "getTitleModule()Lcom/ss/android/ugc/aweme/shortvideo/TitleModule;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C905240ZfG.class, "imageHeaderModule", "getImageHeaderModule()Lcom/ss/android/ugc/aweme/shortvideo/image/ImageHeaderModule;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C905240ZfG.class, "permissionOptionApi", "getPermissionOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10};
        LLJJJ = 8;
    }

    private final List<C0WIY<Class<?>, IAVPublishExtension<?>>> c3() {
        return (List) this.LLILLJJLI.getValue(this, LLJJIJIL[0]);
    }

    private final Fragment getFragment() {
        return (Fragment) this.LLILZIL.getValue(this, LLJJIJIL[3]);
    }

    public final C19EG G2() {
        return (C19EG) this.LLILLL.getValue(this, LLJJIJIL[1]);
    }

    public final C214848196g H2() {
        return (C214848196g) this.LLJI.getValue(this, LLJJIJIL[8]);
    }

    public final InterfaceC855180Xgi T2() {
        return (InterfaceC855180Xgi) this.LLIZLLLIL.getValue(this, LLJJIJIL[6]);
    }

    public final InterfaceC855150Xgf W2() {
        return (InterfaceC855150Xgf) this.LLJIJIL.getValue(this, LLJJIJIL[9]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZLL.getValue(this, LLJJIJIL[4]);
    }

    public final AbstractC214814194y i3() {
        return (AbstractC214814194y) this.LLILZ.getValue(this, LLJJIJIL[2]);
    }

    public final Bundle m3() {
        return (Bundle) this.LLIZ.getValue(this, LLJJIJIL[5]);
    }

    public final C856850XjP q3() {
        return (C856850XjP) this.LLJ.getValue(this, LLJJIJIL[7]);
    }

    private final void B3() {
        Iterator<C0WIY<Class<?>, IAVPublishExtension<?>>> it2 = c3().iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZIZ instanceof C19510811Va) {
                ((ExtensionDataRepo) C1659670tI5.LIZ(i3()).get(ExtensionDataRepo.class)).getUpdateAnchors().observe(this, new AObserverS218S0100000_14(this, 11));
            }
        }
        this.LLJILJILJ.setValue(Boolean.valueOf(((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIIIIZZ()));
    }

    private final void o2() {
        View view = i3().mView;
        if (view != null) {
            this.LLJJIII = view.findViewById(R.id.sgr);
            this.LLJJIJI = view.findViewById(R.id.sgu);
            this.LLJJIJIIJIL = (TextView) view.findViewById(R.id.sgx);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CommercePublishPageComponent#findView: rootView is null. rootScene state=");
            sbLIZ.append(i3().mState);
            C193S.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJ() {
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(i3());
            Scene sceneLLLLIIIILLL = navigationSceneLIZ != null ? navigationSceneLIZ.LLLLIIIILLL() : null;
            if (sceneLLLLIIIILLL instanceof PublishPreviewScene) {
                ((PublishPreviewScene) sceneLLLLIIIILLL).LLLLLLL();
                return;
            }
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJIJI, "rotation", 0.0f, 360.0f);
        this.LLJJI = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        View view = this.LLJJIII;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJIJI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        if (objectAnimatorOfFloat.isRunning()) {
            return;
        }
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void Z1() {
        ObjectAnimator objectAnimator;
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(i3());
            Scene sceneLLLLIIIILLL = navigationSceneLIZ != null ? navigationSceneLIZ.LLLLIIIILLL() : null;
            if (sceneLLLLIIIILLL instanceof PublishPreviewScene) {
                ((PublishPreviewScene) sceneLLLLIIIILLL).LLLLLL();
                return;
            }
        }
        View view = this.LLJJIII;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLJJIJI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        ObjectAnimator objectAnimator2 = this.LLJJI;
        if (objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.LLJJI) == null) {
            return;
        }
        objectAnimator.cancel();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        B3();
    }

    @Override // X.InterfaceC855210Xgl
    public InterfaceC855600XhO Mm1() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        w2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C905240ZfG(C1DRG c1drg) {
        this.LL = c1drg;
        Boolean bool = Boolean.FALSE;
        this.LLJILJIL = new MutableLiveData<>(bool);
        this.LLJILJILJ = new MutableLiveData<>(bool);
        o2();
        v3(getFragment());
    }

    private final void v3(final Fragment fragment) {
        C20508115Mp c20508115MpLIZ = CommerceToolsPublishService.LIZJ().LIZ(new AbstractC856620Xj2() { // from class: X.0XiQ
            @Override // X.InterfaceC20508415Ms
            public final void LJIJJ() {
            }

            @Override // X.InterfaceC20508415Ms
            public final String LJFF() {
                return this.LIZIZ.q3().LJII(true);
            }

            @Override // X.InterfaceC20507915Mn, X.C15MY, X.InterfaceC20508415Ms, X.C15MZ
            public final VideoPublishEditModel LJI() {
                return this.LIZIZ.getEditModel();
            }

            @Override // X.C15MY
            public final MutableLiveData<Boolean> LJIIIIZZ() {
                return this.LIZIZ.LLJILJILJ;
            }

            @Override // X.InterfaceC20508415Ms
            public final List<AVTextExtraStruct> LJIILJJIL() throws Throwable {
                ArrayList arrayListLIZ;
                C856850XjP c856850XjPQ3 = this.LIZIZ.q3();
                List<TextExtraStruct> listLJJIJIL = c856850XjPQ3.LIZIZ.LJJIJIL(c856850XjPQ3.LJIIJJI, true);
                return (listLJJIJIL == null || (arrayListLIZ = C19881612qc.LIZ(C19881612qc.LIZLLL(listLJJIJIL, new C858720XmQ()))) == null) ? C13BV.INSTANCE : arrayListLIZ;
            }

            @Override // X.InterfaceC20508415Ms
            public final String LJIL() {
                return this.LIZIZ.H2().LJI();
            }

            @Override // X.InterfaceC856640Xj4
            public final C19BK LJJ() {
                return (C19BK) this.LIZIZ.i3().requireParentScene();
            }

            @Override // X.C15MY
            public final MutableLiveData<Boolean> LJJI() {
                return this.LIZIZ.LLJILJIL;
            }

            @Override // X.InterfaceC856640Xj4
            public final Scene getScene() {
                return this.LIZIZ.i3();
            }

            @Override // X.InterfaceC20507915Mn
            public final String getUid() {
                String uid;
                C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
                return (currentUser == null || (uid = currentUser.getUid()) == null) ? CardStruct.IStatusCode.DEFAULT : uid;
            }

            @Override // X.InterfaceC20508415Ms
            public final boolean LJIJ() {
                return LJI().creativeModel.transientPostPageModel.LJJIIZI;
            }

            @Override // X.C15MY
            public final boolean LJIJJLI() {
                return LJI().creativeModel.transientPostPageModel.LJIIJ;
            }

            @Override // X.InterfaceC998290c5L
            public final ViewModelStoreOwner LLIIIILZ() {
                return C1659630tI1.LIZIZ(this.LIZIZ.G2(), getScene());
            }

            @Override // X.C15MY, X.InterfaceC20508415Ms
            public final Fragment getFragment() {
                return fragment;
            }

            @Override // X.InterfaceC20508415Ms
            public final void LJ(boolean z) {
                this.LIZIZ.X1(z);
            }

            @Override // X.AbstractC856620Xj2, X.InterfaceC1065900dqO
            public final void LJIIIZ(InterfaceC856250XiR interfaceC856250XiR) {
                C905240ZfG c905240ZfG = this.LIZIZ;
                if (c905240ZfG.LLJJ == null) {
                    c905240ZfG.LLJJ = new ArrayList<>();
                }
                ArrayList<InterfaceC856250XiR> arrayList = this.LIZIZ.LLJJ;
                if (arrayList != null && !arrayList.contains(interfaceC856250XiR)) {
                    interfaceC856250XiR.onViewCreated(getScene().mView, this.LIZIZ.m3());
                    arrayList.add(interfaceC856250XiR);
                }
            }

            @Override // X.InterfaceC20508415Ms
            public final void LJIIJJI(boolean z) {
                if (LJI().creativeModel.transientPostPageModel.LJJIIZI) {
                    this.LIZIZ.T2().T32(z);
                }
            }

            @Override // X.InterfaceC20508415Ms
            public final void LJIILL(boolean z) {
                boolean z2;
                boolean z3;
                String string;
                CommerceToolsTcmModel tcmModel = LJI().creativeModel.commerceModel.getTcmModel();
                this.LIZIZ.W2().setAdvPromotable(tcmModel.getAdsAuthorizationSwitch());
                if (tcmModel.getSparkAdsAuth() != null && !Intrinsics.LJFF(tcmModel.getSparkAdsAuth(), "{}")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int iHu0 = this.LIZIZ.W2().hu0();
                if (iHu0 != 2 && iHu0 != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if ((tcmModel.getAdsAuthorizationSwitch() || z2) && z3) {
                    this.LIZIZ.W2().jY0(1);
                }
                if (z && iHu0 == 1) {
                    this.LIZIZ.W2().jY0(0);
                    if (getContext() != null) {
                        Fragment fragment2 = fragment;
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
                        Context context = getContext();
                        if (context != null) {
                            string = context.getString(2131858116);
                        } else {
                            string = null;
                        }
                        creativeToastBuilder.message(string);
                        C1390380mHk.LJ(fragment2, 2006, creativeToastBuilder);
                    }
                }
            }
        });
        this.LLJILLL = c20508115MpLIZ;
        if (c20508115MpLIZ != null) {
            c20508115MpLIZ.initialize();
        }
    }

    public final void W1(List<AnchorTransData> list) {
        boolean z;
        Iterator<AnchorTransData> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIL().contains(Integer.valueOf(it2.next().businessType))) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        this.LLJILJIL.setValue(Boolean.valueOf(z));
    }

    public final void X1(boolean z) {
        View viewFindViewById;
        TextView textView;
        View view = i3().mView;
        if (view == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CommercePublishPageComponent#changeTcmSubmitButton: rootView is null. rootScene state=");
            sbLIZ.append(i3().mState);
            C193S.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        View viewFindViewById2 = view.findViewById(R.id.sgs);
        if (viewFindViewById2 == null || (viewFindViewById = view.findViewById(R.id.sgt)) == null || (textView = this.LLJJIJIIJIL) == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (z) {
            TCMPostPageSubmitTextModel submitText = getEditModel().creativeModel.commerceModel.getTcmModel().getSubmitText();
            if (submitText != null) {
                if (!TextUtils.isEmpty(submitText.getSubmitTitleText())) {
                    textView.setText(submitText.getSubmitTitleText());
                }
                if (!TextUtils.isEmpty(submitText.getSubmitButtonText())) {
                    ((TextView) view.findViewById(R.id.shd)).setText(submitText.getSubmitButtonText());
                    C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                    return;
                }
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById2);
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        textView.setText(text);
    }
}
