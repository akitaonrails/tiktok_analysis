package androidx.compose.ui.input.pointer;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C20065413fA;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class SuspendPointerInputElement extends AbstractC1685820tyG<C20065413fA> {
    public final Object LIZIZ;
    public final Object LIZJ;
    public final Object[] LIZLLL;
    public final PointerInputEventHandler LJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C20065413fA(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public final int hashCode() {
        Object obj = this.LIZIZ;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.LIZLLL;
        return ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31) + this.LJ.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C20065413fA c20065413fA = (C20065413fA) abstractC20055413dY;
        Object obj = this.LIZIZ;
        Object obj2 = this.LIZJ;
        Object[] objArr = this.LIZLLL;
        PointerInputEventHandler pointerInputEventHandler = this.LJ;
        boolean z = !Intrinsics.LJFF(c20065413fA.LLJJ, obj);
        c20065413fA.LLJJ = obj;
        if (!Intrinsics.LJFF(c20065413fA.LLJJI, obj2)) {
            z = true;
        }
        c20065413fA.LLJJI = obj2;
        Object[] objArr2 = c20065413fA.LLJJIII;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr, objArr2)) {
                z = true;
            }
        } else if (objArr != null) {
            z = true;
        }
        c20065413fA.LLJJIII = objArr;
        if (c20065413fA.LLJJIJI.getClass() != pointerInputEventHandler.getClass() || z) {
            c20065413fA.LJLLLL();
        }
        c20065413fA.LLJJIJI = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!Intrinsics.LJFF(this.LIZIZ, suspendPointerInputElement.LIZIZ) || !Intrinsics.LJFF(this.LIZJ, suspendPointerInputElement.LIZJ)) {
            return false;
        }
        Object[] objArr = this.LIZLLL;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.LIZLLL;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.LIZLLL != null) {
            return false;
        }
        if (this.LJ == suspendPointerInputElement.LJ) {
            return true;
        }
        return false;
    }

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.LIZIZ = obj;
        this.LIZJ = obj2;
        this.LIZLLL = objArr;
        this.LJ = pointerInputEventHandler;
    }
}
