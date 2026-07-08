package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor;

import X.AbstractC20368114mt;
import X.AbstractC20384214pU;
import X.C01EI;
import X.C01GW;
import X.C01HZ;
import X.C01NB;
import X.C01OF;
import X.C01OW;
import X.C09JN;
import X.C0IUA;
import X.C0UO0;
import X.C0UPI;
import X.C0UTJ;
import X.C1083530eIp;
import X.C1161920gLG;
import X.C11NJ;
import X.C11QI;
import X.C11S5;
import X.C1697810uHb;
import X.C176600m4;
import X.C1868930yjb;
import X.C19322110iZ;
import X.C1942307jB;
import X.C19482011Jy;
import X.C19487311Lz;
import X.C1954807lC;
import X.C19EG;
import X.C1AZW;
import X.C20357914lF;
import X.C20359414lU;
import X.C20360614lg;
import X.C20360714lh;
import X.C20360914lj;
import X.C20361214lm;
import X.C20363214m6;
import X.C20364414mI;
import X.C20366114mZ;
import X.C20379114of;
import X.C20382314pB;
import X.C20382814pG;
import X.C20384514pX;
import X.C20384714pZ;
import X.C20385514ph;
import X.C20387014pw;
import X.C20387914q5;
import X.C20388014q6;
import X.C20388714qD;
import X.C20388814qE;
import X.C20388914qF;
import X.C20391014qa;
import X.C20441214yg;
import X.C20484615Do;
import X.C2188811AlT;
import X.C259800zU;
import X.C334801Rq;
import X.C405101hp;
import X.C452501pT;
import X.C470590Icr;
import X.C480460Ism;
import X.C500260Jjc;
import X.C515801zg;
import X.C516201zk;
import X.C784930Uqh;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C915900ZwS;
import X.C930940aKi;
import X.C937280aUw;
import X.C956690b0F;
import X.C978360bZC;
import X.EnumC20429314wl;
import X.EnumC20429414wm;
import X.EnumC20429914wr;
import X.EnumC499801x6;
import X.InterfaceC1487280oo2;
import X.InterfaceC170900l9;
import X.InterfaceC20357214l8;
import X.InterfaceC20484815Dq;
import X.InterfaceC953350aur;
import X.InterfaceC986020blY;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.IMultiGuestPlayApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoritesListDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoritesListV2Dialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookListDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.event.PlaybookLoadFetchListEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.RoomTitleEntity;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetActiveContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetActiveContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookRepublishParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookRepublishResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUpdateUserSettingParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsParams;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.dataChannel.LiveCenterDismissEvent;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEditorUgcSetting;
import com.bytedance.android.livesdk.model.PlaybookAnchorServiceInitSuccessEvent;
import com.bytedance.android.livesdk.model.SharedEffect;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookTagAggregation;
import webcast.data.multi_guest_play.PublishPlaybookContent;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookAnchorServiceV2 extends BasePlaybookService<PlaybookAnchorViewModel> implements C0UTJ {
    public static final /* synthetic */ int LLJJJJJIL = 0;
    public final DataChannel LLJI;
    public final WeakReference<Fragment> LLJIJIL;
    public final WeakReference<C19EG> LLJILJIL;
    public final boolean LLJILJILJ;
    public BasePlaybookSheetFragment LLJILLL;
    public BasePlaybookSheetFragment LLJJ;
    public final Map<EnumC20429414wm, PlaybookListDialog> LLJJI;
    public PlaybookAnchorDetailDialog LLJJIII;
    public PlaybookAutoStartDialog LLJJIJI;
    public PlaybookFeedbackDialog LLJJIJIIJIL;
    public List<PlaybookTagAggregation> LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01OW LLJJJIL;
    public final C20366114mZ LLJJJJ;

    @Override // X.C0UTJ
    public final void LIZLLL() {
        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorServiceV2"), "resumeForLive", null, null);
        PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) this.LLILLJJLI;
        if (playbookAnchorViewModel != null) {
            final C20384514pX c20384514pX = playbookAnchorViewModel.LLJJJJJIL;
            c20384514pX.getClass();
            PlaybookGetActiveContentParams playbookGetActiveContentParams = new PlaybookGetActiveContentParams();
            playbookGetActiveContentParams.roomId = AbstractC20384214pU.LJIJI();
            String strLIZ = C01EI.LIZ(0, "PlaybookAnchorModel");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resumeForLive, roomId=");
            sbLIZ.append(playbookGetActiveContentParams.roomId);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            C480460Ism.LIZ().getClass();
            C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).getActiveContent(playbookGetActiveContentParams), "PlaybookAnchorModel", "getActiveContent").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.01ro
                @Override // X.C09JN
                public final void accept(Object obj) {
                    ActivePlaybook activePlaybook;
                    C1C7U.LIZ("PlaybookAnchorModel@281.resumeForLive$1");
                    C470590Icr c470590Icr = (C470590Icr) obj;
                    C930480aJy.LIZ.getClass();
                    if (C930480aJy.LJJIFFI(c470590Icr)) {
                        PlaybookGetActiveContentResponse.ResponseData responseData = (PlaybookGetActiveContentResponse.ResponseData) c470590Icr.data;
                        if (responseData != null && (activePlaybook = responseData.activePlaybook) != null && activePlaybook.playStatus == 1) {
                            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                            C978360bZC.LJIIIZ = "auto_apply";
                            C978360bZC.LJIIJ = "live_stop_continue";
                            c20384514pX.LJJIII(activePlaybook, "resumeForLive", false, false);
                            Playbook playbook = activePlaybook.playbook;
                            if (playbook != null) {
                                c20384514pX.LJJJI(playbook);
                            }
                        } else {
                            c20384514pX.getClass();
                            C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorModel"), "resumeForLive, no activePlaybook", null, null);
                        }
                    }
                    C1C7U.LIZIZ("PlaybookAnchorModel@281.resumeForLive$1");
                }
            })), playbookAnchorViewModel.vQ2(), null, null, 30);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService
    public final String LJJIJLIJ() {
        return "PlaybookAnchorServiceV2";
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2$showPlaybookFavoritesListDialog$1$1] */
    public final void LJJJLIIL() {
        C20484615Do c20484615Do;
        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorServiceV2"), "showPlaybookFavoritesListDialog", null, null);
        BasePlaybookSheetFragment basePlaybookSheetFragment = this.LLJJ;
        if (basePlaybookSheetFragment != null) {
            basePlaybookSheetFragment.close(1);
        }
        BasePlaybookSheetFragment playbookFavoritesListV2Dialog = PlaybookEditorUgcSetting.INSTANCE.isUgcEnable() ? new PlaybookFavoritesListV2Dialog(this.LLJI, (PlaybookAnchorViewModel) this.LLILLJJLI) : new PlaybookFavoritesListDialog(this.LLJI, (PlaybookAnchorViewModel) this.LLILLJJLI);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2$showPlaybookFavoritesListDialog$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    this.LL.LLJJ = null;
                    LifecycleEventObserver lifecycleEventObserver = c259800zU.element;
                    if (lifecycleEventObserver != null) {
                        lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                    }
                }
            }
        };
        playbookFavoritesListV2Dialog.getLifecycle().addObserver((LifecycleObserver) c259800zU.element);
        this.LLJJ = playbookFavoritesListV2Dialog;
        if (this.LLJILLL == null || !this.LLJILJILJ) {
            C19322110iZ.LJFF(LJJJJJL(), playbookFavoritesListV2Dialog, "PlaybookFavoritesListDialog", null, 0);
            return;
        }
        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorServiceV2"), "showPlaybookFavoritesListDialog navigate", null, null);
        BasePlaybookSheetFragment basePlaybookSheetFragment2 = this.LLJILLL;
        if (basePlaybookSheetFragment2 == null || (c20484615Do = basePlaybookSheetFragment2.LLJJIJIL) == null) {
            return;
        }
        c20484615Do.LJIIJ(this.LLJJ, "PlaybookFavoritesListDialog");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.C0UTJ
    public final ActivePlaybook LIZIZ() {
        VM vm = this.LLILLJJLI;
        if (vm != 0) {
            return vm.wQ2().LJIIIZ;
        }
        return null;
    }

    @Override // X.C0UTJ
    public final String LIZJ() {
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        return C978360bZC.LJIILIIL;
    }

    @Override // X.C0UTJ
    public final String LJII() {
        C20379114of value;
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        C20357914lF config;
        VM vm = this.LLILLJJLI;
        if (vm == 0 || (value = vm.LLILLL.getValue()) == null || (c20360614lg = value.LIZIZ) == null || (list = c20360614lg.LIZIZ) == null) {
            return null;
        }
        Iterator<C20359414lU> it2 = list.iterator();
        while (it2.hasNext()) {
            for (C20361214lm c20361214lm : it2.next().LIZJ) {
                PlayRule playRule = c20361214lm.LIZLLL;
                if (Intrinsics.LJFF((playRule == null || (config = playRule.getConfig()) == null) ? null : config.LIZ, "room_title")) {
                    PlayRule playRule2 = c20361214lm.LIZLLL;
                    if (!(playRule2 instanceof RoomTitleEntity) || playRule2 == null) {
                        return null;
                    }
                    return RoomTitleEntity.LJJLIIIJ(c20361214lm.LJI);
                }
            }
        }
        return null;
    }

    @Override // X.C0UTJ
    public final Playbook LJIILJJIL() {
        C20379114of value;
        VM vm = this.LLILLJJLI;
        if (vm == 0 || (value = vm.LLILLL.getValue()) == null) {
            return null;
        }
        return value.LIZ;
    }

    @Override // X.C0UTJ
    public final List<String> LJIIZILJ() {
        C20379114of value;
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        C20357914lF config;
        VM vm = this.LLILLJJLI;
        ArrayList arrayList = null;
        if (vm != 0 && (value = vm.LLILLL.getValue()) != null && (c20360614lg = value.LIZIZ) != null && (list = c20360614lg.LIZIZ) != null) {
            Iterator<C20359414lU> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                for (C20361214lm c20361214lm : it2.next().LIZJ) {
                    PlayRule playRule = c20361214lm.LIZLLL;
                    if (Intrinsics.LJFF((playRule == null || (config = playRule.getConfig()) == null) ? null : config.LIZ, "effects")) {
                        SharedEffect sharedEffect = (SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null));
                        arrayList = new ArrayList();
                        if (!a0.LJJJIL(sharedEffect.id)) {
                            arrayList.add(sharedEffect.id);
                        }
                        if (!a0.LJJJIL(sharedEffect.backupResourceId)) {
                            arrayList.add(sharedEffect.backupResourceId);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.C0UTJ
    public final AbstractC20368114mt LJIJJLI() {
        Context context;
        PlaybookAnchorViewModel playbookAnchorViewModel;
        WeakReference<Fragment> weakReference = this.LLJIJIL;
        Fragment fragment = weakReference != null ? weakReference.get() : null;
        WeakReference<C19EG> weakReference2 = this.LLJILJIL;
        C19EG c19egLIZ = weakReference2 != null ? weakReference2.get() : null;
        if (fragment != null) {
            context = fragment.getContext();
            if (context == null) {
                if (c19egLIZ == null) {
                    c19egLIZ = C176600m4.LIZ();
                }
            }
            playbookAnchorViewModel = (PlaybookAnchorViewModel) this.LLILLJJLI;
            if (playbookAnchorViewModel == null && context != null) {
                return LiveCenterStructureOpt.INSTANCE.isEnable() ? new C20363214m6(context, playbookAnchorViewModel, this.LLJI) : new C20364414mI(context, playbookAnchorViewModel, this.LLJI);
            }
        }
        if (c19egLIZ == null) {
            return null;
        }
        context = c19egLIZ;
        playbookAnchorViewModel = (PlaybookAnchorViewModel) this.LLILLJJLI;
        return playbookAnchorViewModel == null ? null : null;
    }

    @Override // X.C0UTJ
    public final void LJJII() {
        PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) this.LLILLJJLI;
        if (playbookAnchorViewModel != null) {
            playbookAnchorViewModel.LLJJJJJIL.LJJJ("liveSceneChange");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService
    public final LiveData<List<PlaybookTagAggregation>> LJJIJIL() {
        PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) this.LLILLJJLI;
        if (playbookAnchorViewModel != null) {
            return playbookAnchorViewModel.LLJJIJI;
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService
    public final void LJJIL() {
        if (!PreviewEnterFpsOptSetting.INSTANCE.enable() || this.LLILLJJLI == 0) {
            WeakReference<Fragment> weakReference = this.LLJIJIL;
            final Fragment fragment = weakReference != null ? weakReference.get() : null;
            WeakReference<C19EG> weakReference2 = this.LLJILJIL;
            final C19EG c19eg = weakReference2 != null ? weakReference2.get() : null;
            if (fragment == null && c19eg == null) {
                return;
            }
            C20441214yg.LIZIZ("PlaybookAnchorServiceV2", "initViewModel");
            if (fragment != null) {
                if (fragment.isDetached()) {
                    return;
                }
                VM vm = (VM) ViewModelProviders.of(fragment, this.LLJJJIL).get(PlaybookAnchorViewModel.class);
                this.LLILLJJLI = vm;
                PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) vm;
                if (playbookAnchorViewModel != null) {
                    playbookAnchorViewModel.QQ2();
                }
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.14pk
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        MutableLiveData<List<PlaybookTagAggregation>> mutableLiveData;
                        C1C7U.LIZ("PlaybookAnchorServiceV2@ef9.initViewModel$1$1");
                        try {
                            final PlaybookAnchorServiceV2 playbookAnchorServiceV2 = this.LL;
                            PlaybookAnchorViewModel playbookAnchorViewModel2 = (PlaybookAnchorViewModel) playbookAnchorServiceV2.LLILLJJLI;
                            if (playbookAnchorViewModel2 != null && (mutableLiveData = playbookAnchorViewModel2.LLJJIJI) != null) {
                                mutableLiveData.observe(fragment, new Observer() { // from class: X.14q8
                                    @Override // androidx.lifecycle.Observer
                                    public final void onChanged(Object obj) {
                                        List<PlaybookTagAggregation> list = (List) obj;
                                        if (list != null) {
                                            playbookAnchorServiceV2.LLJJIJIL = list;
                                        }
                                    }
                                });
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PlaybookAnchorServiceV2@ef9.initViewModel$1$1");
                    }
                });
                return;
            }
            if (c19eg == null || c19eg.isDestroyed()) {
                return;
            }
            VM vm2 = (VM) ViewModelProviders.of(c19eg, this.LLJJJIL).get(PlaybookAnchorViewModel.class);
            this.LLILLJJLI = vm2;
            PlaybookAnchorViewModel playbookAnchorViewModel2 = (PlaybookAnchorViewModel) vm2;
            if (playbookAnchorViewModel2 != null) {
                playbookAnchorViewModel2.QQ2();
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.14pl
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    MutableLiveData<List<PlaybookTagAggregation>> mutableLiveData;
                    C1C7U.LIZ("PlaybookAnchorServiceV2@ef9.initViewModel$2$1$1");
                    try {
                        final PlaybookAnchorServiceV2 playbookAnchorServiceV2 = this.LL;
                        PlaybookAnchorViewModel playbookAnchorViewModel3 = (PlaybookAnchorViewModel) playbookAnchorServiceV2.LLILLJJLI;
                        if (playbookAnchorViewModel3 != null && (mutableLiveData = playbookAnchorViewModel3.LLJJIJI) != null) {
                            mutableLiveData.observe(c19eg, new Observer() { // from class: X.14q9
                                @Override // androidx.lifecycle.Observer
                                public final void onChanged(Object obj) {
                                    List<PlaybookTagAggregation> list = (List) obj;
                                    if (list != null) {
                                        playbookAnchorServiceV2.LLJJIJIL = list;
                                    }
                                }
                            });
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PlaybookAnchorServiceV2@ef9.initViewModel$2$1$1");
                }
            });
        }
    }

    public final FragmentManager LJJJJJL() {
        C19EG c19eg;
        Fragment fragment;
        FragmentManager childFragmentManager;
        WeakReference<Fragment> weakReference = this.LLJIJIL;
        if (weakReference != null && (fragment = weakReference.get()) != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
            return childFragmentManager;
        }
        WeakReference<C19EG> weakReference2 = this.LLJILJIL;
        if (weakReference2 == null || (c19eg = weakReference2.get()) == null) {
            return null;
        }
        return c19eg.getSupportFragmentManager();
    }

    public final Context LJJJJLI() {
        Fragment fragment;
        Context context;
        WeakReference<Fragment> weakReference = this.LLJIJIL;
        if (weakReference != null && (fragment = weakReference.get()) != null && (context = fragment.getContext()) != null) {
            return context;
        }
        WeakReference<C19EG> weakReference2 = this.LLJILJIL;
        if (weakReference2 != null) {
            return weakReference2.get();
        }
        return null;
    }

    @Override // X.C0UTJ
    public final C11QI LJIILL() {
        C480460Ism.LIZ().getClass();
        IMultiGuestPlayApi iMultiGuestPlayApi = (IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class);
        UpdateUserPlaySettingsParams updateUserPlaySettingsParams = new UpdateUserPlaySettingsParams();
        HashMap map = new HashMap();
        map.put("playbook_save_reference_playbook_id", 0L);
        map.put("playbook_save_reference_playbook_content_id", 0L);
        updateUserPlaySettingsParams.settingsMap = map;
        updateUserPlaySettingsParams.settingsStrMap = new LinkedHashMap();
        return new C11QI(C01NB.LIZ(C01NB.LIZIZ(iMultiGuestPlayApi.updateUserPlaySettings(updateUserPlaySettingsParams), "PlaybookAnchorServiceV2", "updateUserPlaySettings").LJFF(new C0UO0()).LJIILL(new C09JN() { // from class: X.00Qj
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PlaybookAnchorServiceV2@ef9.removeSaveReferenceInInsight$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeSaveReferenceInInsight resp=");
                sbLIZ.append(obj);
                C20441214yg.LIZIZ("PlaybookAnchorServiceV2", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("PlaybookAnchorServiceV2@ef9.removeSaveReferenceInInsight$2");
            }
        })));
    }

    @Override // X.C0UTJ
    public final C19482011Jy LJJ() {
        C480460Ism.LIZ().getClass();
        IMultiGuestPlayApi iMultiGuestPlayApi = (IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class);
        GetUserPlaySettingsParams getUserPlaySettingsParams = new GetUserPlaySettingsParams();
        getUserPlaySettingsParams.settingKeys = C1697810uHb.LJIILJJIL("playbook_save_reference_playbook_id", "playbook_save_reference_playbook_content_id");
        return C01NB.LIZIZ(iMultiGuestPlayApi.getUserPlaySettings(getUserPlaySettingsParams), "PlaybookAnchorServiceV2", "getUserPlaySettings").LJFF(new C0UO0()).LJIL(new InterfaceC1487280oo2() { // from class: X.01Ii
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                return new Pair(String.valueOf(C01JX.LJIIIZ((GetUserPlaySettingsResponse.ResponseData) baseResponse.data, "playbook_save_reference_playbook_id", 0L)), String.valueOf(C01JX.LJIIIZ((GetUserPlaySettingsResponse.ResponseData) baseResponse.data, "playbook_save_reference_playbook_content_id", 0L)));
            }
        });
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService
    public final String LJJIJIIJI() {
        return C500260Jjc.LJJIL() ? "preview" : C0IUA.LJIJI;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService
    public final void LJJJIL() {
        super.LJJJIL();
        C20441214yg.LIZIZ("PlaybookAnchorServiceV2", "clearCache");
        VM vm = this.LLILLJJLI;
        if (vm != 0) {
            vm.clearCache();
        }
        C978360bZC.LJIILL = null;
        ((LinkedHashMap) C978360bZC.LJIILLIIL).clear();
        LJJJJI(this);
        if (C500260Jjc.LJIL()) {
            return;
        }
        C01OF.LIZJ();
    }

    @Override // X.C0UTJ
    public final void destroy() {
        LJJJIL();
        C20441214yg.LJIIIZ("PlaybookAnchorServiceV2", "destroy");
    }

    public static void LJJJJI(PlaybookAnchorServiceV2 playbookAnchorServiceV2) {
        LJJJJIZL(playbookAnchorServiceV2.LLJILLL, null);
        playbookAnchorServiceV2.LLJILLL = null;
        LJJJJIZL(playbookAnchorServiceV2.LLJJ, null);
        playbookAnchorServiceV2.LLJJ = null;
        PlaybookAnchorDetailDialog playbookAnchorDetailDialog = playbookAnchorServiceV2.LLJJIII;
        if (playbookAnchorDetailDialog != null) {
            playbookAnchorDetailDialog.LLLILZJ = false;
        }
        LJJJJIZL(playbookAnchorDetailDialog, null);
        playbookAnchorServiceV2.LLJJIII = null;
        Iterator it2 = ((LinkedHashMap) playbookAnchorServiceV2.LLJJI).values().iterator();
        while (it2.hasNext()) {
            ((LiveSheetFragment) it2.next()).close(1);
        }
        ((LinkedHashMap) playbookAnchorServiceV2.LLJJI).clear();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2$showPlaybookListDialog$1$1] */
    @Override // X.C0UTJ
    public final void LIZ(final C0UPI c0upi) {
        String strLIZ = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPlaybookListDialog, openPlaybookListDialogParams=");
        sbLIZ.append(c0upi);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LiveSheetFragment liveSheetFragment = (LiveSheetFragment) ((LinkedHashMap) this.LLJJI).get(c0upi.LIZ);
        if (liveSheetFragment != null) {
            liveSheetFragment.close(1);
        }
        Map<EnumC20429414wm, PlaybookListDialog> map = this.LLJJI;
        EnumC20429414wm enumC20429414wm = c0upi.LIZ;
        PlaybookListDialog playbookListDialog = new PlaybookListDialog(this.LLJI, (PlaybookAnchorViewModel) this.LLILLJJLI, c0upi);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2$showPlaybookListDialog$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    this.LL.LLJJI.remove(c0upi.LIZ);
                    LifecycleEventObserver lifecycleEventObserver = c259800zU.element;
                    if (lifecycleEventObserver != null) {
                        lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                    }
                }
            }
        };
        playbookListDialog.getLifecycle().addObserver((LifecycleObserver) c259800zU.element);
        map.put(enumC20429414wm, playbookListDialog);
        C20484615Do c20484615Do = c0upi.LIZJ;
        if (c20484615Do != null) {
            C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorServiceV2"), "sheetController navigate", null, null);
            c20484615Do.LJIIJ((InterfaceC20484815Dq) ((LinkedHashMap) this.LLJJI).get(c0upi.LIZ), "PlaybookListDialog");
            return;
        }
        LiveSheetFragment liveSheetFragment2 = (LiveSheetFragment) ((LinkedHashMap) this.LLJJI).get(c0upi.LIZ);
        if (liveSheetFragment2 != null) {
            C19322110iZ.LJFF(LJJJJJL(), liveSheetFragment2, "PlaybookListDialog", null, 0);
        }
    }

    @Override // X.C0UTJ
    public final void LJIIJJI(Function0<Unit> function0) {
        C500260Jjc.LJJLIIIJJI(0L, function0);
    }

    @Override // X.C0UTJ
    public final void LJIJI(String str) {
        String strLIZ = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("closeAllDialog source:");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LJJJJI(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    @Override // X.C0UTJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(final X.C20386714pt r10) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2.LJJIII(X.14pt):void");
    }

    @Override // X.C0UTJ
    public final void LJJIIJ(boolean z) {
        this.LLJI.SX0(C1083530eIp.class, Boolean.valueOf(z));
    }

    @Override // X.C0UTJ
    public final void LJJIIJZLJL(Uri uri) {
        C19EG c19eg;
        Fragment fragment;
        String strLIZ = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openEntityFromScheme uri:");
        sbLIZ.append(uri);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        WeakReference<Fragment> weakReference = this.LLJIJIL;
        String str = "";
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            C20360714lh c20360714lh = (C20360714lh) this.LLJJJ.getValue();
            String strLIZIZ = C1942307jB.LIZIZ(uri, "type");
            if (strLIZIZ != null) {
                str = strLIZIZ;
            }
            c20360714lh.LJFF(str, uri, fragment);
            return;
        }
        WeakReference<C19EG> weakReference2 = this.LLJILJIL;
        if (weakReference2 == null || (c19eg = weakReference2.get()) == null) {
            return;
        }
        C20360714lh c20360714lh2 = (C20360714lh) this.LLJJJ.getValue();
        String strLIZIZ2 = C1942307jB.LIZIZ(uri, "type");
        if (strLIZIZ2 != null) {
            str = strLIZIZ2;
        }
        c20360714lh2.LJFF(str, uri, c19eg);
    }

    public final void LJJJJ(EnumC20429314wl enumC20429314wl) {
        C1868930yjb c1868930yjb;
        VM vm;
        Integer numValueOf;
        C20484615Do c20484615Do;
        Integer numValueOf2;
        String strLIZ = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("back2PolymerizationDialog entranceType:");
        sbLIZ.append(enumC20429314wl);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        BasePlaybookSheetFragment basePlaybookSheetFragment = this.LLJILLL;
        if (basePlaybookSheetFragment != null && basePlaybookSheetFragment.isAdded()) {
            BasePlaybookSheetFragment basePlaybookSheetFragment2 = this.LLJILLL;
            if (basePlaybookSheetFragment2 != null && (c20484615Do = basePlaybookSheetFragment2.LLJJIJIL) != null && c20484615Do.LJ("PlaybookFavoritesListDialog")) {
                this.LLJJ = null;
                BasePlaybookSheetFragment basePlaybookSheetFragment3 = this.LLJILLL;
                if (basePlaybookSheetFragment3 != null) {
                    basePlaybookSheetFragment3.sl();
                }
                String strLIZ2 = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("back2PolymerizationDialog navigate ");
                BasePlaybookSheetFragment basePlaybookSheetFragment4 = this.LLJILLL;
                if (basePlaybookSheetFragment4 != null) {
                    numValueOf2 = Integer.valueOf(basePlaybookSheetFragment4.hashCode());
                } else {
                    numValueOf2 = null;
                }
                sbLIZ2.append(numValueOf2);
                C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            } else {
                String strLIZ3 = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("back2PolymerizationDialog closeDetailDialog  ");
                BasePlaybookSheetFragment basePlaybookSheetFragment5 = this.LLJILLL;
                if (basePlaybookSheetFragment5 != null) {
                    numValueOf = Integer.valueOf(basePlaybookSheetFragment5.hashCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ3.append(numValueOf);
                C1AZW.LJIIJ(12, strLIZ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
            }
            this.LLJI.FQ2(PlaybookLoadFetchListEvent.class);
            return;
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        if (enumC20429314wl == null && ((vm = this.LLILLJJLI) == 0 || (enumC20429314wl = vm.LLIZLLLIL) == null)) {
            enumC20429314wl = EnumC20429314wl.MULTI_GUEST;
        }
        if (C20387014pw.LIZIZ[enumC20429314wl.ordinal()] == 3) {
            c1868930yjb = new C1868930yjb(EnumC20429314wl.INTERACT, null);
        } else {
            c1868930yjb = new C1868930yjb(enumC20429314wl, null);
        }
        LJJJLZIJ(true, "", c915190ZvJ, c1868930yjb);
    }

    public final String LJJJJL(Playbook playbook) {
        C20384514pX c20384514pX;
        PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) this.LLILLJJLI;
        Long lValueOf = null;
        if (playbookAnchorViewModel == null || (c20384514pX = playbookAnchorViewModel.LLJJJJJIL) == null) {
            return null;
        }
        Long lValueOf2 = Long.valueOf(playbook.playbookId);
        PlaybookContent playbookContent = playbook.content;
        if (playbookContent != null) {
            lValueOf = Long.valueOf(playbookContent.originalPlaybookContentId);
        }
        return c20384514pX.LJI(PlaybookUtilKt.LJIJ(lValueOf2, lValueOf));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService, androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        Fragment fragment;
        super.onCreate(lifecycleOwner);
        if (!C500260Jjc.LJIL()) {
            DataChannel dataChannel = this.LLJI;
            WeakReference<Fragment> weakReference = this.LLJIJIL;
            C19EG c19eg = null;
            if (weakReference != null) {
                fragment = weakReference.get();
            } else {
                fragment = null;
            }
            WeakReference<C19EG> weakReference2 = this.LLJILJIL;
            if (weakReference2 != null) {
                c19eg = weakReference2.get();
            }
            C01OF.LIZ(dataChannel, fragment, c19eg, 8);
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIILL = this.LLILLJJLI;
        C500260Jjc.LJJLIIIJJI(3000L, new C20384714pZ(this));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService, androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        MutableLiveData<ActivePlaybook> mutableLiveData;
        C20384514pX c20384514pX;
        super.onDestroy(lifecycleOwner);
        PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) this.LLILLJJLI;
        if (playbookAnchorViewModel != null && (c20384514pX = playbookAnchorViewModel.LLJJJJJIL) != null) {
            c20384514pX.LJJIII(null, "clear", false, true);
        }
        VM vm = this.LLILLJJLI;
        if (vm != 0 && (mutableLiveData = vm.LLILLJJLI) != null) {
            mutableLiveData.setValue(null);
        }
        this.LLJI.zW(PlaybookAnchorServiceV2Channel.class, new C784930Uqh(null));
    }

    public static void LJJJJIZL(LiveSheetFragment liveSheetFragment, Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (liveSheetFragment != null) {
                liveSheetFragment.close(iIntValue);
                if (Unit.LIZ != null) {
                    return;
                }
            } else {
                return;
            }
        }
        if (liveSheetFragment != null) {
            liveSheetFragment.close();
        }
    }

    @Override // X.C0UTJ
    public final C11QI LJ(long j, long j2) {
        C480460Ism.LIZ().getClass();
        IMultiGuestPlayApi iMultiGuestPlayApi = (IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class);
        UpdateUserPlaySettingsParams updateUserPlaySettingsParams = new UpdateUserPlaySettingsParams();
        HashMap map = new HashMap();
        map.put("playbook_save_reference_playbook_id", Long.valueOf(j));
        map.put("playbook_save_reference_playbook_content_id", Long.valueOf(j2));
        updateUserPlaySettingsParams.settingsMap = map;
        updateUserPlaySettingsParams.settingsStrMap = new LinkedHashMap();
        return new C11QI(C01NB.LIZ(C01NB.LIZIZ(iMultiGuestPlayApi.updateUserPlaySettings(updateUserPlaySettingsParams), "PlaybookAnchorServiceV2", "updateUserPlaySettings").LJFF(new C0UO0()).LJIILL(new C09JN() { // from class: X.00Qk
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PlaybookAnchorServiceV2@ef9.updateSaveReferenceInInsight$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateSaveAsReference resp=");
                sbLIZ.append(obj);
                C20441214yg.LIZIZ("PlaybookAnchorServiceV2", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("PlaybookAnchorServiceV2@ef9.updateSaveReferenceInInsight$2");
            }
        })));
    }

    @Override // X.C0UTJ
    public final void LJIIIIZZ(C915190ZvJ c915190ZvJ, String str) {
        if (!PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
            return;
        }
        LJJJ(null, this.LLJI, null, LJJJJJL(), str, c915190ZvJ);
    }

    @Override // X.C0UTJ
    public final void LJIIIZ(String str, Playbook playbook) {
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIILIIL(this.LLJI, str, playbook, false, null, 0, 0L, 64);
    }

    @Override // X.C0UTJ
    public final void LJIIL(Long l, boolean z) {
        C978360bZC.LJIJ("edit_playbook", "create", l, "create", z, null, null);
    }

    public final void LJJJJJ(final C20361214lm c20361214lm, Context context) {
        final Playbook playbook;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
            VM vm = this.LLILLJJLI;
            Long lValueOf = null;
            if (vm != 0 && (mutableLiveData = vm.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
                playbook = value.playbook;
            } else {
                playbook = null;
            }
            PlayRule playRule = c20361214lm.LIZLLL;
            if (playRule != null) {
                if (playbook != null) {
                    lValueOf = Long.valueOf(playbook.playbookId);
                }
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                playRule.LJ(c20361214lm, "liveCenter", new C334801Rq("playbook", lValueOf, C978360bZC.LIZLLL()), new InterfaceC953350aur() { // from class: X.14mG
                    @Override // X.InterfaceC953350aur
                    public final void LIZIZ() {
                        this.LIZ.LLJI.FQ2(LiveCenterDismissEvent.class);
                        PlayRule playRule2 = c20361214lm.LIZLLL;
                        if (playRule2 != null) {
                            playRule2.LJIL();
                        }
                    }

                    @Override // X.InterfaceC953350aur
                    public final void LIZ(boolean z, boolean z2) {
                        if (z) {
                            C766270U4b.LIZLLL(2131855275);
                        }
                        if (z2) {
                            PlaybookAnchorServiceV2 playbookAnchorServiceV2 = this.LIZ;
                            Playbook playbook2 = playbook;
                            C20382814pG c20382814pG = new C20382814pG(0L, 0L, false, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1);
                            c20382814pG.LJJIJ = true;
                            playbookAnchorServiceV2.LJJJJLL(playbook2, c20382814pG, c20361214lm, new C20364314mH());
                        }
                        PlayRule playRule2 = c20361214lm.LIZLLL;
                        if (playRule2 != null) {
                            playRule2.LJIL();
                        }
                    }
                }, context);
            }
        }
    }

    @Override // X.C0UTJ
    public final void LJI(Playbook playbook, InterfaceC170900l9<C470590Icr<PlaybookRepublishResponse.ResponseData>> interfaceC170900l9, C11NJ c11nj) {
        PublishPlaybookContent publishPlaybookContentLJI;
        DataChannel dataChannel = this.LLJI;
        C480460Ism.LIZ().getClass();
        IPlaybookApi iPlaybookApi = (IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class);
        PlaybookRepublishParams playbookRepublishParams = new PlaybookRepublishParams();
        PlaybookContent playbookContent = playbook.content;
        if (playbookContent != null) {
            publishPlaybookContentLJI = PlaybookUtilKt.LJI(playbookContent);
        } else {
            publishPlaybookContentLJI = null;
        }
        playbookRepublishParams.publishPlaybookContent = publishPlaybookContentLJI;
        playbookRepublishParams.playbookId = playbook.playbookId;
        C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(iPlaybookApi.republish(playbookRepublishParams), "Editor_PlaybookEditorModel", "publish")).LJFF(new C0UO0()), c11nj, new C515801zg(dataChannel, interfaceC170900l9, 58), new C516201zk(interfaceC170900l9, 278), 24);
    }

    @Override // X.C0UTJ
    public final void LJIJJ(int i, long j, Function1 function1) {
        PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) this.LLILLJJLI;
        if (playbookAnchorViewModel != null) {
            playbookAnchorViewModel.LLJJJJJIL.getClass();
            C480460Ism.LIZ().getClass();
            IPlaybookApi iPlaybookApi = (IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class);
            PlaybookUpdateUserSettingParams playbookUpdateUserSettingParams = new PlaybookUpdateUserSettingParams();
            playbookUpdateUserSettingParams.playbookId = j;
            playbookUpdateUserSettingParams.automationUserSetting = i;
            final AwS610S0100000_31 awS610S0100000_31 = (AwS610S0100000_31) function1;
            C19487311Lz.LIZJ(C01NB.LIZIZ(iPlaybookApi.updateUserSetting(playbookUpdateUserSettingParams), "PlaybookAnchorModel", "updateUserSetting").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.00Ss
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PlaybookAnchorModel@281.updateUserSetting$2");
                    awS610S0100000_31.invoke(Boolean.TRUE);
                    C1C7U.LIZIZ("PlaybookAnchorModel@281.updateUserSetting$2");
                }
            }).LJIIL(new C09JN() { // from class: X.00St
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PlaybookAnchorModel@281.updateUserSetting$3");
                    awS610S0100000_31.invoke(Boolean.FALSE);
                    C1C7U.LIZIZ("PlaybookAnchorModel@281.updateUserSetting$3");
                }
            }), playbookAnchorViewModel.vQ2(), null, null, 30);
        }
    }

    @Override // X.C0UTJ
    public final void LJIL(EnumC20429414wm enumC20429414wm, String str, Integer num) {
        String strLIZ = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("closePlaybookDialog, dialogType=");
        sbLIZ.append(enumC20429414wm);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(", cause=");
        sbLIZ.append(num);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        int i = C20387014pw.LIZ[enumC20429414wm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LJJJJIZL(this.LLJJ, num);
                        this.LLJJ = null;
                        return;
                    }
                    throw new C1954807lC();
                }
                LJJJJIZL((LiveSheetFragment) ((LinkedHashMap) this.LLJJI).get(enumC20429414wm), num);
                this.LLJJI.remove(enumC20429414wm);
                return;
            }
            LJJJJIZL(this.LLJILLL, num);
            this.LLJILLL = null;
            return;
        }
        PlaybookAnchorDetailDialog playbookAnchorDetailDialog = this.LLJJIII;
        if (playbookAnchorDetailDialog != null) {
            playbookAnchorDetailDialog.LLLILZJ = false;
        }
        LJJJJIZL(playbookAnchorDetailDialog, num);
        this.LLJJIII = null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.14mZ] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.01OW] */
    public PlaybookAnchorServiceV2(final DataChannel dataChannel, WeakReference<Fragment> weakReference, WeakReference<C19EG> weakReference2, boolean z) {
        super(dataChannel);
        this.LLJI = dataChannel;
        this.LLJIJIL = weakReference;
        this.LLJILJIL = weakReference2;
        this.LLJILJILJ = z;
        this.LLJJI = new LinkedHashMap();
        this.LLJJJ = C452501pT.LIZIZ(new C20360914lj(this));
        final WeakReference weakReference3 = new WeakReference(LJJJJLI());
        this.LLJJJIL = new ViewModelProvider.Factory(dataChannel, weakReference3) { // from class: X.01OW
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
                if (cls.isAssignableFrom(PlaybookAnchorViewModel.class)) {
                    return new PlaybookAnchorViewModel(this.LIZ, this.LIZIZ);
                }
                throw new IllegalArgumentException("Unknown ViewModel class");
            }

            {
                this.LIZ = dataChannel;
                this.LIZIZ = weakReference3;
            }
        };
        this.LLJJJJ = new InterfaceC20357214l8() { // from class: X.14mZ
            public WeakReference<C20361214lm> LIZ;
            public long LIZIZ;

            @Override // X.InterfaceC20354714kj
            public final void LIZ() {
            }

            @Override // X.InterfaceC20354714kj
            public final void LJ() {
            }

            @Override // X.InterfaceC20354714kj
            public final void LJFF(int i, long j) {
            }

            @Override // X.InterfaceC20354714kj
            public final void LJII() {
            }

            @Override // X.InterfaceC20354714kj
            public final void LJIIJ() {
            }

            public static String LJIIJJI() {
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                return c915190ZvJ.LIZIZ ? c915190ZvJ.LIZ : "";
            }

            public final Playbook LJIIL() {
                MutableLiveData<ActivePlaybook> mutableLiveData;
                ActivePlaybook value;
                VM vm = this.LIZJ.LLILLJJLI;
                if (vm == 0 || (mutableLiveData = vm.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null) {
                    return null;
                }
                return value.playbook;
            }

            public final long LJIILIIL() {
                MutableLiveData<ActivePlaybook> mutableLiveData;
                ActivePlaybook value;
                VM vm = this.LIZJ.LLILLJJLI;
                if (vm == 0 || (mutableLiveData = vm.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null) {
                    return 0L;
                }
                return value.playId;
            }

            @Override // X.InterfaceC20357214l8
            public final void LIZLLL(WeakReference<C20361214lm> weakReference4) {
                this.LIZ = weakReference4;
            }

            @Override // X.InterfaceC20354714kj
            public final void LJI(long j) {
                C20361214lm c20361214lm;
                WeakReference<C20361214lm> weakReference4 = this.LIZ;
                if (weakReference4 != null && (c20361214lm = weakReference4.get()) != null) {
                    C985720bl4.LIZ.LJII(c20361214lm.LIZLLL, LJIIL(), j, "use", LJIIJJI(), null, LJIILIIL(), true);
                }
            }

            @Override // X.InterfaceC20357214l8
            public final void LJIIIZ(long j) {
                this.LIZIZ = j;
            }

            @Override // X.InterfaceC20354714kj
            public final void LIZJ(String str, long j) {
                C20361214lm c20361214lm;
                WeakReference<C20361214lm> weakReference4 = this.LIZ;
                if (weakReference4 != null && (c20361214lm = weakReference4.get()) != null) {
                    C985720bl4.LIZ.LJFF(c20361214lm.LIZLLL, LJIIL(), j, str, "use", LJIIJJI(), System.currentTimeMillis() - this.LIZIZ, LJIILIIL(), null, true);
                }
            }

            @Override // X.InterfaceC20354714kj
            public final void LJIIIIZZ(int i, long j) {
                C20361214lm c20361214lm;
                int iDQ2;
                long j2;
                Playbook playbook;
                MutableLiveData<ActivePlaybook> mutableLiveData;
                ActivePlaybook value;
                MutableLiveData<ActivePlaybook> mutableLiveData2;
                ActivePlaybook value2;
                Playbook playbook2;
                WeakReference<C20361214lm> weakReference4 = this.LIZ;
                if (weakReference4 != null && (c20361214lm = weakReference4.get()) != null) {
                    PlaybookAnchorServiceV2 playbookAnchorServiceV2 = this.LIZJ;
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    DataChannel dataChannel2 = playbookAnchorServiceV2.LLJI;
                    String str = c20361214lm.LIZ;
                    VM vm = playbookAnchorServiceV2.LLILLJJLI;
                    if (vm != 0) {
                        iDQ2 = vm.DQ2(c20361214lm);
                    } else {
                        iDQ2 = -1;
                    }
                    int i2 = iDQ2 + 1;
                    VM vm2 = playbookAnchorServiceV2.LLILLJJLI;
                    if (vm2 != 0 && (mutableLiveData2 = vm2.LLILLJJLI) != null && (value2 = mutableLiveData2.getValue()) != null && (playbook2 = value2.playbook) != null) {
                        j2 = playbook2.playbookId;
                    } else {
                        j2 = 0;
                    }
                    VM vm3 = playbookAnchorServiceV2.LLILLJJLI;
                    if (vm3 != 0 && (mutableLiveData = vm3.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
                        playbook = value.playbook;
                    } else {
                        playbook = null;
                    }
                    C978360bZC.LJIILJJIL(dataChannel2, "auto_step_show", str, i2, j2, true, "", playbook, c20361214lm.LIZLLL, true, 1024);
                    C985720bl4.LIZ.LJII(c20361214lm.LIZLLL, LJIIL(), 0L, "use", LJIIJJI(), C935410aRv.LIZIZ(playbookAnchorServiceV2.LLJI, C2097608Jq.LJIIIIZZ(new Pair("name", c20361214lm.LIZ), new Pair("action", "show"))), LJIILIIL(), true);
                }
            }

            @Override // X.InterfaceC20354714kj
            public final void LIZIZ(long j, String str, boolean z2) {
                C20361214lm c20361214lm;
                WeakReference<C20361214lm> weakReference4 = this.LIZ;
                if (weakReference4 != null && (c20361214lm = weakReference4.get()) != null) {
                    PlaybookAnchorServiceV2 playbookAnchorServiceV2 = this.LIZJ;
                    if (z2) {
                        C985720bl4.LIZ.LJFF(c20361214lm.LIZLLL, LJIIL(), 0L, "", "use", LJIIJJI(), System.currentTimeMillis() - this.LIZIZ, LJIILIIL(), C935410aRv.LIZIZ(playbookAnchorServiceV2.LLJI, C2097608Jq.LJIIIIZZ(new Pair("name", c20361214lm.LIZ), new Pair("action", "save"), new Pair("task", c20361214lm))), true);
                    }
                }
            }
        };
        LJJIL();
        dataChannel.zW(PlaybookAnchorServiceV2Channel.class, new C784930Uqh(this));
        dataChannel.SX0(C956690b0F.class, Boolean.valueOf(z));
        dataChannel.FQ2(PlaybookAnchorServiceInitSuccessEvent.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[PHI: r7
      0x001c: PHI (r7v1 webcast.data.multi_guest_play.Playbook) = (r7v0 webcast.data.multi_guest_play.Playbook), (r7v5 webcast.data.multi_guest_play.Playbook) binds: [B:3:0x0006, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLL(webcast.data.multi_guest_play.Playbook r23, final X.C20382814pG r24, final X.C20361214lm r25, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r26) {
        /*
            r22 = this;
            r7 = r23
            r19 = 0
            r5 = r22
            if (r7 != 0) goto L1c
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel r0 = r5.LLILLJJLI
            if (r0 == 0) goto L99
            androidx.lifecycle.MutableLiveData<X.14of> r0 = r0.LLILLL
            if (r0 == 0) goto L99
            java.lang.Object r0 = r0.getValue()
            X.14of r0 = (X.C20379114of) r0
            if (r0 == 0) goto L99
            webcast.data.multi_guest_play.Playbook r7 = r0.LIZ
            if (r7 == 0) goto L9b
        L1c:
            long r0 = r7.playbookId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto L9b
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel r0 = r5.LLILLJJLI
            if (r0 == 0) goto L9b
            androidx.lifecycle.MutableLiveData<webcast.data.multi_guest_play.ActivePlaybook> r0 = r0.LLILLJJLI
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r0.getValue()
            webcast.data.multi_guest_play.ActivePlaybook r0 = (webcast.data.multi_guest_play.ActivePlaybook) r0
            if (r0 == 0) goto L9b
            webcast.data.multi_guest_play.Playbook r0 = r0.playbook
            if (r0 == 0) goto L9b
            long r3 = r7.playbookId
            long r1 = r0.playbookId
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L9b
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel r0 = r5.LLILLJJLI
            if (r0 == 0) goto L9b
            androidx.lifecycle.MutableLiveData<webcast.data.multi_guest_play.ActivePlaybook> r0 = r0.LLILLJJLI
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r0.getValue()
            webcast.data.multi_guest_play.ActivePlaybook r0 = (webcast.data.multi_guest_play.ActivePlaybook) r0
            if (r0 == 0) goto L9b
            long r9 = r0.playId
        L52:
            X.00zU r12 = new X.00zU
            r12.<init>()
            r0 = r26
            r12.element = r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment r0 = r5.LLJILLL
            if (r0 == 0) goto L97
            r13 = 1
        L60:
            X.0ZvJ r0 = X.C978360bZC.LIZJ
            X.0ZvJ r1 = X.C978360bZC.LIZJ
            boolean r0 = r1.LIZIZ
            if (r0 == 0) goto L94
            java.lang.String r8 = r1.LIZ
        L6a:
            long r3 = java.lang.System.currentTimeMillis()
            r6 = r25
            com.bytedance.android.livesdk.entity.PlayRule r14 = r6.LIZLLL
            if (r14 == 0) goto L93
            X.14ma r2 = new X.14ma
            r11 = r24
            r2.<init>()
            java.lang.String r18 = "playbook"
            if (r7 == 0) goto L85
            long r0 = r7.playbookId
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
        L85:
            java.lang.String r20 = X.C978360bZC.LIZLLL()
            java.lang.String r21 = ""
            r15 = r6
            r16 = r2
            r17 = r5
            r14.LJJ(r15, r16, r17, r18, r19, r20, r21)
        L93:
            return
        L94:
            java.lang.String r8 = ""
            goto L6a
        L97:
            r13 = 0
            goto L60
        L99:
            r7 = r19
        L9b:
            r9 = 0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2.LJJJJLL(webcast.data.multi_guest_play.Playbook, X.14pG, X.14lm, kotlin.jvm.functions.Function1):void");
    }

    public final void LJJJJZI(long j, String str, EnumC20429314wl enumC20429314wl, int i) {
        long j2;
        long j3;
        Integer numValueOf;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        PlaybookContent playbookContent;
        MutableLiveData<ActivePlaybook> mutableLiveData2;
        ActivePlaybook value2;
        Playbook playbook2;
        FragmentManager fragmentManagerLJJJJJL = LJJJJJL();
        if (fragmentManagerLJJJJJL != null && !fragmentManagerLJJJJJL.LJLJJI() && !fragmentManagerLJJJJJL.LJL()) {
            String strLIZ = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showPlaybookDetailDialog playId:");
            sbLIZ.append(j);
            sbLIZ.append(" source:");
            sbLIZ.append(str);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            VM vm = this.LLILLJJLI;
            if (vm != 0) {
                vm.LLIZLLLIL = enumC20429314wl;
            }
            if (!LJJIIZ("normal_detail_page")) {
                C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorServiceV2"), "showPlaybookDetailDialog return as symphonyEngine not ready", null, null);
                return;
            }
            PlaybookAnchorDetailDialog playbookAnchorDetailDialog = this.LLJJIII;
            if (playbookAnchorDetailDialog != null) {
                playbookAnchorDetailDialog.close(1);
            }
            String str2 = PlaybookAnchorDetailDialog._pnsPageId;
            PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) this.LLILLJJLI;
            DataChannel dataChannel = this.LLJI;
            if (playbookAnchorViewModel != null && (mutableLiveData2 = playbookAnchorViewModel.LLILLJJLI) != null && (value2 = mutableLiveData2.getValue()) != null && (playbook2 = value2.playbook) != null) {
                j2 = playbook2.playbookId;
            } else {
                j2 = 0;
            }
            VM vm2 = this.LLILLJJLI;
            if (vm2 != 0 && (mutableLiveData = vm2.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.playbook) != null && (playbookContent = playbook.content) != null) {
                j3 = playbookContent.playbookContentId;
            } else {
                j3 = 0;
            }
            PlaybookAnchorDetailDialog playbookAnchorDetailDialogLIZ = C20382314pB.LIZ(playbookAnchorViewModel, dataChannel, new C20382814pG(j2, j3, false, false, false, null, null, null, false, i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1028), j, str);
            this.LLJJIII = playbookAnchorDetailDialogLIZ;
            playbookAnchorDetailDialogLIZ.LLLFFI = new C20387914q5(this, this.LLJJIJIIJIL);
            String strLIZ2 = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showPlaybookDetailDialog playId:");
            sbLIZ2.append(j);
            sbLIZ2.append(" source:");
            sbLIZ2.append(str);
            sbLIZ2.append(" show:");
            PlaybookAnchorDetailDialog playbookAnchorDetailDialog2 = this.LLJJIII;
            if (playbookAnchorDetailDialog2 != null) {
                numValueOf = Integer.valueOf(playbookAnchorDetailDialog2.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C978360bZC.LJJIJ(new C915190ZvJ("playbook_detail_panel", false, 4));
            PlaybookAnchorDetailDialog playbookAnchorDetailDialog3 = this.LLJJIII;
            if (playbookAnchorDetailDialog3 != null) {
                C19322110iZ.LJFF(fragmentManagerLJJJJJL, playbookAnchorDetailDialog3, "PlaybookAnchorDetailDialog", null, 0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2$showPolymerizationDialog$4$1] */
    public final void LJJJLZIJ(boolean z, String str, C915190ZvJ c915190ZvJ, C1868930yjb c1868930yjb) {
        Integer numValueOf;
        Playbook playbook;
        long j;
        BasePlaybookSheetFragment playbookPolymerizationDialog;
        Integer numValueOf2;
        PlaybookContent playbookContent;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        String strLIZ = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPolymerizationDialog force:");
        sbLIZ.append(z);
        sbLIZ.append(" fromPage:");
        sbLIZ.append(c915190ZvJ);
        sbLIZ.append(" options:");
        sbLIZ.append(c1868930yjb);
        sbLIZ.append(" playbookPolymerizationDialog=");
        BasePlaybookSheetFragment basePlaybookSheetFragment = this.LLJILLL;
        if (basePlaybookSheetFragment != null) {
            numValueOf = Integer.valueOf(basePlaybookSheetFragment.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        int i = 1;
        if (str.length() > 0) {
            C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
            if (c01hzKi1 != null) {
                c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZ(str), null);
            }
            InterfaceC986020blY interfaceC986020blYMb0 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).mb0();
            if (interfaceC986020blYMb0 != null) {
                interfaceC986020blYMb0.LIZIZ(EnumC20429914wr.ENTRANCE, EnumC499801x6.PLAYBOOK, str);
            }
        }
        C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
        C978360bZC.LJJIJ(c915190ZvJ);
        VM vm = this.LLILLJJLI;
        if (vm != 0 && (mutableLiveData = vm.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            playbook = value.playbook;
        } else {
            playbook = null;
        }
        if (playbook != null && (playbookContent = playbook.content) != null) {
            j = playbookContent.playbookContentId;
        } else {
            j = 0;
        }
        VM vm2 = this.LLILLJJLI;
        if (vm2 != 0) {
            vm2.LLIZ = c1868930yjb.LIZ;
        }
        EnumC20429314wl enumC20429314wl = c1868930yjb.LIZ;
        if (!z && playbook != null && j > 0) {
            LJJIFFI(new C20382814pG(playbook.playbookId, j, false, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2052), "tools", c915190ZvJ, enumC20429314wl, false);
            return;
        }
        LJJJJI(this);
        int i2 = C20387014pw.LIZIZ[enumC20429314wl.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                throw new C1954807lC();
            }
            Integer num = c1868930yjb.LIZIZ;
            if (num != null) {
                String str2 = PlaybookInteractivePolymerizationDialog._pnsPageId;
                playbookPolymerizationDialog = C20391014qa.LIZ(this.LLJI, (PlaybookAnchorViewModel) this.LLILLJJLI, num.intValue(), new C20388814qE(this));
            } else {
                String str3 = PlaybookInteractivePolymerizationDialog._pnsPageId;
                DataChannel dataChannel = this.LLJI;
                PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) this.LLILLJJLI;
                C20388914qF c20388914qF = new C20388914qF(this);
                if (playbookAnchorViewModel != null) {
                    i = playbookAnchorViewModel.LLJJJ;
                }
                playbookPolymerizationDialog = C20391014qa.LIZ(dataChannel, playbookAnchorViewModel, i, c20388914qF);
            }
        } else {
            String str4 = PlaybookPolymerizationDialog._pnsPageId;
            playbookPolymerizationDialog = new PlaybookPolymerizationDialog(this.LLJI, (PlaybookAnchorViewModel) this.LLILLJJLI, c915190ZvJ, new C20388714qD(this));
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2$showPolymerizationDialog$4$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle lifecycle;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    BasePlaybookSheetFragment basePlaybookSheetFragment2 = this.LL.LLJILLL;
                    if (basePlaybookSheetFragment2 != null) {
                        lifecycle = basePlaybookSheetFragment2.getLifecycle();
                    } else {
                        lifecycle = null;
                    }
                    if (Intrinsics.LJFF(lifecycle, lifecycleOwner)) {
                        this.LL.LLJILLL = null;
                        LifecycleEventObserver lifecycleEventObserver = c259800zU.element;
                        if (lifecycleEventObserver != null) {
                            lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                        }
                    }
                }
            }
        };
        playbookPolymerizationDialog.getLifecycle().addObserver((LifecycleObserver) c259800zU.element);
        this.LLJILLL = playbookPolymerizationDialog;
        String strLIZ2 = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("showPolymerizationDialog show playbookPolymerizationDialog=");
        BasePlaybookSheetFragment basePlaybookSheetFragment2 = this.LLJILLL;
        if (basePlaybookSheetFragment2 != null) {
            numValueOf2 = Integer.valueOf(basePlaybookSheetFragment2.hashCode());
        } else {
            numValueOf2 = null;
        }
        sbLIZ2.append(numValueOf2);
        C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        C19322110iZ.LJFF(LJJJJJL(), this.LLJILLL, "PlaybookPolymerizationDialog", null, 0);
    }

    @Override // X.C0UTJ
    public final void LJJI(boolean z, String str, C915190ZvJ c915190ZvJ, EnumC20429314wl enumC20429314wl, Integer num) {
        LJJJLZIJ(z, str, c915190ZvJ, new C1868930yjb(enumC20429314wl, num));
    }

    @Override // X.C0UTJ
    public final boolean LJJIFFI(C20382814pG c20382814pG, String str, C915190ZvJ c915190ZvJ, EnumC20429314wl enumC20429314wl, boolean z) {
        C915190ZvJ c915190ZvJ2;
        Integer numValueOf;
        Integer numValueOf2;
        InterfaceC986020blY interfaceC986020blYMb0;
        String strLIZ = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPlaybookDetailDialog openDetailParams:");
        sbLIZ.append(c20382814pG);
        sbLIZ.append(" source:");
        sbLIZ.append(str);
        sbLIZ.append(" fromPage:");
        sbLIZ.append(c915190ZvJ);
        sbLIZ.append(" showEntranceType:");
        sbLIZ.append(enumC20429314wl);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        VM vm = this.LLILLJJLI;
        if (vm != 0) {
            vm.LLIZLLLIL = enumC20429314wl;
        }
        if (!LJJIIZ("normal_detail_page")) {
            C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorServiceV2"), "showPlaybookDetailDialog return as symphonyEngine not ready", null, null);
            return false;
        }
        C915190ZvJ c915190ZvJ3 = C978360bZC.LIZJ;
        String str2 = "activity";
        if (Intrinsics.LJFF(c915190ZvJ.LIZ, "activity")) {
            c915190ZvJ2 = new C915190ZvJ("room_banner", false, 6);
        } else {
            c915190ZvJ2 = c915190ZvJ;
        }
        C978360bZC.LJ = c915190ZvJ2;
        if (z) {
            C978360bZC.LJJIJ(c915190ZvJ);
        }
        if (c20382814pG.LJIIL.length() > 0) {
            InterfaceC986020blY interfaceC986020blYMb02 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).mb0();
            if (interfaceC986020blYMb02 != null) {
                interfaceC986020blYMb02.LIZIZ(EnumC20429914wr.ENTRANCE, EnumC499801x6.PLAYBOOK, c20382814pG.LJIIL);
            }
            C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
            if (c01hzKi1 != null) {
                c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZ(c20382814pG.LJIIL), null);
            }
        }
        if (c20382814pG.LJIIJJI) {
            if (c915190ZvJ.LIZJ && (interfaceC986020blYMb0 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).mb0()) != null) {
                interfaceC986020blYMb0.LIZIZ(EnumC20429914wr.PAGE, EnumC499801x6.PLAYBOOK, c915190ZvJ.LIZ);
            }
            C01HZ c01hzKi12 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
            if (c01hzKi12 != null) {
                EnumC499801x6 enumC499801x6 = EnumC499801x6.PLAYBOOK;
                if (Intrinsics.LJFF(c915190ZvJ.LIZ, "live_recap") || !c915190ZvJ.LIZIZ || c915190ZvJ.LIZJ) {
                    str2 = c915190ZvJ.LIZ;
                }
                c01hzKi12.LIZIZ(enumC499801x6, C915900ZwS.LIZ(str2), null);
            }
        }
        PlaybookAnchorDetailDialog playbookAnchorDetailDialog = this.LLJJIII;
        if (playbookAnchorDetailDialog != null && playbookAnchorDetailDialog.isHidden()) {
            PlaybookAnchorDetailDialog playbookAnchorDetailDialog2 = this.LLJJIII;
            if (playbookAnchorDetailDialog2 != null) {
                playbookAnchorDetailDialog2.show();
            }
            String strLIZ2 = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showPlaybookDetailDialog show fromHidden ");
            PlaybookAnchorDetailDialog playbookAnchorDetailDialog3 = this.LLJJIII;
            if (playbookAnchorDetailDialog3 != null) {
                numValueOf2 = Integer.valueOf(playbookAnchorDetailDialog3.hashCode());
            } else {
                numValueOf2 = null;
            }
            sbLIZ2.append(numValueOf2);
            C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            return true;
        }
        PlaybookAnchorDetailDialog playbookAnchorDetailDialog4 = this.LLJJIII;
        if (playbookAnchorDetailDialog4 != null) {
            playbookAnchorDetailDialog4.close(1);
        }
        String str3 = PlaybookAnchorDetailDialog._pnsPageId;
        PlaybookAnchorDetailDialog playbookAnchorDetailDialogLIZ = C20382314pB.LIZ((PlaybookAnchorViewModel) this.LLILLJJLI, this.LLJI, c20382814pG, 0L, str);
        this.LLJJIII = playbookAnchorDetailDialogLIZ;
        playbookAnchorDetailDialogLIZ.LLLFFI = new C20388014q6(playbookAnchorDetailDialogLIZ, this);
        if (!this.LLJILJILJ) {
            c20382814pG.LJIILJJIL = new C20385514ph(c20382814pG.LJIILJJIL, this, c20382814pG);
        }
        String strLIZ3 = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("showPlaybookDetailDialog show ");
        PlaybookAnchorDetailDialog playbookAnchorDetailDialog5 = this.LLJJIII;
        if (playbookAnchorDetailDialog5 != null) {
            numValueOf = Integer.valueOf(playbookAnchorDetailDialog5.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ3.append(numValueOf);
        C1AZW.LJIIJ(12, strLIZ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
        PlaybookAnchorDetailDialog playbookAnchorDetailDialog6 = this.LLJJIII;
        if (playbookAnchorDetailDialog6 == null || C19322110iZ.LJFF(LJJJJJL(), playbookAnchorDetailDialog6, "PlaybookAnchorDetailDialog", null, 0) <= 0) {
            return false;
        }
        return true;
    }
}
