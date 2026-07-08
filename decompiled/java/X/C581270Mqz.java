package X;

import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.tts.oecverify.BdTuring;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Mqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581270Mqz extends AbstractC23273099z implements CoroutineExceptionHandler {
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
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJ$9(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C581270Mqz(InterfaceC23272099y interfaceC23272099y, Object obj, int i) {
        super(interfaceC23272099y);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJ$0(C581270Mqz c581270Mqz, CoroutineContext coroutineContext, Throwable th) {
        C0CNO.LIZLLL(0L, new AwS552S0100000_8((FTCVideoPublishFragment) c581270Mqz.l0, 131));
        C201955140j.LJI("FTCVideoPublishFragment", th);
    }

    public static final void LJJ$1(C581270Mqz c581270Mqz, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("text2image error");
        sbLIZ.append(th);
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        C201955140j.LJIIIZ(C1662160tM6.LIZIZ, "TextToImageTitleBarApi", "clickNext error", th);
        ((C571990Mc1) c581270Mqz.l0).LLJIJIL = false;
    }

    public static final void LJJ$2(C581270Mqz c581270Mqz, CoroutineContext coroutineContext, Throwable th) {
        C1AF0.LJ(th);
        ((Function1) c581270Mqz.l0).invoke(null);
    }

    public static final void LJJ$3(C581270Mqz c581270Mqz, CoroutineContext coroutineContext, Throwable th) {
        ((C09AJ) c581270Mqz.l0).onError(th);
    }

    public static final void LJJ$4(C581270Mqz c581270Mqz, CoroutineContext coroutineContext, Throwable th) {
        ((InterfaceC2329309At) c581270Mqz.l0).onError(th);
    }

    public static final void LJJ$5(C581270Mqz c581270Mqz, CoroutineContext coroutineContext, Throwable th) {
        ((C09AJ) c581270Mqz.l0).onError(th);
    }

    public static final void LJJ$6(C581270Mqz c581270Mqz, CoroutineContext coroutineContext, Throwable th) {
        ((InterfaceC2329309At) c581270Mqz.l0).onError(th);
    }

    public static final void LJJ$7(C581270Mqz c581270Mqz, CoroutineContext coroutineContext, Throwable th) {
        if (!((C09AJ) c581270Mqz.l0).isDisposed()) {
            ((C09AJ) c581270Mqz.l0).onError(th);
        }
    }

    public static final void LJJ$8(C581270Mqz c581270Mqz, CoroutineContext coroutineContext, Throwable th) {
        ((C09AJ) c581270Mqz.l0).onError(th);
    }

    public static final void LJJ$9(C581270Mqz c581270Mqz, CoroutineContext coroutineContext, Throwable th) {
        if (!((C09AJ) c581270Mqz.l0).isDisposed()) {
            ((C09AJ) c581270Mqz.l0).onError(th);
        }
    }
}
