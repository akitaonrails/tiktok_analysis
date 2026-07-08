package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0JoJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503170JoJ extends C502700JnY {
    public final View LL;
    public final SubSpaceDetailVM LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final LiveIconView LLILZIL;
    public final C16F5 LLILZLL;

    public C503170JoJ(View view, SubSpaceDetailVM subSpaceDetailVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceDetailVM;
        this.LLILLL = (C16F5) view.findViewById(R.id.rj9);
        this.LLILZ = (C16F5) view.findViewById(R.id.rjc);
        this.LLILZIL = (LiveIconView) view.findViewById(R.id.f755mn3);
        this.LLILZLL = (C16F5) view.findViewById(R.id.mnh);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        final C503190JoL c503190JoL;
        C504880Jr4 c504880Jr4 = null;
        if (abstractC503810JpL instanceof C503190JoL) {
            c503190JoL = (C503190JoL) abstractC503810JpL;
        } else {
            c503190JoL = null;
        }
        if (interfaceC2753014t instanceof C504880Jr4) {
            c504880Jr4 = (C504880Jr4) interfaceC2753014t;
        }
        if (c503190JoL == null || c504880Jr4 == null) {
            return;
        }
        final SpacePost spacePost = c503190JoL.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\"');
        sbLIZ.append(spacePost.text);
        sbLIZ.append('\"');
        this.LLILLL.setText(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLJJLI.DQ2()) {
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                c16f5.setMaxLines(1);
            }
            C16F5 c16f52 = this.LLILZ;
            if (c16f52 != null) {
                c16f52.setEllipsize(TextUtils.TruncateAt.END);
            }
            C16F5 c16f53 = this.LLILZ;
            if (c16f53 != null) {
                C500260Jjc.LJJLJLI(C497740JfY.LJIIIZ(R.dimen.sc) + C497740JfY.LJIIIZ(R.dimen.sn), c16f53);
            }
        }
        this.LLILZ.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131856536), Arrays.copyOf(new Object[]{C0KVU.LIZ(c504880Jr4.LLJI)}, 1)));
        U5(spacePost.likeCount, spacePost.userLiked);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JoK
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    SpacePost spacePost2 = spacePost;
                    if (spacePost2.userLiked) {
                        this.U5(spacePost2.likeCount - 1, false);
                        this.LLILLJJLI.BQ2(spacePost.postId, 1, c503190JoL);
                    } else {
                        this.U5(spacePost2.likeCount + 1, true);
                        this.LLILLJJLI.BQ2(spacePost.postId, 0, c503190JoL);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LLILZIL);
    }

    public final void U5(long j, boolean z) {
        if (j > 0) {
            this.LLILZLL.setText(C474270Iin.LIZIZ(j));
            C786410Ut5.LLJJJJ(this.LLILZLL, 0);
        } else {
            C786410Ut5.LLJJJJ(this.LLILZLL, 8);
        }
        this.LLILZLL.requestLayout();
        if (z) {
            this.LLILZIL.setIconAttr(R.attr.dus);
            this.LLILZIL.setIconTintAttr(R.attr.eu5);
        } else {
            this.LLILZIL.setIconAttr(R.attr.dul);
            this.LLILZIL.setIconTintAttr(R.attr.ex5);
        }
    }
}
