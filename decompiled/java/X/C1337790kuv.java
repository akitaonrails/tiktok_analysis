package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kuv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337790kuv extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Function0<Integer> LLILZ;
    public final boolean LLILZIL;

    public /* synthetic */ C1337790kuv(int i, int i2, int i3, Function0 function0) {
        this(i, i2, i3, function0, false);
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Object tag = view.getTag(R.id.kmv);
        if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            rect.top = -this.LLILLL;
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (this.LLILZIL && childAdapterPosition == 0) {
            return;
        }
        if (childAdapterPosition < this.LL) {
            rect.top = this.LLILZ.invoke().intValue();
        }
        int i = this.LLILLJJLI / 2;
        rect.left = i;
        rect.right = i;
        rect.bottom = this.LLILLL;
    }

    public C1337790kuv(int i, int i2, int i3, Function0<Integer> function0, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = function0;
        this.LLILZIL = z;
    }
}
