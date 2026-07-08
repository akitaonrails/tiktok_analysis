package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ade, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942680ade extends RecyclerView.ViewHolder {
    public final View LL;
    public final DataChannel LLILLJJLI;
    public final String LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxIconView LLILZLL;
    public final View LLIZ;

    public C942680ade(View view, DataChannel dataChannel, String str) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = str;
        this.LLILZ = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.tv_sub_title);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.zsc);
        this.LLIZ = view.findViewById(R.id.i6j);
    }
}
