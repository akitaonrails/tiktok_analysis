package X;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.19VZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19VZ extends AbstractC21549319Vb implements C19VX {
    public final Context LLILLL;
    public final C19V6 LLILZ;
    public InterfaceC21549419Vc LLILZIL;
    public WeakReference<View> LLILZLL;
    public final /* synthetic */ C19W2 LLIZ;

    @Override // X.AbstractC21549319Vb
    public final void LIZJ() {
        C19W2 c19w2 = this.LLIZ;
        if (c19w2.LJIIIIZZ != this) {
            return;
        }
        boolean z = c19w2.LJIILLIIL;
        boolean z2 = c19w2.LJIIZILJ;
        if (z || z2) {
            c19w2.LJIIIZ = this;
            c19w2.LJIIJ = this.LLILZIL;
        } else {
            this.LLILZIL.LIZJ(this);
        }
        this.LLILZIL = null;
        this.LLIZ.LJIJI(false);
        C19VE c19ve = this.LLIZ.LJFF;
        if (c19ve.LLJIJIL == null) {
            c19ve.LJII();
        }
        C19W2 c19w22 = this.LLIZ;
        c19w22.LIZJ.setHideOnContentScrollEnabled(c19w22.LJIL);
        this.LLIZ.LJIIIIZZ = null;
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
        return new C19QR(this.LLILLL);
    }

    @Override // X.AbstractC21549319Vb
    public final CharSequence LJI() {
        return this.LLIZ.LJFF.getSubtitle();
    }

    @Override // X.AbstractC21549319Vb
    public final CharSequence LJII() {
        return this.LLIZ.LJFF.getTitle();
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIIIIZZ() {
        if (this.LLIZ.LJIIIIZZ != this) {
            return;
        }
        this.LLILZ.LJJI();
        try {
            this.LLILZIL.LIZ(this, this.LLILZ);
            this.LLILZ.LJJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZ.LJJ();
            throw th;
        }
    }

    @Override // X.AbstractC21549319Vb
    public final boolean LJIIIZ() {
        return this.LLIZ.LJFF.LLJJIJIIJIL;
    }

    @Override // X.AbstractC21549319Vb
    public final C19V6 LJ() {
        return this.LLILZ;
    }

    @Override // X.C19VX
    public final void LIZIZ(C19V6 c19v6) {
        if (this.LLILZIL == null) {
            return;
        }
        LJIIIIZZ();
        ActionMenuPresenter actionMenuPresenter = this.LLIZ.LJFF.LLILZ;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJIILIIL();
        }
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIIJ(View view) {
        this.LLIZ.LJFF.setCustomView(view);
        this.LLILZLL = new WeakReference<>(view);
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIIJJI(int i) {
        LJIIL(this.LLIZ.LIZ.getResources().getString(i));
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIIL(CharSequence charSequence) {
        this.LLIZ.LJFF.setSubtitle(charSequence);
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIILIIL(int i) {
        LJIILJJIL(this.LLIZ.LIZ.getResources().getString(i));
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIILJJIL(CharSequence charSequence) {
        this.LLIZ.LJFF.setTitle(charSequence);
    }

    @Override // X.AbstractC21549319Vb
    public final void LJIILL(boolean z) {
        this.LLILLJJLI = z;
        this.LLIZ.LJFF.setTitleOptional(z);
    }

    @Override // X.C19VX
    public final boolean LIZ(C19V6 c19v6, MenuItem menuItem) {
        InterfaceC21549419Vc interfaceC21549419Vc = this.LLILZIL;
        if (interfaceC21549419Vc != null) {
            return interfaceC21549419Vc.LIZLLL(this, menuItem);
        }
        return false;
    }

    public C19VZ(C19W2 c19w2, Context context, C19WK c19wk) {
        this.LLIZ = c19w2;
        this.LLILLL = context;
        this.LLILZIL = c19wk;
        C19V6 c19v6 = new C19V6(context);
        c19v6.LJIIJJI = 1;
        this.LLILZ = c19v6;
        c19v6.LJ = this;
    }
}
