package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Uir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$loadGaussBg$1$2", f = "TTLiveBroadcastView.kt", l = {}, m = "invokeSuspend")
public final class C780070Uir extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<Bitmap> LL;
    public final /* synthetic */ TTLiveBroadcastView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C780070Uir(TTLiveBroadcastView tTLiveBroadcastView, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = tTLiveBroadcastView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C780070Uir(this.LLILLJJLI, interfaceC1364105Vn, this.LL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("TTLiveBroadcastView@6190.loadGaussBg$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL.element;
        if (bitmap != null) {
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                boolValueOf = Boolean.valueOf(bitmap2.isRecycled());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIFFI(boolValueOf)) {
                TTLiveBroadcastView tTLiveBroadcastView = this.LLILLJJLI;
                if (tTLiveBroadcastView.LLJJIII || tTLiveBroadcastView.LLJZIJLIL) {
                    C1324720kZq c1324720kZq = tTLiveBroadcastView.LLJLLIL;
                    if (c1324720kZq != null) {
                        C500260Jjc.LLFFF(c1324720kZq);
                    }
                    C1324720kZq c1324720kZq2 = this.LLILLJJLI.LLJLLIL;
                    if (c1324720kZq2 != null) {
                        c1324720kZq2.setImageBitmap(this.LL.element);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTLiveBroadcastView@6190.loadGaussBg$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
