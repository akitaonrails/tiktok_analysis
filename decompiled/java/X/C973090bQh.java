package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973090bQh extends FrameLayout {
    public final ViewGroup LL;
    public final ViewGroup LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C973130bQl LLILZ;
    public final C16F5 LLILZIL;
    public final C1324720kZq LLILZLL;
    public final C1324720kZq LLIZ;
    public final C1324720kZq LLIZLLLIL;
    public final C16F5 LLJ;
    public final C16F5 LLJI;

    public final void setAvatarSize(int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.LayoutParams layoutParams6;
        ViewGroup.LayoutParams layoutParams7;
        ViewGroup.LayoutParams layoutParams8;
        ViewGroup.LayoutParams layoutParams9;
        ViewGroup.LayoutParams layoutParams10;
        ViewGroup.LayoutParams layoutParams11;
        ViewGroup.LayoutParams layoutParams12;
        C1324720kZq c1324720kZq = this.LLILLL;
        if (c1324720kZq != null && (layoutParams12 = c1324720kZq.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
            Integer numValueOf = Integer.valueOf(i);
            c1546210qL5.getClass();
            layoutParams12.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf));
        }
        C1324720kZq c1324720kZq2 = this.LLILLL;
        if (c1324720kZq2 != null && (layoutParams11 = c1324720kZq2.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL52 = C1546210qL5.LIZ;
            Integer numValueOf2 = Integer.valueOf(i);
            c1546210qL52.getClass();
            layoutParams11.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf2));
        }
        C1324720kZq c1324720kZq3 = this.LLIZ;
        if (c1324720kZq3 != null && (layoutParams10 = c1324720kZq3.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL53 = C1546210qL5.LIZ;
            Integer numValueOf3 = Integer.valueOf(i);
            c1546210qL53.getClass();
            layoutParams10.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf3));
        }
        C1324720kZq c1324720kZq4 = this.LLIZ;
        if (c1324720kZq4 != null && (layoutParams9 = c1324720kZq4.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL54 = C1546210qL5.LIZ;
            Integer numValueOf4 = Integer.valueOf(i);
            c1546210qL54.getClass();
            layoutParams9.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf4));
        }
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null && (layoutParams8 = c16f5.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL55 = C1546210qL5.LIZ;
            Integer numValueOf5 = Integer.valueOf(i);
            c1546210qL55.getClass();
            layoutParams8.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf5));
        }
        C16F5 c16f52 = this.LLJ;
        if (c16f52 != null && (layoutParams7 = c16f52.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL56 = C1546210qL5.LIZ;
            Integer numValueOf6 = Integer.valueOf(i);
            c1546210qL56.getClass();
            layoutParams7.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf6));
        }
        C16F5 c16f53 = this.LLJI;
        if (c16f53 != null && (layoutParams6 = c16f53.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL57 = C1546210qL5.LIZ;
            Integer numValueOf7 = Integer.valueOf(i);
            c1546210qL57.getClass();
            layoutParams6.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf7));
        }
        C16F5 c16f54 = this.LLJI;
        if (c16f54 != null && (layoutParams5 = c16f54.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL58 = C1546210qL5.LIZ;
            Integer numValueOf8 = Integer.valueOf(i);
            c1546210qL58.getClass();
            layoutParams5.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf8));
        }
        C1324720kZq c1324720kZq5 = this.LLILZLL;
        if (c1324720kZq5 != null && (layoutParams4 = c1324720kZq5.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL59 = C1546210qL5.LIZ;
            Integer numValueOf9 = Integer.valueOf(i);
            c1546210qL59.getClass();
            layoutParams4.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf9));
        }
        C1324720kZq c1324720kZq6 = this.LLILZLL;
        if (c1324720kZq6 != null && (layoutParams3 = c1324720kZq6.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL510 = C1546210qL5.LIZ;
            Integer numValueOf10 = Integer.valueOf(i);
            c1546210qL510.getClass();
            layoutParams3.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf10));
        }
        C1324720kZq c1324720kZq7 = this.LLIZLLLIL;
        if (c1324720kZq7 != null && (layoutParams2 = c1324720kZq7.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL511 = C1546210qL5.LIZ;
            Integer numValueOf11 = Integer.valueOf(i);
            c1546210qL511.getClass();
            layoutParams2.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf11));
        }
        C1324720kZq c1324720kZq8 = this.LLIZLLLIL;
        if (c1324720kZq8 != null && (layoutParams = c1324720kZq8.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL512 = C1546210qL5.LIZ;
            Integer numValueOf12 = Integer.valueOf(i);
            c1546210qL512.getClass();
            layoutParams.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf12));
        }
    }

    public final void setDownUserCountdown(boolean z) {
        int i;
        C16F5 c16f5 = this.LLJI;
        if (c16f5 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLJJJJ(c16f5, i);
        }
    }

    public final void setReadyStateSingleMode(boolean z) {
        int i;
        C1324720kZq c1324720kZq = this.LLILZLL;
        if (c1324720kZq != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLJJIII(c1324720kZq, i);
        }
    }

    public final void setUpUserCountdown(boolean z) {
        int i;
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLJJJJ(c16f5, i);
        }
    }

    public C973090bQh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h87, this, true);
        findViewById(R.id.user_info_layout_container);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.user_info_layout_up);
        this.LL = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.user_info_layout_down);
        this.LLILLJJLI = viewGroup2;
        this.LLILLL = (C1324720kZq) findViewById(R.id.user_avatar_hv_up);
        this.LLILZ = (C973130bQl) findViewById(R.id.me1);
        this.LLILZIL = (C16F5) findViewById(R.id.user_name_tv_up);
        C1324720kZq c1324720kZq = (C1324720kZq) findViewById(R.id.user_check_icon_up);
        this.LLILZLL = c1324720kZq;
        this.LLIZ = (C1324720kZq) findViewById(R.id.user_avatar_hv_down);
        findViewById(R.id.user_name_tv_down);
        C1324720kZq c1324720kZq2 = (C1324720kZq) findViewById(R.id.user_check_icon_down);
        this.LLIZLLLIL = c1324720kZq2;
        C16F5 c16f5 = (C16F5) findViewById(R.id.user_countdown_up);
        this.LLJ = c16f5;
        C16F5 c16f52 = (C16F5) findViewById(R.id.user_countdown_down);
        this.LLJI = c16f52;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        if (c16f52 != null) {
            C786410Ut5.LLJJJJ(c16f52, 8);
        }
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
        if (c1324720kZq2 != null) {
            C786410Ut5.LLJJIII(c1324720kZq2, 8);
        }
        C1143680frq.LIZLLL(this.LLILZLL, "tiktok_live_interaction_demand_6", "ttlive_match_invite_panel_accept_icon_big.png");
    }

    public final void LIZIZ(GiftGalleryBadgeInfo giftGalleryBadgeInfo, boolean z) {
        Boolean bool;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBadgeView, classOptOut = ");
        sbLIZ.append(z);
        sbLIZ.append(" + rankBadgeInfo.isNull() = ");
        if (giftGalleryBadgeInfo != null) {
            bool = false;
        } else {
            bool = null;
        }
        sbLIZ.append(bool);
        C20441214yg.LIZIZ("MatchUserInfoView", C2188811AlT.LIZIZ(sbLIZ));
        if (!z && giftGalleryBadgeInfo != null) {
            C500260Jjc.LLFFF(this.LLILZ);
            C973130bQl c973130bQl = this.LLILZ;
            if (c973130bQl != null) {
                c973130bQl.LIZIZ(giftGalleryBadgeInfo, false);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLILZ);
    }

    public final void LIZ(int i, String str, ImageModel imageModel, GiftGalleryBadgeInfo giftGalleryBadgeInfo, LeagueScoreInfo leagueScoreInfo) {
        int width;
        int height;
        int width2;
        int height2;
        setAvatarSize(i);
        ViewGroup viewGroup = this.LL;
        boolean z = false;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        ViewGroup viewGroup2 = this.LLILLJJLI;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null) {
            c16f5.setText(str);
        }
        if (imageModel == null) {
            C1324610kZf c1324610kZfLJIJ = C1819620xS4.LIZ().LJIJ(R.drawable.el9);
            C1324720kZq c1324720kZq = this.LLILLL;
            if (c1324720kZq != null) {
                width2 = c1324720kZq.getWidth();
            } else {
                width2 = 0;
            }
            C1324720kZq c1324720kZq2 = this.LLILLL;
            if (c1324720kZq2 != null) {
                height2 = c1324720kZq2.getHeight();
            } else {
                height2 = 0;
            }
            c1324610kZfLJIJ.LJ = width2;
            c1324610kZfLJIJ.LJFF = height2;
            c1324610kZfLJIJ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIJ.LJJI(this.LLILLL);
        } else {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el9;
            C1324720kZq c1324720kZq3 = this.LLILLL;
            if (c1324720kZq3 != null) {
                width = c1324720kZq3.getWidth();
            } else {
                width = 0;
            }
            C1324720kZq c1324720kZq4 = this.LLILLL;
            if (c1324720kZq4 != null) {
                height = c1324720kZq4.getHeight();
            } else {
                height = 0;
            }
            c1324610kZfLJIIIZ.LJ = width;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJJI(this.LLILLL);
        }
        if (leagueScoreInfo != null) {
            z = leagueScoreInfo.classOptOut;
        }
        LIZIZ(giftGalleryBadgeInfo, z);
    }
}
