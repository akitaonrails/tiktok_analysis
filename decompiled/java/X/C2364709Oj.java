package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.redenvelope.PortalPushIntoUIUpdate;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Oj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.portal.PortalLeaf$notifyPortal$4$4", f = "PortalLeaf.kt", l = {}, m = "invokeSuspend")
public final class C2364709Oj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<View> LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C238400w2 LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ CountDownLatch LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2364709Oj(C259800zU<View> c259800zU, C013C c013c, C238400w2 c238400w2, long j, CountDownLatch countDownLatch, InterfaceC1364105Vn<? super C2364709Oj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c013c;
        this.LLILLL = c238400w2;
        this.LLILZ = j;
        this.LLILZIL = countDownLatch;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2364709Oj(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PortalLeaf@b89.notifyPortal$4$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!PortalPushIntoUIUpdate.INSTANCE.getValue()) {
            C1295960jpS c1295960jpS = (C1295960jpS) this.LL.element;
            String strLIZ = C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_revenue_normal_1");
            final C013C c013c = this.LLILLJJLI;
            final C238400w2 c238400w2 = this.LLILLL;
            final long j = this.LLILZ;
            final CountDownLatch countDownLatch = this.LLILZIL;
            C1143680frq.LJIILL(c1295960jpS, strLIZ, "liveroom_portal_entrance_pushinto_ad_label.zip", false, new InterfaceC1143790fs1() { // from class: X.09Ok
                @Override // X.InterfaceC1143790fs1
                public final void onFinish(boolean z) {
                    c013c.element = z;
                    c238400w2.element = System.currentTimeMillis() - j;
                    countDownLatch.countDown();
                }
            });
        } else {
            C1295960jpS c1295960jpS2 = (C1295960jpS) this.LL.element;
            final C013C c013c2 = this.LLILLJJLI;
            final C238400w2 c238400w22 = this.LLILLL;
            final long j2 = this.LLILZ;
            final CountDownLatch countDownLatch2 = this.LLILZIL;
            C1143680frq.LJIILL(c1295960jpS2, "tiktok_live_revenue_normal_1", "liveroom_portal_entrance_pushinto_new.zip", false, new InterfaceC1143790fs1() { // from class: X.09Ol
                @Override // X.InterfaceC1143790fs1
                public final void onFinish(boolean z) {
                    c013c2.element = z;
                    c238400w22.element = System.currentTimeMillis() - j2;
                    countDownLatch2.countDown();
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PortalLeaf@b89.notifyPortal$4$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
