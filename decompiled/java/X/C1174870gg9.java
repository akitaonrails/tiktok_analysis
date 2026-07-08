package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0gg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174870gg9 implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final ConstraintLayout LLILLJJLI;
    public final ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public final TuxTextView LLILZ;
    public final C1195630hDd LLILZIL;
    public final FrameLayout LLILZLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C1174870gg9(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, TuxTextView tuxTextView, C1195630hDd c1195630hDd, FrameLayout frameLayout) {
        this.LL = constraintLayout;
        this.LLILLJJLI = constraintLayout2;
        this.LLILLL = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILZ = tuxTextView;
        this.LLILZIL = c1195630hDd;
        this.LLILZLL = frameLayout;
    }
}
