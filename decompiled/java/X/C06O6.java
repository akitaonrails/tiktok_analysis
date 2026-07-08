package X;

import X.C06OO;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06O6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C06O6<T extends C06OO> implements AnonymousClass0684<T> {
    public final C1600706On LL;
    public C06OA LLILLJJLI;
    public View LLILLL;

    public abstract boolean LIZLLL();

    public abstract C067K LJI();

    public abstract Set<C067L> LJII();

    public abstract Object LJIIIIZZ(T t, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn);

    public void LJIIIZ(T t) {
    }

    @Override // X.InterfaceC1599706Od
    public final void pause() {
    }

    @Override // X.InterfaceC1599706Od
    public final void resume() {
    }

    public void LJ() {
        C06OA c06oa = this.LLILLJJLI;
        if (c06oa != null) {
            c06oa.LLZLI();
        }
    }

    public C06O6(C1600706On c1600706On) {
        this.LL = c1600706On;
    }

    @Override // X.AnonymousClass0684
    public boolean LIZ(List<? extends C869590Y9l> list, EnumC1596306Mv enumC1596306Mv) {
        return enumC1596306Mv.getDismissedByActions().LIZIZ;
    }

    @Override // X.AnonymousClass0684
    public boolean LIZJ(C869590Y9l c869590Y9l, EnumC1596306Mv enumC1596306Mv) {
        return enumC1596306Mv.getDismissedByActions().LIZ;
    }

    public final ViewGroup LJFF(C06NG c06ng, C06O9 c06o9) throws Exception {
        C01GW<View> c01gw;
        ViewGroup viewGroup;
        if (!(LJI() instanceof C1598906Nv)) {
            switch (C06NE.LIZ[c06ng.ordinal()]) {
                case 1:
                    c01gw = c06o9.LIZ;
                    break;
                case 2:
                    c01gw = c06o9.LIZIZ;
                    break;
                case 3:
                    c01gw = c06o9.LIZJ;
                    break;
                case 4:
                    c01gw = c06o9.LIZLLL;
                    break;
                case 5:
                    c01gw = c06o9.LJ;
                    break;
                case 6:
                case 7:
                    throw new Exception("Custom container specified. Please use CustomHandlerType.");
                default:
                    throw new C1954807lC();
            }
            View value = null;
            if (c01gw != null) {
                value = c01gw.getValue();
            }
            if ((value instanceof ViewGroup) && (viewGroup = (ViewGroup) value) != null) {
                return viewGroup;
            }
            throw new Exception("Container not found");
        }
        throw new Exception("Custom handler type does not have container view.");
    }

    public Object LJIIJ(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.06MF, X.06O8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(T r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06O6.LJIIJJI(X.06OO, X.05Vn):java.lang.Object");
    }
}
