package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0DSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339450DSl extends C0DXR {
    public List<Integer> LL = C13BV.INSTANCE;
    public final Paint LLILLJJLI;

    public C339450DSl(Context context) {
        int iIntValue;
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        this.LLILLJJLI = paint;
    }

    @Override // X.C0DXR
    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        LinearLayoutManager linearLayoutManager;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (adapter == null) {
                return;
            }
            int itemCount = adapter.getItemCount();
            if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            while (true) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition != null) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindViewByPosition);
                    if (childAdapterPosition == -1) {
                        float bottom = viewFindViewByPosition.getBottom() + viewFindViewByPosition.getTranslationY();
                        canvas.drawLine(0.0f, bottom, recyclerView.getWidth(), bottom, this.LLILLJJLI);
                    } else if (childAdapterPosition >= 0 && childAdapterPosition < itemCount) {
                        if (!this.LL.contains(Integer.valueOf(adapter.getItemViewType(childAdapterPosition))) && childAdapterPosition != c21673919s1.LIZIZ() - 1) {
                            ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
                            if ((layoutParams instanceof RecyclerView.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                float bottom2 = viewFindViewByPosition.getBottom() + viewFindViewByPosition.getTranslationY() + marginLayoutParams.bottomMargin;
                                canvas.drawLine(0.0f, bottom2, recyclerView.getWidth(), bottom2, this.LLILLJJLI);
                            }
                        }
                    }
                }
                if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                    iFindFirstVisibleItemPosition++;
                } else {
                    return;
                }
            }
        }
    }
}
