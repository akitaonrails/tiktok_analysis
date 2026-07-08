package X;

import com.google.gson.n;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.DataCenter$observeFetchApi$1$1", f = "DataCenter.kt", l = {}, m = "invokeSuspend")
public final class C497501wj extends C09AX implements Function2<Pair<? extends String, ? extends C189200o6<? extends n>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1106810euN LLILLJJLI;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLL;
    public final /* synthetic */ Function1<n, Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C497501wj(C1106810euN c1106810euN, String str, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, Function1 function12) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1106810euN;
        this.LLILLL = function1;
        this.LLILZ = function12;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C497501wj c497501wj = new C497501wj(this.LLILLJJLI, this.LLILZIL, interfaceC1364105Vn, this.LLILLL, this.LLILZ);
        c497501wj.LL = obj;
        return c497501wj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("DataCenter@f176.observeFetchApi$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = (Pair) this.LL;
        C09AE c09ae = (C09AE) this.LLILLJJLI.LIZ.getCoroutineContext().get(C09AE.LJJLJ);
        if (c09ae != null) {
            C23118094a.LJFF(c09ae);
        }
        Object objM10unboximpl = ((C189200o6) pair.getSecond()).m10unboximpl();
        if (C189200o6.m7isFailureimpl(objM10unboximpl)) {
            obj2 = null;
        } else {
            obj2 = objM10unboximpl;
        }
        n nVar = (n) obj2;
        if (!C189200o6.m7isFailureimpl(objM10unboximpl) && nVar != null) {
            this.LLILZ.invoke(nVar);
            C1106750euH c1106750euH = C1106750euH.LIZ;
            C1106750euH.LJIILJJIL(this.LLILLJJLI, nVar, null);
        } else {
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objM10unboximpl);
            if (thM5exceptionOrNullimpl == null) {
                thM5exceptionOrNullimpl = new Exception();
            }
            this.LLILLL.invoke(thM5exceptionOrNullimpl);
            C1106750euH c1106750euH2 = C1106750euH.LIZ;
            C1106750euH.LJIILJJIL(this.LLILLJJLI, null, thM5exceptionOrNullimpl);
        }
        C1106750euH c1106750euH3 = C1106750euH.LIZ;
        C1106750euH.LJIIIZ().remove(this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DataCenter@f176.observeFetchApi$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends String, ? extends C189200o6<? extends n>> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
