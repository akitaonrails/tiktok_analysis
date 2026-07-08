package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696270uF7 implements InterfaceC1684280tvm {
    public Function0<C1682900ttY> LIZ;
    public C05P0<C1682900ttY> LIZIZ;
    public final C05P0 LIZJ = C20028913Yh.LJI(Boolean.FALSE);

    @Override // X.InterfaceC1684280tvm
    public final boolean LIZ() {
        return ((Boolean) this.LIZJ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1684280tvm
    public final long LIZIZ() {
        if (this.LIZIZ == null) {
            Function0<C1682900ttY> function0 = this.LIZ;
            this.LIZIZ = C20028913Yh.LJI(new C1682900ttY(function0 != null ? function0.invoke().LIZ : 0L));
            this.LIZ = null;
        }
        return ((C1682900ttY) ((C13FE) this.LIZIZ).getValue()).LIZ;
    }
}
