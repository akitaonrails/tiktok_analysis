package X;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: X.005y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0236005y {
    public final View LIZ;
    public final TextView LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateCapsuleTabOutput(tabView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", categoryNameTextView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0236005y(View view, TextView textView) {
        this.LIZ = view;
        this.LIZIZ = textView;
    }
}
