package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0ddz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058210ddz extends C0DXR {
    public final Context LL;
    public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    public C1058210ddz(Context context) {
        this.LL = context;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 632));
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 631));
        this.LLILZIL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 629));
        this.LLILZLL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 630));
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        Iterator it2 = new C1077420e8y(recyclerView, 20).iterator();
        int i = 0;
        while (true) {
            C1077410e8x c1077410e8x = (C1077410e8x) it2;
            if (c1077410e8x.hasNext()) {
                Object next = c1077410e8x.next();
                int i2 = i + 1;
                if (i >= 0) {
                    View view = (View) next;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    AbstractC21673619ry adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        itemCount = adapter.getItemCount();
                        if (itemCount == 1) {
                            ((Drawable) this.LLILZLL.getValue()).setBounds(view.getLeft(), view.getTop() - this.LLILLJJLI, view.getRight(), view.getBottom() + this.LLILLJJLI);
                            ((Drawable) this.LLILZLL.getValue()).draw(canvas);
                        }
                        i = i2;
                    } else {
                        itemCount = 0;
                    }
                    if (childAdapterPosition == 0) {
                        ((Drawable) this.LLILLL.getValue()).setBounds(view.getLeft(), view.getTop() - this.LLILLJJLI, view.getRight(), view.getBottom());
                        ((Drawable) this.LLILLL.getValue()).draw(canvas);
                    } else if (childAdapterPosition == itemCount - 1) {
                        ((Drawable) this.LLILZ.getValue()).setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom() + this.LLILLJJLI);
                        ((Drawable) this.LLILZ.getValue()).draw(canvas);
                    } else {
                        ((Drawable) this.LLILZIL.getValue()).setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        ((Drawable) this.LLILZIL.getValue()).draw(canvas);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (itemCount == 1) {
            int i = this.LLILLJJLI;
            rect.set(0, i, 0, i);
        } else if (childAdapterPosition == 0) {
            rect.set(0, this.LLILLJJLI, 0, 0);
        } else {
            if (childAdapterPosition != itemCount - 1) {
                return;
            }
            rect.set(0, 0, 0, this.LLILLJJLI);
        }
    }
}
