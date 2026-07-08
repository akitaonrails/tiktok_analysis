package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425800Gmo extends FrameLayout {
    public C425750Gmj LL;
    public TuxIconView LLILLJJLI;
    public View LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public C419910GdJ LLIZ;
    public int LLIZLLLIL;
    public C384050F3z LLJ;

    public C425800Gmo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final C425750Gmj getAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bh2);
            this.LL = (C425750Gmj) callbackFindViewById;
        }
        return (C425750Gmj) callbackFindViewById;
    }

    public final View getIconBackgroundFromXml() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.jyw);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxIconView getIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxe);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C384050F3z getIconBackground() {
        return this.LLJ;
    }

    public final int getIconBackgroundSize() {
        return this.LLIZLLLIL;
    }

    public final int getIconRes() {
        return this.LLILZLL;
    }

    public final int getIconSize() {
        return this.LLILZ;
    }

    public final C419910GdJ getTuxIcon() {
        return this.LLIZ;
    }

    public final void setAvatarFromXml(C425750Gmj c425750Gmj) {
        this.LL = c425750Gmj;
    }

    public final void setHollow(boolean z) {
        this.LLILZIL = z;
        getAvatarFromXml().setHollow(this.LLILZIL);
        invalidate();
    }

    public final void setIconBackground(C384050F3z c384050F3z) {
        Drawable drawableLIZ;
        this.LLJ = c384050F3z;
        if (c384050F3z != null) {
            C786410Ut5.LJLLLLLL(0, getIconBackgroundFromXml());
        } else {
            C786410Ut5.LJLLLLLL(8, getIconBackgroundFromXml());
        }
        View iconBackgroundFromXml = getIconBackgroundFromXml();
        C384050F3z c384050F3z2 = this.LLJ;
        if (c384050F3z2 != null) {
            drawableLIZ = c384050F3z2.LIZ(getContext());
        } else {
            drawableLIZ = null;
        }
        iconBackgroundFromXml.setBackground(drawableLIZ);
    }

    public final void setIconBackgroundFromXml(View view) {
        this.LLILLL = view;
    }

    public final void setIconBackgroundSize(int i) {
        this.LLIZLLLIL = i;
        getAvatarFromXml().setIconRadius(Math.max(this.LLIZLLLIL, this.LLILZ) / 2.0f);
        View iconBackgroundFromXml = getIconBackgroundFromXml();
        ViewGroup.LayoutParams layoutParams = getIconBackgroundFromXml().getLayoutParams();
        int i2 = this.LLIZLLLIL;
        layoutParams.width = i2;
        layoutParams.height = i2;
        C786410Ut5.W5(iconBackgroundFromXml, layoutParams);
    }

    public final void setIconFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setIconRes(int i) {
        this.LLILZLL = i;
        getIconFromXml().setIconRes(i);
    }

    public final void setIconSize(int i) {
        this.LLILZ = i;
        getAvatarFromXml().setIconRadius(Math.max(this.LLILZ, this.LLIZLLLIL) / 2.0f);
        getIconFromXml().setIconWidth(this.LLILZ);
        getIconFromXml().setIconHeight(this.LLILZ);
    }

    public final void setTuxIcon(C419910GdJ c419910GdJ) {
        this.LLIZ = c419910GdJ;
        getIconFromXml().setTuxIcon(this.LLIZ);
    }

    public C425800Gmo(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        this.LLILZIL = true;
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        C786410Ut5.Sd(R.layout.d22, C786410Ut5.ne(context), this);
    }

    public static void LIZ(C425800Gmo c425800Gmo, ImageUrlModel imageUrlModel, String str, int i) {
        boolean z;
        String str2 = str;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        C427660Gpo.LJIIJJI(c425800Gmo.getAvatarFromXml(), imageUrlModel, true, null, str2, z, false, null, null, false, null, 832);
    }
}
