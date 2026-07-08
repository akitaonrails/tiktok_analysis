package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747560TUc extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final ImageView LLILLJJLI;

    public C747560TUc(View view) {
        super(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ztl);
        this.LL = tuxTextView;
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.ltq);
        tuxTextView.setTextColor(C446980Hfs.LIZ(view.getContext(), R.color.bi));
    }
}
