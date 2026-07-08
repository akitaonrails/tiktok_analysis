package X;

import Y.ACallableS176S0300000_8;
import Y.AObjectS70S0201000_8;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;

/* JADX INFO: renamed from: X.0Kq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529760Kq6 extends AbstractViewOnClickListenerC372950Ejl {
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ TikTokMediaModel LLILZIL;
    public final /* synthetic */ C529750Kq5 LLILZLL;
    public final /* synthetic */ boolean[] LLIZ;
    public final /* synthetic */ C529740Kq4 LLIZLLLIL;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        boolean z;
        if (ChangeImagePickerUIExperiment.isEnabled()) {
            C21357918i9.LIZLLL = C21357918i9.LIZJ;
        }
        if (this.LLIZLLLIL.LLJJIII) {
            C530000KqU.LIZIZ("TikTok-CreativeMediaSelector", new AObjectS70S0201000_8(this, this.LLILZ, this.LLILZIL, 0));
            C529740Kq4 c529740Kq4 = this.LLIZLLLIL;
            C529750Kq5 c529750Kq5 = this.LLILZLL;
            c529740Kq4.LLLJIL(c529750Kq5.LLJILLL, c529750Kq5.LLJL, C0L90.ALBUM);
            return;
        }
        C530000KqU.LIZIZ("TikTok-CreativeMediaSelector", new AObjectS70S0201000_8(this, this.LLILZ, this.LLILZIL, 1));
        C529750Kq5 c529750Kq52 = this.LLILZLL;
        if (c529750Kq52.LLJILLL.selectIndex < 0 && this.LLIZLLLIL.LLLL(c529750Kq52)) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LLIZ[0]) {
            C529740Kq4 c529740Kq42 = this.LLIZLLLIL;
            if (c529740Kq42.LLJILLL != null) {
                C522190Kdt c522190Kdt = c529740Kq42.LLJZ;
                if ((c522190Kdt.LIZLLL || !z || c529740Kq42.LLLJL != -1) && !c522190Kdt.LJIIIIZZ) {
                    C15O7.LIZJ(new ACallableS176S0300000_8(this, this.LLILZLL, this.LLILZIL, 0));
                    this.LLIZLLLIL.LLJILLL.LIZ(view, this.LLILZIL);
                    return;
                }
            }
        }
        InterfaceC524480Kha interfaceC524480Kha = this.LLIZLLLIL.LLJLLIL;
        if (interfaceC524480Kha == null || interfaceC524480Kha.LIZIZ(this.LLILZIL)) {
            return;
        }
        this.LLIZLLLIL.LLJLLIL.LIZ(view.getContext(), this.LLILZIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529760Kq6(C529740Kq4 c529740Kq4, int i, TikTokMediaModel tikTokMediaModel, C529750Kq5 c529750Kq5, boolean[] zArr) {
        super(600L);
        this.LLIZLLLIL = c529740Kq4;
        this.LLILZ = i;
        this.LLILZIL = tikTokMediaModel;
        this.LLILZLL = c529750Kq5;
        this.LLIZ = zArr;
    }
}
