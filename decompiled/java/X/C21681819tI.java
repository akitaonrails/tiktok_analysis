package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19tI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21681819tI extends RecyclerView.LayoutParams {
    public C21681319tD LL;
    public boolean LLILLJJLI;

    public final int LIZ() {
        C21681319tD c21681319tD = this.LL;
        if (c21681319tD == null) {
            return -1;
        }
        return c21681319tD.LJ;
    }

    public C21681819tI(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C21681819tI(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C21681819tI(int i, int i2) {
        super(i, i2);
    }

    public C21681819tI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
