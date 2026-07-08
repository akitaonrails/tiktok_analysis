package X;

import X.C20384614pY;
import X.C20441214yg;
import X.C2188811AlT;
import Y.ACListenerS165S0100000_31;
import Y.AObserverS233S0100000_31;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS42S0101000_31;
import Y.AsS56S0100000_31;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.more.PlaybookEditorMoreDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ui.PlaybookDetailView$layoutManager$1;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFavoriteResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchDetailParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchDetailResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetActiveContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPopulateParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPopulateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUnfavoriteParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUnfavoriteResponse;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookActiveUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookDecorationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookNonMultiGuestEnableSetting;
import com.bytedance.android.livesdk.model.PlaybookBizChannel;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS158S0400000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14pY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20384614pY extends ConstraintLayout implements InterfaceC20413014u8, InterfaceC20367214mk, InterfaceC20390014qQ {
    public static final /* synthetic */ int LLLII = 0;
    public final LiveSheetFragment LL;
    public final DataChannel LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final BasePlaybookViewModel LLILZIL;
    public final C20382814pG LLILZLL;
    public final long LLIZ;
    public final InterfaceC20387814q4 LLIZLLLIL;
    public final Function1<C20379114of, Unit> LLJ;
    public final String LLJI;
    public final View LLJIJIL;
    public final View LLJILJIL;
    public final RecyclerView LLJILJILJ;
    public final View LLJILLL;
    public final C16F5 LLJJ;
    public final View LLJJI;
    public final LiveIconView LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public View LLJJJIL;
    public C16FS LLJJJJ;
    public View LLJJJJJIL;
    public TextView LLJJJJLIIL;
    public boolean LLJJL;
    public final View LLJJLIIIJLLLLLLLZ;
    public final View LLJL;
    public final ViewGroup LLJLIL;
    public final ViewGroup LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public final Set<C20365414mS> LLJLLL;
    public final Set<Long> LLJZ;
    public boolean LLJZIJLIL;
    public final long LLL;
    public PlaybookEditorMoreDialog LLLF;
    public boolean LLLFF;
    public C20379114of LLLFFI;
    public final C01GW LLLFZ;
    public final PlaybookDetailView$layoutManager$1 LLLI;

    public C20384614pY() {
        throw null;
    }

    private final C1117360fBO getListAdapter() {
        return (C1117360fBO) this.LLJJIJIL.getValue();
    }

    private final int getRunningStepForUIInAnchorScene() {
        BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
        if (basePlaybookViewModel instanceof PlaybookAnchorViewModel) {
            return ((PlaybookAnchorViewModel) basePlaybookViewModel).LQ2();
        }
        return -1;
    }

    private final int getRunningStepForUIInGuestScene() {
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
        if (basePlaybookViewModel != null && (mutableLiveData = basePlaybookViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            long j = value.currentStateId;
            C20379114of value2 = this.LLILZIL.LLILLL.getValue();
            if (value2 != null && (c20360614lg = value2.LIZIZ) != null && (list = c20360614lg.LIZIZ) != null) {
                int i = 0;
                for (C20359414lU c20359414lU : list) {
                    if (c20359414lU.LIZ != j) {
                        Iterator<C20361214lm> it2 = c20359414lU.LIZJ.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C20361214lm next = it2.next();
                                if (next.LIZIZ == j) {
                                    if (next != null) {
                                    }
                                }
                            }
                        }
                        i++;
                    }
                    return i;
                }
            }
        }
        return -1;
    }

    private final C20389614qM getScrollListener() {
        return (C20389614qM) this.LLLFZ.getValue();
    }

    public final void B0() {
        Map<String, String> map;
        VM vm;
        Long lValueOf = null;
        lValueOf = null;
        C1AZW.LJIIJ(12, C01EI.LIZ(168, "PlaybookDetailView"), "requestData", null, null);
        N0(true);
        if (C930540aK4.LIZJ()) {
            DataChannel dataChannel = this.LLILLJJLI;
            PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = dataChannel != null ? C784920Uqg.LIZIZ(dataChannel) : null;
            if ((playbookAnchorServiceV2LIZIZ instanceof BasePlaybookService) && playbookAnchorServiceV2LIZIZ != null && (vm = playbookAnchorServiceV2LIZIZ.LLILLJJLI) != 0) {
                vm.wQ2().LJIILL = false;
            }
        }
        C20382814pG c20382814pG = this.LLILZLL;
        if (c20382814pG != null) {
            Playbook playbook = c20382814pG.LJII;
            if (playbook != null) {
                BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
                if (basePlaybookViewModel != null) {
                    Map<String, String> map2 = c20382814pG != null ? c20382814pG.LJIILIIL : null;
                    AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 1326);
                    AbstractC20384214pU abstractC20384214pUWQ2 = basePlaybookViewModel.wQ2();
                    abstractC20384214pUWQ2.getClass();
                    C403501hZ.LIZ(new AwS158S0400000_31(abstractC20384214pUWQ2, playbook, map2, awS575S0100000_31, 4));
                    return;
                }
                return;
            }
            if (c20382814pG != null) {
                lValueOf = Long.valueOf(c20382814pG.LIZ);
            }
        }
        if (lValueOf != null && (map = this.LLILZLL.LJIILIIL) != null && !map.isEmpty()) {
            BasePlaybookViewModel basePlaybookViewModel2 = this.LLILZIL;
            if (basePlaybookViewModel2 != null) {
                InterfaceC170900l9<C470590Icr<PlaybookPopulateResponse.ResponseData>> interfaceC170900l9 = new InterfaceC170900l9<C470590Icr<PlaybookPopulateResponse.ResponseData>>() { // from class: X.14pz
                    @Override // X.InterfaceC170900l9
                    public final void LIZ(C470590Icr<PlaybookPopulateResponse.ResponseData> c470590Icr) {
                        this.LIZ.E0();
                    }

                    @Override // X.InterfaceC170900l9
                    public final void onFailed(Throwable th) {
                        this.LIZ.N0(false);
                        this.LIZ.C0(th);
                    }
                };
                PlaybookPopulateParams playbookPopulateParams = new PlaybookPopulateParams();
                C20382814pG c20382814pG2 = this.LLILZLL;
                playbookPopulateParams.playbookId = c20382814pG2.LIZ;
                long j = c20382814pG2.LIZIZ;
                playbookPopulateParams.playbookContentId = j;
                playbookPopulateParams.baseOnOnlineTemplateContent = j > 0;
                Map<String, String> linkedHashMap = c20382814pG2.LJIILIIL;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                playbookPopulateParams.functionNameToParamsMap = linkedHashMap;
                AbstractC20384214pU abstractC20384214pUWQ22 = basePlaybookViewModel2.wQ2();
                abstractC20384214pUWQ22.getClass();
                C480460Ism.LIZ().getClass();
                C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).populate(playbookPopulateParams), abstractC20384214pUWQ22.LJIJJ(), "populate").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C515801zg(abstractC20384214pUWQ22, playbookPopulateParams, 42))).LJFF(new C0UO0()), basePlaybookViewModel2.vQ2(), new C515801zg(basePlaybookViewModel2, interfaceC170900l9, 37), new C516701zp(basePlaybookViewModel2, playbookPopulateParams, interfaceC170900l9, 6), 24);
                return;
            }
            return;
        }
        C20382814pG c20382814pG3 = this.LLILZLL;
        if (c20382814pG3 == null || c20382814pG3.LIZIZ <= 0) {
            BasePlaybookViewModel basePlaybookViewModel3 = this.LLILZIL;
            if (basePlaybookViewModel3 != null) {
                InterfaceC170900l9<C470590Icr<PlaybookGetActiveContentResponse.ResponseData>> interfaceC170900l92 = new InterfaceC170900l9<C470590Icr<PlaybookGetActiveContentResponse.ResponseData>>() { // from class: X.14q1
                    @Override // X.InterfaceC170900l9
                    public final void LIZ(C470590Icr<PlaybookGetActiveContentResponse.ResponseData> c470590Icr) {
                        this.LIZ.E0();
                    }

                    @Override // X.InterfaceC170900l9
                    public final void onFailed(Throwable th) {
                        this.LIZ.N0(false);
                        this.LIZ.C0(th);
                    }
                };
                long j2 = this.LLIZ;
                AbstractC20384214pU abstractC20384214pUWQ23 = basePlaybookViewModel3.wQ2();
                C19487311Lz.LIZJ(abstractC20384214pUWQ23.LJIIZILJ(j2, new AwS610S0100000_31(abstractC20384214pUWQ23, 405)).LJFF(new C0UO0()), basePlaybookViewModel3.vQ2(), new C515801zg(basePlaybookViewModel3, interfaceC170900l92, 35), new C515801zg(basePlaybookViewModel3, interfaceC170900l92, 36), 24);
                return;
            }
            return;
        }
        BasePlaybookViewModel basePlaybookViewModel4 = this.LLILZIL;
        if (basePlaybookViewModel4 != null) {
            InterfaceC170900l9<C470590Icr<PlaybookFetchDetailResponse.ResponseData>> interfaceC170900l93 = new InterfaceC170900l9<C470590Icr<PlaybookFetchDetailResponse.ResponseData>>() { // from class: X.14q0
                @Override // X.InterfaceC170900l9
                public final void LIZ(C470590Icr<PlaybookFetchDetailResponse.ResponseData> c470590Icr) {
                    this.LIZ.E0();
                }

                @Override // X.InterfaceC170900l9
                public final void onFailed(Throwable th) {
                    this.LIZ.N0(false);
                    this.LIZ.C0(th);
                }
            };
            PlaybookFetchDetailParams playbookFetchDetailParams = new PlaybookFetchDetailParams();
            C20382814pG c20382814pG4 = this.LLILZLL;
            playbookFetchDetailParams.playbookId = c20382814pG4.LIZ;
            playbookFetchDetailParams.playbookContentId = c20382814pG4.LIZIZ;
            playbookFetchDetailParams.autoFavorite = c20382814pG4.LIZJ;
            playbookFetchDetailParams.scene = 1;
            playbookFetchDetailParams.businessType = c20382814pG4.LJJIIJZLJL;
            C19487311Lz.LIZJ(basePlaybookViewModel4.wQ2().LJIILL(playbookFetchDetailParams).LJFF(new C0UO0()), basePlaybookViewModel4.vQ2(), new C515801zg(basePlaybookViewModel4, interfaceC170900l93, 46), new C516701zp(basePlaybookViewModel4, playbookFetchDetailParams, interfaceC170900l93, 7), 24);
        }
    }

    public final void E0() {
        MutableLiveData<C20379114of> mutableLiveData;
        Function1<Long, Unit> function1;
        MutableLiveData<C20379114of> mutableLiveData2;
        C20379114of value;
        Playbook playbook;
        C20379114of value2 = null;
        C1AZW.LJIIJ(12, C01EI.LIZ(211, "PlaybookDetailView"), "requestDataSuccess", null, null);
        if (!this.LLJJIJI) {
            C20382814pG c20382814pG = this.LLILZLL;
            if (c20382814pG != null && (function1 = c20382814pG.LJIIZILJ) != null) {
                BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
                function1.invoke(Long.valueOf((basePlaybookViewModel == null || (mutableLiveData2 = basePlaybookViewModel.LLILLL) == null || (value = mutableLiveData2.getValue()) == null || (playbook = value.LIZ) == null) ? 0L : playbook.playbookId));
            }
            this.LLJJIJI = true;
        }
        L0(false);
        N0(false);
        HandlerHook.viewPost(this, new RunnableC514801zW(this, 84));
        BasePlaybookViewModel basePlaybookViewModel2 = this.LLILZIL;
        if (basePlaybookViewModel2 != null && (mutableLiveData = basePlaybookViewModel2.LLILLL) != null) {
            value2 = mutableLiveData.getValue();
        }
        e0(value2);
        View rootView = getRootView();
        if (rootView != null) {
            HandlerHook.viewPost(rootView, new ARunnableS131S0100000_31(this, 99));
        }
    }

    @Override // X.InterfaceC20413014u8
    public final void LJJLJLI() {
        MutableLiveData<C20379114of> mutableLiveData;
        C20379114of value;
        Playbook playbook;
        if (this.LLILLJJLI == null) {
            return;
        }
        C1AZW.LJIIJ(12, C01EI.LIZ(452, "PlaybookDetailView"), "clickMore", null, null);
        BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
        if (basePlaybookViewModel == null || (mutableLiveData = basePlaybookViewModel.LLILLL) == null || (value = mutableLiveData.getValue()) == null || (playbook = value.LIZ) == null) {
            return;
        }
        PlaybookEditorMoreDialog playbookEditorMoreDialog = this.LLLF;
        if (playbookEditorMoreDialog != null) {
            playbookEditorMoreDialog.close(1);
        }
        PlaybookEditorMoreDialog playbookEditorMoreDialog2 = new PlaybookEditorMoreDialog(getContext(), playbook, this.LLILZIL, z0(), new AwS610S0100000_31(this, 282), new AwS645S0100000_31(this, 84), new AwS432S0200000_31(this, playbook, 86), new AwS575S0100000_31(this, 1321), new AwS575S0100000_31(playbook, 1322), new AwS575S0100000_31(this, 1323), new AwS575S0100000_31(this, 1324), new AwS575S0100000_31(this, 1325));
        C20374514nv.LJIIJ(this.LL, playbookEditorMoreDialog2, "PlaybookEditorMoreDialog");
        this.LLLF = playbookEditorMoreDialog2;
    }

    public final void O0() {
        MutableLiveData<C20379114of> mutableLiveData;
        C20379114of value;
        Playbook playbook;
        BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
        Boolean boolValueOf = null;
        if (basePlaybookViewModel != null && (mutableLiveData = basePlaybookViewModel.LLILLL) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.LIZ) != null) {
            if (n0(playbook)) {
                if (p0(playbook)) {
                    LiveIconView liveIconView = this.LLJJIII;
                    if (liveIconView != null) {
                        C786410Ut5.i5(liveIconView, 1.0f);
                    }
                } else {
                    LiveIconView liveIconView2 = this.LLJJIII;
                    if (liveIconView2 != null) {
                        C786410Ut5.i5(liveIconView2, 0.3f);
                    }
                }
                LiveIconView liveIconView3 = this.LLJJIII;
                if (liveIconView3 != null) {
                    liveIconView3.setIcon(R.drawable.d90);
                    return;
                }
                return;
            }
            boolValueOf = Boolean.valueOf(playbook.isMyFavorite);
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LiveIconView liveIconView4 = this.LLJJIII;
            if (liveIconView4 != null) {
                liveIconView4.setIconAttr(R.attr.c6g);
                return;
            }
            return;
        }
        LiveIconView liveIconView5 = this.LLJJIII;
        if (liveIconView5 != null) {
            liveIconView5.setIconAttr(R.attr.c6f);
        }
    }

    public final void u0() {
        LinearLayoutManager linearLayoutManager;
        String str;
        MutableLiveData<C20379114of> mutableLiveData;
        C20379114of value;
        MutableLiveData<C20379114of> mutableLiveData2;
        C20379114of value2;
        Playbook playbook;
        MutableLiveData<C20379114of> mutableLiveData3;
        C20379114of value3;
        Playbook playbook2;
        MutableLiveData<C20379114of> mutableLiveData4;
        C20379114of value4;
        Playbook playbook3;
        MutableLiveData<C20379114of> mutableLiveData5;
        C20379114of value5;
        Playbook playbook4;
        RecyclerView recyclerView = this.LLJILJILJ;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            if (iFindFirstVisibleItemPosition < linearLayoutManager.getItemCount()) {
                Object obj = ListProtector.get(getListAdapter().LL, iFindFirstVisibleItemPosition);
                boolean z = obj instanceof C20365414mS;
                if (z && Intrinsics.LJFF(((C20365414mS) obj).LIZ.LIZ, "notice_board") && !this.LLJLLL.contains(obj)) {
                    this.LLJLLL.add((C20365414mS) obj);
                    ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).BT1(C500260Jjc.LJJIL() ? EnumC937290aUx.SETTING_PLAYBOOK : EnumC937290aUx.PLAYBOOK, false, EnumC919090a1b.SHOW, false);
                }
                long j = 0;
                if ((obj instanceof C11V2) && !this.LLJZIJLIL) {
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
                    long j2 = (basePlaybookViewModel == null || (mutableLiveData5 = basePlaybookViewModel.LLILLL) == null || (value5 = mutableLiveData5.getValue()) == null || (playbook4 = value5.LIZ) == null) ? 0L : playbook4.playbookId;
                    String str2 = !PlaybookUtilKt.LJIJJLI(true, Integer.valueOf(((C11V2) obj).LIZ)) ? "off" : "on";
                    BasePlaybookViewModel basePlaybookViewModel2 = this.LLILZIL;
                    Integer numValueOf = (basePlaybookViewModel2 == null || (mutableLiveData4 = basePlaybookViewModel2.LLILLL) == null || (value4 = mutableLiveData4.getValue()) == null || (playbook3 = value4.LIZ) == null) ? null : Integer.valueOf(playbook3.playbookType);
                    BasePlaybookViewModel basePlaybookViewModel3 = this.LLILZIL;
                    C978360bZC.LJJ("show", j2, str2, numValueOf, (basePlaybookViewModel3 == null || (mutableLiveData3 = basePlaybookViewModel3.LLILLL) == null || (value3 = mutableLiveData3.getValue()) == null || (playbook2 = value3.LIZ) == null) ? null : Boolean.valueOf(playbook2.isMyCreation));
                    this.LLJZIJLIL = true;
                }
                if (C978390bZF.LIZ() && ((C930540aK4.LIZJ() || C500260Jjc.LJJIL()) && z)) {
                    C20365414mS c20365414mS = (C20365414mS) obj;
                    if (!this.LLJZ.contains(Long.valueOf(c20365414mS.LIZ.LIZIZ))) {
                        this.LLJZ.add(Long.valueOf(c20365414mS.LIZ.LIZIZ));
                        C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                        DataChannel dataChannel = this.LLILLJJLI;
                        C20361214lm c20361214lm = c20365414mS.LIZ;
                        String str3 = c20361214lm.LIZ;
                        BasePlaybookViewModel basePlaybookViewModel4 = this.LLILZIL;
                        int iDQ2 = (basePlaybookViewModel4 != null ? basePlaybookViewModel4.DQ2(c20361214lm) : -1) + 1;
                        BasePlaybookViewModel basePlaybookViewModel5 = this.LLILZIL;
                        if (basePlaybookViewModel5 != null && (mutableLiveData2 = basePlaybookViewModel5.LLILLL) != null && (value2 = mutableLiveData2.getValue()) != null && (playbook = value2.LIZ) != null) {
                            j = playbook.playbookId;
                        }
                        BasePlaybookViewModel basePlaybookViewModel6 = this.LLILZIL;
                        boolean zYQ2 = basePlaybookViewModel6 != null ? basePlaybookViewModel6.yQ2() : false;
                        C20382814pG c20382814pG = this.LLILZLL;
                        if (c20382814pG == null || (str = c20382814pG.LJFF) == null) {
                            str = "normal";
                        }
                        BasePlaybookViewModel basePlaybookViewModel7 = this.LLILZIL;
                        C978360bZC.LJIILJJIL(dataChannel, "show", str3, iDQ2, j, zYQ2, str, (basePlaybookViewModel7 == null || (mutableLiveData = basePlaybookViewModel7.LLILLL) == null || (value = mutableLiveData.getValue()) == null) ? null : value.LIZ, c20365414mS.LIZ.LIZLLL, false, 1536);
                    }
                }
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public final String z0() {
        String str;
        C20382814pG c20382814pG = this.LLILZLL;
        return (c20382814pG == null || (str = c20382814pG.LJJIIJ) == null) ? "playbook_detail" : str;
    }

    private final int getRunningStep() {
        return !C930540aK4.LIZJ() ? getRunningStepForUIInGuestScene() : getRunningStepForUIInAnchorScene();
    }

    public final C20379114of getInitDetailPlaybook() {
        if (h0()) {
            return this.LLLFFI;
        }
        return null;
    }

    public final boolean h0() {
        VM vm;
        if (!C930540aK4.LIZJ()) {
            return false;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = dataChannel != null ? C784920Uqg.LIZIZ(dataChannel) : null;
        return (!(playbookAnchorServiceV2LIZIZ instanceof BasePlaybookService) || playbookAnchorServiceV2LIZIZ == null || (vm = playbookAnchorServiceV2LIZIZ.LLILLJJLI) == 0 || !vm.wQ2().LJIILL || MultiGuestPlaybookActiveUpdateSetting.INSTANCE.enable()) ? false : true;
    }

    public final String i0() {
        return Intrinsics.LJFF(z0(), "create_preview") ? "create" : "edit";
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        MutableLiveData<ActivePlaybook> mutableLiveData;
        MutableLiveData<C20379114of> mutableLiveData2;
        super.onAttachedToWindow();
        BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
        if (basePlaybookViewModel != null && (mutableLiveData2 = basePlaybookViewModel.LLILLL) != null) {
            mutableLiveData2.observe(this.LL, new AObserverS233S0100000_31(this, 25));
        }
        BasePlaybookViewModel basePlaybookViewModel2 = this.LLILZIL;
        if (basePlaybookViewModel2 != null && (mutableLiveData = basePlaybookViewModel2.LLILLJJLI) != null) {
            mutableLiveData.observe(this.LL, new AObserverS233S0100000_31(this, 26));
        }
        B0();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetachedFromWindow() {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20384614pY.onDetachedFromWindow():void");
    }

    public final DataChannel getDataChannel() {
        return this.LLILLJJLI;
    }

    public final void C0(Throwable th) {
        String message;
        String strLIZ = C01EI.LIZ(224, "PlaybookDetailView");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestDataFailed throwable:");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        L0(true);
    }

    public final void F0(C20379114of c20379114of) {
        boolean z;
        boolean z2;
        List<C20386614ps> list;
        C20386614ps next;
        C16FS c16fs;
        EnumC20429314wl enumC20429314wl;
        List<C20386614ps> list2;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        List<C20386614ps> list3;
        C20386614ps next2;
        C16FS c16fs2;
        int i = this.LLILLL;
        boolean z3 = true;
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 && (i & 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        Integer numValueOf = null;
        if (!z) {
            C1AZW.LJIIJ(12, C01EI.LIZ(368, "PlaybookDetailView"), "updateBottomUi gone", null, null);
            View view = this.LLJJJIL;
            if (view != null) {
                C500260Jjc.LJLJLJ(view, false);
                return;
            }
            return;
        }
        I0(this.LLJJJJ);
        I0(this.LLJJJJJIL);
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            view2.setPadding(0, 0, 0, (int) C497740JfY.LIZIZ(0.0f));
        }
        int i2 = this.LLILLL;
        if ((i2 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            View view3 = this.LLJJJIL;
            if (view3 != null) {
                C500260Jjc.LJLJLJ(view3, true);
            }
            C16FS c16fs3 = this.LLJJJJ;
            if (c16fs3 != null) {
                c16fs3.setText(2131854096);
            }
            C20382814pG c20382814pG = this.LLILZLL;
            if (c20382814pG != null && (list3 = c20382814pG.LJJ) != null) {
                Iterator<C20386614ps> it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        C20386614ps c20386614ps = next2;
                        if (c20386614ps.LIZ == EnumC979090baN.START && c20386614ps.LIZIZ != null) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C20386614ps c20386614ps2 = next2;
                if (c20386614ps2 != null && (c16fs2 = this.LLJJJJ) != null) {
                    c16fs2.setText(c20386614ps2.LIZIZ);
                }
            }
            BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
            if (basePlaybookViewModel != null && (mutableLiveData = basePlaybookViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.playbook) != null && c20379114of.LIZ.playbookId == playbook.playbookId) {
                C1AZW.LJIIJ(12, C01EI.LIZ(374, "PlaybookDetailView"), "controller updateBottomUi playing", null, null);
                C500260Jjc.LJLJLJ(this.LLJJJJ, false);
                C500260Jjc.LJLJLJ(this.LLJJJJJIL, true);
                C500260Jjc.LJLJLJ(this.LLJJJJLIIL, true);
            } else {
                C1AZW.LJIIJ(12, C01EI.LIZ(380, "PlaybookDetailView"), "controller updateBottomUi not-playing", null, null);
                C500260Jjc.LJLJLJ(this.LLJJJJ, true);
                C500260Jjc.LJLJLJ(this.LLJJJJJIL, false);
                C500260Jjc.LJLJLJ(this.LLJJJJLIIL, false);
                PlaybookContent playbookContent = c20379114of.LIZ.content;
                if (playbookContent != null) {
                    numValueOf = Integer.valueOf(playbookContent.contentStatus);
                }
                if (!C758560TpG.LIZ && numValueOf != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 2 || numValueOf.intValue() == 4)) {
                    C16FS c16fs4 = this.LLJJJJ;
                    if (c16fs4 != null) {
                        c16fs4.setEnabled(false);
                    }
                } else {
                    C16FS c16fs5 = this.LLJJJJ;
                    if (c16fs5 != null) {
                        c16fs5.setEnabled(true);
                    }
                }
            }
        } else if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            C16FS c16fs6 = this.LLJJJJ;
            if (c16fs6 != null) {
                c16fs6.setText(2131851334);
            }
            C20382814pG c20382814pG2 = this.LLILZLL;
            if (c20382814pG2 != null && (list = c20382814pG2.LJJ) != null) {
                Iterator<C20386614ps> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        C20386614ps c20386614ps3 = next;
                        if (c20386614ps3.LIZ == EnumC979090baN.START && c20386614ps3.LIZIZ != null) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C20386614ps c20386614ps4 = next;
                if (c20386614ps4 != null && (c16fs = this.LLJJJJ) != null) {
                    c16fs.setText(c20386614ps4.LIZIZ);
                }
            }
            C1AZW.LJIIJ(12, C01EI.LIZ(380, "PlaybookDetailView"), "viewer updateBottomUi", null, null);
            if (this.LLJJIJIIJIL) {
                View view4 = this.LLJJJIL;
                if (view4 != null) {
                    C500260Jjc.LJLJLJ(view4, true);
                }
                C500260Jjc.LJLJLJ(this.LLJJJJ, true);
            } else {
                View view5 = this.LLJJJIL;
                if (view5 != null) {
                    C500260Jjc.LJLJLJ(view5, false);
                }
                C500260Jjc.LJLJLJ(this.LLJJJJ, false);
                ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).requestLivePermission(new InterfaceC472150IfN() { // from class: X.14pr
                    @Override // X.InterfaceC472150IfN
                    public final void onFailed(Throwable th) {
                        C20441214yg.LJ("PlaybookDetailView", "query Live permission failed");
                    }

                    @Override // X.InterfaceC472150IfN
                    public final void LIZ(Boolean bool, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission, Boolean bool2, C783980UpA c783980UpA, Map map) {
                        Boolean boolValueOf;
                        bool2.booleanValue();
                        if (detailLivePermission != null) {
                            boolValueOf = Boolean.valueOf(detailLivePermission.videoPermission);
                        } else {
                            boolValueOf = null;
                        }
                        if (C500260Jjc.LJJJI(boolValueOf)) {
                            C20384614pY c20384614pY = this.LIZ;
                            if ((c20384614pY.LLILLL & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
                                c20384614pY.LLJJIJIIJIL = true;
                                View view6 = c20384614pY.LLJJJIL;
                                if (view6 != null) {
                                    C500260Jjc.LJLJLJ(view6, true);
                                }
                                C500260Jjc.LJLJLJ(this.LIZ.LLJJJJ, true);
                            }
                        }
                    }
                }, "playbook_detail_view");
            }
            C500260Jjc.LJLJLJ(this.LLJJJJJIL, false);
            C500260Jjc.LJLJLJ(this.LLJJJJLIIL, false);
        }
        BasePlaybookViewModel basePlaybookViewModel2 = this.LLILZIL;
        if (basePlaybookViewModel2 == null || (enumC20429314wl = basePlaybookViewModel2.LLIZLLLIL) == null) {
            enumC20429314wl = EnumC20429314wl.MULTI_GUEST;
        }
        if (enumC20429314wl == EnumC20429314wl.MATCH) {
            C20382814pG c20382814pG3 = this.LLILZLL;
            if (c20382814pG3 != null && (list2 = c20382814pG3.LJJ) != null && !list2.isEmpty()) {
                Iterator<C20386614ps> it4 = list2.iterator();
                while (it4.hasNext()) {
                    if (it4.next().LIZ == EnumC979090baN.BACK) {
                        break;
                    }
                }
                z3 = false;
            } else {
                z3 = false;
            }
            C500260Jjc.LJLJLJ(this.LLJJJJLIIL, z3);
        }
    }

    @Override // X.InterfaceC20390014qQ
    public final void H(C20359414lU c20359414lU) {
        C20441214yg.LIZIZ("PlaybookDetailView", "onClick playbookStep");
        this.LLIZLLLIL.LIZJ(getInitDetailPlaybook(), c20359414lU);
    }

    public final void I0(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(12.0f);
            marginLayoutParams.bottomMargin = (int) C497740JfY.LIZIZ(16.0f);
            C16FS c16fs = this.LLJJJJ;
            if (c16fs != null) {
                C786410Ut5.x6(c16fs, marginLayoutParams);
            }
        }
    }

    public final void L0(boolean z) {
        String strLIZ = C01EI.LIZ(229, "PlaybookDetailView");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateEmptyViewState visible:");
        sbLIZ.append(z);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C500260Jjc.LJLJLJ(this.LLJJLIIIJLLLLLLLZ, z);
        View view = this.LLJILJIL;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, !z);
        }
    }

    @Override // X.InterfaceC20367214mk
    public final void LJJZZI(C20361214lm c20361214lm) {
        C20441214yg.LIZIZ("PlaybookDetailView", "onClickContentLayer playbookTask");
        this.LLIZLLLIL.LIZLLL(c20361214lm, getInitDetailPlaybook());
    }

    @Override // X.InterfaceC20413014u8
    public final void LLLF(final boolean z) {
        MutableLiveData<C20379114of> mutableLiveData;
        C20379114of value;
        final Playbook playbook;
        long j;
        String strLIZ = C01EI.LIZ(387, "PlaybookDetailView");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clickFavorites isFavorite:");
        sbLIZ.append(z);
        Playbook playbook2 = null;
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
        if (basePlaybookViewModel != null && (mutableLiveData = basePlaybookViewModel.LLILLL) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.LIZ) != null) {
            boolean zYQ2 = false;
            if (z) {
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                DataChannel dataChannel = this.LLILLJJLI;
                C20379114of value2 = this.LLILZIL.LLILLL.getValue();
                if (value2 != null) {
                    playbook2 = value2.LIZ;
                }
                BasePlaybookViewModel basePlaybookViewModel2 = this.LLILZIL;
                if (basePlaybookViewModel2 != null) {
                    zYQ2 = basePlaybookViewModel2.yQ2();
                }
                C978360bZC.LJIILIIL(dataChannel, "favorite", playbook2, zYQ2, null, 0, 0L, 112);
                BasePlaybookViewModel basePlaybookViewModel3 = this.LLILZIL;
                InterfaceC170900l9<C470590Icr<PlaybookFavoriteResponse.ResponseData>> interfaceC170900l9 = new InterfaceC170900l9<C470590Icr<PlaybookFavoriteResponse.ResponseData>>() { // from class: X.01rg
                    @Override // X.InterfaceC170900l9
                    public final void LIZ(C470590Icr<PlaybookFavoriteResponse.ResponseData> c470590Icr) {
                        C766270U4b.LIZLLL(2131854115);
                        C1AZW.LJIIJ(12, C01EI.LIZ(400, "PlaybookDetailView"), "clickFavorites onSuccess", null, null);
                        this.LIZ.O0();
                    }

                    @Override // X.InterfaceC170900l9
                    public final void onFailed(Throwable th) {
                        String message;
                        String strLIZ2 = C01EI.LIZ(404, "PlaybookDetailView");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("clickFavorites failed:");
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ2.append(message);
                        C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    }
                };
                long j2 = playbook.playbookId;
                PlaybookContent playbookContent = playbook.content;
                long j3 = 0;
                if (playbookContent != null) {
                    j = playbookContent.playbookContentId;
                    j3 = playbookContent.originalPlaybookContentId;
                } else {
                    j = 0;
                }
                C19487311Lz.LIZJ(basePlaybookViewModel3.wQ2().LJIILJJIL(j2, j, j3, null).LJFF(new C0UO0()), basePlaybookViewModel3.vQ2(), new C515801zg(basePlaybookViewModel3, interfaceC170900l9, 44), new C515801zg(basePlaybookViewModel3, interfaceC170900l9, 45), 24);
                return;
            }
            C782110Um9 c782110Um9 = new C782110Um9(getContext());
            c782110Um9.LJIIZILJ(2131854071);
            c782110Um9.LJII(2131854069);
            c782110Um9.LJIILL = false;
            c782110Um9.LJIILIIL(2131854070, new InterfaceC743640TFa() { // from class: X.01re
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    String str;
                    Playbook playbook3;
                    boolean zYQ22;
                    final long j4;
                    MutableLiveData<C20379114of> mutableLiveData2;
                    C20379114of value3;
                    liveDialog.dismiss();
                    C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                    DataChannel dataChannel2 = this.LIZ.getDataChannel();
                    if (z) {
                        str = "favorite";
                    } else {
                        str = "unfavorite";
                    }
                    BasePlaybookViewModel basePlaybookViewModel4 = this.LIZ.LLILZIL;
                    if (basePlaybookViewModel4 != null && (mutableLiveData2 = basePlaybookViewModel4.LLILLL) != null && (value3 = mutableLiveData2.getValue()) != null) {
                        playbook3 = value3.LIZ;
                    } else {
                        playbook3 = null;
                    }
                    BasePlaybookViewModel basePlaybookViewModel5 = this.LIZ.LLILZIL;
                    if (basePlaybookViewModel5 != null) {
                        zYQ22 = basePlaybookViewModel5.yQ2();
                    } else {
                        zYQ22 = false;
                    }
                    C978360bZC.LJIILIIL(dataChannel2, str, playbook3, zYQ22, null, 0, 0L, 112);
                    final C20384614pY c20384614pY = this.LIZ;
                    BasePlaybookViewModel basePlaybookViewModel6 = c20384614pY.LLILZIL;
                    if (basePlaybookViewModel6 != null) {
                        InterfaceC170900l9<C470590Icr<PlaybookUnfavoriteResponse.ResponseData>> interfaceC170900l92 = new InterfaceC170900l9<C470590Icr<PlaybookUnfavoriteResponse.ResponseData>>() { // from class: X.01rf
                            @Override // X.InterfaceC170900l9
                            public final void LIZ(C470590Icr<PlaybookUnfavoriteResponse.ResponseData> c470590Icr) {
                                C1AZW.LJIIJ(12, C01EI.LIZ(429, "PlaybookDetailView"), "clickFavorites unFavorite onSuccess", null, null);
                                c20384614pY.O0();
                            }

                            @Override // X.InterfaceC170900l9
                            public final void onFailed(Throwable th) {
                                String message;
                                String strLIZ2 = C01EI.LIZ(433, "PlaybookDetailView");
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("clickFavorites unFavorite failed:");
                                if (th != null) {
                                    message = th.getMessage();
                                } else {
                                    message = null;
                                }
                                sbLIZ2.append(message);
                                C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                            }
                        };
                        Playbook playbook4 = playbook;
                        final long j5 = playbook4.playbookId;
                        PlaybookContent playbookContent2 = playbook4.content;
                        if (playbookContent2 != null) {
                            j4 = playbookContent2.originalPlaybookContentId;
                        } else {
                            j4 = 0;
                        }
                        final AbstractC20384214pU abstractC20384214pUWQ2 = basePlaybookViewModel6.wQ2();
                        abstractC20384214pUWQ2.getClass();
                        PlaybookUnfavoriteParams playbookUnfavoriteParams = new PlaybookUnfavoriteParams();
                        playbookUnfavoriteParams.playbookId = j5;
                        String strLIZ2 = C01EI.LIZ(0, abstractC20384214pUWQ2.LJIJJ());
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("unFavorite, playbookId=");
                        sbLIZ2.append(j5);
                        sbLIZ2.append(", originalPlaybookContentId=");
                        sbLIZ2.append(j4);
                        C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                        C480460Ism.LIZ().getClass();
                        C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).unFavorite(playbookUnfavoriteParams), abstractC20384214pUWQ2.LJIJJ(), "unFavorite").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.01rh
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                Playbook playbook5;
                                C1C7U.LIZ("BasePlaybookModel@464b.unFavorite$1");
                                C470590Icr c470590Icr = (C470590Icr) obj;
                                C930480aJy.LIZ.getClass();
                                if (C930480aJy.LJJIFFI(c470590Icr) && (playbook5 = ((PlaybookUnfavoriteResponse.ResponseData) c470590Icr.data).playbook) != null) {
                                    AbstractC20384214pU abstractC20384214pU = abstractC20384214pUWQ2;
                                    long j6 = j5;
                                    long j7 = j4;
                                    abstractC20384214pU.LJJIJIIJI(playbook5, EnumC466501rj.UN_FAVORITE);
                                    abstractC20384214pU.LJJIIJZLJL(playbook5);
                                    if (abstractC20384214pU.LJJII(j6)) {
                                        AbstractC20384214pU.LJJ(abstractC20384214pU, playbook5, "unFavorite", true, null, 24);
                                    } else {
                                        C20377014oK c20377014oK = abstractC20384214pU.LJ.get(PlaybookUtilKt.LJIJ(Long.valueOf(j6), Long.valueOf(j7)));
                                        if (c20377014oK != null) {
                                            C403501hZ.LIZ(new C467101rp(playbook5.totalFavorites, playbook5.totalUsage, c20377014oK));
                                        }
                                    }
                                }
                                C1C7U.LIZIZ("BasePlaybookModel@464b.unFavorite$1");
                            }
                        })).LJFF(new C0UO0()), basePlaybookViewModel6.vQ2(), new C515801zg(basePlaybookViewModel6, interfaceC170900l92, 41), new C515801zg(basePlaybookViewModel6, interfaceC170900l92, 43), 24);
                    }
                }
            });
            c782110Um9.LJIIJ(2131854087, new InterfaceC743640TFa() { // from class: X.14oI
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            C786410Ut5.E4(c782110Um9.LIZ());
        }
    }

    @Override // X.InterfaceC20367214mk
    public final void LLLLJ(C20361214lm c20361214lm) {
        C20441214yg.LIZIZ("PlaybookDetailView", "onClickOtherLayer playbookTask");
        this.LLIZLLLIL.LJ(c20361214lm, getInitDetailPlaybook());
    }

    public final void M0(Playbook playbook) {
        C410901il c410901il = new C410901il(getListAdapter().LL);
        C410901il c410901il2 = new C410901il();
        c410901il2.add(C125900dt.LIZ(playbook, n0(playbook), p0(playbook), this.LLILZ));
        List<?> list = getListAdapter().LL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (true ^ (obj instanceof C20412414u2)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c410901il2.add(it2.next());
        }
        try {
            C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C20384914pb(c410901il, c410901il2), true);
            getListAdapter().LLLII(c410901il2);
            c21341918fZLIZ.LIZJ(getListAdapter());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            getListAdapter().LLLII(c410901il2);
            getListAdapter().notifyDataSetChanged();
        }
    }

    public final void N0(boolean z) {
        View view = this.LLJIJIL;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, z);
        }
        if (z) {
            C500260Jjc.LJLJLJ(this.LLJJLIIIJLLLLLLLZ, false);
        }
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            C500260Jjc.LJLJLJ(view2, !z);
        }
    }

    public final void e0(C20379114of c20379114of) {
        BasePlaybookViewModel basePlaybookViewModel;
        int i;
        C20382814pG c20382814pG;
        int i2;
        int iJ0;
        BasePlaybookViewModel basePlaybookViewModel2;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        int iJ02;
        if (c20379114of != null) {
            if (!C500260Jjc.LJJJJIZL(this.LLJIJIL) && PlaybookAutoRunTypeSetting.INSTANCE.enable() && getRunningStep() >= 0 && this.LLJJL && (basePlaybookViewModel2 = this.LLILZIL) != null && (mutableLiveData = basePlaybookViewModel2.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.playbook) != null && c20379114of.LIZ.playbookId == playbook.playbookId && (iJ02 = j0(getRunningStep())) >= 0) {
                this.LLJJL = false;
                scrollToPosition(iJ02);
                return;
            }
            if (c20379114of != null) {
                if (!C500260Jjc.LJJJJIZL(this.LLJIJIL) && this.LLJJL && (c20382814pG = this.LLILZLL) != null && Integer.valueOf(c20382814pG.LJIIJ) != null && (i2 = this.LLILZLL.LJIIJ) > 0 && (iJ0 = j0(i2)) >= 0) {
                    this.LLJJL = false;
                    scrollToPosition(iJ0);
                    return;
                }
                if (!C500260Jjc.LJJJJIZL(this.LLJIJIL) && this.LLJJL && (basePlaybookViewModel = this.LLILZIL) != null && basePlaybookViewModel.LLILZLL.get(c20379114of.LIZ.playbookId) != null) {
                    this.LLJJL = false;
                    C13AA c13aa = this.LLILZIL.LLILZLL.get(c20379114of.LIZ.playbookId);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateUi recordPos:");
                    sbLIZ.append(c13aa);
                    C20441214yg.LIZIZ("PlaybookDetailView", C2188811AlT.LIZIZ(sbLIZ));
                    this.LLILZIL.LLILZLL.remove(c20379114of.LIZ.playbookId);
                    if (c13aa != null && (i = c13aa.LIZ) > 0) {
                        scrollToPosition(i);
                    }
                }
            }
        }
    }

    public final int j0(int i) {
        int i2 = 0;
        int i3 = -1;
        for (Object obj : getListAdapter().LL) {
            int i4 = i2 + 1;
            if (i2 >= 0) {
                if ((obj instanceof C20389314qJ) && (i3 = i3 + 1) == i) {
                    return i2;
                }
                i2 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return -1;
    }

    public final boolean n0(Playbook playbook) {
        PlaybookAnchorViewModel playbookAnchorViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean value;
        BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
        if (basePlaybookViewModel instanceof PlaybookAnchorViewModel) {
            playbookAnchorViewModel = (PlaybookAnchorViewModel) basePlaybookViewModel;
        } else {
            playbookAnchorViewModel = null;
        }
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLJIJIL) != null && (value = mutableLiveData.getValue()) != null && value.booleanValue() && playbook.playbookType == 1) {
            if ((this.LLILLL & 256) == 0) {
                return false;
            }
        } else {
            if ((this.LLILLL & 256) == 0) {
                return false;
            }
            if (!playbook.isMyCreation && !playbook.LIZ()) {
                return false;
            }
        }
        return true;
    }

    public final boolean p0(Playbook playbook) {
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook2;
        BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
        boolean z = false;
        if (basePlaybookViewModel != null && (mutableLiveData = basePlaybookViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook2 = value.playbook) != null && playbook2.playbookId == playbook.playbookId) {
            z = true;
        }
        return !z;
    }

    public final boolean s0(int i) {
        BasePlaybookViewModel basePlaybookViewModel;
        MutableLiveData<C20379114of> mutableLiveData;
        C20379114of value;
        Playbook playbook;
        ActivePlaybook value2;
        Playbook playbook2;
        if (!PlaybookAutoRunTypeSetting.INSTANCE.enable() || (basePlaybookViewModel = this.LLILZIL) == null || (mutableLiveData = basePlaybookViewModel.LLILLL) == null || (value = mutableLiveData.getValue()) == null || (playbook = value.LIZ) == null || (value2 = this.LLILZIL.LLILLJJLI.getValue()) == null || (playbook2 = value2.playbook) == null || playbook.playbookId != playbook2.playbookId || getRunningStep() != i) {
            return false;
        }
        return true;
    }

    public final void P0(C20379114of c20379114of, boolean z) {
        Boolean boolValueOf;
        boolean z2;
        Boolean boolValueOf2;
        List<C20359414lU> list;
        String strLJII;
        boolean z3;
        String strLJII2;
        String strLJII3;
        boolean z4;
        EnumC20429514wn enumC20429514wn;
        C20357914lF config;
        View viewInvoke;
        List<C20386614ps> list2;
        C20386614ps next;
        C20386614ps next2;
        C20386614ps next3;
        TextView textView;
        TextView textView2;
        C16FS c16fs;
        TextView textView3;
        EnumC20429314wl enumC20429314wl;
        int i;
        int i2;
        C20382814pG c20382814pG;
        Function1<? super Context, ? extends View> function1;
        View viewInvoke2;
        C20382814pG c20382814pG2;
        Function1<Context, View> function12;
        Long lValueOf;
        Function1<Playbook, Unit> function13;
        String str;
        C20379114of c20379114of2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateUi playbookDetail:");
        sbLIZ.append(c20379114of);
        C20441214yg.LIZIZ("PlaybookDetailView", C2188811AlT.LIZIZ(sbLIZ));
        if (c20379114of == null) {
            return;
        }
        if (h0()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateUi force=");
            sbLIZ2.append(z);
            sbLIZ2.append(", initPlaybookDetail=");
            sbLIZ2.append(this.LLLFFI);
            sbLIZ2.append(", hasInitHeaderAndFooter=");
            sbLIZ2.append(this.LLJJJ);
            C20441214yg.LIZIZ("PlaybookDetailView", C2188811AlT.LIZIZ(sbLIZ2));
            if (z) {
                this.LLLFFI = c20379114of;
            } else if (this.LLJJJ && (c20379114of2 = this.LLLFFI) != null) {
                F0(c20379114of2);
                return;
            }
        } else {
            this.LLLFFI = c20379114of;
        }
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            PlaybookContent playbookContent = c20379114of.LIZ.content;
            if (playbookContent != null) {
                str = playbookContent.title;
            } else {
                str = null;
            }
            c16f5.setText(str);
        }
        Playbook playbook = c20379114of.LIZ;
        C20382814pG c20382814pG3 = this.LLILZLL;
        if (c20382814pG3 != null && (function13 = c20382814pG3.LJIJI) != null) {
            function13.invoke(playbook);
        }
        Function1<C20379114of, Unit> function14 = this.LLJ;
        if (function14 != null) {
            function14.invoke(c20379114of);
        }
        if (!this.LLLFF && this.LLILZ) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            String strZ0 = z0();
            C20382814pG c20382814pG4 = this.LLILZLL;
            if (c20382814pG4 != null) {
                lValueOf = Long.valueOf(c20382814pG4.LIZ);
            } else {
                lValueOf = null;
            }
            C978360bZC.LJIJJLI(lValueOf, strZ0, i0(), null, C500260Jjc.LJJJI(Boolean.valueOf(c20379114of.LIZ.LIZ())));
            this.LLLFF = true;
        }
        if (!this.LLJJJ) {
            Context context = getContext();
            if (context == null || (c20382814pG2 = this.LLILZLL) == null || (function12 = c20382814pG2.LJIILL) == null || (viewInvoke = function12.invoke(context)) == null) {
                viewInvoke = null;
            }
            ViewGroup viewGroup = this.LLJLIL;
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
            if (viewInvoke != null) {
                ViewGroup viewGroup2 = this.LLJLIL;
                if (viewGroup2 != null) {
                    viewGroup2.addView(viewInvoke);
                }
                RecyclerView recyclerView = this.LLJILJILJ;
                if (recyclerView != null) {
                    recyclerView.setPadding(0, 0, 0, 0);
                }
            }
            if (getContext() != null && (c20382814pG = this.LLILZLL) != null && (function1 = c20382814pG.LJIILJJIL) != null && (viewInvoke2 = function1.invoke(getContext())) != null) {
                ViewGroup viewGroup3 = this.LLJLILLLLZIIL;
                if (viewGroup3 != null) {
                    C786410Ut5.LJJJJI(viewGroup3);
                }
                ViewGroup viewGroup4 = this.LLJLILLLLZIIL;
                if (viewGroup4 != null) {
                    viewGroup4.addView(viewInvoke2);
                }
                View view = this.LLJILJIL;
                if (view != null) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingTop(), 0);
                }
            } else {
                View viewFindViewById = findViewById(R.id.dvg);
                if (viewFindViewById != null) {
                    Context context2 = viewFindViewById.getContext();
                    if (C500260Jjc.LJJIL() && C960203pA.LIZIZ(viewFindViewById.getContext())) {
                        i2 = R.attr.ezk;
                    } else {
                        i2 = R.attr.ext;
                    }
                    viewFindViewById.setBackgroundColor(C20736316Cj.LIZIZ(i2, context2));
                } else {
                    viewFindViewById = null;
                }
                this.LLJJJIL = viewFindViewById;
                this.LLJJJJ = (C16FS) findViewById(R.id.cvb);
                this.LLJJJJJIL = findViewById(R.id.cu5);
                this.LLJJJJLIIL = (TextView) findViewById(R.id.cnb);
                if (PlaybookNonMultiGuestEnableSetting.INSTANCE.enable() && (textView3 = this.LLJJJJLIIL) != null) {
                    Context context3 = getContext();
                    BasePlaybookViewModel basePlaybookViewModel = this.LLILZIL;
                    if (basePlaybookViewModel == null || (enumC20429314wl = basePlaybookViewModel.LLIZLLLIL) == null) {
                        enumC20429314wl = EnumC20429314wl.MULTI_GUEST;
                    }
                    int i3 = C20386914pv.LIZ[enumC20429314wl.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2 && i3 != 3) {
                            if (i3 == 4) {
                                i = 2131855290;
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            i = 2131855282;
                        }
                    } else {
                        i = 2131854095;
                    }
                    textView3.setText(context3.getString(i));
                }
                C20382814pG c20382814pG5 = this.LLILZLL;
                if (c20382814pG5 != null && (list2 = c20382814pG5.LJJ) != null) {
                    Iterator<C20386614ps> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            C20386614ps c20386614ps = next;
                            if (c20386614ps.LIZ == EnumC979090baN.START && c20386614ps.LIZIZ != null) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C20386614ps c20386614ps2 = next;
                    if (c20386614ps2 != null && (c16fs = this.LLJJJJ) != null) {
                        c16fs.setText(c20386614ps2.LIZIZ);
                    }
                    Iterator<C20386614ps> it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            C20386614ps c20386614ps3 = next2;
                            if (c20386614ps3.LIZ == EnumC979090baN.END && c20386614ps3.LIZIZ != null) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    C20386614ps c20386614ps4 = next2;
                    if (c20386614ps4 != null) {
                        View view2 = this.LLJJJJJIL;
                        if ((view2 instanceof TextView) && (textView2 = (TextView) view2) != null) {
                            textView2.setText(c20386614ps4.LIZIZ);
                        }
                    }
                    Iterator<C20386614ps> it4 = list2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next3 = it4.next();
                            C20386614ps c20386614ps5 = next3;
                            if (c20386614ps5.LIZ == EnumC979090baN.BACK && c20386614ps5.LIZIZ != null) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    C20386614ps c20386614ps6 = next3;
                    if (c20386614ps6 != null && (textView = this.LLJJJJLIIL) != null) {
                        textView.setText(c20386614ps6.LIZIZ);
                    }
                }
                C1570050qxX.LIZ(new ACListenerS165S0100000_31(this, 112), this.LLJJJJ);
                C1570050qxX.LIZ(new ACListenerS165S0100000_31(this, 113), this.LLJJJJJIL);
                C1570050qxX.LIZ(new ACListenerS165S0100000_31(this, 105), this.LLJJJJLIIL);
            }
            this.LLJJJ = true;
        }
        Playbook playbook2 = c20379114of.LIZ;
        if (!playbook2.isMyCreation && playbook2.playbookVisibility == 2) {
            C16FS c16fs2 = this.LLJJJJ;
            if (c16fs2 != null) {
                c16fs2.setClickable(false);
            }
            C16FS c16fs3 = this.LLJJJJ;
            if (c16fs3 != null) {
                C786410Ut5.j5(c16fs3, 0.5f);
            }
        } else {
            C16FS c16fs4 = this.LLJJJJ;
            if (c16fs4 != null) {
                c16fs4.setClickable(true);
            }
            C16FS c16fs5 = this.LLJJJJ;
            if (c16fs5 != null) {
                C786410Ut5.j5(c16fs5, 1.0f);
            }
        }
        RecyclerView recyclerView2 = this.LLJILJILJ;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(getScrollListener());
        }
        C410901il c410901il = new C410901il(getListAdapter().LL);
        Integer numValueOf = Integer.valueOf(c20379114of.LIZ.automationUserSetting);
        PlaybookContent playbookContent2 = c20379114of.LIZ.content;
        if (playbookContent2 != null) {
            boolValueOf = Boolean.valueOf(playbookContent2.supportAutomation);
        } else {
            boolValueOf = null;
        }
        boolean zLJIJJLI = PlaybookUtilKt.LJIJJLI(C500260Jjc.LJJJI(boolValueOf), numValueOf);
        C410901il c410901il2 = new C410901il();
        Playbook playbook3 = c20379114of.LIZ;
        c410901il2.add(C125900dt.LIZ(playbook3, n0(playbook3), p0(c20379114of.LIZ), this.LLILZ));
        Playbook playbook4 = c20379114of.LIZ;
        long j = playbook4.playbookId;
        if ((this.LLILLL & 256) != 0 && playbook4.isMyCreation) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLIZ = playbook4.LIZ();
        if (!this.LLJLLIL && z2) {
            this.LLJLLIL = true;
            C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
            C978360bZC.LJIJJ(z0(), "more", Long.valueOf(j), i0(), Boolean.valueOf(zLIZ), 32);
        }
        PlaybookContent playbookContent3 = c20379114of.LIZ.content;
        if (playbookContent3 != null) {
            boolValueOf2 = Boolean.valueOf(playbookContent3.supportAutomation);
        } else {
            boolValueOf2 = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf2) && PlaybookAutoRunTypeSetting.INSTANCE.enable() && (this.LLILZIL instanceof PlaybookAnchorViewModel)) {
            c410901il2.add(new C11V2(c20379114of.LIZ.automationUserSetting));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C20360614lg c20360614lg = c20379114of.LIZIZ;
        if (c20360614lg != null && (list = c20360614lg.LIZIZ) != null) {
            int i4 = 0;
            for (C20359414lU c20359414lU : list) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C20359414lU c20359414lU2 = c20359414lU;
                    C20359414lU c20359414lU3 = new C20359414lU(c20359414lU2.LIZ, c20359414lU2.LIZIZ, c20359414lU2.LIZJ, c20359414lU2.LIZLLL, c20359414lU2.LJ, c20359414lU2.LJFF, c20359414lU2.LJI, c20359414lU2.LJII);
                    boolean zS0 = s0(i4);
                    if (zLJIJJLI && c20359414lU2.LIZJ.isEmpty() && (this.LLILZIL instanceof PlaybookAnchorViewModel)) {
                        strLJII = C20359314lT.LJII(c20359414lU2, true);
                    } else {
                        strLJII = null;
                    }
                    c410901il2.add(new C20389314qJ(c20359414lU3, zS0, strLJII));
                    if (c20359414lU2.LJI && MultiGuestPlaybookDecorationSetting.INSTANCE.enable() && (PlaybookUtilKt.LJJ(this.LLILLJJLI) || ((this.LLILZIL instanceof PlaybookAnchorViewModel) && zLJIJJLI))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i6 = 0;
                    for (C20361214lm c20361214lm : c20359414lU2.LIZJ) {
                        int i7 = i6 + 1;
                        if (i6 >= 0) {
                            C20361214lm c20361214lm2 = c20361214lm;
                            C20361214lm c20361214lmLIZ = c20361214lm2.LIZ();
                            int size = c20359414lU2.LIZJ.size();
                            if (zLJIJJLI && (this.LLILZIL instanceof PlaybookAnchorViewModel)) {
                                strLJII3 = C20359314lT.LJII(c20359414lU2, true);
                            } else {
                                strLJII3 = null;
                            }
                            boolean zS02 = s0(i4);
                            if (c20359414lU2.LJII == EnumC1779020wOa.RUNNING) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            PlayRule playRule = c20361214lm2.LIZLLL;
                            if (playRule == null || (config = playRule.getConfig()) == null || (enumC20429514wn = config.LJII) == null) {
                                enumC20429514wn = EnumC20429514wn.IDLE;
                            }
                            int i8 = i4;
                            C20365414mS c20365414mS = new C20365414mS(c20361214lmLIZ, size, i6, i8, strLJII3, zS02, z4, enumC20429514wn, z3, 3584);
                            c410901il2.add(c20365414mS);
                            C20365214mQ.LIZIZ(c20365414mS, linkedHashMap);
                            i6 = i7;
                            i4 = i8;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    if (z3) {
                        EnumC1779020wOa enumC1779020wOa = c20359414lU2.LJII;
                        boolean zS03 = s0(i4);
                        if (zLJIJJLI) {
                            strLJII2 = C20359314lT.LJII(c20359414lU2, true);
                        } else {
                            strLJII2 = null;
                        }
                        c410901il2.add(new C1777560wME(enumC1779020wOa, zS03, strLJII2));
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        for (Object obj : c410901il2) {
            if (obj instanceof C20365414mS) {
                C20365214mQ.LIZ((InterfaceC20365314mR) obj, linkedHashMap);
            }
        }
        F0(c20379114of);
        try {
            C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C20384914pb(c410901il, c410901il2), true);
            getListAdapter().LLLII(c410901il2);
            c21341918fZLIZ.LIZJ(getListAdapter());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            getListAdapter().LLLII(c410901il2);
            getListAdapter().notifyDataSetChanged();
        }
        e0(c20379114of);
    }

    public final void l0(EnumC979090baN enumC979090baN, Function1<? super Function1<? super EnumC979090baN, Unit>, Unit> function1) {
        BasePlaybookViewModel basePlaybookViewModel;
        MutableLiveData<C20379114of> mutableLiveData;
        C20379114of value;
        Playbook playbook;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        boolean zBooleanValue;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ2;
        List<C20386614ps> list;
        C20386614ps next;
        Unit unit;
        C20382814pG c20382814pG = this.LLILZLL;
        if (c20382814pG != null && (list = c20382814pG.LJJ) != null) {
            Iterator<C20386614ps> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C20386614ps c20386614ps = next;
                    if (c20386614ps.LIZ == enumC979090baN && c20386614ps.LIZLLL != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C20386614ps c20386614ps2 = next;
            if (c20386614ps2 != null) {
                int i = C20386914pv.LIZIZ[c20386614ps2.LIZJ.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        function1.invoke(c20386614ps2.LIZLLL);
                    }
                    unit = Unit.LIZ;
                } else {
                    Function1<EnumC979090baN, Unit> function12 = c20386614ps2.LIZLLL;
                    if (function12 != null) {
                        function12.invoke(c20386614ps2.LIZ);
                        unit = Unit.LIZ;
                    }
                }
                if (unit != null) {
                    return;
                }
            }
        }
        if (C930540aK4.LIZJ() && Intrinsics.LJFF(this.LLJI, "room_banner") && enumC979090baN == EnumC979090baN.BACK && (basePlaybookViewModel = this.LLILZIL) != null && (mutableLiveData = basePlaybookViewModel.LLILLL) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.LIZ) != null) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null && (playbookAnchorServiceV2LIZIZ2 = C784920Uqg.LIZIZ(dataChannel)) != null) {
                playbookAnchorServiceV2LIZIZ2.LJIL(EnumC20429414wm.DETAIL, "custom footer", null);
            }
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel2)) != null) {
                Function2 function2 = (Function2) playbookAnchorServiceV2LIZIZ.LLJI.gg0(PlaybookBizChannel.class);
                if (function2 != null) {
                    zBooleanValue = ((Boolean) function2.invoke(EnumC986300bm0.DID_CLICK_GO_BACK, playbook)).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                if (boolValueOf != null && boolValueOf.booleanValue()) {
                    return;
                }
            }
        }
        function1.invoke(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager, com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ui.PlaybookDetailView$layoutManager$1] */
    public C20384614pY(BasePlaybookSheetFragment basePlaybookSheetFragment, DataChannel dataChannel, int i, boolean z, BasePlaybookViewModel basePlaybookViewModel, C20382814pG c20382814pG, long j, InterfaceC20387814q4 interfaceC20387814q4, Function1 function1, String str) {
        AbstractC21674919sB abstractC21674919sB;
        super(basePlaybookSheetFragment.requireContext());
        this.LL = basePlaybookSheetFragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = basePlaybookViewModel;
        this.LLILZLL = c20382814pG;
        this.LLIZ = j;
        this.LLIZLLLIL = interfaceC20387814q4;
        this.LLJ = function1;
        this.LLJI = str;
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1320));
        this.LLJJL = true;
        this.LLJLLL = new LinkedHashSet();
        this.LLJZ = new LinkedHashSet();
        this.LLL = System.currentTimeMillis();
        this.LLLFZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(330));
        final Context context = getContext();
        ?? r5 = new LinearLayoutManager(context) { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ui.PlaybookDetailView$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void scrollToPositionWithOffset(int i2, int i3) {
                View viewFindViewByPosition = findViewByPosition(i2);
                if (viewFindViewByPosition == null) {
                    super.scrollToPositionWithOffset(i2, i3);
                    return;
                }
                int top = viewFindViewByPosition.getTop() + i3;
                scrollToPosition(i2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("scrollToPositionWithOffset top:");
                sbLIZ.append(top);
                C20441214yg.LIZIZ("PlaybookDetailView", C2188811AlT.LIZIZ(sbLIZ));
                C20384614pY c20384614pY = this.LL;
                HandlerHook.viewPost(c20384614pY, new ARunnableS42S0101000_31(top, c20384614pY, 2));
            }
        };
        this.LLLI = r5;
        ViewGroup.inflate(getContext(), R.layout.ha9, this).setBackgroundResource(R.drawable.e38);
        this.LLJIJIL = findViewById(R.id.nkl);
        this.LLJILJIL = findViewById(R.id.nc2);
        this.LLJLIL = (ViewGroup) findViewById(R.id.jit);
        this.LLJLILLLLZIIL = (ViewGroup) findViewById(R.id.ihh);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tvw);
        this.LLJILJILJ = recyclerView;
        this.LLJILLL = findViewById(R.id.qsj);
        this.LLJJ = (C16F5) findViewById(R.id.qsm);
        View viewFindViewById = findViewById(R.id.qsl);
        this.LLJJI = viewFindViewById;
        this.LLJJIII = (LiveIconView) findViewById(R.id.qsk);
        O0();
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS610S0100000_31(this, 281));
        }
        this.LLJJLIIIJLLLLLLLZ = findViewById(R.id.vg_empty);
        View viewFindViewById2 = findViewById(R.id.cw9);
        this.LLJL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 111), viewFindViewById2);
        }
        if (recyclerView != 0) {
            recyclerView.setLayoutManager(r5);
            AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.LJIJJLI(0L);
            }
        }
        AbstractC21673719rz itemAnimator2 = recyclerView != 0 ? recyclerView.getItemAnimator() : null;
        if ((itemAnimator2 instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator2) != null) {
            abstractC21674919sB.LLIZ = false;
        }
        if (recyclerView != 0) {
            recyclerView.addItemDecoration(new C0IDG(8));
            recyclerView.addOnScrollListener(new AsS56S0100000_31(this, 8));
            recyclerView.setAdapter(getListAdapter());
        }
    }
}
