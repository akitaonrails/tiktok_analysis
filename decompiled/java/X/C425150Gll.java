package X;

import X.C0IDI;
import X.C21673919s1;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Gll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425150Gll extends RecyclerView {
    public final ArrayList<String> LL;

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    public void setIsBlockClick(boolean z) {
        C434670H2r c434670H2r;
        AbstractC21673619ry adapter = getAdapter();
        if ((adapter instanceof C434670H2r) && (c434670H2r = (C434670H2r) adapter) != null) {
            c434670H2r.LLJILLL = z;
        }
    }

    public void setOnClickItem(Function2<? super String, ? super Integer, Unit> function2) {
        C434670H2r c434670H2r;
        AbstractC21673619ry adapter = getAdapter();
        if ((adapter instanceof C434670H2r) && (c434670H2r = (C434670H2r) adapter) != null) {
            c434670H2r.LLILZ = function2;
        }
    }

    public void setSelectedIndex(int i) {
        C434670H2r c434670H2r;
        AbstractC21673619ry adapter = getAdapter();
        if ((adapter instanceof C434670H2r) && (c434670H2r = (C434670H2r) adapter) != null) {
            c434670H2r.LLLFZ(i);
        }
    }

    public void setTabsData(List<String> list) {
        C434670H2r c434670H2r;
        this.LL.clear();
        this.LL.addAll(list);
        String str = (String) C13LP.LJJJLL(list);
        if (str == null) {
            str = "Test";
        }
        int size = 0;
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setTuxFont(52);
        tuxTextView.setMaxLines(1);
        tuxTextView.setText(str);
        tuxTextView.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        tuxTextView.setGravity(17);
        C786410Ut5.R6(tuxTextView, new RecyclerView.LayoutParams(-2, -2));
        tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(10, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        C1744700vVE.LJIIIIZZ(tuxTextView.getMeasuredHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), this);
        AbstractC21673619ry adapter = getAdapter();
        if ((adapter instanceof C434670H2r) && (c434670H2r = (C434670H2r) adapter) != null) {
            if (!list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                double dMeasureText = 0.0d;
                while (it2.hasNext()) {
                    dMeasureText += (double) c434670H2r.LLJIJIL.measureText(it2.next());
                }
                int iLIZIZ = ((int) dMeasureText) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) * list.size()) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * (list.size() - 1)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                int i = c434670H2r.LLJILJIL;
                if (iLIZIZ < i) {
                    size = (i - iLIZIZ) / list.size();
                }
            }
            c434670H2r.LLJILJILJ = size;
            c434670H2r.LLJI.clear();
            c434670H2r.LLJI.addAll(list);
            c434670H2r.notifyDataSetChanged();
        }
    }

    public C425150Gll(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C425150Gll(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new ArrayList<>();
        setItemAnimator(null);
        setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.filtertab.ui.SearchTabRecyclerView$OffsetLinearLayoutManager
            public final Context LL;

            {
                super(context, 0, false);
                this.LL = context;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i2) {
                C0IDI c0idi = new C0IDI(this.LL, 0);
                c0idi.LIZ = i2;
                startSmoothScroll(c0idi);
            }
        });
        addItemDecoration(new C0DXR() { // from class: X.0GhT
            public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition == -1) {
                    return;
                }
                if (!C426750GoL.LIZLLL(context)) {
                    if (childAdapterPosition != 0) {
                        rect.left = this.LL;
                    } else {
                        rect.left = this.LLILLJJLI;
                    }
                    if (childAdapterPosition == this.LL.size() - 1) {
                        rect.right = this.LLILLL;
                        return;
                    }
                    return;
                }
                if (childAdapterPosition != 0) {
                    rect.right = this.LL;
                } else {
                    rect.right = this.LLILLJJLI;
                }
                if (childAdapterPosition != this.LL.size() - 1) {
                    return;
                }
                rect.left = this.LLILLL;
            }
        });
        setAdapter(new C434670H2r(context, this));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
