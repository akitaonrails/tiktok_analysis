package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Csg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.split.CaptionSplitTextManager$clearCaptionTextLines$1", f = "CaptionSplitTextManager.kt", l = {132}, m = "invokeSuspend")
public final class C327520Csg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C327570Csl LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C327570Csl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327520Csg(C327570Csl c327570Csl, InterfaceC1364105Vn<? super C327520Csg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c327570Csl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327520Csg(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C327570Csl c327570Csl;
        C1DEV c1dev;
        C1C7U.LIZ("CaptionSplitTextManager@eba9.clearCaptionTextLines$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    c327570Csl = this.LLILLJJLI;
                    c1dev = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c327570Csl = this.LLILZ;
                c1dev = c327570Csl.LJIILJJIL;
                if (c1dev != null) {
                    this.LL = c1dev;
                    this.LLILLJJLI = c327570Csl;
                    this.LLILLL = 1;
                    if (c1dev.LIZLLL(null, this) == objLJFF) {
                        C1C7U.LIZIZ("CaptionSplitTextManager@eba9.clearCaptionTextLines$1");
                        return objLJFF;
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CaptionSplitTextManager@eba9.clearCaptionTextLines$1");
                return unit;
            }
            c327570Csl.LJIJJ.clear();
            c1dev.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("CaptionSplitTextManager@eba9.clearCaptionTextLines$1");
            return unit2;
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
