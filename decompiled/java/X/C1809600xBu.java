package X;

import android.os.BaseBundle;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809600xBu extends RecyclerView.ViewHolder {
    public final ImageView LL;
    public final TuxTextView LLILLJJLI;
    public final C197039127h LLILLL;
    public boolean LLILZ;

    public C1809600xBu(View view) {
        super(view);
        this.LL = (ImageView) view.findViewById(R.id.lfu);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.zk2);
        this.LLILLL = (C197039127h) view.findViewById(R.id.cpy);
    }

    public static String I5(DataChannel dataChannel) {
        BaseBundle baseBundle;
        String string;
        if (dataChannel != null && (baseBundle = (BaseBundle) dataChannel.gg0(C168C.class)) != null && (string = baseBundle.getString("source")) != null && string.length() > 0) {
            return string;
        }
        return C1810210xCt.LJIIIZ;
    }
}
