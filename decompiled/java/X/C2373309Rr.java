package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.09Rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2373309Rr extends LinearLayout {
    public int LL;
    public final String LLILLJJLI;

    public final int getMaxWidth() {
        return this.LL;
    }

    public C2373309Rr(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = "MaxWidthLinearLayout";
    }

    public final void setMaxWidth(int i) {
        this.LL = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object c098200Yq;
        try {
            if (this.LL > 0) {
                int size = View.MeasureSpec.getSize(i);
                if (size < 0) {
                    String str = this.LLILLJJLI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("widthSize less than 0. view id:");
                    sbLIZ.append(getId());
                    C2344809Gs.LIZLLL(6, str, C2188811AlT.LIZIZ(sbLIZ));
                }
                if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
                    String str2 = this.LLILLJJLI;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("mode is not AT_MOST. view id:");
                    sbLIZ2.append(getId());
                    C2344809Gs.LIZLLL(6, str2, C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (size > this.LL) {
                    i = View.MeasureSpec.makeMeasureSpec(this.LL, View.MeasureSpec.getMode(i));
                }
            }
            String str3 = this.LLILLJJLI;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("widthSize: ");
            sbLIZ3.append(i);
            sbLIZ3.append(", heightSize: ");
            sbLIZ3.append(i2);
            sbLIZ3.append(", view id: ");
            sbLIZ3.append(getId());
            C2344809Gs.LIZLLL(6, str3, C2188811AlT.LIZIZ(sbLIZ3));
            super.onMeasure(i, i2);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            String str4 = this.LLILLJJLI;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("catch exception: ");
            sbLIZ4.append(thM5exceptionOrNullimpl.getMessage());
            C2344809Gs.LIZLLL(6, str4, C2188811AlT.LIZIZ(sbLIZ4));
        }
    }
}
