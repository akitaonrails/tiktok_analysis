package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1718270uob implements InterfaceC1717200ums {
    public String LIZ;
    public Boolean LIZIZ;
    public InterfaceC1717160umo LIZJ;
    public final List<WeakReference<C19EG>> LIZLLL = new ArrayList();

    @Override // X.InterfaceC1717200ums
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1717200ums
    public final void LJIIIIZZ(InterfaceC1717200ums interfaceC1717200ums, Object obj) {
    }

    @Override // X.InterfaceC1717200ums
    public final void LJIIJJI() {
    }

    public abstract Object LJIIL(C19EG c19eg, InterfaceC1718330uoh interfaceC1718330uoh, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    @Override // X.InterfaceC1717200ums
    public final InterfaceC1717160umo LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1717200ums
    public final List<WeakReference<C19EG>> LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1717200ums
    public final Boolean LJFF() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1717200ums
    public final String LJIIIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1717200ums
    public final void LIZIZ(Boolean bool) {
        this.LIZIZ = bool;
    }

    @Override // X.InterfaceC1717200ums
    public final void LJ(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1717200ums
    public final void LJIIJ(InterfaceC1717160umo interfaceC1717160umo) {
        this.LIZJ = interfaceC1717160umo;
    }
}
