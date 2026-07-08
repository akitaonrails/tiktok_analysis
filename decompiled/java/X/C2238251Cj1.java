package X;

import X.C08CE;
import X.C637190Oyz;
import Y.ARunnableS103S0200000_34;
import Y.ARunnableS134S0100000_34;
import Y.ARunnableS14S1100000_9;
import Y.ARunnableS67S0300000_34;
import Y.ARunnableS78S0200000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerMetaModel;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerModel;
import com.ss.android.ugc.common.component.fragment.ComponentFragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Cj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238251Cj1 {
    public ViewGroup LIZIZ;
    public LifecycleEventObserver LJ;
    public Lifecycle LJFF;
    public Function0<Boolean> LJI;
    public ARunnableS67S0300000_34 LJII;
    public boolean LJIIIIZZ;
    public InterfaceC2238291Cj5 LJIIIZ;
    public ProfileBannerModel LJIIJ;
    public boolean LJIIJJI;
    public final CopyOnWriteArrayList<InterfaceC2238291Cj5> LIZ = new CopyOnWriteArrayList<>();
    public final AtomicReference<ProfileBannerModel> LIZJ = new AtomicReference<>(null);
    public final AtomicReference<View> LIZLLL = new AtomicReference<>(null);
    public final C2238281Cj4 LJIIL = new InterfaceC20658915sh() { // from class: X.1Cj4
        @Override // X.InterfaceC20658915sh
        public final void LIZ(AbstractC20656215sG abstractC20656215sG) {
            C2238251Cj1 c2238251Cj1 = this.LIZ;
            c2238251Cj1.getClass();
            C637190Oyz c637190Oyz = C637190Oyz.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("popup showing, dismiss banner. popupId=");
            sbLIZ.append(abstractC20656215sG.getId());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c637190Oyz.getClass();
            C637190Oyz.LIZ(strLIZIZ);
            ViewGroup viewGroup = c2238251Cj1.LIZIZ;
            if (viewGroup != null) {
                HandlerHook.viewPost(viewGroup, new ARunnableS134S0100000_34(c2238251Cj1, 31));
            }
        }
    };
    public final C2238271Cj3 LJIILIIL = new InterfaceC1600600rko() { // from class: X.1Cj3
        @Override // X.InterfaceC1600600rko
        public final void LIZ(AbstractC20656215sG abstractC20656215sG) {
            C2238251Cj1 c2238251Cj1 = this.LIZ;
            c2238251Cj1.getClass();
            C637190Oyz c637190Oyz = C637190Oyz.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPopupDismiss, show banner. popupId=");
            sbLIZ.append(abstractC20656215sG.getId());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c637190Oyz.getClass();
            C637190Oyz.LIZ(strLIZIZ);
            ViewGroup viewGroup = c2238251Cj1.LIZIZ;
            if (viewGroup != null) {
                HandlerHook.viewPost(viewGroup, new ARunnableS103S0200000_34(c2238251Cj1, abstractC20656215sG, 10));
            }
        }
    };

    public final void LIZJ() {
        Lifecycle lifecycle;
        ViewGroup viewGroup;
        C637190Oyz.LIZ.getClass();
        C637190Oyz.LIZ("onPageDestroy");
        if (this.LJIIIIZZ) {
            ARunnableS67S0300000_34 aRunnableS67S0300000_34 = this.LJII;
            if (aRunnableS67S0300000_34 != null && (viewGroup = this.LIZIZ) != null) {
                HandlerHook.viewRemoveCallbacks(viewGroup, aRunnableS67S0300000_34);
            }
            this.LJII = null;
            LifecycleEventObserver lifecycleEventObserver = this.LJ;
            if (lifecycleEventObserver != null && (lifecycle = this.LJFF) != null) {
                lifecycle.removeObserver(lifecycleEventObserver);
            }
            this.LJ = null;
            this.LJFF = null;
            this.LJIIJ = null;
            if (this.LJIIJJI) {
                this.LJIIJJI = false;
                PopupManager.LJIILL.remove(this.LJIILIIL);
            }
            this.LIZIZ = null;
            this.LIZJ.set(null);
            this.LIZLLL.set(null);
            this.LJIIIZ = null;
            this.LJIIIIZZ = false;
            if (((Boolean) C0AQT.LIZ.getValue()).booleanValue()) {
                PopupManager.LJIILJJIL.remove(this.LJIIL);
            }
        }
    }

    public final boolean LIZLLL(final ProfileBannerModel profileBannerModel) {
        InterfaceC2238291Cj5 next;
        C637190Oyz.LIZ.getClass();
        C637190Oyz.LIZ("showBanner");
        final ProfileBannerMetaModel profileBannerMetaModel = profileBannerModel.metaModel;
        final ProfileBannerInfoModel profileBannerInfoModel = profileBannerModel.infoModel;
        if (profileBannerMetaModel != null && profileBannerInfoModel != null) {
            String str = profileBannerInfoModel.bannerKey;
            if (str != null && str.length() != 0) {
                C19381410s8 c19381410s8 = EnumC19381310s7.Companion;
                Integer numValueOf = Integer.valueOf(profileBannerInfoModel.templateType);
                c19381410s8.getClass();
                Iterator<EnumC19381310s7> it2 = EnumC19381310s7.getEntries().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    EnumC19381310s7 next2 = it2.next();
                    int type = next2.getType();
                    if (numValueOf != null && type == numValueOf.intValue()) {
                        if (next2 != null) {
                            C637190Oyz c637190Oyz = C637190Oyz.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("registeredProviders:");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", this:");
                            sbLIZ.append(this);
                            sbLIZ.append(", count:");
                            sbLIZ.append(this.LIZ.size());
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c637190Oyz.getClass();
                            C637190Oyz.LIZ(strLIZIZ);
                            Iterator<InterfaceC2238291Cj5> it3 = this.LIZ.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (next.getTemplateType() == next2) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            final InterfaceC2238291Cj5 interfaceC2238291Cj5 = next;
                            if (interfaceC2238291Cj5 == null) {
                                C637190Oyz.LIZ.getClass();
                                C637190Oyz.LIZIZ("provider not register");
                                C637260Oz6 c637260Oz6 = C637260Oz6.LIZ;
                                String str2 = profileBannerInfoModel.strategyKey;
                                c637260Oz6.getClass();
                                C637260Oz6.LIZ(profileBannerInfoModel, "provider_not_register", str2, false);
                                return false;
                            }
                            if (this.LIZLLL.get() == null && PopupManager.LJI()) {
                                C637190Oyz c637190Oyz2 = C637190Oyz.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("popup is showing, pending banner. key=");
                                sbLIZ2.append(profileBannerInfoModel.bannerKey);
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                c637190Oyz2.getClass();
                                C637190Oyz.LIZ(strLIZIZ2);
                                this.LJIIJ = profileBannerModel;
                                if (!this.LJIIJJI) {
                                    this.LJIIJJI = true;
                                    PopupManager.LJIILL.add(this.LJIILIIL);
                                }
                                return true;
                            }
                            final ViewGroup viewGroup = this.LIZIZ;
                            if (viewGroup != null) {
                                final Context context = viewGroup.getContext();
                                if (viewGroup != null && context != null) {
                                    HandlerHook.viewPost(viewGroup, new Runnable() { // from class: X.1Cj2
                                        public final void LIZ() {
                                            ProfileBannerInfoModel profileBannerInfoModel2;
                                            ProfileBannerInfoModel profileBannerInfoModel3;
                                            ViewGroup viewGroup2;
                                            if (this.LL.LIZLLL.get() == null) {
                                                C637190Oyz.LIZ.getClass();
                                                C637190Oyz.LIZ("start create view");
                                                View viewLIZ = interfaceC2238291Cj5.LIZ(context, profileBannerInfoModel);
                                                ViewGroup viewGroup3 = viewGroup;
                                                InterfaceC2238291Cj5 interfaceC2238291Cj52 = interfaceC2238291Cj5;
                                                ProfileBannerInfoModel profileBannerInfoModel4 = profileBannerInfoModel;
                                                C2238251Cj1 c2238251Cj1 = this.LL;
                                                ProfileBannerMetaModel profileBannerMetaModel2 = profileBannerMetaModel;
                                                if (viewGroup3.getChildCount() == 0) {
                                                    viewGroup3.addView(viewLIZ);
                                                } else {
                                                    C637190Oyz.LIZ("container has child");
                                                }
                                                interfaceC2238291Cj52.onShow();
                                                c2238251Cj1.getClass();
                                                C637190Oyz.LIZ("onBannerShow");
                                                C637260Oz6.LIZ.getClass();
                                                C20684815ws.LJFF().execute(new ARunnableS78S0200000_9(profileBannerInfoModel4, profileBannerMetaModel2, 109));
                                                if (!profileBannerMetaModel2.isPersistent) {
                                                    int i = profileBannerInfoModel4.duration;
                                                    long j = i > 0 ? ((long) i) * 1000 : 8000L;
                                                    ARunnableS67S0300000_34 aRunnableS67S0300000_34 = c2238251Cj1.LJII;
                                                    if (aRunnableS67S0300000_34 != null && (viewGroup2 = c2238251Cj1.LIZIZ) != null) {
                                                        HandlerHook.viewRemoveCallbacks(viewGroup2, aRunnableS67S0300000_34);
                                                    }
                                                    ARunnableS67S0300000_34 aRunnableS67S0300000_342 = new ARunnableS67S0300000_34(c2238251Cj1, interfaceC2238291Cj52, profileBannerInfoModel4, 9);
                                                    c2238251Cj1.LJII = aRunnableS67S0300000_342;
                                                    ViewGroup viewGroup4 = c2238251Cj1.LIZIZ;
                                                    if (viewGroup4 != null) {
                                                        HandlerHook.viewPostDelay(viewGroup4, aRunnableS67S0300000_342, j);
                                                    }
                                                }
                                                c2238251Cj1.LIZLLL.set(viewLIZ);
                                                c2238251Cj1.LJIIIZ = interfaceC2238291Cj52;
                                            } else {
                                                C2238251Cj1 c2238251Cj12 = this.LL;
                                                ProfileBannerMetaModel profileBannerMetaModel3 = profileBannerMetaModel;
                                                ProfileBannerInfoModel profileBannerInfoModel5 = profileBannerInfoModel;
                                                c2238251Cj12.getClass();
                                                if (!profileBannerMetaModel3.hotUpdate) {
                                                    C637190Oyz.LIZ.getClass();
                                                    C637190Oyz.LIZIZ("banner update is blocked. can not hot update");
                                                } else if (c2238251Cj12.LIZLLL.get() == null) {
                                                    C637190Oyz.LIZ.getClass();
                                                    C637190Oyz.LIZIZ("banner update blocked. banner is not showing");
                                                } else {
                                                    ProfileBannerModel profileBannerModel2 = c2238251Cj12.LIZJ.get();
                                                    String str3 = null;
                                                    if (Intrinsics.LJFF((profileBannerModel2 == null || (profileBannerInfoModel3 = profileBannerModel2.infoModel) == null) ? null : profileBannerInfoModel3.bannerKey, profileBannerInfoModel5.bannerKey)) {
                                                        if (profileBannerModel2 != null && (profileBannerInfoModel2 = profileBannerModel2.infoModel) != null) {
                                                            str3 = profileBannerInfoModel2.strategyKey;
                                                        }
                                                        if (Intrinsics.LJFF(str3, profileBannerInfoModel5.strategyKey)) {
                                                            C637190Oyz.LIZ.getClass();
                                                            C637190Oyz.LIZIZ("banner update blocked. strategy key is not changed");
                                                        } else {
                                                            C637190Oyz.LIZ.getClass();
                                                            C637190Oyz.LIZ("start update view");
                                                            View view = this.LL.LIZLLL.get();
                                                            if (view != null) {
                                                                interfaceC2238291Cj5.LIZIZ(view, profileBannerInfoModel);
                                                            }
                                                        }
                                                    } else {
                                                        C637190Oyz.LIZ.getClass();
                                                        C637190Oyz.LIZIZ("banner update blocked. banner key is not the same");
                                                    }
                                                }
                                            }
                                            this.LL.LIZJ.set(profileBannerModel);
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("ProfileBannerContainerManager@7630.showBanner$1$1");
                                            try {
                                                LIZ();
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("ProfileBannerContainerManager@7630.showBanner$1$1");
                                        }
                                    });
                                }
                            }
                            return true;
                        }
                    }
                }
                C637190Oyz.LIZ.getClass();
                C637190Oyz.LIZIZ("template not exist");
                C637260Oz6 c637260Oz62 = C637260Oz6.LIZ;
                String str3 = profileBannerInfoModel.strategyKey;
                c637260Oz62.getClass();
                C637260Oz6.LIZ(profileBannerInfoModel, "template_not_exist", str3, false);
                return false;
            }
            C637190Oyz.LIZIZ("banner key is empty");
            C637260Oz6 c637260Oz63 = C637260Oz6.LIZ;
            String str4 = profileBannerInfoModel.strategyKey;
            c637260Oz63.getClass();
            C637260Oz6.LIZ(profileBannerInfoModel, "data_error", str4, false);
            return false;
        }
        C637190Oyz.LIZIZ("data is empty");
        C637260Oz6.LIZ.getClass();
        C637260Oz6.LIZ(null, "data_empty", null, false);
        return false;
    }

    public final void LIZ(ComponentFragment componentFragment, ViewGroup viewGroup, AwS563S0100000_19 awS563S0100000_19) {
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        this.LIZIZ = viewGroup;
        this.LJI = awS563S0100000_19;
        Lifecycle lifecycle = componentFragment.getLifecycle();
        this.LJFF = lifecycle;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.profilebanner.container.ProfileBannerContainerManager$attach$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                int i = C08CE.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            this.LL.LIZJ();
                            return;
                        }
                        return;
                    } else {
                        this.LL.getClass();
                        C637190Oyz.LIZ.getClass();
                        C637190Oyz.LIZ("onPagePause");
                        return;
                    }
                }
                this.LL.getClass();
                C637190Oyz.LIZ.getClass();
                C637190Oyz.LIZ("onPageResume");
            }
        };
        lifecycle.addObserver(lifecycleEventObserver);
        this.LJ = lifecycleEventObserver;
        if (((Boolean) C0AQT.LIZ.getValue()).booleanValue()) {
            PopupManager.LJIILJJIL.add(this.LJIIL);
        }
    }

    public final void LIZIZ(InterfaceC2238291Cj5 interfaceC2238291Cj5, ProfileBannerInfoModel profileBannerInfoModel, String str) {
        ViewGroup viewGroup;
        ARunnableS67S0300000_34 aRunnableS67S0300000_34 = this.LJII;
        if (aRunnableS67S0300000_34 != null && (viewGroup = this.LIZIZ) != null) {
            HandlerHook.viewRemoveCallbacks(viewGroup, aRunnableS67S0300000_34);
        }
        this.LJII = null;
        this.LIZLLL.set(null);
        this.LIZJ.set(null);
        this.LJIIIZ = null;
        interfaceC2238291Cj5.onDismiss();
        C637260Oz6.LIZ.getClass();
        C20684815ws.LJFF().execute(new ARunnableS14S1100000_9(profileBannerInfoModel, str, 28));
        int i = C637280Oz8.LIZ;
    }
}
