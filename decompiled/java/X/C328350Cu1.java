package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.loader.CombinedLoader$loadInternal$1$1", f = "CombinedLoader.kt", l = {}, m = "invokeSuspend")
public final class C328350Cu1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1382250m4d<R> LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328350Cu1(C1382250m4d<R> c1382250m4d, Object obj, boolean z, InterfaceC1364105Vn<? super C328350Cu1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1382250m4d;
        this.LLILLJJLI = obj;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328350Cu1(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CombinedLoader@3101.loadInternal$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJI = false;
        InterfaceC328360Cu2 interfaceC328360Cu2 = null;
        if (C189200o6.m8isSuccessimpl(this.LLILLJJLI)) {
            C1382250m4d<R> c1382250m4d = this.LL;
            Object obj2 = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            if (C189200o6.m7isFailureimpl(obj2)) {
                obj2 = arrayList;
            }
            List list = (List) obj2;
            if (this.LLILLL) {
                InterfaceC328360Cu2 interfaceC328360Cu22 = c1382250m4d.LIZ;
                if (interfaceC328360Cu22 != null) {
                    interfaceC328360Cu2 = interfaceC328360Cu22;
                }
                interfaceC328360Cu2.tg2(list, c1382250m4d.LJ());
            } else {
                InterfaceC328360Cu2 interfaceC328360Cu23 = c1382250m4d.LIZ;
                if (interfaceC328360Cu23 != null) {
                    interfaceC328360Cu2 = interfaceC328360Cu23;
                }
                interfaceC328360Cu2.r61(list, c1382250m4d.LJ());
            }
        } else if (C189200o6.m7isFailureimpl(this.LLILLJJLI)) {
            AbstractC328380Cu4 abstractC328380Cu4 = this.LL;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(this.LLILLJJLI);
            if (this.LLILLL) {
                InterfaceC328360Cu2 interfaceC328360Cu24 = abstractC328380Cu4.LIZ;
                if (interfaceC328360Cu24 != null) {
                    interfaceC328360Cu2 = interfaceC328360Cu24;
                }
                interfaceC328360Cu2.ug(thM5exceptionOrNullimpl);
            } else {
                InterfaceC328360Cu2 interfaceC328360Cu25 = abstractC328380Cu4.LIZ;
                if (interfaceC328360Cu25 != null) {
                    interfaceC328360Cu2 = interfaceC328360Cu25;
                }
                interfaceC328360Cu2.WD2(thM5exceptionOrNullimpl);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CombinedLoader@3101.loadInternal$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
