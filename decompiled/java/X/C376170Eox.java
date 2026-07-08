package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376170Eox extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final AppCompatImageView LLILLJJLI;

    public C376170Eox(View view) {
        super(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.f_7);
        this.LL = tuxTextView;
        this.LLILLJJLI = (AppCompatImageView) view.findViewById(R.id.f_5);
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(12.0f);
        }
    }
}
