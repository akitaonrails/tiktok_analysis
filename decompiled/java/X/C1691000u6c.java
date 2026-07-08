package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0u6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691000u6c extends AbstractC1691020u6e<C1691040u6g> implements C0MAE {
    public final C1691060u6i<C1691040u6g> LIZ = new C1691060u6i<>();
    public C1688450u2V LIZIZ;

    @Override // X.AbstractC1691020u6e
    public final /* bridge */ /* synthetic */ C1691060u6i LJFF() {
        return this.LIZ;
    }

    public C1691000u6c(Function1<? super C0MAE, Unit> function1) {
        function1.invoke(this);
    }

    @Override // X.C0MAE
    public final void LIZIZ(Object obj, Object obj2, C19719212De c19719212De) {
        AwS581S0100000_2 awS581S0100000_2;
        C1691060u6i<C1691040u6g> c1691060u6i = this.LIZ;
        if (obj != null) {
            awS581S0100000_2 = new AwS581S0100000_2(obj, (Object) 581);
        } else {
            awS581S0100000_2 = null;
        }
        c1691060u6i.LIZ(1, new C1691040u6g(awS581S0100000_2, new AwS581S0100000_2(obj2, (Object) 582), new C19719212De(-1010194746, new C346570DiJ(c19719212De, 3), true)));
    }

    @Override // X.C0MAE
    public final void LIZLLL(Object obj, Object obj2, C19719212De c19719212De) {
        C1688450u2V c1688450u2V = this.LIZIZ;
        if (c1688450u2V == null) {
            c1688450u2V = new C1688450u2V();
            this.LIZIZ = c1688450u2V;
        }
        c1688450u2V.LIZJ(this.LIZ.LIZIZ);
        LIZIZ(obj, obj2, new C19719212De(1491981087, new C342280DbO(this.LIZ.LIZIZ, c19719212De), true));
    }

    @Override // X.C0MAE
    public final void LIZJ(int i, Function1 function1, Function1 function12, C19719212De c19719212De) {
        this.LIZ.LIZ(i, new C1691040u6g(function1, function12, c19719212De));
    }
}
