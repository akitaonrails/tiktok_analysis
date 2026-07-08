package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236570iHf extends ConstraintLayout {
    public SmartImageView LL;
    public TuxIconView LLILLJJLI;
    public TuxTag LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

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

    public final void setVideoCardCoverFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setVideoCardNewPostIconFromXml(TuxTag tuxTag) {
        this.LLILLL = tuxTag;
    }

    public final void setVideoCardRepostIconFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final Drawable e0(boolean z, boolean z2, boolean z3) {
        float fLIZIZ;
        float fLIZIZ2;
        float fLIZIZ3;
        float fLIZIZ4;
        float fLIZIZ5;
        C384050F3z c384050F3z = new C384050F3z();
        if (z) {
            fLIZIZ = C418440Gaw.LIZIZ(1);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(0);
        }
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(fLIZIZ));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
        if (z2) {
            fLIZIZ2 = C418440Gaw.LIZIZ(10);
        } else {
            fLIZIZ2 = C418440Gaw.LIZIZ(0);
        }
        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ2);
        if (z2) {
            fLIZIZ3 = C418440Gaw.LIZIZ(10);
        } else {
            fLIZIZ3 = C418440Gaw.LIZIZ(0);
        }
        c384050F3z.LJIIJ = Float.valueOf(fLIZIZ3);
        if (z3) {
            fLIZIZ4 = C418440Gaw.LIZIZ(10);
        } else {
            fLIZIZ4 = C418440Gaw.LIZIZ(0);
        }
        c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ4);
        if (z3) {
            fLIZIZ5 = C418440Gaw.LIZIZ(10);
        } else {
            fLIZIZ5 = C418440Gaw.LIZIZ(0);
        }
        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ5);
        return c384050F3z.LIZ(getContext());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1236570iHf(Context context, boolean z, boolean z2, int i) {
        super(context, null, 0);
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        int i2 = C2187451AjH.LIZ;
        C786410Ut5.Sd(R.layout.ekk, C786410Ut5.ne(context), this);
        setBackground(e0(false, z, z2));
        this.LLILZ = z;
        this.LLILZIL = z2;
    }
}
