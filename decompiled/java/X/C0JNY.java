package X;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JNY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerVideoLayout$initObserver$1$1$1$1", f = "PlayerVideoLayout.kt", l = {}, m = "invokeSuspend")
public final class C0JNY extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0JNZ LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JNY(C0JNZ c0jnz, int i, InterfaceC1364105Vn<? super C0JNY> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c0jnz;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JNY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewTreeObserver viewTreeObserver;
        C1C7U.LIZ("PlayerVideoLayout@b176.initObserver$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0JNZ c0jnz = this.LL;
        boolean zLJJII = C500260Jjc.LJJII(this.LLILLJJLI);
        View videoContainer = c0jnz.getVideoContainer();
        if (videoContainer != null) {
            int iLIZIZ = 0;
            if (!zLJJII) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            }
            C426750GoL.LJIIIZ(videoContainer, 0, 0, 0, Integer.valueOf(iLIZIZ), false, 16);
        }
        View videoContainer2 = c0jnz.getVideoContainer();
        if (videoContainer2 != null && (viewTreeObserver = videoContainer2.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521800KdG viewTreeObserverOnGlobalLayoutListenerC521800KdG = new ViewTreeObserverOnGlobalLayoutListenerC521800KdG(c0jnz, 5);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521800KdG);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521800KdG, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerVideoLayout@b176.initObserver$1$1$1$1");
        return unit;
    }
}
