package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129910fVd extends C0DXR {
    public final RecyclerView LL;
    public final Context LLILLJJLI;
    public boolean LLILZIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(500));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 454));
    public int LLILZLL = -1;
    public int LLIZ = -1;

    public C1129910fVd(RunnableC781530UlD runnableC781530UlD) {
        this.LL = runnableC781530UlD;
        this.LLILLJJLI = runnableC781530UlD.getContext();
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int right;
        int right2;
        int bottom;
        View view;
        if (!this.LLILZIL) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.LLILZLL);
        if (this.LLIZ <= 0) {
            if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                bottom = view.getBottom();
            } else {
                bottom = 0;
            }
            this.LLIZ = bottom;
        }
        if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
            right = recyclerView.getRight();
        } else {
            right = 0;
        }
        if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
            right2 = recyclerView.getLeft();
        } else {
            right2 = recyclerView.getRight();
        }
        ((Drawable) this.LLILZ.getValue()).setBounds(new Rect(right, 0, right2, this.LLIZ));
        canvas.save();
        canvas.translate(0.0f, -recyclerView.computeVerticalScrollOffset());
        ((Drawable) this.LLILZ.getValue()).draw(canvas);
        canvas.restore();
    }
}
