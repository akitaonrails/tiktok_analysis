package com.bytedance.android.live.rank.impl.list;

import X.AbstractViewOnClickListenerC1105820esm;
import X.C015G;
import X.C098200Yq;
import X.C0IF2;
import X.C0K04;
import X.C0TZM;
import X.C0U56;
import X.C1085120eLO;
import X.C1096820eeG;
import X.C1105900esu;
import X.C1132290fZT;
import X.C1133830fbx;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1300480jwk;
import X.C1300510jwn;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1602160rnK;
import X.C168B;
import X.C168C;
import X.C1697810uHb;
import X.C16F5;
import X.C16FV;
import X.C1790730whT;
import X.C1790870whh;
import X.C1809720xC6;
import X.C1810080xCg;
import X.C1810210xCt;
import X.C1810220xCu;
import X.C1810330xD5;
import X.C1810340xD6;
import X.C1810410xDD;
import X.C1810510xDN;
import X.C1810660xDc;
import X.C1810690xDf;
import X.C1810700xDg;
import X.C1819620xS4;
import X.C1864880yd4;
import X.C1864970ydD;
import X.C189200o6;
import X.C19MB;
import X.C1CC2;
import X.C1EOY;
import X.C20441214yg;
import X.C2097608Jq;
import X.C21538419Qw;
import X.C21556319Xt;
import X.C21594519fD;
import X.C2188811AlT;
import X.C235000vU;
import X.C465640INu;
import X.C465900IOu;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500950Jkj;
import X.C500980Jkm;
import X.C760380TsC;
import X.C784440Upu;
import X.C786410Ut5;
import X.CountDownTimerC1811820xFU;
import X.EnumC1083240eIM;
import X.EnumC1133850fbz;
import X.EnumC1811400xEo;
import X.InterfaceC1118490fDD;
import X.InterfaceC177000m8;
import X.InterfaceC1790880whi;
import X.InterfaceC21556819Xy;
import Y.AObserverS229S0100000_27;
import Y.AfS196S0100000_27;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseLongArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkInviteSuccessEvent;
import com.bytedance.android.live.rank.impl.list.RankListDialog;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.fragment.RankSparkFragment;
import com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorLeagueMatchCampaignRankingSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveFriendRankingSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdk.rank.api.CloseCreatorRankingEvent;
import com.bytedance.android.livesdk.rank.api.RankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.CloseRankDialogEvent;
import com.bytedance.android.livesdk.rank.impl.OpenRankDialogEvent;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: loaded from: classes28.dex */
public class RankListDialog extends LiveDialogFragment implements InterfaceC1790880whi {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOyHELIOS49I2slJD8/ZiklOjt9GiQiIgM6OzEIIC4/JyI=";
    public ConstraintLayout LL;
    public C16FV LLILLJJLI;
    public C21594519fD LLILLL;
    public C21556319Xt LLILZ;
    public C16F5 LLILZIL;
    public C1324720kZq LLILZLL;
    public C21538419Qw LLIZ;
    public View LLIZLLLIL;
    public C16F5 LLJ;
    public C1324720kZq LLJI;
    public LiveIconView LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public C1324720kZq LLJILJILJ;
    public C1324720kZq LLJILLL;
    public C16F5 LLJJ;
    public C1324720kZq LLJJI;
    public ViewStub LLJJIII;
    public ConstraintLayout LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public C16F5 LLJJJ;
    public C16F5 LLJJJIL;
    public C16F5 LLJJJJ;
    public C16F5 LLJJJJJIL;
    public C1096820eeG LLJJJJLIIL;
    public C1324720kZq LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public C1810340xD6 LLJLILLLLZIIL;
    public RankRootController LLJLL;
    public C1810080xCg LLJLLIL;
    public C1810330xD5 LLJLLL;
    public int LLJZIJLIL;
    public C1790870whh LLL;
    public boolean LLLF;
    public LifecycleOwner LLLFF;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLJL = true;
    public C1810410xDD LLJZ = C1810410xDD.LJI;
    public final C1864880yd4 LLLFFI = new C1864880yd4(this, 1);

    static {
        new C1810220xCu();
    }

    public void i(C1790730whT c1790730whT) {
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final ConstraintLayout OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bnu) : null;
            this.LL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C21538419Qw PR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.byd) : null;
            this.LLIZ = (C21538419Qw) viewFindViewById;
        }
        return (C21538419Qw) viewFindViewById;
    }

    public final C16FV RR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cnb) : null;
            this.LLILLJJLI = (C16FV) viewFindViewById;
        }
        return (C16FV) viewFindViewById;
    }

    public final RankRootController SR() {
        RankRootController rankRootController = this.LLJLL;
        if (rankRootController != null) {
            return rankRootController;
        }
        return null;
    }

    public final View UR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ftb) : null;
            this.LLIZLLLIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final LiveIconView VR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ilq) : null;
            this.LLJIJIL = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final C1810340xD6 WR() {
        C1810340xD6 c1810340xD6 = this.LLJLILLLLZIIL;
        if (c1810340xD6 != null) {
            return c1810340xD6;
        }
        return null;
    }

    public final C16F5 ZR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vct) : null;
            this.LLILZIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C21556319Xt aS() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wya) : null;
            this.LLILZ = (C21556319Xt) viewFindViewById;
        }
        return (C21556319Xt) viewFindViewById;
    }

    public final C21594519fD cS() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.view_pager) : null;
            this.LLILLL = (C21594519fD) viewFindViewById;
        }
        return (C21594519fD) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        DataChannel dataChannel = this.dataChannel;
        this.LLJLIL = C500260Jjc.LJJIJIL(dataChannel != null ? (Boolean) dataChannel.gg0(C0TZM.class) : null);
        C500980Jkm c500980Jkm = new C500980Jkm((WR().LJFF.style != RankTypeV2.LJIILLIIL.style || this.LLJJLIIIJLLLLLLLZ) ? R.layout.g_t : R.layout.g_u);
        c500980Jkm.LIZJ = this.LLJLIL ? R.style.ahb : C497740JfY.LJJ() ? R.style.ahf : R.style.ahg;
        c500980Jkm.LJII = this.LLJLIL ? 80 : C497740JfY.LJJ() ? 3 : 5;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJIIIZ = this.LLJLIL ? -1 : C497740JfY.LJIIIZ(R.dimen.arw);
        int iLIZ = C760380TsC.LIZ(this, this.LLJLIL);
        int iLIZ2 = (int) (C465640INu.LIZ(getContext()) * 0.8f);
        if (iLIZ > iLIZ2) {
            iLIZ = iLIZ2;
        }
        c500980Jkm.LJIIJ = iLIZ;
        return c500980Jkm;
    }

    public final C1324720kZq dS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.weekly_rank_icon) : null;
            this.LLILZLL = (C1324720kZq) viewFindViewById;
        }
        return (C1324720kZq) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC1118490fDD genLandscapeDialogProxy() {
        int i = WR().LJFF.style;
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        return new C500950Jkj((i != RankTypeV2.LJIILLIIL.style || this.LLJJLIIIJLLLLLLLZ) ? R.layout.g_t : R.layout.g_u);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iS() {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.RankListDialog.iS():void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        WeakReference<Runnable> weakReference;
        Runnable runnable;
        super.onDestroy();
        if (this.LLJJLIIIJLLLLLLLZ && (weakReference = C1809720xC6.LIZ) != null && (runnable = weakReference.get()) != null) {
            runnable.run();
        }
        if (!this.LLJJLIIIJLLLLLLLZ) {
            C1809720xC6.LIZ = null;
        }
        RankTypeV2 rankTypeV2 = RankTypeV2.LJJIJIIJI;
        EnumC1811400xEo enumC1811400xEo = SR().LIZ().LLILZ;
        RankTypeV2 rankTypeV22 = SR().LIZ().LLILZIL;
        SR().LIZ();
        C1810660xDc c1810660xDc = new C1810660xDc(rankTypeV2, enumC1811400xEo, rankTypeV22);
        List<RankTabInfo> list = SR().LIZ().LL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Pair<Integer, Integer> pair : C1810210xCt.LJIIIIZZ.keySet()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            RankTypeV2 rankTypeV23 = RankTypeV2.LIZ;
            C0K04.LJFF("current_entity_rank_type", C235000vU.LIZ(pair.getFirst().intValue(), pair.getSecond().intValue()).rankName, jSONObject);
            C0K04.LJFF("current_entrance_rank_type", c1810660xDc.LIZIZ.rankName, jSONObject);
            C0K04.LIZLLL(c1810660xDc.LIZ.getType(), "group_type", jSONObject);
            C1810210xCt.LIZ(jSONObject3, pair.getFirst().intValue(), pair.getSecond().intValue(), list);
            Integer num = C1810210xCt.LJIIIIZZ.get(pair);
            C0K04.LIZLLL(num != null ? num.intValue() : -1, "current_entity_status", jSONObject);
            HashMap<Pair<Integer, Integer>, Long> map = C1810210xCt.LJ;
            Long l = map.get(pair);
            C0K04.LJ("event_duration", jCurrentTimeMillis - (l != null ? l.longValue() : 0L), jSONObject2);
            Long l2 = map.get(pair);
            C0K04.LJ("event_duration", jCurrentTimeMillis - (l2 != null ? l2.longValue() : 0L), jSONObject3);
            HashMap<Pair<Integer, Integer>, Long> map2 = C1810210xCt.LIZIZ;
            Long l3 = map2.get(pair);
            C0K04.LJ("event_duration_all", jCurrentTimeMillis - (l3 != null ? l3.longValue() : 0L), jSONObject2);
            Long l4 = map2.get(pair);
            C0K04.LJ("event_duration_all", jCurrentTimeMillis - (l4 != null ? l4.longValue() : 0L), jSONObject3);
            C0K04.LJII("extra", jSONObject4, jSONObject3);
            C1CC2.LJ("ttlive_ranklist_entity_exit", jSONObject, jSONObject2, jSONObject4);
        }
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        RankTypeV2 rankTypeV24 = SR().LIZ().LLJ;
        EnumC1811400xEo enumC1811400xEo2 = SR().LIZ().LLILZ;
        boolean z = SR().LIZ().LLILZLL;
        c1810690xDf.getClass();
        try {
            SparseLongArray sparseLongArray = C1810700xDg.LIZ;
            long jLIZIZ = C1810700xDg.LIZIZ(rankTypeV24.type, z);
            Pair[] pairArr = new Pair[7];
            pairArr[0] = new Pair("rank_type", Integer.valueOf(rankTypeV24.type));
            String str = C1810210xCt.LJIIIZ;
            str.toString();
            pairArr[1] = new Pair("request_source", str);
            pairArr[2] = new Pair("rank_period", C1810690xDf.LJJJI(Boolean.valueOf(z)));
            pairArr[3] = new Pair("is_history_rank", Boolean.valueOf(z));
            pairArr[4] = new Pair("is_anchor_on_rank", Boolean.valueOf(jLIZIZ > 0));
            pairArr[5] = new Pair("rank_str", String.valueOf(jLIZIZ));
            pairArr[6] = new Pair("group_type", Integer.valueOf(enumC1811400xEo2.getType()));
            C015G.LIZIZ(C2097608Jq.LJIIJ(pairArr), "live_rank_list_close", null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1810210xCt.LJIIIIZZ();
        SparseLongArray sparseLongArray2 = C1810700xDg.LIZ;
    }

    public final void qS() {
        ConstraintLayout constraintLayout = this.LLJILJIL;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = C497740JfY.LJIIIZ(R.dimen.awo);
            C786410Ut5.W5(constraintLayout, marginLayoutParams);
        }
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setMaxLines(2);
            ViewGroup.LayoutParams layoutParams2 = c16f5.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.height = C497740JfY.LJIIIZ(R.dimen.awr);
            C786410Ut5.W5(c16f5, marginLayoutParams2);
        }
        C1324720kZq c1324720kZq = this.LLJILLL;
        if (c1324720kZq != null) {
            ViewGroup.LayoutParams layoutParams3 = c1324720kZq.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.height = C497740JfY.LJIIIZ(R.dimen.awr);
            C786410Ut5.W5(c1324720kZq, marginLayoutParams3);
        }
    }

    public final void MR() {
        LiveIconView liveIconViewVR = VR();
        if (liveIconViewVR != null) {
            C786410Ut5.LLJJIJIL(liveIconViewVR, 8);
        }
        ConstraintLayout constraintLayoutOR = OR();
        if (constraintLayoutOR == null) {
            return;
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayoutOR);
        c19mb.LJI(R.id.wya, 7);
        c19mb.LJIIIIZZ(R.id.wya, 7, 0, 7);
        c19mb.LIZIZ(constraintLayoutOR);
    }

    public final void mS() {
        C21538419Qw c21538419QwPR = PR();
        if (c21538419QwPR != null) {
            if (LiveCreatorLeagueMatchCampaignRankingSetting.INSTANCE.getValue().creatorRankingPageFirstTabStyleAdaptionOpt) {
                c21538419QwPR.setForeground(null);
                c21538419QwPR.setGradientColors(null);
            } else {
                int visibility = c21538419QwPR.getVisibility();
                c21538419QwPR.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c21538419QwPR);
            }
        }
    }

    @Override // X.InterfaceC1790880whi
    public final Window n7() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog.getWindow();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RankRootController rankRootControllerSR = SR();
        if (rankRootControllerSR != null) {
            CountDownTimerC1811820xFU countDownTimerC1811820xFU = rankRootControllerSR.LLILZLL;
            if (countDownTimerC1811820xFU != null) {
                countDownTimerC1811820xFU.cancel();
            }
            CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = rankRootControllerSR.LLILZLL;
            if (countDownTimerC1811820xFU2 != null) {
                countDownTimerC1811820xFU2.LIZ = null;
            }
            rankRootControllerSR.LLILZLL = null;
        }
        LiveIconView liveIconViewVR = VR();
        if (liveIconViewVR != null) {
            C786410Ut5.g8(liveIconViewVR, null);
        }
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("rank_list_show");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.stop();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(RankListDialogVisibilityChannel.class, Boolean.TRUE);
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(RankListDialogVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC1790880whi
    public final C1810080xCg Gc() {
        return this.LLJLLIL;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C0U56 getPanelType() {
        return C0U56.PANEL_HOURLY;
    }

    @Override // X.InterfaceC1790880whi
    public final DataChannel nK() {
        return this.dataChannel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.android.live.rank.impl.list.fragment.RankSparkFragment] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    public final List<Fragment> NR(List<RankTabInfo> list) {
        ?? rankPageFragment;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (RankTabInfo rankTabInfo : list) {
            int i2 = i + 1;
            if (i >= 0) {
                RankTabInfo rankTabInfo2 = rankTabInfo;
                if ((EnumC1083240eIM.RANK_PAGE.getScene() & rankTabInfo2.listLynxType) != 0) {
                    RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                    RankTypeV2 rankTypeV2LIZ = C235000vU.LIZ(rankTabInfo2.rankType, rankTabInfo2.LIZIZ);
                    rankPageFragment = new RankSparkFragment();
                    rankPageFragment.LLILLJJLI = rankTypeV2LIZ;
                } else {
                    RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
                    RankTypeV2 rankTypeV2LIZ2 = C235000vU.LIZ(rankTabInfo2.rankType, rankTabInfo2.LIZIZ);
                    EnumC1811400xEo enumC1811400xEo = WR().LJI;
                    RankRootController rankRootControllerSR = SR();
                    C1810510xDN c1810510xDN = new C1810510xDN(this);
                    rankPageFragment = new RankPageFragment();
                    rankPageFragment.LLILZIL = rankTypeV2LIZ2;
                    rankPageFragment.LLILZLL = enumC1811400xEo;
                    rankPageFragment.LLJI = c1810510xDN;
                    rankPageFragment.LLJ = rankRootControllerSR;
                    rankPageFragment.LLIZ = null;
                }
                arrayList.add(rankPageFragment);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    @Override // X.InterfaceC1790880whi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void YE(long r7) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.RankListDialog.YE(long):void");
    }

    public final String bS(long j) {
        if (j < 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(j);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return String.valueOf(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gS(final X.C1790870whh r15) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.RankListDialog.gS(X.0whh):void");
    }

    public void initView(View view) {
        boolean z;
        float fLIZIZ;
        int i;
        float fLIZIZ2;
        if (!this.LLJL) {
            C786410Ut5.LLJJJJJIL(RR(), 0);
            C786410Ut5.m8(RR(), new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xDW
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    this.LLILZIL.dismiss();
                }

                {
                    super(1200L);
                }
            });
            q0.LJIJ(RR(), new C1864970ydD(this, 0));
        } else {
            C786410Ut5.LLJJJJJIL(RR(), 8);
        }
        try {
            C21594519fD c21594519fDCS = cS();
            C1810330xD5 c1810330xD5 = new C1810330xD5(getChildFragmentManager());
            this.LLJLLL = c1810330xD5;
            c21594519fDCS.setAdapter(c1810330xD5);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        aS().LIZIZ(new InterfaceC21556819Xy() { // from class: X.0xD9
            @Override // X.InterfaceC21556819Xy
            public final void LIZ() {
            }

            @Override // X.InterfaceC21556819Xy
            public final void LIZIZ(C21556219Xs c21556219Xs) {
                View view2;
                AppCompatTextView appCompatTextView;
                if (c21556219Xs != null && (view2 = c21556219Xs.LJ) != null && (appCompatTextView = (AppCompatTextView) view2.findViewById(android.R.id.text1)) != null) {
                    appCompatTextView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, appCompatTextView.getContext()));
                    CharSequence text = appCompatTextView.getText();
                    if (text != null) {
                        text.toString();
                    }
                    Map<String, Object> map = C1338270kvh.LIZ;
                }
            }

            @Override // X.InterfaceC21556819Xy
            public final void LIZJ(C21556219Xs c21556219Xs) {
                AppCompatTextView appCompatTextView;
                C1324720kZq c1324720kZq;
                View view2 = c21556219Xs.LJ;
                if (view2 != null && (c1324720kZq = (C1324720kZq) view2.findViewById(R.id.jxe)) != null) {
                    C786410Ut5.LLJJIII(c1324720kZq, 8);
                }
                View view3 = c21556219Xs.LJ;
                if (view3 != null && (appCompatTextView = (AppCompatTextView) view3.findViewById(android.R.id.text1)) != null) {
                    appCompatTextView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezt, appCompatTextView.getContext()));
                    CharSequence text = appCompatTextView.getText();
                    if (text != null) {
                        text.toString();
                    }
                    Map<String, Object> map = C1338270kvh.LIZ;
                }
            }
        });
        cS().removeOnPageChangeListener(this.LLLFFI);
        List<RankTabInfo> list = SR().LLILLL.LIZJ;
        if (list != null) {
            if (SR().LIZ().LLILZ == EnumC1811400xEo.GIFT_RANK && LiveFriendRankingSetting.INSTANCE.getEnableFriendRanking() && !this.LLJJLIIIJLLLLLLLZ) {
                z = true;
                ConstraintLayout constraintLayoutOR = OR();
                if (constraintLayoutOR != null) {
                    if (constraintLayoutOR.findViewById(R.id.ilq) != null) {
                        LiveIconView liveIconViewVR = VR();
                        if (liveIconViewVR != null) {
                            C786410Ut5.LLJJIJIL(liveIconViewVR, 0);
                        }
                        C19MB c19mb = new C19MB();
                        c19mb.LJII(constraintLayoutOR);
                        c19mb.LJI(R.id.wya, 7);
                        c19mb.LJIIIIZZ(R.id.wya, 7, R.id.ilq, 6);
                        c19mb.LIZIZ(constraintLayoutOR);
                    } else {
                        MR();
                    }
                }
            } else {
                z = false;
                MR();
            }
            LiveIconView liveIconViewVR2 = VR();
            if (liveIconViewVR2 != null) {
                if (!z) {
                    C786410Ut5.LLJJIJIL(liveIconViewVR2, 8);
                    C786410Ut5.g8(liveIconViewVR2, null);
                } else {
                    C786410Ut5.LLJJIJIL(liveIconViewVR2, 0);
                    C786410Ut5.g8(liveIconViewVR2, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xCy
                        @Override // X.AbstractViewOnClickListenerC1105820esm
                        public final void LIZ() {
                            RankPageController rankPageController;
                            RankListViewModel rankListViewModelLJIIIZ;
                            C1810410xDD c1810410xDD;
                            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                            RankListDialog rankListDialog = this.LLILZIL;
                            DataChannel dataChannel = rankListDialog.dataChannel;
                            RankRootController rankRootControllerSR = rankListDialog.SR();
                            C1810410xDD c1810410xDD2 = this.LLILZIL.LLJZ;
                            RankTypeV2 rankTypeV2 = rankRootControllerSR.LJFF().LLJ;
                            Object obj = ((HashMap) rankRootControllerSR.LL).get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                            if ((obj instanceof RankPageController) && (rankPageController = (RankPageController) obj) != null && (rankListViewModelLJIIIZ = rankPageController.LJIIIZ()) != null && (c1810410xDD = rankListViewModelLJIIIZ.LL) != null) {
                                c1810410xDD2 = c1810410xDD;
                            }
                            c1810690xDf.getClass();
                            SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                            long jLIZIZ = C1810700xDg.LIZIZ(c1810410xDD2.LIZIZ.type, false);
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_friends_ranking_icon_click");
                            c474500IjALIZ.LJIJJLI(dataChannel);
                            C1810690xDf.LIZ(c474500IjALIZ, dataChannel);
                            c474500IjALIZ.LJJII(C1810690xDf.LJJJJIZL(dataChannel != null ? Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel)) : null), "user_type");
                            c474500IjALIZ.LJJII((1 > jLIZIZ || jLIZIZ >= 100) ? CardStruct.IStatusCode.DEFAULT : "1", "anchor_rank");
                            c474500IjALIZ.LJJII(Long.valueOf(jLIZIZ), "anchor_rank_index");
                            c474500IjALIZ.LJJII(c1810410xDD2.LIZIZ.rankName, "rank_type");
                            c474500IjALIZ.LIZ();
                            RankListDialog rankListDialog2 = this.LLILZIL;
                            DataChannel dataChannel2 = rankListDialog2.dataChannel;
                            if (dataChannel2 != null) {
                                int type = EnumC1811400xEo.FRIEND_RANKING.getType();
                                int i2 = RankTypeV2.LJJIIZ.type;
                                dataChannel2.LC0(OpenRankDialogEvent.class, new C1811010xEB(type, "rank_friend_icon", i2, i2));
                            }
                            rankListDialog2.dismiss();
                        }

                        {
                            super(1200L);
                        }
                    });
                }
            }
            if (list.size() == 1) {
                C786410Ut5.LLJJJJ(ZR(), 0);
                C21556319Xt c21556319XtAS = aS();
                int visibility = c21556319XtAS.getVisibility();
                c21556319XtAS.setVisibility(4);
                C1602160rnK.LIZIZ(visibility, 4, c21556319XtAS);
                ZR().setText(C1133830fbx.LJIILIIL(((RankTabInfo) ListProtector.get(list, 0)).title, ((RankTabInfo) ListProtector.get(list, 0)).LIZ).toString());
                mS();
                C786410Ut5.LLJJIII(dS(), 8);
                C21538419Qw c21538419QwPR = PR();
                int visibility2 = c21538419QwPR.getVisibility();
                c21538419QwPR.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c21538419QwPR);
            } else {
                mS();
                C786410Ut5.LLJJIII(dS(), 8);
                int size = list.size();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aS().getLayoutParams();
                if (size > 2) {
                    marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(16.0f));
                    if (z) {
                        fLIZIZ2 = C497740JfY.LIZIZ(8.0f);
                    } else {
                        fLIZIZ2 = C497740JfY.LIZIZ(16.0f);
                    }
                    marginLayoutParams.setMarginEnd((int) fLIZIZ2);
                } else {
                    marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(24.0f));
                    if (z) {
                        fLIZIZ = C497740JfY.LIZIZ(8.0f);
                    } else {
                        fLIZIZ = C497740JfY.LIZIZ(24.0f);
                    }
                    marginLayoutParams.setMarginEnd((int) fLIZIZ);
                }
                C21556319Xt c21556319XtAS2 = aS();
                if (size <= 2 && !z) {
                    if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).o4()) {
                        C21556319Xt c21556319XtAS3 = aS();
                        if (c21556319XtAS3 != null) {
                            c21556319XtAS3.setTabMaxWidth(0);
                        }
                        aS().setTabViewLayoutWeight(Float.valueOf(1.0f));
                    }
                    i = 1;
                } else {
                    i = 0;
                }
                c21556319XtAS2.setTabMode(i);
                C786410Ut5.LLJJJJ(ZR(), 4);
                C21556319Xt c21556319XtAS4 = aS();
                int visibility3 = c21556319XtAS4.getVisibility();
                c21556319XtAS4.setVisibility(0);
                C1602160rnK.LIZIZ(visibility3, 0, c21556319XtAS4);
                c21556319XtAS4.setCustomTabViewResId(R.layout.h43);
                c21556319XtAS4.LLILLL.setPadding(0, 0, 0, 0);
                c21556319XtAS4.setAutoFillWhenScrollable(!z);
                aS().setupWithViewPager(cS());
            }
            C1810330xD5 c1810330xD52 = this.LLJLLL;
            if (c1810330xD52 != null) {
                c1810330xD52.LJJIJLIJ(NR(list), list);
            }
            cS().setCurrentItem(SR().LIZ().LLIZLLLIL);
            cS().addOnPageChangeListener(this.LLLFFI);
        }
    }

    public final void oS(C1790870whh c1790870whh) {
        RankListV2Response.ClassActivityBannerExtra classActivityBannerExtra;
        ImageModel imageModel;
        if (c1790870whh != null && (classActivityBannerExtra = c1790870whh.LIZJ) != null && (imageModel = classActivityBannerExtra.backgroundImage) != null) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLJIIIZ.LJJI(this.LLJILJILJ);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (this.LLJLILLLLZIIL != null) {
            C20441214yg.LJ("RankListDialog", "onAttach: has mParams");
            return;
        }
        throw new IllegalArgumentException("RankListDialog not initial mParams");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        User owner;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C1132290fZT.class, UserService.getInstance().user().LJIJJLI());
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            Room room = (Room) dataChannel2.gg0(RoomChannel.class);
            if (room != null) {
                owner = room.getOwner();
            } else {
                owner = null;
            }
            dataChannel2.SX0(C168B.class, owner);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("source", "live_room", bundle2);
            dataChannel3.SX0(C168C.class, bundle2);
        }
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        C1810210xCt.LJIIJ = this.dataChannel;
        C1EOY c1eoy = C1EOY.LIZ;
        C1300510jwn c1300510jwn = new C1300510jwn(WR().LJFF.type, "");
        C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ("rank_list_show");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LJIIJJI = c1300510jwn;
            c1300480jwkLIZIZ.LIZJ(null);
        }
        RankRootController rankRootController = new RankRootController(this, WR());
        getLifecycle().addObserver(rankRootController);
        rankRootController.LJFF().LLILLJJLI = this.LLJLIL;
        rankRootController.LJFF().LLILZLL = this.LLJJLIIIJLLLLLLLZ;
        rankRootController.LJFF().LLIZ = this.LLLFF;
        this.LLJLL = rankRootController;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.BQ2(this, CloseRankDialogEvent.class, new AwS606S0100000_27(this, 55));
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, CloseCreatorRankingEvent.class, new AwS606S0100000_27(this, 56));
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.BQ2(this, LinkInviteSuccessEvent.class, new AwS606S0100000_27(this, 57));
        }
        C784440Upu.LIZ().LIZJ(this, C1085120eLO.class).LIZJ(new AfS196S0100000_27(this, 9));
        C784440Upu.LIZ().LIZJ(this, C0IF2.class).LIZJ(new AfS196S0100000_27(this, 10));
        C784440Upu.LIZ().LIZJ(this, C465900IOu.class).LIZJ(new AfS196S0100000_27(this, 11));
    }

    @Override // X.InterfaceC1790880whi
    public final void qj(final C1790870whh c1790870whh) {
        String str;
        Text text;
        RankListV2Response.ClassActivityBannerExtra classActivityBannerExtra = c1790870whh.LIZJ;
        if (classActivityBannerExtra != null && classActivityBannerExtra.activityBannerType > 0) {
            gS(c1790870whh);
            return;
        }
        if (c1790870whh.LIZIZ != null) {
            ConstraintLayout constraintLayout = this.LLJILJIL;
            if (constraintLayout != null) {
                C786410Ut5.LL(8, constraintLayout);
            }
            RankListV2Response.PathToOtherList pathToOtherList = c1790870whh.LIZIZ;
            if (pathToOtherList != null && pathToOtherList.existFlowPath) {
                View viewFindViewById = null;
                if (pathToOtherList != null) {
                    str = pathToOtherList.schema;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C786410Ut5.LJLLLLLL(0, UR());
                    rS(true, false, false);
                    View viewFindViewById2 = this.LLJ;
                    if (viewFindViewById2 == null) {
                        View view = getView();
                        if (view != null) {
                            viewFindViewById2 = view.findViewById(R.id.zie);
                        } else {
                            viewFindViewById2 = null;
                        }
                        this.LLJ = (C16F5) viewFindViewById2;
                    }
                    TextView textView = (TextView) viewFindViewById2;
                    RankListV2Response.PathToOtherList pathToOtherList2 = c1790870whh.LIZIZ;
                    if (pathToOtherList2 != null) {
                        text = pathToOtherList2.description;
                    } else {
                        text = null;
                    }
                    textView.setText(C1133830fbx.LJIILIIL(text, "").toString());
                    View view2 = this.LLJI;
                    if (view2 == null) {
                        View view3 = getView();
                        if (view3 != null) {
                            viewFindViewById = view3.findViewById(R.id.les);
                        }
                        this.LLJI = (C1324720kZq) viewFindViewById;
                        view2 = viewFindViewById;
                    }
                    C1143680frq.LIZLLL(view2, "tiktok_live_revenue_demand_1", "ttlive_bg_dialog_rank_entrance_to_league.png");
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xDC
                        @Override // X.AbstractViewOnClickListenerC1105820esm
                        public final void LIZ() {
                            this.LLILZIL.SR().LJII(this.LLILZIL.getContext(), c1790870whh);
                            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                            C1810410xDD c1810410xDD = c1790870whh.LIZ;
                            DataChannel dataChannel = this.LLILZIL.dataChannel;
                            c1810690xDf.getClass();
                            C1810690xDf.LJJIIZ(c1810410xDD, dataChannel, "daily_rank_list", true, false);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1200L);
                        }
                    }, UR());
                    C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                    C1810410xDD c1810410xDD = c1790870whh.LIZ;
                    DataChannel dataChannel = this.dataChannel;
                    c1810690xDf.getClass();
                    C1810690xDf.LJJIIZI(c1810410xDD, dataChannel, "daily_rank_list", false);
                    return;
                }
            }
            C786410Ut5.LJLLLLLL(8, UR());
            rS(false, false, false);
            return;
        }
        ConstraintLayout constraintLayout2 = this.LLJILJIL;
        if (constraintLayout2 != null) {
            C786410Ut5.LL(8, constraintLayout2);
        }
        C786410Ut5.LJLLLLLL(8, UR());
        rS(false, false, false);
    }

    public static void kS(C16F5 c16f5, Text text) {
        List<TextPiece> list;
        TextPieceImage textPieceImage;
        ImageModel imageModel;
        if (c16f5 != null) {
            c16f5.setText(C1133830fbx.LJIILIIL(text, ""));
        }
        if (LiveCreatorLeagueMatchCampaignRankingSetting.INSTANCE.getValue().creatorRankingPageBannerIconLoadingOpt && text != null && (list = text.pieces) != null) {
            for (TextPiece textPiece : list) {
                if (textPiece.type == EnumC1133850fbz.IMAGE.getPieceType() && (textPieceImage = textPiece.imageValue) != null && (imageModel = textPieceImage.imageModel) != null) {
                    boolean z = C1105900esu.LIZIZ;
                    final AwS428S0200000_27 awS428S0200000_27 = new AwS428S0200000_27(c16f5, text, 3);
                    ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).xW1(imageModel, new InterfaceC177000m8() { // from class: X.0xDa
                        @Override // X.InterfaceC177000m8
                        public final void LIZ(Bitmap bitmap) {
                            if (bitmap != null) {
                                awS428S0200000_27.invoke();
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hS(X.C1790870whh r6, boolean r7) {
        /*
            r5 = this;
            r3 = 1
            r2 = 0
            r4 = 0
            if (r7 == 0) goto L5e
            if (r6 == 0) goto L5d
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$ClassActivityBannerExtra r0 = r6.LIZJ
            if (r0 == 0) goto L60
            com.bytedance.android.live.base.model.ImageModel r0 = r0.rtlRightImage
            if (r0 == 0) goto L5e
            if (r6 == 0) goto L5d
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$ClassActivityBannerExtra r0 = r6.LIZJ
            if (r0 == 0) goto L5d
            com.bytedance.android.live.base.model.ImageModel r3 = r0.rtlRightImage
            if (r3 == 0) goto L5d
            java.lang.String r0 = r3.getUri()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5d
            java.lang.String r1 = r3.getUri()
            X.0whh r0 = r5.LLL
            if (r0 == 0) goto L37
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$ClassActivityBannerExtra r0 = r0.LIZJ
            if (r0 == 0) goto L37
            com.bytedance.android.live.base.model.ImageModel r0 = r0.rtlRightImage
            if (r0 == 0) goto L37
            java.lang.String r4 = r0.getUri()
        L37:
            boolean r0 = android.text.TextUtils.equals(r1, r4)
            if (r0 != 0) goto L5d
            boolean r0 = r5.LLLF
            if (r0 == 0) goto L4c
            X.0kZq r1 = r5.LLJILLL
            if (r1 == 0) goto L4a
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.Yb(r1, r0)
        L4a:
            r5.LLLF = r2
        L4c:
            X.0JBN r0 = X.C1819620xS4.LIZ()
            X.0kZf r1 = r0.LJIIIZ(r3)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r1.LJIJJ = r0
            X.0kZq r0 = r5.LLJILLL
            r1.LJJI(r0)
        L5d:
            return
        L5e:
            if (r6 == 0) goto L5d
        L60:
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$ClassActivityBannerExtra r0 = r6.LIZJ
            if (r0 == 0) goto L5d
            com.bytedance.android.live.base.model.ImageModel r2 = r0.rightImage
            if (r2 == 0) goto L5d
            java.lang.String r0 = r2.getUri()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5d
            java.lang.String r1 = r2.getUri()
            X.0whh r0 = r5.LLL
            if (r0 == 0) goto L86
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$ClassActivityBannerExtra r0 = r0.LIZJ
            if (r0 == 0) goto L86
            com.bytedance.android.live.base.model.ImageModel r0 = r0.rightImage
            if (r0 == 0) goto L86
            java.lang.String r4 = r0.getUri()
        L86:
            boolean r0 = android.text.TextUtils.equals(r1, r4)
            if (r0 != 0) goto L5d
            if (r7 == 0) goto L9d
            boolean r0 = r5.LLLF
            if (r0 != 0) goto L9d
            X.0kZq r1 = r5.LLJILLL
            if (r1 == 0) goto L9b
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.C786410Ut5.Yb(r1, r0)
        L9b:
            r5.LLLF = r3
        L9d:
            X.0JBN r0 = X.C1819620xS4.LIZ()
            X.0kZf r1 = r0.LJIIIZ(r2)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r1.LJIJJ = r0
            X.0kZq r0 = r5.LLJILLL
            r1.LJJI(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.RankListDialog.hS(X.0whh, boolean):void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            OR().setBackgroundResource(R.drawable.dxg);
        } else if (this.LLJLIL) {
            OR().setBackgroundResource(R.drawable.dp8);
        } else if (C497740JfY.LJJ()) {
            OR().setBackgroundResource(R.drawable.dp7);
        } else {
            OR().setBackgroundResource(R.drawable.dp6);
        }
        this.LLJILJIL = (ConstraintLayout) view.findViewById(R.id.f704fta);
        this.LLJILJILJ = (C1324720kZq) view.findViewById(R.id.lep);
        this.LLJILLL = (C1324720kZq) view.findViewById(R.id.leq);
        this.LLJJ = (C16F5) view.findViewById(R.id.ler);
        this.LLJJI = (C1324720kZq) view.findViewById(R.id.leo);
        this.LLJJIII = (ViewStub) view.findViewById(R.id.d_t);
        initView(view);
        RankRootController rankRootControllerSR = SR();
        rankRootControllerSR.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated(");
        sbLIZ.append(this);
        sbLIZ.append(')');
        C20441214yg.LIZIZ("RankRootController", C2188811AlT.LIZIZ(sbLIZ));
        rankRootControllerSR.LLILZ = this;
        rankRootControllerSR.LJFF().LLJILJIL.observe(rankRootControllerSR.LLILLJJLI, new AObserverS229S0100000_27(rankRootControllerSR, 52));
        rankRootControllerSR.LJFF().LLJJIII.observe(rankRootControllerSR.LLILLJJLI, new AObserverS229S0100000_27(rankRootControllerSR, 53));
    }

    public final void nS(C1324720kZq c1324720kZq, C1790870whh c1790870whh, boolean z) {
        RankListV2Response.ClassActivityBannerExtra classActivityBannerExtra;
        ImageModel imageModel;
        RankListV2Response.ClassActivityBannerExtra classActivityBannerExtra2;
        ImageModel imageModel2;
        if (c1790870whh != null && (classActivityBannerExtra = c1790870whh.LIZJ) != null && (imageModel = classActivityBannerExtra.arrowImage) != null) {
            String uri = null;
            if (!TextUtils.isEmpty(imageModel.getUri())) {
                String uri2 = imageModel.getUri();
                C1790870whh c1790870whh2 = this.LLL;
                if (c1790870whh2 != null && (classActivityBannerExtra2 = c1790870whh2.LIZJ) != null && (imageModel2 = classActivityBannerExtra2.arrowImage) != null) {
                    uri = imageModel2.getUri();
                }
                if (!TextUtils.equals(uri2, uri)) {
                    if (z && c1324720kZq != null) {
                        C786410Ut5.Yb(c1324720kZq, -1.0f);
                    }
                    C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                    c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_CENTER;
                    c1324610kZfLJIIIZ.LJJI(c1324720kZq);
                }
            }
        }
    }

    public final void rS(boolean z, boolean z2, boolean z3) {
        int iLJIIIZ;
        if (z) {
            if (z2) {
                if (!z3) {
                    iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.awq);
                } else {
                    iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.awr);
                }
            } else {
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.aml);
            }
        } else {
            iLJIIIZ = 0;
        }
        if (this.LLJZIJLIL == iLJIIIZ) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) PR().getLayoutParams()).topMargin = iLJIIIZ;
        ((ViewGroup.MarginLayoutParams) dS().getLayoutParams()).topMargin = iLJIIIZ;
        ((ViewGroup.MarginLayoutParams) ZR().getLayoutParams()).topMargin = iLJIIIZ;
        ((ViewGroup.MarginLayoutParams) aS().getLayoutParams()).topMargin = iLJIIIZ;
        this.LLJZIJLIL = iLJIIIZ;
    }
}
