package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0h9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193290h9r implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public final TuxTextView LLILLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C1193290h9r(LinearLayout linearLayout, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, TuxTextView tuxTextView) {
        this.LL = linearLayout;
        this.LLILLJJLI = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILLL = tuxTextView;
    }
}
