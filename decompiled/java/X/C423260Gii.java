package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Gii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423260Gii extends C0DXR {
    public static final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final int LL;
    public final int LLILLJJLI;

    public C423260Gii() {
        int i = LLILLL;
        this.LL = i;
        this.LLILLJJLI = i / 2;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i = this.LLILLJJLI;
        rect.set(i, this.LL, i, 0);
    }
}
