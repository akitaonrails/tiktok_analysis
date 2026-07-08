package X;

import com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl;
import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Ztg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914180Ztg extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;
    public Object l0;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
            case 2:
                LJJ$2(this, coroutineContext, th);
                break;
            case 3:
                LJJ$3(this, coroutineContext, th);
                break;
            case 4:
                LJJ$4(this, coroutineContext, th);
                break;
            case 5:
                LJJ$5(this, coroutineContext, th);
                break;
            case 6:
                LJJ$6(this, coroutineContext, th);
                break;
            case 7:
                LJJ$7(this, coroutineContext, th);
                break;
            case 8:
                LJJ$8(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914180Ztg(InterfaceC23272099y interfaceC23272099y, Object obj, int i) {
        super(interfaceC23272099y);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJ$0(C914180Ztg c914180Ztg, CoroutineContext coroutineContext, Throwable th) {
        InterfaceC882520Yji interfaceC882520Yji = (InterfaceC882520Yji) c914180Ztg.l0;
        if (interfaceC882520Yji != null) {
            interfaceC882520Yji.LIZ(new C892820Z0u("preloadResource", th));
        }
    }

    public static final void LJJ$1(C914180Ztg c914180Ztg, CoroutineContext coroutineContext, Throwable th) {
        ((ActivityStatusAccuracyImpl) c914180Ztg.l0).LIZLLL.LIZIZ();
    }

    public static final void LJJ$2(C914180Ztg c914180Ztg, CoroutineContext coroutineContext, Throwable th) {
        ((MessageListSubmitListAbilityImpl) c914180Ztg.l0).LJIIJ(th);
    }

    public static final void LJJ$3(C914180Ztg c914180Ztg, CoroutineContext coroutineContext, Throwable th) {
        ((C0YF4) c914180Ztg.l0).LJ.LIZ.LIZLLL("IMClient", th);
    }

    public static final void LJJ$4(C914180Ztg c914180Ztg, CoroutineContext coroutineContext, Throwable th) {
        ((C0YEW) c914180Ztg.l0).getEventTracker().LIZ.LIZLLL("SessionClientContext", th);
    }

    public static final void LJJ$5(C914180Ztg c914180Ztg, CoroutineContext coroutineContext, Throwable th) {
        ((C907600Zj4) c914180Ztg.l0).LIZIZ.LIZIZ();
    }

    public static final void LJJ$6(C914180Ztg c914180Ztg, CoroutineContext coroutineContext, Throwable th) {
        ((C907600Zj4) c914180Ztg.l0).LIZIZ.LIZIZ();
    }

    public static final void LJJ$7(C914180Ztg c914180Ztg, CoroutineContext coroutineContext, Throwable th) {
        ((C0ZJD) c914180Ztg.l0).LIZLLL.LIZIZ();
    }

    public static final void LJJ$8(C914180Ztg c914180Ztg, CoroutineContext coroutineContext, Throwable th) {
        ((Function1) c914180Ztg.l0).invoke(null);
    }
}
