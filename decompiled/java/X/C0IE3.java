package X;

import android.view.View;
import com.ss.android.ugc.aweme.api.component.videoshrink.CommerceLandingPageVideoShrinkComponent;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0IE3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IE3 extends AbstractC23273099z implements CoroutineExceptionHandler {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IE3(InterfaceC23272099y interfaceC23272099y, Object obj, int i) {
        super(interfaceC23272099y);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJ$0(C0IE3 c0ie3, CoroutineContext coroutineContext, Throwable th) {
        View viewBo = ((CommerceLandingPageVideoShrinkComponent) c0ie3.l0).Bo();
        if (viewBo != null) {
            C786410Ut5.LJLLLLLL(8, viewBo);
        }
    }

    public static final void LJJ$1(C0IE3 c0ie3, CoroutineContext coroutineContext, Throwable th) {
        C201955140j.LJI("WatermarkResourceLoader", th);
        Function1 function1 = (Function1) c0ie3.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
    }
}
