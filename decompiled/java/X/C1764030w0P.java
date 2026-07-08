package X;

import X.C042G;
import X.C0GZQ;
import X.C12DM;
import X.C13LP;
import X.C1764030w0P;
import X.C1C7U;
import X.C786410Ut5;
import Y.ARunnableS25S0210000_26;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.widget.SeaPdpSellingPointsVerticalCarouselView$CarouselHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764030w0P extends FrameLayout {
    public static final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108));
    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final float LLJJJ = C418440Gaw.LIZIZ(20);
    public static final C12DM LLJJJIL = new C12DM();
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
    public C042G LL;
    public SeaPdpSellingPointsGroup LLILLJJLI;
    public final List<SeaPdpSellingPointsItem> LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public volatile boolean LLJILJILJ;
    public AnimatorSet LLJILLL;
    public final LinearLayout LLJJ;
    public final LinkedList<C0GZQ> LLJJI;
    public final SeaPdpSellingPointsVerticalCarouselView$CarouselHandler LLJJIII;

    public final void LIZJ() {
        ViewGroup viewGroup;
        C0GZQ c0gzq;
        this.LL = null;
        this.LLILLJJLI = null;
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((SeaPdpSellingPointsItem) it2.next()).textSpan = null;
        }
        ((ArrayList) this.LLILLL).clear();
        LJ(this, false, true, 1);
        try {
            int childCount = this.LLJJ.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.LLJJ.getChildAt(i);
                if ((childAt instanceof C0GZQ) && (c0gzq = (C0GZQ) childAt) != null) {
                    c0gzq.setText((CharSequence) null);
                    Drawable background = c0gzq.getBackground();
                    if (background != null) {
                        background.setCallback(null);
                    }
                    c0gzq.setBackground(null);
                }
            }
            C786410Ut5.LJJJJJL(this.LLJJ);
            for (C0GZQ c0gzq2 : this.LLJJI) {
                c0gzq2.setText((CharSequence) null);
                Drawable background2 = c0gzq2.getBackground();
                if (background2 != null) {
                    background2.setCallback(null);
                }
                c0gzq2.setBackground(null);
            }
            this.LLJJI.clear();
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                return;
            }
            C786410Ut5.LJJJLZIJ(this, viewGroup);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZLLL() {
        boolean z;
        C042G c042g;
        if (!this.LLJI || this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        if (getVisibility() != 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", LLJJJ, 0.0f);
            long j = this.LLILZLL;
            C12DM c12dm = LLJJJIL;
            objectAnimatorOfFloat.setInterpolator(c12dm);
            objectAnimatorOfFloat.setDuration(j);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
            long j2 = this.LLILZLL;
            objectAnimatorOfFloat2.setInterpolator(c12dm);
            objectAnimatorOfFloat2.setDuration(j2);
            animatorSet.playTogether(C1697810uHb.LJIIJJI(objectAnimatorOfFloat, objectAnimatorOfFloat2));
            animatorSet.setDuration(500L);
            animatorSet.start();
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            z = true;
        } else {
            z = false;
        }
        if (((ArrayList) this.LLILLL).size() > this.LLILZ) {
            long j3 = z ? 500L : 0L;
            if (this.LLJILJILJ) {
                sendEmptyMessageDelayed(1, this.LLILZIL + j3);
            }
        }
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            int i = this.LLILZ;
            for (int i2 = 0; i2 < i; i2++) {
                View childAt = this.LLJJ.getChildAt(i2);
                if (childAt != null) {
                    int iLIZIZ = LIZIZ(i2);
                    SeaPdpSellingPointsItem seaPdpSellingPointsItem = (SeaPdpSellingPointsItem) C13LP.LJJJLZIJ(iLIZIZ, this.LLILLL);
                    if (seaPdpSellingPointsItem != null && (c042g = this.LL) != null) {
                        c042g.LIZ(childAt, iLIZIZ, seaPdpSellingPointsItem);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJ(this, false, false, 3);
    }

    public final int getItemHeightWithSpace() {
        return this.LLJILJIL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.widget.SeaPdpSellingPointsVerticalCarouselView$CarouselHandler] */
    public C1764030w0P(Context context) {
        super(context, null, 0);
        this.LLILLL = new ArrayList();
        this.LLILZ = 1;
        this.LLILZIL = 3000L;
        this.LLILZLL = 500L;
        this.LLIZ = LLJJJJ;
        this.LLIZLLLIL = true;
        this.LLJ = true;
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(LLJJIJI);
        layoutParams.setMarginEnd(LLJJIJIIJIL);
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(1);
        this.LLJJ = linearLayout;
        this.LLJJI = new LinkedList<>();
        this.LLJJIII = new BPEAHandler(this) { // from class: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.widget.SeaPdpSellingPointsVerticalCarouselView$CarouselHandler
            public final WeakReference<C1764030w0P> LL;

            {
                super(Looper.getMainLooper());
                this.LL = new WeakReference<>(this);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1764030w0P c1764030w0P;
                C042G c042g;
                C1C7U.LIZ("SeaPdpSellingPointsVerticalCarouselView$CarouselHandler@20f5.handleMessage");
                super.handleMessage(message);
                WeakReference<C1764030w0P> weakReference = this.LL;
                if (weakReference != null && (c1764030w0P = weakReference.get()) != null) {
                    if (message.what == 1 && c1764030w0P.LLJI && c1764030w0P.LLJILJILJ && ((ArrayList) c1764030w0P.LLILLL).size() > c1764030w0P.LLILZ) {
                        float f = 0.0f;
                        if (!c1764030w0P.LLJ) {
                            c1764030w0P.LLJIJIL = c1764030w0P.LIZIZ(1);
                            View childAt = c1764030w0P.LLJJ.getChildAt(0);
                            if (childAt != null) {
                                C786410Ut5.LJJL(childAt, c1764030w0P.LLJJ);
                                if (childAt instanceof C0GZQ) {
                                    c1764030w0P.LLJJI.add((C0GZQ) childAt);
                                }
                            }
                            int childCount = c1764030w0P.LLJJ.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                View childAt2 = c1764030w0P.LLJJ.getChildAt(i);
                                if (childAt2 != null) {
                                    C786410Ut5.ed(childAt2, 0.0f);
                                    C786410Ut5.T4(childAt2, 1.0f);
                                }
                            }
                            c1764030w0P.LIZ((SeaPdpSellingPointsItem) C13LP.LJJJLZIJ(c1764030w0P.LIZIZ(c1764030w0P.LLILZ), c1764030w0P.LLILLL));
                        } else {
                            c1764030w0P.LLJ = false;
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        int childCount2 = c1764030w0P.LLJJ.getChildCount();
                        int i2 = 0;
                        while (i2 < childCount2) {
                            View childAt3 = c1764030w0P.LLJJ.getChildAt(i2);
                            if (childAt3 != null) {
                                int i3 = C1764030w0P.LLJJIJI;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt3, "translationY", f, -c1764030w0P.getItemHeightWithSpace());
                                long j = c1764030w0P.LLILZLL;
                                C12DM c12dm = C1764030w0P.LLJJJIL;
                                objectAnimatorOfFloat.setInterpolator(c12dm);
                                objectAnimatorOfFloat.setDuration(j);
                                arrayList.add(objectAnimatorOfFloat);
                                if (i2 == 0) {
                                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt3, "alpha", 1.0f, 0.0f);
                                    long j2 = c1764030w0P.LLILZLL;
                                    objectAnimatorOfFloat2.setInterpolator(c12dm);
                                    objectAnimatorOfFloat2.setDuration(j2);
                                    arrayList.add(objectAnimatorOfFloat2);
                                } else if (i2 == c1764030w0P.LLJJ.getChildCount() - 1) {
                                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(childAt3, "alpha", 0.0f, 1.0f);
                                    long j3 = c1764030w0P.LLILZLL;
                                    objectAnimatorOfFloat3.setInterpolator(c12dm);
                                    objectAnimatorOfFloat3.setDuration(j3);
                                    arrayList.add(objectAnimatorOfFloat3);
                                } else {
                                    C786410Ut5.T4(childAt3, 1.0f);
                                }
                            }
                            i2++;
                            f = 0.0f;
                        }
                        animatorSet.playTogether(arrayList);
                        animatorSet.setDuration(c1764030w0P.LLILZLL);
                        animatorSet.start();
                        c1764030w0P.LLJILLL = animatorSet;
                        long j4 = c1764030w0P.LLILZLL;
                        if (c1764030w0P.LLJILJILJ) {
                            c1764030w0P.LLJJIII.sendEmptyMessageDelayed(1, c1764030w0P.LLILZIL + j4);
                        }
                        LinearLayout linearLayout2 = c1764030w0P.LLJJ;
                        View childAt4 = linearLayout2.getChildAt(linearLayout2.getChildCount() - 1);
                        if (childAt4 != null) {
                            int iLIZIZ = c1764030w0P.LIZIZ(c1764030w0P.LLILZ);
                            SeaPdpSellingPointsItem seaPdpSellingPointsItem = (SeaPdpSellingPointsItem) C13LP.LJJJLZIJ(iLIZIZ, c1764030w0P.LLILLL);
                            if (seaPdpSellingPointsItem != null && (c042g = c1764030w0P.LL) != null) {
                                c042g.LIZ(childAt4, iLIZIZ, seaPdpSellingPointsItem);
                            }
                        }
                        C1C7U.LIZIZ("SeaPdpSellingPointsVerticalCarouselView$CarouselHandler@20f5.handleMessage");
                        return;
                    }
                    C1C7U.LIZIZ("SeaPdpSellingPointsVerticalCarouselView$CarouselHandler@20f5.handleMessage");
                    return;
                }
                C1C7U.LIZIZ("SeaPdpSellingPointsVerticalCarouselView$CarouselHandler@20f5.handleMessage");
            }
        };
        addView(linearLayout);
        setClipChildren(false);
        int visibility = getVisibility();
        setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e A[PHI: r5
      0x013e: PHI (r5v1 int) = (r5v0 int), (r5v3 int) binds: [B:59:0x013a, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsItem r20) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1764030w0P.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsItem):void");
    }

    public final int LIZIZ(int i) {
        int size = ((ArrayList) this.LLILLL).size();
        if (size <= 0) {
            return -1;
        }
        return (this.LLJIJIL + i) % size;
    }

    public final void setItemHeightWithSpace(int i) {
        this.LLJILJIL = i;
    }

    public final boolean LJFF(SeaPdpSellingPointsGroup seaPdpSellingPointsGroup, boolean z, Function1<? super Integer, Unit> function1) {
        long jLongValue;
        long jLongValue2;
        int iLIZIZ;
        int i = 0;
        if (Intrinsics.LJFF(seaPdpSellingPointsGroup, this.LLILLJJLI)) {
            return false;
        }
        this.LLILLJJLI = seaPdpSellingPointsGroup;
        LJ(this, false, true, 1);
        LinearLayout linearLayout = this.LLJJ;
        LinkedList<C0GZQ> linkedList = this.LLJJI;
        while (linearLayout.getChildCount() > 0) {
            View childAt = linearLayout.getChildAt(0);
            C786410Ut5.LJJJLZIJ(childAt, linearLayout);
            if (childAt instanceof C0GZQ) {
                linkedList.add((C0GZQ) childAt);
            }
        }
        this.LLIZLLLIL = true;
        this.LLJI = false;
        this.LLJIJIL = 0;
        ((ArrayList) this.LLILLL).clear();
        List<SeaPdpSellingPointsItem> list = seaPdpSellingPointsGroup.sellingPoints;
        if (list != null) {
            ((ArrayList) this.LLILLL).addAll(C13LP.LJJJJLI(list));
        }
        if (((ArrayList) this.LLILLL).isEmpty()) {
            return true;
        }
        int iMin = Math.min(1, ((ArrayList) this.LLILLL).size());
        Integer num = seaPdpSellingPointsGroup.showNum;
        if (num != null) {
            iMin = C13LZ.LJ(num.intValue(), iMin, ((ArrayList) this.LLILLL).size());
        }
        this.LLILZ = iMin;
        Long l = seaPdpSellingPointsGroup.stayTime;
        if (l != null && l.longValue() > 0) {
            jLongValue = seaPdpSellingPointsGroup.stayTime.longValue();
        } else {
            jLongValue = 3000;
        }
        this.LLILZIL = jLongValue;
        Long l2 = seaPdpSellingPointsGroup.animDuration;
        if (l2 != null && l2.longValue() > 0) {
            jLongValue2 = seaPdpSellingPointsGroup.animDuration.longValue();
        } else {
            jLongValue2 = 500;
        }
        this.LLILZLL = jLongValue2;
        Integer num2 = seaPdpSellingPointsGroup.viewHeight;
        if (num2 != null && num2.intValue() > 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(seaPdpSellingPointsGroup.viewHeight));
        } else {
            iLIZIZ = LLJJJJ;
        }
        this.LLIZ = iLIZIZ;
        int visibility = getVisibility();
        setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, this);
        int i2 = this.LLILZ;
        if (i2 >= 0) {
            while (true) {
                LIZ((SeaPdpSellingPointsItem) C13LP.LJJJLZIJ(LIZIZ(i), this.LLILLL));
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        HandlerHook.viewPost(this.LLJJ, new ARunnableS25S0210000_26(this, function1, z, 0));
        return true;
    }

    public static void LJ(C1764030w0P c1764030w0P, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        c1764030w0P.LLJILJILJ = false;
        AnimatorSet animatorSet = c1764030w0P.LLJILLL;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        if (z2) {
            AnimatorSet animatorSet2 = c1764030w0P.LLJILLL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
        } else {
            AnimatorSet animatorSet3 = c1764030w0P.LLJILLL;
            if (animatorSet3 != null) {
                animatorSet3.end();
            }
        }
        c1764030w0P.LLJILLL = null;
        c1764030w0P.LLJJIII.removeCallbacksAndMessages(null);
        if (z && c1764030w0P.getVisibility() != 8) {
            int visibility = c1764030w0P.getVisibility();
            c1764030w0P.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1764030w0P);
        }
    }
}
