package X;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.19VY, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19VY extends AbstractC21549319Vb implements C19VX {
    public final Context LLILLL;
    public final C19VE LLILZ;
    public final InterfaceC21549419Vc LLILZIL;
    public WeakReference<View> LLILZLL;
    public boolean LLIZ;
    public final C19V6 LLIZLLLIL;

    @Override // X.AbstractC21549319Vb
    public final void LIZJ() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        this.LLILZIL.LIZJ(this);
    }

    @Override // X.AbstractC21549319Vb
    public final View LIZLLL() {
        WeakReference<View> weakReference = this.LLILZLL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.AbstractC21549319Vb
    public final MenuInflater LJFF() {
        return new C19QR(this.LLILZ.getContext());
    }

    @Override // X.AbstractC21549319Vb
    public final CharSequence LJI() {
        return this.LLILZ.getSubtitle();
    }

    @Override // X.AbstractC21549319Vb
    public final CharSequence LJII() {
        return this.LLILZ.getTitle();
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIIIIZZ() {
        this.LLILZIL.LIZ(this, this.LLIZLLLIL);
    }

    @Override // X.AbstractC21549319Vb
    public final boolean LJIIIZ() {
        return this.LLILZ.LLJJIJIIJIL;
    }

    @Override // X.AbstractC21549319Vb
    public final C19V6 LJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.C19VX
    public final void LIZIZ(C19V6 c19v6) {
        LJIIIIZZ();
        ActionMenuPresenter actionMenuPresenter = this.LLILZ.LLILZ;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJIILIIL();
        }
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIIJ(View view) {
        WeakReference<View> weakReference;
        this.LLILZ.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.LLILZLL = weakReference;
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIIJJI(int i) {
        LJIIL(this.LLILLL.getString(i));
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIIL(CharSequence charSequence) {
        this.LLILZ.setSubtitle(charSequence);
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIILIIL(int i) {
        LJIILJJIL(this.LLILLL.getString(i));
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIILJJIL(CharSequence charSequence) {
        this.LLILZ.setTitle(charSequence);
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIILL(boolean z) {
        this.LLILLJJLI = z;
        this.LLILZ.setTitleOptional(z);
    }

    @Override // X.C19VX
    public final boolean LIZ(C19V6 c19v6, MenuItem menuItem) {
        return this.LLILZIL.LIZLLL(this, menuItem);
    }

    public C19VY(Context context, C19VE c19ve, InterfaceC21549419Vc interfaceC21549419Vc) {
        this.LLILLL = context;
        this.LLILZ = c19ve;
        this.LLILZIL = interfaceC21549419Vc;
        C19V6 c19v6 = new C19V6(c19ve.getContext());
        c19v6.LJIIJJI = 1;
        this.LLIZLLLIL = c19v6;
        c19v6.LJ = this;
    }
}
