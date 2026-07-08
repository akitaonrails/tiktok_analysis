package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerCreateComponent$initPollStickerEditLayout$1;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11sX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19638711sX extends AbstractC388880FMo<PollStickerModel> {
    public C19638811sY LJII;

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.POLL;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        PollStickerModel pollStickerModel = (PollStickerModel) stickerModel;
        return pollStickerModel.copy(BaseStickerModel.copy$default(pollStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1073741826, 15, null), false, pollStickerModel.editable, pollStickerModel.clickable, pollStickerModel.question, pollStickerModel.option1, pollStickerModel.option2, pollStickerModel.pollStickerId);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        PollStickerModel pollStickerModel = (PollStickerModel) stickerModel;
        return new C19638911sZ(this.LIZ, pollStickerModel.copy(BaseStickerModel.copy$default(pollStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, true, 0.0f, null, null, null, false, -1073741825, 15, null), true, pollStickerModel.editable, pollStickerModel.clickable, pollStickerModel.question, pollStickerModel.option1, pollStickerModel.option2, pollStickerModel.pollStickerId), this.LIZIZ, c0ffo, lifecycleOwner, this.LJFF);
    }

    public C19638711sX(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, C390410FSl.LIZIZ(c390420FSm), c390420FSm);
    }

    @Override // X.AbstractC388880FMo
    public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
        Parcelable pollStickerModel;
        int i;
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (c0ftj == null || (pollStickerModel = c0ftj.LJLI()) == null) {
            pollStickerModel = new PollStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.POLL, 0, 0, 0.0f, 0.0f, 0, 0, this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -7685, 15, null), true, false, false, "", "", "", "");
        }
        PollStickerModel pollStickerModel2 = (PollStickerModel) pollStickerModel;
        C19638811sY c19638811sY = this.LJII;
        if (c19638811sY == null) {
            this.LJII = new C19638811sY(this.LIZ, this.LJFF);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            FrameLayout frameLayout = this.LIZJ;
            C19638811sY c19638811sY2 = this.LJII;
            if (c19638811sY2 == null) {
                c19638811sY2 = null;
            }
            frameLayout.addView(c19638811sY2, layoutParams);
            C19638811sY c19638811sY3 = this.LJII;
            if (c19638811sY3 == null) {
                c19638811sY3 = null;
            }
            LifecycleOwner lifecycleOwner = this.LIZLLL;
            c19638811sY3.getClass();
            i = 0;
            f = 0.0f;
            c19638811sY3.LLILZIL = pollStickerModel2.copy(BaseStickerModel.copy$default(pollStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), pollStickerModel2.visible, pollStickerModel2.editable, pollStickerModel2.clickable, pollStickerModel2.question, pollStickerModel2.option1, pollStickerModel2.option2, pollStickerModel2.pollStickerId);
            c19638811sY3.setStateContainer(new C1664680tQA<>(pollStickerModel2.copy(BaseStickerModel.copy$default(pollStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2139095039, 15, null), false, true, true, pollStickerModel2.question, pollStickerModel2.option1, pollStickerModel2.option2, pollStickerModel2.pollStickerId)));
            c19638811sY3.LLIZLLLIL = new C1664680tQA<>(pollStickerModel2.copy(BaseStickerModel.copy$default(pollStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2139095039, 15, null), false, true, true, pollStickerModel2.question, pollStickerModel2.option1, pollStickerModel2.option2, pollStickerModel2.pollStickerId));
            c19638811sY3.LLJ = lifecycleOwner;
            C786410Ut5.Sd(R.layout.e9r, C786410Ut5.ne(c19638811sY3.getContext()), c19638811sY3);
            c19638811sY3.LLILZLL = (ViewGroup) c19638811sY3.findViewById(R.id.rga);
            View viewFindViewById = c19638811sY3.findViewById(R.id.y1z);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.topMargin = C497820Jfg.LIZJ(viewFindViewById.getContext());
            }
            c19638811sY3.findViewById(R.id.tv_sure);
            c19638811sY3.LLJI = (FrameLayout) c19638811sY3.findViewById(R.id.w4v);
            C19615211ok c19615211ok = new C19615211ok(c19638811sY3.getContext());
            C1664680tQA<PollStickerModel> c1664680tQA = c19638811sY3.LLIZLLLIL;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            LifecycleOwner lifecycleOwner2 = c19638811sY3.LLJ;
            if (lifecycleOwner2 == null) {
                lifecycleOwner2 = null;
            }
            c19615211ok.LIZLLL(lifecycleOwner2, c1664680tQA);
            c19638811sY3.LLJILJILJ = c19615211ok;
            c19638811sY3.addView(c19615211ok);
            FrameLayout frameLayout2 = c19638811sY3.LLJI;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            frameLayout2.addView(c19638811sY3.getPollStickerView());
            ViewGroup viewGroup = c19638811sY3.LLILZLL;
            if (viewGroup == null) {
                viewGroup = null;
            }
            C786410Ut5.K7(viewGroup, new ACListenerS163S0100000_29(c19638811sY3, 233));
            this.LIZLLL.getLifecycle().addObserver(new PollStickerCreateComponent$initPollStickerEditLayout$1(this));
        } else {
            i = 0;
            f = 0.0f;
            c19638811sY.LLILZIL = pollStickerModel2.copy(BaseStickerModel.copy$default(pollStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), pollStickerModel2.visible, pollStickerModel2.editable, pollStickerModel2.clickable, pollStickerModel2.question, pollStickerModel2.option1, pollStickerModel2.option2, pollStickerModel2.pollStickerId);
            c19638811sY.getStateContainer().LIZLLL(new AwS608S0100000_29(pollStickerModel2, 667), true);
            C1664680tQA<PollStickerModel> c1664680tQA2 = c19638811sY.LLIZLLLIL;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            c1664680tQA2.LIZLLL(new AwS608S0100000_29(pollStickerModel2, 668), true);
        }
        C19638811sY c19638811sY4 = this.LJII;
        if (c19638811sY4 == null) {
            c19638811sY4 = null;
        }
        c19638811sY4.setStickerEditListener(new C0FSM(EnumC1466150oFx.POLL, function1, c390370FSh, c0ftj));
        C19638811sY c19638811sY5 = this.LJII;
        if (c19638811sY5 == null) {
            c19638811sY5 = null;
        }
        c19638811sY5.getClass();
        int visibility = c19638811sY5.getVisibility();
        c19638811sY5.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19638811sY5);
        if (!c19638811sY5.LJIIJ()) {
            C19615211ok pollStickerView = c19638811sY5.getPollStickerView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(pollStickerView);
            pollStickerView.setScaleX(f);
            C19615211ok pollStickerView2 = c19638811sY5.getPollStickerView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(pollStickerView2);
            pollStickerView2.setScaleY(f);
            c19638811sY5.getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(357), true);
            C1664680tQA<PollStickerModel> c1664680tQA3 = c19638811sY5.LLIZLLLIL;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            c1664680tQA3.LIZLLL(AFwS273S0000000_29.get$arr$(358), true);
        }
        HandlerHook.viewPostDelay(c19638811sY5, new ARunnableS129S0100000_29(c19638811sY5, 168), 300L);
    }
}
