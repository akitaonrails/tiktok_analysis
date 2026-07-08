package com.bytedance.android.live.rank.impl.list.fragment.list;

import X.AbstractC485930J3v;
import X.AbstractViewOnClickListenerC1105820esm;
import X.C098200Yq;
import X.C0IJT;
import X.C0IXW;
import X.C0TZM;
import X.C0U4C;
import X.C1105870esr;
import X.C1117370fBP;
import X.C1119070fE9;
import X.C1119080fEA;
import X.C1119090fEB;
import X.C1119100fEC;
import X.C1119110fED;
import X.C1119410fEh;
import X.C1133830fbx;
import X.C1324720kZq;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C168B;
import X.C168C;
import X.C16F5;
import X.C16FS;
import X.C1790730whT;
import X.C1790870whh;
import X.C1809680xC2;
import X.C1809710xC5;
import X.C1809720xC6;
import X.C1809760xCA;
import X.C1809770xCB;
import X.C1809860xCK;
import X.C1809870xCL;
import X.C1809930xCR;
import X.C1809940xCS;
import X.C1809950xCT;
import X.C1810160xCo;
import X.C1810410xDD;
import X.C1810680xDe;
import X.C1810690xDf;
import X.C1810980xE8;
import X.C1811260xEa;
import X.C1811270xEb;
import X.C1811290xEd;
import X.C1811300xEe;
import X.C1864820ycy;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19MB;
import X.C20736316Cj;
import X.C2187701Ajg;
import X.C235000vU;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1808150x9Z;
import X.EnumC1811400xEo;
import X.InterfaceC1790880whi;
import X.InterfaceC1809830xCH;
import X.InterfaceC1809890xCN;
import X.InterfaceC1810050xCd;
import X.InterfaceC1811380xEm;
import X.InterfaceC1846850y9z;
import X.InterfaceC2262081DgM;
import X.RunnableC781530UlD;
import X.ViewTreeObserverOnPreDrawListenerC1864760ycs;
import Y.ARunnableS96S0200000_27;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.SparseLongArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.rank.impl.list.controller.OfflineRankRootController;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.list.fragment.list.layoutmanager.RankListLinearLayoutManager;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingNewUISetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.CloseRankDialogEvent;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS512S0200000_27;

/* JADX INFO: loaded from: classes28.dex */
public abstract class RankListFragment extends VisibilityFragment implements InterfaceC1809890xCN {
    public C1810410xDD LLILLL;
    public RankListV2Response.RankView LLILZ;
    public RankListController LLILZIL;
    public RankPageController LLILZLL;
    public Function0<Unit> LLIZ;
    public long LLIZLLLIL;
    public C1117370fBP LLJ;
    public RankListLinearLayoutManager LLJI;
    public C1809680xC2 LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public C1809770xCB LLJJI;
    public final ViewTreeObserverOnPreDrawListenerC1864760ycs LLJJIII;
    public final C1864820ycy LLJJIJI;
    public final C1809760xCA LLJJIJIIJIL;
    public Runnable LLJJIJIL;
    public RunnableC781530UlD LLJJJ;
    public View LLJJJIL;
    public FrameLayout LLJJJJ;
    public C1105870esr LLJJJJJIL;
    public TextView LLJJJJLIIL;
    public TextView LLJJL;
    public ImageView LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public C1324720kZq LLJLIL;
    public View LLJLILLLLZIIL;
    public C16F5 LLJLL;
    public FrameLayout LLJLLIL;
    public C16F5 LLJLLL;
    public C16FS LLJZ;
    public TextView LLJZIJLIL;
    public C16F5 LLL;
    public FrameLayout LLLF;
    public LinearLayout LLLFF;
    public RecyclerView LLLFFI;
    public C1811290xEd LLLFZ;
    public C16F5 LLLI;
    public C1324720kZq LLLII;
    public View LLLIIII;
    public LinearLayout LLLIIIIL;
    public C1324720kZq LLLIIIL;
    public C16F5 LLLIIL;
    public final C1810680xDe LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        this.LLJJ = false;
        this.LLJJIJIL = null;
        C1105870esr c1105870esr = this.LLJJJJJIL;
        if (c1105870esr != null) {
            c1105870esr.LIZIZ();
        }
        C1809680xC2 c1809680xC2 = this.LLJIJIL;
        if (c1809680xC2 != null) {
            InterfaceC1809830xCH interfaceC1809830xCH = c1809680xC2.LIZLLL;
            if (interfaceC1809830xCH != null) {
                interfaceC1809830xCH.LIZ();
            }
            c1809680xC2.LJ = null;
            c1809680xC2.LJFF = null;
            c1809680xC2.LJI = null;
            c1809680xC2.LJII = null;
            c1809680xC2.LJIIJJI = false;
            c1809680xC2.LJIIIIZZ = null;
            C1809710xC5 c1809710xC5 = c1809680xC2.LJIIJ;
            if (c1809710xC5 != null) {
                c1809710xC5.LIZJ = false;
                c1809710xC5.LIZ = false;
                AnimatorSet animatorSet = c1809710xC5.LIZIZ;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                }
                AnimatorSet animatorSet2 = c1809710xC5.LIZIZ;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                c1809710xC5.LIZIZ = null;
            }
            c1809680xC2.LJIIJ = null;
        }
        super.onDestroyView();
        C1548820qPI.LJIIIIZZ("ttlive_anchor_ranking_click_cell_event", this.LLJJIJI);
        RunnableC781530UlD runnableC781530UlD = this.LLJJJ;
        if (runnableC781530UlD != null && (viewTreeObserver = runnableC781530UlD.getViewTreeObserver()) != null) {
            ViewTreeObserverOnPreDrawListenerC1864760ycs viewTreeObserverOnPreDrawListenerC1864760ycs = this.LLJJIII;
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1864760ycs);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1864760ycs, ViewTreeObserver.OnPreDrawListener.class);
        }
        RankListLinearLayoutManager rankListLinearLayoutManager = this.LLJI;
        if (rankListLinearLayoutManager != null) {
            rankListLinearLayoutManager.LL = null;
        }
        this.LLJIJIL = null;
        this.LLJJIJIIJIL.LJFF = null;
    }

    public final RankPageController RR() {
        RankPageController rankPageController = this.LLILZLL;
        if (rankPageController != null) {
            return rankPageController;
        }
        return null;
    }

    public final boolean cS() {
        RankTypeV2 rankTypeV2 = this.LLILLL.LIZIZ;
        RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
        return Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI) && LivePopularityRankingNewUISetting.INSTANCE.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0xDe] */
    public RankListFragment() {
        C1810410xDD c1810410xDD = C1810410xDD.LJI;
        this.LLILLL = C1810410xDD.LJI;
        this.LLJILJIL = true;
        this.LLJILJILJ = "";
        this.LLJJIII = new ViewTreeObserverOnPreDrawListenerC1864760ycs(this, 0);
        this.LLJJIJI = new C1864820ycy(this, 0);
        this.LLJJIJIIJIL = new C1809760xCA();
        this.LLLIILIL = new InterfaceC1811380xEm() { // from class: X.0xDe
            @Override // X.InterfaceC1811380xEm
            public final void LIZ(RankListV2Response.RankInfo rankInfo) {
                Long lValueOf;
                Long lValueOf2;
                Room room;
                Long lValueOf3;
                Long l;
                RankListFragment rankListFragment = this.LIZ;
                C1809760xCA c1809760xCA = rankListFragment.LLJJIJIIJIL;
                long j = c1809760xCA.LJ;
                long j2 = rankInfo.rank;
                if (j < j2) {
                    j = j2;
                }
                c1809760xCA.LJ = j;
                RankListController rankListController = rankListFragment.LLILZIL;
                if (rankListController != null && rankListController.LJIIIZ().LLILLJJLI != null) {
                    C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                    C1810410xDD c1810410xDD2 = rankListFragment.LLILLL;
                    RankListV2Response.RankView rankView = rankListController.LJIIIZ().LLILLJJLI;
                    DataChannel dataChannelLJ = C475510Ikn.LJ(rankListFragment);
                    c1810690xDf.getClass();
                    Long lValueOf4 = null;
                    if (c1810410xDD2.LIZ != EnumC1811400xEo.E_COMMERCE) {
                        if (rankInfo.roomId > 0) {
                            HashMap map = new HashMap();
                            map.put("enter_from_merge", "live_detail");
                            map.put("enter_method", c1810410xDD2.LIZIZ.rankName);
                            User user = rankInfo.user;
                            if (user != null) {
                                lValueOf3 = Long.valueOf(user.getId());
                            } else {
                                lValueOf3 = null;
                            }
                            map.put("anchor_id", String.valueOf(lValueOf3));
                            User user2 = rankInfo.user;
                            if (user2 != null && (l = user2.followStatus) != null) {
                                map.put("initial_follow_status", String.valueOf(l.longValue()));
                            }
                            map.put("room_id", String.valueOf(rankInfo.roomId));
                            map.put("action_type", "draw");
                            map.put("is_return", CardStruct.IStatusCode.DEFAULT);
                            map.put("content_type", c1810410xDD2.LIZIZ.rankName);
                            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
                            map.put("from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
                            map.put("from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
                            map.putAll(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(null));
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_show");
                            c474500IjALIZ.LJIJJLI(dataChannelLJ);
                            c474500IjALIZ.LJJIIZI(map);
                            if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
                                c474500IjALIZ.LJJII(Integer.valueOf(C0IXN.LIZ()), "is_from_guest_distribute");
                            }
                            c474500IjALIZ.LIZ();
                            return;
                        }
                        return;
                    }
                    String strLJI = C1810690xDf.LJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannelLJ)));
                    if (rankView != null) {
                        lValueOf = Long.valueOf(rankView.LIZ);
                    } else {
                        lValueOf = null;
                    }
                    String strLJJJIL = C1810690xDf.LJJJIL(lValueOf);
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_tiktokec_sale_rank_head_show");
                    c474500IjALIZ2.LJIJJLI(dataChannelLJ);
                    c474500IjALIZ2.LJJII(strLJI, "is_self");
                    User user3 = rankInfo.user;
                    if (user3 != null) {
                        lValueOf2 = Long.valueOf(user3.getId());
                    } else {
                        lValueOf2 = null;
                    }
                    c474500IjALIZ2.LJJII(lValueOf2, "head_author_id");
                    c474500IjALIZ2.LJJII(Long.valueOf(rankInfo.roomId), "head_room_id");
                    c474500IjALIZ2.LJJII(Long.valueOf(rankInfo.rank), "head_position");
                    c474500IjALIZ2.LJJII(strLJJJIL, "rank_period");
                    if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null) {
                        lValueOf4 = Long.valueOf(room.getOwnerUserId());
                    }
                    c474500IjALIZ2.LJJII(lValueOf4, "author_id");
                    SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                    c474500IjALIZ2.LJJII(Long.valueOf(C1810700xDg.LIZIZ(c1810410xDD2.LIZIZ.type, c1810410xDD2.LJ)), "author_rank");
                    c474500IjALIZ2.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
                    c474500IjALIZ2.LJJII("live", "page_name");
                    c474500IjALIZ2.LJFF(C0IXW.LIZJ("user_live_duration"));
                    c474500IjALIZ2.LJJII(c1810410xDD2.LIZIZ.rankName, "rank_type");
                    c474500IjALIZ2.LIZ();
                }
            }

            @Override // X.InterfaceC1811380xEm
            public final void LIZIZ(RankListV2Response.RankInfo rankInfo) {
                RankListV2Response.RankView rankView;
                RankListFragment rankListFragment = this.LIZ;
                RankListController rankListController = rankListFragment.LLILZIL;
                if (rankListController != null && (rankView = rankListController.LJIIIZ().LLILLJJLI) != null) {
                    rankListController.LIZJ(rankInfo, rankView, rankListFragment.LLILLL);
                }
            }
        };
    }

    @Override // X.InterfaceC1809890xCN
    public final void Nx() {
        RunnableC781530UlD runnableC781530UlD;
        if (!Fn() || (runnableC781530UlD = this.LLJJJ) == null) {
            return;
        }
        runnableC781530UlD.smoothScrollToPosition(0);
    }

    public final void WR() {
        RunnableC781530UlD runnableC781530UlD;
        RecyclerView.LayoutManager layoutManager;
        int itemCount;
        InterfaceC1810050xCd interfaceC1810050xCd;
        InterfaceC1810050xCd interfaceC1810050xCd2;
        if (!Fn() || (runnableC781530UlD = this.LLJJJ) == null || (layoutManager = runnableC781530UlD.getLayoutManager()) == null || (itemCount = layoutManager.getItemCount()) <= 0) {
            return;
        }
        if (itemCount <= 2) {
            RankListController rankListController = this.LLILZIL;
            if (rankListController == null || (interfaceC1810050xCd2 = ((RankPageController) rankListController.LLILLJJLI).LLIZLLLIL) == null) {
                return;
            }
            interfaceC1810050xCd2.hc(false);
            return;
        }
        RankListController rankListController2 = this.LLILZIL;
        if (rankListController2 == null || (interfaceC1810050xCd = ((RankPageController) rankListController2.LLILLJJLI).LLIZLLLIL) == null) {
            return;
        }
        interfaceC1810050xCd.hc(true);
    }

    public final void bS() {
        TextView textView;
        if (!cS() || (textView = this.LLJJJJLIIL) == null) {
            return;
        }
        textView.setTextAppearance(R.style.rg);
        textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, textView.getContext()));
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment
    public void MR(boolean z) {
        Object objGg0;
        String str;
        Boolean boolValueOf;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        int i;
        Room room;
        RankListV2Response.RankInfo rankInfo;
        RankListController rankListController = this.LLILZIL;
        if (rankListController != null) {
            if (z) {
                if (!this.LLLILZ) {
                    this.LLLILZ = true;
                    rankListController.LJIIJ(true, false);
                }
                List<RankListV2Response.Bulletin> value = rankListController.LJIIIZ().LLJ.getValue();
                if (value != null) {
                    boolean zUseNewNoticeContainer = LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig.INSTANCE.useNewNoticeContainer(this.LLILLL.LIZIZ.type);
                    MutableLiveData<List<RankListV2Response.Bulletin>> mutableLiveData = rankListController.LJ().LLJIJIL;
                    if (zUseNewNoticeContainer) {
                        value = new ArrayList<>();
                    }
                    mutableLiveData.postValue(value);
                }
                C1790870whh value2 = rankListController.LJIIIZ().LLJI.getValue();
                if (value2 != null) {
                    rankListController.LJ().LLJILLL.postValue(value2);
                }
                RankListV2Response.RankView rankView = rankListController.LJIIIZ().LLILLJJLI;
                if (rankView != null) {
                    rankListController.LJ().LLIZ.postValue(new C1810160xCo(this.LLILLL, rankView.history));
                    MutableLiveData<C1790730whT> mutableLiveData2 = rankListController.LJ().LLJI;
                    C1810410xDD c1810410xDD = this.LLILLL;
                    String str2 = rankView.ruleUrl;
                    if (str2 == null) {
                        str2 = "";
                    }
                    mutableLiveData2.postValue(new C1790730whT(c1810410xDD, str2));
                }
                if (this.LLJJIJIIJIL.LIZ) {
                    ARunnableS96S0200000_27 aRunnableS96S0200000_27 = new ARunnableS96S0200000_27(rankListController, this, 2);
                    this.LLJJIJIL = aRunnableS96S0200000_27;
                    aRunnableS96S0200000_27.run();
                    if (!this.LLILLL.LJ) {
                        C1809720xC6.LIZ = new WeakReference<>(this.LLJJIJIL);
                        return;
                    }
                    return;
                }
                return;
            }
            Long lValueOf4 = null;
            if (rankListController.LJIIIZ().LL.LIZ == EnumC1811400xEo.E_COMMERCE) {
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                DataChannel dataChannelLJ = C475510Ikn.LJ(this);
                RankListV2Response.RankView rankView2 = rankListController.LJIIIZ().LLILLJJLI;
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIJIIJIL.LIZLLL;
                c1810690xDf.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tiktokec_sale_rank_stay_time");
                c474500IjALIZ.LJIJJLI(dataChannelLJ);
                c474500IjALIZ.LJJII(C1810690xDf.LJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannelLJ))), "is_self");
                if (rankView2 != null && (rankInfo = rankView2.ownerRank) != null) {
                    lValueOf = Long.valueOf(rankInfo.rank);
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "author_rank");
                if (rankView2 != null) {
                    lValueOf2 = Long.valueOf(rankView2.LIZ);
                } else {
                    lValueOf2 = null;
                }
                c474500IjALIZ.LJJII(C1810690xDf.LJJJIL(lValueOf2), "rank_period");
                c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
                if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null) {
                    lValueOf3 = Long.valueOf(room.getOwnerUserId());
                } else {
                    lValueOf3 = null;
                }
                c474500IjALIZ.LJJII(lValueOf3, "author_id");
                c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
                c474500IjALIZ.LJJII("live", "page_name");
                c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
                RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                if (rankView2 != null) {
                    i = rankView2.rankType;
                } else {
                    i = RankTypeV2.LJJIJIIJI.type;
                }
                c474500IjALIZ.LJJII(C235000vU.LIZ(i, 0).rankName, "rank_type");
                c474500IjALIZ.LIZ();
            }
            C1809760xCA c1809760xCA = this.LLJJIJIIJIL;
            if (!c1809760xCA.LIZJ) {
                return;
            }
            c1809760xCA.LIZJ = false;
            C1810690xDf c1810690xDf2 = C1810690xDf.LIZ;
            RankListV2Response.RankView rankView3 = rankListController.LJIIIZ().LLILLJJLI;
            C1810410xDD c1810410xDD2 = this.LLILLL;
            long j = this.LLJJIJIIJIL.LJ;
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            c1810690xDf2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("last_user_rank", String.valueOf(j));
            if (dataChannelLJ2 != null) {
                objGg0 = dataChannelLJ2.gg0(C0TZM.class);
            } else {
                objGg0 = null;
            }
            if (!Intrinsics.LJFF(objGg0, Boolean.FALSE)) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            linkedHashMap.put("room_orientation", str);
            C1810690xDf.LIZJ(linkedHashMap, c1810410xDD2, dataChannelLJ2);
            C474500IjA c474500IjALJII = C1810690xDf.LJII("livesdk_hourly_user_rank_swipe_to_end", linkedHashMap);
            C1810690xDf.LIZ(c474500IjALJII, dataChannelLJ2);
            if (dataChannelLJ2 != null) {
                boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannelLJ2));
            } else {
                boolValueOf = null;
            }
            c474500IjALJII.LJJII(C1810690xDf.LJJJJIZL(boolValueOf), "user_type");
            if (rankView3 != null) {
                lValueOf4 = Long.valueOf(rankView3.LIZ);
            }
            c474500IjALJII.LJJII(C1810690xDf.LJJJIL(lValueOf4), "rank_period");
            c474500IjALJII.LJJII(c1810410xDD2.LIZIZ.rankName, "rank_type");
            c474500IjALJII.LIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int PR(long r9) {
        /*
            r8 = this;
            com.bytedance.android.live.rank.impl.list.controller.RankListController r0 = r8.LLILZIL
            r3 = -1
            if (r0 == 0) goto L53
            com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel r0 = r0.LJIIIZ()
            if (r0 == 0) goto L53
            androidx.lifecycle.MutableLiveData<java.util.List<X.0xC9>> r0 = r0.LLILZIL
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L53
            java.util.Iterator r7 = r0.iterator()
            r6 = 0
        L1c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r1 = r7.next()
            X.0xC9 r1 = (X.AbstractC1809750xC9) r1
            boolean r0 = r1 instanceof X.C1809930xCR
            if (r0 == 0) goto L57
            X.0xCR r1 = (X.C1809930xCR) r1
            java.util.List<com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo> r0 = r1.LIZ
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
        L35:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r5.next()
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo r0 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo) r0
            long r1 = r0.rank
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L54
            if (r4 == r3) goto L75
        L49:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            if (r0 == 0) goto L53
            int r3 = r0.intValue()
        L53:
            return r3
        L54:
            int r4 = r4 + 1
            goto L35
        L57:
            boolean r0 = r1 instanceof X.C1809950xCT
            if (r0 == 0) goto L66
            X.0xCT r1 = (X.C1809950xCT) r1
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo r0 = r1.LIZ
            long r1 = r0.rank
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L75
            goto L49
        L66:
            boolean r0 = r1 instanceof X.C1809940xCS
            if (r0 == 0) goto L75
            X.0xCS r1 = (X.C1809940xCS) r1
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo r0 = r1.LIZ
            long r1 = r0.rank
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L75
            goto L49
        L75:
            int r6 = r6 + 1
            goto L1c
        L78:
            r6 = -1
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment.PR(long):int");
    }

    public final void SR(boolean z) {
        Boolean boolValueOf;
        RankTypeV2 rankTypeV2;
        RankListViewModel rankListViewModelLJIIIZ;
        RankListV2Response.RankView rankView;
        RankListV2Response.RankInfo rankInfo;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        RankListV2Response.Gap gap = null;
        if (dataChannelLJ != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannelLJ));
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        C1810410xDD c1810410xDD = this.LLILLL;
        if (c1810410xDD != null) {
            rankTypeV2 = c1810410xDD.LIZIZ;
        } else {
            rankTypeV2 = null;
        }
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIL)) {
            if (!z || !zLJJJI) {
                if (this.LLJIJIL != null) {
                    RankListController rankListController = this.LLILZIL;
                    if (rankListController != null && (rankListViewModelLJIIIZ = rankListController.LJIIIZ()) != null && (rankView = rankListViewModelLJIIIZ.LLILLJJLI) != null && (rankInfo = rankView.ownerRank) != null) {
                        gap = rankInfo.gap;
                    }
                    if (!C1809680xC2.LJFF(gap, zLJJJI)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            View view = this.LLLIIII;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
    }

    public final void UR(RankListV2Response.RankInfo rankInfo) {
        RankListV2Response.Gap gap;
        final RankListV2Response.BottomBarButton bottomBarButton;
        long id;
        BaseBundle baseBundle;
        InterfaceC2262081DgM interfaceC2262081DgM;
        RankTypeV2 rankTypeV2;
        RankListViewModel rankListViewModelLJIIIZ;
        RankListController rankListController;
        RankRootViewModel rankRootViewModelLIZ;
        RankListV2Response.Gap gap2;
        Boolean boolValueOf;
        ConstraintLayout constraintLayout;
        RankListViewModel rankListViewModelLJIIIZ2;
        RankListV2Response.RankView rankView;
        RankListV2Response.RankInfo rankInfo2;
        DataChannel dataChannelLJ;
        InterfaceC1846850y9z interfaceC1846850y9z;
        DataChannel dataChannelLJ2;
        InterfaceC1846850y9z interfaceC1846850y9z2;
        DataChannel dataChannelLJ3;
        InterfaceC1846850y9z interfaceC1846850y9z3;
        DataChannel dataChannelLJ4;
        InterfaceC1846850y9z interfaceC1846850y9z4;
        DataChannel dataChannelLJ5;
        InterfaceC1846850y9z interfaceC1846850y9z5;
        C16FS c16fs = this.LLJZ;
        if (c16fs != null && (gap = rankInfo.gap) != null && (bottomBarButton = gap.button) != null) {
            c16fs.setText(C1133830fbx.LJIILIIL(bottomBarButton.buttonContent, "").toString());
            String string = null;
            rankView = null;
            RankListV2Response.RankView rankView2 = null;
            string = null;
            switch (bottomBarButton.action) {
                case 0:
                    C786410Ut5.LLJJJ(c16fs, 8);
                    return;
                case 1:
                    OR(c16fs, bottomBarButton);
                    return;
                case 2:
                    NR(c16fs, bottomBarButton, rankInfo.user);
                    return;
                case 3:
                    OR(c16fs, bottomBarButton);
                    return;
                case 4:
                    if (!this.LLLIL) {
                        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                        DataChannel dataChannelLJ6 = C475510Ikn.LJ(this);
                        RankTypeV2 rankTypeV22 = this.LLILLL.LIZIZ;
                        c1810690xDf.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_entrance_show");
                        c474500IjALIZ.LJIJJLI(dataChannelLJ6);
                        if (dataChannelLJ6 != null && (interfaceC2262081DgM = (InterfaceC2262081DgM) dataChannelLJ6.gg0(C168B.class)) != null) {
                            id = interfaceC2262081DgM.getId();
                        } else {
                            id = 0;
                        }
                        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
                        c474500IjALIZ.LJJII(rankTypeV22.rankName, "event_page");
                        if (dataChannelLJ6 != null && (baseBundle = (BaseBundle) dataChannelLJ6.gg0(C168C.class)) != null) {
                            string = baseBundle.getString("rank_enter_type");
                        }
                        c474500IjALIZ.LJJII(string, "rank_enter_type");
                        c474500IjALIZ.LIZ();
                        this.LLLIL = true;
                    }
                    View view = this.LLJLILLLLZIIL;
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.setMarginEnd(0);
                            C786410Ut5.W5(view, marginLayoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                    }
                    C500260Jjc.LLFFF(c16fs);
                    C786410Ut5.h8(c16fs, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xBp
                        @Override // X.AbstractViewOnClickListenerC1105820esm
                        public final void LIZ() {
                            String string2;
                            String string3;
                            BaseBundle baseBundle2;
                            InterfaceC2262081DgM interfaceC2262081DgM2;
                            BaseBundle baseBundle3;
                            BaseBundle baseBundle4;
                            String string4;
                            BaseBundle baseBundle5;
                            RankPageController rankPageController;
                            Function0<Unit> function0 = this.LLILZIL.LLIZ;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            RankListController rankListController2 = this.LLILZIL.LLILZIL;
                            String string5 = null;
                            RankRootController rankRootController = (rankListController2 == null || (rankPageController = rankListController2.LLILZIL) == null) ? null : rankPageController.LLILZLL;
                            if (rankRootController instanceof OfflineRankRootController) {
                                C520010KaN.LIZLLL(rankRootController.LLILLJJLI);
                                C389001fE.LIZ("close_front_page_in_livePreviewPage", null, System.currentTimeMillis(), false);
                            }
                            DataChannel dataChannelLJ7 = C475510Ikn.LJ(this.LLILZIL);
                            String str = "";
                            if (dataChannelLJ7 == null || (baseBundle5 = (BaseBundle) dataChannelLJ7.gg0(C168C.class)) == null || (string2 = baseBundle5.getString("source")) == null) {
                                string2 = "";
                            }
                            String str2 = Intrinsics.LJFF(string2, "push") ? "outapp_push" : "";
                            DataChannel dataChannelLJ8 = C475510Ikn.LJ(this.LLILZIL);
                            if (dataChannelLJ8 != null && (baseBundle4 = (BaseBundle) dataChannelLJ8.gg0(C168C.class)) != null && (string4 = baseBundle4.getString("request_page")) != null) {
                                str = string4;
                            }
                            DataChannel dataChannelLJ9 = C475510Ikn.LJ(this.LLILZIL);
                            if (dataChannelLJ9 == null || (baseBundle3 = (BaseBundle) dataChannelLJ9.gg0(C168C.class)) == null || (string3 = baseBundle3.getString("rank_enter_type")) == null) {
                                string3 = "null";
                            }
                            IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                            Context context = this.LLILZIL.getContext();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(bottomBarButton.schemaUrl);
                            sbLIZ.append("&source_params={\"request_from\":\"");
                            sbLIZ.append(this.LLILZIL.LLILLL.LIZIZ.rankName);
                            sbLIZ.append("\",\"push_from\":\"");
                            sbLIZ.append(str2);
                            sbLIZ.append("\",\"rank_enter_type\":\"");
                            sbLIZ.append(string3);
                            sbLIZ.append("\",\"request_page\":\"");
                            sbLIZ.append(str);
                            sbLIZ.append("\"}");
                            iActionHandlerService.handle(context, C2188811AlT.LIZIZ(sbLIZ));
                            C1810690xDf c1810690xDf2 = C1810690xDf.LIZ;
                            DataChannel dataChannelLJ10 = C475510Ikn.LJ(this.LLILZIL);
                            RankTypeV2 rankTypeV23 = this.LLILZIL.LLILLL.LIZIZ;
                            c1810690xDf2.getClass();
                            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_entrance_click");
                            c474500IjALIZ2.LJIJJLI(dataChannelLJ10);
                            c474500IjALIZ2.LJJII(Long.valueOf((dataChannelLJ10 == null || (interfaceC2262081DgM2 = (InterfaceC2262081DgM) dataChannelLJ10.gg0(C168B.class)) == null) ? 0L : interfaceC2262081DgM2.getId()), "anchor_id");
                            c474500IjALIZ2.LJJII(rankTypeV23.rankName, "event_page");
                            if (dataChannelLJ10 != null && (baseBundle2 = (BaseBundle) dataChannelLJ10.gg0(C168C.class)) != null) {
                                string5 = baseBundle2.getString("rank_enter_type");
                            }
                            c474500IjALIZ2.LJJII(string5, "rank_enter_type");
                            c474500IjALIZ2.LIZ();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1200L);
                        }
                    });
                    return;
                case 5:
                    DataChannel dataChannelLJ7 = C475510Ikn.LJ(this);
                    if ((dataChannelLJ7 == null || !C500260Jjc.LJIJI(dataChannelLJ7)) && ((!Intrinsics.LJFF(this.LLILLL.LIZIZ, RankTypeV2.LJIIL) || ((dataChannelLJ5 = C475510Ikn.LJ(this)) != null && (interfaceC1846850y9z5 = (InterfaceC1846850y9z) dataChannelLJ5.gg0(C1119080fEA.class)) != null && interfaceC1846850y9z5.LJIIIIZZ())) && ((!Intrinsics.LJFF(this.LLILLL.LIZIZ, RankTypeV2.LJIJJLI) || ((dataChannelLJ4 = C475510Ikn.LJ(this)) != null && (interfaceC1846850y9z4 = (InterfaceC1846850y9z) dataChannelLJ4.gg0(C1119110fED.class)) != null && interfaceC1846850y9z4.LJIIIIZZ())) && ((!Intrinsics.LJFF(this.LLILLL.LIZIZ, RankTypeV2.LIZ) || ((dataChannelLJ3 = C475510Ikn.LJ(this)) != null && (interfaceC1846850y9z3 = (InterfaceC1846850y9z) dataChannelLJ3.gg0(C1119100fEC.class)) != null && interfaceC1846850y9z3.LJIIIIZZ())) && (!Intrinsics.LJFF(this.LLILLL.LIZIZ, RankTypeV2.LJIILJJIL) || ((dataChannelLJ2 = C475510Ikn.LJ(this)) != null && (interfaceC1846850y9z2 = (InterfaceC1846850y9z) dataChannelLJ2.gg0(C1119090fEB.class)) != null && interfaceC1846850y9z2.LJIIIIZZ())))))) {
                        RankTypeV2 rankTypeV23 = this.LLILLL.LIZIZ;
                        RankTypeV2 rankTypeV24 = RankTypeV2.LJIL;
                        if (!Intrinsics.LJFF(rankTypeV23, rankTypeV24) || ((dataChannelLJ = C475510Ikn.LJ(this)) != null && (interfaceC1846850y9z = (InterfaceC1846850y9z) dataChannelLJ.gg0(C1119070fE9.class)) != null && interfaceC1846850y9z.LJIIIIZZ())) {
                            this.LLJJ = true;
                            SR(true);
                            C1810410xDD c1810410xDD = this.LLILLL;
                            if (c1810410xDD != null) {
                                rankTypeV2 = c1810410xDD.LIZIZ;
                            } else {
                                rankTypeV2 = null;
                            }
                            if (Intrinsics.LJFF(rankTypeV2, rankTypeV24) && (this.LLJLILLLLZIIL instanceof ConstraintLayout) && (rankListController = this.LLILZIL) != null && (rankRootViewModelLIZ = rankListController.LIZ()) != null && !rankRootViewModelLIZ.isOffline() && this.LLJIJIL != null) {
                                RankListController rankListController2 = this.LLILZIL;
                                if (rankListController2 != null && (rankListViewModelLJIIIZ2 = rankListController2.LJIIIZ()) != null && (rankView = rankListViewModelLJIIIZ2.LLILLJJLI) != null && (rankInfo2 = rankView.ownerRank) != null) {
                                    gap2 = rankInfo2.gap;
                                } else {
                                    gap2 = null;
                                }
                                DataChannel dataChannelLJ8 = C475510Ikn.LJ(this);
                                if (dataChannelLJ8 != null) {
                                    boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannelLJ8));
                                } else {
                                    boolValueOf = null;
                                }
                                if (C1809680xC2.LJFF(gap2, C500260Jjc.LJJJI(boolValueOf))) {
                                    View view2 = this.LLJLILLLLZIIL;
                                    if ((view2 instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view2) != null) {
                                        C19MB c19mb = new C19MB();
                                        c19mb.LJII(constraintLayout);
                                        c19mb.LJI(R.id.ne9, 7);
                                        c19mb.LJIIIZ(R.id.ne9, 7, R.id.cuw, 6, C497740JfY.LJIIIZ(R.dimen.sz));
                                        c19mb.LIZIZ(constraintLayout);
                                    }
                                }
                            }
                            if (!this.LLLIL) {
                                DataChannel dataChannelLJ9 = C475510Ikn.LJ(this);
                                RankTypeV2 rankTypeV25 = this.LLILLL.LIZIZ;
                                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_rank_sticker_entertance_show");
                                c474500IjALIZ2.LJIJJLI(dataChannelLJ9);
                                C1119410fEh.LIZJ(c474500IjALIZ2, dataChannelLJ9, rankTypeV25);
                                c474500IjALIZ2.LIZ();
                                C1810690xDf c1810690xDf2 = C1810690xDf.LIZ;
                                DataChannel dataChannelLJ10 = C475510Ikn.LJ(this);
                                String str = bottomBarButton.buttonType;
                                String str2 = this.LLILLL.LIZIZ.rankName;
                                RankListController rankListController3 = this.LLILZIL;
                                if (rankListController3 != null && (rankListViewModelLJIIIZ = rankListController3.LJIIIZ()) != null) {
                                    rankView2 = rankListViewModelLJIIIZ.LLILLJJLI;
                                }
                                c1810690xDf2.getClass();
                                C1810690xDf.LJIIJ(dataChannelLJ10, str, str2, "show", "", rankView2);
                                this.LLLIL = true;
                            }
                            C500260Jjc.LLFFF(c16fs);
                            C786410Ut5.I7(new AbS512S0200000_27(this, bottomBarButton, 4), c16fs);
                            return;
                        }
                    }
                    C500260Jjc.LJIILIIL(c16fs);
                    return;
                case 6:
                    NR(c16fs, bottomBarButton, rankInfo.user);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x050c  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void VR(final com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo r29) {
        /*
            Method dump skipped, instruction units count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment.VR(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo):void");
    }

    public void ZR(C1117370fBP c1117370fBP) {
        RankListController rankListController;
        RankRootController rankRootController;
        InterfaceC1790880whi interfaceC1790880whi;
        Boolean bool;
        final View rootView;
        final View rootView2;
        final DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        Window windowN7 = null;
        if (dataChannelLJ != null) {
            final C1810680xDe c1810680xDe = this.LLLIILIL;
            c1117370fBP.LLLFZ(C1809930xCR.class, new AbstractC485930J3v<C1809930xCR, C1811300xEe>(dataChannelLJ, c1810680xDe) { // from class: X.0xES
                public final DataChannel LIZLLL;
                public final InterfaceC1811380xEm LJ;

                @Override // X.AbstractC485930J3v, X.C0J8P
                public final void LJII(RecyclerView.ViewHolder viewHolder) {
                    C1811300xEe c1811300xEe = (C1811300xEe) viewHolder;
                    super.LJII(c1811300xEe);
                    c1811300xEe.LL.LIZIZ();
                    c1811300xEe.LLILLJJLI.LIZIZ();
                    c1811300xEe.LLILLL.LIZIZ();
                }

                {
                    super(R.layout.gr5, Boolean.FALSE);
                    this.LIZLLL = dataChannelLJ;
                    this.LJ = c1810680xDe;
                }

                @Override // X.AbstractC485930J3v, X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                    ((C1811300xEe) viewHolder).I5((C1809930xCR) obj, true, this.LIZLLL, this.LJ);
                }

                @Override // X.AbstractC485930J3v
                public final RecyclerView.ViewHolder LJIIIIZZ(View view, ViewGroup viewGroup) {
                    return new C1811300xEe(view);
                }

                @Override // X.AbstractC485930J3v, X.C0J8P
                public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
                    C1811300xEe c1811300xEe = (C1811300xEe) viewHolder;
                    C1809930xCR c1809930xCR = (C1809930xCR) obj;
                    if ((!list.isEmpty()) && Intrinsics.LJFF(ListProtector.get(list, 0), "ket_not_change_avatar")) {
                        c1811300xEe.I5(c1809930xCR, false, this.LIZLLL, this.LJ);
                    } else {
                        c1811300xEe.I5(c1809930xCR, true, this.LIZLLL, this.LJ);
                    }
                }
            });
            c1117370fBP.LLLFZ(C1809870xCL.class, new AbstractC485930J3v<C1809870xCL, C1809860xCK>() { // from class: X.0xCJ
                {
                    Boolean bool2 = Boolean.FALSE;
                }

                @Override // X.AbstractC485930J3v, X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                    ((C1809860xCK) viewHolder).LL.setText(((C1809870xCL) obj).LIZ);
                }

                @Override // X.AbstractC485930J3v
                public final RecyclerView.ViewHolder LJIIIIZZ(View view, ViewGroup viewGroup) {
                    return new C1809860xCK(view);
                }
            });
            final C1810680xDe c1810680xDe2 = this.LLLIILIL;
            View view = getView();
            if (view != null) {
                rootView = view.getRootView();
            } else {
                rootView = null;
            }
            c1117370fBP.LLLFZ(C1809950xCT.class, new AbstractC485930J3v<C1809950xCT, C1811270xEb>(dataChannelLJ, c1810680xDe2, rootView) { // from class: X.0xDp
                public final DataChannel LIZLLL;
                public final InterfaceC1811380xEm LJ;
                public final View LJFF;

                @Override // X.AbstractC485930J3v, X.C0J8P
                public final void LJII(RecyclerView.ViewHolder viewHolder) {
                    C1811270xEb c1811270xEb = (C1811270xEb) viewHolder;
                    super.LJII(c1811270xEb);
                    C786410Ut5.I7(null, c1811270xEb.itemView);
                    AnonymousClass0956 anonymousClass0956 = c1811270xEb.LLJILJILJ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                }

                @Override // X.AbstractC485930J3v, X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                    ((C1811270xEb) viewHolder).I5((C1809950xCT) obj, true, this.LIZLLL, this.LJ, this.LJFF);
                }

                @Override // X.AbstractC485930J3v
                public final RecyclerView.ViewHolder LJIIIIZZ(View view2, ViewGroup viewGroup) {
                    return new C1811270xEb(view2);
                }

                {
                    super(R.layout.gr4, Boolean.FALSE);
                    this.LIZLLL = dataChannelLJ;
                    this.LJ = c1810680xDe2;
                    this.LJFF = rootView;
                }

                @Override // X.AbstractC485930J3v, X.C0J8P
                public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
                    C1811270xEb c1811270xEb = (C1811270xEb) viewHolder;
                    C1809950xCT c1809950xCT = (C1809950xCT) obj;
                    if ((!list.isEmpty()) && Intrinsics.LJFF(ListProtector.get(list, 0), "ket_not_change_avatar")) {
                        c1811270xEb.I5(c1809950xCT, false, this.LIZLLL, this.LJ, this.LJFF);
                    } else {
                        c1811270xEb.I5(c1809950xCT, true, this.LIZLLL, this.LJ, this.LJFF);
                    }
                }
            });
            final C1810680xDe c1810680xDe3 = this.LLLIILIL;
            View view2 = getView();
            if (view2 != null) {
                rootView2 = view2.getRootView();
            } else {
                rootView2 = null;
            }
            c1117370fBP.LLLFZ(C1809940xCS.class, new AbstractC485930J3v<C1809940xCS, C1811260xEa>(dataChannelLJ, c1810680xDe3, rootView2) { // from class: X.0xDo
                public final DataChannel LIZLLL;
                public final InterfaceC1811380xEm LJ;
                public final View LJFF;

                @Override // X.AbstractC485930J3v, X.C0J8P
                public final void LJII(RecyclerView.ViewHolder viewHolder) {
                    super.LJII(viewHolder);
                    C786410Ut5.I7(null, viewHolder.itemView);
                }

                @Override // X.AbstractC485930J3v, X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                    ((C1811260xEa) viewHolder).I5((C1809940xCS) obj, true, this.LIZLLL, this.LJ, this.LJFF);
                }

                @Override // X.AbstractC485930J3v
                public final RecyclerView.ViewHolder LJIIIIZZ(View view3, ViewGroup viewGroup) {
                    return new C1811260xEa(view3);
                }

                {
                    super(R.layout.gul, Boolean.FALSE);
                    this.LIZLLL = dataChannelLJ;
                    this.LJ = c1810680xDe3;
                    this.LJFF = rootView2;
                }

                @Override // X.AbstractC485930J3v, X.C0J8P
                public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
                    C1811260xEa c1811260xEa = (C1811260xEa) viewHolder;
                    C1809940xCS c1809940xCS = (C1809940xCS) obj;
                    if ((!list.isEmpty()) && Intrinsics.LJFF(ListProtector.get(list, 0), "ket_not_change_avatar")) {
                        c1811260xEa.I5(c1809940xCS, false, this.LIZLLL, this.LJ, this.LJFF);
                    } else {
                        c1811260xEa.I5(c1809940xCS, true, this.LIZLLL, this.LJ, this.LJFF);
                    }
                }
            });
        }
        RunnableC781530UlD runnableC781530UlD = this.LLJJJ;
        if (runnableC781530UlD != null && (rankListController = this.LLILZIL) != null) {
            RankRootViewModel rankRootViewModelLIZ = rankListController.LIZ();
            boolean zBooleanValue = true;
            if (rankRootViewModelLIZ != null && !rankRootViewModelLIZ.isOffline()) {
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
                if (dataChannelLJ2 != null && (bool = (Boolean) dataChannelLJ2.gg0(C0TZM.class)) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                RankPageController rankPageControllerRR = RR();
                if (rankPageControllerRR != null && (rankRootController = rankPageControllerRR.LLILZLL) != null && (interfaceC1790880whi = rankRootController.LLILZ) != null) {
                    windowN7 = interfaceC1790880whi.n7();
                }
                runnableC781530UlD.LJ(C0U4C.RANK, zBooleanValue, windowN7);
            }
            runnableC781530UlD.LIZLLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aS(final com.bytedance.android.livesdk.rank.list.model.RankListV2Response.BottomBarTag r10) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment.aS(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$BottomBarTag):void");
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        RankPageController rankPageControllerRR;
        super.onCreate(bundle);
        if (this.LLILZIL == null && (rankPageControllerRR = RR()) != null) {
            RankListController rankListController = new RankListController(this.LLILLL, this, rankPageControllerRR);
            getLifecycle().addObserver(rankListController);
            if (this.LLILZ != null) {
                rankListController.LJIIIZ().LLJILJILJ = this.LLIZLLLIL;
                rankListController.LJIIIZ().LLILLJJLI = this.LLILZ;
            }
            this.LLILZIL = rankListController;
        }
    }

    public void OR(C16FS c16fs, final RankListV2Response.BottomBarButton bottomBarButton) {
        C786410Ut5.LLJJJ(c16fs, 0);
        C786410Ut5.h8(c16fs, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xBo
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                Function0<Unit> function0 = this.LLILZIL.LLIZ;
                if (function0 != null) {
                    function0.invoke();
                }
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LLILZIL.getContext(), bottomBarButton.schemaUrl);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1200L);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x048f  */
    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public void NR(C16FS c16fs, RankListV2Response.BottomBarButton bottomBarButton, final User user) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        boolean z;
        RankListV2Response.RankView rankView;
        RankListViewModel rankListViewModelLJIIIZ;
        RankRootViewModel rankRootViewModelLIZ;
        RankRootViewModel rankRootViewModelLIZ2;
        RankListController rankListController = this.LLILZIL;
        boolean z2 = true;
        if ((rankListController != null && (rankRootViewModelLIZ2 = rankListController.LIZ()) != null && rankRootViewModelLIZ2.LLILLL) || user == null) {
            C16FS c16fs2 = this.LLJZ;
            if (c16fs2 != null) {
                C786410Ut5.LLJJJ(c16fs2, 8);
                return;
            }
            return;
        }
        C16FS c16fs3 = this.LLJZ;
        if (c16fs3 != null) {
            if (getUserVisibleHint() && c16fs3.getVisibility() != 0) {
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                RankTypeV2 rankTypeV2 = this.LLILLL.LIZIZ;
                boolean zIsEnabled = c16fs3.isEnabled();
                DataChannel dataChannelLJ = C475510Ikn.LJ(this);
                RankListController rankListController2 = this.LLILZIL;
                if (rankListController2 != null && (rankRootViewModelLIZ = rankListController2.LIZ()) != null) {
                    z = rankRootViewModelLIZ.LLILLL;
                } else {
                    z = false;
                }
                c1810690xDf.getClass();
                C1810690xDf.LJJ(rankTypeV2, zIsEnabled, dataChannelLJ, z);
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
                String buttonType = EnumC1808150x9Z.SEND_GIFT_BTN.getButtonType();
                String str = this.LLILLL.LIZIZ.rankName;
                RankListController rankListController3 = this.LLILZIL;
                if (rankListController3 != null && (rankListViewModelLJIIIZ = rankListController3.LJIIIZ()) != null) {
                    rankView = rankListViewModelLJIIIZ.LLILLJJLI;
                } else {
                    rankView = null;
                }
                C1810690xDf.LJIIJ(dataChannelLJ2, buttonType, str, "show", "", rankView);
            }
            C786410Ut5.LLJJJ(c16fs3, 0);
            DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
            if (dataChannelLJ3 == null || (room = (Room) dataChannelLJ3.gg0(RoomChannel.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || !roomAuthStatus.isEnableGift()) {
                z2 = false;
            }
            c16fs3.setEnabled(z2);
            C786410Ut5.h8(c16fs3, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xC0
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    RankListViewModel rankListViewModelLJIIIZ2;
                    RankListViewModel rankListViewModelLJIIIZ3;
                    Function0<Unit> function0 = this.LLILZIL.LLIZ;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    DataChannel dataChannelLJ4 = C475510Ikn.LJ(this.LLILZIL);
                    if (dataChannelLJ4 != null) {
                        dataChannelLJ4.FQ2(CloseRankDialogEvent.class);
                    }
                    DataChannel dataChannelLJ5 = C475510Ikn.LJ(this.LLILZIL);
                    if (dataChannelLJ5 != null) {
                        C1121570fIB c1121570fIB = new C1121570fIB(user);
                        C1810410xDD c1810410xDD = this.LLILZIL.LLILLL;
                        c1121570fIB.LIZJ = c1810410xDD.LIZIZ.rankName;
                        c1121570fIB.LJFF = C1790710whR.LIZ(c1810410xDD);
                        dataChannelLJ5.LC0(SendGiftEvent.class, c1121570fIB);
                    }
                    RankListFragment rankListFragment = this.LLILZIL;
                    RankListController rankListController4 = rankListFragment.LLILZIL;
                    RankListV2Response.RankView rankView2 = null;
                    if (rankListController4 != null && (rankListViewModelLJIIIZ3 = rankListController4.LJIIIZ()) != null && rankListViewModelLJIIIZ3.LLILLJJLI != null) {
                        C1810210xCt.LIZJ(rankListController4.LJIIIZ().LL.LIZIZ.type, rankListController4.LJIIIZ().LL.LIZIZ.rankPhase, rankListFragment.RR().LJIIL().LLILLL, rankListController4.LIZ().LLILZIL, rankListController4.LIZ().LL);
                    }
                    C1810690xDf c1810690xDf2 = C1810690xDf.LIZ;
                    DataChannel dataChannelLJ6 = C475510Ikn.LJ(this.LLILZIL);
                    String buttonType2 = EnumC1808150x9Z.SEND_GIFT_BTN.getButtonType();
                    RankListFragment rankListFragment2 = this.LLILZIL;
                    String str2 = rankListFragment2.LLILLL.LIZIZ.rankName;
                    RankListController rankListController5 = rankListFragment2.LLILZIL;
                    if (rankListController5 != null && (rankListViewModelLJIIIZ2 = rankListController5.LJIIIZ()) != null) {
                        rankView2 = rankListViewModelLJIIIZ2.LLILLJJLI;
                    }
                    c1810690xDf2.getClass();
                    C1810690xDf.LJIIJ(dataChannelLJ6, buttonType2, str2, "click", "", rankView2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1200L);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1810980xE8.LIZIZ.put(this.LLILLL.LIZIZ.type, false);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gla, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
