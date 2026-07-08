package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveRankingAndPrivilegeDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankingGeckoDrawableLoadingSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAvatarEntranceUnifySetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import u4.q0;

/* JADX INFO: renamed from: X.0xEb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811270xEb extends RecyclerView.ViewHolder {
    public final C16F5 LL;
    public final C16F5 LLILLJJLI;
    public final View LLILLL;
    public final C16F5 LLILZ;
    public final FrameLayout LLILZIL;
    public final ImageView LLILZLL;
    public final C1324720kZq LLIZ;
    public final C1324720kZq LLIZLLLIL;
    public final FrameLayout LLJ;
    public final C21538419Qw LLJI;
    public final C16F5 LLJIJIL;
    public final C1811290xEd LLJILJIL;
    public AnonymousClass0956 LLJILJILJ;

    public C1811270xEb(View view) {
        super(view);
        this.LL = (C16F5) view.findViewById(R.id.user_name);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.sqz);
        this.LLILLL = view.findViewById(R.id.by5);
        this.LLILZ = (C16F5) view.findViewById(R.id.xv9);
        this.LLILZIL = (FrameLayout) view.findViewById(R.id.iij);
        this.LLILZLL = (ImageView) view.findViewById(R.id.user_avatar);
        this.LLIZ = (C1324720kZq) view.findViewById(R.id.lq9);
        this.LLIZLLLIL = (C1324720kZq) view.findViewById(R.id.l9o);
        this.LLJ = (FrameLayout) view.findViewById(R.id.l9p);
        this.LLJI = (C21538419Qw) view;
        this.LLJIJIL = (C16F5) view.findViewById(R.id.tv_user_description);
        this.LLJILJIL = (C1811290xEd) view.findViewById(R.id.m4c);
    }

    public final void L5(int i, int i2) {
        FrameLayout frameLayout = this.LLJ;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        C786410Ut5.a6(frameLayout, layoutParams);
        C500260Jjc.LJLJI(i2, this.LLIZ);
        C500260Jjc.LJJLJ(i2, this.LLIZ);
    }

    public final void I5(final C1809950xCT c1809950xCT, boolean z, DataChannel dataChannel, final InterfaceC1811380xEm interfaceC1811380xEm, View view) {
        int iLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLJIIZILJ;
        C416760GVu c416760GVu;
        C416760GVu c416760GVu2;
        C416760GVu c416760GVu3;
        List urls;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        interfaceC1811380xEm.LIZ(c1809950xCT.LIZ);
        RankListV2Response.RankInfo rankInfo = c1809950xCT.LIZ;
        C786410Ut5.I7(new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xEk
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                interfaceC1811380xEm.LIZIZ(c1809950xCT.LIZ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1200L);
            }
        }, this.itemView);
        C16F5 c16f5 = this.LLILLJJLI;
        c16f5.setTextColor(C1810740xDk.LIZ(rankInfo.rank, c1809950xCT.LIZIZ.LIZIZ));
        c16f5.setText(rankInfo.rankStr);
        long j = rankInfo.rank;
        if (!Intrinsics.LJFF(c1809950xCT.LIZIZ.LIZIZ, RankTypeV2.LJJIIZ)) {
            C16F5 c16f52 = this.LLILLJJLI;
            ViewGroup.LayoutParams layoutParams = c16f52.getLayoutParams();
            layoutParams.width = (int) C497740JfY.LIZIZ(42.0f);
            C786410Ut5.y6(c16f52, layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.LLILZIL.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.setMarginStart((int) C497740JfY.LIZIZ(34.0f));
                C786410Ut5.a6(this.LLILZIL, marginLayoutParams2);
            }
            C786410Ut5.LJLLLLLL(8, this.LLILLL);
        } else {
            C16F5 c16f53 = this.LLILLJJLI;
            ViewGroup.LayoutParams layoutParams3 = c16f53.getLayoutParams();
            layoutParams3.width = (int) C497740JfY.LIZIZ(50.0f);
            C786410Ut5.y6(c16f53, layoutParams3);
            ViewGroup.LayoutParams layoutParams4 = this.LLILZIL.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(45.0f));
                C786410Ut5.a6(this.LLILZIL, marginLayoutParams);
            }
            if (1 <= j && j < 4) {
                if (j == 1) {
                    iLIZIZ = C20736316Cj.LIZIZ(R.attr.eps, this.itemView.getContext());
                } else if (j == 2) {
                    iLIZIZ = C20736316Cj.LIZIZ(R.attr.ept, this.itemView.getContext());
                } else {
                    iLIZIZ = C20736316Cj.LIZIZ(R.attr.epu, this.itemView.getContext());
                }
                View view2 = this.LLILLL;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(iLIZIZ);
                view2.setBackground(gradientDrawable);
                this.LLILLJJLI.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, this.itemView.getContext()));
                C786410Ut5.LJLLLLLL(0, this.LLILLL);
            } else {
                C786410Ut5.LJLLLLLL(8, this.LLILLL);
            }
        }
        long j2 = rankInfo.rank;
        RankTypeV2 rankTypeV2 = c1809950xCT.LIZIZ.LIZIZ;
        C21538419Qw c21538419Qw = this.LLJI;
        if (rankTypeV2.style == 1) {
            if (j2 == 1) {
                c21538419Qw.h0(c21538419Qw.getResources(), R.array.bw);
            } else if (j2 == 2) {
                c21538419Qw.h0(c21538419Qw.getResources(), R.array.bx);
            } else if (j2 == 3) {
                c21538419Qw.h0(c21538419Qw.getResources(), R.array.by);
            } else {
                c21538419Qw.h0(c21538419Qw.getResources(), R.array.bv);
            }
        } else {
            c21538419Qw.h0(c21538419Qw.getResources(), R.array.bv);
        }
        C16F5 c16f54 = this.LL;
        if (view != null) {
            iLJIIZILJ = view.getWidth();
        } else {
            iLJIIZILJ = C497740JfY.LJIIZILJ();
        }
        c16f54.setMaxWidth(iLJIIZILJ - ((int) C497740JfY.LIZIZ(215.0f)));
        this.LL.setText(C0KVU.LIZ(rankInfo.user));
        this.LLILZ.setText(rankInfo.scoreDescription);
        EnumC995330c0Z.NORMAL_LIST_ITEM.getType();
        Map<String, Object> map = C1338270kvh.LIZ;
        q0.LJIJ(this.itemView, new C1864980ydE(1));
        this.LLJILJIL.setScene(EnumC1154100g8e.RANKING_PAGE_LIST);
        this.LLJILJIL.LIZ(c1809950xCT.LIZ.labels, c1809950xCT.LIZIZ.LIZIZ);
        if (z) {
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            ImageModel avatarThumb = rankInfo.user.getAvatarThumb();
            if (avatarThumb != null) {
                urls = avatarThumb.getUrls();
            } else {
                urls = null;
            }
            C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(urls);
            c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            int width = this.LLILZLL.getWidth();
            int height = this.LLILZLL.getHeight();
            c1324610kZfLIZJ.LJ = width;
            c1324610kZfLIZJ.LJFF = height;
            c1324610kZfLIZJ.LJIIIZ = R.drawable.eze;
            c1324610kZfLIZJ.LJJI(this.LLILZLL);
            BorderInfo borderInfoLIZ = C496970JeJ.LIZ(rankInfo.user);
            boolean zOI0 = ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).oI0();
            if (borderInfoLIZ != null) {
                L5(C497740JfY.LJIIIZ(R.dimen.awy), (int) C497740JfY.LIZIZ(2.5f));
                C1324570kZb.LIZIZ(borderInfoLIZ.icon, this.LLIZLLLIL);
                C786410Ut5.LLJJIII(this.LLIZLLLIL, 0);
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                C1810410xDD c1810410xDD = c1809950xCT.LIZIZ;
                String str = c1810410xDD.LIZIZ.rankName;
                User user = rankInfo.user;
                boolean z2 = c1810410xDD.LJ;
                c1810690xDf.getClass();
                C1810690xDf.LJJJJ(str, user, borderInfoLIZ, dataChannel, z2);
            } else if (rankInfo.roomId > 0) {
                if (LiveAvatarEntranceUnifySetting.getValue()) {
                    L5(C497740JfY.LJIIIZ(R.dimen.axk), 0);
                    C1143680frq.LIZLLL(this.LLIZLLLIL, "tiktok_live_revenue_demand_1", "ttlive_ranking_list_on_live_border_new.png");
                } else if (zOI0) {
                    L5(C497740JfY.LJIIIZ(R.dimen.axl), 0);
                    C1324570kZb.LIZ(this.LLIZLLLIL, R.drawable.f9z);
                } else {
                    L5(C497740JfY.LJIIIZ(R.dimen.ax0), 0);
                    C1324570kZb.LIZ(this.LLIZLLLIL, R.drawable.f9y);
                }
                C786410Ut5.LLJJIII(this.LLIZLLLIL, 0);
            } else {
                C786410Ut5.LLJJIII(this.LLIZLLLIL, 8);
            }
            if (rankInfo.roomId > 0) {
                boolean zIsRankingListItemLiveWebpDisabled = LiveRankingAndPrivilegeDowngradeSetting.isRankingListItemLiveWebpDisabled(C500260Jjc.LJIIZILJ(dataChannel));
                boolean value = LiveAvatarEntranceUnifySetting.getValue();
                if (zIsRankingListItemLiveWebpDisabled) {
                    C1810740xDk.LIZIZ(this.LLIZ, zIsRankingListItemLiveWebpDisabled, value);
                } else if (value) {
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(2.0f);
                    this.LLIZ.setPadding(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
                    this.LLIZ.getLayoutParams().width = (int) C497740JfY.LIZIZ(18.0f);
                    this.LLIZ.getLayoutParams().height = (int) C497740JfY.LIZIZ(18.0f);
                    C500260Jjc.LJJLJLI((int) C497740JfY.LIZIZ(2.0f), this.LLIZ);
                    C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(2.0f), this.LLIZ);
                    C1810740xDk.LIZIZ(this.LLIZ, zIsRankingListItemLiveWebpDisabled, value);
                } else {
                    if (zOI0) {
                        int iLIZIZ3 = (int) C497740JfY.LIZIZ(3.0f);
                        this.LLIZ.setPadding(iLIZIZ3, iLIZIZ3, iLIZIZ3, iLIZIZ3);
                        this.LLIZ.getLayoutParams().width = (int) C497740JfY.LIZIZ(24.0f);
                        this.LLIZ.getLayoutParams().height = (int) C497740JfY.LIZIZ(24.0f);
                        C500260Jjc.LJJLJLI((int) C497740JfY.LIZIZ(-1.0f), this.LLIZ);
                        C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(-1.0f), this.LLIZ);
                    }
                    C1143680frq.LJI(this.LLIZ, C1811310xEf.LIZ(), null, true);
                }
                C12ES.LJIILL(0, this.LLIZ);
            } else {
                C12ES.LJIILL(8, this.LLIZ);
            }
        }
        RankListV2Response.TeamRankExtra teamRankExtra = rankInfo.teamRankExtra;
        if (teamRankExtra == null || (Intrinsics.LJFF(teamRankExtra.clubName, "") && teamRankExtra.contributorNum <= 0)) {
            C786410Ut5.LLJJJJ(this.LLJIJIL, 8);
            return;
        }
        C786410Ut5.LLJJJJ(this.LLJIJIL, 0);
        if (LiveRankingGeckoDrawableLoadingSetting.INSTANCE.getValue().asyncLoadingOpt) {
            AnonymousClass0956 anonymousClass0956 = this.LLJILJILJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            this.LLJILJILJ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C474260Iim(teamRankExtra, this, null), 3);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String lowerCase = C1850730yGF.LIZJ(teamRankExtra.contributorNum).toLowerCase(Locale.ROOT);
        if (!Intrinsics.LJFF(teamRankExtra.clubName, "") && teamRankExtra.contributorNum <= 0) {
            spannableStringBuilder.append((CharSequence) C497740JfY.LJIJI(2131856737));
            Drawable drawableLIZ = C1143680frq.LIZ("tiktok_live_revenue_demand_1", "ttlive_icon_ranking_list_popularity_ranking_heart.png");
            if (drawableLIZ != null) {
                drawableLIZ.setBounds(0, 0, (int) C497740JfY.LIZIZ(11.0f), (int) C497740JfY.LIZIZ(11.0f));
                c416760GVu3 = new C416760GVu(drawableLIZ);
            } else {
                c416760GVu3 = null;
            }
            int iLJJJ = a0.LJJJ(spannableStringBuilder, "{0:image}", 0, false, 6);
            C786410Ut5.q2(spannableStringBuilder, c416760GVu3, iLJJJ, iLJJJ + 9, 33);
            int iLJJJ2 = a0.LJJJ(spannableStringBuilder, "{1:string}", 0, false, 6);
            spannableStringBuilder.replace(iLJJJ2, iLJJJ2 + 10, (CharSequence) teamRankExtra.clubName);
        } else if (!Intrinsics.LJFF(teamRankExtra.clubName, "")) {
            spannableStringBuilder.append((CharSequence) C497740JfY.LJIIJJI(2131756000, (int) teamRankExtra.contributorNum));
            if (C497740JfY.LJJ()) {
                spannableStringBuilder.insert(a0.LJJJ(spannableStringBuilder, "{0:image}", 0, false, 6), (CharSequence) "\u200f");
                spannableStringBuilder.insert(a0.LJJJ(spannableStringBuilder, "{2:image}", 0, false, 6) + 9, (CharSequence) "\u200f");
            }
            Drawable drawableLIZ2 = C1143680frq.LIZ("tiktok_live_revenue_demand_1", "ttlive_icon_ranking_list_popularity_ranking_heart.png");
            if (drawableLIZ2 != null) {
                drawableLIZ2.setBounds(0, 0, (int) C497740JfY.LIZIZ(11.0f), (int) C497740JfY.LIZIZ(11.0f));
                c416760GVu = new C416760GVu(drawableLIZ2);
            } else {
                c416760GVu = null;
            }
            int iLJJJ3 = a0.LJJJ(spannableStringBuilder, "{0:image}", 0, false, 6);
            C786410Ut5.q2(spannableStringBuilder, c416760GVu, iLJJJ3, iLJJJ3 + 9, 33);
            Drawable drawableLIZ3 = C1143680frq.LIZ("tiktok_live_revenue_demand_1", "ttlive_icon_ranking_list_popularity_ranking_divider.png");
            if (drawableLIZ3 != null) {
                drawableLIZ3.setBounds(0, 0, (int) C497740JfY.LIZIZ(1.0f), (int) C497740JfY.LIZIZ(9.0f));
                c416760GVu2 = new C416760GVu(drawableLIZ3);
            } else {
                c416760GVu2 = null;
            }
            int iLJJJ4 = a0.LJJJ(spannableStringBuilder, "{2:image}", 0, false, 6);
            C786410Ut5.q2(spannableStringBuilder, c416760GVu2, iLJJJ4, iLJJJ4 + 9, 33);
            int iLJJJ5 = a0.LJJJ(spannableStringBuilder, "{1:string}", 0, false, 6);
            spannableStringBuilder.replace(iLJJJ5, iLJJJ5 + 10, (CharSequence) teamRankExtra.clubName);
            int iLJJJ6 = a0.LJJJ(spannableStringBuilder, "{3:string}", 0, false, 6);
            spannableStringBuilder.replace(iLJJJ6, iLJJJ6 + 10, (CharSequence) lowerCase);
        } else {
            spannableStringBuilder.append((CharSequence) C497740JfY.LJIIJJI(2131756001, (int) teamRankExtra.contributorNum));
            int iLJJJ7 = a0.LJJJ(spannableStringBuilder, "{0:string}", 0, false, 6);
            spannableStringBuilder.replace(iLJJJ7, iLJJJ7 + 10, (CharSequence) lowerCase);
        }
        this.LLJIJIL.setText(spannableStringBuilder);
    }
}
