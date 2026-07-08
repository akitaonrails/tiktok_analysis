package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget;

/* JADX INFO: renamed from: X.0bsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990200bsI<T extends View> {
    public final int LIZ;
    public T LIZIZ;

    public C990200bsI(int i) {
        this.LIZ = i;
    }

    public final View LIZ(BaseCommentWidget baseCommentWidget) {
        if (this.LIZIZ == null) {
            this.LIZIZ = (T) baseCommentWidget.LLILLL.findViewById(this.LIZ);
        }
        T t = this.LIZIZ;
        if (t == null) {
            return null;
        }
        return t;
    }
}
