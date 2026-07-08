package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.0917, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$3$1", f = "DefaultStickerSource.kt", l = {780}, m = "invokeSuspend")
public final class AnonymousClass0917 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public d0 LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ d0 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0917(d0 d0Var, InterfaceC1364105Vn<? super AnonymousClass0917> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = d0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0917(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        C1DEV c1dev;
        C1C7U.LIZ("DefaultStickerSource@cf79.<init>$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                d0Var = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            d0Var = this.LLILZ;
            c1dev = d0Var.LJJIIZ;
            this.LL = c1dev;
            this.LLILLJJLI = d0Var;
            this.LLILLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerSource@cf79.<init>$3$1");
                return objLJFF;
            }
        }
        try {
            d0Var.LJIILJJIL.clear();
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DefaultStickerSource@cf79.<init>$3$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
