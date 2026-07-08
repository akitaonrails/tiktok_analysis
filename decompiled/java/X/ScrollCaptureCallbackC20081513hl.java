package X;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import java.util.function.Consumer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class ScrollCaptureCallbackC20081513hl implements ScrollCaptureCallback {
    public final C20068213fc LIZ;
    public final C1680470tpd LIZIZ;
    public final InterfaceC20082113hr LIZJ;
    public final View LIZLLL;
    public final C054G LJ;
    public final C20081713hn LJFF;

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(Runnable runnable) {
        C23250099c.LIZLLL(this.LJ, C09AM.LL, null, new C20081613hm(this, runnable, null), 2);
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(C1681300tqy.LIZ(this.LIZIZ));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.LJFF.LIZJ = 0.0f;
        this.LIZJ.LIZIZ();
        runnable.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.ScrollCaptureCallbackC20081513hl r12, android.view.ScrollCaptureSession r13, X.C1680470tpd r14, X.InterfaceC1364105Vn r15) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ScrollCaptureCallbackC20081513hl.LIZ(X.13hl, android.view.ScrollCaptureSession, X.0tpd, X.05Vn):java.lang.Object");
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        final AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LJ, null, null, new C20081413hk(this, scrollCaptureSession, rect, consumer, null), 3);
        anonymousClass0956LIZLLL.LJII(new AwS609S0100000_30(cancellationSignal, 315));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: X.13hq
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                anonymousClass0956LIZLLL.LIZIZ(null);
            }
        });
    }

    public ScrollCaptureCallbackC20081513hl(C20068213fc c20068213fc, C1680470tpd c1680470tpd, C054G c054g, C20070013fu c20070013fu, View view) {
        this.LIZ = c20068213fc;
        this.LIZIZ = c1680470tpd;
        this.LIZJ = c20070013fu;
        this.LIZLLL = view;
        this.LJ = C2296808zG.LJII(c054g, new InterfaceC1677690tl9() { // from class: X.0xwo
            @Override // X.InterfaceC1677690tl9
            public final float LJLJI() {
                return 0.0f;
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            public final InterfaceC23272099y getKey() {
                return InterfaceC1677690tl9.LJLJJI;
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
                return (E) C09A1.LIZIZ(this, interfaceC23272099y);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
                return C09A1.LIZJ(this, interfaceC23272099y);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public final CoroutineContext plus(CoroutineContext coroutineContext) {
                return C09A1.LIZLLL(this, coroutineContext);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
                return (R) C09A1.LIZ(this, r, function2);
            }
        });
        this.LJFF = new C20081713hn(c1680470tpd.LIZLLL - c1680470tpd.LIZIZ, new C20072713gL(this, null));
    }
}
