package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ENO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENO extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final FrameLayout LLILLL;
    public final C19671011xk LLILZ;
    public final View LLILZIL;

    public C0ENO(Context context, View view) {
        super(view);
        this.LL = (TuxTextView) view.findViewById(R.id.h_8);
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.h_6);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.h_7);
        C19671011xk c19671011xk = (C19671011xk) view.findViewById(R.id.h_9);
        this.LLILZ = c19671011xk;
        View viewFindViewById = view.findViewById(R.id.h__);
        this.LLILZIL = viewFindViewById;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, context);
        if (numLIZJ != null) {
            c19671011xk.setBackgroundPaintColor(numLIZJ.intValue());
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zc);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        viewFindViewById.setBackground(c384050F3z.LIZ(context));
    }
}
