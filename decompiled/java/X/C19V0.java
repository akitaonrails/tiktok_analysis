package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: X.19V0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19V0 extends C19V1 implements SubMenu {
    public final C19QV LJ;

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.LJ.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return LIZJ(this.LJ.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.LJ.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.LJ.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.LJ.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.LJ.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.LJ.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.LJ.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.LJ.setIcon(drawable);
        return this;
    }

    public C19V0(Context context, C19QV c19qv) {
        super(context, c19qv);
        this.LJ = c19qv;
    }
}
