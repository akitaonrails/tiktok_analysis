package com.bytedance.android.live.rank.impl.sticker.team;

import X.C0IJT;
import X.C1119060fE8;
import X.C1119110fED;
import X.C1119410fEh;
import X.C1119430fEj;
import X.C1143680frq;
import X.C1161920gLG;
import X.C16F5;
import X.C16FV;
import X.C1846800y9u;
import X.C20736316Cj;
import X.C21411818qq;
import X.C444940Hca;
import X.C465640INu;
import X.C474500IjA;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import X.InterfaceC1094280eaA;
import X.InterfaceC1846850y9z;
import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeConfig;
import com.bytedance.android.livesdk.livesetting.rank.TeamRankStickerSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS507S0200000_17;
import wh6.AbS698S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class TeamRankStickerDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/HELIOSZjY4ICw4LTdiPSoyJWsYLC4+GiQiIhwnISYnLD0XISQgJig=";
    public final int LL;
    public final String LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public LiveIconView LLILZIL;
    public LiveIconView LLILZLL;
    public C16FV LLIZ;
    public C16F5 LLIZLLLIL;
    public C21411818qq LLJ;
    public C16F5 LLJI;
    public C16F5 LLJIJIL;
    public C16F5 LLJILJIL;
    public C1119060fE8 LLJILJILJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public TeamRankStickerDialog() {
        this(Integer.MIN_VALUE, "rank_page");
    }

    public final C16F5 MR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.exo) : null;
            this.LLJILJIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C16F5 NR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.view_detail_text) : null;
            this.LLJIJIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gcd);
        c500980Jkm.LIZJ = R.style.ahb;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJIIIZ = -1;
        int i = this.LL;
        if (i <= 0) {
            int iLIZIZ = C465640INu.LIZIZ(getContext()) * 622;
            int iLIZ = (int) (C465640INu.LIZ(getContext()) * 0.8f);
            if (375 <= iLIZ) {
                iLIZ = 375;
            }
            i = iLIZIZ / iLIZ;
        }
        c500980Jkm.LJIIJ = i;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
    }

    public TeamRankStickerDialog(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLJILJILJ = new C1119060fE8();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        InterfaceC1846850y9z interfaceC1846850y9z;
        C1119430fEj c1119430fEj;
        int i3;
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        View viewFindViewById = this.LLILZIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bmy);
            } else {
                viewFindViewById = null;
            }
            this.LLILZIL = (LiveIconView) viewFindViewById;
        }
        C786410Ut5.g8((LiveIconView) viewFindViewById, new ACListenerS152S0100000_17(this, 217));
        View viewFindViewById3 = this.LLILZLL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.hof);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZLL = (LiveIconView) viewFindViewById3;
        }
        C786410Ut5.I7(new AbS698S0100000_17(this, 26, 42), viewFindViewById3);
        View viewFindViewById4 = this.LLIZ;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.rp3);
            } else {
                viewFindViewById4 = null;
            }
            this.LLIZ = (C16FV) viewFindViewById4;
        }
        C1143680frq.LIZLLL(viewFindViewById4, "tiktok_live_revenue_demand_2", "ttlive_bg_rank_sticker_preview.png");
        WidgetManager.of(this, getView(), C486790J7d.LIZ).load(R.id.sr6, new TeamRankStickerWidget());
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        LivePopularityRankingBonusTimeConfig livePopularityRankingBonusTimeConfig = LivePopularityRankingBonusTimeConfig.INSTANCE;
        Gift giftFindGiftById = iGiftService.findGiftById(livePopularityRankingBonusTimeConfig.getValue().giftId);
        if (giftFindGiftById != null) {
            View viewFindViewById5 = this.LLIZLLLIL;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.rq1);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLIZLLLIL = (C16F5) viewFindViewById5;
            }
            ((TextView) viewFindViewById5).setText(C497740JfY.LJIIL(2131755931, livePopularityRankingBonusTimeConfig.getValue().pointMultiple, giftFindGiftById.name, Integer.valueOf(livePopularityRankingBonusTimeConfig.getValue().pointMultiple)));
        }
        View viewFindViewById6 = this.LLJ;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.bev);
            } else {
                viewFindViewById6 = null;
            }
            this.LLJ = (C21411818qq) viewFindViewById6;
        }
        ((C21411818qq) viewFindViewById6).setChecked(InterfaceC1094280eaA.Od.LIZIZ().booleanValue());
        View viewFindViewById7 = this.LLJ;
        if (viewFindViewById7 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById7 = view7.findViewById(R.id.bev);
            } else {
                viewFindViewById7 = null;
            }
            this.LLJ = (C21411818qq) viewFindViewById7;
        }
        C786410Ut5.C7((C21411818qq) viewFindViewById7, new CompoundButton.OnCheckedChangeListener() { // from class: X.0eaF
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                InterfaceC1094280eaA.Od.LJFF(Boolean.valueOf(z));
            }
        });
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c1119430fEj = (C1119430fEj) dataChannel.gg0(TeamRankStickerModelChannel.class)) != null) {
            View viewFindViewById8 = this.LLJI;
            if (viewFindViewById8 == null) {
                View view8 = getView();
                if (view8 != null) {
                    viewFindViewById8 = view8.findViewById(R.id.bew);
                } else {
                    viewFindViewById8 = null;
                }
                this.LLJI = (C16F5) viewFindViewById8;
            }
            TextView textView = (TextView) viewFindViewById8;
            if (TeamRankStickerSetting.INSTANCE.getUseNewStyle()) {
                i3 = 2131855339;
            } else {
                i3 = 2131855324;
            }
            textView.setText(C497740JfY.LJIJJ(i3, C1846800y9u.LJIILLIIL(c1119430fEj.LJIILL), C1846800y9u.LJIILLIIL(c1119430fEj.LJIILLIIL)));
        }
        Context context = getContext();
        if (context != null) {
            if (Intrinsics.LJFF(this.LLILLJJLI, "rank_page")) {
                C500260Jjc.LLFFF(NR());
                C16F5 c16f5NR = NR();
                C444940Hca c444940Hca = new C444940Hca();
                c444940Hca.LIZLLL(0);
                c444940Hca.LIZJ = C497740JfY.LJIJI(2131855326);
                c444940Hca.LIZIZ = true;
                c444940Hca.LIZIZ(62);
                c16f5NR.setText(c444940Hca.LIZ(context));
                C786410Ut5.I7(new AbS507S0200000_17(context, this, 12), NR());
            } else {
                C500260Jjc.LJIILIIL(NR());
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (interfaceC1846850y9z = (InterfaceC1846850y9z) dataChannel2.gg0(C1119110fED.class)) != null) {
            if (interfaceC1846850y9z.LJIIIZ()) {
                MR().setText(C497740JfY.LJIJI(2131855492));
                MR().setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, getContext()));
                MR().setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ey_, getContext()));
                C786410Ut5.I7(new AbS507S0200000_17(interfaceC1846850y9z, this, 10), MR());
            } else {
                MR().setText(C497740JfY.LJIJI(2131851984));
                MR().setTextColor(C20736316Cj.LIZIZ(R.attr.eyw, getContext()));
                MR().setBackgroundColor(C20736316Cj.LIZIZ(R.attr.eya, getContext()));
                C786410Ut5.I7(new AbS507S0200000_17(interfaceC1846850y9z, this, 11), MR());
            }
        }
        View viewFindViewById9 = this.LLILLL;
        if (viewFindViewById9 == null) {
            View view9 = getView();
            if (view9 != null) {
                viewFindViewById9 = view9.findViewById(R.id.title);
            } else {
                viewFindViewById9 = null;
            }
            this.LLILLL = (C16F5) viewFindViewById9;
        }
        TextView textView2 = (TextView) viewFindViewById9;
        TeamRankStickerSetting teamRankStickerSetting = TeamRankStickerSetting.INSTANCE;
        if (teamRankStickerSetting.getUseNewStyle()) {
            i = 2131855341;
        } else {
            i = 2131855329;
        }
        textView2.setText(C497740JfY.LJIJI(i));
        View view10 = this.LLILZ;
        if (view10 == null) {
            View view11 = getView();
            if (view11 != null) {
                viewFindViewById2 = view11.findViewById(R.id.desc);
            }
            this.LLILZ = (C16F5) viewFindViewById2;
            view10 = viewFindViewById2;
        }
        TextView textView3 = (TextView) view10;
        if (teamRankStickerSetting.getUseNewStyle()) {
            i2 = 2131855340;
        } else {
            i2 = 2131855325;
        }
        textView3.setText(C497740JfY.LJIJI(i2));
        DataChannel dataChannel3 = this.dataChannel;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIJJLI;
        String str = this.LLILLJJLI;
        C1119060fE8 c1119060fE8 = this.LLJILJILJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_sticker_set_show");
        c474500IjALIZ.LJIJJLI(dataChannel3);
        C1119410fEh.LIZJ(c474500IjALIZ, dataChannel3, rankTypeV2);
        c474500IjALIZ.LJJII(str, "enter_from");
        if (Intrinsics.LJFF(str, "full_screen")) {
            c474500IjALIZ.LJJII(c1119060fE8.LIZ, "tip_or_tag_id");
        }
        c474500IjALIZ.LIZ();
    }
}
