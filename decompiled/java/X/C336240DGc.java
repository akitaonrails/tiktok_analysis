package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0DGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336240DGc implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final View LLILLJJLI;
    public final FrameLayout LLILLL;
    public final C336440DGw LLILZ;
    public final LinearLayout LLILZIL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C336240DGc(ConstraintLayout constraintLayout, View view, FrameLayout frameLayout, C336440DGw c336440DGw, LinearLayout linearLayout) {
        this.LL = constraintLayout;
        this.LLILLJJLI = view;
        this.LLILLL = frameLayout;
        this.LLILZ = c336440DGw;
        this.LLILZIL = linearLayout;
    }
}
