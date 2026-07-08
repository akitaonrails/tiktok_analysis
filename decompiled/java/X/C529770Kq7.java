package X;

import Y.ACallableS176S0300000_8;
import Y.AObjectS70S0201000_8;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.0Kq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529770Kq7 extends AbstractViewOnClickListenerC372950Ejl {
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ TikTokMediaModel LLILZIL;
    public final /* synthetic */ C529750Kq5 LLILZLL;
    public final /* synthetic */ boolean[] LLIZ;
    public final /* synthetic */ C529740Kq4 LLIZLLLIL;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        boolean z;
        C530000KqU.LIZIZ("TikTok-CreativeMediaSelector", new AObjectS70S0201000_8(this, this.LLILZ, this.LLILZIL, 2));
        C529750Kq5 c529750Kq5 = this.LLILZLL;
        if (c529750Kq5.LLJILLL.selectIndex < 0 && this.LLIZLLLIL.LLLL(c529750Kq5)) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LLIZ[0]) {
            C529740Kq4 c529740Kq4 = this.LLIZLLLIL;
            if (c529740Kq4.LLJILLL != null) {
                if (c529740Kq4.LLJZ.LIZLLL || !z || c529740Kq4.LLLJL != -1) {
                    AbstractC19484711Kz.LJIJI(new ACallableS176S0300000_8(this, this.LLILZLL, this.LLILZIL, 2)).LJJ(C11S5.LIZ()).LJJIIJ();
                    this.LLIZLLLIL.LLJILLL.LIZ(view, this.LLILZIL);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529770Kq7(C529740Kq4 c529740Kq4, int i, TikTokMediaModel tikTokMediaModel, C529750Kq5 c529750Kq5, boolean[] zArr) {
        super(600L);
        this.LLIZLLLIL = c529740Kq4;
        this.LLILZ = i;
        this.LLILZIL = tikTokMediaModel;
        this.LLILZLL = c529750Kq5;
        this.LLIZ = zArr;
    }
}
