package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0O5R, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.state.base.OperationalStateAgent$motaRequest$2$2$1", f = "OperationalStateAgent.kt", l = {}, m = "invokeSuspend")
public final class C0O5R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0O7A<C0O3E> LLILLJJLI;
    public final /* synthetic */ Function2<String, Throwable, Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C0O5V<Object> LLILZIL;
    public final /* synthetic */ Function2<String, Throwable, Unit> LLILZLL;
    public final /* synthetic */ Function2<String, Boolean, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0O5R(C0O7A<C0O3E> c0o7a, Function2<? super String, ? super Throwable, Unit> function2, String str, C0O5V<Object> c0o5v, Function2<? super String, ? super Throwable, Unit> function22, Function2<? super String, ? super Boolean, Unit> function23, InterfaceC1364105Vn<? super C0O5R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0o7a;
        this.LLILLL = function2;
        this.LLILZ = str;
        this.LLILZIL = c0o5v;
        this.LLILZLL = function22;
        this.LLIZ = function23;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0O5R c0o5r = new C0O5R(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0o5r.LL = obj;
        return c0o5r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OperationalStateAgent@2972.motaRequest$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        C0O7A<C0O3E> c0o7a = this.LLILLJJLI;
        if (c0o7a instanceof C0O77) {
            Function2<String, Throwable, Unit> function2 = this.LLILLL;
            if (function2 != null) {
                function2.invoke(this.LLILZ, ((C0O77) c0o7a).LJFF);
            }
        } else if (c0o7a instanceof C0O78) {
            C612250Nzr<Object> c612250Nzr = this.LLILZIL.LIZIZ;
            String str = this.LLILZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(obj2.getClass());
            Pair<Object, Object> pairLIZJ = c612250Nzr.LIZ.LIZJ(str);
            if (pairLIZJ != null) {
                Object first = pairLIZJ.getFirst();
                C0O5Y c0o5y = C0O5Y.LIZ;
                Object second = pairLIZJ.getSecond();
                c0o5y.getClass();
                C0O5Y.LIZLLL(str, c19719912DlLIZ, first, second);
                c612250Nzr.LIZ.LIZLLL(str, new Pair<>(first, first));
                c612250Nzr.LIZ(str, first, EnumC612200Nzm.ROLLBACK);
            } else {
                C0O5Y.LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c19719912DlLIZ.LJI());
                sbLIZ.append(", failed to notify listeners, reason: ");
                sbLIZ.append("no record in repo");
                C0O5Y.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            Function2<String, Throwable, Unit> function22 = this.LLILZLL;
            if (function22 != null) {
                function22.invoke(this.LLILZ, ((C0O78) this.LLILLJJLI).LJFF);
            }
        } else if (c0o7a instanceof C0O79) {
            C0O5V<Object> c0o5v = this.LLILZIL;
            Object objCurrentState = c0o5v.currentState(this.LLILZ, c0o5v.defaultState());
            if (C0O7F.LIZJ(this.LLILLJJLI.LIZJ) == EnumC614130O6x.Optimistic) {
                C0O5V<Object> c0o5v2 = this.LLILZIL;
                Object objLJ = c0o5v2.LJ(objCurrentState);
                C612250Nzr<Object> c612250Nzr2 = this.LLILZIL.LIZIZ;
                String str2 = this.LLILZ;
                Pair<Object, Object> pairLIZJ2 = c612250Nzr2.LIZ.LIZJ(str2);
                if (pairLIZJ2 != null) {
                    c612250Nzr2.LIZ.LIZLLL(str2, new Pair<>(pairLIZJ2.getFirst(), objLJ));
                    c612250Nzr2.LIZ(str2, objLJ, EnumC612200Nzm.OPTIMISTIC);
                }
                Function2<String, Boolean, Unit> function23 = this.LLIZ;
                if (function23 != null) {
                    function23.invoke(this.LLILZ, true);
                }
            } else {
                C612250Nzr<Object> c612250Nzr3 = this.LLILZIL.LIZIZ;
                String str3 = this.LLILZ;
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(obj2.getClass());
                Pair<Object, Object> pairLIZJ3 = c612250Nzr3.LIZ.LIZJ(str3);
                if (pairLIZJ3 != null) {
                    C0O5Y c0o5y2 = C0O5Y.LIZ;
                    Object second2 = pairLIZJ3.getSecond();
                    c0o5y2.getClass();
                    C0O5Y.LIZJ(str3, c19719912DlLIZ2, objCurrentState, second2);
                    if (!Intrinsics.LJFF(pairLIZJ3.getFirst(), objCurrentState)) {
                        c612250Nzr3.LIZ(str3, objCurrentState, EnumC612200Nzm.MUTATION);
                    }
                    c612250Nzr3.LIZ.LIZLLL(str3, new Pair<>(objCurrentState, objCurrentState));
                } else {
                    C0O5Y.LIZ.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c19719912DlLIZ2.LJI());
                    sbLIZ2.append(", failed to notify listeners, reason: ");
                    sbLIZ2.append("no record in repo");
                    C0O5Y.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                Function2<String, Boolean, Unit> function24 = this.LLIZ;
                if (function24 != null) {
                    function24.invoke(this.LLILZ, false);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OperationalStateAgent@2972.motaRequest$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
