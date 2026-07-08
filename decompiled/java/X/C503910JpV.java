package X;

import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503910JpV extends C502700JnY {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final LiveIconView LLILLL;
    public final C1324720kZq LLILZ;
    public final C16F5 LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;

    public C503910JpV(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (LiveIconView) view.findViewById(R.id.f755mn3);
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.a14);
        this.LLILZIL = (C16F5) view.findViewById(R.id.a12);
        this.LLILZLL = (C16F5) view.findViewById(R.id.mnz);
        this.LLIZ = (C16F5) view.findViewById(R.id.ebw);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        final C502940Jnw c502940Jnw;
        C504510JqT c504510JqT = null;
        if (abstractC503810JpL instanceof C502940Jnw) {
            c502940Jnw = (C502940Jnw) abstractC503810JpL;
        } else {
            c502940Jnw = null;
        }
        if (interfaceC2753014t instanceof C504510JqT) {
            c504510JqT = (C504510JqT) interfaceC2753014t;
        }
        if (c502940Jnw == null || c504510JqT == null) {
            return;
        }
        final SpacePost spacePost = c502940Jnw.LIZ;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JpZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpacePost spacePost2 = spacePost;
                if (spacePost2.previewMode) {
                    return;
                }
                this.LLILLJJLI.AQ2(spacePost2);
            }
        }, this.LL);
        V5(spacePost.likeCount, spacePost.userLiked);
        long j = spacePost.commentCount;
        if (j > 0) {
            this.LLIZ.setText(C474270Iin.LIZIZ(j));
        } else {
            this.LLIZ.setText(C497740JfY.LJIJI(2131844322));
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JpX
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    SpacePost spacePost2 = spacePost;
                    if (!spacePost2.previewMode) {
                        this.U5(spacePost2, c502940Jnw);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LLILZLL);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JpY
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    SpacePost spacePost2 = spacePost;
                    if (!spacePost2.previewMode) {
                        this.U5(spacePost2, c502940Jnw);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LLILLL);
        if (c504510JqT.LLJILLL) {
            C500260Jjc.LJIILIIL(this.LLILZ);
            C500260Jjc.LJIILIIL(this.LLILZIL);
            return;
        }
        C500260Jjc.LLFFF(this.LLILZ);
        C500260Jjc.LLFFF(this.LLILZIL);
        C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), c504510JqT.LLILLJJLI, this.LLILZ);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JpW
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    SpacePost spacePost2 = spacePost;
                    if (!spacePost2.previewMode) {
                        SubSpaceFeedVM subSpaceFeedVM = this.LLILLJJLI;
                        subSpaceFeedVM.getClass();
                        subSpaceFeedVM.setState(new C504280Jq6(spacePost2));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LLILZIL);
    }

    public final void U5(SpacePost spacePost, C502940Jnw c502940Jnw) {
        if (spacePost.userLiked) {
            V5(spacePost.likeCount - 1, false);
            this.LLILLJJLI.BQ2(spacePost.postId, 1, c502940Jnw.LIZ);
        } else {
            V5(spacePost.likeCount + 1, true);
            this.LLILLJJLI.BQ2(spacePost.postId, 0, c502940Jnw.LIZ);
        }
    }

    public final void V5(long j, boolean z) {
        if (j > 0) {
            this.LLILZLL.setText(C474270Iin.LIZIZ(j));
        } else {
            this.LLILZLL.setText(C497740JfY.LJIJI(2131844326));
        }
        this.LLIZ.requestLayout();
        this.LLILZLL.requestLayout();
        if (z) {
            this.LLILLL.setIconAttr(R.attr.dus);
            this.LLILLL.setIconTintAttr(R.attr.eu5);
        } else {
            this.LLILLL.setIconAttr(R.attr.dul);
            this.LLILLL.setIconTintAttr(R.attr.ex5);
        }
    }
}
