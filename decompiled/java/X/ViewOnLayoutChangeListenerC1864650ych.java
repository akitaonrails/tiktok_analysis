package X;

import Y.ARunnableS127S0100000_27;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.wallet.infrastructure.view.WalletUSDisclaimerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.explore.assem.ExploreRecommendTopicListComponent;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaGridContentAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.BottomInputAssemV2;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugListCardAssem;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ych, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class ViewOnLayoutChangeListenerC1864650ych implements View.OnLayoutChangeListener {
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
        }
    }

    public ViewOnLayoutChangeListenerC1864650ych(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1864650ych);
        if (((WalletUSDisclaimerView) viewOnLayoutChangeListenerC1864650ych.l0).LJI.getLineCount() <= 2) {
            C786410Ut5.LLJJIJIL(((WalletUSDisclaimerView) viewOnLayoutChangeListenerC1864650ych.l0).LJFF, 8);
        } else {
            ((WalletUSDisclaimerView) viewOnLayoutChangeListenerC1864650ych.l0).LIZ();
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        GridLayoutManager gridLayoutManager;
        DetailMediaGridContentAssem detailMediaGridContentAssem = (DetailMediaGridContentAssem) viewOnLayoutChangeListenerC1864650ych.l0;
        if (detailMediaGridContentAssem.LLJJIJIIJIL == C497820Jfg.LIZIZ(detailMediaGridContentAssem.kp().getContext())) {
            return;
        }
        DetailMediaGridContentAssem detailMediaGridContentAssem2 = (DetailMediaGridContentAssem) viewOnLayoutChangeListenerC1864650ych.l0;
        if (detailMediaGridContentAssem2.LLJJIJIIJIL == 0) {
            detailMediaGridContentAssem2.LLJJIJIIJIL = C497820Jfg.LIZIZ(detailMediaGridContentAssem2.kp().getContext());
            return;
        }
        detailMediaGridContentAssem2.LLJJIJIIJIL = C497820Jfg.LIZIZ(detailMediaGridContentAssem2.kp().getContext());
        RecyclerView.LayoutManager layoutManager = ((DetailMediaGridContentAssem) viewOnLayoutChangeListenerC1864650ych.l0).kp().getLayoutManager();
        if ((layoutManager instanceof WrapGridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            gridLayoutManager.LJIJ(((DetailMediaGridContentAssem) viewOnLayoutChangeListenerC1864650ych.l0).lp());
        }
        ((DetailMediaGridContentAssem) viewOnLayoutChangeListenerC1864650ych.l0).kp().LJIIJ();
    }

    public static final void onLayoutChange$10(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AbstractC21673619ry adapter;
        int i9;
        C1861240yXC c1861240yXC = (C1861240yXC) viewOnLayoutChangeListenerC1864650ych.l0;
        RecyclerView recyclerView = c1861240yXC.LIZIZ;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null && (adapter = recyclerView.getAdapter()) != null && c1861240yXC.LJII) {
                int itemCount = adapter.getItemCount();
                int i10 = c1861240yXC.LJI;
                if (itemCount <= i10) {
                    c1861240yXC.LJIILLIIL = -1;
                } else {
                    int i11 = (itemCount - 1) - i10;
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    View viewFindViewByPosition = layoutManager.findViewByPosition(i11);
                    if (viewFindViewByPosition != null) {
                        int bottom = viewFindViewByPosition.getBottom();
                        int i12 = c1861240yXC.LJIILLIIL;
                        if (i12 != -1 && (i9 = bottom - i12) > 0) {
                            recyclerView.scrollBy(0, i9);
                        }
                        c1861240yXC.LJIILLIIL = bottom;
                    }
                }
            }
        }
        ((C1861240yXC) viewOnLayoutChangeListenerC1864650ych.l0).LIZJ(50L);
    }

    public static final void onLayoutChange$11(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int width;
        int marginStart;
        int i9;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1864650ych);
        ExploreRecommendTopicListComponent exploreRecommendTopicListComponent = (ExploreRecommendTopicListComponent) viewOnLayoutChangeListenerC1864650ych.l0;
        int i10 = exploreRecommendTopicListComponent.LLLJIL;
        TuxTextView tuxTextViewAq = exploreRecommendTopicListComponent.aq();
        int i11 = 0;
        if (tuxTextViewAq != null) {
            width = tuxTextViewAq.getWidth();
        } else {
            width = 0;
        }
        int iLIZIZ = i10 + width + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        TextView textView = (TextView) ((ExploreRecommendTopicListComponent) viewOnLayoutChangeListenerC1864650ych.l0).LJJIJL().findViewById(R.id.yf7);
        if (textView != null) {
            textView.setText(((ExploreRecommendTopicListComponent) viewOnLayoutChangeListenerC1864650ych.l0).Qp());
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            Integer numValueOf = Integer.valueOf(marginStart);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i9 = marginLayoutParams2.topMargin;
            } else {
                i9 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i9);
            Integer numValueOf3 = Integer.valueOf(iLIZIZ);
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i11 = marginLayoutParams.bottomMargin;
            }
            C426750GoL.LJIIIZ(textView, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i11), false, 16);
        }
        TextView textView2 = (TextView) ((ExploreRecommendTopicListComponent) viewOnLayoutChangeListenerC1864650ych.l0).LJJIJL().findViewById(R.id.yf8);
        if (textView2 != null) {
            textView2.setText(((ExploreRecommendTopicListComponent) viewOnLayoutChangeListenerC1864650ych.l0).Qp());
        }
        View viewFindViewById = ((ExploreRecommendTopicListComponent) viewOnLayoutChangeListenerC1864650ych.l0).LJJIJL().findViewById(R.id.yf7);
        if (viewFindViewById != null) {
            viewFindViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1864650ych((ExploreRecommendTopicListComponent) viewOnLayoutChangeListenerC1864650ych.l0, 12));
        }
    }

    public static final void onLayoutChange$12(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1864650ych);
        ExploreRecommendTopicListComponent exploreRecommendTopicListComponent = (ExploreRecommendTopicListComponent) viewOnLayoutChangeListenerC1864650ych.l0;
        ConstraintLayout constraintLayoutUp = exploreRecommendTopicListComponent.Up();
        if (constraintLayoutUp != null) {
            height = constraintLayoutUp.getHeight();
        } else {
            height = 0;
        }
        exploreRecommendTopicListComponent.LLLII = height;
        final int iMax = Math.max((((ExploreRecommendTopicListComponent) viewOnLayoutChangeListenerC1864650ych.l0).LLLII - ExploreRecommendTopicListComponent.LLLLLIL) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
        ((ExploreRecommendTopicListComponent) viewOnLayoutChangeListenerC1864650ych.l0).Go().addItemDecoration(new C0DXR(iMax) { // from class: X.0y6n
            public final int LL;

            {
                this.LL = iMax;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                boolean z;
                boolean z2;
                rect.set(rect.left, 0, rect.right, rect.bottom);
                int childLayoutPosition = recyclerView.getChildLayoutPosition(view2);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                if (c21673919s1.LJI) {
                    if (childLayoutPosition >= 0 && childLayoutPosition < 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (childAdapterPosition >= 0 && childAdapterPosition < 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z && !z2) {
                        return;
                    }
                } else if (childAdapterPosition < 0 || childAdapterPosition >= 2) {
                    return;
                }
                rect.top = this.LL;
            }
        });
    }

    public static final void onLayoutChange$13(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5) {
            ((InputInnerAssem) viewOnLayoutChangeListenerC1864650ych.l0).Gp();
        }
    }

    public static final void onLayoutChange$14(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 != i8 - i6) {
            ((C1854240yLu) viewOnLayoutChangeListenerC1864650ych.l0).LIZIZ();
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((BottomInputAssem) viewOnLayoutChangeListenerC1864650ych.l0).zq();
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((BottomInputAssemV2) viewOnLayoutChangeListenerC1864650ych.l0).tp();
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 != i8 - i6) {
            ((TakoMiddlePageSugListCardAssem) viewOnLayoutChangeListenerC1864650ych.l0).Ep(false, true);
        }
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 != i6 || i4 != i8) {
            ((TakoMiddlePageSugListCardAssem) viewOnLayoutChangeListenerC1864650ych.l0).Ep(true, false);
        }
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5) {
            C1854760yMk.LJJ(((C1854760yMk) viewOnLayoutChangeListenerC1864650ych.l0).getInputView(), ((C1854760yMk) viewOnLayoutChangeListenerC1864650ych.l0).getExpandLayout());
        }
    }

    public static final void onLayoutChange$7(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((TakoAnswerBaseAssem) viewOnLayoutChangeListenerC1864650ych.l0).hr("onLayoutChange");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onLayoutChange$8(X.ViewOnLayoutChangeListenerC1864650ych r0, android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        /*
            java.lang.Object r2 = r0.l0
            X.0xFJ r2 = (X.C1811710xFJ) r2
            android.view.View r0 = r2.LIZIZ
            int r0 = r0.getVisibility()
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L60
            android.view.View r0 = r2.LIZIZ
            int r0 = r0.getWidth()
            if (r0 == 0) goto L60
            android.view.View r0 = r2.LIZ
            int r0 = r0.getWidth()
            if (r0 == 0) goto L60
            android.view.View r1 = r2.LIZIZ
            int[] r0 = r2.LJ
            r1.getLocationOnScreen(r0)
            android.view.View r1 = r2.LIZ
            int[] r0 = r2.LJFF
            r1.getLocationOnScreen(r0)
            int[] r0 = r2.LJ
            r1 = r0[r4]
            android.view.View r0 = r2.LIZIZ
            int r0 = r0.getWidth()
            int r1 = r1 + r0
            int[] r0 = r2.LJFF
            r0 = r0[r4]
            if (r1 <= r0) goto L60
        L3d:
            boolean r0 = r2.LIZJ
            if (r3 == r0) goto L5d
            r2.LIZJ = r3
            android.view.View r2 = r2.LIZ
            X.0qL5 r1 = X.C1546210qL5.LIZ
            if (r3 == 0) goto L5e
            r0 = 1102053376(0x41b00000, float:22.0)
        L4b:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.getClass()
            float r0 = X.C1546210qL5.LIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            X.C500260Jjc.LJJZ(r0, r2)
        L5d:
            return
        L5e:
            r0 = 0
            goto L4b
        L60:
            r3 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLayoutChangeListenerC1864650ych.onLayoutChange$8(X.0ych, android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public static final void onLayoutChange$9(ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1861230yXB c1861230yXB = (C1861230yXB) viewOnLayoutChangeListenerC1864650ych.l0;
        RecyclerView recyclerView = c1861230yXB.LIZ;
        if (recyclerView != null) {
            recyclerView.postOnAnimation(new ARunnableS127S0100000_27(c1861230yXB, 64));
        }
    }
}
