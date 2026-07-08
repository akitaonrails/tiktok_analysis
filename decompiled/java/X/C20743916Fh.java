package X;

import android.content.res.TypedArray;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.16Fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20743916Fh extends AbstractC20736416Ck<View> implements C16FX, InterfaceC20744516Fn {
    public final C20743816Fg LLILLJJLI;

    @Override // X.InterfaceC20744516Fn
    public final boolean LIZ() {
        return this.LL.isPressed();
    }

    @Override // X.AbstractC20736516Cl
    public final int[] LIZLLL() {
        this.LLILLJJLI.getClass();
        return R$styleable.StateAlphaStyleableHelper;
    }

    @Override // X.InterfaceC20744516Fn
    public final int getHeight() {
        return this.LL.getHeight();
    }

    @Override // X.InterfaceC20744516Fn
    public final int getWidth() {
        return this.LL.getWidth();
    }

    @Override // X.InterfaceC20744516Fn
    public final void invalidate() {
        this.LL.invalidate();
    }

    @Override // X.InterfaceC20744516Fn
    public final boolean isEnabled() {
        return this.LL.isEnabled();
    }

    public C20743916Fh(View view) {
        super(view);
        this.LLILLJJLI = new C20743816Fg(this);
    }

    @Override // X.AbstractC20736416Ck
    public final void LJFF(TypedArray typedArray) {
        this.LLILLJJLI.LJ(this.LL.getContext(), typedArray);
    }
}
