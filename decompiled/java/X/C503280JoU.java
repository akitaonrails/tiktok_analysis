package X;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503280JoU extends C502700JnY {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C1324720kZq LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final C0KVZ LLIZLLLIL;

    public C503280JoU(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (C16F5) view.findViewById(R.id.eaf);
        this.LLILZ = (C16F5) view.findViewById(R.id.ecd);
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.e_j);
        this.LLILZIL = c1324720kZq;
        this.LLILZLL = (C16F5) view.findViewById(R.id.ea_);
        this.LLIZ = (C16F5) view.findViewById(R.id.eaa);
        this.LLIZLLLIL = (C0KVZ) view.findViewById(R.id.bqd);
        c1324720kZq.getHierarchy().LJIJI(0);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        final C504910Jr7 c504910Jr7;
        C504510JqT c504510JqT = null;
        if (abstractC503810JpL instanceof C504910Jr7) {
            c504910Jr7 = (C504910Jr7) abstractC503810JpL;
        } else {
            c504910Jr7 = null;
        }
        if (interfaceC2753014t instanceof C504510JqT) {
            c504510JqT = (C504510JqT) interfaceC2753014t;
        }
        if (c504910Jr7 == null || c504510JqT == null) {
            return;
        }
        SpaceCommentItem spaceCommentItem = c504910Jr7.LIZ;
        C502700JnY.T5(this.LLILLL, spaceCommentItem);
        C502680JnW.LIZ(0, this.LLILZ, this.LLILLJJLI.DQ2());
        this.LLILZ.setText(C0KVU.LIZ(spaceCommentItem.userInfo));
        C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), spaceCommentItem.userInfo, this.LLILZIL);
        if (c504510JqT.LLILZIL) {
            C502700JnY.L5(this.LLILZ, spaceCommentItem.userInfo, c504910Jr7.LIZIZ, this.LLILLJJLI.wQ2());
            C502700JnY.L5(this.LLILZIL, spaceCommentItem.userInfo, c504910Jr7.LIZIZ, this.LLILLJJLI.wQ2());
        } else {
            N5(this.LLILZ, spaceCommentItem.userInfo, c504910Jr7.LIZIZ, this.LLILLJJLI.wQ2());
            N5(this.LLILZIL, spaceCommentItem.userInfo, c504910Jr7.LIZIZ, this.LLILLJJLI.wQ2());
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JoW
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                SpacePost spacePost;
                if (view != null && (spacePost = c504910Jr7.LIZIZ) != null && !spacePost.previewMode) {
                    this.LLILLJJLI.AQ2(spacePost);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LL);
        this.LLILZ.requestLayout();
        R5(this.LLILLL, spaceCommentItem);
        if (spaceCommentItem.anchorCommented) {
            this.LLILZLL.setText("·");
            C786410Ut5.LLJJJJ(this.LLILZLL, 0);
            C786410Ut5.LLJJJJ(this.LLIZ, 0);
        } else {
            C786410Ut5.LLJJJJ(this.LLILZLL, 8);
            C786410Ut5.LLJJJJ(this.LLIZ, 8);
        }
        if (!spaceCommentItem.anchorCommented) {
            C502700JnY.S5(this.LLIZLLLIL, spaceCommentItem.badgeList, spaceCommentItem.userInfo);
        } else {
            C786410Ut5.LLJZ(this.LLIZLLLIL, 8);
        }
    }
}
