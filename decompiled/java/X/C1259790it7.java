package X;

import Y.ACListenerS122S0200000_19;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0it7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259790it7 extends AbstractC1260080ita {
    public final Context LLIZ;
    public final String LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final TuxIconView LLJIJIL;
    public final C19M4 LLJILJIL;
    public final TextView LLJILJILJ;
    public final ViewGroup LLJILLL;
    public final C419910GdJ LLJJ;

    @Override // X.AbstractC1260080ita
    public final int[] R5() {
        return C422830Gi1.LIZ(200);
    }

    public final void X5() {
        List<ImageInfo> imageInfos;
        ImageInfo imageInfo;
        Aweme aweme = this.LL;
        if (aweme == null || (imageInfos = aweme.getImageInfos()) == null || imageInfos.isEmpty() || (imageInfo = (ImageInfo) ListProtector.get(imageInfos, 0)) == null) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(imageInfo.getLabelThumb()));
        c1331670kl3LJIIIIZZ.LJJIJ(R5());
        c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI);
        int width = this.LLILLJJLI.getWidth();
        int height = this.LLILLJJLI.getHeight();
        c1331670kl3LJIIIIZZ.LJIIIIZZ = width;
        c1331670kl3LJIIIIZZ.LJIIIZ = height;
        c1331670kl3LJIIIIZZ.LIZLLL("ImageViewHolder");
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }

    @Override // X.InterfaceC1259900itI
    public final void M0() {
        X5();
    }

    public C1259790it7(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        super(view);
        this.LLIZ = view.getContext();
        this.LLIZLLLIL = str;
        this.LLJ = view.findViewById(R.id.eqx);
        this.LLJI = view.findViewById(R.id.rii);
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.cover);
        this.LLJILJIL = (C19M4) view.findViewById(R.id.tv_play_count);
        this.LLJIJIL = (TuxIconView) view.findViewById(R.id.video_locked);
        this.LLJILJILJ = (TextView) view.findViewById(R.id.tv_top);
        this.LLJILLL = (ViewGroup) view.findViewById(R.id.kcw);
        C786410Ut5.Q8(this.LLILLJJLI, new ACListenerS122S0200000_19(interfaceC1260110itd, this, 81));
        this.LLILLJJLI.setAnimationListener(this.LLILZLL);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZJ = C341940Daq.LIZ(15.0d);
        c419910GdJ.LIZIZ = C341940Daq.LIZ(15.0d);
        this.LLJJ = c419910GdJ;
    }
}
