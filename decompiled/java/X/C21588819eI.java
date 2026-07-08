package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19eI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21588819eI extends C0DXR {
    public final Context LL;
    public final C21588919eJ LLILLJJLI;

    public C21588819eI(Context context, C21588919eJ c21588919eJ) {
        this.LL = context;
        this.LLILLJJLI = c21588919eJ;
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i = 0;
        for (Object obj : new C2189691Amt(recyclerView, 1)) {
            int i2 = i + 1;
            if (i >= 0) {
                View view = (View) obj;
                if (i != recyclerView.getChildCount() - 1) {
                    float bottom = view.getBottom() + this.LLILLJJLI.LIZJ;
                    Paint paint = new Paint();
                    paint.setColor(C960203pA.LIZ(this.LLILLJJLI.LIZIZ, this.LL));
                    canvas.drawRect(view.getLeft(), bottom, view.getRight(), bottom + this.LLILLJJLI.LIZ, paint);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) != c21673919s1.LIZIZ() - 1) {
            rect.bottom = this.LLILLJJLI.LIZLLL;
        }
    }
}
