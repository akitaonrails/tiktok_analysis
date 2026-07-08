package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0DC6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DC6 implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxTextView LLILLJJLI;
    public final LinearLayout LLILLL;
    public final TextView LLILZ;
    public final RecyclerView LLILZIL;
    public final C481090Itn LLILZLL;
    public final C1749280vcc LLIZ;
    public final C0DC5 LLIZLLLIL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C0DC6(ConstraintLayout constraintLayout, TuxTextView tuxTextView, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, C481090Itn c481090Itn, C1749280vcc c1749280vcc, C0DC5 c0dc5) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = linearLayout;
        this.LLILZ = textView;
        this.LLILZIL = recyclerView;
        this.LLILZLL = c481090Itn;
        this.LLIZ = c1749280vcc;
        this.LLIZLLLIL = c0dc5;
    }
}
