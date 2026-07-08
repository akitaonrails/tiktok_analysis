package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.11xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19670611xg extends Scene implements InterfaceC19670711xh, InterfaceC379610EuV {
    public final C1DRG LLJI;
    public final C19A3 LLJIJIL;
    public final int LLJILJIL;

    public final void hide() {
        if (this.LLJIJIL.isShowing(this)) {
            this.LLJIJIL.hide(this);
        }
    }

    public final void show() {
        if (!this.LLJIJIL.isAdded(this)) {
            this.LLJIJIL.add(this.LLJILJIL, this, getTag());
        }
        if (this.LLJIJIL.isShowing(this)) {
            return;
        }
        this.LLJIJIL.show(this);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public AbstractC19670611xg(C1DRG c1drg, C12VN c12vn, int i) {
        this.LLJI = c1drg;
        this.LLJIJIL = c12vn;
        this.LLJILJIL = i;
    }
}
