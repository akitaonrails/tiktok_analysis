package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03E9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03E9 extends RecyclerView.ViewHolder {
    public final ConstraintLayout LL;
    public final TuxTextView LLILLJJLI;
    public final ConstraintLayout LLILLL;
    public final TuxTextView LLILZ;
    public final C426160GnO LLILZIL;

    public C03E9(View view) {
        super(view);
        this.LL = (ConstraintLayout) view.findViewById(R.id.us_order_submit_user_trust_item_container);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.us_order_submit_user_trust_item_text);
        this.LLILLL = (ConstraintLayout) view.findViewById(R.id.us_order_submit_user_trust_images_layout);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.us_order_submit_user_trust_images_title);
        this.LLILZIL = (C426160GnO) view.findViewById(R.id.us_order_submit_user_trust_images);
    }
}
