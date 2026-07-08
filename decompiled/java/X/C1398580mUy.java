package X;

import Y.ACListenerS124S0200000_21;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.VideoTag;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398580mUy extends C1398630mV3 {
    public final InterfaceC1398680mV8 LLJLLL;
    public NewFaceStickerBean LLJZ;

    @Override // X.AbstractC1620180sGO
    public final boolean L5() {
        if (((Boolean) C280800AzW.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return super.L5();
    }

    @Override // X.C1398630mV3
    public final boolean c6() {
        return ((Boolean) C280970Azn.LIZ.getValue()).booleanValue();
    }

    public final void w6(Aweme aweme) {
        if (C1394640mOc.LIZ()) {
            C786410Ut5.LLLLZLL(this.LLJILJILJ, 4);
            C786410Ut5.LJZL(0, this.LLJILLL);
            User author = aweme.getAuthor();
            if (author != null) {
                if (author.getAvatar168() != null) {
                    this.LLJJIJI.LJIIJ(C438710HIf.LIZ(author.getAvatar168()));
                }
                if (author.getNickname() != null) {
                    this.LLJJ.setText(author.getNickname());
                }
            }
            TuxIconView tuxIconView = (TuxIconView) this.LLJ.findViewById(R.id.qcw);
            C1398500mUq c1398500mUq = C1398500mUq.LIZ;
            View view = this.LLJJIII;
            TuxTextView tuxTextView = this.LLJJ;
            C427660Gpo c427660Gpo = this.LLJJIJI;
            LinearLayout linearLayout = this.LLJILLL;
            ViewGroup viewGroup = this.LLJ;
            c1398500mUq.getClass();
            C1398500mUq.LIZJ(view, viewGroup, linearLayout, c427660Gpo, tuxIconView, tuxTextView, aweme);
            return;
        }
        C786410Ut5.LLLLZLL(this.LLJILJILJ, 0);
        C786410Ut5.LJZL(8, this.LLJILLL);
        this.LLJILJILJ.setBackgroundResource(R.drawable.bh3);
    }

    public C1398580mUy(View view, String str, InterfaceC1260110itd interfaceC1260110itd, InterfaceC1398680mV8 interfaceC1398680mV8) {
        super(view, str, interfaceC1260110itd);
        this.LLJLLL = interfaceC1398680mV8;
        C786410Ut5.Q8(this.LLILLJJLI, new ACListenerS124S0200000_21(this, interfaceC1260110itd, 57));
        C2271391DvN.LIZ(this.LLILLJJLI, (C1A5L) C2271381DvM.p0.getValue());
    }

    @Override // X.C1398630mV3
    public final void b6(Aweme aweme, int i, boolean z, Bundle bundle) {
        boolean z2;
        super.b6(aweme, i, z, bundle);
        C302240Bt0.LJFF().getClass();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "prop_show_like_num", true) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && aweme.getStatistics() != null) {
            C786410Ut5.LLLLZLL(this.LLJJJJ, 0);
            C786410Ut5.LLLLZLL(this.LLJJJJJIL, 8);
            C786410Ut5.LLLLLLZZ(this.LLJJJJLIIL, 8);
            this.LLJJJJ.setText(C1843500y4a.LIZIZ(aweme.getStatistics().getDiggCount()));
            this.LLJJJJ.setContentDescription("");
        }
        InterfaceC1398680mV8 interfaceC1398680mV8 = this.LLJLLL;
        if (interfaceC1398680mV8 != null) {
            this.LLJZ = interfaceC1398680mV8.get();
        }
        if (aweme.getDetailPageVideoTag() == VideoTag.FEATURED_VIDEO) {
            this.LLJILJILJ.setText(2131845443);
            C786410Ut5.LLLLZLL(this.LLJILJILJ, 0);
            if (C1394640mOc.LIZ()) {
                this.LLJILJILJ.setBackgroundResource(R.drawable.bgz);
                this.LLJILJILJ.setTuxFont(82);
                TuxTextView tuxTextView = this.LLJILJILJ;
                C1398500mUq.LIZ.getClass();
                tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), 0);
            } else {
                this.LLJILJILJ.setBackgroundResource(R.drawable.bh1);
            }
            this.LLJILJILJ.setTextColorRes(R.attr.ee);
            return;
        }
        if (aweme.getDetailPageVideoTag() == VideoTag.FRIENDS_VIDEO) {
            this.LLJILJILJ.setText(2131829788);
            w6(aweme);
            this.LLJILJILJ.setTextColorRes(R.attr.e1);
            this.LLJZ.isFriendVideoPresent = true;
            String aid = aweme.getAid();
            int followStatus = AwemeExtKt.getFollowStatus(aweme);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "prop_page");
            c2344009Gk.LIZJ(followStatus, "follow_status");
            c2344009Gk.LIZJ(i + 1, "order");
            c2344009Gk.LJIIIIZZ("group_id", aid);
            C20684815ws.LJIILLIIL("friend_tag_show", c2344009Gk.LIZ);
            C1398500mUq c1398500mUq = C1398500mUq.LIZ;
            String aid2 = aweme.getAid();
            String string = bundle.getString("detail_id");
            c1398500mUq.getClass();
            C1398500mUq.LIZLLL(aid2, "prop_page", "click_anchor", null, string);
            return;
        }
        if (aweme.getDetailPageVideoTag() == VideoTag.FOLLOWERS_VIDEO) {
            this.LLJILJILJ.setText(2131829787);
            w6(aweme);
            this.LLJILJILJ.setTextColorRes(R.attr.e1);
            this.LLJZ.isFollowerVideoPresent = true;
            String aid3 = aweme.getAid();
            int followStatus2 = AwemeExtKt.getFollowStatus(aweme);
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", "prop_page");
            c2344009Gk2.LIZJ(followStatus2, "follow_status");
            c2344009Gk2.LIZJ(i + 1, "order");
            c2344009Gk2.LJIIIIZZ("group_id", aid3);
            C20684815ws.LJIILLIIL("following_tag_show", c2344009Gk2.LIZ);
            return;
        }
        NewFaceStickerBean newFaceStickerBean = this.LLJZ;
        if (newFaceStickerBean == null || newFaceStickerBean.commerceSticker == null || aweme.getMusicStarter() != null || aweme.getOriginAuthor() != null || aweme.getIsTop() != 1) {
            return;
        }
        if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
            C786410Ut5.LLIL(this.LLJIJIL, 0);
            C786410Ut5.l(this.LLJI, 8);
            C1398630mV3.r6(this.LLJIJIL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
        } else {
            C786410Ut5.LLIL(this.LLJIJIL, 8);
            C786410Ut5.l(this.LLJI, 0);
            C1324840ka2.LJI(this.LLJI, aweme.getLabelTop(), (int) C12ES.LIZJ(6.0f, this.LLIZ), (int) C12ES.LIZJ(6.0f, this.LLIZ), null);
        }
    }
}
