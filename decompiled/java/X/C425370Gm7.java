package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Gm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425370Gm7 implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final C427760Gpy LLILLJJLI;
    public final SmartImageView LLILLL;
    public final TuxTextView LLILZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C425370Gm7(LinearLayout linearLayout, C427760Gpy c427760Gpy, SmartImageView smartImageView, TuxTextView tuxTextView) {
        this.LL = linearLayout;
        this.LLILLJJLI = c427760Gpy;
        this.LLILLL = smartImageView;
        this.LLILZ = tuxTextView;
    }
}
