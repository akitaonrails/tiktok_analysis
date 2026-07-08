package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.039S, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039S extends RecyclerView.ViewHolder {
    public final View LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;

    public C039S(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.us_order_submit_customize_bundle_sku_img);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.us_order_submit_customize_sku_title);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.us_order_submit_customize_sku_props);
    }
}
