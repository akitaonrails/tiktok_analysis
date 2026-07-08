package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737510vJd extends RecyclerView.ViewHolder {
    public final View LL;
    public InterfaceC1737580vJk LLILLJJLI;
    public C1737450vJX LLILLL;
    public final TuxTextView LLILZ;
    public final C1322110kVd LLILZIL;
    public final TuxIconView LLILZLL;
    public final C1390410mHn LLIZ;
    public final FrameLayout LLIZLLLIL;

    public C1737510vJd(View view) {
        super(view);
        this.LL = view;
        this.LLILZ = (TuxTextView) view.findViewById(R.id.zq6);
        C1322110kVd c1322110kVd = (C1322110kVd) view.findViewById(R.id.lkw);
        c1322110kVd.getHierarchy().LJJIII(C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(16)));
        this.LLILZIL = c1322110kVd;
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.ll2);
        this.LLIZ = (C1390410mHn) view.findViewById(R.id.k1s);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.i5g);
    }

    public final void I5(boolean z) {
        C1390410mHn c1390410mHn = this.LLIZ;
        if (z) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
            c1390410mHn.LIZJ();
        } else {
            C786410Ut5.LLLZZIL(c1390410mHn, 8);
            c1390410mHn.LIZLLL();
        }
        C1322110kVd c1322110kVd = this.LLILZIL;
        c1322110kVd.setEnabled(!z);
        c1322110kVd.setClickable(!z);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        c1322110kVd.setImageDrawable(c384050F3z.LIZ(c1322110kVd.getContext()));
        FrameLayout frameLayout = this.LLIZLLLIL;
        frameLayout.setEnabled(!z);
        frameLayout.setClickable(!z);
    }
}
