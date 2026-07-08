package X;

import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;

/* JADX INFO: renamed from: X.0DUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339960DUk implements InterfaceC340040DUs {
    public final FixedRatioFrameLayout LL;
    public final C0HZQ LLILLJJLI;
    public final SmartImageView LLILLL;
    public final TuxIconView LLILZ;
    public final TuxSpinner LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxTextView LLJ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C339960DUk(FixedRatioFrameLayout fixedRatioFrameLayout, C0HZQ c0hzq, SmartImageView smartImageView, TuxIconView tuxIconView, TuxSpinner tuxSpinner, View view, View view2, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        this.LL = fixedRatioFrameLayout;
        this.LLILLJJLI = c0hzq;
        this.LLILLL = smartImageView;
        this.LLILZ = tuxIconView;
        this.LLILZIL = tuxSpinner;
        this.LLILZLL = view;
        this.LLIZ = view2;
        this.LLIZLLLIL = tuxTextView;
        this.LLJ = tuxTextView2;
    }
}
