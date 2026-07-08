package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19eG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21588619eG extends C0DXR {
    public static final /* synthetic */ int LLILLL = 0;
    public final int LL;
    public final Paint LLILLJJLI = new Paint();

    public C21588619eG(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        C21588719eH c21588719eH;
        int bottom;
        int bottom2;
        for (View view : new C2189691Amt(recyclerView, 2)) {
            if (view.getTag(R.id.egk) != null) {
                Object tag = view.getTag(R.id.egk);
                if ((tag instanceof C21588719eH) && (c21588719eH = (C21588719eH) tag) != null) {
                    int left = view.getLeft();
                    int right = view.getRight();
                    if (c21588719eH.LJIIIIZZ) {
                        if (c21588719eH.LJ == 48) {
                            bottom2 = view.getTop() - c21588719eH.LIZ;
                        } else {
                            bottom2 = view.getBottom();
                        }
                        int i = c21588719eH.LIZ + bottom2;
                        this.LLILLJJLI.setColor(0);
                        canvas.drawRect(left, bottom2, right, i, this.LLILLJJLI);
                    }
                    if (c21588719eH.LJI) {
                        if (c21588719eH.LIZLLL == 48) {
                            bottom = view.getTop() - c21588719eH.LJFF;
                        } else {
                            bottom = view.getBottom();
                        }
                        int i2 = c21588719eH.LJFF + bottom;
                        this.LLILLJJLI.setColor(this.LL);
                        float f = c21588719eH.LJII;
                        canvas.drawRect(left + f, bottom, right - f, i2, this.LLILLJJLI);
                    }
                }
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        C21588719eH c21588719eH;
        int i;
        int i2;
        int i3;
        int i4;
        Object tag = view.getTag(R.id.egk);
        if ((tag instanceof C21588719eH) && (c21588719eH = (C21588719eH) tag) != null) {
            int i5 = 0;
            if (c21588719eH.LJIIIIZZ) {
                if (c21588719eH.LJ == 48) {
                    i5 = c21588719eH.LIZ;
                    i = 0;
                } else {
                    i = c21588719eH.LIZ;
                }
                i2 = c21588719eH.LIZJ;
                i3 = c21588719eH.LIZIZ;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            if (c21588719eH.LJI) {
                int i6 = c21588719eH.LIZLLL;
                if (i6 == 48) {
                    int i7 = c21588719eH.LJFF;
                    if (i5 < i7) {
                        i5 = i7;
                    }
                } else if (i6 == 80 && i < (i4 = c21588719eH.LJFF)) {
                    i = i4;
                }
            }
            rect.set(i2, i5, i3, i);
        }
    }
}
