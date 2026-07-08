package X;

import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {136}, m = "invokeSuspend")
public final class C824710WWv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ AbstractC796540VMm LLILZ;
    public final /* synthetic */ InterfaceC346701Wf<Object> LLILZIL;
    public final /* synthetic */ String[] LLILZLL;
    public final /* synthetic */ Callable<Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C824710WWv(boolean z, AbstractC796540VMm abstractC796540VMm, InterfaceC346701Wf<Object> interfaceC346701Wf, String[] strArr, Callable<Object> callable, InterfaceC1364105Vn<? super C824710WWv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = abstractC796540VMm;
        this.LLILZIL = interfaceC346701Wf;
        this.LLILZLL = strArr;
        this.LLIZ = callable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C824710WWv c824710WWv = new C824710WWv(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c824710WWv.LLILLJJLI = obj;
        return c824710WWv;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.0WWx] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineContext coroutineContextLIZ;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            final C1DEK c1dekLIZ = C095G.LIZ(-1, null, 6);
            final String[] strArr = this.LLILZLL;
            ?? r9 = new AbstractC796650VMx(strArr) { // from class: X.0WWx
                @Override // X.AbstractC796650VMx
                public final void LIZ(Set<String> set) {
                    c1dekLIZ.LJIIIIZZ(Unit.LIZ);
                }
            };
            Object obj2 = Unit.LIZ;
            c1dekLIZ.LJIIIIZZ(obj2);
            C824900WXo c824900WXo = (C824900WXo) interfaceC497601wk.getCoroutineContext().get(C824900WXo.LLILZ);
            if (c824900WXo == null || (coroutineContextLIZ = c824900WXo.LLILLJJLI) == null) {
                if (this.LLILLL) {
                    coroutineContextLIZ = C824680WWs.LIZIZ(this.LLILZ);
                } else {
                    coroutineContextLIZ = C824680WWs.LIZ(this.LLILZ);
                }
            }
            C1DEK c1dekLIZ2 = C095G.LIZ(0, null, 7);
            C23250099c.LIZLLL(interfaceC497601wk, coroutineContextLIZ, null, new C824720WWw(this.LLILZ, r9, c1dekLIZ, this.LLIZ, c1dekLIZ2, null), 2);
            InterfaceC346701Wf<Object> interfaceC346701Wf = this.LLILZIL;
            this.LL = 1;
            Object objLIZ = C095B.LIZ(interfaceC346701Wf, c1dekLIZ2, true, this);
            if (objLIZ == C099R.LJFF()) {
                obj2 = objLIZ;
            }
            if (obj2 == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
