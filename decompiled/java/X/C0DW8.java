package X;

import Y.AsS31S0100000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0DW8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DW8 extends RecyclerView {
    public int LL;
    public int LLILLJJLI;
    public List<String> LLILLL;
    public int LLILZ;

    public final List<String> getDataSet() {
        return this.LLILLL;
    }

    public final int getMCurrentPositon() {
        return this.LLILZ;
    }

    public final int getMItemHeight() {
        return this.LL;
    }

    public final int getMWheelSize() {
        return this.LLILLJJLI;
    }

    public static int LIZJ(float f) {
        if (Math.abs(f) > 2.0f) {
            if (Math.abs(f) < 12.0f) {
                if (f > 0.0f) {
                    return 2;
                }
                return -2;
            }
            f /= 6;
        }
        return (int) f;
    }

    public final void setData(List<String> list) {
        C339640DTe c339640DTe;
        this.LLILLL = list;
        AbstractC21673619ry adapter = getAdapter();
        if ((adapter instanceof C339640DTe) && (c339640DTe = (C339640DTe) adapter) != null) {
            c339640DTe.LL = list;
            c339640DTe.notifyDataSetChanged();
        }
        AbstractC21673619ry adapter2 = getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    public final void setDataSet(List<String> list) {
        this.LLILLL = list;
    }

    public final void setMCurrentPositon(int i) {
        this.LLILZ = i;
    }

    public final void setMItemHeight(int i) {
        this.LL = i;
    }

    public final void setMWheelSize(int i) {
        this.LLILLJJLI = i;
    }

    public final void setWheelSize(int i) {
        this.LLILLJJLI = i;
        View viewSd = C786410Ut5.Sd(R.layout.gqa, C786410Ut5.ne(getContext()), null);
        C786410Ut5.W5(viewSd, new ViewGroup.LayoutParams(-1, -2));
        viewSd.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.LL = viewSd.getMeasuredHeight();
        getLayoutParams().height = this.LL * this.LLILLJJLI;
        AbstractC21673619ry adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public C0DW8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0DW8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ArrayList arrayList = new ArrayList();
        this.LLILLL = arrayList;
        setAdapter(new C339640DTe(arrayList));
        addOnScrollListener(new AsS31S0100000_4(this, 0));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
