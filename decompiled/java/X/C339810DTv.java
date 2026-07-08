package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339810DTv extends RecyclerView.ViewHolder {
    public final FrameLayout LL;
    public final TuxTextView LLILLJJLI;

    public C339810DTv(FrameLayout frameLayout) {
        super(frameLayout);
        this.LL = frameLayout;
        Context context = frameLayout.getContext();
        TuxTextView tuxTextView = (TuxTextView) frameLayout.findViewById(R.id.wmx);
        this.LLILLJJLI = tuxTextView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        tuxTextView.setBackground(c384050F3z.LIZ(context));
    }
}
