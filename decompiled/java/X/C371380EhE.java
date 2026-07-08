package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EhE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371380EhE extends FrameLayout {
    public ImageView LL;
    public TuxTextView LLILLJJLI;

    public final ImageView getBulletItemIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cy0);
            this.LL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final TuxTextView getBulletItemTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cy1);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setBulletItemIvFromXml(ImageView imageView) {
        this.LL = imageView;
    }

    public final void setBulletItemTvFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public C371380EhE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.LJLLJ(context, R.layout.gb, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BulletItemView, 0, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.BulletItemView_bullet_text);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.BulletItemView_bullet_text_font, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BulletItemView_bullet_text_color, 0);
        typedArrayObtainStyledAttributes.recycle();
        ImageView bulletItemIvFromXml = getBulletItemIvFromXml();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1h);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        bulletItemIvFromXml.setImageDrawable(c384050F3z.LIZ(context));
        TuxTextView bulletItemTvFromXml = getBulletItemTvFromXml();
        bulletItemTvFromXml.setText(strXd);
        bulletItemTvFromXml.setTuxFont(i);
        bulletItemTvFromXml.setTextColor(color);
    }
}
