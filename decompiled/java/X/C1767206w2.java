package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel.PoiDetailHotelHeaderAssem;

/* JADX INFO: renamed from: X.06w2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1767206w2 extends C0DXR {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, rect, view, recyclerView, c21673919s1);
                break;
            case 1:
                LIZIZ$1(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C1767206w2(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }

    public static final void LIZIZ$0(C1767206w2 c1767206w2, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        int iLIZIZ;
        int iLIZIZ2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ3 = c21673919s1.LIZIZ();
        Context context = ((PoiDetailHotelHeaderAssem) c1767206w2.l0).getContext();
        if (context != null && C426750GoL.LIZLLL(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            if (childAdapterPosition == 0) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ2 = 0;
            }
            rect.set(iLIZIZ4, 0, iLIZIZ2, 0);
        } else {
            if (childAdapterPosition == 0) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ = 0;
            }
            rect.set(iLIZIZ, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0);
        }
        if (childAdapterPosition == iLIZIZ3 - 1) {
            Context context2 = ((PoiDetailHotelHeaderAssem) c1767206w2.l0).getContext();
            if (context2 != null && C426750GoL.LIZLLL(context2)) {
                rect.left = c1767206w2.i1;
            } else {
                rect.right = c1767206w2.i1;
            }
        }
    }

    public static final void LIZIZ$1(C1767206w2 c1767206w2, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        int iLIZIZ;
        int iLIZIZ2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ3 = c21673919s1.LIZIZ();
        Context context = ((PoiDetailHeaderAssem) c1767206w2.l0).getContext();
        if (context != null && C426750GoL.LIZLLL(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            if (childAdapterPosition == 0) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ2 = 0;
            }
            rect.set(iLIZIZ4, 0, iLIZIZ2, 0);
        } else {
            if (childAdapterPosition == 0) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ = 0;
            }
            rect.set(iLIZIZ, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0);
        }
        if (childAdapterPosition == iLIZIZ3 - 1) {
            Context context2 = ((PoiDetailHeaderAssem) c1767206w2.l0).getContext();
            if (context2 != null && C426750GoL.LIZLLL(context2)) {
                rect.left = c1767206w2.i1;
            } else {
                rect.right = c1767206w2.i1;
            }
        }
    }
}
