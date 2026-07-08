package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gnh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426350Gnh extends RecyclerView {
    public final C434680H2s LL;
    public final C424790GlB LLILLJJLI;
    public C426370Gnj LLILLL;

    public final Map<Integer, View> getVisibleItems() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int childAdapterPosition = getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1) {
                linkedHashMap.put(Integer.valueOf(childAdapterPosition), childAt);
            }
        }
        return linkedHashMap;
    }

    public final void LIZJ(C426370Gnj c426370Gnj) {
        if (Intrinsics.LJFF(this.LLILLL, c426370Gnj)) {
            return;
        }
        this.LLILLL = c426370Gnj;
        List<C21376318l7> list = c426370Gnj.LIZ;
        if (list.isEmpty()) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        int visibility2 = getVisibility();
        boolean z = false;
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
        this.LL.LLLI(list);
        C424790GlB c424790GlB = this.LLILLJJLI;
        int i = c424790GlB.LL;
        int i2 = c426370Gnj.LIZIZ;
        if (i != i2) {
            c424790GlB.LL = i2;
            z = true;
        }
        boolean z2 = c424790GlB.LLILLJJLI;
        boolean z3 = c426370Gnj.LIZJ;
        if (z2 != z3) {
            c424790GlB.LLILLJJLI = z3;
            c424790GlB.LLILLL = C1308910kAL.LIZJ(C424790GlB.LLIZ, getContext());
        } else if (!z) {
            return;
        }
        invalidateItemDecorations();
    }

    public final void LIZLLL(boolean z) {
        List<C21376318l7> list;
        C426370Gnj c426370Gnj = this.LLILLL;
        if (c426370Gnj != null) {
            list = c426370Gnj.LIZ;
        } else {
            list = null;
        }
        int i = 0;
        if ((list == null || list.isEmpty()) && 1 != 0) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
        } else {
            if (!z) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, this);
        }
    }

    public final void setListener(InterfaceC430130Gtn interfaceC430130Gtn) {
        this.LL.LLILLJJLI = interfaceC430130Gtn;
    }

    public C426350Gnh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C426350Gnh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C434680H2s c434680H2s = new C434680H2s();
        this.LL = c434680H2s;
        C424790GlB c424790GlB = new C424790GlB();
        this.LLILLJJLI = c424790GlB;
        setItemAnimator(null);
        setNestedScrollingEnabled(false);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        addItemDecoration(c424790GlB);
        setAdapter(c434680H2s);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
