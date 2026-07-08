package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySourceHelper$doUpdatePanelComposerData$1$2$1", f = "BeautySourceHelper.kt", l = {27}, m = "invokeSuspend")
public final class C314030CSr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C12I9 LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ C12I9 LLILZIL;
    public final /* synthetic */ Function2<String, String, int[]> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C314030CSr(C12I9 c12i9, Function0<Unit> function0, C12I9 c12i92, Function2<? super String, ? super String, int[]> function2, InterfaceC1364105Vn<? super C314030CSr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c12i9;
        this.LLILZ = function0;
        this.LLILZIL = c12i92;
        this.LLILZLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C314030CSr c314030CSr = new C314030CSr(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c314030CSr.LLILLJJLI = obj;
        return c314030CSr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("BeautySourceHelper@a33b.doUpdatePanelComposerData$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            obj2 = this.LLILLJJLI;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("BeautySourceHelper@a33b.doUpdatePanelComposerData$1$2$1");
                return objLJFF;
            }
        }
        C12I9 c12i9 = this.LLILLL;
        Function0<Unit> function0 = this.LLILZ;
        C12I9 c12i92 = this.LLILZIL;
        Function2<String, String, int[]> function2 = this.LLILZLL;
        synchronized (obj2) {
            try {
                for (ComposerBeauty composerBeauty : (ArrayList) C12HP.LIZJ(c12i9.ne())) {
                    composerBeauty.setEnable(true);
                    C12HP.LIZ(composerBeauty, new C316350Caf(c12i9.Ye()), function2);
                }
                if (function0 != null) {
                    function0.invoke();
                }
                c12i92.Ce();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BeautySourceHelper@a33b.doUpdatePanelComposerData$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
