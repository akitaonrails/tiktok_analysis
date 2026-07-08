package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ivH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261130ivH extends ConstraintLayout {
    public SmartImageView LL;
    public TuxIconView LLILLJJLI;
    public TuxTag LLILLL;
    public EnumC1261110ivF LLILZ;
    public final boolean LLILZIL;

    public final void e0() {
        boolean z = this.LLILZIL;
        EnumC1261110ivF enumC1261110ivF = this.LLILZ;
        float fLIZIZ = C418440Gaw.LIZIZ(10);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(z ? C418440Gaw.LIZIZ(Double.valueOf(0.5d)) : C418440Gaw.LIZIZ(0)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
        EnumC1261110ivF enumC1261110ivF2 = EnumC1261110ivF.SINGLE;
        c384050F3z.LJIIIIZZ = (enumC1261110ivF == enumC1261110ivF2 || enumC1261110ivF == EnumC1261110ivF.START) ? Float.valueOf(fLIZIZ) : Float.valueOf(C418440Gaw.LIZIZ(0));
        c384050F3z.LJIIJ = (enumC1261110ivF == enumC1261110ivF2 || enumC1261110ivF == EnumC1261110ivF.START) ? Float.valueOf(fLIZIZ) : Float.valueOf(C418440Gaw.LIZIZ(0));
        c384050F3z.LJIIIZ = (enumC1261110ivF == enumC1261110ivF2 || enumC1261110ivF == EnumC1261110ivF.END) ? Float.valueOf(fLIZIZ) : Float.valueOf(C418440Gaw.LIZIZ(0));
        c384050F3z.LJIIJJI = (enumC1261110ivF == enumC1261110ivF2 || enumC1261110ivF == EnumC1261110ivF.END) ? Float.valueOf(fLIZIZ) : Float.valueOf(C418440Gaw.LIZIZ(0));
        Drawable drawableLIZ = c384050F3z.LIZ(getContext());
        if (z) {
            int i = (int) ((getResources().getDisplayMetrics().density * 0.5f) + 0.5f);
            if (i < 1) {
                i = 1;
            }
            drawableLIZ = new InsetDrawable(drawableLIZ, i, i, i, i);
        }
        setBackground(drawableLIZ);
    }

    public final SmartImageView getVideoCardCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_card_cover);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTag getVideoCardNewPostIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_card_new_post_icon);
            this.LLILLL = (TuxTag) callbackFindViewById;
        }
        return (TuxTag) callbackFindViewById;
    }

    public final TuxIconView getVideoCardRepostIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_card_repost_icon);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final void h0() {
        SmartImageView videoCardCoverFromXml = getVideoCardCoverFromXml();
        float fLIZIZ = C418440Gaw.LIZIZ(10);
        C1331100kk8 c1331100kk8 = videoCardCoverFromXml.getHierarchy().LIZJ;
        if (c1331100kk8 == null) {
            c1331100kk8 = new C1331100kk8();
        }
        int i = C1261120ivG.LIZ[this.LLILZ.ordinal()];
        if (i == 1) {
            c1331100kk8.LJII(fLIZIZ);
        } else if (i == 2) {
            c1331100kk8.LJI(fLIZIZ, 0.0f, 0.0f, fLIZIZ);
        } else if (i == 3) {
            c1331100kk8.LJI(0.0f, fLIZIZ, fLIZIZ, 0.0f);
        } else {
            if (i != 4) {
                throw new C1954807lC();
            }
            c1331100kk8.LJII(0.0f);
        }
        c1331100kk8.LJFF(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, getContext());
        if (numLIZJ != null) {
            c1331100kk8.LJFF = numLIZJ.intValue();
        }
        videoCardCoverFromXml.getHierarchy().LJJIII(c1331100kk8);
    }

    public final void setVideoCardCoverFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setVideoCardNewPostIconFromXml(TuxTag tuxTag) {
        this.LLILLL = tuxTag;
    }

    public final void setVideoCardRepostIconFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public C1261130ivH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = EnumC1261110ivF.MIDDLE;
        this.LLILZIL = true;
        int i2 = C2187451AjH.LIZ;
        C786410Ut5.Sd(R.layout.es7, C786410Ut5.ne(context), this);
        e0();
        h0();
    }
}
