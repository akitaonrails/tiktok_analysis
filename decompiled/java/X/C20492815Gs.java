package X;

import Y.ACListenerS165S0100000_31;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15Gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20492815Gs extends RecyclerView.ViewHolder {
    public final RemoteImageView LL;
    public final TextView LLILLJJLI;
    public MusicCollectionItem LLILLL;
    public final /* synthetic */ C20492715Gr LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20492815Gs(C20492715Gr c20492715Gr, View view) {
        super(view);
        this.LLILZ = c20492715Gr;
        this.LL = (RemoteImageView) view.findViewById(R.id.owf);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.owg);
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 140), this.itemView);
    }
}
