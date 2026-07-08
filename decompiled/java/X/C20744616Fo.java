package X;

import X.InterfaceC20744716Fp;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.16Fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20744616Fo<T extends Drawable & InterfaceC20744716Fp> extends AbstractC20736516Cl implements InterfaceC1080960eEg, InterfaceC21538019Qs {
    public final C21537819Qq LL = new C21537819Qq(this, EnumC1779280wP0.DRAWABLE);
    public final T LLILLJJLI;

    @Override // X.InterfaceC21538019Qs
    public final void LIZJ(float f) {
    }

    @Override // X.InterfaceC21538219Qu
    public final boolean LIZIZ() {
        this.LLILLJJLI.LIZ();
        return false;
    }

    @Override // X.AbstractC20736516Cl
    public final int[] LIZLLL() {
        this.LL.getClass();
        return R$styleable.ShapeControlHelper;
    }

    @Override // X.InterfaceC1080590eE5
    public final int[] getGradientColors() {
        return this.LL.getGradientColors();
    }

    @Override // X.InterfaceC1080590eE5
    public final float[] getGradientPositions() {
        return this.LL.getGradientPositions();
    }

    @Override // X.InterfaceC21538019Qs
    public final int[] getState() {
        return this.LLILLJJLI.getState();
    }

    @Override // X.InterfaceC21538219Qu
    public final void invalidate() {
        this.LLILLJJLI.invalidateSelf();
    }

    public C20744616Fo(T t) {
        this.LLILLJJLI = t;
    }

    @Override // X.InterfaceC1080960eEg
    public final void setRadius(float f) {
        this.LL.setRadius(f);
    }

    public final void LJ(Context context, TypedArray typedArray) {
        this.LL.LJ(context, typedArray);
    }

    @Override // X.InterfaceC1080590eE5
    public final void LJLILLLLZI(float[] fArr, int[] iArr) {
        this.LL.LJLILLLLZI(fArr, iArr);
    }
}
