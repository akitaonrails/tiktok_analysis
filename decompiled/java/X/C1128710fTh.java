package X;

import Y.ACListenerS152S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS18S0210000_17;
import Y.ARunnableS20S0100100_17;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftSelectedChangeEvent;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.CampaignProgressChannel;
import com.bytedance.android.livesdk.CollaborateGiftingStateChannel;
import com.bytedance.android.livesdk.GiftLimitDisableEvent;
import com.bytedance.android.livesdk.api.coin.incentive.UgPointsGiftEndEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite.GiftFavoriteDialogFragment;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.gift.event.LiveGiftPanelSendDisableEvent;
import com.bytedance.android.livesdk.gift.model.ACKReqForStrategy;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftOption;
import com.bytedance.android.livesdk.gift.model.GiftCampaignProgress;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftListAckResponse;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.RiskCtl;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInteractiveEnlargedPreviewSettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMagicSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelPulldownSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftRankingExclusiveTabSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftRealTimeApiSettings;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveRevenueFirstRechargeExpansionOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.ui.framework.DialogLeaf;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS114S0400000_17;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS253S0000000_17;
import kotlin.jvm.internal.AwS295S0300000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS74S0301000_17;
import kotlin.jvm.internal.AwS9S0201100_17;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128710fTh extends DialogLeaf implements InterfaceC1127000fQw, InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.AndroidViewModelFactory> {
    public static final /* synthetic */ int h = 0;
    public final AbstractC2252651DEx LLJILJILJ;
    public final AbstractC2252651DEx LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public RunnableC781530UlD LLJJIII;
    public C1127050fR1 LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public C16FZ LLJJIJIL;
    public C1129900fVc LLJJJ;
    public C1126220fPg LLJJJIL;
    public C1128800fTq LLJJJJ;
    public C1128920fU2 LLJJJJJIL;
    public final List<Long> LLJJJJLIIL;
    public final List<Long> LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public final List<Long> LLJL;
    public final List<Long> LLJLIL;
    public final List<Long> LLJLILLLLZIIL;
    public Map<Long, C1130160fW2> LLJLL;
    public Map<Long, Integer> LLJLLIL;
    public int LLJLLL;
    public C1129910fVd LLJZ;
    public final C11NJ LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public Room LLLI;
    public boolean LLLII;
    public long LLLIIII;
    public long LLLIIIIL;
    public final C1127870fSL LLLIIIL;
    public int LLLIIL;
    public int LLLIILIL;
    public ArrayList<GiftPage> LLLIL;
    public C1129040fUE LLLILZ;
    public View LLLILZJ;
    public View LLLILZLLLI;
    public ViewGroup LLLIZZ;
    public ViewGroup LLLJ;
    public ViewGroup LLLJIL;
    public C1120070fFl LLLJL;
    public boolean LLLL;
    public ConstraintLayout LLLLII;
    public FrameLayout LLLLIIIILLL;
    public ViewGroup LLLLIIL;
    public int LLLLIILL;
    public View LLLLIILLL;
    public View LLLLIL;
    public final C1128600fTW LLLLILI;
    public final C190400oI LLLLJ;
    public final C1133350fbB LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;
    public final C01GW LLLLLILLIL;
    public final C01GW LLLLLJIL;
    public final C01GW LLLLLJLJLL;
    public final C01GW LLLLLL;
    public boolean LLLLLLIL;
    public boolean LLLLLLJ;
    public C1121570fIB LLLLLLL;
    public boolean LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public boolean LLLLLLLZIL;
    public Function0<Unit> LLLLLLZ;
    public Boolean LLLLLLZZ;
    public int LLLLLZ;
    public Long LLLLLZIL;
    public final C11RK<Integer> LLLLLZL;
    public final C11RK<List<User>> LLLLZ;
    public final C11RK<Long> LLLLZI;
    public final C11RK<Integer> LLLLZIL;
    public RiskCtl LLLLZLL;
    public C1133890fc3 LLLLZLLIL;
    public View LLLLZLLLI;
    public C1129700fVI LLLZ;
    public C498540Jgq LLLZI;
    public TextView LLLZIIL;
    public boolean LLLZIL;
    public boolean LLLZL;
    public boolean LLLZLL;
    public long LLLZLZ;
    public boolean LLLZZ;
    public Long LLLZZIL;
    public long LLZ;
    public final long LLZIL;
    public boolean LLZILL;
    public CopyOnWriteArraySet<Double> LLZL;
    public boolean LLZLI;
    public final int LLZLL;
    public final AtomicBoolean LLZLLIL;
    public String LLZLLLL;
    public final C522020Kdc LLZZ;
    public final C01GW LLZZJLIL;
    public final ViewTreeObserverOnPreDrawListenerC1129520fV0 LLZZLLIL;
    public final ViewTreeObserverOnGlobalLayoutListenerC1151700g4m LLZZZIL;
    public C1117710fBx LLZZZZ;
    public final ARunnableS117S0100000_17 a;
    public final C1128730fTj b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    @Override // X.AbstractC1100450ek7
    public final void LJIILJJIL() {
        this.LLLFF = true;
        LJJIJIIJIL(true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v13 java.util.List<com.bytedance.android.live.base.model.user.User>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // com.bytedance.android.livesdk.ui.framework.DialogLeaf, X.AbstractC1100450ek7
    public final void LJJIIZI() {
        /*
            Method dump skipped, instruction units count: 2820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LJJIIZI():void");
    }

    public final void LJLLILLLL() {
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null) {
            RunnableC781530UlD runnableC781530UlD = this.LLJJIII;
            RecyclerView.LayoutManager layoutManager = runnableC781530UlD != null ? runnableC781530UlD.getLayoutManager() : null;
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (runnableC781530UlD == null || gridLayoutManager == null) {
                return;
            }
            C23250099c.LIZLLL(LJJLIIIJ(), C0PEM.LIZ.plus(this.LLZZ), null, new C1128490fTL(giftPanelLeafViewModelLJJLIIIIJ, runnableC781530UlD, gridLayoutManager, this, null), 2);
        }
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.AbstractC1100450ek7
    public final int LJIIJJI() {
        return EnumC1129580fV6.GIFT_PANEL_LEAF.getZIndex();
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJJIJ() {
        View view;
        C1126220fPg c1126220fPg;
        C1126220fPg c1126220fPg2 = this.LLJJJIL;
        if (c1126220fPg2 == null || !C500260Jjc.LJJJJIZL(c1126220fPg2) || (view = this.LLLLIL) == null || (c1126220fPg = this.LLJJJIL) == null) {
            return;
        }
        C1125500fOW.LIZIZ(c1126220fPg, view.getX(), view.getY(), false);
    }

    public final void LJJJJL() {
        ((ArrayList) this.LLJJJJLIIL).clear();
        ((ArrayList) this.LLJL).clear();
        ((ArrayList) this.LLJLIL).clear();
        C1128920fU2 c1128920fU2 = this.LLJJJJJIL;
        if (c1128920fU2 != null) {
            c1128920fU2.LLILLJJLI = EnumC1129610fV9.LL;
            RecyclerView recyclerView = c1128920fU2.LL;
            if (recyclerView != null) {
                recyclerView.invalidateItemDecorations();
            }
        }
    }

    public final boolean LJJJLIIL() {
        DataChannel dataChannel;
        C2176881AHm c2176881AHm;
        EnumC774050UXz enumC774050UXz;
        boolean zKg2 = ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).kg2();
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
        return (!LiveGiftRealTimeApiSettings.INSTANCE.enableRealTimeApiRequest() || this.e || zKg2 || C500260Jjc.LJJJI((giftLeafRootViewModelLJJLIIIJJIZ == null || (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL) == null || (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) == null || (enumC774050UXz = c2176881AHm.LIZ) == null) ? null : Boolean.valueOf(enumC774050UXz.isViewerWishAudience())) || this.LLLFFI || P1() != 1) ? false : true;
    }

    public final C1128960fU6 LJJJZ() {
        return (C1128960fU6) this.LLLLLL.getValue();
    }

    public final C1128910fU1 LJJLI() {
        return (C1128910fU1) this.LLLLLILLIL.getValue();
    }

    public final GiftPanelLeafViewModel LJJLIIIIJ() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftPanelLeafViewModel) new ViewModelProvider(fragment).get(GiftPanelLeafViewModel.class);
    }

    public final C1128980fU8 LJJLIIIJJI() {
        return (C1128980fU8) this.LLLLLJIL.getValue();
    }

    public final GiftLeafRootViewModel LJJLIIIJJIZ() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftLeafRootViewModel) new ViewModelProvider(fragment).get(GiftLeafRootViewModel.class);
    }

    public final C1129000fUA LJJLIIIJL() {
        return (C1129000fUA) this.LLZZJLIL.getValue();
    }

    public final C212100rn LJJLIIIJLJLI() {
        return (C212100rn) this.LLLLLIL.getValue();
    }

    public final C1128950fU5 LJJLIIIJLLLLLLLZ() {
        return (C1128950fU5) this.LLLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJZ() {
        Fragment fragment;
        int i;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null || fragment.getLifecycle() == null) {
            return;
        }
        C500260Jjc.LJIILIIL(this.LLJJIII);
        C20441214yg.LIZIZ("GiftPanelLeaf", "onSyncLoading: ");
        C20441214yg.LJIIIZ("TagGiftGallery", "giftList loading");
        C1129900fVc c1129900fVc = this.LLJJJ;
        if (c1129900fVc != null) {
            C786410Ut5.LJLLLLLL(8, c1129900fVc);
        }
        C16FZ c16fz = this.LLJJIJIL;
        boolean zLIZIZ = false;
        if (c16fz != null) {
            C786410Ut5.LJLLLLLL(0, c16fz);
        }
        C1128590fTV.LJ++;
        C1128590fTV.LJFF = SystemClock.uptimeMillis();
        int i2 = C1128590fTV.LJ;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
            i = zLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i = zLIZIZ;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("show_count", i2);
        jSONObject3.put("is_network_available", i);
        C1135800ff8.LJIILJJIL(jSONObject3, jSONObject, C158B.LIZ(), System.currentTimeMillis());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_loading_view_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
        C1CC2.LJ("gift_panel_loading_view_show", jSONObject3, jSONObject2, jSONObject);
        this.LLLIIL = 2;
    }

    public final void LJJZZIII() {
        C1126220fPg c1126220fPg = this.LLJJJIL;
        if (c1126220fPg == null || c1126220fPg.getVisibility() != 0) {
            return;
        }
        LJJIJIIJIL(true, true);
    }

    public final void LJLJL() {
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        C1127870fSL c1127870fSL = this.LLLIIIL;
        c1127870fSL.LIZ = null;
        c1127870fSL.LIZIZ = null;
        c1127870fSL.LIZJ = null;
        this.LLLIIII = -1L;
        this.LLLIIIIL = -1L;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ == null || (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null) {
            return;
        }
        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : value) {
            if (abstractC1126600fQI != null) {
                abstractC1126600fQI.LJIJ = -1L;
                abstractC1126600fQI.LJFF = null;
                abstractC1126600fQI.LJ = null;
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null) {
            return null;
        }
        return fragment.getLifecycle();
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return ViewModelProvider.AndroidViewModelFactory.Companion.getInstance((Application) C786410Ut5.N3(this.LL));
    }

    @Override // X.InterfaceC1127000fQw
    public final boolean LJIIIZ() {
        C1125380fOK c1125380fOK;
        User user;
        DataChannel dataChannel;
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
        if (giftLeafRootViewModelLJJLIIIJJIZ != null && (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null && C500260Jjc.LJJJIL(dataChannel)) {
            return true;
        }
        RiskCtl riskCtl = this.LLLLZLL;
        return (riskCtl == null || !riskCtl.disableSendGift || C1125800fP0.LJFF() || (c1125380fOK = (C1125380fOK) C13LP.LJJJLL(C1125800fP0.LIZLLL())) == null || (user = c1125380fOK.LIZ) == null || user.getId() != UserService.getInstance().user().getCurrentUserId()) ? false : true;
    }

    @Override // com.bytedance.android.livesdk.ui.framework.DialogLeaf, X.AbstractC1100450ek7
    public final void LJJIIZ() {
        DataChannel dataChannel;
        super.LJJIIZ();
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
        if (giftLeafRootViewModelLJJLIIIJJIZ == null || (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL) == null) {
            return;
        }
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        dataChannel.BQ2(c1100420ek4 != null ? c1100420ek4.getFragment() : null, GiftLimitDisableEvent.class, new AwS596S0100000_17(this, 451));
        C1100420ek4 c1100420ek42 = this.LLILZIL;
        dataChannel.BQ2(c1100420ek42 != null ? c1100420ek42.getFragment() : null, LiveGiftPanelSendDisableEvent.class, new AwS596S0100000_17(this, 452));
        C1100420ek4 c1100420ek43 = this.LLILZIL;
        dataChannel.BQ2(c1100420ek43 != null ? c1100420ek43.getFragment() : null, UgPointsGiftEndEvent.class, new AwS253S0000000_17(this, 0));
    }

    @Override // com.bytedance.android.livesdk.ui.framework.DialogLeaf, X.AbstractC1100450ek7
    public final void LJJIZ() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        C1100690ekV<AbstractC1125240fO6> c1100690ekV;
        DataChannel dataChannel;
        super.LJJIZ();
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
        if (giftLeafRootViewModelLJJLIIIJJIZ != null && (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null) {
            dataChannel.zQ2(this);
        }
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ2 = LJJLIIIJJIZ();
        if (giftLeafRootViewModelLJJLIIIJJIZ2 != null && (c1100690ekV = giftLeafRootViewModelLJJLIIIJJIZ2.LLILLL) != null) {
            c1100690ekV.LIZLLL(this.b);
        }
        RunnableC781530UlD runnableC781530UlD = this.LLJJIII;
        if (runnableC781530UlD != null && (viewTreeObserver2 = runnableC781530UlD.getViewTreeObserver()) != null) {
            ViewTreeObserverOnPreDrawListenerC1129520fV0 viewTreeObserverOnPreDrawListenerC1129520fV0 = this.LLZZLLIL;
            viewTreeObserver2.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1129520fV0);
            C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnPreDrawListenerC1129520fV0, ViewTreeObserver.OnPreDrawListener.class);
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJJIII;
        if (runnableC781530UlD2 != null && (viewTreeObserver = runnableC781530UlD2.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m = this.LLZZZIL;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1151700g4m);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1151700g4m, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        LJJLIIIJL().LIZIZ();
        C1128980fU8 c1128980fU8LJJLIIIJJI = LJJLIIIJJI();
        c1128980fU8LJJLIIIJJI.getClass();
        C1128970fU7 c1128970fU7 = C1130100fVw.LIZ;
        if (c1128970fU7.LJIIL && c1128980fU8LJJLIIIJJI.LIZIZ.LIZ(c1128980fU8LJJLIIIJJI.LJFF)) {
            c1128980fU8LJJLIIIJJI.LIZIZ.LIZJ(c1128980fU8LJJLIIIJJI.LJFF);
        }
        if (c1128970fU7.LJIILL && c1128980fU8LJJLIIIJJI.LIZIZ.LIZ(c1128980fU8LJJLIIIJJI.LJI)) {
            c1128980fU8LJJLIIIJJI.LIZIZ.LIZJ(c1128980fU8LJJLIIIJJI.LJI);
        }
        if (c1128980fU8LJJLIIIJJI.LIZIZ.LIZ(c1128980fU8LJJLIIIJJI.LJII)) {
            c1128980fU8LJJLIIIJJI.LIZIZ.LIZJ(c1128980fU8LJJLIIIJJI.LJII);
        }
        C1128960fU6 c1128960fU6LJJJZ = LJJJZ();
        DataChannel dataChannel2 = c1128960fU6LJJJZ.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.GQ2(c1128960fU6LJJJZ.LIZIZ, CollaborateGiftingStateChannel.class, c1128960fU6LJJJZ.LJ);
        }
        if (LiveGiftRankingExclusiveTabSetting.isEnabled()) {
            GiftManager.inst().getTeamRankManager().LJFF = null;
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C1124730fNH.LIZIZ();
        GiftManager.inst().removeAllGalleryInfoListener();
        LJLJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // com.bytedance.android.livesdk.ui.framework.DialogLeaf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1130030fVp LJJJIL() {
        /*
            r2 = this;
            boolean r0 = X.C753060TgO.LIZ()
            if (r0 == 0) goto L43
            boolean r0 = X.C497740JfY.LJJ()
            if (r0 == 0) goto L2d
            java.lang.Class<com.bytedance.android.livesdkapi.host.user.IHostPad> r0 = com.bytedance.android.livesdkapi.host.user.IHostPad.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.user.IHostPad r0 = (com.bytedance.android.livesdkapi.host.user.IHostPad) r0
            boolean r0 = r0.Nx()
            if (r0 != 0) goto L3f
            r0 = 2131887755(0x7f12068b, float:1.9410126E38)
        L1d:
            X.0fVp r1 = new X.0fVp
            r1.<init>()
            r1.LIZ = r0
            r0 = 48
            r1.LIZJ = r0
            r0 = 80
            r1.LIZIZ = r0
            return r1
        L2d:
            java.lang.Class<com.bytedance.android.livesdkapi.host.user.IHostPad> r0 = com.bytedance.android.livesdkapi.host.user.IHostPad.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.user.IHostPad r0 = (com.bytedance.android.livesdkapi.host.user.IHostPad) r0
            boolean r0 = r0.Nx()
            if (r0 != 0) goto L3f
            r0 = 2131887754(0x7f12068a, float:1.9410124E38)
            goto L1d
        L3f:
            r0 = 2131887756(0x7f12068c, float:1.9410128E38)
            goto L1d
        L43:
            r0 = 2131887753(0x7f120689, float:1.9410122E38)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LJJJIL():X.0fVp");
    }

    public final void LJJJJI() {
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null) {
            LifecycleCoroutineScope lifecycleCoroutineScopeLJJLIIIJ = LJJLIIIJ();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleCoroutineScopeLJJLIIIJ, C2107308Nj.LIZ.plus(this.LLZZ), null, new C1128410fTD(this, giftPanelLeafViewModelLJJLIIIIJ, null), 2);
        }
    }

    public final int LJJL() {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ == null || (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILZ) == null || (value = mutableLiveData.getValue()) == null) {
            return 1;
        }
        return value.intValue();
    }

    public final LifecycleCoroutineScope LJJLIIIJ() {
        return LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(getLifecycle());
    }

    public final long LJJLJ() {
        MutableLiveData<Long> mutableLiveData;
        Long value;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ == null || (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILZIL) == null || (value = mutableLiveData.getValue()) == null) {
            return 0L;
        }
        return value.longValue();
    }

    public final String LJJLJLI() {
        String str;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (!Intrinsics.LJFF(giftPanelLeafViewModelLJJLIIIIJ != null ? giftPanelLeafViewModelLJJLIIIIJ.LLILZLL : null, "")) {
            GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ2 = LJJLIIIIJ();
            return (giftPanelLeafViewModelLJJLIIIIJ2 == null || (str = giftPanelLeafViewModelLJJLIIIIJ2.LLILZLL) == null) ? "" : str;
        }
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ3 = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ3 != null) {
            giftPanelLeafViewModelLJJLIIIIJ3.LLILZLL = String.valueOf(LJJLJ());
        }
        return String.valueOf(LJJLJ());
    }

    public final boolean LJLIIIL() {
        DataChannel dataChannel;
        Boolean bool;
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
        if (giftLeafRootViewModelLJJLIIIJJIZ == null || (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL) == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final void LJZL() {
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
        DataChannel dataChannel = giftLeafRootViewModelLJJLIIIJJIZ != null ? giftLeafRootViewModelLJJLIIIJJIZ.LL : null;
        boolean z = this.LLLLLLLLL;
        C1121570fIB c1121570fIB = this.LLLLLLL;
        if (z) {
            C1129510fUz.LIZIZ = true;
            return;
        }
        if (!Intrinsics.LJFF(c1121570fIB != null ? c1121570fIB.LIZJ : null, "no2_booster_effect_notice")) {
            if (!Intrinsics.LJFF(c1121570fIB != null ? c1121570fIB.LIZJ : null, "no3_booster_effect_notice")) {
                return;
            }
        }
        if (!C1129510fUz.LIZIZ(dataChannel)) {
            this.LLLLLLLLL = true;
            C1129510fUz.LIZIZ = true;
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853752));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFZ() {
        /*
            r7 = this;
            X.0fU8 r4 = r7.LJJLIIIJJI()
            int r1 = r7.P1()
            long r2 = r7.LJJLJ()
            r0 = 16
            r6 = 0
            if (r1 != r0) goto L4b
            r4.getClass()
            boolean r0 = X.C1125800fP0.LJFF()
            if (r0 == 0) goto L4b
            r5 = 0
        L1b:
            X.0fVL r0 = r4.LJ
            X.11RK<java.lang.Integer> r1 = r0.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.onNext(r0)
            X.0fSt r0 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst()
            com.bytedance.android.livesdk.model.Gift r3 = r0.findGiftById(r2)
            if (r3 == 0) goto L53
            X.0fVL r0 = r4.LJ
            X.11RK<java.lang.Long> r2 = r0.LIZJ
            long r0 = r3.id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.onNext(r0)
            X.0fVL r0 = r4.LJ
            X.11RK<java.lang.Integer> r1 = r0.LIZLLL
            int r0 = r3.diamondCount
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.onNext(r0)
            return
        L4b:
            r4.getClass()
            int r5 = X.C1128980fU8.LIZ(r2)
            goto L1b
        L53:
            X.0fVL r0 = r4.LJ
            X.11RK<java.lang.Long> r2 = r0.LIZJ
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.onNext(r0)
            X.0fVL r0 = r4.LJ
            X.11RK<java.lang.Integer> r1 = r0.LIZLLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.onNext(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LLFZ():void");
    }

    public final int P1() {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ == null || (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLL) == null || (value = mutableLiveData.getValue()) == null) {
            return 1;
        }
        return value.intValue();
    }

    @Override // X.InterfaceC1127000fQw
    public final String LJIILL() {
        return this.LLZLLLL;
    }

    @Override // X.InterfaceC1127000fQw
    public final List<Long> LJJIJLIJ() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1127000fQw
    public final List<Long> LJJIL() {
        return this.LLJL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.0fV0] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.0fTj] */
    public C1128710fTh(Context context) {
        int zIndex = EnumC1129580fV6.GIFT_PANEL_LEAF.getZIndex();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1DFB c1dfb = C0PEM.LIZJ;
        super(context, zIndex, LiveGiftPanelPulldownSetting.INSTANCE.isEnabled());
        this.LLJILJILJ = abstractC2238408pq;
        this.LLJILLL = c1dfb;
        this.LLJJ = "";
        this.LLJJI = "";
        this.LLJJJJLIIL = new ArrayList();
        this.LLJJL = new ArrayList();
        this.LLJJLIIIJLLLLLLLZ = -1L;
        this.LLJL = new ArrayList();
        this.LLJLIL = new ArrayList();
        this.LLJLILLLLZIIL = new ArrayList();
        this.LLJLL = new LinkedHashMap();
        this.LLJLLIL = new LinkedHashMap();
        this.LLJZIJLIL = new C11NJ();
        this.LLL = true;
        this.LLLF = true;
        this.LLLFF = true;
        this.LLLIIII = -1L;
        this.LLLIIIIL = -1L;
        this.LLLIIIL = new C1127870fSL();
        this.LLLIIL = 1;
        this.LLLIILIL = 1;
        this.LLLIL = new ArrayList<>();
        C1128600fTW c1128600fTW = new C1128600fTW();
        this.LLLLILI = c1128600fTW;
        this.LLLLJ = new C190400oI(c1128600fTW);
        new C012L();
        c1128600fTW.LIZLLL = new C5182020e(this, 347);
        this.LLLLJI = new C1133350fbB();
        this.LLLLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 479));
        this.LLLLLIL = C452501pT.LIZIZ(new C5182020e(this, 351));
        this.LLLLLILLIL = C452501pT.LIZIZ(new AwS418S0200000_17(context, this, 81));
        this.LLLLLJIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 482));
        this.LLLLLJLJLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 455));
        this.LLLLLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 469));
        this.LLLLLLJ = true;
        this.LLLLLZ = 1;
        this.LLLLLZL = new C11RK<>();
        this.LLLLZ = new C11RK<>();
        this.LLLLZI = new C11RK<>();
        this.LLLLZIL = new C11RK<>();
        this.LLLZIL = true;
        this.LLLZL = true;
        this.LLLZLL = true;
        this.LLZIL = 100L;
        this.LLZL = new CopyOnWriteArraySet<>();
        this.LLZLL = 20;
        this.LLZLLIL = new AtomicBoolean(true);
        this.LLZZ = new C522020Kdc(CoroutineExceptionHandler.LJJLIL, 1);
        this.LLZZJLIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(this, 466));
        this.LLZZLLIL = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0fV0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                ViewTreeObserver viewTreeObserver;
                C1128710fTh c1128710fTh = this.LL;
                if (c1128710fTh.LLLZL) {
                    c1128710fTh.LLLZL = false;
                    C1128590fTV.LJJJ = SystemClock.uptimeMillis();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    C1128710fTh c1128710fTh2 = this.LL;
                    long j = jUptimeMillis - c1128710fTh2.LLLZLZ;
                    C1128590fTV.LJJIII = j;
                    C1128750fTl.LIZLLL(j, c1128710fTh2.LLZ);
                }
                RunnableC781530UlD runnableC781530UlD = this.LL.LLJJIII;
                if (runnableC781530UlD == null || (viewTreeObserver = runnableC781530UlD.getViewTreeObserver()) == null) {
                    return true;
                }
                viewTreeObserver.removeOnPreDrawListener(this);
                C2187701Ajg.LIZIZ(viewTreeObserver, this, ViewTreeObserver.OnPreDrawListener.class);
                return true;
            }
        };
        this.LLZZZIL = new ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(this, 11);
        this.a = new ARunnableS117S0100000_17(this, 228);
        this.b = new InterfaceC1100670ekT<AbstractC1125240fO6>() { // from class: X.0fTj
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0157  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x0161 A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:85:0x0130, B:87:0x0134, B:89:0x0138, B:96:0x0147, B:99:0x014d, B:104:0x0158, B:106:0x0161, B:107:0x0163, B:109:0x0167, B:110:0x016d, B:112:0x01b2, B:98:0x014b), top: B:208:0x0130 }] */
            /* JADX WARN: Removed duplicated region for block: B:109:0x0167 A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:85:0x0130, B:87:0x0134, B:89:0x0138, B:96:0x0147, B:99:0x014d, B:104:0x0158, B:106:0x0161, B:107:0x0163, B:109:0x0167, B:110:0x016d, B:112:0x01b2, B:98:0x014b), top: B:208:0x0130 }] */
            /* JADX WARN: Removed duplicated region for block: B:112:0x01b2 A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:85:0x0130, B:87:0x0134, B:89:0x0138, B:96:0x0147, B:99:0x014d, B:104:0x0158, B:106:0x0161, B:107:0x0163, B:109:0x0167, B:110:0x016d, B:112:0x01b2, B:98:0x014b), top: B:208:0x0130 }] */
            /* JADX WARN: Removed duplicated region for block: B:113:0x01b7  */
            /* JADX WARN: Removed duplicated region for block: B:114:0x01ba  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x02d2  */
            @Override // X.InterfaceC1100670ekT
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LLZZLLIL(X.AbstractC1125240fO6 r40) {
                /*
                    Method dump skipped, instruction units count: 983
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1128730fTj.LLZZLLIL(java.lang.Object):void");
            }
        };
        this.d = true;
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJIIJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        BagListViewModel bagListViewModelLIZJ;
        long id;
        C1128800fTq c1128800fTq = this.LLJJJJ;
        if (c1128800fTq != null && (abstractC1126600fQI instanceof C1126980fQu) && (bagListViewModelLIZJ = c1128800fTq.LIZJ()) != null) {
            C1126980fQu c1126980fQu = (C1126980fQu) abstractC1126600fQI;
            Room room = c1128800fTq.LJFF;
            long ownerUserId = 0;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            Room room2 = c1128800fTq.LJFF;
            if (room2 != null) {
                ownerUserId = room2.getOwnerUserId();
            }
            BagListViewModel.DQ2(bagListViewModelLIZJ, c1126980fQu, id, ownerUserId, c1128800fTq.LJIIJJI, new AwS561S0100000_17(abstractC1126600fQI, (AbstractC1126600fQI<? extends AnonymousClass0054>) 511), null, 32);
        }
    }

    @Override // X.InterfaceC1127000fQw
    public final boolean LJIILIIL(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        if (abstractC1126600fQI == null) {
            return false;
        }
        this.LLLLLJLJLL.getValue().getClass();
        return LJJJZ().LIZ(abstractC1126600fQI);
    }

    @Override // X.InterfaceC1127000fQw
    public final int LJIILLIIL(long j) {
        return LJJLIIIJILLIZJL(Long.valueOf(j));
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJIJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        LJJLIIIJL().getClass();
        C1142070fpF c1142070fpF = C1142070fpF.LIZ;
        EnumC1142180fpQ enumC1142180fpQ = EnumC1142180fpQ.PANEL_ITEM;
        c1142070fpF.getClass();
        if (C1142070fpF.LIZJ(null, "toggle")) {
            C1142070fpF.LIZLLL();
            C1136870fgr c1136870fgrLJII = C1142070fpF.LJII(abstractC1126600fQI, enumC1142180fpQ);
            if (c1136870fgrLJII != null) {
                C1142070fpF.LJJIFFI(c1136870fgrLJII, null);
            }
        }
        C1129000fUA.LIZ(abstractC1126600fQI);
    }

    @Override // X.InterfaceC1127000fQw
    public final long LJIJJLI(C01AG c01ag) {
        return LJJLI().LIZIZ(c01ag);
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        C1128590fTV.LJJIJIL.put(Long.valueOf(abstractC1126600fQI.LJI()), Boolean.FALSE);
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJJI(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        C1128590fTV.LJJIJL.put(Long.valueOf(abstractC1126600fQI.LJI()), Boolean.TRUE);
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJJIFFI(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        int i;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        String strLJIILIIL;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            i = 0;
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 : value) {
                int i2 = i + 1;
                if (abstractC1126600fQI3 != null) {
                    strLJIILIIL = abstractC1126600fQI3.LJIILIIL();
                } else {
                    strLJIILIIL = null;
                }
                if (Intrinsics.LJFF(strLJIILIIL, abstractC1126600fQI.LJIILIIL())) {
                    abstractC1126600fQI2 = abstractC1126600fQI;
                    break;
                }
                i = i2;
            }
            i = 0;
            abstractC1126600fQI2 = null;
        } else {
            i = 0;
            abstractC1126600fQI2 = null;
        }
        if (!Intrinsics.LJFF(abstractC1126600fQI.LJIILIIL(), LJJLJLI())) {
            if (abstractC1126600fQI2 != null) {
                abstractC1126600fQI2.LIZLLL = false;
                abstractC1126600fQI2.LJ = null;
            }
            C1127050fR1 c1127050fR1 = this.LLJJIJI;
            if (c1127050fR1 != null) {
                c1127050fR1.LLLJ(i, abstractC1126600fQI2, this.LLJJIII);
                return;
            }
            return;
        }
        if (abstractC1126600fQI2 != null) {
            abstractC1126600fQI2.LIZLLL = false;
            abstractC1126600fQI2.LJ = null;
        }
        C1127050fR1 c1127050fR12 = this.LLJJIJI;
        if (c1127050fR12 != null) {
            c1127050fR12.LLLJ(i, abstractC1126600fQI2, this.LLJJIII);
        }
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJJII(AwS561S0100000_17 awS561S0100000_17) {
        this.LLLLLLZ = awS561S0100000_17;
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJJIII(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        LJJLIIIJL().getClass();
        C1129000fUA.LIZJ(abstractC1126600fQI);
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJJIIJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        C1128590fTV.LJJIJIL.put(Long.valueOf(abstractC1126600fQI.LJI()), Boolean.TRUE);
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJJIIJZLJL(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        C1128590fTV.LJJIJL.put(Long.valueOf(abstractC1126600fQI.LJI()), Boolean.FALSE);
    }

    public final boolean LJJJJJL(long j) {
        long ownerUserId;
        C1127130fR9 c1127130fR9;
        FreqLimitGiftOption freqLimitOption;
        int iIntValue;
        DataChannel dataChannel;
        Room room;
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
        if (giftLeafRootViewModelLJJLIIIJJIZ != null && (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        Map<Long, C1127130fR9> freqLimitInfoList = GiftManager.inst().getFreqLimitInfoList();
        if (freqLimitInfoList == null || (c1127130fR9 = freqLimitInfoList.get(Long.valueOf(j))) == null || (freqLimitOption = GiftManager.inst().getFreqLimitOption(Long.valueOf(j))) == null) {
            return false;
        }
        if (!c1127130fR9.LIZJ) {
            iIntValue = c1127130fR9.LIZIZ;
        } else {
            Integer num = (Integer) ((LinkedHashMap) c1127130fR9.LIZLLL).get(Long.valueOf(ownerUserId));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = c1127130fR9.LIZIZ;
            }
        }
        if (iIntValue > 0 || freqLimitOption.refreshTimeStamp <= System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
            return false;
        }
        return true;
    }

    public final AbstractC1126600fQI<? extends AnonymousClass0054> LJJJJLL(Gift gift) {
        AbstractC1126600fQI<? extends AnonymousClass0054> c1126040fPO;
        if (gift.type == 3) {
            c1126040fPO = new C2684012c(gift);
        } else if (gift.LJ()) {
            c1126040fPO = new C293001Bo(gift);
        } else {
            c1126040fPO = new C1126040fPO(gift);
        }
        C1121570fIB c1121570fIB = this.LLLLLLL;
        if (c1121570fIB != null && c1121570fIB.LJJII == gift.id) {
            c1126040fPO.LJIJJLI = true;
        }
        C1118530fDH.LJFF(gift, c1126040fPO);
        return c1126040fPO;
    }

    public final void LJJJJZI(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        C1129700fVI c1129700fVI;
        Boolean bool = this.LLLLLLZZ;
        if (bool != null && !Intrinsics.LJFF(bool, Boolean.TRUE) && (c1129700fVI = this.LLLZ) != null) {
            AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this, 450);
            if (abstractC1126600fQI != null && C1127580fRs.LIZLLL(Long.valueOf(abstractC1126600fQI.LJFF()))) {
                C1127580fRs.LIZJ(abstractC1126600fQI.LIZLLL(), new AwS114S0400000_17(C1127580fRs.LIZIZ(), abstractC1126600fQI, c1129700fVI, awS596S0100000_17, 11));
                return;
            }
            C500260Jjc.LJIILIIL(c1129700fVI.LIZLLL);
            C500260Jjc.LJIILIIL(c1129700fVI.LIZJ);
            InterfaceC420801kM interfaceC420801kM = c1129700fVI.LJFF;
            if (interfaceC420801kM != null) {
                c1129700fVI.LIZIZ.LIZIZ(interfaceC420801kM);
            }
            awS596S0100000_17.invoke(Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ce A[LOOP:0: B:15:0x0027->B:63:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4 A[EDGE_INSN: B:72:0x00e4->B:70:0x00e4 BREAK  A[LOOP:0: B:15:0x0027->B:63:0x00ce], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJLIIIJILLIZJL(java.lang.Long r15) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LJJLIIIJILLIZJL(java.lang.Long):int");
    }

    public final AbstractC1126600fQI<? extends AnonymousClass0054> LJJLIIJ(Long l) {
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        Long lValueOf;
        Integer numValueOf;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : value) {
                if (abstractC1126600fQI != null) {
                    lValueOf = Long.valueOf(abstractC1126600fQI.LJI());
                } else {
                    lValueOf = null;
                }
                if (Intrinsics.LJFF(lValueOf, l)) {
                    if (abstractC1126600fQI != null) {
                        numValueOf = Integer.valueOf(abstractC1126600fQI.LIZ);
                    } else {
                        numValueOf = null;
                    }
                    if (!C01AW.LIZIZ(numValueOf)) {
                        return abstractC1126600fQI;
                    }
                }
            }
        }
        return null;
    }

    public final long LJJLIL(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList) {
        long jLongValue;
        Boolean boolValueOf;
        Integer numValueOf;
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ;
        DataChannel dataChannel;
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ2;
        DataChannel dataChannel2;
        Long lValueOf;
        long jLJJLJ = LJJLJ();
        Long l = C1130100fVw.LIZ.LIZIZ;
        long jLJI = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (linkedList.isEmpty()) {
            return -1000L;
        }
        boolean z = false;
        if (P1() == 1) {
            InterfaceC1133710fbl.LIZ.getClass();
            if (((C1133940fc8) C1120710fGn.LIZ()).LJIIJ() && !LiveRevenueFirstRechargeExpansionOptSetting.INSTANCE.isGroupV1()) {
                jLJJLJ = ((C1133940fc8) C1120710fGn.LIZ()).LJI();
                if (C1131560fYI.LIZIZ() > 0 || C1131560fYI.LIZ()) {
                    Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it2 = linkedList.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next() instanceof C293101Bp) {
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) C13LP.LJJJLZIJ(i + 1, linkedList);
                    if (abstractC1126600fQI != null) {
                        jLJJLJ = abstractC1126600fQI.LJI();
                    }
                }
            }
        }
        if (P1() == 1) {
            C1126800fQc.LIZ.GN();
            if (C1121450fHz.LIZIZ(EnumC1121470fI1.GIFT_PANEL_TP.getType()) != null) {
                jLJJLJ = C1128580fTU.LIZ();
            }
        }
        if (jLongValue != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeData#has anchorGiftId ");
            sbLIZ.append(jLongValue);
            C20441214yg.LIZIZ("GiftPanelLeaf", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            jLongValue = jLJJLJ;
        }
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = null;
        if (P1() == 1 && (giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ()) != null && (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null && C146500hD.LIZ(dataChannel) && (giftLeafRootViewModelLJJLIIIJJIZ2 = LJJLIIIJJIZ()) != null && (dataChannel2 = giftLeafRootViewModelLJJLIIIJJIZ2.LL) != null && (lValueOf = Long.valueOf(C01AU.LIZ(dataChannel2))) != null && lValueOf.longValue() > 0) {
            jLongValue = lValueOf.longValue();
        }
        Gift giftLJI = C1138640fji.LJI(jLongValue);
        if (giftLJI != null) {
            if (giftLJI.LIZIZ() || giftLJI.LJII() || giftLJI.LJIIIIZZ()) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getSelectGiftId: giftId is magic/shiny gift, giftId = ");
            sbLIZ2.append(jLongValue);
            C20441214yg.LJIIIZ("GiftPanelLeaf", C2188811AlT.LIZIZ(sbLIZ2));
        } else if (LJJZZI(jLongValue, linkedList) == -1 && (!linkedList.isEmpty())) {
            Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it3 = linkedList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AbstractC1126600fQI<? extends AnonymousClass0054> next = it3.next();
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = next;
                if (abstractC1126600fQI3 != null) {
                    numValueOf = Integer.valueOf(abstractC1126600fQI3.LIZ);
                } else {
                    numValueOf = null;
                }
                if (!C01AW.LIZIZ(numValueOf)) {
                    abstractC1126600fQI2 = next;
                    break;
                }
            }
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI4 = abstractC1126600fQI2;
            if (abstractC1126600fQI4 != null) {
                jLJI = abstractC1126600fQI4.LJI();
            }
            jLongValue = jLJI;
        }
        Gift giftLJI2 = C1138640fji.LJI(jLongValue);
        if (giftLJI2 != null && giftLJI2.LIZIZ()) {
            if (LiveGiftMagicSetting.INSTANCE.isEnable()) {
                return C1125060fNo.LIZ(jLongValue, linkedList);
            }
            return LJJLJ();
        }
        return jLongValue;
    }

    public final void LJL(int i) {
        if (P1() != 15) {
            C1129910fVd c1129910fVd = this.LLJZ;
            if (c1129910fVd != null) {
                c1129910fVd.LLILZIL = false;
                c1129910fVd.LLIZ = -1;
                c1129910fVd.LL.invalidateItemDecorations();
                return;
            }
            return;
        }
        if (!C1118430fD7.LIZ()) {
            C1129910fVd c1129910fVd2 = this.LLJZ;
            if (c1129910fVd2 != null) {
                c1129910fVd2.LLILZIL = false;
                c1129910fVd2.LLIZ = -1;
                c1129910fVd2.LL.invalidateItemDecorations();
                return;
            }
            return;
        }
        int i2 = i - 1;
        if (i2 > 0) {
            C1129910fVd c1129910fVd3 = this.LLJZ;
            if (c1129910fVd3 != null) {
                C500260Jjc.LJJLIIIJJI(500L, new AwS9S0201100_17(c1129910fVd3, i2, new AwS561S0100000_17(this, 457), 1));
                return;
            }
            return;
        }
        C1129910fVd c1129910fVd4 = this.LLJZ;
        if (c1129910fVd4 == null) {
            return;
        }
        c1129910fVd4.LLILZIL = false;
        c1129910fVd4.LLIZ = -1;
        c1129910fVd4.LL.invalidateItemDecorations();
    }

    public final boolean LJLI(int i) {
        LJJLIIIJLJLI().getClass();
        if (i == 18) {
            return true;
        }
        return false;
    }

    public final void LJLIL(long j) throws JSONException {
        boolean zBooleanValue;
        DataChannel dataChannel;
        int i;
        EnumC1130940fXI value;
        boolean zLJJI;
        boolean z;
        int iLJIIJJI;
        int i2;
        String strLJIILIIL;
        MutableLiveData<EnumC1130940fXI> mutableLiveData;
        Boolean bool;
        if (j > 0 && j == LJJLJ() && !this.LLLLLLLLLL) {
            Long lValueOf = Long.valueOf(j);
            HashMap<Long, Boolean> map = C1128590fTV.LJJIJIL;
            if (map.containsKey(lValueOf) && (bool = map.get(Long.valueOf(j))) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1128590fTV.LJJIJLIJ++;
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQILJJLIIJ = LJJLIIJ(Long.valueOf(j));
            C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
            if (!c1128760fTm.LJIIIZ) {
                GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
                if (giftLeafRootViewModelLJJLIIIJJIZ != null) {
                    dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL;
                } else {
                    dataChannel = null;
                }
                String str = this.LLZLLLL;
                boolean z2 = C1130430fWT.LIZ.LIZ;
                long jLJJLJ = LJJLJ();
                boolean zLJIL = C497740JfY.LJIL();
                int iLJJL = LJJL();
                String tabName = GiftManager.inst().getTabName(LJJL());
                int iLJJLIIIJILLIZJL = LJJLIIIJILLIZJL(Long.valueOf(LJJLJ()));
                Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
                if (giftFindGiftById != null) {
                    i = giftFindGiftById.diamondCount;
                } else {
                    i = 0;
                }
                Integer numValueOf = Integer.valueOf(i);
                Long lValueOf2 = Long.valueOf(this.LLLIIII);
                String strLJLJJL = LJLJJL(j);
                boolean zLJIIIZ = LJIIIZ();
                List<Long> list = this.LLJJJJLIIL;
                List<Long> list2 = this.LLJL;
                List<Long> list3 = this.LLJLIL;
                Map<Long, C1130160fW2> map2 = this.LLJLL;
                GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
                if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLJJJIL) != null) {
                    value = mutableLiveData.getValue();
                } else {
                    value = null;
                }
                C1125860fP6 c1125860fP6 = C1125820fP2.LJFF().LIZ;
                Gift giftFindGiftById2 = GiftManager.inst().findGiftById(j);
                if (abstractC1126600fQILJJLIIJ != null) {
                    zLJJI = abstractC1126600fQILJJLIIJ.LJJI();
                    C01AS c01as = abstractC1126600fQILJJLIIJ.LJIJJ;
                    if (c01as != null) {
                        z = c01as.LIZJ;
                    } else {
                        z = false;
                    }
                    iLJIIJJI = abstractC1126600fQILJJLIIJ.LJIIJJI();
                    C01AS c01as2 = abstractC1126600fQILJJLIIJ.LJIJJ;
                    if (c01as2 != null) {
                        i2 = c01as2.LIZLLL;
                    } else {
                        i2 = 0;
                    }
                    strLJIILIIL = abstractC1126600fQILJJLIIJ.LJIILIIL();
                    if (strLJIILIIL == null) {
                    }
                    C1128760fTm.LJJIJIIJIL(c1128760fTm, dataChannel, str, z2, jLJJLJ, zLJIL, iLJJL, tabName, iLJJLIIIJILLIZJL, numValueOf, lValueOf2, strLJLJJL, zLJIIIZ, list, list2, list3, map2, zBooleanValue, value, c1125860fP6, giftFindGiftById2, new C1129370fUl(zLJJI, z, iLJIIJJI, i2, strLJIILIIL, 0L, 32));
                } else {
                    zLJJI = false;
                    z = false;
                    iLJIIJJI = 0;
                    i2 = 0;
                }
                strLJIILIIL = "";
                C1128760fTm.LJJIJIIJIL(c1128760fTm, dataChannel, str, z2, jLJJLJ, zLJIL, iLJJL, tabName, iLJJLIIIJILLIZJL, numValueOf, lValueOf2, strLJLJJL, zLJIIIZ, list, list2, list3, map2, zBooleanValue, value, c1125860fP6, giftFindGiftById2, new C1129370fUl(zLJJI, z, iLJIIJJI, i2, strLJIILIIL, 0L, 32));
            }
            c1128760fTm.LJIIIZ = false;
            InterfaceC1133710fbl.LIZ.getClass();
            if (j == ((C1133940fc8) C1120710fGn.LIZ()).LJI() && C1126800fQc.LIZ() != null) {
                C1127240fRK.LIZIZ(C1130430fWT.LIZ.LIZ);
            }
            C1130100fVw.LIZ.LJIIIIZZ = C158B.LIZ();
        }
    }

    public final void LJLILLLLZI(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        C1100690ekV<AbstractC1125680fOo> c1100690ekV;
        C1100690ekV<AbstractC1127860fSK> c1100690ekV2;
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
        if (giftLeafRootViewModelLJJLIIIJJIZ != null && (c1100690ekV2 = giftLeafRootViewModelLJJLIIIJJIZ.LLILZ) != null) {
            c1100690ekV2.LIZ(new C1127880fSM(abstractC1126600fQI));
        }
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ2 = LJJLIIIJJIZ();
        if (giftLeafRootViewModelLJJLIIIJJIZ2 != null && (c1100690ekV = giftLeafRootViewModelLJJLIIIJJIZ2.LLILZLL) != null) {
            c1100690ekV.LIZ(new C1125660fOm(abstractC1126600fQI, this.LLZLLLL));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJLJI(long j) {
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        int i = 0;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = null;
        if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            int i2 = 0;
            int i3 = 0;
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 : value) {
                int i4 = i3 + 1;
                if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LJI() == j) {
                    if (Intrinsics.LJFF(LJJLJLI(), abstractC1126600fQI2.LJIILIIL())) {
                        abstractC1126600fQI2.LIZJ = true;
                        abstractC1126600fQI2.LIZLLL = false;
                        i2 = i3;
                        i3 = i4;
                        abstractC1126600fQI = abstractC1126600fQI2;
                    } else {
                        abstractC1126600fQI2.LIZJ = false;
                        abstractC1126600fQI2.LIZLLL = false;
                    }
                }
                i3 = i4;
            }
            i = i2;
        }
        C1127050fR1 c1127050fR1 = this.LLJJIJI;
        if (c1127050fR1 != null) {
            c1127050fR1.LLLJ(i, abstractC1126600fQI, this.LLJJIII);
        }
        C1126220fPg c1126220fPg = this.LLJJJIL;
        if (c1126220fPg != null) {
            C1125500fOW.LIZ(c1126220fPg, true);
        }
    }

    public final void LJLJJI(Gift gift) {
        List<Gift> list;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        GiftLockInfo giftLockInfo = gift.giftSubInfo;
        if (giftLockInfo != null) {
            if (giftLockInfo.mLockType == 3) {
                this.LLZL.add(Double.valueOf(gift.id));
            } else if (giftLockInfo.mLockType == 4) {
                ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).qH(gift.id);
            } else if (giftLockInfo.mLockType == 6) {
                GiftManager.inst().getTeamRankManager().LIZLLL.add(Long.valueOf(gift.id));
            } else if (giftLockInfo.mLockType == 8) {
                C1123390fL7.LIZIZ.add(Long.valueOf(gift.id));
            }
        }
        Gift giftFindGiftById = GiftManager.inst().findGiftById(gift.id);
        if (giftFindGiftById == null) {
            return;
        }
        giftFindGiftById.giftSubInfo = gift.giftSubInfo;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            int i = 0;
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : value) {
                int i2 = i + 1;
                if (i >= 0) {
                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = abstractC1126600fQI;
                    if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LJI() == gift.id) {
                        abstractC1126600fQI2.LIZIZ = gift;
                        abstractC1126600fQI2.LJIIJ = true;
                        C1127050fR1 c1127050fR1 = this.LLJJIJI;
                        if (c1127050fR1 != null) {
                            c1127050fR1.LLLJ(i, abstractC1126600fQI2, this.LLJJIII);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        for (GiftPage giftPage : this.LLLIL) {
            if (giftPage.pageType == 15 && giftPage.display && (list = giftPage.gifts) != null) {
                for (Gift gift2 : list) {
                    if (gift2 != null && gift2.id == gift.id) {
                        gift2.giftSubInfo = gift.giftSubInfo;
                    }
                }
            }
        }
        C1128950fU5 c1128950fU5LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        if (c1128950fU5LJJLIIIJLLLLLLLZ != null) {
            c1128950fU5LJJLIIIJLLLLLLLZ.LIZJ("exclusive_gift_unlock");
        }
    }

    public final String LJLJJL(long j) {
        return this.LLLLILI.LIZ(P1(), j);
    }

    public final boolean LJLJJLL(long j) {
        if (!C1128450fTH.LJJII(j)) {
            return false;
        }
        C23250099c.LIZLLL(LJJLIIIJ(), this.LLJILLL, null, new C1128420fTE(this, j, null), 2);
        return true;
    }

    public final long LJLJLJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        Object obj;
        Gift gift;
        Long l;
        Long l2 = null;
        if (abstractC1126600fQI != null) {
            obj = abstractC1126600fQI.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Gift) {
            gift = (Gift) obj;
        } else {
            gift = null;
        }
        C1128300fT2 c1128300fT2 = C1128300fT2.LIZ;
        long jLongValue = ((Number) C1128300fT2.LIZ(abstractC1126600fQI).getSecond()).longValue();
        if (this.LLL) {
            C1127870fSL c1127870fSL = this.LLLIIIL;
            GiftColorInfo giftColorInfo = c1127870fSL.LIZ;
            if (giftColorInfo != null) {
                l2 = giftColorInfo.colorId;
            }
            return C1128300fT2.LJIIJ(c1128300fT2, gift, jLongValue, l2, c1127870fSL.LIZIZ, null, null, 240);
        }
        C1127870fSL c1127870fSL2 = this.LLLIIIL;
        GiftColorInfo giftColorInfo2 = c1127870fSL2.LIZ;
        if (giftColorInfo2 != null) {
            l = giftColorInfo2.colorId;
        } else {
            l = null;
        }
        Long l3 = c1127870fSL2.LIZIZ;
        Long lValueOf = Long.valueOf(this.LLLIIII);
        Long lValueOf2 = Long.valueOf(this.LLLIIIIL);
        if (lValueOf2.longValue() <= 0) {
            lValueOf2 = null;
        }
        return C1128300fT2.LJIIJ(c1128300fT2, gift, jLongValue, l, l3, lValueOf, lValueOf2, 48);
    }

    public final void LJLLJ(int i) {
        MutableLiveData<Integer> mutableLiveData;
        C1130100fVw.LIZ.getClass();
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILZ) != null) {
            mutableLiveData.setValue(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[PHI: r8 r10
      0x003a: PHI (r8v5 int) = (r8v3 int), (r8v6 int) binds: [B:14:0x0034, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r10v4 X.0fQI<? extends X.0054>) = (r10v2 X.0fQI<? extends X.0054>), (r10v5 X.0fQI<? extends X.0054>) binds: [B:14:0x0034, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLL(java.lang.String r12) {
        /*
            r11 = this;
            com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel r0 = r11.LJJLIIIIJ()
            r8 = 0
            r10 = 0
            if (r0 == 0) goto L3e
            androidx.lifecycle.MutableLiveData<java.util.LinkedList<X.0fQI<? extends X.0054>>> r0 = r0.LLILLJJLI
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractSequentialList r0 = (java.util.AbstractSequentialList) r0
            if (r0 == 0) goto L3e
            java.util.Iterator r9 = r0.iterator()
            r8 = 0
            r7 = 0
        L1a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L3e
            int r6 = r7 + 1
            java.lang.Object r5 = r9.next()
            X.0fQI r5 = (X.AbstractC1126600fQI) r5
            if (r5 == 0) goto L3c
            long r3 = r5.LJI()
            long r1 = r11.LJJLJ()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3a
            r8 = r7
            r10 = r5
            if (r5 == 0) goto L3c
        L3a:
            r5.LJII = r12
        L3c:
            r7 = r6
            goto L1a
        L3e:
            r11.LJJJJI()
            X.0fR1 r1 = r11.LLJJIJI
            if (r1 == 0) goto L4a
            X.0UlD r0 = r11.LLJJIII
            r1.LLLJ(r8, r10, r0)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LJLLL(java.lang.String):void");
    }

    public final void LJLLLL(long j) {
        MutableLiveData<Long> mutableLiveData;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILZIL) != null) {
            mutableLiveData.setValue(Long.valueOf(j));
        }
    }

    public final void LJLLLLLL(String str) {
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null) {
            giftPanelLeafViewModelLJJLIIIIJ.LLILZLL = str;
        }
    }

    public final void LJLZ(long j) {
        this.f = false;
        if (!LJJJLIIL()) {
            C20441214yg.LIZIZ("RealTimeCoordination", "Real-time API disabled, executing logging immediately");
            RunnableC781530UlD runnableC781530UlD = this.LLJJIII;
            if (runnableC781530UlD != null) {
                HandlerHook.viewPostDelay(runnableC781530UlD, new ARunnableS20S0100100_17(j, this, 10), 300L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJZI(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1129490fUx
            if (r0 == 0) goto L48
            r5 = r7
            X.0fUx r5 = (X.C1129490fUx) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L30
            r1 = -1009(0xfffffffffffffc0f, float:NaN)
            java.lang.String r0 = "local cache list is empty"
            r6.LJZ(r1, r0)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r6.LJLIIL(r3, r1)
            goto L2d
        L34:
            X.C155000ia.LIZIZ(r1)
            r5.LLILLL = r3
            X.0fOA r2 = new X.0fOA
            r0 = 0
            r2.<init>(r0)
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r1 = X.C099A.LIZJ(r0, r2, r5)
            if (r1 != r4) goto L22
            return r4
        L48:
            X.0fUx r5 = new X.0fUx
            r5.<init>(r6, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LJZI(X.05Vn):java.lang.Object");
    }

    public final void LLFII(Boolean bool) {
        View view;
        if (bool != null) {
            this.LLLL = bool.booleanValue();
        }
        if (this.LLILLL.LIZ != EnumC1100490ekB.END && (view = this.LLILZ) != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS117S0100000_17(this, 230), 330L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int LJJZZI(long j, LinkedList linkedList) {
        AbstractC1126600fQI abstractC1126600fQI;
        if (linkedList == null) {
            C20441214yg.LJ("GiftPanelLeaf", "hasThisGift,panels null");
            return -1;
        }
        Iterator it2 = C13LP.LLIIL(linkedList).iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (c717610SCx.hasNext()) {
                IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                T t = indexedValue.LIZIZ;
                if (!(t instanceof C292301Bh) && (abstractC1126600fQI = (AbstractC1126600fQI) t) != null && abstractC1126600fQI.LJI() == j) {
                    return indexedValue.LIZ;
                }
            } else {
                C20441214yg.LJ("GiftPanelLeaf", "hasThisGift,not in panels");
                return -1;
            }
        }
    }

    @Override // X.InterfaceC1127000fQw
    public final boolean LJIIL(AbstractC1126600fQI abstractC1126600fQI, C01AG c01ag) {
        int i = C01AE.LIZ[c01ag.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            C1130190fW5 c1130190fW5 = (C1130190fW5) this.LLLLLJLJLL.getValue();
            if (abstractC1126600fQI == null) {
                c1130190fW5.getClass();
            } else {
                DataChannel dataChannel = c1130190fW5.LIZ;
                if (dataChannel != null) {
                    boolean zLIZ = C146500hD.LIZ(dataChannel);
                    long jLIZ = C01AU.LIZ(c1130190fW5.LIZ);
                    if (zLIZ && abstractC1126600fQI.LJFF() == jLIZ) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJJIJIIJI(long j, boolean z) {
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ;
        if (C1130220fW8.LIZ.LIZ && (giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ()) != null && !giftPanelLeafViewModelLJJLIIIIJ.LLJJJ) {
            if (z) {
                C1128590fTV.LJJIIZI++;
            } else {
                C1128590fTV.LJJIIZ++;
            }
        }
        C1128590fTV.LJJIJIIJI++;
        C1128590fTV.LJJIJIIJIL.put(Long.valueOf(j), Boolean.valueOf(z));
        int i = C1128590fTV.LJJIJIIJI;
        int i2 = C1128590fTV.LJJIIJZLJL;
        if (i == i2 && i2 != 0) {
            C1128590fTV.LJJJI = SystemClock.uptimeMillis();
        }
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJJIJIIJIL(boolean z, boolean z2) {
        C1127050fR1 c1127050fR1;
        C1126220fPg c1126220fPg = this.LLJJJIL;
        if (c1126220fPg != null) {
            C1125500fOW.LIZ(c1126220fPg, z);
        }
        if (z2 && (c1127050fR1 = this.LLJJIJI) != null) {
            c1127050fR1.LLLJIL(this.LLJJIII, LJJLIIIJILLIZJL(Long.valueOf(LJJLJ())));
        }
    }

    public final void LJJJLZIJ(int i, C1129250fUZ c1129250fUZ) {
        DataChannel dataChannel;
        Room room;
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
        if (giftLeafRootViewModelLJJLIIIJJIZ != null && (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.getId() != 0) {
            GiftManager.inst().getGiftRepository().LJFF(i, room.getId(), this.LLLII, c1129250fUZ, "");
        }
    }

    public final void LJJLL(int i, String str) {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 != null && (fragment = c1100420ek4.getFragment()) != null && fragment.getLifecycle() != null) {
            C23250099c.LIZLLL(LJJLIIIJ(), this.LLJILJILJ, null, new C1128990fU9(this, i, str, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIL(int r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 1303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LJLIIL(int, java.util.List):void");
    }

    public final void LJLJLLL(int i, boolean z) {
        LinearLayoutManager linearLayoutManager;
        RunnableC781530UlD runnableC781530UlD = this.LLJJIII;
        RecyclerView.LayoutManager layoutManager = null;
        if (runnableC781530UlD != null) {
            layoutManager = runnableC781530UlD.getLayoutManager();
        }
        if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            if (z) {
                i = 0;
            }
            linearLayoutManager.scrollToPositionWithOffset(i, 0);
        }
    }

    public final void LJLLI(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, List<Long> list) throws JSONException {
        long jLongValue;
        boolean z;
        User owner;
        User owner2;
        DataChannel dataChannel;
        Room room;
        DataChannel dataChannel2;
        Long l;
        List<Long> list2 = list;
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
        long ownerUserId = 0;
        if (giftLeafRootViewModelLJJLIIIJJIZ != null && (dataChannel2 = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null && (l = (Long) dataChannel2.gg0(C751340Tdc.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ2 = LJJLIIIJJIZ();
        if (giftLeafRootViewModelLJJLIIIJJIZ2 != null && (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ2.LL) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room.getOwnerUserId();
        }
        String strLJIJ = UserService.getInstance().user().LJIJ(ownerUserId);
        if (strLJIJ != null && strLJIJ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        DataChannel dataChannel3 = null;
        if (!(!z)) {
            strLJIJ = null;
        }
        String str = "";
        if (strLJIJ == null) {
            GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ3 = LJJLIIIJJIZ();
            if (giftLeafRootViewModelLJJLIIIJJIZ3 != null) {
                dataChannel3 = giftLeafRootViewModelLJJLIIIJJIZ3.LL;
            }
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel3);
            if (roomLJJLIIIIJ == null || (owner2 = roomLJJLIIIIJ.getOwner()) == null || (strLJIJ = owner2.getSecUid()) == null) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room roomLJJLI = C500260Jjc.LJJLI();
                if (roomLJJLI == null || (owner = roomLJJLI.getOwner()) == null || (strLJIJ = owner.getSecUid()) == null) {
                    strLJIJ = "";
                }
            }
        }
        if (list2 == null) {
            list2 = C1128620fTY.LIZ(linkedList).LIZJ;
        }
        C1128600fTW c1128600fTW = this.LLLLILI;
        int iP1 = P1();
        c1128600fTW.getClass();
        LinkedList linkedList2 = new LinkedList();
        Iterator<Long> it2 = list2.iterator();
        while (it2.hasNext()) {
            long jLongValue2 = it2.next().longValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gift_id", jLongValue2);
            String strLIZ = c1128600fTW.LIZ(iP1, jLongValue2);
            if (strLIZ == null || strLIZ.length() == 0) {
                strLIZ = "{}";
            }
            jSONObject.put("recommend_info", strLIZ);
            linkedList2.add(jSONObject);
        }
        ACKReqForStrategy aCKReqForStrategy = new ACKReqForStrategy();
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        aCKReqForStrategy.tabName = C1128460fTI.LJIIJ(Integer.valueOf(P1()), "");
        C1129650fVD giftRepository = GiftManager.inst().getGiftRepository();
        String str2 = this.LLZLLLL;
        if (str2 != null) {
            str = str2;
        }
        giftRepository.getClass();
        String string = new JSONArray((Collection) linkedList2).toString();
        String json = GsonProtectorUtils.toJson((Gson) giftRepository.LIZLLL.getValue(), aCKReqForStrategy);
        C1131700fYW.LIZJ(501);
        C480460Ism.LIZ().getClass();
        ((GiftRetrofitApi) C480460Ism.LIZLLL(GiftRetrofitApi.class)).sendGiftListAck(jLongValue, strLJIJ, string, str, "", json).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00JP
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str3;
                GiftListAckResponse giftListAckResponse;
                GiftListAckResponse.Extra extra;
                C1C7U.LIZ("GiftRepository@13a6.sendGiftListAckInternal$dispose$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gift list ack log id is ");
                if (baseResponse != null && (giftListAckResponse = (GiftListAckResponse) baseResponse.data) != null && (extra = giftListAckResponse.extra) != null) {
                    str3 = extra.logId;
                } else {
                    str3 = null;
                }
                sbLIZ.append(str3);
                C20441214yg.LJIIIZ("GiftRepository", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("GiftRepository@13a6.sendGiftListAckInternal$dispose$1");
            }
        }, new C09JN() { // from class: X.00JX
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GiftRepository@13a6.sendGiftListAckInternal$dispose$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gift list ack error is ");
                sbLIZ.append(((Throwable) obj).getMessage());
                C20441214yg.LJIIIZ("GiftRepository", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("GiftRepository@13a6.sendGiftListAckInternal$dispose$2");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0IjA] */
    /* JADX WARN: Type inference failed for: r11v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final void LJZ(int i, String str) {
        ?? LIZIZ;
        C1128590fTV.LIZJ = i;
        C1128590fTV.LIZLLL = str;
        C16FZ c16fz = this.LLJJIJIL;
        if (c16fz != null) {
            C786410Ut5.LJLLLLLL(8, c16fz);
        }
        C1129900fVc c1129900fVc = this.LLJJJ;
        if (c1129900fVc != null) {
            C786410Ut5.LJLLLLLL(0, c1129900fVc);
        }
        int i2 = C1128590fTV.LJII + 1;
        C1128590fTV.LJII = i2;
        long jUptimeMillis = SystemClock.uptimeMillis() - C1130100fVw.LIZ.LJII;
        long jUptimeMillis2 = SystemClock.uptimeMillis() - C1128590fTV.LJFF;
        try {
            LIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ = 0;
        }
        ?? jSONObject = new JSONObject();
        jSONObject.put("show_count", i2);
        jSONObject.put("error_code", i);
        jSONObject.put("is_network_available", LIZIZ);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("click_error_show_duration", jUptimeMillis);
        jSONObject2.put("loading_error_show_duration", jUptimeMillis2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("error_msg", str);
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        ?? LIZ = C0IJT.LIZ("gift_panel_error_view_show");
        LIZ.LJIL();
        LIZ.LJJIIJZLJL(jSONObject);
        LIZ.LJJIIJZLJL(jSONObject2);
        LIZ.LJJIIJZLJL(jSONObject3);
        LIZ.LIZ();
        C1CC2.LJ("gift_panel_error_view_show", jSONObject, jSONObject2, jSONObject3);
        this.LLLIIL = 0;
        C1128590fTV.LJI++;
        C1129900fVc c1129900fVc2 = this.LLJJJ;
        if (c1129900fVc2 != null) {
            C786410Ut5.h8(c1129900fVc2.LL, new ACListenerS152S0100000_17(new AwS561S0100000_17(this, 458), 165));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06a3 A[LOOP:6: B:322:0x069d->B:324:0x06a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x07e4 A[SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LL(java.util.List<? extends com.bytedance.android.livesdk.gift.model.GiftPage> r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 2220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LL(java.util.List, boolean):void");
    }

    public final void LLD(long j, boolean z) {
        if (this.f) {
            C20441214yg.LIZIZ("RealTimeCoordination", "Logging already completed, skipping");
            return;
        }
        this.f = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Executing coordinated logging - isTimeout: ");
        sbLIZ.append(z);
        sbLIZ.append(", realTimeApiCompleted: ");
        sbLIZ.append(this.e);
        C20441214yg.LIZIZ("RealTimeCoordination", C2188811AlT.LIZIZ(sbLIZ));
        RunnableC781530UlD runnableC781530UlD = this.LLJJIII;
        if (runnableC781530UlD != null) {
            HandlerHook.viewPost(runnableC781530UlD, new ARunnableS20S0100100_17(j, this, 11));
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJIIZILJ(int i, AbstractC1126600fQI abstractC1126600fQI, AwS561S0100000_17 awS561S0100000_17) {
        boolean z;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        String strLJIILIIL;
        DataChannel dataChannel;
        Room room;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData2;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value2;
        int i2;
        AbstractC1126600fQI<? extends AnonymousClass0054> next;
        String strLJIILIIL2;
        DataChannel dataChannel2;
        Room room2;
        String strLJIILIIL3 = abstractC1126600fQI.LJIILIIL();
        int i3 = 0;
        if (Intrinsics.LJFF(LJJLJLI(), abstractC1126600fQI.LJIILIIL()) && LJJL() == C1130100fVw.LIZ.LJFF) {
            z = true;
        } else {
            z = false;
        }
        long ownerUserId = 0;
        if (z) {
            awS561S0100000_17.invoke();
            GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
            if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData2 = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) != null && (value2 = mutableLiveData2.getValue()) != null) {
                Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it2 = value2.iterator();
                do {
                    i2 = i3;
                    if (it2.hasNext()) {
                        i3++;
                        next = it2.next();
                        if (next != null) {
                            strLJIILIIL2 = next.LJIILIIL();
                        } else {
                            strLJIILIIL2 = null;
                        }
                    } else {
                        return;
                    }
                } while (!Intrinsics.LJFF(strLJIILIIL2, strLJIILIIL3));
                InterfaceC1133710fbl.LIZ.getClass();
                C1120710fGn.LIZ();
                if ((C1133940fc8.LJIIJJI() || ((C1133940fc8) C1120710fGn.LIZ()).LJIILL()) && ((C1133940fc8) C1120710fGn.LIZ()).LJI() == next.LJFF()) {
                    if (C1126800fQc.LIZ() != null) {
                        C1127240fRK.LIZJ(next.LIZLLL(), next.LJFF());
                    }
                    C1126800fQc.LIZ.Wy0().LIZ(0, this.LL, null, null, null, false);
                    return;
                } else {
                    if (!LJIIIZ()) {
                        return;
                    }
                    long jLJFF = next.LJFF();
                    int iLJJLIIIJILLIZJL = LJJLIIIJILLIZJL(Long.valueOf(next.LJFF()));
                    GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
                    if (giftLeafRootViewModelLJJLIIIJJIZ != null && (dataChannel2 = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null && (room2 = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
                        ownerUserId = room2.getOwnerUserId();
                    }
                    C1129420fUq.LIZ(iLJJLIIIJILLIZJL, i2, jLJFF, ownerUserId);
                    return;
                }
            }
            return;
        }
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ2 = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ2 != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ2.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it3 = value.iterator();
            while (true) {
                int i4 = i3;
                if (!it3.hasNext()) {
                    break;
                }
                i3 = i4 + 1;
                AbstractC1126600fQI<? extends AnonymousClass0054> next2 = it3.next();
                if (next2 != null) {
                    strLJIILIIL = next2.LJIILIIL();
                } else {
                    strLJIILIIL = null;
                }
                if (Intrinsics.LJFF(strLJIILIIL, strLJIILIIL3)) {
                    if (LJIIIZ()) {
                        long jLJFF2 = next2.LJFF();
                        int iLJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL(Long.valueOf(next2.LJFF()));
                        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ2 = LJJLIIIJJIZ();
                        if (giftLeafRootViewModelLJJLIIIJJIZ2 != null && (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ2.LL) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                            ownerUserId = room.getOwnerUserId();
                        }
                        C1129420fUq.LIZ(iLJJLIIIJILLIZJL2, i4, jLJFF2, ownerUserId);
                    }
                }
            }
        }
        LJJIJIL(i, abstractC1126600fQI.LJFF(), abstractC1126600fQI, awS561S0100000_17);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdk.ui.framework.DialogLeaf, X.AbstractC1100450ek7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<android.view.View, X.C19ME> LJJJ(android.content.Context r19, android.view.ViewGroup r20, android.view.LayoutInflater r21) {
        /*
            Method dump skipped, instruction units count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LJJJ(android.content.Context, android.view.ViewGroup, android.view.LayoutInflater):kotlin.Pair");
    }

    public final void LJJJJIZL(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList2, Function0<Unit> function0) {
        AbstractC1126600fQI<? extends AnonymousClass0054> next;
        Boolean boolValueOf;
        GiftPage next2;
        long j;
        List<Gift> list;
        Gift gift;
        long jLJJLIL;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        boolean z;
        int i;
        Long lValueOf;
        long j2;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
        C012C c012c;
        boolean z2;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData2;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value2;
        long jLJJLIL2;
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ;
        DataChannel dataChannel;
        EnumC1130940fXI value3;
        boolean zLIZ;
        long jLIZ;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        MutableLiveData<EnumC1130940fXI> mutableLiveData3;
        boolean z3 = this.g;
        this.g = false;
        this.e = false;
        this.f = false;
        C20441214yg.LIZIZ("RealTimeCoordination", "Cleaned up coordinated logging state");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changing data, panel size: ");
        sbLIZ.append(linkedList.size());
        sbLIZ.append(", adapter: ");
        sbLIZ.append(this.LLJJIJI);
        C20441214yg.LIZIZ("GiftPanelSwipe", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[UI] changeData - currentTab=");
        sbLIZ2.append(P1());
        sbLIZ2.append(", selectedGiftId=");
        sbLIZ2.append(LJJLJ());
        sbLIZ2.append(", panelSize=");
        sbLIZ2.append(linkedList.size());
        sbLIZ2.append(", interactivePanelSize=");
        sbLIZ2.append(linkedList2.size());
        C20441214yg.LJIIIZ("GiftMVI.View", C2188811AlT.LIZIZ(sbLIZ2));
        C1128800fTq c1128800fTq = this.LLJJJJ;
        if (c1128800fTq != null) {
            if (linkedList.isEmpty()) {
                if (c1128800fTq.LJIIL == 16) {
                    c1128800fTq.LIZ();
                }
            } else {
                View view = c1128800fTq.LJIIIZ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                C1129900fVc c1129900fVc = c1128800fTq.LJIIJ;
                if (c1129900fVc != null) {
                    C786410Ut5.LLLIIIL(c1129900fVc, 8);
                }
            }
        }
        boolean z4 = true;
        if (linkedList.isEmpty()) {
            if (P1() != 16) {
                C20441214yg.LIZIZ("GiftPanelLeaf", "mAdapter panels is null");
                this.LLLIIL = 0;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
        } else {
            C16F5 c16f5 = this.LLJJIJIIJIL;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
            this.LLLIIL = 1;
        }
        if (P1() == 1) {
            GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
            if (giftPanelLeafViewModelLJJLIIIIJ == null || (mutableLiveData3 = giftPanelLeafViewModelLJJLIIIIJ.LLJJJIL) == null || (value3 = mutableLiveData3.getValue()) == null) {
                value3 = EnumC1130940fXI.DEFAULT;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("changedPanels, ");
            sbLIZ3.append(value3);
            C20441214yg.LIZIZ("giftpanelsort", C2188811AlT.LIZIZ(sbLIZ3));
            if (value3 != EnumC1130940fXI.DEFAULT) {
                C01AU.LIZLLL(linkedList);
                C1130980fXM.LIZ(linkedList, value3, this.LLJJJJLIIL, this.LLJL, this.LLJLILLLLZIIL);
                GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ2 = LJJLIIIJJIZ();
                if (giftLeafRootViewModelLJJLIIIJJIZ2 != null && (dataChannel3 = giftLeafRootViewModelLJJLIIIJJIZ2.LL) != null) {
                    zLIZ = C146500hD.LIZ(dataChannel3);
                } else {
                    zLIZ = false;
                }
                GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ3 = LJJLIIIJJIZ();
                if (giftLeafRootViewModelLJJLIIIJJIZ3 != null && (dataChannel2 = giftLeafRootViewModelLJJLIIIJJIZ3.LL) != null) {
                    jLIZ = C01AU.LIZ(dataChannel2);
                } else {
                    jLIZ = 0;
                }
                C01AU.LIZJ(linkedList, zLIZ, jLIZ);
            } else {
                C1130980fXM.LIZ(linkedList, value3, this.LLJJJJLIIL, this.LLJL, this.LLJLILLLLZIIL);
            }
        } else if (P1() == 17) {
            C1128820fTs.LJIIIIZZ(linkedList, this.LLJLLIL);
        }
        C1136940fgy.LIZ.getClass();
        GiftManager.inst().updatePanelList(linkedList);
        LJJLI().LIZJ(linkedList);
        C1131900fYq.LIZIZ(C497740JfY.LJII(), "default_dialog_item");
        C238400w2 c238400w2 = new C238400w2();
        if (LJLI(P1())) {
            long jLIZIZ = LJJLIIIJLJLI().LIZIZ(LJJLJ(), linkedList);
            c238400w2.element = jLIZIZ;
            LJLLLL(jLIZIZ);
            this.LLLLLZ = P1();
        } else {
            C1130100fVw.LIZ.getClass();
            LJLLLL(C1128970fU7.LIZ());
            Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it2 = linkedList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = next;
                    if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LJI() == LJJLJ()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = next;
            int i2 = C1138640fji.LIZ;
            Gift giftLJI = C1138640fji.LJI(LJJLJ());
            if (giftLJI != null) {
                boolValueOf = Boolean.valueOf(giftLJI.LIZIZ());
            } else {
                boolValueOf = null;
            }
            if ((!C500260Jjc.LJJJI(boolValueOf) || !LiveGiftMagicSetting.INSTANCE.isEnable()) && (LJJLJ() <= 0 || abstractC1126600fQI3 == null || 0 >= abstractC1126600fQI3.LJI())) {
                int iP1 = P1();
                Iterator<GiftPage> it3 = GiftManager.inst().getGiftPageList().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        GiftPage giftPage = next2;
                        if (giftPage != null && giftPage.pageType == iP1) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                GiftPage giftPage2 = next2;
                if (giftPage2 != null && (list = giftPage2.gifts) != null && (gift = (Gift) C13LP.LJJJLL(list)) != null) {
                    j = gift.id;
                } else {
                    j = -1;
                }
                LJLLLL(j);
            }
            if (P1() != 16) {
                if (this.LLLFFI && P1() == 1) {
                    jLJJLIL = 0;
                } else {
                    jLJJLIL = LJJLIL(linkedList);
                }
                c238400w2.element = jLJJLIL;
                LJLLLL(jLJJLIL);
            }
        }
        if (this.LLL) {
            C20441214yg.LIZIZ("GiftPanelLeaf", "changeData#mStartNewSession " + c238400w2.element);
            this.LLL = false;
            this.e = false;
            if (P1() != 16) {
                if (this.LLLFFI) {
                    jLJJLIL2 = 0;
                } else {
                    jLJJLIL2 = LJJLIL(linkedList);
                }
                c238400w2.element = jLJJLIL2;
                LJLLLL(jLJJLIL2);
                this.LLLLLZ = P1();
                LJLLJ(P1());
                if (c238400w2.element > 0 && (giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ()) != null && (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null) {
                    int i3 = C1138640fji.LIZ;
                    dataChannel.zW(GiftSelectedChangeEvent.class, C1138640fji.LJI(c238400w2.element));
                }
                if (C1130100fVw.LIZ.LJIIJ == -1) {
                    C01GW c01gw = C1131920fYs.LIZ;
                    C1131920fYs.LIZ(Long.valueOf(c238400w2.element));
                }
            }
            if (this.LLLF) {
                this.LLLF = false;
                GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ2 = LJJLIIIIJ();
                if (giftPanelLeafViewModelLJJLIIIIJ2 != null && (mutableLiveData2 = giftPanelLeafViewModelLJJLIIIIJ2.LLILLJJLI) != null && (value2 = mutableLiveData2.getValue()) != null) {
                    C1128250fSx.LIZ.LJII(LJJL(), value2);
                }
                C1130220fW8.LIZ.LIZ = true;
                LJLZ(c238400w2.element);
            }
        } else {
            this.e = true;
            GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ3 = LJJLIIIIJ();
            if (giftPanelLeafViewModelLJJLIIIIJ3 != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ3.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
                C1128250fSx.LIZ.LJII(P1(), value);
            }
            C1130220fW8.LIZ.LIZ = false;
            RunnableC781530UlD runnableC781530UlD = this.LLJJIII;
            if (runnableC781530UlD != null) {
                HandlerHook.viewPostDelay(runnableC781530UlD, new ARunnableS18S0210000_17(this, c238400w2, z3, 4), 300L);
            }
        }
        if (P1() == 15 && C1118430fD7.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        long jLJJLJ = LJJLJ();
        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI4 : linkedList) {
            if (abstractC1126600fQI4 != null && abstractC1126600fQI4.LJI() == jLJJLJ) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                boolean z5 = !z;
                abstractC1126600fQI4.LJIIIIZZ = z5;
                abstractC1126600fQI4.LIZJ = z5;
                abstractC1126600fQI4.LJII = C1131370fXz.LIZIZ();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("item?.id == selectedGiftId, ");
                sbLIZ4.append(jLJJLJ);
                C20441214yg.LIZIZ("GiftPanelSwipe", C2188811AlT.LIZIZ(sbLIZ4));
                if (z) {
                    this.LLLZZIL = Long.valueOf(jLJJLJ);
                    LJJLIIIIJ();
                }
                if (C1127580fRs.LIZLLL(Long.valueOf(jLJJLJ))) {
                    LJJJJZI(abstractC1126600fQI4);
                }
                LJLLLLLL(abstractC1126600fQI4.LJIILIIL());
            } else if (abstractC1126600fQI4 != null) {
                if (abstractC1126600fQI4.LIZJ) {
                    abstractC1126600fQI4.LJIIIIZZ = true;
                    abstractC1126600fQI4.LIZJ = false;
                    abstractC1126600fQI4.LJII = "";
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("item?.id == selectedGiftId, ");
                    sbLIZ5.append(abstractC1126600fQI4.LIZJ);
                    C20441214yg.LIZIZ("GiftPanelSwipe", C2188811AlT.LIZIZ(sbLIZ5));
                } else {
                    abstractC1126600fQI4.LJIIIIZZ = false;
                }
            }
        }
        if (LiveGiftInteractiveEnlargedPreviewSettings.INSTANCE.getEnabled() && P1() == 17) {
            RunnableC781530UlD runnableC781530UlD2 = this.LLJJIII;
            if (runnableC781530UlD2 != null) {
                runnableC781530UlD2.setOverScrollMode(2);
            }
            if (this.LLLLIILL == 0) {
                z4 = false;
            }
            FrameLayout frameLayout = this.LLLLIIIILLL;
            if (frameLayout != null) {
                frameLayout.setClipChildren(z4);
            }
        } else {
            RunnableC781530UlD runnableC781530UlD3 = this.LLJJIII;
            if (runnableC781530UlD3 != null) {
                runnableC781530UlD3.setOverScrollMode(1);
            }
            FrameLayout frameLayout2 = this.LLLLIIIILLL;
            if (frameLayout2 != null) {
                frameLayout2.setClipChildren(true);
            }
        }
        RunnableC781530UlD runnableC781530UlD4 = this.LLJJIII;
        if (runnableC781530UlD4 != null) {
            runnableC781530UlD4.setItemAnimator(null);
        }
        if (LJJJLIIL()) {
            i = 15;
            C1129280fUc c1129280fUc = new C1129280fUc(linkedList, linkedList2, C13LP.LLIIII(this.LLJJJJLIIL), C13LP.LLIIII(this.LLJL), C13LP.LLIIII(this.LLJLIL), C13LP.LLIIII(this.LLJLILLLLZIIL), c238400w2.element);
            C1128950fU5 c1128950fU5LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
            if (c1128950fU5LJJLIIIJLLLLLLLZ == null || !c1128950fU5LJJLIIIJLLLLLLLZ.LJ(c1129280fUc, new AwS226S0300000_17(this, (C1128710fTh) c238400w2, (C238400w2) linkedList, (LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>) 12))) {
                C012A c012a = C012A.LIZ;
                List<Long> list2 = this.LLJJJJLIIL;
                List<Long> list3 = this.LLJL;
                List<Long> list4 = this.LLJLIL;
                List<Long> list5 = this.LLJLILLLLZIIL;
                int iLJJZZI = LJJZZI(c238400w2.element, linkedList);
                AwS295S0300000_17 awS295S0300000_17 = new AwS295S0300000_17(this, (C1128710fTh) c238400w2, (C238400w2) linkedList, (LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>) 2);
                c012a.getClass();
                C012H c012hLIZ = C012J.LIZ(C012A.LJ());
                if (c012hLIZ != null) {
                    c012hLIZ.LIZ(linkedList, linkedList2, list2, list3, list4, list5, iLJJZZI, awS295S0300000_17);
                }
            }
        } else {
            i = 15;
        }
        if (P1() == i) {
            C012A c012a2 = C012A.LIZ;
            int iLJJZZI2 = LJJZZI(c238400w2.element, linkedList);
            c012a2.getClass();
            C012H c012hLIZ2 = C012J.LIZ(C012A.LJ());
            if (c012hLIZ2 != null && c012hLIZ2.LJFF != null) {
                Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it4 = linkedList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    AbstractC1126600fQI<? extends AnonymousClass0054> next3 = it4.next();
                    if (next3 != null) {
                        lValueOf = Long.valueOf(next3.LJI());
                    } else {
                        lValueOf = null;
                    }
                    C012C c012c2 = c012hLIZ2.LJFF;
                    if (c012c2 != null) {
                        j2 = c012c2.LIZ;
                    } else {
                        j2 = 0;
                    }
                    if (Intrinsics.LJFF(lValueOf, Long.valueOf(j2))) {
                        if (i4 != -1 && (abstractC1126600fQI = linkedList.get(i4)) != null && !abstractC1126600fQI.LJIJJ()) {
                            if (i4 == iLJJZZI2 && (c012c = c012hLIZ2.LJFF) != null) {
                                c012c.LIZLLL = false;
                            }
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI5 = linkedList.get(i4);
                            if (abstractC1126600fQI5 != null) {
                                abstractC1126600fQI5.LJIIZILJ = c012hLIZ2.LJFF;
                            }
                        }
                    } else {
                        i4++;
                    }
                }
            }
            LLFFF(c238400w2.element, linkedList, z, C13BV.INSTANCE);
            if (!LJJJLIIL() && function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        LLFFF(c238400w2.element, linkedList, z, C13BV.INSTANCE);
        if (LJJJLIIL() || function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJJ(long j, boolean z, boolean z2) {
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        Object obj;
        Object next;
        Gift gift;
        ImageModel imageModel;
        String strLJIILIIL;
        this.LLLIIII = j;
        String strLJJLJLI = LJJLJLI();
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator it2 = C13LP.LLIIL(value).iterator();
            while (true) {
                C717610SCx c717610SCx = (C717610SCx) it2;
                obj = null;
                if (c717610SCx.hasNext()) {
                    next = c717610SCx.next();
                    AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) ((IndexedValue) next).LIZIZ;
                    if (abstractC1126600fQI != null) {
                        strLJIILIIL = abstractC1126600fQI.LJIILIIL();
                    } else {
                        strLJIILIIL = null;
                    }
                    if (Intrinsics.LJFF(strLJIILIIL, strLJJLJLI)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            IndexedValue indexedValue = (IndexedValue) next;
            if (indexedValue != null) {
                Pair pair = new Pair(Integer.valueOf(indexedValue.LIZ), indexedValue.LIZIZ);
                int iIntValue = ((Number) pair.getFirst()).intValue();
                AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) pair.getSecond();
                if (abstractC1126600fQI2 != null) {
                    abstractC1126600fQI2.LJ = null;
                    abstractC1126600fQI2.LJFF = null;
                    obj = abstractC1126600fQI2.LIZIZ;
                }
                if ((obj instanceof Gift) && (gift = (Gift) obj) != null) {
                    this.LLLIIIIL = gift.id;
                    GiftColorInfo giftColorInfoLIZLLL = C1128300fT2.LIZLLL(gift, j);
                    if (giftColorInfoLIZLLL != null && (imageModel = giftColorInfoLIZLLL.giftImage) != null) {
                        if (z || !Intrinsics.LJFF(abstractC1126600fQI2.LJFF, imageModel)) {
                            abstractC1126600fQI2.LJFF = imageModel;
                            abstractC1126600fQI2.LJI = z2;
                            if (abstractC1126600fQI2.LJIJ != j) {
                                abstractC1126600fQI2.LJIJ = j;
                                if (z) {
                                    abstractC1126600fQI2.LJ = imageModel;
                                }
                            }
                            C1127050fR1 c1127050fR1 = this.LLJJIJI;
                            if (c1127050fR1 != null) {
                                c1127050fR1.notifyItemChanged(iIntValue, abstractC1126600fQI2);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1127000fQw
    public final void LJIJI(C01AG c01ag, int i, long j, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        Object obj;
        Object obj2;
        RecyclerView recyclerView;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList;
        ViewGroup.LayoutParams layoutParams;
        C21681919tJ c21681919tJ;
        Object objGg0;
        GiftsInfo giftsInfo;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        C1128910fU1 c1128910fU1LJJLI = LJJLI();
        if (c1128910fU1LJJLI.LJI.invoke().booleanValue()) {
            int i2 = C01AH.LIZ[c01ag.ordinal()];
            String str = "first_screen";
            String str2 = "1";
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new C1954807lC();
                }
            } else if (C1130100fVw.LIZ.LJFF == 1) {
                C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                String strValueOf = String.valueOf(i);
                C1129370fUl c1129370fUl = new C1129370fUl(true, false, abstractC1126600fQI.LJIIJJI(), 0, null, 0L, 58);
                c1128760fTm.getClass();
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_panel_container_entrance");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII("click", "action_type");
                c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
                c474500IjALIZ.LJJII(strValueOf, "gift_position");
                c474500IjALIZ.LJJIIZI(c1129370fUl.LIZ());
                String str3 = c1128760fTm.LJI;
                if (str3 == null) {
                    str3 = "icon";
                }
                c474500IjALIZ.LJJII(str3, "gift_enter_from");
                c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "user_id");
                String str4 = C1128760fTm.LJIIJJI;
                if (C1128760fTm.LJIJJLI()) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(obj, str4);
                if (C1130220fW8.LIZ.LIZ) {
                    obj2 = "first_screen";
                } else {
                    obj2 = "other_screen";
                }
                c474500IjALIZ.LJJII(obj2, "is_first_screen");
                c474500IjALIZ.LIZ();
            }
            if (c1128910fU1LJJLI.LIZIZ(c01ag) <= 0) {
                RecyclerView recyclerView2 = c1128910fU1LJJLI.LIZIZ;
                GiftCampaignProgress giftCampaignProgress = null;
                if ((recyclerView2 == null || recyclerView2.getItemAnimator() == null) && (recyclerView = c1128910fU1LJJLI.LIZIZ) != null) {
                    recyclerView.setItemAnimator(new C1149320g0w());
                }
                C1127050fR1 c1127050fR1 = c1128910fU1LJJLI.LIZJ;
                if (c1127050fR1 != null && (linkedList = c1127050fR1.LL) != null) {
                    RecyclerView recyclerView3 = c1128910fU1LJJLI.LIZIZ;
                    if (recyclerView3 != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView3.findViewHolderForAdapterPosition(i)) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                        layoutParams = view.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null) {
                        int i3 = c21681919tJ.LL;
                        C01AN c01anLIZ = C01AM.LIZ(c01ag, i, j, abstractC1126600fQI, linkedList, c1128910fU1LJJLI.LJ);
                        List<AbstractC1126600fQI<? extends AnonymousClass0054>> list = c01anLIZ.LIZJ;
                        if (c01ag == C01AG.GIFT_SERIES && j > 0) {
                            long jLIZ = C158B.LIZ();
                            GiftCampaignProgress[] giftCampaignProgressArr = new GiftCampaignProgress[2];
                            DataChannel dataChannel = c1128910fU1LJJLI.LIZLLL;
                            if (dataChannel != null) {
                                objGg0 = dataChannel.gg0(CampaignProgressChannel.class);
                            } else {
                                objGg0 = null;
                            }
                            giftCampaignProgressArr[0] = objGg0;
                            GiftListResult giftListResult = GiftManager.inst().getGiftListResult();
                            if (giftListResult != null && (giftsInfo = giftListResult.giftsInfo) != null) {
                                giftCampaignProgress = giftsInfo.giftCampaignProgress;
                            }
                            giftCampaignProgressArr[1] = giftCampaignProgress;
                            Iterator it2 = ((ArrayList) C13LQ.LJIJI(giftCampaignProgressArr)).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                GiftCampaignProgress giftCampaignProgress2 = (GiftCampaignProgress) it2.next();
                                C249200xm.LIZ.getClass();
                                GiftCampaignProgress.CampaignProgress campaignProgressLIZIZ = C249200xm.LIZIZ(giftCampaignProgress2, j, Long.valueOf(jLIZ));
                                if (campaignProgressLIZIZ != null) {
                                    long j2 = campaignProgressLIZIZ.activityEndTime;
                                    ArrayList arrayList = new ArrayList();
                                    for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 : list) {
                                        if (abstractC1126600fQI2 instanceof C01AL) {
                                            arrayList.add(abstractC1126600fQI2);
                                        }
                                    }
                                    C01AL c01al = (C01AL) C13LP.LJJJLL(arrayList);
                                    if (c01al != null) {
                                        c01al.LJJIIJ = j2;
                                    }
                                }
                            }
                        }
                        c1128910fU1LJJLI.LJII.put(c01ag, Long.valueOf(j));
                        AbstractC21673719rz itemAnimator = c1128910fU1LJJLI.LIZIZ.getItemAnimator();
                        if (itemAnimator != null) {
                            itemAnimator.LJIIL();
                        }
                        if (c1128910fU1LJJLI.LIZIZ.getLayoutManager() != null) {
                            RecyclerView.LayoutManager layoutManager = c1128910fU1LJJLI.LIZIZ.getLayoutManager();
                            if ((layoutManager instanceof GridLayoutManager) && layoutManager != null) {
                                c1128910fU1LJJLI.LJII.put(c01ag, Long.valueOf(j));
                                final Context context = c1128910fU1LJJLI.LIZ;
                                final int size = ((c01anLIZ.LIZJ.size() - 2) / c1128910fU1LJJLI.LJ) + 1;
                                final AwS74S0301000_17 awS74S0301000_17 = new AwS74S0301000_17(c1128910fU1LJJLI, c01ag, i3, c01anLIZ, 5);
                                C21674119s3 c21674119s3 = new C21674119s3(size, context, awS74S0301000_17) { // from class: X.0kue
                                    public final int LJIILL;
                                    public final Function0<Unit> LJIILLIIL;
                                    public final int LJIIZILJ;

                                    @Override // X.C21674119s3, X.AbstractC21674019s2
                                    public final void LJFF() {
                                        super.LJFF();
                                        this.LJIILLIIL.invoke();
                                    }

                                    @Override // X.C21674119s3
                                    public final float LJIIJJI(DisplayMetrics displayMetrics) {
                                        if (displayMetrics == null) {
                                            return 0.3125f;
                                        }
                                        return 150.0f / displayMetrics.densityDpi;
                                    }

                                    @Override // X.C21674119s3
                                    public final int LJIIJ(int i4, View view2) {
                                        int i5 = i4;
                                        RecyclerView.LayoutManager layoutManager2 = this.LIZJ;
                                        int i6 = 0;
                                        if (layoutManager2 == null || !layoutManager2.canScrollVertically()) {
                                            return 0;
                                        }
                                        int decoratedTop = layoutManager2.getDecoratedTop(view2) + ((int) view2.getTranslationY());
                                        int decoratedBottom = layoutManager2.getDecoratedBottom(view2);
                                        int paddingTop = layoutManager2.getPaddingTop();
                                        int height = layoutManager2.getHeight() - layoutManager2.getPaddingBottom();
                                        int height2 = (layoutManager2.getHeight() - layoutManager2.getPaddingBottom()) - layoutManager2.getDecoratedBottom(view2);
                                        if (height2 >= 0) {
                                            i6 = height2;
                                        }
                                        int i7 = this.LJIILL;
                                        if (i7 >= 2 || (i7 == 1 && i6 < this.LJIIZILJ)) {
                                            i5 = -1;
                                        }
                                        return LJIIIIZZ(decoratedTop, decoratedBottom, paddingTop, height, i5);
                                    }

                                    {
                                        super(context);
                                        this.LJIILL = size;
                                        this.LJIILLIIL = awS74S0301000_17;
                                        this.LJIIZILJ = (int) (context.getResources().getDisplayMetrics().density * 140.0f);
                                    }
                                };
                                c21674119s3.LIZ = i;
                                layoutManager.startSmoothScroll(c21674119s3);
                                int i4 = C01AH.LIZ[c01ag.ordinal()];
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        throw new C1954807lC();
                                    }
                                    return;
                                }
                                C1128760fTm c1128760fTm2 = C1128760fTm.LJIIJ;
                                String strValueOf2 = String.valueOf(i);
                                String string = C01AK.LIZ(abstractC1126600fQI, c01ag).toString();
                                C1129370fUl c1129370fUl2 = new C1129370fUl(true, false, abstractC1126600fQI.LJIIJJI(), 0, null, 0L, 58);
                                c1128760fTm2.getClass();
                                long currentUserId2 = UserService.getInstance().user().getCurrentUserId();
                                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_gift_panel_container_show");
                                c474500IjALIZ2.LJIL();
                                c474500IjALIZ2.LJJII("click", "action_type");
                                c474500IjALIZ2.LJJII(Long.valueOf(j), "gift_id");
                                c474500IjALIZ2.LJJII(strValueOf2, "gift_position");
                                c474500IjALIZ2.LJJII(string, "gift_id_set");
                                c474500IjALIZ2.LJJIIZI(c1129370fUl2.LIZ());
                                String str5 = c1128760fTm2.LJI;
                                if (str5 == null) {
                                    str5 = "icon";
                                }
                                c474500IjALIZ2.LJJII(str5, "gift_enter_from");
                                c474500IjALIZ2.LJJII(Long.valueOf(currentUserId2), "user_id");
                                String str6 = C1128760fTm.LJIIJJI;
                                if (!C1128760fTm.LJIJJLI()) {
                                    str2 = CardStruct.IStatusCode.DEFAULT;
                                }
                                c474500IjALIZ2.LJJII(str2, str6);
                                if (!C1130220fW8.LIZ.LIZ) {
                                    str = "other_screen";
                                }
                                c474500IjALIZ2.LJJII(str, "is_first_screen");
                                c474500IjALIZ2.LIZ();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJIJJ(int i, long j, View view, AwS561S0100000_17 awS561S0100000_17) {
        long id;
        if (!this.LLLLLLIL) {
            return;
        }
        this.LLLLIL = view;
        C1126220fPg c1126220fPg = this.LLJJJIL;
        if (c1126220fPg != null) {
            User userLIZJ = C1125800fP0.LIZJ();
            if (userLIZJ != null) {
                id = userLIZJ.getId();
            } else {
                id = 0;
            }
            float x = view.getX();
            float y = view.getY();
            C1129880fVa c1129880fVa = new C1129880fVa(j, this);
            LJJLIIIJJIZ();
            C1125500fOW.LIZLLL(c1126220fPg, j, id, x, y, i, false, c1129880fVa, awS561S0100000_17);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showCombo ");
        sbLIZ.append(this.LLJJJIL);
        C20441214yg.LJIIIZ("GiftPanelCombo", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1127000fQw
    public final void LJJIJIL(int i, final long j, final AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, final Function0<Unit> function0) {
        RecyclerView.LayoutManager layoutManager;
        int iNextIndex;
        LinearLayoutManager linearLayoutManager;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList2;
        C1126220fPg c1126220fPg;
        FragmentManager fragmentManager;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        Fragment fragmentLJJJJZI;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value2;
        DataChannel dataChannel;
        Object next;
        boolean z;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData2;
        DataChannel dataChannel2;
        final int i2 = i;
        C1129000fUA c1129000fUALJJLIIIJL = LJJLIIIJL();
        final long j2 = c1129000fUALJJLIIIJL.LJI + 1;
        c1129000fUALJJLIIIJL.LJI = j2;
        C1129000fUA.LIZJ(abstractC1126600fQI);
        abstractC1126600fQI.LJI();
        final String strLJIILIIL = abstractC1126600fQI.LJIILIIL();
        final C013C c013c = new C013C();
        final C013C c013c2 = new C013C();
        c013c2.element = true;
        RecyclerView.LayoutManager layoutManager2 = null;
        Fragment fragmentLJJJJZI2 = null;
        fragmentLJJJJZI = null;
        DataChannel dataChannel3 = null;
        Fragment fragmentLJJJJZI3 = null;
        if (abstractC1126600fQI instanceof C1129840fVW) {
            GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
            if (giftLeafRootViewModelLJJLIIIJJIZ != null && (dataChannel2 = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null) {
                fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
            } else {
                fragmentManager = null;
            }
            if (LJLI(P1())) {
                C212100rn c212100rnLJJLIIIJLJLI = LJJLIIIJLJLI();
                GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = LJJLIIIIJ();
                if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData2 = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) != null) {
                    value2 = mutableLiveData2.getValue();
                } else {
                    value2 = null;
                }
                GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ2 = LJJLIIIJJIZ();
                if (giftLeafRootViewModelLJJLIIIJJIZ2 != null) {
                    dataChannel = giftLeafRootViewModelLJJLIIIJJIZ2.LL;
                } else {
                    dataChannel = null;
                }
                Iterator<T> it2 = c212100rnLJJLIIIJLJLI.LIZ.invoke().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((GiftPage) next).pageType == 18) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                GiftPage giftPage = (GiftPage) next;
                if (giftPage != null) {
                    List list = giftPage.favouriteGifts;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    Pair pairLJ = C1128830fTt.LJ(value2, list);
                    if (fragmentManager != null) {
                        fragmentLJJJJZI2 = fragmentManager.LJJJJZI("GiftFavoriteDialogFragment");
                    }
                    if (fragmentLJJJJZI2 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("favoriteFragment status ");
                        sbLIZ.append(fragmentLJJJJZI2.isDetached());
                        sbLIZ.append(", ");
                        sbLIZ.append(fragmentLJJJJZI2.isAdded());
                        C20441214yg.LIZIZ("MusicGiftPanelTab", C2188811AlT.LIZIZ(sbLIZ));
                        if (fragmentLJJJJZI2 instanceof GiftFavoriteDialogFragment) {
                            DialogFragment dialogFragment = (DialogFragment) fragmentLJJJJZI2;
                            if (!dialogFragment.isVisible() && !dialogFragment.isAdded()) {
                                dialogFragment.showNow(fragmentManager, "GiftFavoriteDialogFragment");
                            }
                        }
                    } else if (fragmentManager != null) {
                        C1130540fWe c1130540fWe = GiftFavoriteDialogFragment.LLIZLLLIL;
                        LinkedList<C1148910g0H> linkedList3 = (LinkedList) pairLJ.getFirst();
                        LinkedList<C1148910g0H> linkedList4 = (LinkedList) pairLJ.getSecond();
                        boolean z2 = giftPage.useBackfillSpecialText;
                        if (giftPage.favouriteGifts != null && (!r5.isEmpty())) {
                            z = true;
                        } else {
                            z = false;
                        }
                        EnumC1131030fXR enumC1131030fXR = EnumC1131030fXR.MUSIC_GIFT;
                        c1130540fWe.getClass();
                        GiftFavoriteDialogFragment giftFavoriteDialogFragment = new GiftFavoriteDialogFragment();
                        giftFavoriteDialogFragment.LLILLJJLI = linkedList3;
                        giftFavoriteDialogFragment.LLILLL = linkedList4;
                        giftFavoriteDialogFragment.dataChannel = dataChannel;
                        giftFavoriteDialogFragment.LLILZ = z2;
                        giftFavoriteDialogFragment.LLILZIL = false;
                        giftFavoriteDialogFragment.LLILZLL = z;
                        giftFavoriteDialogFragment.LLIZ = enumC1131030fXR;
                        giftFavoriteDialogFragment.showNow(fragmentManager, "GiftFavoriteDialogFragment");
                        C20441214yg.LIZIZ("MusicGiftPanelTab", String.valueOf(fragmentManager.LJJJJZI("GiftFavoriteDialogFragment")));
                    }
                }
            } else {
                List<Gift> list2 = C13BV.INSTANCE;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                for (GiftPage giftPage2 : this.LLLIL) {
                    if (giftPage2.pageType == 1) {
                        List<Gift> list3 = giftPage2.favouriteGifts;
                        if (list3 == null) {
                            list2 = C13BV.INSTANCE;
                        } else {
                            list2 = list3;
                        }
                        z3 = giftPage2.useBackfillSpecialText;
                        if (list3 != null && (!list3.isEmpty())) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (giftPage2.frequentlyUsedGifts != null && (!r4.isEmpty())) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                }
                GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ2 = LJJLIIIIJ();
                if (giftPanelLeafViewModelLJJLIIIIJ2 != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ2.LLILLJJLI) != null) {
                    value = mutableLiveData.getValue();
                } else {
                    value = null;
                }
                Pair pairLJ2 = C1128830fTt.LJ(value, list2);
                LinkedList<C1148910g0H> linkedList5 = (LinkedList) pairLJ2.getFirst();
                LinkedList<C1148910g0H> linkedList6 = (LinkedList) pairLJ2.getSecond();
                if (fragmentManager != null) {
                    fragmentLJJJJZI = fragmentManager.LJJJJZI("GiftFavoriteDialogFragment");
                } else {
                    fragmentLJJJJZI = null;
                }
                if (fragmentLJJJJZI != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("favoriteFragment status ");
                    sbLIZ2.append(fragmentLJJJJZI.isDetached());
                    sbLIZ2.append(", ");
                    sbLIZ2.append(fragmentLJJJJZI.isAdded());
                    C20441214yg.LIZIZ("favoritegift", C2188811AlT.LIZIZ(sbLIZ2));
                    if (fragmentLJJJJZI instanceof GiftFavoriteDialogFragment) {
                        DialogFragment dialogFragment2 = (DialogFragment) fragmentLJJJJZI;
                        if (!dialogFragment2.isVisible() && !dialogFragment2.isAdded()) {
                            dialogFragment2.showNow(fragmentManager, "GiftFavoriteDialogFragment");
                        }
                    }
                    if (fragmentManager != null) {
                        fragmentLJJJJZI3 = fragmentManager.LJJJJZI("GiftFavoriteDialogFragment");
                    }
                    C20441214yg.LIZIZ("favoritegift", String.valueOf(fragmentLJJJJZI3));
                } else {
                    if (fragmentManager != null) {
                        C1130540fWe c1130540fWe2 = GiftFavoriteDialogFragment.LLIZLLLIL;
                        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ3 = LJJLIIIJJIZ();
                        if (giftLeafRootViewModelLJJLIIIJJIZ3 != null) {
                            dataChannel3 = giftLeafRootViewModelLJJLIIIJJIZ3.LL;
                        }
                        EnumC1131030fXR enumC1131030fXR2 = EnumC1131030fXR.GIFT;
                        c1130540fWe2.getClass();
                        GiftFavoriteDialogFragment giftFavoriteDialogFragment2 = new GiftFavoriteDialogFragment();
                        giftFavoriteDialogFragment2.LLILLJJLI = linkedList5;
                        giftFavoriteDialogFragment2.LLILLL = linkedList6;
                        giftFavoriteDialogFragment2.dataChannel = dataChannel3;
                        giftFavoriteDialogFragment2.LLILZ = z3;
                        giftFavoriteDialogFragment2.LLILZIL = z4;
                        giftFavoriteDialogFragment2.LLILZLL = z5;
                        giftFavoriteDialogFragment2.LLIZ = enumC1131030fXR2;
                        giftFavoriteDialogFragment2.showNow(fragmentManager, "GiftFavoriteDialogFragment");
                        fragmentLJJJJZI3 = fragmentManager.LJJJJZI("GiftFavoriteDialogFragment");
                    }
                    C20441214yg.LIZIZ("favoritegift", String.valueOf(fragmentLJJJJZI3));
                }
            }
            C212100rn c212100rnLJJLIIIJLJLI2 = LJJLIIIJLJLI();
            int iP1 = P1();
            c212100rnLJJLIIIJLJLI2.getClass();
            if (iP1 != 18) {
                LJLL(c013c, this, abstractC1126600fQI, j2, function0);
                return;
            }
            return;
        }
        if (abstractC1126600fQI instanceof C01AL) {
            LJLL(c013c, this, abstractC1126600fQI, j2, function0);
            return;
        }
        if (!abstractC1126600fQI.LIZLLL && (c1126220fPg = this.LLJJJIL) != null) {
            C1125500fOW.LIZ(c1126220fPg, true);
        }
        LJZL();
        if (!LJJJZ().LIZ(abstractC1126600fQI)) {
            if ((abstractC1126600fQI.LJIJJ() || C1123390fL7.LIZJ(abstractC1126600fQI) || LJIILIIL(abstractC1126600fQI)) && abstractC1126600fQI.LIZJ) {
                LJLL(c013c, this, abstractC1126600fQI, j2, function0);
                return;
            }
            final C118300cf c118300cf = new C118300cf();
            C1128590fTV.LJJIL = SystemClock.uptimeMillis();
            final Context context = this.LL;
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0fRB
                /* JADX WARN: Removed duplicated region for block: B:141:0x02b0  */
                /* JADX WARN: Removed duplicated region for block: B:256:0x052f  */
                /* JADX WARN: Removed duplicated region for block: B:328:0x078e  */
                /* JADX WARN: Removed duplicated region for block: B:336:0x07ac  */
                /* JADX WARN: Removed duplicated region for block: B:388:0x087d  */
                /* JADX WARN: Removed duplicated region for block: B:395:0x08b2  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.C21674119s3, X.AbstractC21674019s2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJFF() throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 2231
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1127150fRB.LJFF():void");
                }

                @Override // X.C21674119s3
                public final float LJIIJJI(DisplayMetrics displayMetrics) {
                    if (displayMetrics == null) {
                        return 1.875f;
                    }
                    return 300.0f / displayMetrics.densityDpi;
                }

                @Override // X.C21674119s3
                public final int LJIIJ(int i3, View view) {
                    int iLLLILZ;
                    int iLJIIJ = super.LJIIJ(i3, view);
                    C1127050fR1 c1127050fR1 = this.LJIILL.LLJJIJI;
                    if (c1127050fR1 != null) {
                        iLLLILZ = c1127050fR1.LLLILZ();
                    } else {
                        iLLLILZ = -1;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("dy: ");
                    sbLIZ3.append(iLJIIJ);
                    sbLIZ3.append(' ');
                    sbLIZ3.append(abstractC1126600fQI.LIZLLL);
                    sbLIZ3.append(' ');
                    sbLIZ3.append(iLLLILZ);
                    sbLIZ3.append(' ');
                    sbLIZ3.append(i2);
                    C20441214yg.LIZIZ("Scroll Issue", C2188811AlT.LIZIZ(sbLIZ3));
                    if (Math.abs(iLJIIJ) >= this.LJIILL.LLZLL && !abstractC1126600fQI.LIZLLL && iLLLILZ != i2) {
                        c118300cf.element = iLJIIJ;
                        return iLJIIJ;
                    }
                    return 0;
                }
            };
            RunnableC781530UlD runnableC781530UlD = this.LLJJIII;
            if (runnableC781530UlD != null) {
                layoutManager = runnableC781530UlD.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if ((layoutManager instanceof GridLayoutManager) && layoutManager != null) {
                C1128910fU1 c1128910fU1LJJLI = LJJLI();
                C1127050fR1 c1127050fR1 = c1128910fU1LJJLI.LIZJ;
                int i3 = -1;
                if (c1127050fR1 != null && (linkedList2 = c1127050fR1.LL) != null) {
                    ListIterator<AbstractC1126600fQI<? extends AnonymousClass0054>> listIterator = linkedList2.listIterator(linkedList2.size());
                    while (listIterator.hasPrevious()) {
                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQIPrevious = listIterator.previous();
                        if (abstractC1126600fQIPrevious != null && abstractC1126600fQIPrevious.LJIJJ != null) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    iNextIndex = -1;
                } else {
                    iNextIndex = -1;
                }
                C1127050fR1 c1127050fR12 = c1128910fU1LJJLI.LIZJ;
                if (c1127050fR12 != null && (linkedList = c1127050fR12.LL) != null) {
                    Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it3 = linkedList.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (it3.next() instanceof C01AL) {
                            i3 = i4;
                            break;
                        }
                        i4++;
                    }
                }
                RecyclerView recyclerView = c1128910fU1LJJLI.LIZIZ;
                if (recyclerView != null) {
                    layoutManager2 = recyclerView.getLayoutManager();
                }
                if ((layoutManager2 instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager2) != null) {
                    int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                    int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                    if (i2 > iNextIndex && iFindFirstCompletelyVisibleItemPosition <= iNextIndex && iNextIndex <= iFindLastCompletelyVisibleItemPosition && iFindFirstCompletelyVisibleItemPosition <= i3 && i3 <= iFindLastCompletelyVisibleItemPosition) {
                        i2 -= 4;
                    }
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                c21674119s3.LIZ = i2;
                layoutManager.startSmoothScroll(c21674119s3);
                return;
            }
            return;
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131836667));
    }

    public final void LJJJJ(long j, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, List<Long> list, List<Integer> list2) {
        C1128950fU5 c1128950fU5LJJLIIIJLLLLLLLZ;
        GiftPage next;
        long jLIZ;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (!LJJJLIIL()) {
            return;
        }
        if (((!list.isEmpty()) || (!list2.isEmpty())) && (c1128950fU5LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ()) != null) {
            c1128950fU5LJJLIIIJLLLLLLLZ.LIZJ("realtime_insert");
        }
        ((ArrayList) this.LLJJL).addAll(list);
        C20441214yg.LIZIZ("RealTimeCoordination", "Real-time API completed, triggering coordinated logging");
        this.e = true;
        boolean zLIZ = false;
        LLD(j, false);
        int i = this.c;
        this.c = 2;
        LLFFF(j, linkedList, false, list2);
        this.c = i;
        Iterator<GiftPage> it2 = this.LLLIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.pageType == 1) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        GiftPage giftPage = next;
        if (P1() == 1 && giftPage != null) {
            long j2 = this.LLJJLIIIJLLLLLLLZ;
            GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = LJJLIIIJJIZ();
            if (giftLeafRootViewModelLJJLIIIJJIZ != null && (dataChannel2 = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null) {
                zLIZ = C146500hD.LIZ(dataChannel2);
            }
            GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ2 = LJJLIIIJJIZ();
            if (giftLeafRootViewModelLJJLIIIJJIZ2 != null && (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ2.LL) != null) {
                jLIZ = C01AU.LIZ(dataChannel);
            } else {
                jLIZ = 0;
            }
            LJJJJLI(giftPage, linkedList, j2, zLIZ, jLIZ);
        }
        RunnableC781530UlD runnableC781530UlD = this.LLJJIII;
        if (runnableC781530UlD != null) {
            HandlerHook.viewPost(runnableC781530UlD, new ARunnableS117S0100000_17(this, 229));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFFF(long r10, java.util.LinkedList<X.AbstractC1126600fQI<? extends X.AnonymousClass0054>> r12, boolean r13, java.util.List<java.lang.Integer> r14) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LLFFF(long, java.util.LinkedList, boolean, java.util.List):void");
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public static final void LJLL(C013C c013c, C1128710fTh c1128710fTh, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, long j, Function0<Unit> function0) {
        if (c013c.element) {
            return;
        }
        c013c.element = true;
        if (j == c1128710fTh.LJJLIIIJL().LJI) {
            if (abstractC1126600fQI.LJIJJLI()) {
                C1142070fpF c1142070fpF = C1142070fpF.LIZ;
                EnumC1142180fpQ enumC1142180fpQ = EnumC1142180fpQ.PANEL_ITEM;
                c1142070fpF.getClass();
                C1136870fgr c1136870fgrLJII = C1142070fpF.LJII(abstractC1126600fQI, enumC1142180fpQ);
                if (c1136870fgrLJII != null) {
                    C1142070fpF.LJIJJ(c1136870fgrLJII, null);
                }
            } else {
                C1142070fpF.LIZ.getClass();
                AnonymousClass0956 anonymousClass0956 = C1142070fpF.LJIIIIZZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                if (!C1142070fpF.LJIIJJI) {
                    C1142070fpF.LJIL();
                } else {
                    C1142070fpF.LJIIIIZZ = C23250099c.LIZLLL(C1142070fpF.LIZIZ, null, null, new C2210408lK(null), 3);
                }
            }
            C1129000fUA.LIZ(abstractC1126600fQI);
        }
        function0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLI(com.bytedance.android.livesdk.gift.model.GiftPage r41, java.util.LinkedList<X.AbstractC1126600fQI<? extends X.AnonymousClass0054>> r42, long r43, boolean r45, long r46) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LJJJJLI(com.bytedance.android.livesdk.gift.model.GiftPage, java.util.LinkedList, long, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021d A[PHI: r13 r35
      0x021d: PHI (r13v1 int) = (r13v4 int), (r13v4 int), (r13v4 int), (r13v4 int), (r13v5 int) binds: [B:66:0x0168, B:68:0x016c, B:70:0x0174, B:406:0x021d, B:64:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r35v1 X.0fQI<? extends X.0054>) = 
      (r35v3 X.0fQI<? extends X.0054>)
      (r35v3 X.0fQI<? extends X.0054>)
      (r35v3 X.0fQI<? extends X.0054>)
      (r35v3 X.0fQI<? extends X.0054>)
      (r35v6 X.0fQI<? extends X.0054>)
     binds: [B:66:0x0168, B:68:0x016c, B:70:0x0174, B:406:0x021d, B:64:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLF(final long r70, final int r72, final boolean r73, boolean r74, X.C1132120fZC r75) {
        /*
            Method dump skipped, instruction units count: 1930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128710fTh.LLF(long, int, boolean, boolean, X.0fZC):void");
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
