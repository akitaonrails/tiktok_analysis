package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0adp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942790adp extends RecyclerView.ViewHolder {
    public final DataChannel LL;
    public final View LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxTextView LLILZ;

    public C942790adp(View view, DataChannel dataChannel) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = view;
        this.LLILLL = (TuxIconView) view.findViewById(R.id.zsc);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.zsi);
    }
}
