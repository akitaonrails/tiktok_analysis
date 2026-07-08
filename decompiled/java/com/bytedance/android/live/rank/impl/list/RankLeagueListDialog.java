package com.bytedance.android.live.rank.impl.list;

import X.AbstractC1809750xC9;
import X.AbstractC485930J3v;
import X.AbstractViewOnClickListenerC1105820esm;
import X.C036E;
import X.C0J1R;
import X.C0UO0;
import X.C1085110eLN;
import X.C1105620esS;
import X.C1117360fBO;
import X.C1117370fBP;
import X.C1119920fFW;
import X.C1133830fbx;
import X.C1143680frq;
import X.C1338270kvh;
import X.C16F5;
import X.C16FV;
import X.C1790730whT;
import X.C1790870whh;
import X.C1809970xCV;
import X.C1810070xCf;
import X.C1810080xCg;
import X.C1810110xCj;
import X.C1810120xCk;
import X.C1810210xCt;
import X.C1810220xCu;
import X.C1810330xD5;
import X.C1810340xD6;
import X.C1810410xDD;
import X.C1810540xDQ;
import X.C1810690xDf;
import X.C1810990xE9;
import X.C1811120xEM;
import X.C1811130xEN;
import X.C1811190xET;
import X.C1811310xEf;
import X.C19ME;
import X.C21556319Xt;
import X.C21594519fD;
import X.C346270Dhp;
import X.C465640INu;
import X.C475510Ikn;
import X.C480460Ism;
import X.C497740JfY;
import X.C748880TZe;
import X.C786410Ut5;
import X.EnumC1083240eIM;
import X.InterfaceC1810130xCl;
import X.InterfaceC1810230xCv;
import X.InterfaceC1810570xDT;
import X.InterfaceC1811800xFS;
import Y.ACListenerS161S0100000_27;
import Y.AObserverS229S0100000_27;
import Y.ARunnableS117S0100000_17;
import Y.AfS116S0300000_27;
import Y.AfS71S0400000_27;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.rank.impl.list.RankLeagueListDialog;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.ranklist.RankExtraInfo;

/* JADX INFO: loaded from: classes28.dex */
public final class RankLeagueListDialog extends RankListDialog implements InterfaceC1810570xDT {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2HELIOSslJD8/ZiklOjt9GiQiIgM2KSI5LAM6OzEIIC4/JyI=";
    public C16F5 LLLII;
    public C16F5 LLLIIII;
    public C16F5 LLLIIIIL;
    public C16F5 LLLIIIL;
    public C16F5 LLLIIL;
    public C16F5 LLLIILIL;
    public C16F5 LLLIL;
    public C16F5 LLLILZ;
    public C16F5 LLLILZJ;
    public double LLLILZLLLI;
    public double LLLIZZ;
    public double LLLJ;
    public C16F5 LLLJIL;
    public ImageView LLLJL;
    public LiveIconView LLLL;
    public C16F5 LLLLII;
    public C16F5 LLLLIIIILLL;
    public C16F5 LLLLIIL;
    public RecyclerView LLLLIILL;
    public C16FV LLLLIILLL;
    public C16FV LLLLIL;
    public C21556319Xt LLLLILI;
    public C21594519fD LLLLJ;
    public C1810330xD5 LLLLJI;
    public RecyclerView LLLLL;
    public C1117370fBP LLLLLIL;

    public final void wS() {
        FragmentManager fragmentManager;
        RankTabInfo rankTabInfo = new RankTabInfo();
        rankTabInfo.rankType = SR().LIZ().LLILZIL.type;
        rankTabInfo.LIZIZ = RankTypeV2.LJIJI.rankPhase;
        rankTabInfo.LIZ = C497740JfY.LJIJI(2131842389);
        List listSingletonList = Collections.singletonList(rankTabInfo);
        Iterator it2 = listSingletonList.iterator();
        while (it2.hasNext()) {
            if ((EnumC1083240eIM.RANK_DIALOG.getScene() & ((RankTabInfo) it2.next()).listLynxType) != 0) {
                C1105620esS.LIZ(getContext(), C475510Ikn.LJ(this), listSingletonList);
                return;
            }
        }
        long j = SR().LLILLL.LIZ;
        long j2 = SR().LLILLL.LIZIZ;
        boolean z = SR().LLILLL.LIZLLL;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIJI;
        C1810340xD6 c1810340xD6 = new C1810340xD6(j, j2, listSingletonList, z, rankTypeV2, rankTypeV2, SR().LLILLL.LJI);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (fragmentManager = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) == null) {
            return;
        }
        RankListDialog rankListDialogLIZ = C1810220xCu.LIZ(c1810340xD6, this, true, false, "room_entrance_click");
        if (rankListDialogLIZ != null) {
            rankListDialogLIZ.show(fragmentManager, "RankHistoryDialog");
        }
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        C1810410xDD c1810410xDD = this.LLJZ;
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        c1810690xDf.getClass();
        C1810690xDf.LJJI(c1810410xDD, null, dataChannelLJ2, "normal");
    }

    public RankLeagueListDialog() {
        int iLIZIZ = (int) C497740JfY.LIZIZ(375.0f);
        this.LLLILZLLLI = ((double) (iLIZIZ * 165.75f)) / 375.0d;
        this.LLLIZZ = ((double) (iLIZIZ * 179.75f)) / 375.0d;
        this.LLLJ = ((double) (iLIZIZ * 111.0f)) / 375.0d;
    }

    @Override // X.InterfaceC1810570xDT
    public final void LJLILLLLZI(String str) {
        C16F5 c16f5 = this.LLLLII;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
        C16F5 c16f52 = this.LLLLII;
        if (c16f52 != null) {
            c16f52.setText(str);
        }
    }

    @Override // X.InterfaceC1810570xDT
    public final void Pi(String str) {
        C16F5 c16f5 = this.LLLLIIIILLL;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
        C16F5 c16f52 = this.LLLLIIL;
        if (c16f52 != null) {
            C786410Ut5.LLJJJJ(c16f52, 8);
        }
        RecyclerView recyclerView = this.LLLLIILL;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 8);
        }
        C16F5 c16f53 = this.LLLLIIIILLL;
        if (c16f53 != null) {
            c16f53.setText(str);
        }
        C16F5 c16f54 = this.LLLLIIIILLL;
        if (c16f54 != null) {
            HandlerHook.viewPost(c16f54, new ARunnableS117S0100000_17(this, 42));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    @Override // X.InterfaceC1810570xDT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ty(X.C1810170xCp r12) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.RankLeagueListDialog.Ty(X.0xCp):void");
    }

    @Override // X.InterfaceC1810570xDT
    public final void c2(List<AbstractC1809750xC9> list) {
        if (list != null && !list.isEmpty()) {
            RecyclerView recyclerView = this.LLLLL;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 0);
            }
            C1117370fBP c1117370fBP = this.LLLLLIL;
            if (c1117370fBP != null) {
                c1117370fBP.LLLI(list);
            }
            C1117370fBP c1117370fBP2 = this.LLLLLIL;
            if (c1117370fBP2 != null) {
                c1117370fBP2.notifyDataSetChanged();
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.LLLLL;
        if (recyclerView2 == null) {
            return;
        }
        C786410Ut5.LLIZLLLIL(recyclerView2, 8);
    }

    @Override // com.bytedance.android.live.rank.impl.list.RankListDialog, X.InterfaceC1790880whi, X.InterfaceC1810570xDT
    public final void i(final C1790730whT c1790730whT) {
        if (TextUtils.isEmpty(c1790730whT.LIZIZ)) {
            LiveIconView liveIconView = this.LLLL;
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 8);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LLLL;
        if (liveIconView2 != null) {
            C786410Ut5.LLJJIJIL(liveIconView2, 0);
        }
        LiveIconView liveIconView3 = this.LLLL;
        if (liveIconView3 != null) {
            C786410Ut5.g8(liveIconView3, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xD8
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    this.LLILZIL.SR().LIZIZ(c1790730whT);
                    C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                    RankLeagueListDialog rankLeagueListDialog = this.LLILZIL;
                    C1810410xDD c1810410xDD = rankLeagueListDialog.LLJZ;
                    String str = c1810410xDD.LIZIZ.rankName;
                    DataChannel dataChannelLJ = C475510Ikn.LJ(rankLeagueListDialog);
                    c1810690xDf.getClass();
                    C1810690xDf.LJIILJJIL(c1810410xDD, null, dataChannelLJ, str);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1200L);
                }
            });
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.RankListDialog
    public final void initView(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        this.LLLII = (C16F5) view.findViewById(R.id.tv_tab_unselected_start);
        this.LLLIIII = (C16F5) view.findViewById(R.id.tv_tab_unselected_middle);
        this.LLLIIIIL = (C16F5) view.findViewById(R.id.tv_tab_unselected_end);
        this.LLLIIIL = (C16F5) view.findViewById(R.id.tv_tab_selected_start);
        this.LLLIIL = (C16F5) view.findViewById(R.id.tv_tab_selected_middle);
        this.LLLIILIL = (C16F5) view.findViewById(R.id.tv_tab_selected_end);
        this.LLLIL = (C16F5) view.findViewById(R.id.tv_tab_title_start);
        this.LLLILZ = (C16F5) view.findViewById(R.id.tv_tab_title_middle);
        this.LLLILZJ = (C16F5) view.findViewById(R.id.tv_tab_title_end);
        this.LLLLII = (C16F5) view.findViewById(R.id.tv_super_tab_title);
        this.LLLLIIIILLL = (C16F5) view.findViewById(R.id.tv_super_tab_subtitle);
        this.LLLLIIL = (C16F5) view.findViewById(R.id.zpt);
        this.LLLLIILL = (RecyclerView) view.findViewById(R.id.tvu);
        this.LLLJIL = (C16F5) view.findViewById(R.id.tv_rank_entrance);
        this.LLLJL = (ImageView) view.findViewById(R.id.lso);
        this.LLLL = (LiveIconView) view.findViewById(R.id.lgy);
        this.LLLLIILLL = (C16FV) view.findViewById(R.id.lwk);
        this.LLLLIL = (C16FV) view.findViewById(R.id.jwg);
        this.LLLLILI = (C21556319Xt) view.findViewById(R.id.wya);
        this.LLLLJ = (C21594519fD) view.findViewById(R.id.view_pager);
        this.LLLLL = (RecyclerView) view.findViewById(R.id.t0q);
        int iLIZIZ = C465640INu.LIZIZ(getContext());
        this.LLLILZLLLI = ((double) (iLIZIZ * 165.75f)) / 375.0d;
        this.LLLIZZ = ((double) (iLIZIZ * 179.75f)) / 375.0d;
        this.LLLJ = ((double) (iLIZIZ * 111.0f)) / 375.0d;
        C16F5 c16f5 = this.LLLII;
        ViewGroup.LayoutParams layoutParams6 = null;
        if (c16f5 != null) {
            layoutParams = c16f5.getLayoutParams();
        } else {
            layoutParams = null;
        }
        layoutParams.width = (int) this.LLLJ;
        C16F5 c16f52 = this.LLLII;
        if (c16f52 != null) {
            C786410Ut5.y6(c16f52, layoutParams);
        }
        C16F5 c16f53 = this.LLLIIII;
        if (c16f53 != null) {
            layoutParams2 = c16f53.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        layoutParams2.width = (int) this.LLLJ;
        C16F5 c16f54 = this.LLLIIII;
        if (c16f54 != null) {
            C786410Ut5.y6(c16f54, layoutParams2);
        }
        C16F5 c16f55 = this.LLLIIIIL;
        if (c16f55 != null) {
            layoutParams3 = c16f55.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        layoutParams3.width = (int) this.LLLJ;
        C16F5 c16f56 = this.LLLIIIIL;
        if (c16f56 != null) {
            C786410Ut5.y6(c16f56, layoutParams3);
        }
        C16F5 c16f57 = this.LLLIIIL;
        if (c16f57 != null) {
            layoutParams4 = c16f57.getLayoutParams();
        } else {
            layoutParams4 = null;
        }
        layoutParams4.width = (int) this.LLLILZLLLI;
        C16F5 c16f58 = this.LLLIIIL;
        if (c16f58 != null) {
            C786410Ut5.y6(c16f58, layoutParams4);
        }
        C16F5 c16f59 = this.LLLIIL;
        if (c16f59 != null) {
            layoutParams5 = c16f59.getLayoutParams();
        } else {
            layoutParams5 = null;
        }
        layoutParams5.width = (int) this.LLLIZZ;
        C16F5 c16f510 = this.LLLIIL;
        if (c16f510 != null) {
            C786410Ut5.y6(c16f510, layoutParams5);
        }
        C16F5 c16f511 = this.LLLIILIL;
        if (c16f511 != null) {
            layoutParams6 = c16f511.getLayoutParams();
        }
        layoutParams6.width = (int) this.LLLILZLLLI;
        C16F5 c16f512 = this.LLLIILIL;
        if (c16f512 != null) {
            C786410Ut5.y6(c16f512, layoutParams6);
        }
        C1143680frq.LIZLLL(this.LLLLIILLL, "tiktok_live_revenue_demand_1", "ttlive_bg_rank_league_super_tab.png");
        C1143680frq.LIZLLL(this.LLLLIL, "tiktok_live_revenue_demand_1", "ttlive_icon_rank_league_super_tab_front.png");
        RecyclerView recyclerView = this.LLLLIILL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        RecyclerView recyclerView2 = this.LLLLIILL;
        if (recyclerView2 != null) {
            C1117360fBO c1117360fBO = new C1117360fBO();
            c1117360fBO.LLLI(C1810990xE9.class, new AbstractC485930J3v<C1810990xE9, C1810540xDQ>() { // from class: X.0xCz
                {
                    Boolean bool = Boolean.FALSE;
                }

                @Override // X.AbstractC485930J3v, X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                    ImageModel avatarThumb;
                    int iIntValue;
                    Integer numLIZJ;
                    C1810540xDQ c1810540xDQ = (C1810540xDQ) viewHolder;
                    C1810990xE9 c1810990xE9 = (C1810990xE9) obj;
                    ImageView imageView = c1810540xDQ.LL;
                    User user = c1810990xE9.LIZ.rankUser;
                    if (user != null) {
                        avatarThumb = user.getAvatarThumb();
                    } else {
                        avatarThumb = null;
                    }
                    C1121670fIL.LJIILIIL(imageView, avatarThumb, c1810540xDQ.LL.getWidth(), c1810540xDQ.LL.getHeight(), R.drawable.eze);
                    GradientDrawable gradientDrawable = (GradientDrawable) c1810540xDQ.LLILLJJLI.getBackground();
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(1.0f);
                    long j = c1810990xE9.LIZ.rank;
                    if (j == 1) {
                        iIntValue = C497740JfY.LJFF(R.color.a__);
                    } else if (j == 2) {
                        iIntValue = C497740JfY.LJFF(R.color.a_a);
                    } else if (j == 3) {
                        iIntValue = C497740JfY.LJFF(R.color.a_b);
                    } else {
                        Context contextLJII = C497740JfY.LJII();
                        if (contextLJII != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, contextLJII)) != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                    }
                    gradientDrawable.setStroke(iLIZIZ2, iIntValue);
                }

                @Override // X.AbstractC485930J3v
                public final RecyclerView.ViewHolder LJIIIIZZ(View view2, ViewGroup viewGroup) {
                    return new C1810540xDQ(view2);
                }
            });
            recyclerView2.setAdapter(c1117360fBO);
        }
        RecyclerView recyclerView3 = this.LLLLIILL;
        if (recyclerView3 != null) {
            recyclerView3.setChildDrawingOrderCallback(new InterfaceC1811800xFS() { // from class: X.0xEL
                @Override // X.InterfaceC1811800xFS
                public final int LIZ(int i, int i2) {
                    return (i - i2) - 1;
                }
            });
        }
        RecyclerView recyclerView4 = this.LLLLIILL;
        if (recyclerView4 != null) {
            recyclerView4.addItemDecoration(new C346270Dhp(9));
        }
        RecyclerView recyclerView5 = this.LLLLL;
        if (recyclerView5 != null) {
            recyclerView5.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView6 = this.LLLLL;
        if (recyclerView6 != null) {
            C1117370fBP c1117370fBP = this.LLLLLIL;
            if (c1117370fBP == null) {
                c1117370fBP = new C1117370fBP();
                this.LLLLLIL = c1117370fBP;
                c1117370fBP.LLLFZ(C1810110xCj.class, new C1811190xET());
                c1117370fBP.LLLFZ(C1810120xCk.class, new C1811130xEN(new AwS571S0100000_27(this, 1305)));
                c1117370fBP.LLLFZ(C1809970xCV.class, new C1811120xEM(new AwS571S0100000_27(this, 1306)));
            }
            recyclerView6.setAdapter(c1117370fBP);
        }
    }

    @Override // X.InterfaceC1810570xDT
    public final void mk(final C1790870whh c1790870whh) {
        RankListV2Response.PathToOtherList pathToOtherList = c1790870whh.LIZIZ;
        if (pathToOtherList != null && pathToOtherList.existFlowPath && !TextUtils.isEmpty(pathToOtherList.schema)) {
            C16F5 c16f5 = this.LLLJIL;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 0);
            }
            ImageView imageView = this.LLLJL;
            if (imageView != null) {
                C786410Ut5.LJZI(0, imageView);
            }
            C16F5 c16f52 = this.LLLJIL;
            if (c16f52 != null) {
                c16f52.setText(C1133830fbx.LJIILIIL(c1790870whh.LIZIZ.description, "").toString());
            }
            C16F5 c16f53 = this.LLLJIL;
            if (c16f53 != null) {
                C786410Ut5.l8(c16f53, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xDB
                    @Override // X.AbstractViewOnClickListenerC1105820esm
                    public final void LIZ() {
                        this.LLILZIL.SR().LJII(this.LLILZIL.getContext(), c1790870whh);
                        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                        C1810410xDD c1810410xDD = c1790870whh.LIZ;
                        DataChannel dataChannel = this.LLILZIL.dataChannel;
                        c1810690xDf.getClass();
                        C1810690xDf.LJJIIZ(c1810410xDD, dataChannel, "champion_tournament_list", true, false);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1200L);
                    }
                });
            }
            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
            C1810410xDD c1810410xDD = c1790870whh.LIZ;
            DataChannel dataChannel = this.dataChannel;
            c1810690xDf.getClass();
            C1810690xDf.LJJIIZI(c1810410xDD, dataChannel, "champion_tournament_list", false);
            return;
        }
        C16F5 c16f54 = this.LLLJIL;
        if (c16f54 != null) {
            C786410Ut5.LLJJJJ(c16f54, 8);
        }
        ImageView imageView2 = this.LLLJL;
        if (imageView2 != null) {
            C786410Ut5.LJZI(8, imageView2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.0xCl, X.0xD1, java.lang.Object] */
    public final void yS(boolean z) {
        RankTypeV2 rankTypeV2;
        long j;
        final RankRootViewModel rankRootViewModelLIZ = SR().LIZ();
        final RankTypeV2 rankTypeV22 = WR().LJFF;
        long j2 = WR().LIZIZ;
        long j3 = WR().LIZ;
        final C1810070xCf c1810070xCf = new C1810070xCf(SR().LIZ().LLILZ, SR().LIZ().LLILZIL.type, SR().LIZ().LLILZIL.rankPhase, SR().LLILLL.LIZJ);
        final ?? r3 = new InterfaceC1810130xCl() { // from class: X.0xD1
            @Override // X.InterfaceC1810130xCl
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1810130xCl
            public final void LIZ(RankListV2Response.RankView rankView, long j4, boolean z2) {
                RankListV2Response.RankLeagueExtra rankLeagueExtra;
                RankListV2Response.RankLeagueHeader rankLeagueHeader;
                RankListV2Response.LeagueTabInfo leagueTabInfo;
                List<RankListV2Response.RankLeagueTab> list;
                Text text;
                Text text2;
                Text text3;
                Text text4;
                Text text5;
                Text text6;
                final RankLeagueListDialog rankLeagueListDialog = this.LIZ;
                rankLeagueListDialog.getClass();
                RankExtraInfo rankExtraInfo = rankView.rankExtraInfo;
                if (rankExtraInfo != null && (rankLeagueExtra = rankExtraInfo.rankLeagueExtra) != null && (rankLeagueHeader = rankLeagueExtra.rankLeagueHeader) != null && (leagueTabInfo = rankLeagueHeader.leagueTabInfo) != null && (list = leagueTabInfo.standardTab) != null) {
                    int i = 0;
                    for (RankListV2Response.RankLeagueTab rankLeagueTab : list) {
                        int i2 = i + 1;
                        Text text7 = null;
                        if (i >= 0) {
                            RankListV2Response.RankLeagueTab rankLeagueTab2 = rankLeagueTab;
                            if (i != 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        C16F5 c16f5 = rankLeagueListDialog.LLLILZJ;
                                        if (c16f5 != null) {
                                            if (rankLeagueTab2 != null) {
                                                text6 = rankLeagueTab2.titleText;
                                            } else {
                                                text6 = null;
                                            }
                                            c16f5.setText(C1133830fbx.LJIILIIL(text6, "Final").toString());
                                        }
                                        C16F5 c16f52 = rankLeagueListDialog.LLLIILIL;
                                        if (c16f52 != null) {
                                            if (rankLeagueTab2 != null) {
                                                text5 = rankLeagueTab2.briefDescription;
                                            } else {
                                                text5 = null;
                                            }
                                            c16f52.setText(C1133830fbx.LJIILIIL(text5, "10").toString());
                                        }
                                        C16F5 c16f53 = rankLeagueListDialog.LLLIIIIL;
                                        if (c16f53 != null) {
                                            if (rankLeagueTab2 != null) {
                                                text7 = rankLeagueTab2.briefDescription;
                                            }
                                            c16f53.setText(C1133830fbx.LJIILIIL(text7, "10").toString());
                                        }
                                    }
                                } else {
                                    C16F5 c16f54 = rankLeagueListDialog.LLLILZ;
                                    if (c16f54 != null) {
                                        if (rankLeagueTab2 != null) {
                                            text4 = rankLeagueTab2.titleText;
                                        } else {
                                            text4 = null;
                                        }
                                        c16f54.setText(C1133830fbx.LJIILIIL(text4, "Semi-Final").toString());
                                    }
                                    C16F5 c16f55 = rankLeagueListDialog.LLLIIL;
                                    if (c16f55 != null) {
                                        if (rankLeagueTab2 != null) {
                                            text3 = rankLeagueTab2.briefDescription;
                                        } else {
                                            text3 = null;
                                        }
                                        c16f55.setText(C1133830fbx.LJIILIIL(text3, "50").toString());
                                    }
                                    C16F5 c16f56 = rankLeagueListDialog.LLLIIII;
                                    if (c16f56 != null) {
                                        if (rankLeagueTab2 != null) {
                                            text7 = rankLeagueTab2.briefDescription;
                                        }
                                        c16f56.setText(C1133830fbx.LJIILIIL(text7, "50").toString());
                                    }
                                }
                            } else {
                                C16F5 c16f57 = rankLeagueListDialog.LLLIL;
                                if (c16f57 != null) {
                                    if (rankLeagueTab2 != null) {
                                        text2 = rankLeagueTab2.titleText;
                                    } else {
                                        text2 = null;
                                    }
                                    c16f57.setText(C1133830fbx.LJIILIIL(text2, "Preliminary").toString());
                                }
                                C16F5 c16f58 = rankLeagueListDialog.LLLIIIL;
                                if (c16f58 != null) {
                                    if (rankLeagueTab2 != null) {
                                        text = rankLeagueTab2.briefDescription;
                                    } else {
                                        text = null;
                                    }
                                    c16f58.setText(C1133830fbx.LJIILIIL(text, "100").toString());
                                }
                                C16F5 c16f59 = rankLeagueListDialog.LLLII;
                                if (c16f59 != null) {
                                    if (rankLeagueTab2 != null) {
                                        text7 = rankLeagueTab2.briefDescription;
                                    }
                                    c16f59.setText(C1133830fbx.LJIILIIL(text7, "100").toString());
                                }
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                C21556319Xt c21556319Xt = rankLeagueListDialog.LLLLILI;
                if (c21556319Xt != null) {
                    c21556319Xt.LIZIZ(new InterfaceC21556819Xy() { // from class: X.0xD0
                        @Override // X.InterfaceC21556819Xy
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC21556819Xy
                        public final void LIZJ(C21556219Xs c21556219Xs) {
                        }

                        @Override // X.InterfaceC21556819Xy
                        public final void LIZIZ(C21556219Xs c21556219Xs) {
                            Integer numValueOf;
                            if (c21556219Xs != null) {
                                numValueOf = Integer.valueOf(c21556219Xs.LIZLLL);
                            } else {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                if (numValueOf.intValue() == 0) {
                                    RankLeagueListDialog rankLeagueListDialog2 = rankLeagueListDialog;
                                    C16F5 c16f510 = rankLeagueListDialog2.LLLII;
                                    if (c16f510 != null) {
                                        C786410Ut5.LLJJJJ(c16f510, 8);
                                    }
                                    C16F5 c16f511 = rankLeagueListDialog2.LLLIIIIL;
                                    if (c16f511 != null) {
                                        C786410Ut5.LLJJJJ(c16f511, 0);
                                    }
                                    C16F5 c16f512 = rankLeagueListDialog2.LLLIIII;
                                    if (c16f512 != null) {
                                        C786410Ut5.LLJJJJ(c16f512, 0);
                                    }
                                    C16F5 c16f513 = rankLeagueListDialog2.LLLIIII;
                                    if (c16f513 != null) {
                                        ViewGroup.LayoutParams layoutParams = c16f513.getLayoutParams();
                                        if (layoutParams != null) {
                                            C19ME c19me = (C19ME) layoutParams;
                                            C16F5 c16f514 = rankLeagueListDialog2.LLLIIIIL;
                                            if (c16f514 != null) {
                                                c19me.endToStart = c16f514.getId();
                                                c19me.startToEnd = -1;
                                            }
                                            c19me.setMarginEnd((int) C497740JfY.LIZIZ(2.0f));
                                            C786410Ut5.W5(c16f513, c19me);
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                        }
                                    }
                                    C16F5 c16f515 = rankLeagueListDialog2.LLLIIIL;
                                    if (c16f515 != null) {
                                        C786410Ut5.LLJJJJ(c16f515, 0);
                                    }
                                    C16F5 c16f516 = rankLeagueListDialog2.LLLIIL;
                                    if (c16f516 != null) {
                                        C786410Ut5.LLJJJJ(c16f516, 8);
                                    }
                                    C16F5 c16f517 = rankLeagueListDialog2.LLLIILIL;
                                    if (c16f517 != null) {
                                        C786410Ut5.LLJJJJ(c16f517, 8);
                                    }
                                    C1119920fFW.LJFF(rankLeagueListDialog2.LLLIL, 6, OppoPermissionPopupMaskDelayExp.DEFAULT);
                                    C1119920fFW.LJFF(rankLeagueListDialog2.LLLILZ, 9, 500);
                                    C1119920fFW.LJFF(rankLeagueListDialog2.LLLILZJ, 9, 500);
                                    RankLeagueListDialog.sS(rankLeagueListDialog2.LLLILZ, rankLeagueListDialog2.LLLIIII);
                                    RankLeagueListDialog.sS(rankLeagueListDialog2.LLLILZJ, rankLeagueListDialog2.LLLIIIIL);
                                    RankLeagueListDialog.uS(rankLeagueListDialog2.LLLIL, rankLeagueListDialog2.LLLIIIL);
                                    return;
                                }
                                if (numValueOf.intValue() == 1) {
                                    RankLeagueListDialog rankLeagueListDialog3 = rankLeagueListDialog;
                                    C16F5 c16f518 = rankLeagueListDialog3.LLLII;
                                    if (c16f518 != null) {
                                        C786410Ut5.LLJJJJ(c16f518, 0);
                                    }
                                    C16F5 c16f519 = rankLeagueListDialog3.LLLIIII;
                                    if (c16f519 != null) {
                                        C786410Ut5.LLJJJJ(c16f519, 8);
                                    }
                                    C16F5 c16f520 = rankLeagueListDialog3.LLLIIIIL;
                                    if (c16f520 != null) {
                                        C786410Ut5.LLJJJJ(c16f520, 0);
                                    }
                                    C16F5 c16f521 = rankLeagueListDialog3.LLLIIIL;
                                    if (c16f521 != null) {
                                        C786410Ut5.LLJJJJ(c16f521, 8);
                                    }
                                    C16F5 c16f522 = rankLeagueListDialog3.LLLIIL;
                                    if (c16f522 != null) {
                                        C786410Ut5.LLJJJJ(c16f522, 0);
                                    }
                                    C16F5 c16f523 = rankLeagueListDialog3.LLLIILIL;
                                    if (c16f523 != null) {
                                        C786410Ut5.LLJJJJ(c16f523, 8);
                                    }
                                    C1119920fFW.LJFF(rankLeagueListDialog3.LLLIL, 9, 500);
                                    C1119920fFW.LJFF(rankLeagueListDialog3.LLLILZ, 6, OppoPermissionPopupMaskDelayExp.DEFAULT);
                                    C1119920fFW.LJFF(rankLeagueListDialog3.LLLILZJ, 9, 500);
                                    RankLeagueListDialog.sS(rankLeagueListDialog3.LLLIL, rankLeagueListDialog3.LLLII);
                                    RankLeagueListDialog.sS(rankLeagueListDialog3.LLLILZJ, rankLeagueListDialog3.LLLIIIIL);
                                    RankLeagueListDialog.uS(rankLeagueListDialog3.LLLILZ, rankLeagueListDialog3.LLLIIL);
                                    return;
                                }
                                if (numValueOf.intValue() != 2) {
                                    return;
                                }
                                RankLeagueListDialog rankLeagueListDialog4 = rankLeagueListDialog;
                                C16F5 c16f524 = rankLeagueListDialog4.LLLII;
                                if (c16f524 != null) {
                                    C786410Ut5.LLJJJJ(c16f524, 0);
                                }
                                C16F5 c16f525 = rankLeagueListDialog4.LLLIIII;
                                if (c16f525 != null) {
                                    C786410Ut5.LLJJJJ(c16f525, 0);
                                }
                                C16F5 c16f526 = rankLeagueListDialog4.LLLIIII;
                                if (c16f526 != null) {
                                    ViewGroup.LayoutParams layoutParams2 = c16f526.getLayoutParams();
                                    if (layoutParams2 != null) {
                                        C19ME c19me2 = (C19ME) layoutParams2;
                                        C16F5 c16f527 = rankLeagueListDialog4.LLLII;
                                        if (c16f527 != null) {
                                            c19me2.startToEnd = c16f527.getId();
                                            c19me2.endToStart = -1;
                                        }
                                        c19me2.setMarginStart((int) C497740JfY.LIZIZ(2.0f));
                                        C786410Ut5.W5(c16f526, c19me2);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                    }
                                }
                                C16F5 c16f528 = rankLeagueListDialog4.LLLIIIIL;
                                if (c16f528 != null) {
                                    C786410Ut5.LLJJJJ(c16f528, 8);
                                }
                                C16F5 c16f529 = rankLeagueListDialog4.LLLIIIL;
                                if (c16f529 != null) {
                                    C786410Ut5.LLJJJJ(c16f529, 8);
                                }
                                C16F5 c16f530 = rankLeagueListDialog4.LLLIIL;
                                if (c16f530 != null) {
                                    C786410Ut5.LLJJJJ(c16f530, 8);
                                }
                                C16F5 c16f531 = rankLeagueListDialog4.LLLIILIL;
                                if (c16f531 != null) {
                                    C786410Ut5.LLJJJJ(c16f531, 0);
                                }
                                RankLeagueListDialog.sS(rankLeagueListDialog4.LLLIL, rankLeagueListDialog4.LLLII);
                                RankLeagueListDialog.sS(rankLeagueListDialog4.LLLILZ, rankLeagueListDialog4.LLLIIII);
                                RankLeagueListDialog.uS(rankLeagueListDialog4.LLLILZJ, rankLeagueListDialog4.LLLIILIL);
                            }
                        }
                    });
                }
                C21594519fD c21594519fD = rankLeagueListDialog.LLLLJ;
                if (c21594519fD != null) {
                    c21594519fD.removeOnPageChangeListener(rankLeagueListDialog.LLLFFI);
                }
                C21594519fD c21594519fD2 = rankLeagueListDialog.LLLLJ;
                if (c21594519fD2 != null) {
                    c21594519fD2.setOffscreenPageLimit(2);
                }
                List<RankTabInfo> list2 = rankLeagueListDialog.SR().LIZ().LL;
                if (list2 != null) {
                    C21556319Xt c21556319Xt2 = rankLeagueListDialog.LLLLILI;
                    if (c21556319Xt2 != null) {
                        c21556319Xt2.setCustomTabViewResId(R.layout.h42);
                        c21556319Xt2.LLILLL.setPadding(0, 0, 0, 0);
                        c21556319Xt2.setAutoFillWhenScrollable(true);
                    }
                    try {
                        C21594519fD c21594519fD3 = rankLeagueListDialog.LLLLJ;
                        if (c21594519fD3 != null) {
                            C1810330xD5 c1810330xD5 = new C1810330xD5(rankLeagueListDialog.getChildFragmentManager());
                            rankLeagueListDialog.LLLLJI = c1810330xD5;
                            c21594519fD3.setAdapter(c1810330xD5);
                        }
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C21556319Xt c21556319Xt3 = rankLeagueListDialog.LLLLILI;
                    if (c21556319Xt3 != null) {
                        c21556319Xt3.setupWithViewPager(rankLeagueListDialog.LLLLJ);
                    }
                    C1810330xD5 c1810330xD52 = rankLeagueListDialog.LLLLJI;
                    if (c1810330xD52 != null) {
                        c1810330xD52.LJJIJLIJ(rankLeagueListDialog.NR(list2), list2);
                    }
                    C21594519fD c21594519fD4 = rankLeagueListDialog.LLLLJ;
                    if (c21594519fD4 != null) {
                        c21594519fD4.setCurrentItem(rankLeagueListDialog.SR().LIZ().LLIZLLLIL);
                    }
                    C21594519fD c21594519fD5 = rankLeagueListDialog.LLLLJ;
                    if (c21594519fD5 != null) {
                        c21594519fD5.addOnPageChangeListener(rankLeagueListDialog.LLLFFI);
                    }
                }
                C16F5 c16f510 = rankLeagueListDialog.LLLII;
                if (c16f510 != null) {
                    C786410Ut5.l8(c16f510, new ACListenerS161S0100000_27(rankLeagueListDialog, 169));
                }
                C16F5 c16f511 = rankLeagueListDialog.LLLIIII;
                if (c16f511 != null) {
                    C786410Ut5.l8(c16f511, new ACListenerS161S0100000_27(rankLeagueListDialog, 170));
                }
                C16F5 c16f512 = rankLeagueListDialog.LLLIIIIL;
                if (c16f512 != null) {
                    C786410Ut5.l8(c16f512, new ACListenerS161S0100000_27(rankLeagueListDialog, 171));
                }
            }
        };
        C1810080xCg c1810080xCg = this.LLJLLIL;
        rankRootViewModelLIZ.getClass();
        if (C497740JfY.LJII() != null) {
            try {
                if (C036E.LIZ.LIZIZ()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C1810110xCj(rankRootViewModelLIZ.vQ2(rankRootViewModelLIZ.LLJ)));
                    rankRootViewModelLIZ.LLJILJILJ.postValue(arrayList);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C1810120xCk(rankRootViewModelLIZ.vQ2(rankRootViewModelLIZ.LLJ)));
            rankRootViewModelLIZ.LLJILJILJ.postValue(arrayList2);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C1810110xCj(rankRootViewModelLIZ.vQ2(rankRootViewModelLIZ.LLJ)));
        rankRootViewModelLIZ.LLJILJILJ.postValue(arrayList3);
        String strLIZ = C1085110eLN.LIZ(rankTypeV22.type, rankTypeV22.rankPhase, rankRootViewModelLIZ.LLILZLL);
        if (strLIZ != null) {
            rankRootViewModelLIZ.xQ2(strLIZ, rankTypeV22, r3, c1810070xCf, true);
            return;
        }
        if (!isAdded()) {
            return;
        }
        C1811310xEf.LIZIZ();
        if (c1810080xCg != null) {
            rankTypeV2 = c1810080xCg.LIZLLL;
        } else {
            rankTypeV2 = null;
        }
        if (Intrinsics.LJFF(rankTypeV2, rankTypeV22)) {
            InterfaceC1810230xCv interfaceC1810230xCv = new InterfaceC1810230xCv() { // from class: X.0xCa
                @Override // X.InterfaceC1810230xCv
                public final void LIZ(Throwable th) {
                    if (this.isAdded()) {
                        RankRootViewModel rankRootViewModel = rankRootViewModelLIZ;
                        RankTypeV2 rankTypeV23 = rankTypeV22;
                        int i = rankTypeV23.type;
                        int i2 = rankTypeV23.rankPhase;
                        C1810070xCf c1810070xCf2 = c1810070xCf;
                        rankRootViewModel.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(new C1809970xCV(rankRootViewModel.vQ2(rankRootViewModel.LLJ)));
                        rankRootViewModel.LLJILJILJ.postValue(arrayList4);
                        C1810210xCt.LJI(th, i, i2, c1810070xCf2.LIZ, c1810070xCf2.LIZIZ, c1810070xCf2.LIZJ, c1810070xCf2.LIZLLL);
                    }
                }

                @Override // X.InterfaceC1810230xCv
                public final void LIZIZ(String str) {
                    if (this.isAdded()) {
                        rankRootViewModelLIZ.xQ2(str, rankTypeV22, r3, c1810070xCf, false);
                    }
                }
            };
            String str = c1810080xCg.LIZ;
            if (str == null) {
                if (c1810080xCg.LIZIZ == null) {
                    c1810080xCg.LIZJ = interfaceC1810230xCv;
                }
            } else {
                interfaceC1810230xCv.LIZIZ(str);
            }
            Throwable th = c1810080xCg.LIZIZ;
            if (th != null) {
                interfaceC1810230xCv.LIZ(th);
            }
        }
        if (!z) {
            return;
        }
        C1810210xCt.LIZLLL(rankTypeV22.type, rankTypeV22.rankPhase);
        C480460Ism.LIZ().getClass();
        RankApi rankApi = (RankApi) C480460Ism.LIZLLL(RankApi.class);
        String strValueOf = String.valueOf(rankTypeV22.type);
        if (rankRootViewModelLIZ.LLILZLL) {
            j = -1;
        } else {
            j = 0;
        }
        rankApi.getRankListV2(j3, j2, strValueOf, 1, j, true, rankTypeV22.rankPhase).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(this)).LJJLL(new AfS71S0400000_27(rankRootViewModelLIZ, rankTypeV22, r3, c1810070xCf, 2), new AfS116S0300000_27(rankRootViewModelLIZ, rankTypeV22, c1810070xCf, 2));
    }

    public static void sS(C16F5 c16f5, C16F5 c16f52) {
        C1119920fFW.LJFF(c16f5, 9, 500);
        if (c16f5 != null) {
            c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.c9i, c16f5.getContext()));
            C786410Ut5.k5(c16f5, 0.8f);
            ViewGroup.LayoutParams layoutParams = c16f5.getLayoutParams();
            if (layoutParams != null) {
                C19ME c19me = (C19ME) layoutParams;
                if (c16f52 != null) {
                    c19me.topToTop = c16f52.getId();
                    c19me.bottomToBottom = c16f52.getId();
                    c19me.startToStart = c16f52.getId();
                    c19me.endToEnd = c16f52.getId();
                }
                C786410Ut5.W5(c16f5, c19me);
                CharSequence text = c16f5.getText();
                if (text != null) {
                    text.toString();
                }
                Map<String, Object> map = C1338270kvh.LIZ;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public static void uS(C16F5 c16f5, C16F5 c16f52) {
        C1119920fFW.LJFF(c16f5, 6, OppoPermissionPopupMaskDelayExp.DEFAULT);
        if (c16f5 != null) {
            c16f5.setTextSize(14.0f);
            c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.c9n, c16f5.getContext()));
            C786410Ut5.k5(c16f5, 1.0f);
            ViewGroup.LayoutParams layoutParams = c16f5.getLayoutParams();
            if (layoutParams != null) {
                C19ME c19me = (C19ME) layoutParams;
                if (c16f52 != null) {
                    c19me.topToTop = c16f52.getId();
                    c19me.bottomToBottom = c16f52.getId();
                    c19me.startToStart = c16f52.getId();
                    c19me.endToEnd = c16f52.getId();
                }
                C786410Ut5.W5(c16f5, c19me);
                CharSequence text = c16f5.getText();
                if (text != null) {
                    text.toString();
                }
                Map<String, Object> map = C1338270kvh.LIZ;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.RankListDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RankRootController rankRootControllerSR = SR();
        rankRootControllerSR.LJFF().LLJILJILJ.observe(rankRootControllerSR.LLILLJJLI, new AObserverS229S0100000_27(this, 54));
        rankRootControllerSR.LJFF().LLJILLL.observe(rankRootControllerSR.LLILLJJLI, new AObserverS229S0100000_27(this, 55));
        rankRootControllerSR.LJFF().LLJJ.observe(rankRootControllerSR.LLILLJJLI, new AObserverS229S0100000_27(this, 56));
        rankRootControllerSR.LJFF().LLJJI.observe(rankRootControllerSR.LLILLJJLI, new AObserverS229S0100000_27(this, 57));
        rankRootControllerSR.LJFF().LLJJIII.observe(rankRootControllerSR.LLILLJJLI, new AObserverS229S0100000_27(this, 58));
        rankRootControllerSR.LJFF().LLJJIJI.observe(rankRootControllerSR.LLILLJJLI, new AObserverS229S0100000_27(this, 59));
        yS(false);
    }
}
