package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10vD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19400510vD extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final SmartImageView LLILLJJLI;
    public final TuxIconView LLILLL;

    public C19400510vD(View view) {
        super(view);
        this.LL = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.mk3);
        this.LLILLL = (TuxIconView) view.findViewById(R.id.tld);
    }
}
