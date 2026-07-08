package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.01te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C478401te extends FrameLayout {
    public final List<View> LL;
    public int LLILLJJLI;

    public final View LIZ(int i) {
        if (i >= 0 && i < ((ArrayList) this.LL).size()) {
            return (View) ListProtector.get(this.LL, i);
        }
        return null;
    }

    public void setStatus(int i) {
        View viewLIZ;
        int i2 = this.LLILLJJLI;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0 && (viewLIZ = LIZ(i2)) != null) {
            C786410Ut5.LJLLLLLL(4, viewLIZ);
        }
        if (i >= 0) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            View viewLIZ2 = LIZ(i);
            if (viewLIZ2 != null) {
                C786410Ut5.LJLLLLLL(0, viewLIZ2);
            }
        } else {
            int visibility2 = getVisibility();
            setVisibility(4);
            C1602160rnK.LIZIZ(visibility2, 4, this);
        }
        this.LLILLJJLI = i;
    }

    public C478401te(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new ArrayList(5);
        this.LLILLJJLI = -1;
    }
}
