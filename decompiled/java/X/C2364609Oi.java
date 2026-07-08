package X;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Oi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.portal.PortalLeaf$notifyPortal$4", f = "PortalLeaf.kt", l = {521, 546, 561, 578, 612, 615}, m = "invokeSuspend")
public final class C2364609Oi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C238400w2 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ InterfaceC2365009Om LLILZ;
    public final /* synthetic */ C1100380ek0 LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ ImageModel LLIZ;
    public final /* synthetic */ C013C LLIZLLLIL;
    public final /* synthetic */ C259800zU<Bitmap> LLJ;
    public final /* synthetic */ CountDownLatch LLJI;
    public final /* synthetic */ ImageModel LLJIJIL;
    public final /* synthetic */ C013C LLJILJIL;
    public final /* synthetic */ C259800zU<Bitmap> LLJILJILJ;
    public final /* synthetic */ C259800zU<View> LLJILLL;
    public final /* synthetic */ C013C LLJJ;
    public final /* synthetic */ EnvelopePortalMessage LLJJI;
    public final /* synthetic */ C259800zU<ValueAnimator> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2364609Oi(C259800zU<String> c259800zU, InterfaceC2365009Om interfaceC2365009Om, C1100380ek0 c1100380ek0, C259800zU<String> c259800zU2, ImageModel imageModel, C013C c013c, C259800zU<Bitmap> c259800zU3, CountDownLatch countDownLatch, ImageModel imageModel2, C013C c013c2, C259800zU<Bitmap> c259800zU4, C259800zU<View> c259800zU5, C013C c013c3, EnvelopePortalMessage envelopePortalMessage, C259800zU<ValueAnimator> c259800zU6, InterfaceC1364105Vn<? super C2364609Oi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = interfaceC2365009Om;
        this.LLILZIL = c1100380ek0;
        this.LLILZLL = c259800zU2;
        this.LLIZ = imageModel;
        this.LLIZLLLIL = c013c;
        this.LLJ = c259800zU3;
        this.LLJI = countDownLatch;
        this.LLJIJIL = imageModel2;
        this.LLJILJIL = c013c2;
        this.LLJILJILJ = c259800zU4;
        this.LLJILLL = c259800zU5;
        this.LLJJ = c013c3;
        this.LLJJI = envelopePortalMessage;
        this.LLJJIII = c259800zU6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2364609Oi(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2364609Oi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
