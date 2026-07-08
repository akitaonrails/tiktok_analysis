package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Csf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionTextManager$clearCaptionTextLines$1", f = "CaptionTextManager.kt", l = {301}, m = "invokeSuspend")
public final class C327510Csf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C327620Csq LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C327620Csq LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327510Csf(C327620Csq c327620Csq, InterfaceC1364105Vn<? super C327510Csf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c327620Csq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327510Csf(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C327620Csq c327620Csq;
        C1DEV c1dev;
        C1C7U.LIZ("CaptionTextManager@987e.clearCaptionTextLines$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    c327620Csq = this.LLILLJJLI;
                    c1dev = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c327620Csq = this.LLILZ;
                c1dev = c327620Csq.LJIILJJIL;
                if (c1dev != null) {
                    this.LL = c1dev;
                    this.LLILLJJLI = c327620Csq;
                    this.LLILLL = 1;
                    if (c1dev.LIZLLL(null, this) == objLJFF) {
                        C1C7U.LIZIZ("CaptionTextManager@987e.clearCaptionTextLines$1");
                        return objLJFF;
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CaptionTextManager@987e.clearCaptionTextLines$1");
                return unit;
            }
            ((ArrayList) c327620Csq.LJIIJJI).clear();
            c1dev.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("CaptionTextManager@987e.clearCaptionTextLines$1");
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
