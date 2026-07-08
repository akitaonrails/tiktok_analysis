package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gtv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C430210Gtv extends C427870Gq9 {
    public static boolean LLJJI;

    @Override // X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView
    public final void LIZJ() {
        super.LIZJ();
        getHierarchy().LJJI(2130971789, InterfaceC1320380kSq.LIZ);
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJFF(C12ES.LIZJ(1.0f, getContext()));
            getHierarchy().LIZJ.LJFF = C960203pA.LIZ(R.attr.bx, getContext());
            getHierarchy().LIZJ.LJIIIZ(C12ES.LIZJ(1.0f, getContext()));
        }
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public C430210Gtv(Context context) {
        super(context);
    }

    public static void setOpt(boolean z) {
        LLJJI = z;
    }

    @Override // X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setBorderAttrRes(int i) {
        if (getHierarchy().LIZJ != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
            if (numLIZJ == null) {
                numLIZJ = 0;
            }
            getHierarchy().LIZJ.LJFF = numLIZJ.intValue();
        }
    }

    public void setBorderColor(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJFF = C446980Hfs.LIZ(getContext(), i);
        }
    }

    public void setBorderWidth(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJFF(C12ES.LIZJ(i, getContext()));
        }
    }

    public void setBorderWidthPx(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJFF(i);
        }
    }

    public void setRoundingParamsPadding(float f) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJIIIZ(f);
        }
    }

    public C430210Gtv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void LJIIJ(final UrlModel urlModel, final int[] iArr, final int i, final int i2, final String str, final boolean z, final InterfaceC658750Psf interfaceC658750Psf) {
        if (LLJJI) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0Gtw
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SmartAvatarBorderView@7a4c.bindImage$1");
                    try {
                        this.LLIZLLLIL.LJIIJJI(urlModel, iArr, i, i2, str, z, interfaceC658750Psf);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SmartAvatarBorderView@7a4c.bindImage$1");
                }
            });
        } else {
            LJIIJJI(urlModel, iArr, i, i2, str, z, interfaceC658750Psf);
        }
    }

    public final void LJIIJJI(UrlModel urlModel, int[] iArr, int i, int i2, String str, boolean z, InterfaceC658750Psf interfaceC658750Psf) {
        C1331670kl3 c1331670kl3LJIIIIZZ;
        ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(urlModel);
        if (C637980P0q.LIZ(null) && imageUrlModelLIZ.isEmpty()) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIZ("");
            c1331670kl3LJIIIIZZ.LJIL(c419910GdJ.LIZ(getContext()));
        } else {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZ);
        }
        if (iArr != null) {
            c1331670kl3LJIIIIZZ.LJJIJ(iArr);
        }
        c1331670kl3LJIIIIZZ.LJIIIIZZ = i;
        c1331670kl3LJIIIIZZ.LJIIIZ = i2;
        c1331670kl3LJIIIIZZ.LIZLLL(str);
        c1331670kl3LJIIIIZZ.LJJIJLIJ = z;
        c1331670kl3LJIIIIZZ.LJJ(this);
        if (interfaceC658750Psf != null) {
            c1331670kl3LJIIIIZZ.LJJJIL = interfaceC658750Psf;
        }
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }
}
