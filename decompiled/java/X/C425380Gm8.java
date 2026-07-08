package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Gm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425380Gm8 implements InterfaceC340040DUs {
    public final FrameLayout LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final RecyclerView LLILZ;
    public final TextView LLILZIL;
    public final FrameLayout LLILZLL;
    public final ConstraintLayout LLIZ;
    public final C430780Guq LLIZLLLIL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C425380Gm8(FrameLayout frameLayout, TextView textView, TextView textView2, RecyclerView recyclerView, TextView textView3, FrameLayout frameLayout2, ConstraintLayout constraintLayout, C430780Guq c430780Guq) {
        this.LL = frameLayout;
        this.LLILLJJLI = textView;
        this.LLILLL = textView2;
        this.LLILZ = recyclerView;
        this.LLILZIL = textView3;
        this.LLILZLL = frameLayout2;
        this.LLIZ = constraintLayout;
        this.LLIZLLLIL = c430780Guq;
    }
}
