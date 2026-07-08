package Y;

import X.AbstractC1585810rMx;
import X.C0IJT;
import X.C0J1R;
import X.C0K0O;
import X.C0K2E;
import X.C0K31;
import X.C0K3N;
import X.C0K51;
import X.C1263104wv;
import X.C13LP;
import X.C1623706Xj;
import X.C16GX;
import X.C1EOY;
import X.C20441214yg;
import X.C20684815ws;
import X.C20731516An;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C471410IeB;
import X.C472450Ifr;
import X.C474500IjA;
import X.C477190InV;
import X.C477860Ioa;
import X.C478090Iox;
import X.C478110Ioz;
import X.C479490IrD;
import X.C483880IyI;
import X.C507440JvC;
import X.C511970K5z;
import X.InterfaceC483930IyN;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.SubPackageSummary;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomViewHolder;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment;
import com.bytedance.android.livesdk.game.bottombar.feed.GameLiveBottombarFlowFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHangoutLiveCardOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveHangoutPerformanceOptSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.hangout.component.distribute.view.MultiTopLiveDistributeAssem;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.MultiTopLivePlayFeedAssemV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class AsS34S0100000_7 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 1:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 3:
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 4:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 6:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 7:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case 8:
                LJJIIJ$6(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIJ$7(this, recyclerView, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIJ$8(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJJIIJ$9(this, recyclerView, i);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LJJIIJ$10(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 4:
            case 7:
            case 8:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 6:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
            case 14:
                LJJIIZI$7(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS34S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i) {
        if (i == 0) {
            C1EOY c1eoy = C1EOY.LIZ;
            C1EOY.LJIJJ = ((DrawerFeedLiveFragmentV2) asS34S0100000_7.l0).LLJILJILJ;
        }
    }

    public static final void LJJIIJ$1(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i) {
        if (i == 0) {
            C1EOY c1eoy = C1EOY.LIZ;
            String str = ((BaseDrawerFeedLiveFragment) asS34S0100000_7.l0).LLILLJJLI.LIZ;
            if (str == null) {
                str = "";
            }
            C1EOY.LJIJJ = str;
        }
    }

    public static final void LJJIIJ$10(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C0K2E) asS34S0100000_7.l0).LIZ(recyclerView);
        }
    }

    public static final void LJJIIJ$2(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i) {
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
        if (i == 1 && (subscriptionPrivilegeDetailFragment = ((C0K0O) asS34S0100000_7.l0).LLILZLL) != null) {
            subscriptionPrivilegeDetailFragment.cS(C507440JvC.LIZ(2).LIZIZ, C2097608Jq.LJ());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIJ$3(Y.AsS34S0100000_7 r7, androidx.recyclerview.widget.RecyclerView r8, int r9) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AsS34S0100000_7.LJJIIJ$3(Y.AsS34S0100000_7, androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public static final void LJJIIJ$4(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C471410IeB) asS34S0100000_7.l0).LIZ.LLJJJIL.onNext(C0J1R.LIZJ);
        } else {
            ((C471410IeB) asS34S0100000_7.l0).LIZ.LLJJJIL.onNext(C0J1R.LIZJ);
        }
    }

    public static final void LJJIIJ$5(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i) {
        if (i == 0 && ((C477190InV) asS34S0100000_7.l0).LLIZ != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_following_cover_slide");
            c474500IjALIZ.LJJII("live_merge", "enter_from_merge");
            c474500IjALIZ.LJJII("live_cover", "enter_method");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void LJJIIJ$6(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i) {
        LiveRoomViewHolder liveRoomViewHolder;
        C472450Ifr c472450Ifr = ((C477190InV) asS34S0100000_7.l0).LLIZ;
        if (c472450Ifr != null) {
            C472450Ifr.LLJI = i;
            int itemCount = c472450Ifr.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = null;
                if (recyclerView != null) {
                    viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(i2);
                }
                if ((viewHolderFindViewHolderForLayoutPosition instanceof LiveRoomViewHolder) && (liveRoomViewHolder = (LiveRoomViewHolder) viewHolderFindViewHolderForLayoutPosition) != null) {
                    if (i != 0) {
                        if (i == 1 || i == 2) {
                            liveRoomViewHolder.Ir();
                        }
                    } else {
                        liveRoomViewHolder.xs();
                    }
                }
            }
        }
    }

    public static final void LJJIIJ$7(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i) {
        int iFindLastVisibleItemPosition;
        LinearLayoutManager linearLayoutManager;
        if (i == 0) {
            RecyclerView.LayoutManager layoutManager = ((ViewOnAttachStateChangeListenerC20604515jv) asS34S0100000_7.l0).getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                iFindLastVisibleItemPosition = 0;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("action_type", "scroll");
            c2344009Gk.LJIIIIZZ("enter_from", "change_music_page");
            c2344009Gk.LIZJ(iFindLastVisibleItemPosition, "last_index");
            C20684815ws.LJIILLIIL("sug_prompt_words_action", c2344009Gk.LIZ);
        }
    }

    public static final void LJJIIJ$8(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i) {
        String str;
        String str2;
        Object obj;
        Object obj2;
        if (i == 1) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) asS34S0100000_7.l0;
            List<SubPackageSummary> listAQ2 = subscriptionPrivilegeDetailFragment.zS().AQ2();
            SubPackageSummary subPackageSummary = (SubPackageSummary) C13LP.LJJJLZIJ(0, listAQ2);
            String str3 = null;
            if (subPackageSummary != null) {
                str = subPackageSummary.id;
            } else {
                str = null;
            }
            boolean zLJFF = Intrinsics.LJFF(str, subscriptionPrivilegeDetailFragment.LLLFFI);
            SubPackageSummary subPackageSummary2 = (SubPackageSummary) C13LP.LJJJLZIJ(1, listAQ2);
            if (subPackageSummary2 != null) {
                str2 = subPackageSummary2.id;
            } else {
                str2 = null;
            }
            boolean zLJFF2 = Intrinsics.LJFF(str2, subscriptionPrivilegeDetailFragment.LLLFFI);
            SubPackageSummary subPackageSummary3 = (SubPackageSummary) C13LP.LJJJLZIJ(2, listAQ2);
            if (subPackageSummary3 != null) {
                str3 = subPackageSummary3.id;
            }
            boolean zLJFF3 = Intrinsics.LJFF(str3, subscriptionPrivilegeDetailFragment.LLLFFI);
            String str4 = "1";
            if (zLJFF) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            if (zLJFF2) {
                obj2 = "1";
            } else if (listAQ2.size() <= 1) {
                obj2 = "null";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            if (!zLJFF3) {
                if (listAQ2.size() <= 1) {
                    str4 = "null";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
            }
            C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_privilege_intro_slide");
            subscriptionPrivilegeDetailFragment.mS(c511970K5z);
            AbsPrivilegeDetailBaseFragment.SR(c511970K5z);
            c511970K5z.LIZIZ(obj, "is_first_price");
            c511970K5z.LIZIZ(obj2, "is_second_price");
            c511970K5z.LIZIZ(str4, "is_third_price");
            c511970K5z.LIZLLL();
        }
    }

    public static final void LJJIIJ$9(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i) {
        int i2 = ((C478090Iox) asS34S0100000_7.l0).LJIIIIZZ;
        if (i2 == i) {
            return;
        }
        ((C478090Iox) asS34S0100000_7.l0).LJIIIIZZ = i;
        if (i2 == 0) {
            if (i != 0) {
                ((C478090Iox) asS34S0100000_7.l0).LJFF(0L, true);
            }
        } else {
            if (i != 0) {
                return;
            }
            ((C478090Iox) asS34S0100000_7.l0).LJI();
        }
    }

    public static final void LJJIIZI$0(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i, int i2) {
        int iAbs = Math.abs(i);
        MultiTopLiveDistributeAssem multiTopLiveDistributeAssem = (MultiTopLiveDistributeAssem) asS34S0100000_7.l0;
        if (iAbs >= multiTopLiveDistributeAssem.LLJJJIL) {
            C477860Ioa.LJIIIIZZ("slide", multiTopLiveDistributeAssem.LLJJJ);
        }
    }

    public static final void LJJIIZI$1(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i, int i2) {
        if (i2 > 20) {
            DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = (DrawerFeedLiveFragmentV2) asS34S0100000_7.l0;
            drawerFeedLiveFragmentV2.OR(0, drawerFeedLiveFragmentV2.LLILLL);
        } else {
            if (i2 >= -20) {
                return;
            }
            DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV22 = (DrawerFeedLiveFragmentV2) asS34S0100000_7.l0;
            drawerFeedLiveFragmentV22.OR(1, drawerFeedLiveFragmentV22.LLILLL);
        }
    }

    public static final void LJJIIZI$2(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i, int i2) {
        BaseDrawerFeedLiveFragment baseDrawerFeedLiveFragment = (BaseDrawerFeedLiveFragment) asS34S0100000_7.l0;
        View view = baseDrawerFeedLiveFragment.LLJJIII;
        if (view == null) {
            return;
        }
        if (i2 > 20) {
            baseDrawerFeedLiveFragment.PR(0, view);
        } else {
            if (i2 >= -20) {
                return;
            }
            baseDrawerFeedLiveFragment.PR(1, view);
        }
    }

    public static final void LJJIIZI$3(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            int itemCount = linearLayoutManager.getItemCount();
            if (iFindLastCompletelyVisibleItemPosition == itemCount - 1 && itemCount > 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onScrolled: Reached end of list, triggering refresh. Position: ");
                sbLIZ.append(iFindLastCompletelyVisibleItemPosition);
                sbLIZ.append(", Total: ");
                sbLIZ.append(itemCount);
                sbLIZ.append(", avatarId=");
                sbLIZ.append(((GameLiveBottombarFlowFragment) asS34S0100000_7.l0).LLILZ.LIZLLL);
                C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ));
                GameLiveBottombarFlowFragment gameLiveBottombarFlowFragment = (GameLiveBottombarFlowFragment) asS34S0100000_7.l0;
                InterfaceC483930IyN interfaceC483930IyN = gameLiveBottombarFlowFragment.LL;
                if (interfaceC483930IyN != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loadMoreData: Loading more video data (pagination), avatarId=");
                    sbLIZ2.append(gameLiveBottombarFlowFragment.LLILZ.LIZLLL);
                    C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ2));
                    Context context = gameLiveBottombarFlowFragment.getContext();
                    if (context != null) {
                        C483880IyI c483880IyI = gameLiveBottombarFlowFragment.LLILZ;
                        interfaceC483930IyN.LJZI(context, c483880IyI.LIZJ, c483880IyI.LIZ, c483880IyI.LIZIZ, c483880IyI.LIZLLL, false, null);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("loadMoreData: Pagination data load request sent, avatarId=");
                        sbLIZ3.append(gameLiveBottombarFlowFragment.LLILZ.LIZLLL);
                        C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ3));
                        return;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("loadMoreData: Context is null, cannot load more data, avatarId=");
                    sbLIZ4.append(gameLiveBottombarFlowFragment.LLILZ.LIZLLL);
                    C20441214yg.LJIIL("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIIZI$4(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i, int i2) {
        ((MultiTopLivePlayFeedAssemV2) asS34S0100000_7.l0).kp(!recyclerView.canScrollVertically(-1));
        int iAbs = Math.abs(i2);
        MultiTopLivePlayFeedAssemV2 multiTopLivePlayFeedAssemV2 = (MultiTopLivePlayFeedAssemV2) asS34S0100000_7.l0;
        if (iAbs > multiTopLivePlayFeedAssemV2.LLJJL) {
            if (TiktokLiveHangoutPerformanceOptSetting.isPlayFeedScrollDedupOpt()) {
                if (!multiTopLivePlayFeedAssemV2.LLJZ) {
                    multiTopLivePlayFeedAssemV2.LLJZ = true;
                    C477860Ioa.LJIIIIZZ("slide", multiTopLivePlayFeedAssemV2.LLJLIL);
                }
            } else {
                C477860Ioa.LJIIIIZZ("slide", multiTopLivePlayFeedAssemV2.LLJLIL);
            }
        }
        if (!recyclerView.canScrollVertically(1) && !((MultiTopLivePlayFeedAssemV2) asS34S0100000_7.l0).Zo().LLLFF) {
            C20731516An c20731516An = ((MultiTopLivePlayFeedAssemV2) asS34S0100000_7.l0).LLLFFI;
            if (c20731516An != null) {
                c20731516An.LIZIZ(i2);
            }
            MultiTopLivePlayFeedAssemV2 multiTopLivePlayFeedAssemV22 = (MultiTopLivePlayFeedAssemV2) asS34S0100000_7.l0;
            multiTopLivePlayFeedAssemV22.getClass();
            if (i2 > 0 && !recyclerView.canScrollVertically(1) && multiTopLivePlayFeedAssemV22.Go().getState().LJIIIIZZ() != 0) {
                C479490IrD c479490IrD = (C479490IrD) multiTopLivePlayFeedAssemV22.ip().getState();
                if (c479490IrD.LLILZ && !c479490IrD.LLILZIL && !(c479490IrD.getListState().LL instanceof C1623706Xj) && !(c479490IrD.getListState().LLILLJJLI instanceof C1623706Xj) && !multiTopLivePlayFeedAssemV22.LLJ.LIZ && !multiTopLivePlayFeedAssemV22.LLJI.LIZ && !multiTopLivePlayFeedAssemV22.LLJIJIL.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PlayCardFeedAssemV2 autoLoadMore: trigger loadMore, itemCount=");
                    sbLIZ.append(multiTopLivePlayFeedAssemV22.Go().getState().LJIIIIZZ());
                    C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", C2188811AlT.LIZIZ(sbLIZ));
                    multiTopLivePlayFeedAssemV22.ip().manualListLoadMore(new C1263104wv());
                }
            }
        }
        MultiTopLivePlayFeedAssemV2 multiTopLivePlayFeedAssemV23 = (MultiTopLivePlayFeedAssemV2) asS34S0100000_7.l0;
        multiTopLivePlayFeedAssemV23.getClass();
        if (MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable()) {
            if (i2 < 0) {
                if (!MultiTopLivePlayFeedAssemV2.ep(recyclerView)) {
                    multiTopLivePlayFeedAssemV23.LLLII = true;
                    ((C16GX) multiTopLivePlayFeedAssemV23.LLJJIII.getValue()).LJ(false, false, true);
                    if (multiTopLivePlayFeedAssemV23.Go().isNestedScrollingEnabled()) {
                        multiTopLivePlayFeedAssemV23.Go().setNestedScrollingEnabled(false);
                        return;
                    }
                    return;
                }
                multiTopLivePlayFeedAssemV23.LLLII = false;
                if (multiTopLivePlayFeedAssemV23.Go().isNestedScrollingEnabled()) {
                    return;
                }
                multiTopLivePlayFeedAssemV23.Go().setNestedScrollingEnabled(true);
                return;
            }
            if (!multiTopLivePlayFeedAssemV23.Go().isNestedScrollingEnabled()) {
                multiTopLivePlayFeedAssemV23.Go().setNestedScrollingEnabled(true);
            }
            multiTopLivePlayFeedAssemV23.LLLII = false;
        }
    }

    public static final void LJJIIZI$5(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i, int i2) {
        if (i > 0 || i2 > 0) {
            ((C471410IeB) asS34S0100000_7.l0).LIZ.LLJJJIL.onNext(C0J1R.LIZJ);
        }
    }

    public static final void LJJIIZI$6(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i, int i2) {
        ((C478110Ioz) asS34S0100000_7.l0).LIZ(i);
    }

    public static final void LJJIIZI$7(AsS34S0100000_7 asS34S0100000_7, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager.getItemCount() <= linearLayoutManager.findLastVisibleItemPosition() + 5) {
            C0K31 c0k31 = (C0K31) asS34S0100000_7.l0;
            AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(391);
            AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(recyclerView, 588);
            if (!c0k31.LIZIZ) {
                C0K3N c0k3n = c0k31.LIZLLL;
                if (c0k3n != null && C0K51.LJFF(Boolean.valueOf(c0k3n.LJIIJJI()))) {
                    return;
                }
                c0k31.LIZIZ = true;
                C0K3N c0k3n2 = c0k31.LIZLLL;
                if (c0k3n2 == null) {
                    return;
                }
                c0k3n2.e4(new AwS408S0200000_7(aFwS193S0000000_7, c0k31, 81), new AwS373S0200000_7(awS586S0100000_7, c0k31, 98));
            }
        }
    }
}
