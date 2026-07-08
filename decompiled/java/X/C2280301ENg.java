package X;

import X.C2157508cn;
import X.C897520ZIw;
import X.InterfaceC899440ZQg;
import Y.AObserverS183S0200000_21;
import Y.AObserverS224S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.base.share.QuickShareAIInfo;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.IMCommonApi;
import com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventGuestShareDialog;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.IMDetailPageStateImpl;
import com.ss.android.ugc.aweme.internalshare.impl.data.loader.FetchShareSortedListRequest;
import com.ss.android.ugc.aweme.internalshare.impl.datamgr.aggre.IAggregateAvatarDataService;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonTrigger;
import com.ss.android.ugc.aweme.internalshare.impl.fragment.DownloadAndShareFragment;
import com.ss.android.ugc.aweme.internalshare.impl.manager.InternalShareExpHitRequest;
import com.ss.android.ugc.aweme.internalshare.impl.ui.LongPressShareWidget;
import com.ss.android.ugc.aweme.internalshare.impl.ui.SharePanelWidget;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelPreloadSortedListViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveEventSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS119S1200000_2;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ENg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2280301ENg extends C09AY implements Function0<C1364690lcJ> {
    public C2280301ENg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lcJ] */
    @Override // kotlin.jvm.functions.Function0
    public final C1364690lcJ invoke() {
        return new InterfaceC1364710lcL() { // from class: X.0lcJ
            @Override // X.InterfaceC1364710lcL
            public final C19719912Dl LJJJJJ() {
                return C13LE.LIZ(IMDetailPageStateImpl.class);
            }

            @Override // X.InterfaceC1364710lcL
            public final InternalShareExpHitRequest LJIJ() {
                return new InternalShareExpHitRequest();
            }

            @Override // X.InterfaceC1364710lcL
            public final ViewOnTouchListenerC1364750lcP LJJIJL() {
                ViewOnTouchListenerC1364750lcP viewOnTouchListenerC1364750lcP = ViewOnTouchListenerC1364750lcP.LL;
                viewOnTouchListenerC1364750lcP.getClass();
                return viewOnTouchListenerC1364750lcP;
            }

            @Override // X.InterfaceC1364710lcL
            public final FetchShareSortedListRequest LJJJJI() {
                return new FetchShareSortedListRequest();
            }

            @Override // X.InterfaceC1364710lcL
            public final C19719912Dl LJIIIZ() {
                if (C296820BkG.LIZ()) {
                    return C13LE.LIZ(QuickShareButtonTrigger.class);
                }
                return null;
            }

            @Override // X.InterfaceC1364710lcL
            public final boolean LJJIFFI() {
                if (!C296820BkG.LIZ()) {
                    return false;
                }
                if (((Number) C0AL7.LIZ.getValue()).intValue() != 1) {
                    C1004550cFR.LIZIZ.getClass();
                    if (!C1004550cFR.LJIIJJI) {
                        return false;
                    }
                }
                return true;
            }

            @Override // X.InterfaceC1364710lcL
            public final int LJJIL() {
                return C1364570lc7.LIZ() + C1364570lc7.LIZJ() + C1364570lc7.LIZIZ();
            }

            @Override // X.InterfaceC1364710lcL
            public final boolean LJJJIL() {
                return (C296800BkE.LIZ() == 0 || C294930BhD.LIZ() || C1364820lcW.LIZ()) ? false : true;
            }

            @Override // X.InterfaceC1364710lcL
            public final ViewOnTouchListenerC1364750lcP LJJI() {
                return ViewOnTouchListenerC1364750lcP.LL;
            }

            @Override // X.InterfaceC1364710lcL
            public final void LIZJ(C19EG c19eg) {
                if (!C0R1H.LIZ(c19eg)) {
                    C21146717pB.LIZJ(c19eg, R.layout.d8s);
                }
            }

            @Override // X.InterfaceC1364710lcL
            public final Map<String, Boolean> LJI(String str) {
                Map<String, Boolean> map;
                try {
                    Map<String, Map<String, Boolean>> map2 = C1277504zF.LIZ;
                    if (map2 == null || (map = (Map) ((LinkedHashMap) map2).get(str)) == null) {
                        Map<String, Boolean> mapLIZ = C1472905pf.LIZ(str);
                        if (mapLIZ != null) {
                            map2.put(str, mapLIZ);
                            return mapLIZ;
                        }
                    } else {
                        return map;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                return null;
            }

            @Override // X.InterfaceC1364710lcL
            public final boolean LJIIL(Aweme aweme) {
                QuickShareAIInfo quickShareAIInfo;
                if (aweme != null && (quickShareAIInfo = aweme.getQuickShareAIInfo()) != null) {
                    return Intrinsics.LJFF(quickShareAIInfo.enableShow, Boolean.TRUE);
                }
                return false;
            }

            @Override // X.InterfaceC1364710lcL
            public final List<SharePanelItemInfo> LJIILL(Integer num) {
                int value;
                int value2;
                if (C15504065e.LIZ()) {
                    C1365990leP c1365990leP = C1365990leP.LIZ;
                    if (num != null) {
                        value2 = num.intValue();
                    } else {
                        value2 = EnumC1364450lbv.SOURCE_ACTION_UNKNOWN.getValue();
                    }
                    return new ArrayList(C1365990leP.LIZIZ.LJFF("default", value2, null));
                }
                C1366830lfl c1366830lfl = C1366830lfl.LL;
                if (num != null) {
                    value = num.intValue();
                } else {
                    value = EnumC1364450lbv.SOURCE_ACTION_UNKNOWN.getValue();
                }
                return c1366830lfl.LJIIJ(value);
            }

            @Override // X.InterfaceC1364710lcL
            public final boolean LJIILLIIL(Aweme aweme) {
                if (C296800BkE.LIZ() != 0) {
                    if (C294930BhD.LIZ()) {
                        C589960NBy.LIZ.getClass();
                        if (C589960NBy.LIZ(aweme)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1364710lcL
            public final C1229130i5f LJIIZILJ(SharePackage sharePackage) {
                if (C1244940iVA.LIZ(sharePackage) && !C1336205Ku.LIZJ().LIZJ()) {
                    C1759206uk c1759206uk = C1759206uk.LIZ;
                    if (C1759206uk.LIZ()) {
                        return new C1229130i5f();
                    }
                    return null;
                }
                return null;
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJIJJLI(Aweme aweme) {
                boolean z;
                if (aweme == null) {
                    return;
                }
                if (!C065D.LIZ() && !C065T.LIZ()) {
                    C1004550cFR.LIZIZ.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bindNextAwemeQuickShareData ");
                    sbLIZ.append(aweme.getAid());
                    sbLIZ.append("  ");
                    sbLIZ.append(aweme.getQuickShareAIInfo());
                    C1720006oQ.LJ("QuickShareManager", C2188811AlT.LIZIZ(sbLIZ));
                    if (!C065R.LIZJ()) {
                        C1720006oQ.LJ("QuickShareManager", "bindNextAwemeQuickShareData but pitaya is not ready");
                        return;
                    }
                    C15505065f c15505065f = new C15505065f(aweme, null);
                    if (!((Boolean) C1865840yec.LIZIZ.getValue()).booleanValue()) {
                        C0CNO.LIZ(C15O7.LJI, new C5182020e(c15505065f, 142));
                        return;
                    } else {
                        C23250099c.LIZLLL(C1004550cFR.LIZJ, null, null, new C01L6(c15505065f, null), 3);
                        return;
                    }
                }
                C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
                c1004550cFR.getClass();
                if (!C296820BkG.LIZ()) {
                    return;
                }
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                if (aid.length() == 0) {
                    return;
                }
                QuickShareAIInfo quickShareAIInfo = aweme.getQuickShareAIInfo();
                if (quickShareAIInfo != null && Intrinsics.LJFF(quickShareAIInfo.enableShow, Boolean.TRUE)) {
                    C1006680cIs c1006680cIs = c1004550cFR.LIZ;
                    synchronized (c1006680cIs.LIZIZ) {
                        try {
                            z = !c1006680cIs.LIZIZ.add(aid);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (z) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("saveFirstFrameData: already triggered, skip itemId=");
                        sbLIZ2.append(aid);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        return;
                    }
                    C01GW c01gw = C1004550cFR.LJII;
                    if (((LruCache) c01gw.getValue()).get(aid) != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("saveFirstFrameData: share_rate already recorded for item, skip itemId=");
                        sbLIZ3.append(aid);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        return;
                    }
                    ((LruCache) c01gw.getValue()).put(aid, 1);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("saveFirstFrameData: itemId=");
                    sbLIZ4.append(aid);
                    C1720006oQ.LJ("QuickShareManager", C2188811AlT.LIZIZ(sbLIZ4));
                    C0CNO.LIZ(C15O7.LJI, new AwS119S1200000_2(aid, quickShareAIInfo, aweme, 4));
                    return;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("saveFirstFrameData: enableShow=false or aiInfo=null, skip itemId=");
                sbLIZ5.append(aid);
                C2188811AlT.LIZIZ(sbLIZ5);
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJIL(boolean z) {
                if (C15504065e.LIZ()) {
                    C1366090leZ c1366090leZ = C1365990leP.LIZIZ;
                    C1382360m4o c1382360m4o = c1366090leZ.LLILZIL;
                    c1382360m4o.getClass();
                    C1720006oQ.LIZLLL(new C020T(z, 5), false);
                    if (z) {
                        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIFFI(c1382360m4o);
                    } else {
                        c1382360m4o.LL = null;
                        c1382360m4o.LLILLJJLI = false;
                        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIIL(c1382360m4o);
                    }
                    C1366770lff c1366770lff = c1366090leZ.LLILZLL;
                    c1366770lff.getClass();
                    if (z) {
                        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJI(c1366770lff);
                        return;
                    } else {
                        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJIIJIL(c1366770lff);
                        return;
                    }
                }
                C1366830lfl.LL.getClass();
                if (!C289820BXo.LIZ()) {
                    return;
                }
                C1382370m4p c1382370m4p = C1366830lfl.LLJJIJI;
                if (z) {
                    c1382370m4p.getClass();
                    C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIFFI(c1382370m4p);
                } else {
                    c1382370m4p.LL = null;
                    c1382370m4p.LLILLJJLI = false;
                    C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIIL(c1382370m4p);
                }
            }

            @Override // X.InterfaceC1364710lcL
            public final DownloadAndShareFragment LJJ(SharePackage sharePackage) {
                DownloadAndShareFragment downloadAndShareFragment = new DownloadAndShareFragment();
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIJL(bundle, "SharePackage", sharePackage);
                downloadAndShareFragment.setArguments(bundle);
                return downloadAndShareFragment;
            }

            @Override // X.InterfaceC1364710lcL
            public final boolean LJJII(Aweme aweme) {
                if (aweme == null) {
                    return false;
                }
                C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
                String aid = aweme.getAid();
                c1004550cFR.getClass();
                if ((aid == null || !C1004550cFR.LJ.contains(aid)) && !C1004550cFR.LIZIZ(aweme.getAid())) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1364710lcL
            public final boolean LJJIII(LifecycleOwner lifecycleOwner) {
                return lifecycleOwner instanceof QuickShareButtonTrigger;
            }

            @Override // X.InterfaceC1364710lcL
            public final Object LJJIIJ(InterfaceC1364105Vn<? super List<? extends IMContact>> interfaceC1364105Vn) {
                if (C15504065e.LIZ()) {
                    return C1365990leP.LIZ.LIZIZ("default", new C1368260li4(0, false), new C1364850lcZ(), EnumC1364450lbv.SOURCE_ACTION_UNKNOWN.getValue(), null, interfaceC1364105Vn);
                }
                return C1366830lfl.LJIILL(C1366830lfl.LL, null, null, null, interfaceC1364105Vn, 7);
            }

            @Override // X.InterfaceC1364710lcL
            public final boolean LJJIJIIJIL(Integer num) {
                int value;
                int value2;
                if (C15504065e.LIZ()) {
                    C1365990leP c1365990leP = C1365990leP.LIZ;
                    if (num != null) {
                        value2 = num.intValue();
                    } else {
                        value2 = EnumC1364450lbv.SOURCE_ACTION_UNKNOWN.getValue();
                    }
                    Integer numValueOf = Integer.valueOf(value2);
                    Keva kevaLJ = C1365990leP.LIZIZ.LL.LJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("internal_share_sort_new");
                    sbLIZ.append(numValueOf);
                    sbLIZ.append("+_");
                    String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    if (curUserId == null) {
                        curUserId = "";
                    }
                    sbLIZ.append(curUserId);
                    sbLIZ.append("_fetch_failed");
                    return kevaLJ.getBoolean(C1366840lfm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), ""), false);
                }
                C1366830lfl c1366830lfl = C1366830lfl.LL;
                if (num != null) {
                    value = num.intValue();
                } else {
                    value = EnumC1364450lbv.SOURCE_ACTION_UNKNOWN.getValue();
                }
                Keva kevaLJIIIZ = C1366830lfl.LJIIIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("internal_share_sort_new");
                sbLIZ2.append(value);
                sbLIZ2.append("+_");
                sbLIZ2.append(C461720I8s.LIZIZ());
                sbLIZ2.append("+_fetch_failed");
                return kevaLJIIIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), false);
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJJIZ(List<? extends IMContact> list) {
                if (C15504065e.LIZ()) {
                    IAggregateAvatarDataService iAggregateAvatarDataService = (IAggregateAvatarDataService) PluggableExtentionKt.pluggableSpiForReal(IAggregateAvatarDataService.class);
                    if (iAggregateAvatarDataService != null) {
                        iAggregateAvatarDataService.LIZIZ(list);
                        return;
                    }
                    return;
                }
                C1366830lfl.LL.getClass();
                C1366830lfl.LJIL(list);
            }

            @Override // X.InterfaceC1364710lcL
            public final C1362920lZS LJJJJ(C1362890lZP c1362890lZP) {
                return new C1362920lZS();
            }

            @Override // X.InterfaceC1364710lcL
            public final C594480NTi LJJJJJL(SessionInfo sessionInfo) {
                return new C594480NTi(sessionInfo);
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJIILIIL(final View view, final C19EG c19eg) {
                PopupManager.LJIJI(new C10GR(view, c19eg) { // from class: X.0m6U
                    public final C19EG LL;
                    public final View LLILLJJLI;

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return LivePreCreateNextRoomPlayer.ENABLE;
                    }

                    @Override // X.AbstractC20656215sG
                    public final boolean canShow() {
                        return !C1364820lcW.LIZ();
                    }

                    @Override // X.InterfaceC20660415sw
                    public final C688120Qyw i2() {
                        Context contextLJFF = C2214201BlK.LJFF();
                        if (contextLJFF == null) {
                            contextLJFF = this.LL;
                        }
                        if (contextLJFF instanceof C19EG) {
                            return new C688120Qyw(contextLJFF, (LifecycleOwner) contextLJFF, null);
                        }
                        return null;
                    }

                    {
                        this.LL = c19eg;
                        this.LLILLJJLI = view;
                    }

                    @Override // X.InterfaceC20659015si
                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                        C450720Hlu c450720Hlu = new C450720Hlu(c688120Qyw.LIZ);
                        c450720Hlu.LLILLJJLI.LIZIZ = this.LLILLJJLI;
                        c450720Hlu.LIZLLL();
                        c450720Hlu.LLILLJJLI.LIZLLL = EnumC1235690iGF.START;
                        c450720Hlu.LJIIJ(2131831877);
                        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                        c1391600mJi.LJII = 3000L;
                        c1391600mJi.LJIJJ = true;
                        c1391600mJi.LJIJJLI = false;
                        c450720Hlu.LIZJ(new AwS600S0100000_21(c20656615sK, 404));
                        c450720Hlu.LIZIZ().show();
                        C1364820lcW.LIZIZ();
                    }
                }, true);
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJJIIJZLJL(C19EG c19eg, BaseSharePackage baseSharePackage) {
                boolean z;
                if (!(baseSharePackage instanceof SharePackage)) {
                    return;
                }
                if (C15504065e.LIZ()) {
                    Pair<C1368260li4, C1364850lcZ> pairLIZ = C1364700lcK.LIZ((SharePackage) baseSharePackage);
                    ((SharePanelPreloadSortedListViewModel) ViewModelProviders.of(c19eg).get(SharePanelPreloadSortedListViewModel.class)).wQ2(pairLIZ.getFirst(), pairLIZ.getSecond());
                    return;
                }
                SharePackage sharePackage = (SharePackage) baseSharePackage;
                boolean z2 = sharePackage.extras.getBoolean("key_filter_group_chat");
                boolean z3 = sharePackage.extras.getBoolean("key_filter_no_camera_permission");
                boolean z4 = sharePackage.extras.getBoolean("key_filter_group_camera_permission");
                if (C1250860iei.LIZ(baseSharePackage) && C902900ZbU.LIZ(sharePackage)) {
                    z = true;
                } else {
                    z = false;
                }
                C1364980lcm.LIZ(sharePackage, z2, z4, z3, true, z);
                ((SharePanelPreloadSortedListViewModel) ViewModelProviders.of(c19eg).get(SharePanelPreloadSortedListViewModel.class)).wQ2(null, null);
            }

            @Override // X.InterfaceC1364710lcL
            public final LongPressShareWidget LJJIJ(C1363070lZh c1363070lZh, C1364510lc1 c1364510lc1) {
                return new LongPressShareWidget(c1363070lZh, c1364510lc1);
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJJIJLIJ(int i, Aweme aweme) {
                AwemeStatistics statistics;
                if (((Number) C0AL0.LIZ.getValue()).intValue() == 1 && aweme != null && (statistics = aweme.getStatistics()) != null) {
                    statistics.setShareCount(statistics.getShareCount() + ((long) i));
                    C1440005kM.LIZ(new C585780MyG(aweme.getAid(), statistics.getShareCount()));
                }
            }

            @Override // X.InterfaceC1364710lcL
            public final C1362860lZM LJJJ(C1362880lZO c1362880lZO, C1364530lc3 c1364530lc3) {
                ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZJ(EnumC883570YlP.ENTER_SHARE_PANEL);
                C1362860lZM c1362860lZM = new C1362860lZM(c1362880lZO, c1364530lc3);
                c1364530lc3.LIZIZ = c1362860lZM;
                if (C461720I8s.LJ() && !C1215190hjB.LIZ(c1362880lZO.LIZIZ)) {
                    c1362860lZM.LIZIZ = new SharePanelWidget(c1362880lZO, c1364530lc3);
                    return c1362860lZM;
                }
                C786410Ut5.LJLZ(8, c1362880lZO.LIZJ);
                return c1362860lZM;
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJJJJIZL(List<String> list, List<String> list2) {
                Map<String, Map<String, Boolean>> map = C1277504zF.LIZ;
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (str.length() > 0) {
                        arrayList.add(str);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : list2) {
                    if (str2.length() > 0) {
                        arrayList2.add(str2);
                    }
                }
                if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1472605pc(list, list2, null), 3);
                }
            }

            @Override // X.InterfaceC1364710lcL
            public final View LIZ(Context context, int i, ViewGroup viewGroup) {
                return C21146717pB.LIZ(context, i, viewGroup);
            }

            @Override // X.InterfaceC1364710lcL
            public final C1365140ld2 LJ(EditText editText, final InterfaceC1631630sYr interfaceC1631630sYr, ViewGroup viewGroup) {
                List listLIZ = C456310Huv.LIZ();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                Iterator it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    arrayList.add(new C0I1Z());
                }
                C0I1X c0i1x = new C0I1X(editText, new C0I1Y() { // from class: X.0I1e
                    @Override // X.C0I1Y
                    public final void LIZ(int i, String str, Map map) {
                        interfaceC1631630sYr.invoke(str, Integer.valueOf(i), Boolean.FALSE, map);
                    }
                }, viewGroup, listLIZ, 0, 48);
                return new C1365140ld2(c0i1x.LJIIJ.LL, c0i1x.LJII, arrayList);
            }

            @Override // X.InterfaceC1364710lcL
            public final boolean LJIILJJIL(RemoteImageView remoteImageView, TuxIconView tuxIconView, SharePackage sharePackage) {
                return DialogC1367400lgg.LJJZ(remoteImageView, tuxIconView, sharePackage, Boolean.FALSE);
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJIJI(String str, int i, InterfaceC1366080leY interfaceC1366080leY) {
                LJJIIZ(i, interfaceC1366080leY, "default", str);
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJJJJLI(View view, C19EG c19eg, String str) {
                PopupManager.LJIJI(new C1246290iXL(view, c19eg, str), true);
            }

            @Override // X.InterfaceC1364710lcL
            public final InterfaceC1370520lli LJIIJ(String str, String str2, C1371590lnR c1371590lnR, Activity activity) {
                if ((C293370Beh.LIZ() & 2) == 2) {
                    ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZJ(EnumC883570YlP.ENTER_SHARE_PANEL);
                }
                if (((Boolean) C2277621ECy.LIZIZ.getValue()).booleanValue() && Intrinsics.LJFF(str2, "share_panel") && c1371590lnR.LJIIJJI == EnumC1369720lkQ.HORIZONTAL) {
                    return new InterfaceC1370520lli(activity, str, str2) { // from class: X.0lZ3
                        public final String LL;
                        public final String LLILLJJLI;
                        public InterfaceC1362900lZQ LLILLL;
                        public C1371590lnR LLILZ;

                        @Override // X.InterfaceC1370520lli
                        public final boolean LIZ() {
                            return true;
                        }

                        @Override // X.InterfaceC1370520lli
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC1370520lli
                        public final void LIZLLL() {
                        }

                        @Override // X.InterfaceC1370520lli
                        public final void LJ(boolean z) {
                        }

                        @Override // X.InterfaceC1370520lli
                        public final View LJII(C1361400lX0 c1361400lX0, C1371590lnR c1371590lnR2, InterfaceC1362720lZ8 interfaceC1362720lZ8, Fragment fragment) {
                            return null;
                        }

                        @Override // X.InterfaceC1370520lli
                        public final boolean LJIIIZ() {
                            return true;
                        }

                        @Override // X.InterfaceC1370520lli
                        public final void LJIIL(Context context, RecyclerView recyclerView, C1371590lnR c1371590lnR2, InterfaceC1362720lZ8 interfaceC1362720lZ8, Fragment fragment) {
                        }

                        @Override // X.InterfaceC1370520lli
                        public final void LJLZ() {
                        }

                        @Override // X.InterfaceC1370520lli
                        public final View getWidgetView() {
                            return null;
                        }

                        @Override // X.InterfaceC1370520lli
                        public final EnumC1369700lkO getLayoutPriority() {
                            C1371590lnR c1371590lnR2 = this.LLILZ;
                            if (c1371590lnR2 == null) {
                                return EnumC1369700lkO.TOP;
                            }
                            C01GW c01gw = C1367480lgo.LIZ;
                            if (!C1367480lgo.LIZIZ(c1371590lnR2.LJIJJ)) {
                                return EnumC1369700lkO.TOP;
                            }
                            String str3 = this.LLILLJJLI;
                            return Intrinsics.LJFF(str3, "share_panel") ? C1369210ljb.LIZIZ(c1371590lnR2.LJIJJ) : Intrinsics.LJFF(str3, "long_press") ? C1369210ljb.LIZ(c1371590lnR2.LJIJJ) : EnumC1369700lkO.TOP;
                        }

                        @Override // X.InterfaceC1370520lli
                        public final EnumC1369720lkQ getShowStyle() {
                            C1371590lnR c1371590lnR2 = this.LLILZ;
                            BaseSharePackage baseSharePackage = c1371590lnR2 != null ? c1371590lnR2.LJIJJ : null;
                            return C1367480lgo.LIZIZ(baseSharePackage) ? C1369210ljb.LIZJ(baseSharePackage, this.LLILLJJLI) : EnumC1369720lkQ.HORIZONTAL;
                        }

                        @Override // X.InterfaceC1370520lli
                        public final boolean LJIILIIL() {
                            return getLayoutPriority() == EnumC1369700lkO.TOP;
                        }

                        @Override // X.InterfaceC1370520lli
                        public final void LJFF(C1371590lnR c1371590lnR2) {
                            this.LLILZ = c1371590lnR2;
                        }

                        {
                            C19FO c19fo;
                            LifecycleCoroutineScope lifecycleScope;
                            this.LL = str;
                            this.LLILLJJLI = str2;
                            C910820ZoG.LIZ.getClass();
                            if ((activity instanceof C19EG) && (c19fo = (C19FO) activity) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19fo)) != null) {
                                C23250099c.LIZLLL(lifecycleScope, C2153208c6.LIZ().LIZ, null, new C0R1L(activity, null), 2);
                            }
                        }

                        @Override // X.InterfaceC1370520lli
                        public final View LJI(C1361400lX0 c1361400lX0, C1371590lnR c1371590lnR2, Fragment fragment) {
                            return null;
                        }

                        /* JADX WARN: Type inference failed for: r10v0, types: [X.0lZ7] */
                        @Override // X.InterfaceC1370520lli
                        public final void LJIIJJI(final Fragment fragment, C1371590lnR c1371590lnR2, final InterfaceC1362720lZ8 interfaceC1362720lZ8, ViewGroup viewGroup, ViewGroup viewGroup2) {
                            InterfaceC1362900lZQ c1364500lc0;
                            SharePackage sharePackage;
                            this.LLILZ = c1371590lnR2;
                            Context context = fragment.getContext();
                            if (context == null || fragment.getView() == null) {
                                return;
                            }
                            BaseSharePackage baseSharePackage = c1371590lnR2.LJIJJ;
                            if (C1369210ljb.LIZJ(baseSharePackage, this.LLILLJJLI) == EnumC1369720lkQ.VERTICAL && C1367480lgo.LIZIZ(baseSharePackage)) {
                                c1364500lc0 = new C1364490lbz(context, c1371590lnR2.LJJII, interfaceC1362720lZ8);
                            } else {
                                c1364500lc0 = new C1364500lc0(context, c1371590lnR2.LJJII, interfaceC1362720lZ8);
                            }
                            this.LLILLL = c1364500lc0;
                            DurationPerfMon.LIZ.LIZIZ(C451280Hmo.LJ, true);
                            BaseSharePackage baseSharePackage2 = c1371590lnR2.LJIJJ;
                            if ((baseSharePackage2 instanceof SharePackage) && (sharePackage = (SharePackage) baseSharePackage2) != null) {
                                ?? r10 = new InterfaceC1362260lYO() { // from class: X.0lZ7
                                    @Override // X.InterfaceC1362260lYO
                                    public final void h(boolean z) {
                                        InterfaceC1363000lZa interfaceC1363000lZa;
                                        C128Y c128y = fragment;
                                        if ((c128y instanceof InterfaceC1363000lZa) && (interfaceC1363000lZa = (InterfaceC1363000lZa) c128y) != null) {
                                            interfaceC1363000lZa.h(z);
                                        }
                                    }

                                    @Override // X.InterfaceC1362260lYO
                                    public final void s1(int i) {
                                        interfaceC1362720lZ8.s1(i);
                                    }

                                    @Override // X.InterfaceC1362260lYO
                                    public final void t1(boolean z) {
                                        SkeletonSharePanelFragment skeletonSharePanelFragment;
                                        int i;
                                        Fragment fragment2 = fragment;
                                        if ((fragment2 instanceof SkeletonSharePanelFragment) && (skeletonSharePanelFragment = (SkeletonSharePanelFragment) fragment2) != null) {
                                            if (z) {
                                                i = 0;
                                            } else {
                                                i = 8;
                                            }
                                            skeletonSharePanelFragment.PS(i);
                                        }
                                    }

                                    @Override // X.InterfaceC1362260lYO
                                    public final void u1(boolean z) {
                                        SkeletonSharePanelFragment skeletonSharePanelFragment;
                                        int i;
                                        Fragment fragment2 = fragment;
                                        if ((fragment2 instanceof SkeletonSharePanelFragment) && (skeletonSharePanelFragment = (SkeletonSharePanelFragment) fragment2) != null) {
                                            if (z) {
                                                i = 0;
                                            } else {
                                                i = 8;
                                            }
                                            skeletonSharePanelFragment.FS(i);
                                        }
                                    }

                                    @Override // X.InterfaceC1362260lYO
                                    public final void v1(AwS565S0100000_21 awS565S0100000_21) {
                                        interfaceC1362720lZ8.Ds(awS565S0100000_21);
                                    }
                                };
                                String str3 = this.LL;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                C723850SaN.LIZ(fragment, false, null, new AwS377S0200000_11(fragment, new C1362270lYP(sharePackage, str3, c1371590lnR2.LIZ, c1371590lnR2, c1364500lc0, r10, new AwS565S0100000_21(viewGroup, 1201), new AwS565S0100000_21(viewGroup2, 1202)), 86), 3);
                            }
                        }
                    };
                }
                return new InterfaceC1370520lli(activity, str, str2) { // from class: X.0lZ2
                    public final String LL;
                    public final String LLILLJJLI;
                    public InterfaceC1362900lZQ LLILLL;
                    public C1371590lnR LLILZ;
                    public C1362650lZ1 LLILZIL;

                    @Override // X.InterfaceC1370520lli
                    public final boolean LIZ() {
                        return true;
                    }

                    @Override // X.InterfaceC1370520lli
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC1370520lli
                    public final void LJ(boolean z) {
                    }

                    @Override // X.InterfaceC1370520lli
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370520lli
                    public final void LJIIJJI(Fragment fragment, C1371590lnR c1371590lnR2, InterfaceC1362720lZ8 interfaceC1362720lZ8, ViewGroup viewGroup, ViewGroup viewGroup2) {
                    }

                    @Override // X.InterfaceC1370520lli
                    public final void LJLZ() {
                    }

                    @Override // X.InterfaceC1370520lli
                    public final void LIZJ() {
                        C1383380m6S rvSharePanelAvatarFromXml;
                        C1362650lZ1 c1362650lZ1 = this.LLILZIL;
                        if (c1362650lZ1 == null || c1362650lZ1.getItemCount() <= 0) {
                            return;
                        }
                        RecyclerView.LayoutManager layoutManager = c1362650lZ1.getRvSharePanelAvatarFromXml().getLayoutManager();
                        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                        if ((linearLayoutManager == null || linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0) && (rvSharePanelAvatarFromXml = c1362650lZ1.getRvSharePanelAvatarFromXml()) != null) {
                            rvSharePanelAvatarFromXml.scrollToPosition(0);
                        }
                    }

                    @Override // X.InterfaceC1370520lli
                    public final EnumC1369700lkO getLayoutPriority() {
                        C01GW c01gw = C1367480lgo.LIZ;
                        C1371590lnR c1371590lnR2 = this.LLILZ;
                        if (c1371590lnR2 == null) {
                            c1371590lnR2 = null;
                        }
                        if (!C1367480lgo.LIZIZ(c1371590lnR2.LJIJJ)) {
                            return EnumC1369700lkO.TOP;
                        }
                        String str3 = this.LLILLJJLI;
                        if (Intrinsics.LJFF(str3, "share_panel")) {
                            C1371590lnR c1371590lnR3 = this.LLILZ;
                            return C1369210ljb.LIZIZ((c1371590lnR3 != null ? c1371590lnR3 : null).LJIJJ);
                        }
                        if (!Intrinsics.LJFF(str3, "long_press")) {
                            return EnumC1369700lkO.TOP;
                        }
                        C1371590lnR c1371590lnR4 = this.LLILZ;
                        return C1369210ljb.LIZ((c1371590lnR4 != null ? c1371590lnR4 : null).LJIJJ);
                    }

                    @Override // X.InterfaceC1370520lli
                    public final EnumC1369720lkQ getShowStyle() {
                        C1371590lnR c1371590lnR2 = this.LLILZ;
                        BaseSharePackage baseSharePackage = c1371590lnR2 != null ? c1371590lnR2.LJIJJ : null;
                        return C1367480lgo.LIZIZ(baseSharePackage) ? C1369210ljb.LIZJ(baseSharePackage, this.LLILLJJLI) : EnumC1369720lkQ.HORIZONTAL;
                    }

                    @Override // X.InterfaceC1370520lli
                    public final boolean LJIILIIL() {
                        return getLayoutPriority() == EnumC1369700lkO.TOP;
                    }

                    @Override // X.InterfaceC1370520lli
                    public final View getWidgetView() {
                        return this.LLILZIL;
                    }

                    @Override // X.InterfaceC1370520lli
                    public final void LJFF(C1371590lnR c1371590lnR2) {
                        this.LLILZ = c1371590lnR2;
                    }

                    {
                        C19FO c19fo;
                        LifecycleCoroutineScope lifecycleScope;
                        this.LL = str;
                        this.LLILLJJLI = str2;
                        C910820ZoG.LIZ.getClass();
                        if ((activity instanceof C19EG) && (c19fo = (C19FO) activity) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19fo)) != null) {
                            C23250099c.LIZLLL(lifecycleScope, C2153208c6.LIZ().LIZ, null, new C0R1K(activity, null), 2);
                        }
                    }

                    @Override // X.InterfaceC1370520lli
                    public final View LJI(C1361400lX0 c1361400lX0, C1371590lnR c1371590lnR2, Fragment fragment) {
                        boolean z;
                        InterfaceC1362900lZQ interfaceC1362900lZQ = null;
                        if (c1361400lX0 == null) {
                            return null;
                        }
                        boolean z2 = false;
                        if (c1371590lnR2.LJJ != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!c1371590lnR2.LJIJJ.LJIILL()) {
                            z2 = z;
                        }
                        C1362990lZZ c1362990lZZ = new C1362990lZZ(c1361400lX0, z2);
                        InterfaceC1362900lZQ interfaceC1362900lZQ2 = this.LLILLL;
                        if (interfaceC1362900lZQ2 != null) {
                            interfaceC1362900lZQ = interfaceC1362900lZQ2;
                        }
                        c1362990lZZ.LJFF(c1371590lnR2, fragment, interfaceC1362900lZQ);
                        return c1362990lZZ;
                    }

                    @Override // X.InterfaceC1370520lli
                    public final View LJII(C1361400lX0 c1361400lX0, C1371590lnR c1371590lnR2, InterfaceC1362720lZ8 interfaceC1362720lZ8, Fragment fragment) {
                        InterfaceC1362900lZQ c1364500lc0;
                        C1362650lZ1 c1362650lZ1;
                        if (c1361400lX0 == null) {
                            return null;
                        }
                        DurationPerfMon.LIZ.LIZIZ(C451280Hmo.LJ, true);
                        BaseSharePackage baseSharePackage = c1371590lnR2.LJIJJ;
                        if (C1369210ljb.LIZJ(baseSharePackage, this.LLILLJJLI) == EnumC1369720lkQ.VERTICAL && C1367480lgo.LIZIZ(baseSharePackage)) {
                            c1364500lc0 = new C1364490lbz(c1361400lX0, c1371590lnR2.LJJII, interfaceC1362720lZ8);
                        } else {
                            c1364500lc0 = new C1364500lc0(c1361400lX0, c1371590lnR2.LJJII, interfaceC1362720lZ8);
                        }
                        this.LLILLL = c1364500lc0;
                        String str3 = c1371590lnR2.LJIJJ.itemType;
                        if (Intrinsics.LJFF(str3, "aigc_avatar")) {
                            c1362650lZ1 = new C1362950lZV(c1361400lX0);
                        } else if (Intrinsics.LJFF(str3, "social_avatar")) {
                            c1362650lZ1 = new C461840I9e(c1361400lX0);
                        } else {
                            c1362650lZ1 = new C1362650lZ1(c1361400lX0);
                        }
                        this.LLILZIL = c1362650lZ1;
                        c1362650lZ1.setShareUIDynamicConfig(c1371590lnR2.LJJLIIIJILLIZJL);
                        SharePackage sharePackage = (SharePackage) c1371590lnR2.LJIJJ;
                        List<InterfaceC1369790lkX> list = c1371590lnR2.LIZ;
                        EnumC1369720lkQ showStyle = getShowStyle();
                        InterfaceC1362900lZQ interfaceC1362900lZQ = this.LLILLL;
                        if (interfaceC1362900lZQ == null) {
                            interfaceC1362900lZQ = null;
                        }
                        String str4 = this.LL;
                        if (str4 == null) {
                            str4 = "";
                        }
                        c1362650lZ1.LJIIJ(sharePackage, list, fragment, showStyle, interfaceC1362900lZQ, interfaceC1362720lZ8, str4);
                        IMCommonApi.LIZ.getClass();
                        C04T4.LIZIZ.getValue().LIZ();
                        C1224804qk.LIZ(c1362650lZ1, new InterfaceC1224904ql() { // from class: X.0lZ5
                            public long LIZ = -1;

                            @Override // X.InterfaceC1224904ql
                            public final void LIZ() {
                                DurationPerfMon.LIZ.LIZJ(C451280Hmo.LJ, new C158800jC(this.LIZ > 0 ? SystemClock.uptimeMillis() - this.LIZ : -1L));
                            }

                            @Override // X.InterfaceC1224904ql
                            public final void LIZIZ() {
                                this.LIZ = SystemClock.uptimeMillis();
                            }
                        });
                        return this.LLILZIL;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v28 */
                    /* JADX WARN: Type inference failed for: r1v6 */
                    /* JADX WARN: Type inference failed for: r1v7, types: [X.05Vn, X.099V, kotlin.coroutines.CoroutineContext] */
                    /* JADX WARN: Type inference failed for: r4v11 */
                    /* JADX WARN: Type inference failed for: r4v12 */
                    /* JADX WARN: Type inference failed for: r4v31 */
                    @Override // X.InterfaceC1370520lli
                    public final void LJIIL(Context context, RecyclerView recyclerView, C1371590lnR c1371590lnR2, InterfaceC1362720lZ8 interfaceC1362720lZ8, Fragment fragment) {
                        InterfaceC1362900lZQ c1364500lc0;
                        ?? r1;
                        ?? LIZ;
                        C19EG activity2;
                        C19EG c19eg;
                        Activity activityLIZIZ;
                        SharePanelViewModel sharePanelViewModel;
                        SharePanelViewModel sharePanelViewModel2;
                        C1214170hhX c1214170hhXLJFF;
                        if (context == null || C1250860iei.LIZ(c1371590lnR2.LJIJJ) || !(recyclerView instanceof RecyclerView)) {
                            return;
                        }
                        BaseSharePackage baseSharePackage = c1371590lnR2.LJIJJ;
                        if (C1369210ljb.LIZJ(baseSharePackage, this.LLILLJJLI) == EnumC1369720lkQ.VERTICAL && C1367480lgo.LIZIZ(baseSharePackage)) {
                            c1364500lc0 = new C1364490lbz(context, c1371590lnR2.LJJII, interfaceC1362720lZ8);
                        } else {
                            c1364500lc0 = new C1364500lc0(context, c1371590lnR2.LJJII, interfaceC1362720lZ8);
                        }
                        this.LLILLL = c1364500lc0;
                        recyclerView.setItemAnimator(null);
                        SharePackage sharePackage = (SharePackage) baseSharePackage;
                        final C1361770lXb c1361770lXb = new C1361770lXb(recyclerView, sharePackage, c1371590lnR2, fragment);
                        List<InterfaceC1369790lkX> list = c1371590lnR2.LIZ;
                        InterfaceC1362900lZQ interfaceC1362900lZQ = this.LLILLL;
                        if (interfaceC1362900lZQ == null) {
                            interfaceC1362900lZQ = null;
                        }
                        String str3 = this.LL;
                        if (str3 == null) {
                            str3 = "";
                        }
                        c1361770lXb.LLIZLLLIL = str3;
                        c1361770lXb.LLJ = interfaceC1362900lZQ;
                        SharePanelViewModel sharePanelViewModelLIZ = C1363350la9.LIZ(sharePackage, new InterfaceC1356390lOv() { // from class: X.0lXw
                            @Override // X.InterfaceC1356390lOv
                            public final void Pu0(List<? extends IMContact> list2, List<? extends IMContact> list3) {
                            }

                            @Override // X.InterfaceC1356390lOv
                            public final boolean dE(IMContact iMContact, boolean z, Fragment fragment2) {
                                return false;
                            }

                            @Override // X.InterfaceC1356390lOv
                            public final void GW(IMContact iMContact) {
                                SharePanelImHeadViewModel sharePanelImHeadViewModel = c1361770lXb.LLIZ;
                                if (sharePanelImHeadViewModel != null) {
                                    sharePanelImHeadViewModel.GW(iMContact);
                                }
                            }

                            @Override // X.InterfaceC1356390lOv
                            public final void jR(List<? extends IMContact> list2) {
                                SharePanelImHeadViewModel sharePanelImHeadViewModel = c1361770lXb.LLIZ;
                                if (sharePanelImHeadViewModel != null) {
                                    sharePanelImHeadViewModel.jR(list2);
                                }
                            }

                            @Override // X.InterfaceC1356390lOv
                            public final boolean eJ2(IMContact iMContact, boolean z) {
                                boolean zEJ2;
                                SkeletonSharePanelFragment skeletonSharePanelFragment;
                                SkeletonSharePanelFragment skeletonSharePanelFragment2;
                                SharePanelImHeadViewModel sharePanelImHeadViewModel = c1361770lXb.LLIZ;
                                int size = 0;
                                if (sharePanelImHeadViewModel != null) {
                                    zEJ2 = sharePanelImHeadViewModel.eJ2(iMContact, z);
                                } else {
                                    zEJ2 = false;
                                }
                                if (Intrinsics.LJFF(c1361770lXb.LLILLJJLI.itemType, "group")) {
                                    SharePanelImHeadViewModel sharePanelImHeadViewModel2 = c1361770lXb.LLIZ;
                                    if (sharePanelImHeadViewModel2 != null) {
                                        size = sharePanelImHeadViewModel2.LLJJIJIL.LJIILL().size();
                                    }
                                    if (size > 0) {
                                        Fragment fragment2 = c1361770lXb.LLILZ;
                                        if ((fragment2 instanceof SkeletonSharePanelFragment) && (skeletonSharePanelFragment2 = (SkeletonSharePanelFragment) fragment2) != null) {
                                            skeletonSharePanelFragment2.LJLILLLLZI(C1BWL.LIZJ().getString(2131835798));
                                        }
                                    } else {
                                        Fragment fragment3 = c1361770lXb.LLILZ;
                                        if ((fragment3 instanceof SkeletonSharePanelFragment) && (skeletonSharePanelFragment = (SkeletonSharePanelFragment) fragment3) != null) {
                                            skeletonSharePanelFragment.LJLILLLLZI(null);
                                        }
                                    }
                                }
                                if (z) {
                                    C1362630lYz.LIZ.getClass();
                                    C1362630lYz.LIZJ();
                                    return zEJ2;
                                }
                                C1362630lYz.LIZ.getClass();
                                C1362630lYz.LIZLLL();
                                return zEJ2;
                            }

                            @Override // X.InterfaceC1356390lOv
                            public final void DX1(Throwable th, List list2) {
                            }
                        }, C13BV.INSTANCE, sharePackage.extras.getBoolean("key_filter_group_chat"), false, sharePackage.extras.getBoolean("key_filter_no_camera_permission"), c1361770lXb, fragment, null, false, true, null, c1371590lnR2, null, 10768);
                        sharePanelViewModelLIZ.LLJLLIL = fragment;
                        sharePanelViewModelLIZ.LLJLLL = interfaceC1362720lZ8;
                        sharePanelViewModelLIZ.LLJJL = sharePackage.extras.getString("key_default_select_id");
                        sharePanelViewModelLIZ.LLJJLIIIJLLLLLLLZ = sharePackage.extras.getString("screenshot_image_path");
                        SharePanelImHeadViewModel sharePanelImHeadViewModel = (SharePanelImHeadViewModel) new ViewModelProvider(fragment, new C1362320lYU(sharePackage, list, interfaceC1362900lZQ, sharePanelViewModelLIZ)).get(SharePanelImHeadViewModel.class);
                        c1361770lXb.LLIZ = sharePanelImHeadViewModel;
                        if (sharePanelImHeadViewModel != null) {
                            r1 = 0;
                            C2296808zG.LIZJ(sharePanelImHeadViewModel.LLJJIJIIJIL, null);
                            sharePanelImHeadViewModel.xQ2();
                        } else {
                            r1 = 0;
                        }
                        InterfaceC897380ZIi.LIZIZ.getClass();
                        c1361770lXb.LLJI = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.LONG_PRESS_PANEL, false);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
                        marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        C786410Ut5.p6(c1361770lXb.LL, marginLayoutParams);
                        recyclerView.setBackgroundResource(R.drawable.caa);
                        C426750GoL.LJIIL(recyclerView, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, 0, 16);
                        SharePanelImHeadViewModel sharePanelImHeadViewModel2 = c1361770lXb.LLIZ;
                        if (sharePanelImHeadViewModel2 != null && (sharePanelViewModel2 = sharePanelImHeadViewModel2.LLJJIJIL) != null && (c1214170hhXLJFF = sharePanelViewModel2.LJFF()) != null && sharePanelViewModel2.LIZJ(c1214170hhXLJFF)) {
                            c1361770lXb.LLJILJIL = c1214170hhXLJFF;
                        }
                        SharePanelImHeadViewModel sharePanelImHeadViewModel3 = c1361770lXb.LLIZ;
                        if (sharePanelImHeadViewModel3 != null && (sharePanelViewModel = sharePanelImHeadViewModel3.LLJJIJIL) != null) {
                            c1361770lXb.LLILZLL = new C1363410laF(sharePanelViewModel, c1361770lXb.LLJILJIL, c1361770lXb.LLJ, c1361770lXb.LLJI, true);
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(c1361770lXb.LLILZIL, 1, false));
                        recyclerView.setAdapter(c1361770lXb.LLILZLL);
                        C0VWN.LIZ("share_panel_im", false).LIZIZ(recyclerView);
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                            LIZ = C1388190mED.LIZ(activityLIZIZ);
                        } else {
                            LIZ = r1;
                        }
                        if ((LIZ instanceof C19EG) && (c19eg = (C19EG) LIZ) != null) {
                            c1361770lXb.LLJILJILJ = C1360460lVU.LIZIZ.LJJIJ(c19eg);
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), r1, r1, new C01KT(new AwS565S0100000_21(c1361770lXb, 1547), r1), 3);
                        }
                        if (c1361770lXb.LLJIJIL == null && C1867550yhN.LIZ()) {
                            c1361770lXb.LLJIJIL = C897370ZIh.LIZ().LJFF().LIZIZ(EnumC1910440zoY.LONG_PRESS_PANEL, recyclerView, fragment, c1361770lXb.LLILZIL, fragment.getView());
                            Lifecycle lifecycle = fragment.getLifecycle();
                            if (lifecycle != null) {
                                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.internalshare.impl.ui.refactor.LongPressPanelContactList$initActivityStatusAccuracyClient$1
                                    @Override // androidx.lifecycle.LifecycleEventObserver
                                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                        C897520ZIw c897520ZIw;
                                        int i = C2157508cn.LIZ[event.ordinal()];
                                        if (i != 1) {
                                            if (i != 2) {
                                                if (i == 3 && (c897520ZIw = c1361770lXb.LLJI) != null) {
                                                    c897520ZIw.destroy();
                                                    return;
                                                }
                                                return;
                                            }
                                            InterfaceC899440ZQg interfaceC899440ZQg = c1361770lXb.LLJIJIL;
                                            if (interfaceC899440ZQg != null) {
                                                interfaceC899440ZQg.onInvisible();
                                            }
                                            C897520ZIw c897520ZIw2 = c1361770lXb.LLJI;
                                            if (c897520ZIw2 == null) {
                                                return;
                                            }
                                            c897520ZIw2.LJII();
                                            return;
                                        }
                                        InterfaceC899440ZQg interfaceC899440ZQg2 = c1361770lXb.LLJIJIL;
                                        if (interfaceC899440ZQg2 != null) {
                                            interfaceC899440ZQg2.onVisible();
                                        }
                                        C897520ZIw c897520ZIw3 = c1361770lXb.LLJI;
                                        if (c897520ZIw3 == null) {
                                            return;
                                        }
                                        c897520ZIw3.LJ();
                                    }
                                });
                            }
                        }
                        SharePanelImHeadViewModel sharePanelImHeadViewModel4 = c1361770lXb.LLIZ;
                        if (sharePanelImHeadViewModel4 != null) {
                            sharePanelImHeadViewModel4.LLILZ.observe(c1361770lXb.LLILZ, new AObserverS183S0200000_21(c1361770lXb, sharePanelImHeadViewModel4, 10));
                            sharePanelImHeadViewModel4.LLJJIJI.observe(c1361770lXb.LLILZ, new AObserverS224S0100000_21(c1361770lXb, 86));
                            sharePanelImHeadViewModel4.LLILZLL.observe(c1361770lXb.LLILZ, new AObserverS224S0100000_21(c1361770lXb, 87));
                            sharePanelImHeadViewModel4.LLIZLLLIL.observe(c1361770lXb.LLILZ, new AObserverS224S0100000_21(c1361770lXb, 88));
                            sharePanelImHeadViewModel4.LLIZ.observe(c1361770lXb.LLILZ, new AObserverS224S0100000_21(c1361770lXb, 89));
                            sharePanelImHeadViewModel4.LLJ.observe(c1361770lXb.LLILZ, new AObserverS224S0100000_21(c1361770lXb, 90));
                            sharePanelImHeadViewModel4.LLJIJIL.observe(c1361770lXb.LLILZ, new AObserverS224S0100000_21(c1361770lXb, 91));
                            sharePanelImHeadViewModel4.LLJILJIL.observe(c1361770lXb.LLILZ, new AObserverS224S0100000_21(c1361770lXb, 92));
                            sharePanelImHeadViewModel4.LLJJIII.observe(c1361770lXb.LLILZ, new AObserverS224S0100000_21(c1361770lXb, 93));
                            sharePanelImHeadViewModel4.LLILZIL.observe(c1361770lXb.LLILZ, new AObserverS224S0100000_21(c1361770lXb, 85));
                        }
                        boolean z = fragment instanceof SkeletonSharePanelFragment;
                        if (z && (activity2 = fragment.getActivity()) != null) {
                            SharePanelPreloadSortedListViewModel sharePanelPreloadSortedListViewModel = (SharePanelPreloadSortedListViewModel) ViewModelProviders.of(activity2).get(SharePanelPreloadSortedListViewModel.class);
                            String string = sharePackage.extras.getString("panel_source");
                            if (string == null) {
                                string = "";
                            }
                            sharePanelPreloadSortedListViewModel.vQ2(string, new AwS600S0100000_21(c1361770lXb, 384));
                        }
                        SharePanelImHeadViewModel sharePanelImHeadViewModel5 = c1361770lXb.LLIZ;
                        if (sharePanelImHeadViewModel5 != null && !z) {
                            sharePanelImHeadViewModel5.LLJJIJIL.refresh();
                        }
                    }
                };
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJIIJJI(SharePackage sharePackage, List list, String str, InterfaceC1362600lYw interfaceC1362600lYw) {
                C1364580lc8 c1364580lc8 = C1364580lc8.LIZ;
                Map mapLJ = C2097608Jq.LJ();
                c1364580lc8.getClass();
                C1364580lc8.LIZ(sharePackage, list, str, interfaceC1362600lYw, false, null, null, mapLJ);
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJJIIZ(int i, InterfaceC1366080leY interfaceC1366080leY, String str, String str2) {
                if (C15504065e.LIZ()) {
                    C1365990leP c1365990leP = C1365990leP.LIZ;
                    C1365990leP.LIZJ(i, interfaceC1366080leY, str, str2);
                } else {
                    C1366830lfl.LL.getClass();
                    C1366830lfl.LJIILLIIL(str2, i, interfaceC1366080leY);
                }
            }

            @Override // X.InterfaceC1364710lcL
            public final C1363050lZf LJJIIZI(C1363060lZg c1363060lZg, SharePackage sharePackage, InterfaceC1364650lcF interfaceC1364650lcF, boolean z) {
                return new C1363050lZf(c1363060lZg, sharePackage, interfaceC1364650lcF, z, 16);
            }

            @Override // X.InterfaceC1364710lcL
            public final Pair<FrameLayout, InterfaceC1366280les> LJJIJIL(Context context, C1371590lnR c1371590lnR, Fragment fragment, InterfaceC1362600lYw interfaceC1362600lYw) {
                final C1362990lZZ c1362990lZZ = new C1362990lZZ(context, false);
                c1362990lZZ.LJFF(c1371590lnR, fragment, interfaceC1362600lYw);
                return new Pair<>(c1362990lZZ, new InterfaceC1366280les() { // from class: X.0lZT
                    @Override // X.InterfaceC1366280les
                    public final void LIZ() {
                        View view;
                        C1362990lZZ c1362990lZZ2 = c1362990lZZ;
                        if (c1362990lZZ2.LLJI) {
                            return;
                        }
                        Object parent = c1362990lZZ2.getParent();
                        if ((parent instanceof ViewGroup) && (view = (View) parent) != null && view.getVisibility() == 0) {
                            SharePanelImHeadViewModel sharePanelImHeadViewModel = c1362990lZZ2.LLILZ;
                            if (sharePanelImHeadViewModel != null) {
                                sharePanelImHeadViewModel.LLJJIJIL.LJIILL().clear();
                                sharePanelImHeadViewModel.LLJI.setValue(sharePanelImHeadViewModel.LLJJIJIL.LJIILL());
                                MutableLiveData<Boolean> mutableLiveData = sharePanelImHeadViewModel.LLJILJIL;
                                Boolean bool = Boolean.TRUE;
                                mutableLiveData.setValue(bool);
                                if (sharePanelImHeadViewModel.LLJJIJIL.LJII() && !((Boolean) C1382810m5X.LIZIZ.getValue()).booleanValue()) {
                                    sharePanelImHeadViewModel.LLILZLL.setValue(bool);
                                }
                                sharePanelImHeadViewModel.zQ2();
                                sharePanelImHeadViewModel.AQ2();
                            }
                            C1364640lcE c1364640lcE = c1362990lZZ2.LLILZLL;
                            if (c1364640lcE != null) {
                                C1364660lcG c1364660lcGLJFF = c1364640lcE.LJFF();
                                ((Set) c1364660lcGLJFF.LIZ.getValue()).clear();
                                c1364660lcGLJFF.LIZ().clear();
                                c1364660lcGLJFF.LIZIZ().clear();
                                c1364640lcE.LJI(false);
                            }
                        }
                    }

                    @Override // X.InterfaceC1366280les
                    public final void LIZIZ(C1371590lnR c1371590lnR2) {
                        SharePackage sharePackage;
                        ViewGroup.MarginLayoutParams marginLayoutParams;
                        C1362990lZZ c1362990lZZ2 = c1362990lZZ;
                        c1362990lZZ2.LLILLL = c1371590lnR2;
                        BaseSharePackage baseSharePackage = c1371590lnR2.LJIJJ;
                        ViewGroup.LayoutParams layoutParams = null;
                        if (baseSharePackage instanceof SharePackage) {
                            sharePackage = (SharePackage) baseSharePackage;
                        } else {
                            sharePackage = null;
                        }
                        c1362990lZZ2.LL = sharePackage;
                        C197039127h send = c1362990lZZ2.getSend();
                        if (send != null) {
                            layoutParams = send.getLayoutParams();
                        }
                        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        }
                    }

                    @Override // X.InterfaceC1366280les
                    public final void LIZJ(boolean z) {
                        int i;
                        View view = c1362990lZZ.LLJIJIL;
                        if (view != null) {
                            if (z) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            C786410Ut5.LJLLLLLL(i, view);
                        }
                    }
                });
            }

            @Override // X.InterfaceC1364710lcL
            public final void LIZIZ(Activity activity, LiveEventSharePackage liveEventSharePackage, String str, long j, Pair pair) {
                C19EG c19eg;
                FragmentManager supportFragmentManager;
                IMSharePanelApi.LIZ.getClass();
                LiveEventGuestShareDialog liveEventGuestShareDialogLJIJJLI = C1599690rjL.LIZ().getShareService().LJIJJLI(activity, liveEventSharePackage, str, j, pair);
                if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && liveEventGuestShareDialogLJIJJLI != null) {
                    liveEventGuestShareDialogLJIJJLI.show(supportFragmentManager, "liveEvent");
                }
            }

            @Override // X.InterfaceC1364710lcL
            public final InterfaceC1356390lOv LJJIJIIJI(Fragment fragment, SharePackage sharePackage, C13BV c13bv, InterfaceC1362600lYw interfaceC1362600lYw, InterfaceC1356370lOt interfaceC1356370lOt) {
                if (!(interfaceC1356370lOt instanceof SharePanelViewModel)) {
                    return null;
                }
                return (InterfaceC1356390lOv) new ViewModelProvider(fragment, new C1362320lYU(sharePackage, c13bv, interfaceC1362600lYw, (SharePanelViewModel) interfaceC1356370lOt)).get(SharePanelImHeadViewModel.class);
            }

            @Override // X.InterfaceC1364710lcL
            public final C1364640lcE LJJJJLL(C1363060lZg c1363060lZg, SharePackage sharePackage, InterfaceC1364650lcF interfaceC1364650lcF, boolean z, boolean z2) {
                return new C1364640lcE(c1363060lZg, sharePackage, interfaceC1364650lcF, z, z2);
            }

            @Override // X.InterfaceC1364710lcL
            public final C1214160hhW LJIIIIZZ(Context context, Integer num, String str, C1214170hhX c1214170hhX, boolean z, boolean z2) {
                if (z) {
                    C1214160hhW c1214160hhW = new C1214160hhW(context) { // from class: X.0hhL
                        public View LLIZ;

                        @Override // X.C1214160hhW
                        public int getLayoutResource() {
                            return R.layout.cpl;
                        }

                        public final View getTipDividerFromXml() {
                            View view = this.LLIZ;
                            if (view != null) {
                                return view;
                            }
                            View viewFindViewById = findViewById(R.id.xyo);
                            this.LLIZ = viewFindViewById;
                            return viewFindViewById;
                        }

                        @Override // X.C1214160hhW, X.InterfaceC1366240leo
                        public final void LIZ(boolean z3) {
                            int i;
                            super.LIZ(z3);
                            View tipDividerFromXml = getTipDividerFromXml();
                            if (tipDividerFromXml != null) {
                                if (z3) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                C786410Ut5.LJLLLLLL(i, tipDividerFromXml);
                            }
                        }

                        public final void setTipDividerFromXml(View view) {
                            this.LLIZ = view;
                        }

                        @Override // X.C1214160hhW, X.InterfaceC1366240leo
                        public final void LIZIZ(String str2, Float f) {
                            super.LIZIZ(str2, f);
                            ViewGroup.LayoutParams layoutParams = getTipIvFromXml().getLayoutParams();
                            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                            View tipDividerFromXml = getTipDividerFromXml();
                            if (tipDividerFromXml != null) {
                                C786410Ut5.LJLLLLLL(0, tipDividerFromXml);
                            }
                        }
                    };
                    if (c1214170hhX != null) {
                        c1214160hhW.LJ(c1214170hhX);
                        return c1214160hhW;
                    }
                    if (num != null) {
                        num.intValue();
                        if (str == null) {
                            return c1214160hhW;
                        }
                        c1214160hhW.getTipIvFromXml().setIconRes(num.intValue());
                        c1214160hhW.getTipTvFromXml().setText(str);
                        c1214160hhW.LIZ(z2);
                    }
                    return c1214160hhW;
                }
                C1214160hhW c1214160hhW2 = new C1214160hhW(context, null);
                if (c1214170hhX != null) {
                    c1214160hhW2.LJ(c1214170hhX);
                    return c1214160hhW2;
                }
                if (num != null) {
                    num.intValue();
                    if (str == null) {
                        return c1214160hhW2;
                    }
                    c1214160hhW2.getTipIvFromXml().setIconRes(num.intValue());
                    c1214160hhW2.getTipTvFromXml().setText(str);
                    c1214160hhW2.LIZ(z2);
                }
                return c1214160hhW2;
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJIJJ(Context context, SharePackage sharePackage, IMContact[] iMContactArr, String str, InterfaceC1367420lgi interfaceC1367420lgi, InterfaceC1367420lgi interfaceC1367420lgi2) {
                C1364870lcb c1364870lcb = new C1364870lcb(context);
                c1364870lcb.LIZIZ = iMContactArr;
                c1364870lcb.LIZJ = sharePackage;
                c1364870lcb.LIZLLL = interfaceC1367420lgi2;
                c1364870lcb.LJ = interfaceC1367420lgi;
                C0HCL.LIZ(416, context);
                C0HCL.LIZ(335, context);
                if (str == null) {
                    str = "";
                }
                c1364870lcb.LJFF = str;
                DialogC1367400lgg dialogC1367400lgg = new DialogC1367400lgg(c1364870lcb);
                dialogC1367400lgg.show();
                C785410UrT.LIZIZ(dialogC1367400lgg);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(dialogC1367400lgg);
                C816490W1f.LIZ(dialogC1367400lgg);
            }

            @Override // X.InterfaceC1364710lcL
            public final Pair LJJJI(SharePackage sharePackage, InterfaceC1356390lOv interfaceC1356390lOv, LifecycleOwner lifecycleOwner, C19EG c19eg, InterfaceC1368050lhj interfaceC1368050lhj, C460910I5p c460910I5p) {
                SharePanelViewModel sharePanelViewModelLIZ = C1363350la9.LIZ(sharePackage, interfaceC1356390lOv, C13BV.INSTANCE, false, false, false, null, lifecycleOwner, null, false, false, null, null, null, 16248);
                C1363620laa c1363620laa = new C1363620laa(c19eg, interfaceC1368050lhj, sharePanelViewModelLIZ);
                c1363620laa.LLJILJIL = c460910I5p;
                return new Pair(c1363620laa, sharePanelViewModelLIZ);
            }

            @Override // X.InterfaceC1364710lcL
            public final void LJII(Context context, int[] iArr, AwemeSharePackage awemeSharePackage, AwS565S0100000_21 awS565S0100000_21, AwS565S0100000_21 awS565S0100000_212, AwS387S0200000_21 awS387S0200000_21, Fragment fragment) {
                LifecycleOwner lifecycleOwnerLIZIZ = fragment;
                int[] iArr2 = iArr;
                ViewOnTouchListenerC1364750lcP viewOnTouchListenerC1364750lcP = ViewOnTouchListenerC1364750lcP.LL;
                viewOnTouchListenerC1364750lcP.getClass();
                DurationPerfMon.LIZ.LIZIZ(C451260Hmm.LJ, true);
                if (iArr2 == null) {
                    iArr2 = new int[2];
                    int i = 0;
                    do {
                        iArr2[i] = 0;
                        i++;
                    } while (i < 2);
                }
                ViewOnTouchListenerC1364760lcQ viewOnTouchListenerC1364760lcQ = new ViewOnTouchListenerC1364760lcQ(context, awemeSharePackage, iArr2, new C1364720lcM(ViewOnTouchListenerC1364750lcP.LL), awS387S0200000_21);
                viewOnTouchListenerC1364760lcQ.setOnDismissListener(new DialogInterfaceOnDismissListenerC1402040maY(viewOnTouchListenerC1364760lcQ, 8));
                ViewOnTouchListenerC1364750lcP.LLILLJJLI = viewOnTouchListenerC1364760lcQ;
                ViewOnTouchListenerC1364750lcP.LLILZ = awemeSharePackage;
                ViewOnTouchListenerC1364750lcP.LLILZIL = awS565S0100000_21;
                ViewOnTouchListenerC1364750lcP.LLILZLL = awS565S0100000_212;
                if (C461720I8s.LJ() && !C1336205Ku.LIZJ().LIZJ()) {
                    C1709306mh c1709306mh = new C1709306mh(0);
                    DurationPerfMon.LIZ.LIZIZ(c1709306mh, false);
                    ViewOnTouchListenerC1364750lcP.LLJIJIL = c1709306mh;
                    SharePackage sharePackage = ViewOnTouchListenerC1364750lcP.LLILZ;
                    C13BV c13bv = C13BV.INSTANCE;
                    if (lifecycleOwnerLIZIZ == null) {
                        lifecycleOwnerLIZIZ = C0SY5.LIZIZ(context);
                    }
                    SharePanelViewModel sharePanelViewModelLIZ = C1363350la9.LIZ(sharePackage, viewOnTouchListenerC1364750lcP, c13bv, false, false, false, null, lifecycleOwnerLIZIZ, null, false, false, null, null, null, 16248);
                    ViewOnTouchListenerC1364750lcP.LLILLL = sharePanelViewModelLIZ;
                    sharePanelViewModelLIZ.refresh();
                    return;
                }
                viewOnTouchListenerC1364750lcP.jR(C13BV.INSTANCE);
            }

            @Override // X.InterfaceC1364710lcL
            public final Object LIZLLL(int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, boolean z5, List<? extends IMContact> list, boolean z6, InterfaceC1364105Vn<? super List<? extends IMContact>> interfaceC1364105Vn) {
                C1368260li4 c1368260li4 = new C1368260li4(i, z);
                c1368260li4.LJIIL = z2;
                c1368260li4.LJIILLIIL = z3;
                c1368260li4.LJIIZILJ = z6;
                c1368260li4.LJJIFFI = i2;
                c1368260li4.LJJII = z4;
                c1368260li4.LJIIIIZZ = z5;
                c1368260li4.LJJIII = list;
                c1368260li4.LJIIIZ = null;
                if (C15504065e.LIZ()) {
                    return C1365990leP.LIZ.LIZIZ("default", c1368260li4, new C1364850lcZ(), EnumC1364450lbv.SOURCE_ACTION_OPEN_PANEL.getValue(), null, interfaceC1364105Vn);
                }
                return C1366830lfl.LJIILL(C1366830lfl.LL, c1368260li4, null, null, interfaceC1364105Vn, 6);
            }

            @Override // X.InterfaceC1364710lcL
            public final Pair<InterfaceC1356400lOw, InterfaceC1356370lOt> LJJJJL(SharePackage sharePackage, InterfaceC1356390lOv interfaceC1356390lOv, boolean z, boolean z2, boolean z3, LifecycleOwner lifecycleOwner, InterfaceC1363760lao interfaceC1363760lao, C1363630lab c1363630lab, boolean z4, C1362230lYL c1362230lYL, InterfaceC897330ZId interfaceC897330ZId, InterfaceC1363370laB interfaceC1363370laB, EnumC1364450lbv enumC1364450lbv) {
                SharePanelViewModel sharePanelViewModelLIZ = C1363350la9.LIZ(sharePackage, interfaceC1356390lOv, C13BV.INSTANCE, z, z2, z3, interfaceC1363370laB, lifecycleOwner, c1362230lYL, z4, false, interfaceC1363760lao, null, enumC1364450lbv, 5120);
                return new Pair<>(new C1363390laD(sharePanelViewModelLIZ, c1363630lab, interfaceC897330ZId), sharePanelViewModelLIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0134  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0168  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0194 A[PHI: r12
              0x0194: PHI (r12v1 boolean) = (r12v0 boolean), (r12v4 boolean) binds: [B:13:0x0043, B:15:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
            /* JADX WARN: Type inference failed for: r0v13, types: [T, com.bytedance.tux.sheet.sheet.TuxSheet, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v3, types: [X.0lcd] */
            @Override // X.InterfaceC1364710lcL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1366250lep LJFF(android.app.Activity r40, com.ss.android.ugc.aweme.sharer.model.SharePackage r41, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r42, java.util.Set r43, boolean r44, X.InterfaceC1368680lik r45, boolean r46, X.C1214170hhX r47, boolean r48, boolean r49, java.lang.Boolean r50, boolean r51, boolean r52, X.InterfaceC1362600lYw r53) {
                /*
                    Method dump skipped, instruction units count: 441
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1364690lcJ.LJFF(android.app.Activity, com.ss.android.ugc.aweme.sharer.model.SharePackage, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, java.util.Set, boolean, X.0lik, boolean, X.0hhX, boolean, boolean, java.lang.Boolean, boolean, boolean, X.0lYw):X.0lep");
            }
        };
    }
}
