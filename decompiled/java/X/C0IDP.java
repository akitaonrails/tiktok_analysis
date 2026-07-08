package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS106S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.game.gamelist.GameTopicCell;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent;
import com.ss.android.ugc.aweme.feed.collection.sub.component.SurfaceViewTransitionAdaptAssem;
import com.ss.android.ugc.aweme.im.assem.IMInputAssem;
import com.ss.android.ugc.aweme.im.common.protocol.OnInputHeightChangeListener;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.ChatroomHeightAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.label.ui.SearchTop1CardLabelAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedVideoBottomHeightAssem;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS21S0001000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IDP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDP implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 8:
                onLayoutChange$8(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onLayoutChange$9(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onLayoutChange$10(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onLayoutChange$11(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onLayoutChange$12(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onLayoutChange$13(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 14:
                onLayoutChange$14(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 15:
                onLayoutChange$15(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 16:
                onLayoutChange$16(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onLayoutChange$17(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C0IDP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0idp);
        if (view.getLeft() < 0) {
            C786410Ut5.Jc(view, -view.getLeft());
        }
        if (view.getRight() > ((FrameLayout) c0idp.l0).getWidth()) {
            C786410Ut5.Jc(view, ((FrameLayout) c0idp.l0).getWidth() - view.getRight());
        }
    }

    public static final void onLayoutChange$1(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((TakoAIVideoFeedVideoBottomHeightAssem) c0idp.l0).getClass();
        int iCp = TakoAIVideoFeedVideoBottomHeightAssem.cp(i4 - i2, view);
        if (((Number) ((TakoAIVideoFeedVideoBottomHeightAssem) c0idp.l0).LLJJJJ.getValue()).intValue() != iCp) {
            ((TakoAIVideoFeedVideoBottomHeightAssem) c0idp.l0).LLJJJJ.setValue(Integer.valueOf(iCp));
        }
    }

    public static final void onLayoutChange$10(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((Boolean) ((Function1) c0idp.l0).invoke(view)).booleanValue()) {
            view.removeOnLayoutChangeListener(c0idp);
        }
    }

    public static final void onLayoutChange$11(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i8 - i6;
        int i10 = i4 - i2;
        int i11 = i10 - i9;
        if (i11 == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("distribute reflow: ");
        sbLIZ.append(i9);
        sbLIZ.append(" -> ");
        sbLIZ.append(i10);
        sbLIZ.append(" (delta=");
        sbLIZ.append(i11);
        sbLIZ.append("), wrapper.tY=");
        sbLIZ.append(((View) c0idp.l0).getTranslationY());
        C20441214yg.LIZIZ("HangoutNewUserGuideAssem", C2188811AlT.LIZIZ(sbLIZ));
        ((View) c0idp.l0).animate().cancel();
        View view2 = (View) c0idp.l0;
        C786410Ut5.ed(view2, view2.getTranslationY() - i11);
        ((View) c0idp.l0).animate().translationY(0.0f).setDuration(400L).start();
    }

    public static final void onLayoutChange$12(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (i9 <= 0) {
            return;
        }
        int i10 = i8 - i6;
        if (i9 == i10 && ((ExploreTopicGeneralFeedListComponent) c0idp.l0).LLJJJJLIIL == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + i9) {
            return;
        }
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent = (ExploreTopicGeneralFeedListComponent) c0idp.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bannerLayoutChange(oldH=");
        sbLIZ.append(i10);
        sbLIZ.append(" newH=");
        sbLIZ.append(i9);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        exploreTopicGeneralFeedListComponent.So(i9, view);
    }

    public static final void onLayoutChange$13(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0idp);
        Integer numValueOf = Integer.valueOf((int) ((C465640INu.LIZIZ(((GameTopicCell) c0idp.l0).L5().getContext()) - ((GameTopicCell) c0idp.l0).I5().getWidth()) - (C497740JfY.LIZIZ(16) * 3)));
        if (numValueOf.intValue() > 0) {
            ((GameTopicCell) c0idp.l0).L5().setMaxWidth(numValueOf.intValue());
        }
    }

    public static final void onLayoutChange$14(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup viewGroup;
        int marginStart;
        int marginEnd;
        view.removeOnLayoutChangeListener(c0idp);
        int measuredWidth = (((SearchTop1CardLabelAssem) c0idp.l0).getContentView().getMeasuredWidth() - ((SearchTop1CardLabelAssem) c0idp.l0).getContentView().getPaddingStart()) - ((SearchTop1CardLabelAssem) c0idp.l0).getContentView().getPaddingEnd();
        View contentView = ((SearchTop1CardLabelAssem) c0idp.l0).getContentView();
        if ((contentView instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView) != null) {
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                if (!Intrinsics.LJFF(childAt, ((SearchTop1CardLabelAssem) c0idp.l0).LLJLLIL) && childAt.getVisibility() == 0) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    int i10 = measuredWidth2 + marginStart;
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    } else {
                        marginEnd = 0;
                    }
                    measuredWidth -= i10 + marginEnd;
                }
            }
        }
        TuxTextView tuxTextView = ((SearchTop1CardLabelAssem) c0idp.l0).LLJLLIL;
        if (tuxTextView != null) {
            tuxTextView.setMaxWidth(measuredWidth);
        }
    }

    public static final void onLayoutChange$15(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0idp);
        ((EditText) c0idp.l0).requestFocus();
    }

    public static final void onLayoutChange$16(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C197039127h c197039127h = (C197039127h) c0idp.l0;
        if (c197039127h.LLLII) {
            C427050Gop.LIZ(c197039127h);
        }
    }

    public static final void onLayoutChange$17(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0idp);
        AssemVMLazy assemVMLazy = ((ChatroomHeightAssem) c0idp.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ChatroomHeightAssem.LLJ;
        assemVMLazy.getValue().setStateImmediate(new AwS21S0001000_6(view.getHeight(), 19));
    }

    public static final void onLayoutChange$2(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0idp);
        AwS407S0200000_6 awS407S0200000_6 = new AwS407S0200000_6(view, (TextView) c0idp.l0, 5);
        if (((TextView) c0idp.l0).getWidth() <= 0) {
            HandlerHook.viewPost((TextView) c0idp.l0, new ARunnableS103S0100000_3((Object) awS407S0200000_6, 28));
        } else {
            awS407S0200000_6.invoke();
        }
    }

    public static final void onLayoutChange$3(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view != null) {
            C786410Ut5.gd(((SurfaceViewTransitionAdaptAssem) c0idp.l0).Ep(), view.getTranslationY());
            Integer numValueOf = Integer.valueOf(view.getHeight());
            if (numValueOf.intValue() > 0) {
                SurfaceViewTransitionAdaptAssem surfaceViewTransitionAdaptAssem = (SurfaceViewTransitionAdaptAssem) c0idp.l0;
                int iIntValue = numValueOf.intValue();
                ImageView imageViewEp = surfaceViewTransitionAdaptAssem.Ep();
                ViewGroup.LayoutParams layoutParams = imageViewEp.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = iIntValue;
                C786410Ut5.W5(imageViewEp, layoutParams);
            }
        }
    }

    public static final void onLayoutChange$4(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        if (view == null) {
            return;
        }
        view.getLocationOnScreen(new int[2]);
        int i9 = i4 - i2;
        View view2 = (View) ((IMInputAssem) c0idp.l0).LLJJJJ.getValue();
        if (view2 != null) {
            height = view2.getHeight();
        } else {
            height = 0;
        }
        int i10 = i9 + height;
        AssemVMLazy assemVMLazy = ((IMInputAssem) c0idp.l0).LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IMInputAssem.LLJLIL;
        AssemViewModel value = assemVMLazy.getValue();
        int bottom = ((View) ((IMInputAssem) c0idp.l0).LLJJJJJIL.getValue()).getBottom() - ((View) ((IMInputAssem) c0idp.l0).LLJJJJJIL.getValue()).getTop();
        View view3 = (View) ((IMInputAssem) c0idp.l0).LLJJJJ.getValue();
        if (view3 != null) {
            height2 = view3.getHeight();
        } else {
            height2 = 0;
        }
        value.setState(new C457630Hx3(i10, bottom + height2));
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL((IMInputAssem) c0idp.l0), OnInputHeightChangeListener.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                ((OnInputHeightChangeListener) it2.next()).ee2(i10);
            }
        }
    }

    public static final void onLayoutChange$5(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0idp);
        if (!((EditText) c0idp.l0).requestFocus()) {
            EditText editText = (EditText) c0idp.l0;
            HandlerHook.viewPost(editText, new ARunnableS106S0100000_6((Object) editText, 71));
        }
    }

    public static final void onLayoutChange$6(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((Boolean) ((Function1) c0idp.l0).invoke(view)).booleanValue()) {
            view.removeOnLayoutChangeListener(c0idp);
        }
    }

    public static final void onLayoutChange$7(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C430440GuI) c0idp.l0).removeOnLayoutChangeListener(c0idp);
        C430440GuI c430440GuI = (C430440GuI) c0idp.l0;
        HandlerHook.viewRemoveCallbacks(c430440GuI, c430440GuI.LLJLL);
        C430440GuI c430440GuI2 = (C430440GuI) c0idp.l0;
        HandlerHook.viewPost(c430440GuI2, c430440GuI2.LLJLL);
    }

    public static final void onLayoutChange$8(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = ((View) c0idp.l0).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.topMargin != view.getHeight()) {
            marginLayoutParams.topMargin = view.getHeight();
            C786410Ut5.W5((View) c0idp.l0, marginLayoutParams);
        }
    }

    public static final void onLayoutChange$9(C0IDP c0idp, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C0HGU) c0idp.l0).LIZJ();
    }
}
