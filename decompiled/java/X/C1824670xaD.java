package X;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824670xaD {
    public static final void LIZIZ(RecyclerView recyclerView, C343110Dcj c343110Dcj) {
        for (int itemDecorationCount = recyclerView.getItemDecorationCount() - 1; -1 < itemDecorationCount; itemDecorationCount--) {
            if (Intrinsics.LJFF(recyclerView.getItemDecorationAt(itemDecorationCount).getClass(), C343110Dcj.class)) {
                recyclerView.removeItemDecorationAt(itemDecorationCount);
            }
        }
        recyclerView.addItemDecoration(c343110Dcj);
    }

    public static final void LIZJ(C1835860xsG c1835860xsG, AbstractC1824980xai abstractC1824980xai) {
        TuxTextView tuxTextView;
        Typeface typefaceLIZJ = C1119920fFW.LIZJ(12.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, c1835860xsG.getContext());
        if (abstractC1824980xai != null && (tuxTextView = abstractC1824980xai.LLJJJIL) != null) {
            tuxTextView.setTypeface(typefaceLIZJ, 2);
        }
    }

    public static final <T extends View> void LIZ(ViewGroup viewGroup, Class<T> cls, List<T> list) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (cls.isInstance(childAt)) {
                ((ArrayList) list).add(cls.cast(childAt));
            }
            if (childAt instanceof ViewGroup) {
                LIZ((ViewGroup) childAt, cls, list);
            }
        }
    }
}
