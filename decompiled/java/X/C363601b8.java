package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01b8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinImageGeckoManagerV2$fetchResource$1$1", f = "BulletinImageGeckoManagerV2.kt", l = {266, 271}, m = "invokeSuspend")
public final class C363601b8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1533790q13 LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, C1533790q13, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C363601b8(C1533790q13 c1533790q13, InterfaceC1631620sYq<? super Boolean, ? super C1533790q13, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, InterfaceC1364105Vn<? super C363601b8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1533790q13;
        this.LLILLL = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C363601b8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinImageGeckoManagerV2@3246.fetchResource$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1533790q13 c1533790q13 = this.LLILLJJLI;
            if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinImageGeckoManagerV2");
                sbLIZ.append(this.LLILLJJLI.LJ);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BulletinImageGeckoManagerV2");
                sbLIZ2.append(this.LLILLJJLI.LIZLLL());
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("BulletinImageGeckoManagerV2is cache: ");
                sbLIZ3.append(this.LLILLJJLI.LJI);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
                InterfaceC1631620sYq<Boolean, C1533790q13, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631620sYq = this.LLILLL;
                if (interfaceC1631620sYq != null) {
                    C1533790q13 c1533790q132 = this.LLILLJJLI;
                    this.LL = 2;
                    if (interfaceC1631620sYq.invoke(true, c1533790q132, this) == objLJFF) {
                        C1C7U.LIZIZ("BulletinImageGeckoManagerV2@3246.fetchResource$1$1");
                        return objLJFF;
                    }
                }
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("BulletinImageGeckoManagerV2");
                sbLIZ4.append(this.LLILLJJLI.LIZLLL);
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ4));
                InterfaceC1631620sYq<Boolean, C1533790q13, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631620sYq2 = this.LLILLL;
                if (interfaceC1631620sYq2 != null) {
                    C1533790q13 c1533790q133 = this.LLILLJJLI;
                    this.LL = 1;
                    if (interfaceC1631620sYq2.invoke(false, c1533790q133, this) == objLJFF) {
                        C1C7U.LIZIZ("BulletinImageGeckoManagerV2@3246.fetchResource$1$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinImageGeckoManagerV2@3246.fetchResource$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
