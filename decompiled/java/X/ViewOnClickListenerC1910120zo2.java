package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zo2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewOnClickListenerC1910120zo2 extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final TextView LL;
    public final RemoteImageView LLILLJJLI;
    public MusicCollectionItem LLILLL;
    public final InterfaceC1908130zkp LLILZ;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusicCollectionItem musicCollectionItem;
        InterfaceC1908130zkp interfaceC1908130zkp;
        if (!C0OBG.LIZIZ(view) && (musicCollectionItem = this.LLILLL) != null && this.itemView != null && (interfaceC1908130zkp = this.LLILZ) != null) {
            interfaceC1908130zkp.LIZ(musicCollectionItem);
        }
    }

    public ViewOnClickListenerC1910120zo2(View view, int i, C15H3 c15h3) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.zdq);
        this.LLILLJJLI = (RemoteImageView) view.findViewById(R.id.lbu);
        C786410Ut5.I7(this, this.itemView);
        this.LLILZ = c15h3;
    }
}
