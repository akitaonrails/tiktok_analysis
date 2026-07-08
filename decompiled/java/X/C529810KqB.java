package X;

import Y.AObjectS70S0201000_8;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.0KqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529810KqB extends AbstractViewOnClickListenerC372950Ejl {
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ TikTokMediaModel LLILZIL;
    public final /* synthetic */ C529750Kq5 LLILZLL;
    public final /* synthetic */ C529740Kq4 LLIZ;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        C530000KqU.LIZIZ("TikTok-CreativeMediaSelector", new AObjectS70S0201000_8(this, this.LLILZ, this.LLILZIL, 3));
        C529740Kq4 c529740Kq4 = this.LLIZ;
        C529750Kq5 c529750Kq5 = this.LLILZLL;
        c529740Kq4.LLLJIL(c529750Kq5.LLJILLL, c529750Kq5.LLJL, C0L90.ALBUM);
    }

    public C529810KqB(C529740Kq4 c529740Kq4, int i, TikTokMediaModel tikTokMediaModel, C529750Kq5 c529750Kq5) {
        this.LLIZ = c529740Kq4;
        this.LLILZ = i;
        this.LLILZIL = tikTokMediaModel;
        this.LLILZLL = c529750Kq5;
    }
}
