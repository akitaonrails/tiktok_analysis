package X;

import Y.ARunnableS127S0100000_27;
import Y.ARunnableS73S0200000_4;
import Y.ARunnableS96S0200000_27;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yXK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class ViewOnLayoutChangeListenerC1861320yXK implements View.OnLayoutChangeListener {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public C1861310yXJ LLILLJJLI;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLJILJIL;
    public boolean LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJJIL;
    public final Rect LL = new Rect();
    public final SparseIntArray LLILLL = new SparseIntArray();
    public boolean LLILZLL = true;
    public boolean LLIZ = true;
    public int LLIZLLLIL = -1;
    public int LLJ = (int) (((double) Resources.getSystem().getDisplayMetrics().heightPixels) * 0.7d);
    public final int LLJI = C341940Daq.LIZ(60.0d);
    public final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    public final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
    public SparseIntArray LLJJIJI = new SparseIntArray();
    public boolean LLJJJJ = true;

    public final RecyclerView LIZLLL() {
        C1861310yXJ c1861310yXJ = this.LLILLJJLI;
        if (c1861310yXJ != null) {
            return c1861310yXJ.LIZLLL;
        }
        return null;
    }

    public final void LJFF() {
        View view;
        C1861310yXJ c1861310yXJ = this.LLILLJJLI;
        if (c1861310yXJ == null || this.LLILZ) {
            return;
        }
        RecyclerView recyclerView = c1861310yXJ.LIZLLL;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : c1861310yXJ.LIZIZ;
        if (itemCount < 2 && (view = c1861310yXJ.LIZ) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = Math.max(0, C1861220yXA.LIZ);
            } else {
                layoutParams = null;
            }
            C786410Ut5.W5(view, layoutParams);
        }
        int iMax = Math.max(LIZJ(c1861310yXJ), C1861220yXA.LIZ);
        boolean z = (c1861310yXJ.LJFF == iMax || c1861310yXJ.LIZIZ == -1) ? false : true;
        Pair[] pairArr = {C1022390ciD.LIZ(c1861310yXJ.LJIIIIZZ.LIZ), new Pair("targetPos", Integer.valueOf(c1861310yXJ.LIZIZ)), new Pair("totalCount", Integer.valueOf(itemCount)), new Pair("rvHeight", Integer.valueOf(recyclerView.getHeight())), new Pair("oldFooterH", Integer.valueOf(c1861310yXJ.LJFF)), new Pair("newFooterH", Integer.valueOf(iMax)), new Pair("applied", Boolean.valueOf(z))};
        if (!z) {
            Arrays.copyOf(pairArr, 7);
        } else {
            Arrays.copyOf(pairArr, 7);
            C1861220yXA.LIZ(c1861310yXJ, iMax, new AwS393S0200000_27(c1861310yXJ, this, 85));
        }
    }

    public final void LIZ(boolean z) {
        int i;
        View view;
        C1861310yXJ c1861310yXJ = this.LLILLJJLI;
        if (c1861310yXJ == null || c1861310yXJ.LJIIIIZZ.LIZ == EnumC1861380yXQ.MIDDLE_PAGE_TOP_ALIGN_X_DP) {
            return;
        }
        int height = c1861310yXJ.LIZLLL.getHeight();
        new Pair("rvHeight", Integer.valueOf(height));
        if (height != 0) {
            C1861310yXJ c1861310yXJ2 = this.LLILLJJLI;
            if (c1861310yXJ2 != null) {
                i = c1861310yXJ2.LJFF;
            } else {
                i = 0;
            }
            this.LLJJI = i;
            C1861220yXA.LIZ(this.LLILLJJLI, height + 1, new AwS606S0100000_27(this, 347));
            this.LLILZ = true;
            if (z) {
                C1861310yXJ c1861310yXJ3 = this.LLILLJJLI;
                if (c1861310yXJ3 != null) {
                    view = c1861310yXJ3.LIZLLL;
                } else {
                    return;
                }
            } else {
                C1861310yXJ c1861310yXJ4 = this.LLILLJJLI;
                if (c1861310yXJ4 == null) {
                    return;
                } else {
                    view = c1861310yXJ4.LIZ;
                }
            }
            if (view != null) {
                HandlerHook.viewPostDelay(view, new ARunnableS127S0100000_27(this, 38), 100L);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int LIZJ(C1861310yXJ c1861310yXJ) {
        int itemCount;
        int iLIZIZ;
        int iLIZ;
        View view;
        int i;
        int height;
        View view2;
        View view3;
        int height2;
        View view4;
        View view5;
        View view6;
        int height3;
        View view7;
        int itemCount2;
        View view8;
        View view9;
        int itemCount3;
        View view10;
        int height4;
        View view11;
        View view12;
        int iLIZIZ2;
        int iLIZIZ3;
        RecyclerView recyclerView = c1861310yXJ.LIZLLL;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = c1861310yXJ.LIZIZ;
        }
        int i2 = 0;
        int i3 = 20;
        switch (C1861470yXZ.LIZ[c1861310yXJ.LJIIIIZZ.LIZ.ordinal()]) {
            case 1:
                int i4 = itemCount - 1;
                int i5 = 0;
                for (int i6 = c1861310yXJ.LIZIZ + 1; i6 < i4; i6++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i6);
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        view11 = viewHolderFindViewHolderForAdapterPosition.itemView;
                    } else {
                        view11 = null;
                    }
                    if (!Intrinsics.LJFF(view11, c1861310yXJ.LIZ)) {
                        if (viewHolderFindViewHolderForAdapterPosition != null && (view12 = viewHolderFindViewHolderForAdapterPosition.itemView) != null && view12.getHeight() != 0) {
                            this.LLILLL.put(i6, C1861330yXL.LIZ(i6, null, recyclerView));
                        }
                        i5 += this.LLILLL.get(i6);
                    }
                }
                if (!c1861310yXJ.LJII && !this.LLJILJIL) {
                    height4 = c1861310yXJ.LIZLLL.getHeight();
                } else {
                    height4 = c1861310yXJ.LJI;
                }
                C07QB.LIZ.getClass();
                if ((((Number) C07QB.LIZIZ.getValue()).intValue() & 2) != 0) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    iLIZIZ = ((height4 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1861220yXA.LIZIZ)))) - i5) - ((Number) C1918907fP.LIZLLL.getValue()).intValue();
                    iLIZ = C341940Daq.LIZ(10.0d);
                } else {
                    iLIZIZ = (height4 - this.LLJI) - i5;
                    iLIZ = C341940Daq.LIZ(10.0d);
                }
                return iLIZIZ + iLIZ;
            case 2:
                int iLIZJ = C1861330yXL.LIZJ(c1861310yXJ, this.LLILLL, c1861310yXJ.LIZIZ + 1, new AwS393S0200000_27(c1861310yXJ, this, 82));
                if (this.LLJILLL) {
                    HandlerHook.viewPostDelay(c1861310yXJ.LIZLLL, new ARunnableS96S0200000_27(this, c1861310yXJ, 15), 50L);
                }
                int height5 = c1861310yXJ.LIZLLL.getHeight() + this.LLJILJILJ;
                int height6 = c1861310yXJ.LJI;
                if (height5 >= height6) {
                    height6 = c1861310yXJ.LIZLLL.getHeight();
                }
                return ((height6 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(c1861310yXJ.LJIIIIZZ.LIZLLL)))) - iLIZJ) - this.LLJIJIL;
            case 3:
                C07QJ.LIZ.getClass();
                if (C07QJ.LIZIZ()) {
                    RecyclerView recyclerView2 = c1861310yXJ.LIZLLL;
                    AbstractC21673619ry adapter2 = recyclerView2.getAdapter();
                    if (adapter2 != null) {
                        itemCount3 = adapter2.getItemCount();
                    } else {
                        itemCount3 = c1861310yXJ.LIZIZ;
                    }
                    int i7 = itemCount3 - 1;
                    for (int i8 = c1861310yXJ.LIZIZ; i8 < i7; i8++) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(i8);
                        if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                            view10 = viewHolderFindViewHolderForAdapterPosition2.itemView;
                        } else {
                            view10 = null;
                        }
                        if (!Intrinsics.LJFF(view10, c1861310yXJ.LIZ)) {
                            int iLIZ2 = C1861330yXL.LIZ(i8, null, recyclerView2);
                            if (iLIZ2 > 0) {
                                int i9 = this.LLILLL.get(i8);
                                if (i9 == 0) {
                                    if (iLIZ2 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220))) {
                                        this.LLILLL.put(i8, iLIZ2);
                                    }
                                } else if (Math.abs(iLIZ2 - i9) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)) && i9 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220))) {
                                    new Pair("pos", Integer.valueOf(i8));
                                    new Pair("cached", Integer.valueOf(i9));
                                    new Pair("current", Integer.valueOf(iLIZ2));
                                } else {
                                    this.LLILLL.put(i8, iLIZ2);
                                }
                            }
                            i2 += this.LLILLL.get(i8);
                        }
                    }
                } else {
                    RecyclerView recyclerView3 = c1861310yXJ.LIZLLL;
                    AbstractC21673619ry adapter3 = recyclerView3.getAdapter();
                    if (adapter3 != null) {
                        itemCount2 = adapter3.getItemCount();
                    } else {
                        itemCount2 = c1861310yXJ.LIZIZ;
                    }
                    int i10 = itemCount2 - 1;
                    i2 = 0;
                    for (int i11 = c1861310yXJ.LIZIZ; i11 < i10; i11++) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = recyclerView3.findViewHolderForAdapterPosition(i11);
                        if (viewHolderFindViewHolderForAdapterPosition3 != null) {
                            view8 = viewHolderFindViewHolderForAdapterPosition3.itemView;
                        } else {
                            view8 = null;
                        }
                        if (!Intrinsics.LJFF(view8, c1861310yXJ.LIZ)) {
                            if (viewHolderFindViewHolderForAdapterPosition3 != null && (view9 = viewHolderFindViewHolderForAdapterPosition3.itemView) != null && view9.getHeight() != 0) {
                                this.LLILLL.put(i11, C1861330yXL.LIZ(i11, null, recyclerView3));
                            }
                            i2 += this.LLILLL.get(i11);
                        }
                    }
                }
                return (c1861310yXJ.LIZLLL.getHeight() - this.LLJI) - i2;
            case 4:
                int iLIZJ2 = C1861330yXL.LIZJ(c1861310yXJ, this.LLILLL, c1861310yXJ.LIZIZ, new AwS393S0200000_27(c1861310yXJ, this, 83));
                if (this.LLJILLL) {
                    HandlerHook.viewPostDelay(c1861310yXJ.LIZLLL, new ARunnableS96S0200000_27(this, c1861310yXJ, 16), 50L);
                }
                int height7 = c1861310yXJ.LIZLLL.getHeight() + this.LLJILJILJ;
                int height8 = c1861310yXJ.LJI;
                if (height7 >= height8) {
                    height8 = c1861310yXJ.LIZLLL.getHeight();
                }
                C1861350yXN c1861350yXN = c1861310yXJ.LJIIIIZZ;
                int i12 = c1861350yXN.LJ;
                if (i12 != 0) {
                    i3 = i12;
                }
                return (((height8 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(c1861350yXN.LIZLLL)))) - iLIZJ2) - this.LLJIJIL) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
            case 5:
                int iLIZJ3 = C1861330yXL.LIZJ(c1861310yXJ, this.LLILLL, c1861310yXJ.LIZIZ, AFwS231S0000000_3.get$arr$(129));
                int height9 = c1861310yXJ.LIZLLL.getHeight();
                int iLIZIZ4 = (height9 - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(c1861310yXJ.LJIIIIZZ.LIZLLL))) + this.LLJIJIL)) - iLIZJ3;
                new Pair("h", Integer.valueOf(height9));
                new Pair("xDp", Double.valueOf(c1861310yXJ.LJIIIIZZ.LIZLLL));
                new Pair("totalHeight", Integer.valueOf(iLIZJ3));
                new Pair("rawFooter", Integer.valueOf(iLIZIZ4));
                int i13 = C1861220yXA.LIZ;
                if (iLIZIZ4 >= 0) {
                    i2 = iLIZIZ4;
                }
                return Math.max(i13, i2);
            case 6:
                int iLIZJ4 = C1861330yXL.LIZJ(c1861310yXJ, this.LLILLL, c1861310yXJ.LIZIZ, AFwS231S0000000_3.get$arr$(129));
                int i14 = c1861310yXJ.LJIIIIZZ.LJ;
                if (i14 != 0) {
                    i3 = i14;
                }
                if (this.LLILZIL || !this.LLJJIJIL) {
                    int i15 = c1861310yXJ.LJI;
                    if (c1861310yXJ.LIZLLL.getHeight() + this.LLJILJILJ < c1861310yXJ.LJI && (!this.LLJJJIL || !this.LLJJJ)) {
                        this.LLILZIL = false;
                    }
                    iLIZIZ2 = ((i15 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(c1861310yXJ.LJIIIIZZ.LIZLLL)))) - iLIZJ4) - this.LLJIJIL;
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
                    return iLIZIZ2 + iLIZIZ3;
                }
                return 0;
            case 7:
                if (this.LLJJIJIL) {
                    if (this.LLILZIL) {
                        int iLIZJ5 = C1861330yXL.LIZJ(c1861310yXJ, this.LLILLL, c1861310yXJ.LIZIZ, AFwS231S0000000_3.get$arr$(129));
                        int i16 = c1861310yXJ.LJI;
                        if (c1861310yXJ.LIZLLL.getHeight() + this.LLJILJILJ < c1861310yXJ.LJI && (!this.LLJJJIL || !this.LLJJJ)) {
                            this.LLILZIL = false;
                        }
                        if (iLIZJ5 == 0) {
                            iLIZJ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
                        }
                        if (this.LLILLL.get(c1861310yXJ.LIZIZ) == 0) {
                            iLIZJ5 += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        }
                        iLIZIZ2 = (i16 - iLIZJ5) - this.LLJIJIL;
                        iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
                        return iLIZIZ2 + iLIZIZ3;
                    }
                } else {
                    int iLIZJ6 = C1861330yXL.LIZJ(c1861310yXJ, this.LLILLL, c1861310yXJ.LIZIZ + 1, AFwS231S0000000_3.get$arr$(129));
                    if (!this.LLJJJJJIL) {
                        return (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(340)) - iLIZJ6) - this.LLJIJIL;
                    }
                }
                return 0;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            default:
                return 0;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(c1861310yXJ.LJIIIIZZ.LIZLLL)));
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return c1861310yXJ.LJIIIIZZ.LIZJ.invoke(c1861310yXJ, recyclerView, Integer.valueOf(this.LLJI)).intValue();
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return c1861310yXJ.LJFF;
            case 14:
                int i17 = this.LLJJI - this.LLJJ;
                int i18 = this.LLJ;
                if (i17 > i18) {
                    i17 = i18;
                }
                this.LLJJI = i17;
                this.LLJJ = 0;
                return i17;
            case 15:
                int i19 = itemCount - 1;
                i = 0;
                for (int i20 = c1861310yXJ.LIZIZ; i20 < i19; i20++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition4 = recyclerView.findViewHolderForAdapterPosition(i20);
                    if (viewHolderFindViewHolderForAdapterPosition4 != null) {
                        view5 = viewHolderFindViewHolderForAdapterPosition4.itemView;
                    } else {
                        view5 = null;
                    }
                    if (!Intrinsics.LJFF(view5, c1861310yXJ.LIZ)) {
                        if (viewHolderFindViewHolderForAdapterPosition4 != null && (view6 = viewHolderFindViewHolderForAdapterPosition4.itemView) != null && view6.getHeight() != 0) {
                            SparseIntArray sparseIntArray = this.LLILLL;
                            if (viewHolderFindViewHolderForAdapterPosition4 != null && (view7 = viewHolderFindViewHolderForAdapterPosition4.itemView) != null) {
                                height3 = view7.getHeight();
                            } else {
                                height3 = 0;
                            }
                            sparseIntArray.put(i20, height3);
                        }
                        i += this.LLILLL.get(i20);
                    }
                }
                height = c1861310yXJ.LIZLLL.getHeight();
                return height - i;
            case 16:
                int i21 = itemCount - 1;
                i = 0;
                for (int i22 = c1861310yXJ.LIZIZ + 1; i22 < i21; i22++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition5 = recyclerView.findViewHolderForAdapterPosition(i22);
                    if (viewHolderFindViewHolderForAdapterPosition5 != null) {
                        view2 = viewHolderFindViewHolderForAdapterPosition5.itemView;
                    } else {
                        view2 = null;
                    }
                    if (!Intrinsics.LJFF(view2, c1861310yXJ.LIZ)) {
                        if (viewHolderFindViewHolderForAdapterPosition5 != null && (view3 = viewHolderFindViewHolderForAdapterPosition5.itemView) != null && view3.getHeight() != 0) {
                            SparseIntArray sparseIntArray2 = this.LLILLL;
                            if (viewHolderFindViewHolderForAdapterPosition5 != null && (view4 = viewHolderFindViewHolderForAdapterPosition5.itemView) != null) {
                                height2 = view4.getHeight();
                            } else {
                                height2 = 0;
                            }
                            sparseIntArray2.put(i22, height2);
                        }
                        i += this.LLILLL.get(i22);
                    }
                }
                if (!c1861310yXJ.LJII && !this.LLJILJIL) {
                    height = c1861310yXJ.LIZLLL.getHeight();
                } else {
                    height = c1861310yXJ.LJI;
                }
                return height - i;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                int i23 = itemCount - 1;
                int iLIZ3 = 0;
                for (int i24 = c1861310yXJ.LIZIZ; i24 < i23; i24++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition6 = recyclerView.findViewHolderForAdapterPosition(i24);
                    if (viewHolderFindViewHolderForAdapterPosition6 != null) {
                        view = viewHolderFindViewHolderForAdapterPosition6.itemView;
                    } else {
                        view = null;
                    }
                    if (!Intrinsics.LJFF(view, c1861310yXJ.LIZ)) {
                        iLIZ3 += C1861330yXL.LIZ(i24, this.LL, c1861310yXJ.LIZLLL);
                    }
                }
                return Math.max(((c1861310yXJ.LIZLLL.getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((int) c1861310yXJ.LJIIIIZZ.LIZLLL)))) - iLIZ3) - this.LLJIJIL, 0);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                if (c1861310yXJ.LJIIIIZZ.LIZLLL > 0.0d) {
                    return Math.max((c1861310yXJ.LIZLLL.getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((int) c1861310yXJ.LJIIIIZZ.LIZLLL)))) - this.LLJIJIL, 0);
                }
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(141));
                iLIZ = this.LLJIJIL;
                return iLIZIZ + iLIZ;
        }
    }

    public final void LIZIZ(final int i, boolean z, boolean z2) {
        final RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (z2) {
            return;
        }
        if (z && this.LLIZ) {
            this.LLIZ = false;
            C1861310yXJ c1861310yXJ = this.LLILLJJLI;
            if (c1861310yXJ != null && (recyclerView2 = c1861310yXJ.LIZLLL) != null) {
                HandlerHook.viewPostDelay(recyclerView2, new ARunnableS73S0200000_4(recyclerView2, recyclerView2.getContext(), 23), 500L);
                return;
            }
            return;
        }
        if (this.LLILZLL) {
            this.LLIZLLLIL = i;
            this.LLILZLL = false;
            C1861310yXJ c1861310yXJ2 = this.LLILLJJLI;
            if (c1861310yXJ2 != null && (recyclerView = c1861310yXJ2.LIZLLL) != null) {
                final int iFindLastVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
                if (iFindLastVisibleItemPosition >= this.LLIZLLLIL && !this.LLILZIL) {
                    new Pair("willScroll", Boolean.FALSE);
                    new Pair("pos", Integer.valueOf(i));
                    new Pair("currentLast", Integer.valueOf(iFindLastVisibleItemPosition));
                } else {
                    HandlerHook.viewPostDelay(recyclerView, new Runnable() { // from class: X.0yXM
                        public final void LIZ() {
                            LinearLayoutManager linearLayoutManager;
                            try {
                                AbstractC21673619ry adapter = recyclerView.getAdapter();
                                int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 2;
                                C07QB.LIZ.getClass();
                                if ((((Number) C07QB.LIZIZ.getValue()).intValue() & 2) != 0) {
                                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                                        C1861330yXL.LJII(linearLayoutManager, itemCount, recyclerView.getContext(), C1861220yXA.LIZIZ, 8);
                                    }
                                } else {
                                    recyclerView.smoothScrollToPosition(itemCount);
                                }
                                new Pair("willScroll", Boolean.TRUE);
                                new Pair("pos", Integer.valueOf(i));
                                new Pair("currentLast", Integer.valueOf(iFindLastVisibleItemPosition));
                                new Pair("endPos", Integer.valueOf(itemCount));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AdjustablePaddingTargetFooter@578.checkFirstSugState$2$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AdjustablePaddingTargetFooter@578.checkFirstSugState$2$1");
                        }
                    }, 500L);
                }
                this.LLIZLLLIL = -1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(int r15, java.lang.String r16, X.C1861350yXN r17, boolean r18) {
        /*
            r14 = this;
            r8 = 0
            r14.LLJJ = r8
            r3 = 0
            r2 = 1
            r11 = r17
            r7 = r16
            r6 = r15
            if (r18 == 0) goto L4b
            X.0yXJ r0 = r14.LLILLJJLI
            if (r0 == 0) goto L49
            X.0yXN r0 = r0.LJIIIIZZ
        L12:
            if (r0 != r11) goto L6a
        L14:
            r5 = 1
        L15:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "pos"
            r1.<init>(r0, r4)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "id"
            r1.<init>(r0, r7)
            X.0yXQ r0 = r11.LIZ
            X.C1022390ciD.LIZ(r0)
            double r0 = r11.LIZLLL
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "xDp"
            r1.<init>(r0, r4)
            r0 = r5 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "applied"
            r1.<init>(r0, r4)
            if (r5 == 0) goto L6c
            return r8
        L49:
            r0 = r3
            goto L12
        L4b:
            X.0yXJ r1 = r14.LLILLJJLI
            if (r1 == 0) goto L6a
            int r0 = r1.LIZIZ
            if (r0 != r6) goto L6a
            java.lang.String r0 = r1.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 == 0) goto L6a
            X.0yXJ r0 = r14.LLILLJJLI
            if (r0 == 0) goto L68
            X.0yXN r0 = r0.LJIIIIZZ
        L61:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r11)
            if (r0 == 0) goto L6a
            goto L14
        L68:
            r0 = r3
            goto L61
        L6a:
            r5 = 0
            goto L15
        L6c:
            r14.LLJILLL = r2
            X.0yXJ r4 = r14.LLILLJJLI
            if (r4 == 0) goto L7c
            r5 = 0
            r13 = 761(0x2f9, float:1.066E-42)
            r9 = r8
            r10 = r8
            r12 = r8
            X.0yXJ r3 = X.C1861310yXJ.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L7c:
            r14.LLILLJJLI = r3
            X.0yXQ r1 = r11.LIZ
            X.0yXQ r0 = X.EnumC1861380yXQ.MIDDLE_PAGE_TOP_ALIGN_X_DP
            if (r1 != r0) goto L86
            r14.LLILZIL = r8
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLayoutChangeListenerC1861320yXK.LJ(int, java.lang.String, X.0yXN, boolean):boolean");
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        C1861310yXJ c1861310yXJ;
        RecyclerView recyclerView;
        EnumC1861380yXQ enumC1861380yXQ;
        C1861350yXN c1861350yXN;
        AbstractC21673619ry adapter;
        RecyclerView recyclerView2;
        C1861310yXJ c1861310yXJ2 = this.LLILLJJLI;
        if (c1861310yXJ2 != null && (recyclerView2 = c1861310yXJ2.LIZLLL) != null) {
            layoutManager = recyclerView2.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null && (c1861310yXJ = this.LLILLJJLI) != null && (recyclerView = c1861310yXJ.LIZLLL) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition != -1 && iFindLastVisibleItemPosition >= iFindFirstVisibleItemPosition) {
                if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    while (true) {
                        int iLIZ = C1861330yXL.LIZ(iFindFirstVisibleItemPosition, null, recyclerView);
                        recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                        if (iLIZ > 0 && ((adapter = recyclerView.getAdapter()) == null || iFindFirstVisibleItemPosition + 1 != adapter.getItemCount())) {
                            this.LLILLL.put(iFindFirstVisibleItemPosition, iLIZ);
                        }
                        C1861310yXJ c1861310yXJ3 = this.LLILLJJLI;
                        if (c1861310yXJ3 != null && (c1861350yXN = c1861310yXJ3.LJIIIIZZ) != null) {
                            enumC1861380yXQ = c1861350yXN.LIZ;
                        } else {
                            enumC1861380yXQ = null;
                        }
                        if (enumC1861380yXQ == EnumC1861380yXQ.MESSAGE_UPDATE_AND_CHANGE_FOOTER && c1861310yXJ3 != null && c1861310yXJ3.LIZIZ == iFindFirstVisibleItemPosition && this.LLJJIII) {
                            int i9 = this.LLJJIJI.get(iFindFirstVisibleItemPosition);
                            new Pair("pos", Integer.valueOf(iFindFirstVisibleItemPosition));
                            new Pair("oldHeight", Integer.valueOf(i9));
                            new Pair("newHeight", Integer.valueOf(iLIZ));
                            int i10 = iLIZ - i9;
                            new Pair("diff", Integer.valueOf(i10));
                            this.LLJJ += i10;
                            this.LLJJIJI.put(iFindFirstVisibleItemPosition, iLIZ);
                        }
                        if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                            break;
                        } else {
                            iFindFirstVisibleItemPosition++;
                        }
                    }
                }
                int i11 = this.LLJJ;
                if (i11 != 0) {
                    new Pair("heightDiff", Integer.valueOf(i11));
                }
            }
        }
        C1861310yXJ c1861310yXJ4 = this.LLILLJJLI;
        if (c1861310yXJ4 != null) {
            int height = c1861310yXJ4.LIZLLL.getHeight();
            int i12 = this.LLJILJILJ + height;
            int i13 = c1861310yXJ4.LJI;
            if (i12 < i13 && (!this.LLJJJIL || !this.LLJJJ)) {
                this.LLJJJJJIL = true;
            }
            int iMax = Math.max(height, i13);
            if (iMax > c1861310yXJ4.LJI) {
                this.LLILLJJLI = C1861310yXJ.LIZ(c1861310yXJ4, null, 0, null, 0, iMax, false, null, false, 959);
            }
            if (this.LLJILJILJ + height >= iMax) {
                this.LLILLJJLI = C1861310yXJ.LIZ(c1861310yXJ4, null, 0, null, 0, height, false, null, false, 959);
            }
        }
        LJFF();
    }
}
