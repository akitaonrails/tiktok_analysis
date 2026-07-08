package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftRestoreOpt$restore$3", f = "DraftRestoreOp.kt", l = {117, 119}, m = "invokeSuspend")
public final class C542490LPj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LBJ>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C542550LPp LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542490LPj(boolean z, C542550LPp c542550LPp, String str, InterfaceC1364105Vn<? super C542490LPj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c542550LPp;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C542490LPj c542490LPj = new C542490LPj(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c542490LPj.LLILLJJLI = obj;
        return c542490LPj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DraftRestoreOpt@9316.restore$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("DraftRestoreOpt@9316.restore$3");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            C1C7U.LIZIZ("DraftRestoreOpt@9316.restore$3");
            return obj;
        }
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        if (!this.LLILLL) {
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C542500LPk(this.LLILZ, this.LLILZIL, null), 3);
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftRestoreOpt@9316.restore$3");
                return objLJFF;
            }
            C1C7U.LIZIZ("DraftRestoreOpt@9316.restore$3");
            return obj;
        }
        C542550LPp c542550LPp = this.LLILZ;
        String str = this.LLILZIL;
        this.LL = 2;
        obj = C23250099c.LJI(this, C2108108Nr.LIZ, new C542530LPn(c542550LPp, str, null));
        if (obj == objLJFF) {
            C1C7U.LIZIZ("DraftRestoreOpt@9316.restore$3");
            return objLJFF;
        }
        C1C7U.LIZIZ("DraftRestoreOpt@9316.restore$3");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LBJ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
