package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0w0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1764180w0e extends FrameLayout {
    public final InterfaceC665370Q7z LL;
    public final Fragment LLILLJJLI;
    public final C1764190w0f LLILLL;
    public View LLILZ;

    public abstract View LIZ(Context context);

    public final <T> T getContentView() {
        T t = (T) this.LLILZ;
        if (t == null) {
            return null;
        }
        return t;
    }

    public final Fragment getFragment() {
        return this.LLILLJJLI;
    }

    public final C1764190w0f getPendantContainer() {
        return this.LLILLL;
    }

    public final InterfaceC665370Q7z getVScope() {
        return this.LL;
    }

    public AbstractC1764180w0e(Context context, AttributeSet attributeSet, int i, InterfaceC665370Q7z interfaceC665370Q7z, Fragment fragment) {
        super(context, attributeSet, i);
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = fragment;
        C1764190w0f c1764190w0f = new C1764190w0f(context, interfaceC665370Q7z, 6);
        this.LLILLL = c1764190w0f;
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        View viewLIZ = LIZ(getContext());
        addView(viewLIZ, 0);
        this.LLILZ = viewLIZ;
        c1764190w0f.setId(ViewGroup.generateViewId());
        int visibility = c1764190w0f.getVisibility();
        c1764190w0f.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1764190w0f);
        C1764190w0f c1764190w0f2 = this.LLILLL;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1764190w0f2);
        c1764190w0f2.setLayoutParams(layoutParams2);
        addView(c1764190w0f);
    }

    public /* synthetic */ AbstractC1764180w0e(Context context, AttributeSet attributeSet, int i, InterfaceC665370Q7z interfaceC665370Q7z, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : interfaceC665370Q7z, (Fragment) null);
    }
}
