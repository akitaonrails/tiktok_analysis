package X;

import android.graphics.Rect;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0ddc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057980ddc extends AbstractC1034380d1Y implements InterfaceC1058020ddg {
    @Override // X.InterfaceC1058020ddg
    public final C1058010ddf LIZ(View view) {
        View viewLIZLLL = AbstractC1034380d1Y.LIZLLL(view, R.id.dgn, new AwS560S0100000_16(view, 803));
        if (viewLIZLLL == null) {
            return null;
        }
        int[] iArr = C1034100d16.LIZ;
        viewLIZLLL.getLocationOnScreen(iArr);
        int paddingLeft = iArr[0] + viewLIZLLL.getPaddingLeft();
        int paddingRight = iArr[1] + viewLIZLLL.getPaddingRight();
        Rect rect = new Rect(paddingLeft, paddingRight, ((viewLIZLLL.getWidth() + paddingLeft) - viewLIZLLL.getPaddingLeft()) - viewLIZLLL.getPaddingRight(), ((viewLIZLLL.getHeight() + paddingRight) - viewLIZLLL.getPaddingTop()) - viewLIZLLL.getPaddingBottom());
        return new C1058010ddf(rect, new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top));
    }
}
