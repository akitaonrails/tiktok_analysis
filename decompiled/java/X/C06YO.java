package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.06YO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06YO implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxIconView LLILLJJLI;
    public final ImageView LLILLL;
    public final C0GZK LLILZ;
    public final TextView LLILZIL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C06YO(ConstraintLayout constraintLayout, TuxIconView tuxIconView, ImageView imageView, C0GZK c0gzk, TextView textView) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = imageView;
        this.LLILZ = c0gzk;
        this.LLILZIL = textView;
    }
}
