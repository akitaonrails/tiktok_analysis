package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0h9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193270h9p implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final LinearLayout LLILZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C1193270h9p(ConstraintLayout constraintLayout, TuxIconView tuxIconView, TuxTextView tuxTextView, LinearLayout linearLayout) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = tuxTextView;
        this.LLILZ = linearLayout;
    }
}
