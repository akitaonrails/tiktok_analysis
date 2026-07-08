package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Jol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503450Jol extends C502700JnY {
    public final View LL;
    public final SubSpaceDetailVM LLILLJJLI;
    public final C16F5 LLILLL;
    public final LiveIconView LLILZ;
    public final C16F5 LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final C1324720kZq LLIZLLLIL;
    public final C16F5 LLJ;
    public final C0KVZ LLJI;
    public final View LLJIJIL;
    public final C16F5 LLJILJIL;
    public final View LLJILJILJ;
    public final C16F5 LLJILLL;
    public final C16F5 LLJJ;

    public final void U5(SpaceCommentItem spaceCommentItem) {
        int i;
        View view = this.LLJILJILJ;
        if (spaceCommentItem.anchorLiked) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        boolean z = spaceCommentItem.userLiked;
        long j = spaceCommentItem.likeCount;
        if (j > 0) {
            this.LLIZ.setText(C474270Iin.LIZIZ(j));
            C786410Ut5.LLJJJJ(this.LLIZ, 0);
        } else {
            this.LLIZ.setText(CardStruct.IStatusCode.DEFAULT);
            C786410Ut5.LLJJJJ(this.LLIZ, 8);
        }
        if (z) {
            this.LLILZ.setIconAttr(R.attr.dus);
            this.LLILZ.setIconTintAttr(R.attr.eu5);
        } else {
            this.LLILZ.setIconAttr(R.attr.dul);
            this.LLILZ.setIconTintAttr(R.attr.ex5);
        }
    }

    public C503450Jol(View view, SubSpaceDetailVM subSpaceDetailVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceDetailVM;
        this.LLILLL = (C16F5) view.findViewById(R.id.ea4);
        this.LLILZ = (LiveIconView) view.findViewById(R.id.f755mn3);
        this.LLILZIL = (C16F5) view.findViewById(R.id.frg);
        this.LLILZLL = (C16F5) view.findViewById(R.id.ee7);
        this.LLIZ = (C16F5) view.findViewById(R.id.mnh);
        this.LLIZLLLIL = (C1324720kZq) view.findViewById(R.id.e_j);
        this.LLJ = (C16F5) view.findViewById(R.id.ecd);
        this.LLJI = (C0KVZ) view.findViewById(R.id.bqd);
        this.LLJIJIL = view.findViewById(R.id.t7t);
        this.LLJILJIL = (C16F5) view.findViewById(R.id.t80);
        this.LLJILJILJ = view.findViewById(R.id.m4j);
        this.LLJILLL = (C16F5) view.findViewById(R.id.ea_);
        this.LLJJ = (C16F5) view.findViewById(R.id.eaa);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        final C504910Jr7 c504910Jr7;
        User user;
        User user2;
        User user3;
        if (abstractC503810JpL instanceof C504910Jr7) {
            c504910Jr7 = (C504910Jr7) abstractC503810JpL;
        } else {
            c504910Jr7 = null;
        }
        if (!(interfaceC2753014t instanceof C504880Jr4) || interfaceC2753014t == null || c504910Jr7 == null) {
            return;
        }
        final SpaceCommentItem spaceCommentItem = c504910Jr7.LIZ;
        C502700JnY.T5(this.LLILLL, spaceCommentItem);
        C502680JnW.LIZ((int) C497740JfY.LIZIZ(15.0f), this.LLJ, this.LLILLJJLI.DQ2());
        this.LLJ.setText(C0KVU.LIZ(spaceCommentItem.userInfo));
        this.LLJ.requestLayout();
        U5(spaceCommentItem);
        SpaceCommentItem spaceCommentItem2 = spaceCommentItem.replyToReplyInfo;
        if (spaceCommentItem2 != null) {
            user = spaceCommentItem2.userInfo;
        } else {
            user = null;
        }
        if (user == null) {
            C786410Ut5.LJLLLLLL(8, this.LLJIJIL);
            C786410Ut5.LLJJJJ(this.LLJILJIL, 8);
        } else {
            C786410Ut5.LJLLLLLL(0, this.LLJIJIL);
            C786410Ut5.LLJJJJ(this.LLJILJIL, 0);
            SpaceCommentItem spaceCommentItem3 = spaceCommentItem.replyToReplyInfo;
            if (spaceCommentItem3 != null) {
                user2 = spaceCommentItem3.userInfo;
            } else {
                user2 = null;
            }
            this.LLJILJIL.setText(C0KVU.LIZ(user2));
            C16F5 c16f5 = this.LLJILJIL;
            SpaceCommentItem spaceCommentItem4 = spaceCommentItem.replyToReplyInfo;
            if (spaceCommentItem4 != null) {
                user3 = spaceCommentItem4.userInfo;
            } else {
                user3 = null;
            }
            N5(c16f5, user3, c504910Jr7.LIZIZ, this.LLILLJJLI.wQ2());
        }
        this.LLILZLL.setText(C2215111Bmn.LIZ(spaceCommentItem.createTimeSec * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        this.LLILZLL.requestLayout();
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jon
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    if (this.LLILZ.LLILLJJLI.zQ2()) {
                        spaceCommentItem.anchorLiked = !r1.userLiked;
                    }
                    SpaceCommentItem spaceCommentItem5 = spaceCommentItem;
                    if (spaceCommentItem5.userLiked) {
                        spaceCommentItem5.userLiked = false;
                        spaceCommentItem5.likeCount--;
                        this.LLILZ.U5(spaceCommentItem5);
                        this.LLILZ.LLILLJJLI.AQ2(spaceCommentItem.postId, 1, c504910Jr7);
                        return;
                    }
                    this.LLILZ.U5(spaceCommentItem5);
                    SpaceCommentItem spaceCommentItem6 = spaceCommentItem;
                    spaceCommentItem6.userLiked = true;
                    spaceCommentItem6.likeCount++;
                    this.LLILZ.LLILLJJLI.AQ2(spaceCommentItem6.postId, 0, c504910Jr7);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LLILZ);
        this.LL.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0Jou
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                SubSpaceDetailVM subSpaceDetailVM = this.LL.LLILLJJLI;
                C504910Jr7 c504910Jr72 = c504910Jr7;
                subSpaceDetailVM.getClass();
                subSpaceDetailVM.setState(new C505100JrQ(c504910Jr72));
                return true;
            }
        });
        this.LLILLL.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0Jov
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                SubSpaceDetailVM subSpaceDetailVM = this.LL.LLILLJJLI;
                C504910Jr7 c504910Jr72 = c504910Jr7;
                subSpaceDetailVM.getClass();
                subSpaceDetailVM.setState(new C505100JrQ(c504910Jr72));
                return true;
            }
        });
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Joq
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    SubSpaceDetailVM subSpaceDetailVM = this.LLILZ.LLILLJJLI;
                    C504910Jr7 c504910Jr72 = c504910Jr7;
                    subSpaceDetailVM.getClass();
                    subSpaceDetailVM.setState(new C505110JrR(c504910Jr72));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LLILLL);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jor
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    SubSpaceDetailVM subSpaceDetailVM = this.LLILZ.LLILLJJLI;
                    C504910Jr7 c504910Jr72 = c504910Jr7;
                    subSpaceDetailVM.getClass();
                    subSpaceDetailVM.setState(new C505110JrR(c504910Jr72));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LLILZIL);
        C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), spaceCommentItem.userInfo, this.LLIZLLLIL);
        if (((C504880Jr4) interfaceC2753014t).LLJILJIL) {
            C502700JnY.L5(this.LLJ, spaceCommentItem.userInfo, c504910Jr7.LIZIZ, null);
            C502700JnY.L5(this.LLIZLLLIL, spaceCommentItem.userInfo, c504910Jr7.LIZIZ, null);
        } else {
            N5(this.LLJ, spaceCommentItem.userInfo, c504910Jr7.LIZIZ, this.LLILLJJLI.wQ2());
            N5(this.LLIZLLLIL, spaceCommentItem.userInfo, c504910Jr7.LIZIZ, this.LLILLJJLI.wQ2());
        }
        if (spaceCommentItem.anchorCommented) {
            this.LLJILLL.setText("·");
            C786410Ut5.LLJJJJ(this.LLJILLL, 0);
            C786410Ut5.LLJJJJ(this.LLJJ, 0);
        } else {
            C786410Ut5.LLJJJJ(this.LLJILLL, 8);
            C786410Ut5.LLJJJJ(this.LLJJ, 8);
        }
        if (!spaceCommentItem.anchorCommented) {
            C502700JnY.S5(this.LLJI, spaceCommentItem.badgeList, spaceCommentItem.userInfo);
        } else {
            C786410Ut5.LLJZ(this.LLJI, 8);
        }
    }
}
