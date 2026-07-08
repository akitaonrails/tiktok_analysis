package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1AGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176511AGb extends RecyclerView.ViewHolder {
    public final DataChannel LL;
    public final C16FV LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C16FS LLILZIL;

    public C2176511AGb(View view, DataChannel dataChannel) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = (C16FV) view.findViewById(R.id.dzm);
        this.LLILLL = (C16F5) view.findViewById(R.id.dzk);
        this.LLILZ = (C16F5) view.findViewById(R.id.xed);
        this.LLILZIL = (C16FS) view.findViewById(R.id.dzh);
    }
}
