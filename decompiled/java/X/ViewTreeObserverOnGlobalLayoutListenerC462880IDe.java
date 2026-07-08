package X;

import Y.ARunnableS106S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.CommerceAgentSevenSheetFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.ChatroomHeightAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatroomHeightViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.external.SharePostAndGroupPanel;
import com.ss.android.ugc.aweme.search.detail.keyframe.ui.SearchDetailKeyframeAnchorAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.MixStudioResultsPageV2Assem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS21S0001000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0IDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC462880IDe implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
            case 7:
                onGlobalLayout$7(this);
                break;
            case 8:
                onGlobalLayout$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onGlobalLayout$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onGlobalLayout$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onGlobalLayout$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onGlobalLayout$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onGlobalLayout$13(this);
                break;
            case 14:
                onGlobalLayout$14(this);
                break;
            case 15:
                onGlobalLayout$15(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        ViewTreeObserver viewTreeObserver;
        ((Function0) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).invoke();
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        if (((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getWidth() > 0) {
            C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            ((Function2) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1).invoke(Integer.valueOf(((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getWidth()), Integer.valueOf(((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getHeight()));
        }
    }

    public static final void onGlobalLayout$10(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        if (((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getGlobalVisibleRect(new Rect())) {
            ((Function1) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1).invoke((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0);
            ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    public static final void onGlobalLayout$11(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        if (((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getGlobalVisibleRect(new Rect())) {
            ((Function1) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1).invoke((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0);
            ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    public static final void onGlobalLayout$12(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        Layout layout = ((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getLayout();
        if (layout != null && layout.getLineCount() == 1 && ((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getWidth() != 0) {
            C786410Ut5.C3(((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            if (layout.getEllipsisCount(0) > 0) {
                C339190DRl.LIZIZ((View) ((SearchDetailKeyframeAnchorAssem) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1).LLLF.getValue());
            }
        }
    }

    public static final void onGlobalLayout$13(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462880IDe);
        float height = ((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getHeight();
        if (height <= 0.0f) {
            return;
        }
        float f = -height;
        C786410Ut5.ed((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0, f);
        C1599810rjX c1599810rjX = (C1599810rjX) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0, 124));
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimatorOfFloat.start();
        c1599810rjX.LJIIIZ = valueAnimatorOfFloat;
    }

    public static final void onGlobalLayout$14(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = ((C1003900cEO) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).LIZ;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        LinearLayout linearLayout = (LinearLayout) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1;
        if (linearLayout != null) {
            Iterator<View> it2 = new C09RD(linearLayout).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    View view = (View) c09re.next();
                    if ((view instanceof TuxTextView) && view != null) {
                        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
                        float fMeasureText = appCompatTextView.getPaint().measureText(appCompatTextView.getText().toString());
                        if (view.getId() != 0 && appCompatTextView.getWidth() < fMeasureText) {
                            C786410Ut5.LJJL(view, linearLayout);
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static final void onGlobalLayout$15(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        Fragment fragmentLJI = C724240Sb0.LJI((ChatroomHeightAssem) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0);
        if (fragmentLJI != null && !fragmentLJI.isDetached()) {
            try {
                AssemVMLazy assemVMLazy = ((ChatroomHeightAssem) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ChatroomHeightAssem.LLJ;
                ((ChatroomHeightViewModel) assemVMLazy.getValue()).setStateImmediate(new AwS21S0001000_6((((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1).getHeight() - ((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1).getPaddingBottom()) - ((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1).getPaddingTop(), 18));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Setting chatroom height failed due to ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        HandlerHook.viewPostDelay((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0, new ARunnableS106S0100000_6((SharePostAndGroupPanel) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1, 80), 200L);
        ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        Layout layout;
        ViewTreeObserver viewTreeObserver;
        TuxTextView tuxTextView = ((MixStudioResultsPageV2Assem) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).LLLL;
        if (tuxTextView != null && (viewTreeObserver = tuxTextView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        TuxTextView tuxTextView2 = ((MixStudioResultsPageV2Assem) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).LLLL;
        if (tuxTextView2 != null && (layout = tuxTextView2.getLayout()) != null && layout.getEllipsisCount(1) > 0) {
            String string = a0.LJLIIIL(((C0HGK) ((InterfaceC440090HNn) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1)).LIZ.substring(0, (layout.getEllipsisStart(1) + layout.getLineStart(1)) - 2)).toString();
            TuxTextView tuxTextView3 = ((MixStudioResultsPageV2Assem) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).LLLL;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(C786410Ut5.j4("\"%s...\"", Arrays.copyOf(new Object[]{string}, 1)));
            }
        }
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462880IDe);
        ((Function0) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1).invoke();
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        C0P0T c0p0t = ((AutoScrollAssemBase) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).LLLFF;
        if (c0p0t != null) {
            c0p0t.LJ();
        }
        ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        Layout layout = ((C431640GwE) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getLayout();
        if (layout != null) {
            C431640GwE c431640GwE = (C431640GwE) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0;
            TextView.BufferType bufferType = (TextView.BufferType) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1;
            C786410Ut5.C3(c431640GwE.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            c431640GwE.LJJJJJ(layout, bufferType);
        }
    }

    public static final void onGlobalLayout$7(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        Layout layout = ((C430890Gv1) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getLayout();
        if (layout != null) {
            C430890Gv1 c430890Gv1 = (C430890Gv1) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0;
            TextView.BufferType bufferType = (TextView.BufferType) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1;
            C786410Ut5.C3(c430890Gv1.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            c430890Gv1.LJJJLIIL(layout, bufferType);
        }
    }

    public static final void onGlobalLayout$8(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        Object parent;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        CommerceAgentSevenSheetFragment commerceAgentSevenSheetFragment = (CommerceAgentSevenSheetFragment) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0;
        View view = commerceAgentSevenSheetFragment.getView();
        commerceAgentSevenSheetFragment.getClass();
        do {
            if (view != null) {
                parent = view.getParent();
            } else {
                parent = null;
            }
            if (parent instanceof C16G0) {
                View view2 = (View) parent;
                if (view2 != null) {
                    View view3 = ((CommerceAgentSevenSheetFragment) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getView();
                    if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
                        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
                    }
                    int[] iArr = new int[2];
                    view2.getLocationInWindow(iArr);
                    int measuredHeight = iArr[1] + view2.getMeasuredHeight();
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setColor(-16777216);
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
                    layerDrawable.setLayerInset(1, 0, measuredHeight, 0, 0);
                    Window window = ((Dialog) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1).getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        decorView.setBackground(layerDrawable);
                        return;
                    }
                    return;
                }
                return;
            }
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                return;
            }
        } while (view != null);
    }

    public static final void onGlobalLayout$9(ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe) {
        Object c098200Yq;
        if (((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getWidth() != 0) {
            C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) viewTreeObserverOnGlobalLayoutListenerC462880IDe.l1;
            try {
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn.resumeWith(c098200Yq);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJFF(thM5exceptionOrNullimpl, "coroutineStylePost");
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ViewTreeObserverOnGlobalLayoutListenerC462880IDe(android.view.View r2, kotlin.jvm.functions.Function0 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            if (r4 == 0) goto Ld
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC462880IDe.<init>(android.view.View, kotlin.jvm.functions.Function0, int):void");
    }

    public ViewTreeObserverOnGlobalLayoutListenerC462880IDe(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC462880IDe(C430890Gv1 c430890Gv1, CharSequence charSequence, TextView.BufferType bufferType, int i) {
        this.$t = i;
        this.l0 = c430890Gv1;
        this.l1 = bufferType;
    }
}
