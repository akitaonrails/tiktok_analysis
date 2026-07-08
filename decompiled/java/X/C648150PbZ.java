package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0PbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648150PbZ extends C0DXR {
    public final LifecycleOwner LL;
    public final RecyclerView LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final Paint LLILZLL;

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        C21681919tJ c21681919tJ;
        Iterator<View> it2 = new C09RD(recyclerView).iterator();
        while (it2.hasNext()) {
            ViewGroup.LayoutParams layoutParams = it2.next().getLayoutParams();
            if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null && c21681919tJ.LLILLJJLI == 1) {
                float f = 4;
                canvas.drawRect(r2.getLeft() - C339190DRl.LIZ(f), r2.getTop() - C339190DRl.LIZ(f), r2.getRight() + C339190DRl.LIZ(f), r2.getBottom(), this.LLILZLL);
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        GridLayoutManager gridLayoutManager;
        int i;
        int i2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if ((adapter instanceof AbstractC683560Qra) && ((AbstractC683560Qra) adapter).LL != null) {
            if (childAdapterPosition == 0) {
                return;
            } else {
                childAdapterPosition++;
            }
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            AbstractC214823195h abstractC214823195h = gridLayoutManager.LLIZ;
            int i3 = gridLayoutManager.LLILLJJLI;
            int iLJ = abstractC214823195h.LJ(childAdapterPosition, i3);
            int iLJFF = abstractC214823195h.LJFF(childAdapterPosition);
            boolean zLIZIZ = C444960Hcc.LIZIZ();
            if (iLJ == 0) {
                i = this.LLILZ;
            } else {
                int i4 = this.LLILLL;
                i = i4 - ((iLJ * i4) / i3);
            }
            int i5 = iLJ + 1;
            if (i5 / i3 == 1) {
                i2 = this.LLILZ;
            } else {
                i2 = (i5 * this.LLILLL) / i3;
            }
            if (iLJFF != i3) {
                if (!zLIZIZ) {
                    rect.left = i;
                    rect.right = i2;
                } else {
                    rect.right = i;
                    rect.left = i2;
                }
                rect.top = this.LLILZIL;
            }
        }
    }

    public /* synthetic */ C648150PbZ(LifecycleOwner lifecycleOwner, RecyclerView recyclerView, Context context, int i, int i2, int i3) {
        this(lifecycleOwner, recyclerView, context, i, i2, i3, null);
    }

    public C648150PbZ(LifecycleOwner lifecycleOwner, RecyclerView recyclerView, Context context, int i, int i2, int i3, Integer num) {
        int iIntValue;
        Integer numLIZJ;
        this.LL = lifecycleOwner;
        this.LLILLJJLI = recyclerView;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        recyclerView.addOnChildAttachStateChangeListener(new C626210OhH(this));
        Paint paint = new Paint();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, context);
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            if (C07GI.LIZ() && (numLIZJ = C1308910kAL.LIZJ(R.attr.ok, context)) != null) {
                iIntValue = numLIZJ.intValue();
            }
        }
        paint.setColor(iIntValue);
        paint.setStyle(Paint.Style.FILL);
        this.LLILZLL = paint;
    }
}
