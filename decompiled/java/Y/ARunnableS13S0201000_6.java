package Y;

import X.C1245110iVR;
import X.C12ES;
import X.C13LZ;
import X.C1591450rW3;
import X.C15DF;
import X.C1640100smW;
import X.C1664450tPn;
import X.C1720106oR;
import X.C1AV2;
import X.C1C7U;
import X.C20271714Tr;
import X.C2180521AVm;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C340640DXa;
import X.C418440Gaw;
import X.C424040Gjy;
import X.C450880HmA;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.tabbar.PdpTabBarAssem;
import com.ss.android.ugc.aweme.emoji.common.emojipagev2.optimizeemojirebinding.SystemSmallEmojiGridAdapterWithoutViewPager;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.SystemSmallEmojiGridAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS13S0201000_6 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int width = ((View) this.l0).getWidth() - this.i2;
        if (width == 0) {
            return;
        }
        ObjectAnimator objectAnimator = ((C15DF) this.l1).LLLLIIIILLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        float f = width;
        C786410Ut5.Jc((View) this.l0, f);
        C15DF c15df = (C15DF) this.l1;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) this.l0, (Property<View, Float>) View.TRANSLATION_X, f, 0.0f);
        C15DF c15df2 = (C15DF) this.l1;
        View view = (View) this.l0;
        objectAnimatorOfFloat.setDuration(c15df2.LLLLIILL);
        objectAnimatorOfFloat.setInterpolator(c15df2.LLLLIIL);
        objectAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6(view, 6));
        C786410Ut5.Pd(objectAnimatorOfFloat);
        c15df.LLLLIIIILLL = objectAnimatorOfFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.l0
            X.15Om r0 = (X.C20513015Om) r0
            boolean r0 = r0.LJIIIZ
            r6 = 0
            if (r0 == 0) goto L57
            java.lang.Object r0 = r7.l1
            X.15Oq r0 = (X.C20513415Oq) r0
            X.16F5 r0 = r0.LJIILLIIL
            int r0 = r0.getLineCount()
            r5 = 1
            if (r0 <= r5) goto L57
        L16:
            java.lang.Object r0 = r7.l1
            X.15Oq r0 = (X.C20513415Oq) r0
            android.view.View r1 = r0.LJIJI
            boolean r0 = r1 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L2b
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            if (r1 == 0) goto L2b
            if (r5 == 0) goto L55
            r0 = 16
        L28:
            r1.setGravity(r0)
        L2b:
            java.lang.Object r0 = r7.l1
            X.15Oq r0 = (X.C20513415Oq) r0
            android.view.View r4 = r0.LJIJI
            int r3 = r4.getPaddingStart()
            if (r5 == 0) goto L52
            r2 = 0
        L38:
            java.lang.Object r0 = r7.l1
            X.15Oq r0 = (X.C20513415Oq) r0
            android.view.View r0 = r0.LJIJI
            int r1 = r0.getPaddingEnd()
            if (r5 != 0) goto L4e
            java.lang.Object r0 = r7.l1
            X.15Oq r0 = (X.C20513415Oq) r0
            android.view.View r0 = r0.LJIJI
            int r6 = r0.getPaddingBottom()
        L4e:
            r4.setPadding(r3, r2, r1, r6)
            return
        L52:
            int r2 = r7.i2
            goto L38
        L55:
            r0 = 0
            goto L28
        L57:
            r5 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS13S0201000_6.LIZ$1():void");
    }

    public final void LIZ$2() {
        if (((RecyclerView) this.l0).getParent() != null) {
            SystemSmallEmojiGridAdapterWithoutViewPager systemSmallEmojiGridAdapterWithoutViewPager = (SystemSmallEmojiGridAdapterWithoutViewPager) this.l1;
            RecyclerView recyclerView = (RecyclerView) this.l0;
            int i = this.i2;
            C450880HmA c450880HmA = systemSmallEmojiGridAdapterWithoutViewPager.LLIZLLLIL;
            if (c450880HmA == null || !c450880HmA.LIZ) {
                recyclerView.addItemDecoration(new C340640DXa(systemSmallEmojiGridAdapterWithoutViewPager.LLILLJJLI, systemSmallEmojiGridAdapterWithoutViewPager.LLLIILIL()));
            } else {
                recyclerView.addItemDecoration(new C340640DXa(i, (int) (((((double) C12ES.LJIIJ(systemSmallEmojiGridAdapterWithoutViewPager.LL)) - (((double) systemSmallEmojiGridAdapterWithoutViewPager.LLJI) * 2.0d)) - ((double) (systemSmallEmojiGridAdapterWithoutViewPager.LLJIJIL * i))) / ((double) (i - 1)))));
            }
            C786410Ut5.LLIZLLLIL((RecyclerView) this.l0, 0);
        }
    }

    public final void LIZ$3() {
        SystemSmallEmojiGridAdapter systemSmallEmojiGridAdapter = (SystemSmallEmojiGridAdapter) this.l0;
        RecyclerView recyclerView = (RecyclerView) this.l1;
        int i = this.i2;
        C450880HmA c450880HmA = systemSmallEmojiGridAdapter.LLIZLLLIL;
        if (c450880HmA == null || !c450880HmA.LIZ) {
            recyclerView.addItemDecoration(new C340640DXa(systemSmallEmojiGridAdapter.LLILLJJLI, systemSmallEmojiGridAdapter.LLLIILIL()));
        } else {
            recyclerView.addItemDecoration(new C340640DXa(i, (int) (((((double) C12ES.LJIIJ(systemSmallEmojiGridAdapter.LL)) - (((double) systemSmallEmojiGridAdapter.LLJI) * 2.0d)) - ((double) (systemSmallEmojiGridAdapter.LLJIJIL * i))) / ((double) (i - 1)))));
        }
        C786410Ut5.LLIZLLLIL((RecyclerView) this.l1, 0);
    }

    public final void LIZ$4() {
        ViewGroup.LayoutParams layoutParams;
        Video video;
        Video video2;
        if (((SmartImageView) this.l0).getDrawable() == null || ((SmartImageView) this.l0).getWidth() <= 0 || ((SmartImageView) this.l0).getHeight() <= 0) {
            int i = this.i2;
            if (i < 10) {
                C1245110iVR c1245110iVR = (C1245110iVR) this.l1;
                int i2 = i + 1;
                SmartImageView smartImageView = c1245110iVR.LIZJ;
                if (smartImageView != null) {
                    HandlerHook.viewPost(smartImageView, new ARunnableS13S0201000_6(smartImageView, i2, c1245110iVR, 8));
                    return;
                }
                return;
            }
            return;
        }
        C1245110iVR c1245110iVR2 = (C1245110iVR) this.l1;
        SmartImageView smartImageView2 = (SmartImageView) this.l0;
        c1245110iVR2.getClass();
        Drawable drawable = smartImageView2.getDrawable();
        if (drawable != null) {
            FrameLayout frameLayout = c1245110iVR2.LIZLLL;
            float width = frameLayout != null ? frameLayout.getWidth() : smartImageView2.getWidth();
            FrameLayout frameLayout2 = c1245110iVR2.LIZLLL;
            float height = frameLayout2 != null ? frameLayout2.getHeight() : smartImageView2.getHeight();
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyOffsetToBackground containerWidth :");
            sbLIZ.append(width);
            sbLIZ.append(", containerHeight :");
            sbLIZ.append(height);
            C1720106oR.LJI("ProfileBgEditHelper", C2188811AlT.LIZIZ(sbLIZ));
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Aweme aweme = c1245110iVR2.LJJI;
            int width2 = (aweme == null || (video2 = aweme.getVideo()) == null) ? 0 : video2.getWidth();
            Aweme aweme2 = c1245110iVR2.LJJI;
            int height2 = (aweme2 == null || (video = aweme2.getVideo()) == null) ? 0 : video.getHeight();
            float f = intrinsicWidth > 0 ? intrinsicWidth : width2 > 0 ? width2 : 0.0f;
            float f2 = intrinsicHeight > 0 ? intrinsicHeight : height2 > 0 ? height2 : 0.0f;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("applyOffsetToBackground intrinsicWidth=");
            sbLIZ2.append(intrinsicWidth);
            sbLIZ2.append(" intrinsicHeight=");
            sbLIZ2.append(intrinsicHeight);
            sbLIZ2.append(" videoWidth=");
            sbLIZ2.append(width2);
            sbLIZ2.append(" videoHeight=");
            sbLIZ2.append(height2);
            sbLIZ2.append(" resolvedDrawableWidth=");
            sbLIZ2.append(f);
            sbLIZ2.append(" resolvedDrawableHeight=");
            sbLIZ2.append(f2);
            C1720106oR.LJI("ProfileBgEditHelper", C2188811AlT.LIZIZ(sbLIZ2));
            if (width <= 0.0f || height <= 0.0f || f <= 0.0f || f2 <= 0.0f) {
                return;
            }
            float fMax = Math.max(width / f, height / f2);
            float f3 = f * fMax;
            float f4 = f2 * fMax;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) f3, (int) f4);
            layoutParams2.gravity = 49;
            ViewGroup.LayoutParams layoutParams3 = smartImageView2.getLayoutParams();
            if (layoutParams3 == null || layoutParams3.width != layoutParams2.width || (layoutParams = smartImageView2.getLayoutParams()) == null || layoutParams.height != layoutParams2.height) {
                C786410Ut5.c6(smartImageView2, layoutParams2);
            }
            float fLIZLLL = (height / 2.0f) - (C13LZ.LIZLLL(c1245110iVR2.LJJ, 0.0f, 1.0f) * f4);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("applyOffsetToBackground rawTranslateY :");
            sbLIZ3.append(fLIZLLL);
            C1720106oR.LJI("ProfileBgEditHelper", C2188811AlT.LIZIZ(sbLIZ3));
            float f5 = height - f4;
            float fLIZLLL2 = C13LZ.LIZLLL(fLIZLLL, f5, 0.0f);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("applyOffsetToBackground scale=");
            sbLIZ4.append(fMax);
            sbLIZ4.append(" scaledWidth=");
            sbLIZ4.append(f3);
            sbLIZ4.append(" scaledHeight=");
            sbLIZ4.append(f4);
            sbLIZ4.append(" minTranslateY=");
            sbLIZ4.append(f5);
            sbLIZ4.append(" translateY=");
            sbLIZ4.append(fLIZLLL2);
            C1720106oR.LJI("ProfileBgEditHelper", C2188811AlT.LIZIZ(sbLIZ4));
            smartImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            C786410Ut5.gd(smartImageView2, fLIZLLL2);
        }
    }

    public final void LIZ$5() {
        FrameLayout frameLayout = ((C1591450rW3) this.l0).LIZJ;
        if (frameLayout != null) {
            int height = (frameLayout.getHeight() - this.i2) / 2;
            C1591450rW3 c1591450rW3 = (C1591450rW3) this.l0;
            TuxIconView tuxIconView = (TuxIconView) this.l1;
            if (c1591450rW3.LJIIIZ) {
                tuxIconView.setPadding(0, height, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), height);
            } else {
                tuxIconView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), height, 0, height);
            }
        }
    }

    public final void LIZ$6() {
        View viewFindViewByPosition = ((LinearLayoutManager) this.l0).findViewByPosition(this.i2);
        if (viewFindViewByPosition == null) {
            C1640100smW.LJIILLIIL((C1640100smW) this.l1, this.i2);
            return;
        }
        RecyclerView recyclerView = ((C1640100smW) this.l1).LIZ;
        ((C1640100smW) this.l1).LIZ.smoothScrollBy(((viewFindViewByPosition.getLeft() + viewFindViewByPosition.getRight()) / 2) - ((recyclerView.getLeft() + recyclerView.getRight()) / 2), 0);
    }

    public final void LIZ$7() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((RecyclerView) this.l0).findViewHolderForAdapterPosition(this.i2);
        RecyclerView.LayoutManager layoutManager = null;
        View view = (!(viewHolderFindViewHolderForAdapterPosition instanceof C1664450tPn) || viewHolderFindViewHolderForAdapterPosition == null) ? null : viewHolderFindViewHolderForAdapterPosition.itemView;
        if ((view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != null) {
            layoutManager = recyclerView.getLayoutManager();
        }
        if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        ((Function2) this.l1).invoke(Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition()), Integer.valueOf(linearLayoutManager.findLastCompletelyVisibleItemPosition()));
    }

    public static final void run$0(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchBasicScoreComponent@a46c.animateRightExtraContentShift$1");
        try {
            aRunnableS13S0201000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchBasicScoreComponent@a46c.animateRightExtraContentShift$1");
    }

    public static final void run$1(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("EnigmaPaywallFragment@49a1.bindCard$5");
        try {
            aRunnableS13S0201000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EnigmaPaywallFragment@49a1.bindCard$5");
    }

    public static final void run$10(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("FilterListView@ad8a.scrollCenterHorizontal$1");
        try {
            aRunnableS13S0201000_6.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterListView@ad8a.scrollCenterHorizontal$1");
    }

    public static final void run$11(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("AEVoiceChangeCategoryView@2176.findFistAndLastCompletelyVisibleItemPosition$1$1");
        try {
            aRunnableS13S0201000_6.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AEVoiceChangeCategoryView@2176.findFistAndLastCompletelyVisibleItemPosition$1$1");
    }

    public static final void run$12(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("PdpCarouselInnerIndicatorAssem@ce2b.updateIndicatorStyleOpt$1$1$2");
        try {
            if (((C424040Gjy) aRunnableS13S0201000_6.l0).getParent() != null) {
                C424040Gjy c424040Gjy = (C424040Gjy) aRunnableS13S0201000_6.l0;
                Integer num = (Integer) aRunnableS13S0201000_6.l1;
                if (num != null && num.intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c424040Gjy.LJIIJ(aRunnableS13S0201000_6.i2, z);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpCarouselInnerIndicatorAssem@ce2b.updateIndicatorStyleOpt$1$1$2");
    }

    public static final void run$13(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("ComponentPriorityMaker@4add.visibleComponentViewOnly$1");
        try {
            C2180521AVm.LIZLLL((View) aRunnableS13S0201000_6.l0, aRunnableS13S0201000_6.i2, (C1AV2) aRunnableS13S0201000_6.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ComponentPriorityMaker@4add.visibleComponentViewOnly$1");
    }

    public static final void run$2(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PollCreateFragment@b279.applyFocusToOption$1");
        try {
            if (((PollCreateFragment) aRunnableS13S0201000_6.l0).isAdded() && ((PollCreateFragment) aRunnableS13S0201000_6.l0).getView() != null && ((View) aRunnableS13S0201000_6.l1).getParent() != null) {
                ((PollCreateFragment) aRunnableS13S0201000_6.l0).nS();
                ((PollCreateFragment) aRunnableS13S0201000_6.l0).RR(aRunnableS13S0201000_6.i2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PollCreateFragment@b279.applyFocusToOption$1");
    }

    public static final void run$3(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PollCreateFragment@b279.applyFocusToOption$2$1");
        try {
            if (((PollCreateFragment) aRunnableS13S0201000_6.l0).isAdded() && ((PollCreateFragment) aRunnableS13S0201000_6.l0).getView() != null && ((View) aRunnableS13S0201000_6.l1).getParent() != null) {
                ((PollCreateFragment) aRunnableS13S0201000_6.l0).RR(aRunnableS13S0201000_6.i2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PollCreateFragment@b279.applyFocusToOption$2$1");
    }

    public static final void run$4(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("SystemSmallEmojiGridAdapterWithoutViewPager@dc39.setup$3");
        try {
            aRunnableS13S0201000_6.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SystemSmallEmojiGridAdapterWithoutViewPager@dc39.setup$3");
    }

    public static final void run$5(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("SystemSmallEmojiGridAdapter@742d.setup$3");
        try {
            aRunnableS13S0201000_6.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SystemSmallEmojiGridAdapter@742d.setup$3");
    }

    public static final void run$6(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PdpTabBarAssem@21bc.applyEdgeFadeForeground$1");
        try {
            int width = ((PdpTabBarAssem) aRunnableS13S0201000_6.l0).LJJIJL().getWidth();
            LayerDrawable layerDrawable = (LayerDrawable) aRunnableS13S0201000_6.l1;
            int i = width - aRunnableS13S0201000_6.i2;
            if (i < 0) {
                i = 0;
            }
            layerDrawable.setLayerInset(0, 0, 0, i, 0);
            LayerDrawable layerDrawable2 = (LayerDrawable) aRunnableS13S0201000_6.l1;
            int i2 = width - aRunnableS13S0201000_6.i2;
            if (i2 < 0) {
                i2 = 0;
            }
            layerDrawable2.setLayerInset(1, i2, 0, 0, 0);
            ((PdpTabBarAssem) aRunnableS13S0201000_6.l0).LJJIJL().setForeground((LayerDrawable) aRunnableS13S0201000_6.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpTabBarAssem@21bc.applyEdgeFadeForeground$1");
    }

    public static final void run$7(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("ImageChooseAdapter@8d6d.handleImageSelected$1$1");
        try {
            C786410Ut5.LJLLLLLL(4, (View) aRunnableS13S0201000_6.l0);
            C786410Ut5.T4((View) aRunnableS13S0201000_6.l0, 1.0f);
            ((C20271714Tr) aRunnableS13S0201000_6.l1).notifyItemChanged(aRunnableS13S0201000_6.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageChooseAdapter@8d6d.handleImageSelected$1$1");
    }

    public static final void run$8(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBgEditHelper@6e35.scheduleApplyOffsetToBackground$1");
        try {
            aRunnableS13S0201000_6.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBgEditHelper@6e35.scheduleApplyOffsetToBackground$1");
    }

    public static final void run$9(ARunnableS13S0201000_6 aRunnableS13S0201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("BackToFirstIconPresenterOpt@d53f.addBackFirstIcon$1$1");
        try {
            aRunnableS13S0201000_6.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BackToFirstIconPresenterOpt@d53f.addBackFirstIcon$1$1");
    }

    public ARunnableS13S0201000_6(View view, C1AV2 c1av2, int i) {
        this.$t = i;
        this.l0 = view;
        this.i2 = 8;
        this.l1 = c1av2;
    }

    public ARunnableS13S0201000_6(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
