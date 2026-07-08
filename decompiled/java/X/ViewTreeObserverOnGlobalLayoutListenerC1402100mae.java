package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.behavior.TopSheetBehavior;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.aweme.upvote.detail.repostfeed.RepostFeedEntranceAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1402100mae implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws Throwable {
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
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) throws Throwable {
        C1396010mQp c1396010mQp = (C1396010mQp) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
        if (c1396010mQp.LLILZ != null) {
            c1396010mQp.LJJIIJ();
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        ViewTreeObserver viewTreeObserver;
        View view = ((C1368810lix) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLIZ;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1402100mae);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1402100mae, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ((C1368810lix) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LIZLLL().LLJJJ.postValue(Boolean.TRUE);
    }

    public static final void onGlobalLayout$10(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        View view = ((C1390090mHH) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLJ;
        TopSheetBehavior<C1CRB> topSheetBehavior = null;
        if (view == null) {
            view = null;
        }
        int height = view.getHeight();
        Integer num = ((C1390090mHH) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLJIJIL;
        if (num == null || num.intValue() != height) {
            ((C1390090mHH) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLJIJIL = Integer.valueOf(height);
            TopSheetBehavior<C1CRB> topSheetBehavior2 = ((C1390090mHH) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLJI;
            if (topSheetBehavior2 != null) {
                topSheetBehavior = topSheetBehavior2;
            }
            topSheetBehavior.setPeekHeight(height);
        }
    }

    public static final void onGlobalLayout$11(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        ViewTreeObserver viewTreeObserver = ((C1357490lQh) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILZIL.getViewTreeObserver();
        if (((C1357490lQh) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILZIL.getWidth() != 0) {
            C786410Ut5.C3(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1402100mae);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" flow.finalLines: ");
            sbLIZ.append(((C1357490lQh) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILZIL.getFinalLines());
            sbLIZ.append("  childViewCount ");
            sbLIZ.append(((C1357490lQh) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILZIL.getChildCount());
            sbLIZ.append("  flow.firstLineCount ");
            sbLIZ.append(((C1357490lQh) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILZIL.getFirstLineCount());
            C1344030l4z.LIZJ("CommentMultiAnchorTag", C2188811AlT.LIZIZ(sbLIZ));
            if (((C1357490lQh) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILZIL.getChildCount() > ((C1357490lQh) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILZIL.getFirstLineCount()) {
                C1351950lHl.LJIJJLI(((C1357490lQh) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILLJJLI);
                ((C1357490lQh) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LIZ(!r1.LLILZLL);
                return;
            }
            C1351950lHl.LJIJJ(((C1357490lQh) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILLJJLI);
        }
    }

    public static final void onGlobalLayout$12(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        int height;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View rootView;
        if (C06W7.LIZIZ(((DialogC1367590lgz) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLLILZLLLI)) {
            Rect rect = new Rect();
            View viewLJLIL = ((DialogC1367590lgz) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIL();
            if (viewLJLIL != null) {
                viewLJLIL.getWindowVisibleDisplayFrame(rect);
            }
            View viewLJLIL2 = ((DialogC1367590lgz) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIL();
            if (viewLJLIL2 != null && (rootView = viewLJLIL2.getRootView()) != null) {
                height = rootView.getHeight();
            } else {
                height = 0;
            }
            if (height - rect.bottom > ((double) height) * 0.15d) {
                DialogC1367590lgz dialogC1367590lgz = (DialogC1367590lgz) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
                if (!dialogC1367590lgz.LLLLII) {
                    dialogC1367590lgz.LLLLII = true;
                    FrameLayout frameLayoutLJLIIL = dialogC1367590lgz.LJLIIL();
                    if (frameLayoutLJLIIL != null && (layoutParams2 = frameLayoutLJLIIL.getLayoutParams()) != null) {
                        layoutParams2.height = -1;
                    }
                    FrameLayout frameLayoutLJLIIL2 = ((DialogC1367590lgz) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIIL();
                    if (frameLayoutLJLIIL2 != null) {
                        frameLayoutLJLIIL2.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            DialogC1367590lgz dialogC1367590lgz2 = (DialogC1367590lgz) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
            if (!dialogC1367590lgz2.LLLLII) {
                return;
            }
            dialogC1367590lgz2.LLLLII = false;
            FrameLayout frameLayoutLJLIIL3 = dialogC1367590lgz2.LJLIIL();
            if (frameLayoutLJLIIL3 != null && (layoutParams = frameLayoutLJLIIL3.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C14KQ.LJ(((DialogC1367590lgz) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLLILZLLLI) * 0.73f);
            }
            FrameLayout frameLayoutLJLIIL4 = ((DialogC1367590lgz) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIIL();
            if (frameLayoutLJLIIL4 == null) {
                return;
            }
            frameLayoutLJLIIL4.requestLayout();
        }
    }

    public static final void onGlobalLayout$13(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        int height;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View rootView;
        if (C06W7.LIZIZ(((DialogC1366380lf2) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLLILZLLLI)) {
            Rect rect = new Rect();
            View viewLJLIL = ((DialogC1366380lf2) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIL();
            if (viewLJLIL != null) {
                viewLJLIL.getWindowVisibleDisplayFrame(rect);
            }
            View viewLJLIL2 = ((DialogC1366380lf2) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIL();
            if (viewLJLIL2 != null && (rootView = viewLJLIL2.getRootView()) != null) {
                height = rootView.getHeight();
            } else {
                height = 0;
            }
            if (height - rect.bottom > ((double) height) * 0.15d) {
                DialogC1366380lf2 dialogC1366380lf2 = (DialogC1366380lf2) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
                if (!dialogC1366380lf2.LLLLIIIILLL) {
                    dialogC1366380lf2.LLLLIIIILLL = true;
                    FrameLayout frameLayoutLJLIIL = dialogC1366380lf2.LJLIIL();
                    if (frameLayoutLJLIIL != null && (layoutParams2 = frameLayoutLJLIIL.getLayoutParams()) != null) {
                        layoutParams2.height = -1;
                    }
                    FrameLayout frameLayoutLJLIIL2 = ((DialogC1366380lf2) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIIL();
                    if (frameLayoutLJLIIL2 != null) {
                        frameLayoutLJLIIL2.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            DialogC1366380lf2 dialogC1366380lf22 = (DialogC1366380lf2) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
            if (!dialogC1366380lf22.LLLLIIIILLL) {
                return;
            }
            dialogC1366380lf22.LLLLIIIILLL = false;
            FrameLayout frameLayoutLJLIIL3 = dialogC1366380lf22.LJLIIL();
            if (frameLayoutLJLIIL3 != null && (layoutParams = frameLayoutLJLIIL3.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C14KQ.LJ(((DialogC1366380lf2) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLLILZLLLI) * 0.73f);
            }
            FrameLayout frameLayoutLJLIIL4 = ((DialogC1366380lf2) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIIL();
            if (frameLayoutLJLIIL4 == null) {
                return;
            }
            frameLayoutLJLIIL4.requestLayout();
        }
    }

    public static final void onGlobalLayout$14(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        int height;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View rootView;
        if (C06W7.LIZIZ(((DialogC1366360lf0) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLLILZLLLI)) {
            Rect rect = new Rect();
            View viewLJLIL = ((DialogC1366360lf0) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIL();
            if (viewLJLIL != null) {
                viewLJLIL.getWindowVisibleDisplayFrame(rect);
            }
            View viewLJLIL2 = ((DialogC1366360lf0) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIL();
            if (viewLJLIL2 != null && (rootView = viewLJLIL2.getRootView()) != null) {
                height = rootView.getHeight();
            } else {
                height = 0;
            }
            if (height - rect.bottom > ((double) height) * 0.15d) {
                DialogC1366360lf0 dialogC1366360lf0 = (DialogC1366360lf0) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
                if (!dialogC1366360lf0.LLLL) {
                    dialogC1366360lf0.LLLL = true;
                    FrameLayout frameLayoutLJLIIL = dialogC1366360lf0.LJLIIL();
                    if (frameLayoutLJLIIL != null && (layoutParams2 = frameLayoutLJLIIL.getLayoutParams()) != null) {
                        layoutParams2.height = -1;
                    }
                    FrameLayout frameLayoutLJLIIL2 = ((DialogC1366360lf0) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIIL();
                    if (frameLayoutLJLIIL2 != null) {
                        frameLayoutLJLIIL2.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            DialogC1366360lf0 dialogC1366360lf02 = (DialogC1366360lf0) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
            if (!dialogC1366360lf02.LLLL) {
                return;
            }
            dialogC1366360lf02.LLLL = false;
            FrameLayout frameLayoutLJLIIL3 = dialogC1366360lf02.LJLIIL();
            if (frameLayoutLJLIIL3 != null && (layoutParams = frameLayoutLJLIIL3.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C14KQ.LJ(((DialogC1366360lf0) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLLILZLLLI) * 0.73f);
            }
            FrameLayout frameLayoutLJLIIL4 = ((DialogC1366360lf0) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJLIIL();
            if (frameLayoutLJLIIL4 == null) {
                return;
            }
            frameLayoutLJLIIL4.requestLayout();
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        ViewTreeObserver viewTreeObserver;
        FrameLayout frameLayout = ((RepostInputFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILZIL;
        if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1402100mae);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1402100mae, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ((RepostInputFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).PR(true);
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        ((C1356950lPp) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJJIJL();
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        ((C1356950lPp) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJJIJL();
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        C786410Ut5.C3(((RepostFeedEntranceAssem) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LJJIJL().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1402100mae);
        ((RepostFeedEntranceAssem) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).hp().vQ2();
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) throws Throwable {
        C1353650lKV c1353650lKV = (C1353650lKV) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
        if (c1353650lKV.LLLIIL != c1353650lKV.getWidth()) {
            C1353650lKV c1353650lKV2 = (C1353650lKV) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
            c1353650lKV2.LJJJZ(c1353650lKV2.getWidth(), "width_resize");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a3 A[PHI: r1
      0x01a3: PHI (r1v9 int) = (r1v8 int), (r1v18 int) binds: [B:94:0x019f, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a8 A[PHI: r1 r9
      0x01a8: PHI (r1v10 int) = (r1v9 int), (r1v17 int) binds: [B:97:0x01a4, B:16:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r9v1 int) = (r9v0 int), (r9v7 int) binds: [B:97:0x01a4, B:16:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onGlobalLayout$7(X.ViewTreeObserverOnGlobalLayoutListenerC1402100mae r24) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC1402100mae.onGlobalLayout$7(X.0mae):void");
    }

    public static final void onGlobalLayout$8(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        int measuredHeight;
        int height;
        FrameLayout frameLayout;
        View viewFindViewById;
        ViewTreeObserver viewTreeObserver;
        FrameLayout frameLayout2 = ((CommentLongPressFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLJJLIIIJLLLLLLLZ;
        if (frameLayout2 != null && (viewTreeObserver = frameLayout2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1402100mae);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1402100mae, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        RecyclerView recyclerView = ((CommentLongPressFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLIZLLLIL;
        int measuredHeight2 = 0;
        if (recyclerView != null && (viewFindViewById = recyclerView.findViewById(R.id.ebt)) != null) {
            measuredHeight = viewFindViewById.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        FrameLayout frameLayout3 = ((CommentLongPressFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLJJLIIIJLLLLLLLZ;
        if (frameLayout3 != null && frameLayout3.getVisibility() == 0 && (frameLayout = ((CommentLongPressFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLJJLIIIJLLLLLLLZ) != null) {
            height = frameLayout.getHeight();
        } else {
            height = 0;
        }
        CommentLongPressFragment commentLongPressFragment = (CommentLongPressFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
        int i = commentLongPressFragment.LLJLLIL + measuredHeight + height;
        if (commentLongPressFragment.LLJZ == -1) {
            View view = commentLongPressFragment.LLJJL;
            if (view != null) {
                measuredHeight2 = view.getMeasuredHeight();
            }
            commentLongPressFragment.LLJZ = measuredHeight2;
        }
        CommentLongPressFragment commentLongPressFragment2 = (CommentLongPressFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
        int i2 = commentLongPressFragment2.LLJZ;
        if (i > i2) {
            View view2 = commentLongPressFragment2.LLJJL;
            if (view2 != null) {
                C1351950lHl.LJIJI(i, view2);
                return;
            }
            return;
        }
        View view3 = commentLongPressFragment2.LLJJL;
        if (view3 == null) {
            return;
        }
        C1351950lHl.LJIJI(i2, view3);
    }

    public static final void onGlobalLayout$9(ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae) {
        Video2GifCutFragment video2GifCutFragment = (Video2GifCutFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
        if (video2GifCutFragment.LLJI == null) {
            return;
        }
        C786410Ut5.C3(video2GifCutFragment.LLILLL.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1402100mae);
        int height = ((Video2GifCutFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILLL.getHeight();
        int width = ((Video2GifCutFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLILLL.getWidth();
        int[] iArrLJ = C2486109oh.LJ(((Video2GifCutFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLJI.videoPath);
        if (iArrLJ[0] == 0) {
            int i = iArrLJ[2];
            int i2 = iArrLJ[3];
            VideoShare2GifEditContext videoShare2GifEditContext = ((Video2GifCutFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0).LLJI;
            videoShare2GifEditContext.originWidth = i;
            videoShare2GifEditContext.originHeight = i2;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (i < i2) {
                int i3 = (i * height) / i2;
                layoutParams.width = i3;
                layoutParams.height = height;
                layoutParams.leftMargin = (width - i3) / 2;
                layoutParams.topMargin = 0;
            } else {
                layoutParams.width = width;
                int i4 = (i2 * width) / i;
                layoutParams.height = i4;
                int i5 = (height - i4) / 2;
                layoutParams.topMargin = i5;
                if (i5 < 0) {
                    i5 = 0;
                }
                layoutParams.topMargin = i5;
                layoutParams.leftMargin = 0;
            }
            layoutParams.setMarginStart(layoutParams.leftMargin);
            Video2GifCutFragment video2GifCutFragment2 = (Video2GifCutFragment) viewTreeObserverOnGlobalLayoutListenerC1402100mae.l0;
            VideoShare2GifEditContext videoShare2GifEditContext2 = video2GifCutFragment2.LLJI;
            videoShare2GifEditContext2.targetWidth = layoutParams.width;
            videoShare2GifEditContext2.targetHeight = layoutParams.height;
            C786410Ut5.a6(video2GifCutFragment2.LLILLL, layoutParams);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1402100mae(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
