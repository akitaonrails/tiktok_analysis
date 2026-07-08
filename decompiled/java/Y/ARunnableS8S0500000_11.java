package Y;

import X.C03IT;
import X.C0STY;
import X.C0SXF;
import X.C1331660kl2;
import X.C19EG;
import X.C1C7U;
import X.C426750GoL;
import X.C692850RFr;
import X.C699370Rbz;
import X.C699390Rc1;
import X.C699810Rch;
import X.C720310SNh;
import X.C786410Ut5;
import X.EnumC112300bh;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS8S0500000_11 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (Intrinsics.LJFF(((C699370Rbz) this.l0).LIZIZ.get(((C699810Rch) this.l1).LIZ), ((C699390Rc1) this.l2).LIZ)) {
            ((C699370Rbz) this.l0).LIZIZ(((C699810Rch) this.l1).LIZ);
            ((View) this.l3).animate().cancel();
            if (((EnumC112300bh) this.l4) == EnumC112300bh.NONE) {
                C699370Rbz c699370Rbz = (C699370Rbz) this.l0;
                View view = (View) this.l3;
                c699370Rbz.getClass();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.height != 0) {
                    layoutParams.height = 0;
                    C786410Ut5.W5(view, layoutParams);
                }
                ((C699370Rbz) this.l0).LIZJ(((C699810Rch) this.l1).LIZ, ((C699390Rc1) this.l2).LIZ);
                return;
            }
            C699370Rbz c699370Rbz2 = (C699370Rbz) this.l0;
            View view2 = (View) this.l3;
            c699370Rbz2.getClass();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height == 0 && view2.getHeight() == 0) {
                ((C699370Rbz) this.l0).LIZJ(((C699810Rch) this.l1).LIZ, ((C699390Rc1) this.l2).LIZ);
                return;
            }
            C699370Rbz c699370Rbz3 = (C699370Rbz) this.l0;
            C699810Rch c699810Rch = (C699810Rch) this.l1;
            String str = c699810Rch.LIZ;
            View view3 = (View) this.l3;
            EnumC112300bh enumC112300bh = (EnumC112300bh) this.l4;
            AwS255S0300000_11 awS255S0300000_11 = new AwS255S0300000_11(c699370Rbz3, c699810Rch, (C699390Rc1) this.l2, 6);
            c699370Rbz3.getClass();
            if (enumC112300bh != EnumC112300bh.SLIDE_TO_BOTTOM) {
                awS255S0300000_11.invoke();
            } else {
                c699370Rbz3.LIZ(str, view3, false, awS255S0300000_11);
            }
        }
    }

    public final void LIZ$1() {
        int width;
        int iIntValue;
        int width2;
        int iIntValue2;
        int i;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        if (!C0SXF.LJIJI((Aweme) this.l0, false, true)) {
            Video video = ((Aweme) this.l0).getVideo();
            if (video != null) {
                C692850RFr c692850RFr = (C692850RFr) this.l1;
                View view = (View) this.l2;
                View view2 = (View) this.l3;
                ViewGroup viewGroup = (ViewGroup) this.l4;
                double width3 = video.getWidth();
                double height = video.getHeight();
                double d = width3 / height;
                float f = c692850RFr.LIZ / c692850RFr.LIZIZ;
                Number numberValueOf = viewGroup != null ? Float.valueOf(viewGroup.getWidth() / f) : null;
                if (f > d) {
                    if (numberValueOf == null) {
                        numberValueOf = Integer.valueOf(c692850RFr.LIZIZ);
                    }
                    iIntValue = numberValueOf.intValue();
                    width = (int) (d * ((double) iIntValue));
                } else {
                    width = viewGroup != null ? viewGroup.getWidth() : c692850RFr.LIZ;
                    iIntValue = (int) ((height / width3) * ((double) width));
                }
                if (view != null) {
                    C426750GoL.LJIIIZ(view, 0, 0, null, null, true, 12);
                }
                if (viewGroup != null) {
                    Integer numValueOf = Integer.valueOf((int) (viewGroup.getWidth() / f));
                    if (numValueOf.intValue() > 0) {
                        int iIntValue3 = numValueOf.intValue();
                        ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                        if (layoutParams3.height != iIntValue3) {
                            layoutParams3.height = iIntValue3;
                            C786410Ut5.W5(viewGroup, layoutParams3);
                        }
                    }
                }
                C692850RFr.LIZ(iIntValue, width, view);
                if (view2 != null) {
                    view2 = view2;
                    C426750GoL.LJIIIZ(view2, 0, 0, null, null, true, 12);
                }
                C692850RFr.LIZ(iIntValue, width, view2);
                return;
            }
            return;
        }
        Video video2 = ((Aweme) this.l0).getVideo();
        if (video2 != null) {
            C692850RFr c692850RFr2 = (C692850RFr) this.l1;
            View view3 = (View) this.l2;
            View view4 = (View) this.l3;
            ViewGroup viewGroup2 = (ViewGroup) this.l4;
            int width4 = video2.getWidth();
            int height2 = video2.getHeight();
            FakeLandscapeInfo fakeLandscapeInfo = video2.getFakeLandscapeInfo();
            c692850RFr2.getClass();
            float right = (fakeLandscapeInfo.getRight() - fakeLandscapeInfo.getLeft()) * width4;
            float bottom = (fakeLandscapeInfo.getBottom() - fakeLandscapeInfo.getTop()) * height2;
            float f2 = right / bottom;
            float f3 = c692850RFr2.LIZ / c692850RFr2.LIZIZ;
            Number numberValueOf2 = viewGroup2 != null ? Float.valueOf(viewGroup2.getWidth() / f3) : null;
            if (f3 > f2) {
                if (numberValueOf2 == null) {
                    numberValueOf2 = Integer.valueOf(c692850RFr2.LIZIZ);
                }
                iIntValue2 = numberValueOf2.intValue();
                width2 = (int) (f2 * iIntValue2);
            } else {
                width2 = viewGroup2 != null ? viewGroup2.getWidth() : c692850RFr2.LIZ;
                iIntValue2 = (int) ((bottom / right) * width2);
            }
            float right2 = width2 / (fakeLandscapeInfo.getRight() - fakeLandscapeInfo.getLeft());
            float bottom2 = iIntValue2 / (fakeLandscapeInfo.getBottom() - fakeLandscapeInfo.getTop());
            if (viewGroup2 != null) {
                Integer numValueOf2 = Integer.valueOf((int) (viewGroup2.getWidth() / f3));
                if (numValueOf2.intValue() > 0) {
                    int iIntValue4 = numValueOf2.intValue();
                    ViewGroup.LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
                    if (layoutParams4.height != iIntValue4) {
                        layoutParams4.height = iIntValue4;
                        C786410Ut5.W5(viewGroup2, layoutParams4);
                    }
                }
            }
            int i2 = (int) bottom2;
            int i3 = (int) right2;
            C692850RFr.LIZ(i2, i3, view3);
            ViewGroup.LayoutParams layoutParams5 = view3 != null ? view3.getLayoutParams() : null;
            if ((layoutParams5 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams5) != null) {
                layoutParams2.gravity = 8388659;
            }
            if (view3 != null) {
                i = 8388659;
                C426750GoL.LJIIIZ(view3, Integer.valueOf((int) (((viewGroup2 != null ? viewGroup2.getWidth() : c692850RFr2.LIZ) - right2) / 2)), Integer.valueOf((int) ((-bottom2) * fakeLandscapeInfo.getTop())), null, null, true, 12);
            } else {
                i = 8388659;
            }
            C692850RFr.LIZ(i2, i3, view4);
            ViewGroup.LayoutParams layoutParams6 = view4 != null ? view4.getLayoutParams() : null;
            if ((layoutParams6 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams6) != null) {
                layoutParams.gravity = i;
            }
            if (view4 != null) {
                C426750GoL.LJIIIZ(view4, Integer.valueOf((int) (((viewGroup2 != null ? viewGroup2.getWidth() : c692850RFr2.LIZ) - right2) / 2)), Integer.valueOf((int) ((-bottom2) * fakeLandscapeInfo.getTop())), null, null, true, 12);
            }
        }
    }

    public static final void run$0(ARunnableS8S0500000_11 aRunnableS8S0500000_11) {
        boolean zLIZ;
        C1C7U.LIZ("SearchPhotoTextPageHelper@d11d.enterPhotoModeFullPage$1");
        try {
            Bitmap bitmap = C720310SNh.LIZ;
            C720310SNh.LJII(C1331660kl2.LIZJ().LIZIZ((C03IT) aRunnableS8S0500000_11.l0));
            C0STY.LIZ.execute(new ARunnableS19S0400000_10((C19EG) aRunnableS8S0500000_11.l1, (VideoItemParams) aRunnableS8S0500000_11.l2, (PostModeDetailParams) aRunnableS8S0500000_11.l3, (Fragment) aRunnableS8S0500000_11.l4, 0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchPhotoTextPageHelper@d11d.enterPhotoModeFullPage$1");
    }

    public static final void run$1(ARunnableS8S0500000_11 aRunnableS8S0500000_11) {
        boolean zLIZ;
        C1C7U.LIZ("SlotRuntimeManager@76cd.handleSlotRemove$$inlined$runOnMain$1");
        try {
            aRunnableS8S0500000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SlotRuntimeManager@76cd.handleSlotRemove$$inlined$runOnMain$1");
    }

    public static final void run$2(ARunnableS8S0500000_11 aRunnableS8S0500000_11) {
        boolean zLIZ;
        C1C7U.LIZ("FeedLandscapeScreenHelper@bb58.tryResizeVideoAndPhoto$1");
        try {
            aRunnableS8S0500000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedLandscapeScreenHelper@bb58.tryResizeVideoAndPhoto$1");
    }

    public ARunnableS8S0500000_11(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
