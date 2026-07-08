package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015890cXj extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(462));

    public C1015890cXj(int i, int i2, int i3) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        C20600815jK<InterfaceC1891350zJl> state;
        LinearLayoutManager linearLayoutManager;
        int iLJIIIIZZ;
        InterfaceC1891350zJl interfaceC1891350zJlLJI;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        float paddingLeft = recyclerView.getPaddingLeft();
        Float fValueOf = Float.valueOf(16.0f);
        float fLIZIZ = paddingLeft + C418440Gaw.LIZIZ(fValueOf);
        float width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - C418440Gaw.LIZIZ(fValueOf);
        if ((recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView) != null) {
            state = viewOnAttachStateChangeListenerC20604515jv.getState();
        } else {
            state = null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            Iterator it2 = new C1077420e8y(recyclerView, 38).iterator();
            int i2 = 0;
            while (true) {
                C1077410e8x c1077410e8x = (C1077410e8x) it2;
                if (c1077410e8x.hasNext()) {
                    Object next = c1077410e8x.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        View view = (View) next;
                        int i4 = iFindFirstVisibleItemPosition + i2;
                        if (state != null) {
                            iLJIIIIZZ = state.LJIIIIZZ();
                        } else {
                            iLJIIIIZZ = 0;
                        }
                        int i5 = i4 + 1;
                        if (iLJIIIIZZ > i5) {
                            if (state != null) {
                                interfaceC1891350zJlLJI = state.LJI(i5);
                            } else {
                                interfaceC1891350zJlLJI = null;
                            }
                            if (interfaceC1891350zJlLJI instanceof C684870Qth) {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                if (layoutParams instanceof RecyclerView.LayoutParams) {
                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                } else {
                                    marginLayoutParams = null;
                                }
                                Rect rectLJ = LJ(recyclerView, i2, c21673919s1.LIZIZ());
                                int bottom = view.getBottom();
                                if (marginLayoutParams != null) {
                                    i = marginLayoutParams.bottomMargin;
                                } else {
                                    i = 0;
                                }
                                float f = bottom + i + rectLJ.bottom;
                                canvas.drawLine(fLIZIZ, f, width, f + ((Paint) this.LLILZ.getValue()).getStrokeWidth(), (Paint) this.LLILZ.getValue());
                            }
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db A[PHI: r4
      0x00db: PHI (r4v9 java.lang.Integer) = (r4v10 java.lang.Integer), (r4v11 java.lang.Integer) binds: [B:63:0x00d9, B:71:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee A[PHI: r4
      0x00ee: PHI (r4v7 java.lang.Integer) = (r4v9 java.lang.Integer), (r4v10 java.lang.Integer) binds: [B:65:0x00df, B:63:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0144 A[PHI: r4
      0x0144: PHI (r4v4 java.lang.Integer) = (r4v3 java.lang.Integer), (r4v5 java.lang.Integer) binds: [B:82:0x0141, B:79:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015c A[PHI: r3 r4
      0x015c: PHI (r3v4 X.0cXk) = (r3v3 X.0cXk), (r3v11 X.0cXk) binds: [B:87:0x0158, B:20:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r4v1 java.lang.Integer) = (r4v0 java.lang.Integer), (r4v15 java.lang.Integer) binds: [B:87:0x0158, B:20:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect LJ(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1015890cXj.LJ(androidx.recyclerview.widget.RecyclerView, int, int):android.graphics.Rect");
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Rect rectLJ = LJ(recyclerView, recyclerView.getChildAdapterPosition(view), c21673919s1.LIZIZ());
        rect.top = rectLJ.top;
        rect.bottom = rectLJ.bottom;
        rect.left = rectLJ.left;
        rect.right = rectLJ.right;
    }
}
