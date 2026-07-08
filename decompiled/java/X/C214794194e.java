package X;

import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: renamed from: X.194e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214794194e extends AbstractC214793194d {
    public AbstractC214793194d LJ;
    public final String LJFF = "MutableAnimationExecutor";

    public C214794194e(C214798194i c214798194i) {
        this.LJ = c214798194i;
    }

    @Override // X.AbstractC214793194d
    public final void LIZ(InterfaceC214797194h interfaceC214797194h) {
        super.LIZ(interfaceC214797194h);
        this.LJ.LIZ(interfaceC214797194h);
    }

    @Override // X.AbstractC214793194d
    public final void LJI(InterfaceC214797194h interfaceC214797194h) {
        super.LJI(interfaceC214797194h);
        this.LJ.LJI(interfaceC214797194h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC214793194d
    public final void LJII(List<? extends InterfaceC214797194h> list) {
        this.LIZJ = list;
        this.LJ.LJII(list);
    }

    @Override // X.AbstractC214793194d
    @InterfaceC1294060jmO
    public final void LJIIIIZZ(Runnable runnable) {
        this.LIZIZ = runnable;
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        String str = this.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAnimationEndAction ");
        sbLIZ.append(this.LJ);
        c21494919Ad.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.LJIIIIZZ(runnable);
    }

    @Override // X.AbstractC214793194d
    public final void LJIIIZ(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        String str = this.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAnimationViewGroup ");
        sbLIZ.append(this.LJ);
        c21494919Ad.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.LJIIIZ(viewGroup);
    }

    @Override // X.AbstractC214793194d
    public final void LJIIJ(boolean z) {
        this.LIZLLL = z;
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        String str = this.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDisableRemoveView ");
        sbLIZ.append(this.LJ);
        c21494919Ad.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.LJIIJ(z);
    }

    public final void LJIIL(AbstractC214793194d abstractC214793194d) {
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        String str = this.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("change delegated NavigationAnimationExecutor ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" -> ");
        sbLIZ.append(abstractC214793194d);
        c21494919Ad.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        abstractC214793194d.LJIIJ(this.LIZLLL);
        abstractC214793194d.LJIIIIZZ(this.LIZIZ);
        abstractC214793194d.LJIIIZ(this.LIZ);
        abstractC214793194d.LJII(this.LIZJ);
        this.LJ = abstractC214793194d;
    }

    @Override // X.AbstractC214793194d
    public final boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        return this.LJ.LJFF(cls, cls2);
    }

    @Override // X.AbstractC214793194d
    public final void LIZJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        String str = this.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executePopChangeCancelable ");
        sbLIZ.append(this.LJ);
        c21494919Ad.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.LIZJ(c214795194f, c214795194f2, runnable, c1447920nmY);
    }

    @Override // X.AbstractC214793194d
    public final void LJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        String str = this.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executePushChangeCancelable ");
        sbLIZ.append(this.LJ);
        c21494919Ad.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.LJ(c214795194f, c214795194f2, runnable, c1447920nmY);
    }
}
