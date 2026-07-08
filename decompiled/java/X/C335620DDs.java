package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0DDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335620DDs implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final TuxIconView LLILLJJLI;
    public final CardView LLILLL;
    public final ImageView LLILZ;
    public final TuxTextView LLILZIL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C335620DDs(LinearLayout linearLayout, TuxIconView tuxIconView, CardView cardView, ImageView imageView, TuxTextView tuxTextView) {
        this.LL = linearLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = cardView;
        this.LLILZ = imageView;
        this.LLILZIL = tuxTextView;
    }
}
