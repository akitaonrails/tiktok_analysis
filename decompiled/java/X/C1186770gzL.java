package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0gzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186770gzL implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final TuxTextView LLILLJJLI;
    public final SmartImageView LLILLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C1186770gzL(LinearLayout linearLayout, TuxTextView tuxTextView, SmartImageView smartImageView) {
        this.LL = linearLayout;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = smartImageView;
    }
}
