package X;

import Y.ARunnableS5S0301000_6;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.ui.TakoContentAssem$layoutManager$1;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S0202010_21;
import kotlin.jvm.internal.AwS122S0400000_27;
import kotlin.jvm.internal.AwS136S0201000_10;
import kotlin.jvm.internal.AwS236S0300000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yXL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861330yXL {
    public static final int LIZ(int i, Rect rect, RecyclerView recyclerView) {
        int measuredHeight;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            return 0;
        }
        View view = viewHolderFindViewHolderForAdapterPosition.itemView;
        if (view.getHeight() > 0) {
            measuredHeight = view.getHeight();
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            measuredHeight += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        if (rect == null) {
            rect = new Rect();
        }
        try {
            recyclerView.getDecoratedBoundsWithMargins(view, rect);
            measuredHeight = Math.max(measuredHeight, rect.height());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (measuredHeight < 0) {
            return 0;
        }
        return measuredHeight;
    }

    public static void LIZIZ(RecyclerView recyclerView, AwS136S0201000_10 awS136S0201000_10, Function1 function1) {
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(recyclerView);
        if (lifecycleOwner != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C324310CnV(recyclerView, lifecycleOwner, 200L, function1, awS136S0201000_10, 3, 100L, null), 3);
        }
    }

    public static final void LJFF(LinearLayoutManager linearLayoutManager, int i, double d) {
        linearLayoutManager.scrollToPositionWithOffset(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d))) + linearLayoutManager.getPaddingTop());
    }

    public static final int LIZJ(C1861310yXJ c1861310yXJ, SparseIntArray sparseIntArray, int i, Function1<? super Integer, Unit> function1) {
        int itemCount;
        View view;
        View view2;
        RecyclerView recyclerView = c1861310yXJ.LIZLLL;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = c1861310yXJ.LIZIZ;
        }
        int i2 = itemCount - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < i2; i5++) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i5);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                view = viewHolderFindViewHolderForAdapterPosition.itemView;
            } else {
                view = null;
            }
            if (!Intrinsics.LJFF(view, c1861310yXJ.LIZ)) {
                if (viewHolderFindViewHolderForAdapterPosition != null && (view2 = viewHolderFindViewHolderForAdapterPosition.itemView) != null && view2.getHeight() != 0) {
                    int i6 = sparseIntArray.get(i5);
                    sparseIntArray.put(i5, LIZ(i5, null, recyclerView));
                    i3 += sparseIntArray.get(i5) - i6;
                }
                i4 += sparseIntArray.get(i5);
            }
        }
        try {
            new Pair("start", Integer.valueOf(i));
            new Pair("sparseHeightList", sparseIntArray.toString());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i3 < 0) {
            function1.invoke(Integer.valueOf(i3));
        }
        return i4;
    }

    public static final void LIZLLL(RecyclerView recyclerView, int i, boolean z, Function1<? super View, Integer> function1) {
        View viewFindViewByPosition;
        if (recyclerView == null || !z) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || layoutManager == null || (viewFindViewByPosition = layoutManager.findViewByPosition(i)) == null) {
            return;
        }
        HandlerHook.viewPost(viewFindViewByPosition, new ARunnableS5S0301000_6(i, viewFindViewByPosition, recyclerView, function1, 0));
    }

    public static void LJI(LinearLayoutManager linearLayoutManager, int i, Context context, double d, int i2) {
        int i3;
        double d2 = d;
        if ((i2 & 4) != 0) {
            d2 = 100.0d;
        }
        if ((i2 & 8) != 0) {
            i3 = 100;
        } else {
            i3 = 0;
        }
        C13MK.LIZLLL(new AwS0S0202010_21(d2, i3, i, context, linearLayoutManager, 0));
    }

    public static void LJII(LinearLayoutManager linearLayoutManager, int i, Context context, double d, int i2) {
        int i3;
        double d2 = d;
        if ((i2 & 4) != 0) {
            d2 = 80.0d;
        }
        if ((i2 & 8) != 0) {
            i3 = 100;
        } else {
            i3 = 0;
        }
        C13MK.LIZLLL(new AwS0S0202010_21(d2, i3, i, context, linearLayoutManager, 1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean LJ(C1861350yXN c1861350yXN, TakoContentAssem$layoutManager$1 takoContentAssem$layoutManager$1, C19EG c19eg, int i, double d, boolean z, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, List list, InterfaceC1858000yRy interfaceC1858000yRy) {
        new Pair("pos", Integer.valueOf(i));
        C1022390ciD.LIZ(c1861350yXN.LIZ);
        new Pair("withAnimation", Boolean.valueOf(z));
        new Pair("shareMessageLocator", Boolean.FALSE);
        AwS136S0201000_10 awS136S0201000_10 = new AwS136S0201000_10(list, (List<? extends InterfaceC1858000yRy>) interfaceC1858000yRy, (InterfaceC1858000yRy) i, 4);
        int iLJIIIIZZ = 0;
        if (c19eg != null) {
            switch (C1861370yXP.LIZ[c1861350yXN.LIZ.ordinal()]) {
                case 1:
                    C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C325340CpA(c19eg, takoContentAssem$layoutManager$1, i, null), 3);
                    return true;
                case 2:
                    if (z && c1861350yXN.LJFF) {
                        C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C325320Cp8(c19eg, takoContentAssem$layoutManager$1, i, d, null), 3);
                        return true;
                    }
                    break;
                case 3:
                    if (z && viewOnAttachStateChangeListenerC20604515jv != null) {
                        LIZIZ(viewOnAttachStateChangeListenerC20604515jv, awS136S0201000_10, new AwS122S0400000_27(viewOnAttachStateChangeListenerC20604515jv, takoContentAssem$layoutManager$1, c19eg, c1861350yXN, 12));
                    }
                    return false;
                case 4:
                case 5:
                    if (z) {
                        if (c1861350yXN.LJFF) {
                            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                                LIZIZ(viewOnAttachStateChangeListenerC20604515jv, awS136S0201000_10, new AwS236S0300000_27(takoContentAssem$layoutManager$1, c19eg, c1861350yXN, 26));
                            }
                            return false;
                        }
                        LJFF(takoContentAssem$layoutManager$1, i, c1861350yXN.LIZLLL - ((double) 20));
                        return true;
                    }
                    break;
                case 6:
                    LJFF(takoContentAssem$layoutManager$1, i, c1861350yXN.LIZLLL - ((double) 20));
                    return true;
                case 7:
                    if (!c1861350yXN.LJFF || !z) {
                        return false;
                    }
                    if (viewOnAttachStateChangeListenerC20604515jv != null) {
                        LIZIZ(viewOnAttachStateChangeListenerC20604515jv, awS136S0201000_10, new AwS393S0200000_27(takoContentAssem$layoutManager$1, c19eg, 81));
                    }
                    return true;
                case 8:
                    return c1861350yXN.LIZIZ.invoke(takoContentAssem$layoutManager$1, c19eg, Integer.valueOf(i)).booleanValue();
                case BdTuring.TYPE_ECAF /* 9 */:
                    takoContentAssem$layoutManager$1.scrollToPosition(i);
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    if (d == 0.0d) {
                        takoContentAssem$layoutManager$1.scrollToPosition(i);
                        return true;
                    }
                    takoContentAssem$layoutManager$1.scrollToPositionWithOffset(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d))));
                    return true;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    if (viewOnAttachStateChangeListenerC20604515jv != null) {
                        C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
                        if (state != null) {
                            iLJIIIIZZ = state.LJIIIIZZ();
                        }
                        viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(iLJIIIIZZ);
                    }
                    return true;
            }
        }
        return false;
    }
}
