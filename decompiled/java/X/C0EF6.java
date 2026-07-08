package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EF6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EF6 extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final View LLILLJJLI;
    public final TuxIconView LLILLL;
    public final FrameLayout LLILZ;
    public C1295960jpS LLILZIL;

    public C0EF6(View view) {
        Float fValueOf;
        Integer numValueOf;
        super(view);
        this.LL = (TuxTextView) view.findViewById(R.id.h8y);
        View viewFindViewById = view.findViewById(R.id.h8v);
        this.LLILLJJLI = viewFindViewById;
        this.LLILLL = (TuxIconView) view.findViewById(R.id.h8w);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.h8x);
        this.LLILZ = frameLayout;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.dz);
        if (C357780E0y.LIZ()) {
            fValueOf = Float.valueOf(C418440Gaw.LIZIZ(12));
        } else {
            fValueOf = Float.valueOf(C418440Gaw.LIZIZ(10));
        }
        c384050F3z.LIZJ = fValueOf;
        frameLayout.setBackground(c384050F3z.LIZ(view.getContext()));
        C384050F3z c384050F3z2 = new C384050F3z();
        if (C353850Du3.LIZ(null)) {
            numValueOf = Integer.valueOf(R.attr.a0j);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c384050F3z2.LIZIZ = numValueOf;
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        viewFindViewById.setBackground(c384050F3z2.LIZ(view.getContext()));
    }
}
