package X;

import Y.ACListenerS143S0100000_8;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526940KlY extends FrameLayout {
    public View LL;
    public C197039127h LLILLJJLI;
    public View LLILLL;

    public final C197039127h getSureTextView() {
        C197039127h c197039127h = this.LLILLJJLI;
        if (c197039127h == null) {
            return null;
        }
        return c197039127h;
    }

    public final void setExtractMusicRootBackground(Drawable drawable) {
        View view = this.LLILLL;
        if (view == null) {
            view = null;
        }
        view.setBackground(drawable);
    }

    public final void setOnExtractClick(View.OnClickListener onClickListener) {
        C197039127h c197039127h = this.LLILLJJLI;
        if (c197039127h == null) {
            c197039127h = null;
        }
        C786410Ut5.U8(c197039127h, onClickListener);
    }

    public C526940KlY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewSd = C786410Ut5.Sd(R.layout.d4a, C786410Ut5.ne(context), this);
        this.LL = viewSd;
        this.LLILLL = (viewSd == null ? null : viewSd).findViewById(R.id.hiw);
        View view = this.LL;
        C197039127h c197039127h = (C197039127h) (view == null ? null : view).findViewById(R.id.zl9);
        this.LLILLJJLI = c197039127h;
        (c197039127h == null ? null : c197039127h).setSupportClickWhenDisable(true);
        C197039127h c197039127h2 = this.LLILLJJLI;
        C786410Ut5.U8(c197039127h2 != null ? c197039127h2 : null, new ACListenerS143S0100000_8(this, 151));
        setOutlineProvider(new ViewOutlineProvider() { // from class: X.0KmG
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
            }
        });
        setClipToOutline(true);
        setElevation(C0JAI.LIZ(16.0f, context));
    }
}
