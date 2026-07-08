package X;

import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0JoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503150JoH extends C502700JnY {
    public final View LL;
    public final SubSpaceDetailVM LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final View LLILZLL;
    public final LiveIconView LLIZ;
    public final C16F5 LLIZLLLIL;
    public final C16F5 LLJ;

    public C503150JoH(View view, SubSpaceDetailVM subSpaceDetailVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceDetailVM;
        this.LLILLL = (C16F5) view.findViewById(R.id.rj9);
        this.LLILZ = (C16F5) view.findViewById(R.id.rgf);
        this.LLILZIL = (C16F5) view.findViewById(R.id.rfj);
        this.LLILZLL = view.findViewById(R.id.rfk);
        this.LLIZ = (LiveIconView) view.findViewById(R.id.f755mn3);
        this.LLIZLLLIL = (C16F5) view.findViewById(R.id.mnh);
        this.LLJ = (C16F5) view.findViewById(R.id.rjc);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        final C503010Jo3 c503010Jo3;
        C504880Jr4 c504880Jr4;
        List<SpacePollOption> list;
        Boolean boolValueOf = null;
        if ((abstractC503810JpL instanceof C503010Jo3) && (c503010Jo3 = (C503010Jo3) abstractC503810JpL) != null && (interfaceC2753014t instanceof C504880Jr4) && (c504880Jr4 = (C504880Jr4) interfaceC2753014t) != null) {
            final SpacePost spacePost = c503010Jo3.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\"');
            sbLIZ.append(spacePost.text);
            sbLIZ.append('\"');
            this.LLILLL.setText(C2188811AlT.LIZIZ(sbLIZ));
            C502680JnW.LIZ(0, this.LLJ, this.LLILLJJLI.DQ2());
            this.LLJ.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131856536), Arrays.copyOf(new Object[]{C0KVU.LIZ(c504880Jr4.LLJI)}, 1)));
            U5(spacePost.likeCount, spacePost.userLiked);
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JoI
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view) {
                    if (view != null) {
                        SpacePost spacePost2 = spacePost;
                        if (spacePost2.userLiked) {
                            this.U5(spacePost2.likeCount - 1, false);
                            this.LLILLJJLI.BQ2(spacePost.postId, 1, c503010Jo3);
                        } else {
                            this.U5(spacePost2.likeCount + 1, true);
                            this.LLILLJJLI.BQ2(spacePost.postId, 0, c503010Jo3);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, this.LLIZ);
            SpacePoll spacePoll = spacePost.pollInfo;
            long j = 0;
            if (spacePoll != null && (list = spacePoll.optionList) != null) {
                Iterator<SpacePollOption> it2 = list.iterator();
                while (it2.hasNext()) {
                    j += it2.next().votes;
                }
            }
            SpacePoll spacePoll2 = spacePost.pollInfo;
            if (spacePoll2 != null) {
                boolValueOf = Boolean.valueOf(spacePoll2.isEnd);
            }
            if (C176600m4.LIZIZ(boolValueOf)) {
                C786410Ut5.LLJJJJ(this.LLILZIL, 0);
                C786410Ut5.LJLLLLLL(0, this.LLILZLL);
            } else {
                C786410Ut5.LLJJJJ(this.LLILZIL, 8);
                C786410Ut5.LJLLLLLL(8, this.LLILZLL);
            }
            this.LLILZ.setText(C786410Ut5.j4(C497740JfY.LJIIJJI(2131755605, (int) j), Arrays.copyOf(new Object[]{C474270Iin.LIZIZ(j)}, 1)));
        }
    }

    public final void U5(long j, boolean z) {
        if (j > 0) {
            this.LLIZLLLIL.setText(C474270Iin.LIZIZ(j));
            C786410Ut5.LLJJJJ(this.LLIZLLLIL, 0);
        } else {
            C786410Ut5.LLJJJJ(this.LLIZLLLIL, 8);
        }
        this.LLIZLLLIL.requestLayout();
        if (z) {
            this.LLIZ.setIconAttr(R.attr.dus);
            this.LLIZ.setIconTintAttr(R.attr.eu5);
        } else {
            this.LLIZ.setIconAttr(R.attr.dul);
            this.LLIZ.setIconTintAttr(R.attr.ex5);
        }
    }
}
