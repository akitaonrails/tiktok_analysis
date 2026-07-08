package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0udV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1711390udV extends RecyclerView.ViewHolder {
    public final View LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C1841350y17 LLILZ;

    public C1711390udV(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.jxe);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.title);
        this.LLILZ = (C1841350y17) view.findViewById(R.id.sp_);
    }
}
