package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.1ANW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ANW implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final C427660Gpo LLILLJJLI;
    public final SmartImageView LLILLL;
    public final FrameLayout LLILZ;
    public final FrameLayout LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C1ANW(ConstraintLayout constraintLayout, C427660Gpo c427660Gpo, SmartImageView smartImageView, FrameLayout frameLayout, FrameLayout frameLayout2, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        this.LL = constraintLayout;
        this.LLILLJJLI = c427660Gpo;
        this.LLILLL = smartImageView;
        this.LLILZ = frameLayout;
        this.LLILZIL = frameLayout2;
        this.LLILZLL = tuxTextView;
        this.LLIZ = tuxTextView2;
    }
}
