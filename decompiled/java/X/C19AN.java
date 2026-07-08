package X;

import Y.ARunnableS132S0100000_32;
import android.view.View;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.19AN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19AN extends C19AA {
    public final int LJIIJ;
    public final String LJIIJJI;
    public final InterfaceC21499419Bw LJIIL;

    @Override // X.C19AA
    public final void LIZIZ(boolean z) {
        final C195F c195fLIZ;
        View view;
        if (!z || (c195fLIZ = this.LJIIL.LIZ()) == null || (view = this.LIZ.mView) == null) {
            return;
        }
        c195fLIZ.LIZ(new ARunnableS132S0100000_32(this, 19));
        C19A4.LJIIIIZZ.put(this.LIZ, new C1447920nmY() { // from class: X.19BF
            @Override // X.C1447920nmY
            public final void LIZ() {
                super.LIZ();
                c195fLIZ.LIZJ();
            }
        });
        c195fLIZ.LJII(view);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19AN(C19A4 c19a4, int i, Scene scene, String str, InterfaceC21499419Bw interfaceC21499419Bw) {
        EnumC214943199x enumC214943199x = EnumC214943199x.RESUMED;
        EnumC214943199x enumC214943199x2 = c19a4.LIZ.mState;
        super(c19a4, scene, i, str, enumC214943199x.value >= enumC214943199x2.value ? enumC214943199x2 : enumC214943199x, true, false, false);
        this.LJIIJ = i;
        this.LJIIJJI = str;
        this.LJIIL = interfaceC21499419Bw;
    }
}
