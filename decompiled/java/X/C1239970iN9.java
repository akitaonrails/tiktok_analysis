package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iN9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239970iN9 extends RecyclerView.ViewHolder {
    public final View LL;
    public final boolean LLILLJJLI;
    public final SmartAvatarImageView LLILLL;
    public final TuxTextView LLILZ;
    public final TextView LLILZIL;
    public final TuxIconView LLILZLL;
    public final Context LLIZ;
    public final /* synthetic */ C1239960iN8 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1239970iN9(C1239960iN8 c1239960iN8, View view, boolean z) {
        super(view);
        this.LLIZLLLIL = c1239960iN8;
        this.LL = view;
        this.LLILLJJLI = z;
        this.LLILLL = (SmartAvatarImageView) view.findViewById(R.id.bh2);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.p9_);
        this.LLILZIL = (TextView) view.findViewById(R.id.xy5);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.fkh);
        this.LLIZ = view.getContext();
    }
}
