package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HF3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HF3 extends RecyclerView.ViewHolder {
    public final SmartImageView LL;
    public final TextView LLILLJJLI;
    public final View LLILLL;
    public final /* synthetic */ C0HF2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HF3(C0HF2 c0hf2, View view) {
        super(view);
        this.LLILZ = c0hf2;
        this.LL = (SmartImageView) view.findViewById(R.id.la0);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.zaj);
        this.LLILLL = view.findViewById(R.id.v_bg_video_selected_border);
    }
}
