package X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0itU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260020itU extends RecyclerView.ViewHolder implements InterfaceC1259900itI {
    public final InterfaceC1260110itd LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final SmartAvatarImageView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final RelativeLayout LLIZ;
    public Aweme LLIZLLLIL;

    @Override // X.InterfaceC1259900itI
    public final void H() {
    }

    @Override // X.InterfaceC1259900itI
    public final void LJLJJLL(boolean z) {
    }

    @Override // X.InterfaceC1259900itI
    public final boolean b5() {
        return false;
    }

    @Override // X.InterfaceC1259900itI
    public final void c1() {
    }

    @Override // X.InterfaceC1259900itI
    public final void setUserVisibleHint(boolean z) {
    }

    @Override // X.InterfaceC1259900itI
    public final void y4() {
    }

    @Override // X.InterfaceC1259900itI
    public final void M0() {
        Video video;
        Aweme aweme = this.LLIZLLLIL;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ((aweme == null || (video = aweme.getVideo()) == null) ? null : video.getCover()));
        int[] iArrLIZ = C422830Gi1.LIZ(201);
        if (iArrLIZ != null) {
            c1331670kl3LJIIIIZZ.LJJIJ(iArrLIZ);
        }
        c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }

    public C1260020itU(View view, InterfaceC1260110itd interfaceC1260110itd) {
        super(view);
        this.LL = interfaceC1260110itd;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.hl4);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.hl1);
        this.LLILZ = (SmartAvatarImageView) view.findViewById(R.id.hl6);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.hl8);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.hl7);
        this.LLIZ = (RelativeLayout) view.findViewById(R.id.hl_);
    }
}
