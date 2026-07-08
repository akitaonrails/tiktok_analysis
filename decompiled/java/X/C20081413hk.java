package X;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13hk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {119}, m = "invokeSuspend")
public final class C20081413hk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ScrollCaptureCallbackC20081513hl LLILLJJLI;
    public final /* synthetic */ ScrollCaptureSession LLILLL;
    public final /* synthetic */ Rect LLILZ;
    public final /* synthetic */ Consumer<Rect> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20081413hk(ScrollCaptureCallbackC20081513hl scrollCaptureCallbackC20081513hl, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, InterfaceC1364105Vn<? super C20081413hk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = scrollCaptureCallbackC20081513hl;
        this.LLILLL = scrollCaptureSession;
        this.LLILZ = rect;
        this.LLILZIL = consumer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20081413hk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ScrollCaptureCallbackC20081513hl scrollCaptureCallbackC20081513hl = this.LLILLJJLI;
            ScrollCaptureSession scrollCaptureSession = this.LLILLL;
            Rect rect = this.LLILZ;
            C1680470tpd c1680470tpd = new C1680470tpd(rect.left, rect.top, rect.right, rect.bottom);
            this.LL = 1;
            obj = ScrollCaptureCallbackC20081513hl.LIZ(scrollCaptureCallbackC20081513hl, scrollCaptureSession, c1680470tpd, this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        this.LLILZIL.accept(C1681300tqy.LIZ((C1680470tpd) obj));
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
