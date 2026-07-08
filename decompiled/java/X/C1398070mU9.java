package X;

import Y.ACListenerS124S0200000_21;
import android.os.Bundle;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoType;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398070mU9 extends C1398630mV3 {
    public final InterfaceC1260110itd LLJLLL;

    public C1398070mU9(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        super(view, str, interfaceC1260110itd);
        this.LLJLLL = interfaceC1260110itd;
        C786410Ut5.h9(this.LLJJIJIIJIL, new ACListenerS124S0200000_21(view, this, 47));
    }

    @Override // X.C1398630mV3
    public final void b6(Aweme aweme, int i, boolean z, Bundle bundle) {
        super.b6(aweme, i, z, bundle);
        if (AwemeBizExtKt.isFeatureVideo(aweme) == VideoType.NO_FEATURE_VIDEO_SELECTED) {
            if (AwemeBizExtKt.getIcon(aweme) != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_camera_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                this.LLJJIJIL.setImageDrawable(c419910GdJ.LIZ(this.LLJJIJIL.getContext()));
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(AwemeBizExtKt.getIcon(aweme)));
                c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI);
                c1331670kl3LJIIIIZZ.LJJ = EnumC1338240kve.CENTER_CROP;
                c1331670kl3LJIIIIZZ.LJJIJIL(new C0I7W(0.4f, 20, this.itemView.getContext()));
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
            C786410Ut5.LLFF(0, this.LLJJIJIL);
            C786410Ut5.LLLLZLL(this.LLJJJ, 0);
            C786410Ut5.LLLLZLL(this.LLJILJILJ, 8);
            C786410Ut5.LLLLZLL(this.LLJJIJIIJIL, 8);
        } else {
            C786410Ut5.LLFF(4, this.LLJJIJIL);
            C786410Ut5.LLLLZLL(this.LLJJJ, 4);
            this.LLJILJILJ.setText(2131845443);
            C786410Ut5.LLLLZLL(this.LLJILJILJ, 0);
            this.LLJJIJIIJIL.setText(2131845442);
            C786410Ut5.LLLLZLL(this.LLJJIJIIJIL, 0);
            C786410Ut5.LLFF(0, this.LLILLJJLI);
            if (C1394640mOc.LIZ()) {
                this.LLJILJILJ.setBackgroundResource(R.drawable.bgz);
                this.LLJILJILJ.setTuxFont(82);
                this.LLJILJILJ.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), 0);
            } else {
                this.LLJILJILJ.setBackgroundResource(R.drawable.bh1);
            }
            this.LLJILJILJ.setTextColorRes(R.attr.ee);
        }
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null) {
            smartImageView.setAttached(true);
            this.LLILLJJLI.LJI();
        }
        C786410Ut5.Q8(this.LLILLJJLI, new ACListenerS124S0200000_21(aweme, this, 48));
    }
}
