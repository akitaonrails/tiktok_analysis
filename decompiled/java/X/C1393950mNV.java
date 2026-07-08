package X;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mNV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393950mNV extends RecyclerView.ViewHolder implements InterfaceC1206560hVG {
    public final RemoteImageView LL;
    public final TuxTextView LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final AppCompatImageView LLILZLL;
    public NewFaceStickerBean LLIZ;

    @Override // X.InterfaceC1206560hVG
    public final void onShowItem() {
        NewFaceStickerBean newFaceStickerBean = this.LLIZ;
        if (newFaceStickerBean != null) {
            String str = newFaceStickerBean.id;
            String strLIZJ = C1206450hV5.LIZJ(1);
            C2344009Gk c2344009GkLIZIZ = C1206450hV5.LIZIZ("prop", "collection_prop");
            c2344009GkLIZIZ.LJIIIIZZ("prop_id", str);
            C20684815ws.LJIILLIIL(strLIZJ, c2344009GkLIZIZ.LIZ);
        }
    }

    public C1393950mNV(View view) {
        super(view);
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.u3q);
        this.LL = remoteImageView;
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.tv_sticker_name);
        this.LLILLL = (TextView) view.findViewById(R.id.zi0);
        this.LLILZ = (TextView) view.findViewById(R.id.zi3);
        this.LLILZIL = (TextView) view.findViewById(R.id.tv_user_count);
        this.LLILZLL = (AppCompatImageView) view.findViewById(R.id.lt0);
        C0R06.LIZ(remoteImageView, R.dimen.b5);
    }
}
