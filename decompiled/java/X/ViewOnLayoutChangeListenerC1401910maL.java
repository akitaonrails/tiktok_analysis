package X;

import Y.ARunnableS121S0100000_21;
import Y.ARunnableS8S0102000_21;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService;
import com.ss.android.ugc.aweme.comment.experiment.CommentPowerListMemoryConfig;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment;
import com.ss.android.ugc.aweme.commentv2.title.TitleCommentPowerListAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0maL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class ViewOnLayoutChangeListenerC1401910maL implements View.OnLayoutChangeListener {
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
        }
    }

    public ViewOnLayoutChangeListenerC1401910maL(KeyboardDialogFragment keyboardDialogFragment, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
                this.l0 = keyboardDialogFragment;
                break;
            default:
                this.l0 = keyboardDialogFragment;
                break;
        }
    }

    public ViewOnLayoutChangeListenerC1401910maL(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 != i8 - i6) {
            ((KeyboardDialogFragment) viewOnLayoutChangeListenerC1401910maL.l0).dS();
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((KeyboardDialogFragment) viewOnLayoutChangeListenerC1401910maL.l0).dS();
    }

    public static final void onLayoutChange$10(ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iFindLastCompletelyVisibleItemPosition;
        LinearLayoutManager linearLayoutManager;
        if (((CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).Bp().getChildCount() > 0) {
            RecyclerView.LayoutManager layoutManager = ((CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).Bp().getLayoutManager();
            String strEventType = null;
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            } else {
                iFindLastCompletelyVisibleItemPosition = -1;
            }
            ICommerceCommentService iCommerceCommentServiceLIZJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZJ();
            CommentContextSource commentContextSourceSp = ((CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).sp();
            if (commentContextSourceSp != null) {
                strEventType = CommentContextSourceKt.eventType(commentContextSourceSp);
            }
            InterfaceC1049630dQ9 interfaceC1049630dQ9LIZ = iCommerceCommentServiceLIZJ.LIZ(strEventType);
            if (interfaceC1049630dQ9LIZ != null) {
                interfaceC1049630dQ9LIZ.LIZJ(iFindLastCompletelyVisibleItemPosition + 1);
            }
            CommentPowerListAssem commentPowerListAssem = (CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0;
            if (commentPowerListAssem.LLJZIJLIL) {
                commentPowerListAssem.LLJZIJLIL = false;
                int iLJIIJJI = commentPowerListAssem.Bp().LJIIJJI(C1340430kzB.class, C1342180l20.class);
                int iLJIIJJI2 = ((CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).Bp().LJIIJJI(C1340440kzC.class, C1342180l20.class);
                RecyclerView.RecycledViewPool recycledViewPool = ((CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).Bp().getRecycledViewPool();
                C01GW c01gw = C1343150l3Z.LIZIZ;
                recycledViewPool.setMaxRecycledViews(iLJIIJJI, ((CommentPowerListMemoryConfig) c01gw.getValue()).poolSizeForFirstLevelComment);
                ((CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).Bp().getRecycledViewPool().setMaxRecycledViews(iLJIIJJI2, ((CommentPowerListMemoryConfig) c01gw.getValue()).poolSizeForSecondLevelComment);
            }
        }
        ((CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).Bp().removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1401910maL);
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((PollCreateFragment) viewOnLayoutChangeListenerC1401910maL.l0).nS();
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1401910maL);
        C1353060lJY c1353060lJY = ((DefaultCommentPageContainerFragment) viewOnLayoutChangeListenerC1401910maL.l0).LLJJJJJIL;
        if (c1353060lJY != null) {
            c1353060lJY.LJIIJ();
        }
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HandlerHook.viewPost(((TitleCommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).Bp(), new ARunnableS121S0100000_21((TitleCommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0, 64));
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1401910maL);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(116));
        int iLIZ = (int) (C497820Jfg.LIZ((Context) viewOnLayoutChangeListenerC1401910maL.l0) * 0.73f);
        int height = view.getHeight();
        if (height >= iLIZIZ) {
            iLIZIZ = height;
        }
        if (iLIZIZ <= iLIZ) {
            iLIZ = iLIZIZ;
        }
        view.getLayoutParams().height = iLIZ;
        view.requestLayout();
        BottomSheetBehavior.from(view).setFitToContents(true);
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        View view2;
        if (i6 != 0 && (i10 = i4 - i2) != (i9 = i8 - i6) && (view2 = ((SkeletonSharePanelFragment) viewOnLayoutChangeListenerC1401910maL.l0).getView()) != null) {
            HandlerHook.viewPost(view2, new ARunnableS8S0102000_21((SkeletonSharePanelFragment) viewOnLayoutChangeListenerC1401910maL.l0, i10, i9, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onLayoutChange$7(X.ViewOnLayoutChangeListenerC1401910maL r7, android.view.View r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16) {
        /*
            r8.removeOnLayoutChangeListener(r7)
            java.lang.Object r1 = r7.l0
            X.0lPp r1 = (X.C1356950lPp) r1
            boolean r0 = r1.LLJJL
            if (r0 != 0) goto L62
            r6 = 1
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.findViewHolderForLayoutPosition(r6)
            if (r0 == 0) goto L62
            android.view.View r5 = r0.itemView
            if (r5 == 0) goto L62
            java.lang.Object r4 = r7.l0
            X.0lPp r4 = (X.C1356950lPp) r4
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r4.findViewHolderForLayoutPosition(r6)
            r3 = 0
            if (r0 == 0) goto L63
            android.view.View r2 = r0.itemView
            if (r2 == 0) goto L63
            int r1 = r2.getWidth()
            int r0 = r2.getMeasuredWidth()
            if (r1 >= r0) goto L30
            r1 = r0
        L30:
            if (r1 >= r6) goto L33
            r1 = 1
        L33:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r2.measure(r1, r0)
            int r1 = r2.getMeasuredHeight()
            if (r1 <= 0) goto L63
            int r0 = X.C1356950lPp.LLJLLIL
            if (r1 >= r0) goto L4b
            r1 = r0
        L4b:
            r4.LLJJLIIIJLLLLLLLZ = r1
            java.lang.Object r1 = r7.l0
            X.0lPp r1 = (X.C1356950lPp) r1
            r1.LLJJL = r6
            int r0 = r1.getSingleItemHeaderHeight()
            r1.LJJI(r0)
            X.C786410Ut5.LJLLLLLL(r3, r5)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.T4(r5, r0)
        L62:
            return
        L63:
            int r1 = X.C1356950lPp.LLJLLL
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLayoutChangeListenerC1401910maL.onLayoutChange$7(X.0maL, android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public static final void onLayoutChange$8(ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).So().getChildCount() > 0) {
            com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem commentPowerListAssem = (com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0;
            if (commentPowerListAssem.LLJJIII) {
                commentPowerListAssem.LLJJIII = false;
                int iLJIIJJI = commentPowerListAssem.So().LJIIJJI(C1340940l00.class, C1340970l03.class);
                int iLJIIJJI2 = ((com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).So().LJIIJJI(C1340930kzz.class, C1340970l03.class);
                RecyclerView.RecycledViewPool recycledViewPool = ((com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).So().getRecycledViewPool();
                C01GW c01gw = C1343150l3Z.LIZIZ;
                recycledViewPool.setMaxRecycledViews(iLJIIJJI, ((CommentPowerListMemoryConfig) c01gw.getValue()).poolSizeForFirstLevelComment);
                ((com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).So().getRecycledViewPool().setMaxRecycledViews(iLJIIJJI2, ((CommentPowerListMemoryConfig) c01gw.getValue()).poolSizeForSecondLevelComment);
            }
        }
        ((com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem) viewOnLayoutChangeListenerC1401910maL.l0).So().removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1401910maL);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onLayoutChange$9(X.ViewOnLayoutChangeListenerC1401910maL r1, android.view.View r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            java.lang.Object r4 = r1.l0
            com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment r4 = (com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment) r4
            X.0lGw r1 = r4.LLJJL
            if (r1 == 0) goto Lf
            int r0 = r2.getMeasuredWidth()
            r1.LJIILJJIL(r0)
        Lf:
            boolean r0 = r4.LLLLLLL
            if (r0 != 0) goto L99
            boolean r0 = r4.Bc2()
            if (r0 == 0) goto L99
            android.view.View r0 = r4.LLLLIL
            int r3 = r0.getMeasuredHeight()
            r0 = 44
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = X.C418440Gaw.LIZ(r0)
            int r3 = r3 - r0
            r0 = 65
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = X.C418440Gaw.LIZ(r0)
            int r3 = r3 - r0
            boolean r0 = r4.LLLLLLZ
            if (r0 != 0) goto L3d
            boolean r0 = r4.LLLLLLZZ
            if (r0 == 0) goto L4f
        L3d:
            com.bytedance.lighten.loader.SmartImageView r0 = r4.LLIZLLLIL
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            com.bytedance.lighten.loader.SmartImageView r0 = r4.LLIZLLLIL
            int r0 = r0.getHeight()
            int r3 = r3 - r0
            int r0 = r1.bottomMargin
            int r3 = r3 - r0
        L4f:
            boolean r0 = r4.LLLILZJ
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = 0
            if (r0 == 0) goto L9a
            android.widget.LinearLayout r0 = r4.LLJJJJ
            int r0 = r0.getWidth()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            android.widget.LinearLayout r0 = r4.LLJJJJ
            r0.measure(r2, r1)
            android.widget.LinearLayout r0 = r4.LLJJJJ
            int r0 = r0.getMeasuredHeight()
        L6f:
            int r3 = r3 - r0
        L70:
            boolean r0 = X.C294400BgM.LIZ()
            if (r0 == 0) goto L84
            boolean r0 = r4.LLLILZJ
            if (r0 != 0) goto L84
            boolean r0 = r4.LLLILZLLLI
            if (r0 != 0) goto L84
            int r0 = X.C1351440lGw.LLJJJJLIIL
            int r3 = r3 - r0
            int r0 = X.C1351440lGw.LLJJL
            int r3 = r3 - r0
        L84:
            X.0lKG r0 = r4.LLIZ
            int r0 = r0.getHeight()
            if (r0 == r3) goto L99
            X.0lKG r0 = r4.LLIZ
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r1.height = r3
            X.0lKG r0 = r4.LLIZ
            X.C786410Ut5.h7(r0, r1)
        L99:
            return
        L9a:
            boolean r0 = r4.LLLILZLLLI
            if (r0 == 0) goto L70
            android.view.ViewGroup r0 = r4.LLL
            int r0 = r0.getWidth()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            android.view.ViewGroup r0 = r4.LLL
            r0.measure(r2, r1)
            android.view.ViewGroup r0 = r4.LLL
            int r0 = r0.getMeasuredHeight()
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLayoutChangeListenerC1401910maL.onLayoutChange$9(X.0maL, android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
