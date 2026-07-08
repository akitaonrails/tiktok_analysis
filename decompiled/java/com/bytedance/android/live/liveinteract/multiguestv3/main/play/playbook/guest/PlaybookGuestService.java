package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.guest;

import X.C01EI;
import X.C0IUA;
import X.C1161920gLG;
import X.C19322110iZ;
import X.C1AZW;
import X.C20361214lm;
import X.C20381614p4;
import X.C2188811AlT;
import X.C259800zU;
import X.C403501hZ;
import X.C467770IVz;
import X.C945320ahu;
import X.C948450amx;
import X.C949630aor;
import X.C978360bZC;
import X.InterfaceC20354714kj;
import X.InterfaceC927850aFj;
import X.InterfaceC948500an2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.guest.PlaybookGuestDetailDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.guest.PlaybookGuestService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.guest.PlaybookGuestViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicLinkInjectorScopeOptimizeSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS610S0100000_31;
import webcast.data.multi_guest_play.ActivePlaybook;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "PLAYBOOK_GUEST_SERVICE")
public final class PlaybookGuestService extends BasePlaybookService<PlaybookGuestViewModel> implements InterfaceC927850aFj {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final DataChannel LLJI;
    public final WeakReference<Fragment> LLJIJIL;
    public PlaybookGuestDetailDialog LLJILJIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService
    public final String LJJIJLIJ() {
        return "PlaybookGuestService";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService
    public final void LJJIL() {
        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookGuestService"), "initViewModel", null, null);
        Fragment fragment = this.LLJIJIL.get();
        if (fragment != null) {
            final DataChannel dataChannel = this.LLJI;
            final WeakReference weakReference = new WeakReference(fragment.getActivity());
            ViewModelProvider.Factory factory = new ViewModelProvider.Factory(dataChannel, weakReference) { // from class: X.0D8w
                public final DataChannel LIZ;
                public final WeakReference<Context> LIZIZ;

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> cls) {
                    if (cls.isAssignableFrom(PlaybookGuestViewModel.class)) {
                        return new PlaybookGuestViewModel(this.LIZ, this.LIZIZ);
                    }
                    throw new IllegalArgumentException("Unknown ViewModel class");
                }

                {
                    this.LIZ = dataChannel;
                    this.LIZIZ = weakReference;
                }
            };
            if (!fragment.isDetached()) {
                VM vm = (VM) ViewModelProviders.of(fragment, factory).get(PlaybookGuestViewModel.class);
                this.LLILLJJLI = vm;
                C978360bZC.LJIILL = vm;
            }
        }
        this.LLJI.zW(PlaybookGuestServiceChannel.class, new C949630aor(this));
    }

    public final void LJJJJ() {
        String strLIZ = C01EI.LIZ(0, "PlaybookGuestService");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("closePlaybookDetailDialog source:");
        sbLIZ.append("settingPageShow");
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        PlaybookGuestDetailDialog playbookGuestDetailDialog = this.LLJILJIL;
        if (playbookGuestDetailDialog != null) {
            playbookGuestDetailDialog.close(1);
        }
        this.LLJILJIL = null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService
    public final void LJJJIL() {
        super.LJJJIL();
        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookGuestService"), "clearCache", null, null);
        VM vm = this.LLILLJJLI;
        if (vm != 0) {
            vm.clearCache();
        }
        C978360bZC.LJIILL = null;
        C948450amx c948450amx = C948450amx.LIZIZ;
        c948450amx.LJI("PLAYBOOK_GUEST_SERVICE");
        if (LinkMicLinkInjectorScopeOptimizeSetting.isEnable()) {
            Room room = (Room) this.LLJI.gg0(RoomChannel.class);
            c948450amx.LIZ(room != null ? Long.valueOf(room.getId()) : null, "PlaybookGuestService#toDestroy");
        }
    }

    @Override // X.InterfaceC927850aFj
    public final void destroy() {
        LJJJIL();
        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookGuestService"), "destroy", null, null);
        this.LLJI.zW(PlaybookGuestServiceChannel.class, new C949630aor(null));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService
    public final String LJJIJIIJI() {
        return C0IUA.LJIILLIIL;
    }

    @Override // X.InterfaceC927850aFj
    public final void LJIIJ(SeiAppData seiAppData) {
        PlaybookGuestViewModel playbookGuestViewModel = (PlaybookGuestViewModel) this.LLILLJJLI;
        if (playbookGuestViewModel != null) {
            C20381614p4 c20381614p4 = playbookGuestViewModel.LLJIJIL;
            c20381614p4.getClass();
            C403501hZ.LIZ(new AwS416S0200000_15(seiAppData, c20381614p4, 36));
        }
    }

    @Override // X.InterfaceC927850aFj
    public final void LJIILIIL(C945320ahu c945320ahu) {
        PlaybookGuestViewModel playbookGuestViewModel = (PlaybookGuestViewModel) this.LLILLJJLI;
        if (playbookGuestViewModel != null) {
            C20381614p4 c20381614p4 = playbookGuestViewModel.LLJIJIL;
            c20381614p4.getClass();
            C403501hZ.LIZ(new AwS416S0200000_15(c945320ahu, c20381614p4, 35));
        }
    }

    public PlaybookGuestService(DataChannel dataChannel, WeakReference<Fragment> weakReference) {
        super(dataChannel);
        this.LLJI = dataChannel;
        this.LLJIJIL = weakReference;
        C948450amx.LIZIZ.LJFF(this, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC927850aFj
    public final void LJIILLIIL(final C20361214lm c20361214lm, AwS610S0100000_31 awS610S0100000_31) {
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = awS610S0100000_31;
        PlayRule playRule = c20361214lm.LIZLLL;
        if (playRule != null) {
            playRule.LJJ(c20361214lm, new InterfaceC20354714kj() { // from class: X.0arb
                @Override // X.InterfaceC20354714kj
                public final void LIZ() {
                }

                @Override // X.InterfaceC20354714kj
                public final void LIZJ(String str, long j) {
                }

                @Override // X.InterfaceC20354714kj
                public final void LJ() {
                }

                @Override // X.InterfaceC20354714kj
                public final void LJI(long j) {
                }

                @Override // X.InterfaceC20354714kj
                public final void LJII() {
                }

                @Override // X.InterfaceC20354714kj
                public final void LJIIJ() {
                }

                @Override // X.InterfaceC20354714kj
                public final void LJFF(int i, long j) {
                    MutableLiveData<ActivePlaybook> mutableLiveData;
                    ActivePlaybook value;
                    this.LIZ.getClass();
                    String strLIZ = C01EI.LIZ(0, "PlaybookGuestService");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSettingPageDismiss stateId:");
                    sbLIZ.append(j);
                    sbLIZ.append(" type:");
                    sbLIZ.append(i);
                    Long lValueOf = null;
                    C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                    if (i != 1) {
                        if (i == 2) {
                            VM vm = this.LIZ.LLILLJJLI;
                            if (vm != 0 && (mutableLiveData = vm.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
                                lValueOf = Long.valueOf(value.playId);
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onSettingPageDismiss playId:");
                            sbLIZ2.append(lValueOf);
                            C20441214yg.LIZIZ("PlaybookGuestDetailDialog", C2188811AlT.LIZIZ(sbLIZ2));
                            if (lValueOf != null) {
                                PlaybookGuestService playbookGuestService = this.LIZ;
                                if (playbookGuestService.LLJILJIL == null) {
                                    playbookGuestService.LJIJ(lValueOf.longValue(), "settingPageDismiss");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    PlaybookGuestService playbookGuestService2 = this.LIZ;
                    String str = c20361214lm.LIZ;
                    playbookGuestService2.getClass();
                    String strLIZ2 = C01EI.LIZ(0, "PlaybookGuestService");
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("closeAllDialog source:");
                    sbLIZ3.append(str);
                    C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ3), null, null);
                    PlaybookGuestDetailDialog playbookGuestDetailDialog = playbookGuestService2.LLJILJIL;
                    if (playbookGuestDetailDialog != null) {
                        playbookGuestDetailDialog.close(1);
                    }
                    playbookGuestService2.LLJILJIL = null;
                }

                @Override // X.InterfaceC20354714kj
                public final void LJIIIIZZ(int i, long j) {
                    this.LIZ.getClass();
                    String strLIZ = C01EI.LIZ(0, "PlaybookGuestService");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSettingPageShowSuccess stateId:");
                    sbLIZ.append(j);
                    sbLIZ.append(" type:");
                    sbLIZ.append(i);
                    C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                    if (i != 1) {
                        if (i == 2) {
                            Function1<Boolean, Unit> function1 = c259800zU.element;
                            if (function1 != null) {
                                function1.invoke(Boolean.TRUE);
                            }
                            this.LIZ.LJJJJ();
                            c259800zU.element = null;
                            return;
                        }
                        return;
                    }
                    this.LIZ.LJJJJ();
                }

                @Override // X.InterfaceC20354714kj
                public final void LIZIZ(long j, String str, boolean z) {
                    this.LIZ.getClass();
                    C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookGuestService"), "clickTask onSuccess", null, null);
                }
            }, this, "", 0L, "", "");
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.guest.PlaybookGuestService$showPlaybookDetailDialog$1$1] */
    @Override // X.InterfaceC927850aFj
    public final void LJIJ(long j, String str) {
        Fragment fragment = this.LLJIJIL.get();
        if (fragment == null) {
            return;
        }
        String strLIZ = C01EI.LIZ(0, "PlaybookGuestService");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPlaybookDetailDialog playId:");
        sbLIZ.append(j);
        sbLIZ.append(" source:");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (!LJJIIZ("normal_detail_page")) {
            C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookGuestService"), "showPlaybookDetailDialog return as symphonyEngine not ready", null, null);
            return;
        }
        if (this.LLJILJIL == null) {
            String str2 = PlaybookGuestDetailDialog._pnsPageId;
            PlaybookGuestDetailDialog playbookGuestDetailDialog = new PlaybookGuestDetailDialog((PlaybookGuestViewModel) this.LLILLJJLI, j, this.LLJI);
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.guest.PlaybookGuestService$showPlaybookDetailDialog$1$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        this.LL.LLJILJIL = null;
                        LifecycleEventObserver lifecycleEventObserver = c259800zU.element;
                        if (lifecycleEventObserver != null) {
                            lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                        }
                    }
                }
            };
            playbookGuestDetailDialog.getLifecycle().addObserver((LifecycleObserver) c259800zU.element);
            this.LLJILJIL = playbookGuestDetailDialog;
        }
        PlaybookGuestDetailDialog playbookGuestDetailDialog2 = this.LLJILJIL;
        if (playbookGuestDetailDialog2 != null) {
            C19322110iZ.LJFF(fragment.getChildFragmentManager(), playbookGuestDetailDialog2, "PlaybookGuestDetailDialog", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
        }
    }
}
