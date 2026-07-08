package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.16Fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20743616Fe extends AbstractC20736516Cl implements C16FX, InterfaceC20744516Fn {
    public static final int[] LLILZIL = {-16842910};
    public static final int[] LLILZLL = {R.attr.state_pressed};
    public final Drawable LL;
    public boolean LLILZ;
    public boolean LLILLL = true;
    public final C20743816Fg LLILLJJLI = new C20743816Fg(this);

    @Override // X.AbstractC20736516Cl
    public final int[] LIZLLL() {
        this.LLILLJJLI.getClass();
        return R$styleable.StateAlphaStyleableHelper;
    }

    @Override // X.InterfaceC20744516Fn
    public final int getHeight() {
        return this.LL.getBounds().height();
    }

    @Override // X.InterfaceC20744516Fn
    public final int getWidth() {
        return this.LL.getBounds().width();
    }

    @Override // X.InterfaceC20744516Fn
    public final void invalidate() {
        this.LL.invalidateSelf();
    }

    @Override // X.InterfaceC20744516Fn
    public final boolean LIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC20744516Fn
    public final boolean isEnabled() {
        return this.LLILLL;
    }

    public C20743616Fe(Drawable drawable) {
        this.LL = drawable;
    }

    public final void LJ(Context context, TypedArray typedArray) {
        this.LLILLJJLI.LJ(context, typedArray);
    }
}
