package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0e12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ufr.UFRCache$Facebook$uploadForAuthorizedUsers$1", f = "UFRCache.kt", l = {257, 244}, m = "invokeSuspend")
public final class C1072500e12 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public int LLILLJJLI;

    public C1072500e12(InterfaceC1364105Vn<? super C1072500e12> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1072500e12(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC383701eN interfaceC383701eN;
        C1C7U.LIZ("UFRCache$Facebook@9fda.uploadForAuthorizedUsers$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            interfaceC383701eN = this.LL;
                            C155000ia.LIZIZ(obj);
                            interfaceC383701eN.LIZIZ(null);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("UFRCache$Facebook@9fda.uploadForAuthorizedUsers$1");
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC383701eN = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    interfaceC383701eN = C1072570e19.LIZIZ;
                    this.LL = interfaceC383701eN;
                    this.LLILLJJLI = 1;
                    if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                        C1C7U.LIZIZ("UFRCache$Facebook@9fda.uploadForAuthorizedUsers$1");
                        return objLJFF;
                    }
                }
                InterfaceC1004520cFO interfaceC1004520cFOLJII = C1071540dzU.LIZIZ.LJII();
                EnumC1074240e3q enumC1074240e3q = EnumC1074240e3q.UNKNOWN;
                this.LL = interfaceC383701eN;
                this.LLILLJJLI = 2;
                if (interfaceC1004520cFOLJII.LIZIZ(enumC1074240e3q, this) == objLJFF) {
                    C1C7U.LIZIZ("UFRCache$Facebook@9fda.uploadForAuthorizedUsers$1");
                    return objLJFF;
                }
                interfaceC383701eN.LIZIZ(null);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("UFRCache$Facebook@9fda.uploadForAuthorizedUsers$1");
                return unit2;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                interfaceC383701eN.LIZIZ(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1072500e12(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
