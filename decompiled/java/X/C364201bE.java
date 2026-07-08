package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinImageGeckoManager$fetchResource$1$1", f = "BulletinImageGeckoManager.kt", l = {}, m = "invokeSuspend")
public final class C364201bE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1533790q13 LL;
    public final /* synthetic */ Function2<Boolean, C1533790q13, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C364201bE(C1533790q13 c1533790q13, Function2<? super Boolean, ? super C1533790q13, Unit> function2, InterfaceC1364105Vn<? super C364201bE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1533790q13;
        this.LLILLJJLI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C364201bE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinImageGeckoManager@3c6e.fetchResource$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1533790q13 c1533790q13 = this.LL;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinImageGeckoManager");
            sbLIZ.append(this.LL.LJ);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BulletinImageGeckoManager");
            sbLIZ2.append(this.LL.LIZLLL());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("BulletinImageGeckoManageris cache: ");
            sbLIZ3.append(this.LL.LJI);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
            Function2<Boolean, C1533790q13, Unit> function2 = this.LLILLJJLI;
            if (function2 != null) {
                function2.invoke(true, this.LL);
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("BulletinImageGeckoManager");
            sbLIZ4.append(this.LL.LIZLLL);
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ4));
            Function2<Boolean, C1533790q13, Unit> function22 = this.LLILLJJLI;
            if (function22 != null) {
                function22.invoke(false, this.LL);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinImageGeckoManager@3c6e.fetchResource$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
