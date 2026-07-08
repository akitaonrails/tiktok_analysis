package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.149K, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C149K extends AbstractC202199149t {
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;

    @Override // X.AbstractC202199149t
    public final String LIZIZ() {
        return "";
    }

    @Override // X.AbstractC202199149t
    public final int LIZJ() {
        return 6000;
    }

    @Override // X.AbstractC202199149t
    public final String LJ() {
        return null;
    }

    @Override // X.AbstractC202199149t
    public final String LJFF() {
        return "";
    }

    @Override // X.AbstractC202199149t
    public final String LJI() {
        return "";
    }

    @Override // X.AbstractC202199149t
    public final String LJII() {
        return "";
    }

    @Override // X.AbstractC202199149t
    public final String LJIIIIZZ() {
        return "sms";
    }

    @Override // X.AbstractC202199149t
    public final String LJIIIZ() {
        return "";
    }

    @Override // X.AbstractC202199149t
    public final String LJIIJ() {
        return "";
    }

    @Override // X.AbstractC202199149t
    public final int LJIIJJI() {
        return 1;
    }

    public C149K(int i) {
        this.LJII = null;
        this.LJIIIIZZ = false;
        this.LJIIIZ = null;
        this.LIZIZ = true;
    }

    @Override // X.AbstractC202199149t
    public final void LIZ(StringBuilder sb) {
        C148O.LIZIZ(sb, Scene.SCENE_SERVICE, this.LJII);
        C148O.LIZ(sb, "show_success_toast", this.LJIIIIZZ ? 1 : 0);
        C148O.LIZIZ(sb, "uid", this.LJIIIZ);
    }

    public C149K(String str, boolean z) {
        this(7);
        this.LJII = str;
        this.LJIIIIZZ = z;
    }
}
