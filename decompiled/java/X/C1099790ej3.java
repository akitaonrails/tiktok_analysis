package X;

import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0ej3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099790ej3 extends FrameLayout {
    public final C418980Gbo LL;
    public final Rect LLILLJJLI;
    public final Rect LLILLL;

    public final Rect getAnchorRect() {
        return this.LLILLL;
    }

    public final Rect getWindowRect() {
        return this.LLILLJJLI;
    }

    public C1099790ej3(Context context) {
        super(context, null, 0);
        this.LL = new C418980Gbo(context);
        this.LLILLJJLI = new Rect();
        this.LLILLL = new Rect();
    }
}
