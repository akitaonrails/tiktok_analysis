package X;

import Y.AfS139S0200000_3;
import Y.AfS172S0100000_3;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import com.bytedance.android.livesdk.livesetting.redenvelope.PortalPushIntoUIUpdate;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Og, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$addPortalShortCutWithLottie$2$2", f = "RedEnvelopeWidget.kt", l = {}, m = "invokeSuspend")
public final class C2364409Og extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ImageModel LL;
    public final /* synthetic */ C259800zU<ImageModel> LLILLJJLI;
    public final /* synthetic */ C259800zU<C1295960jpS> LLILLL;
    public final /* synthetic */ CountDownLatch LLILZ;
    public final /* synthetic */ C259800zU<Bitmap> LLILZIL;
    public final /* synthetic */ C259800zU<Bitmap> LLILZLL;
    public final /* synthetic */ C013C LLIZ;
    public final /* synthetic */ RedEnvelopeWidget LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2364409Og(ImageModel imageModel, C259800zU<ImageModel> c259800zU, C259800zU<C1295960jpS> c259800zU2, CountDownLatch countDownLatch, C259800zU<Bitmap> c259800zU3, C259800zU<Bitmap> c259800zU4, C013C c013c, RedEnvelopeWidget redEnvelopeWidget, InterfaceC1364105Vn<? super C2364409Og> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = imageModel;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = countDownLatch;
        this.LLILZIL = c259800zU3;
        this.LLILZLL = c259800zU4;
        this.LLIZ = c013c;
        this.LLIZLLLIL = redEnvelopeWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2364409Og(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RedEnvelopeWidget@65b2.addPortalShortCutWithLottie$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19482711Kf c19482711KfLJ = C1121670fIL.LJ(this.LL);
        CountDownLatch countDownLatch = this.LLILZ;
        c19482711KfLJ.LJJLL(new AfS139S0200000_3(this.LLILZIL, countDownLatch, 1), new AfS172S0100000_3(countDownLatch, 23));
        C19482711Kf c19482711KfLJ2 = C1121670fIL.LJ(this.LLILLJJLI.element);
        C259800zU<Bitmap> c259800zU = this.LLILZLL;
        CountDownLatch countDownLatch2 = this.LLILZ;
        c19482711KfLJ2.LJJLL(new AfS139S0200000_3(c259800zU, countDownLatch2, 2), new AfS172S0100000_3(countDownLatch2, 24));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (!PortalPushIntoUIUpdate.INSTANCE.getValue()) {
            C1295960jpS c1295960jpS = this.LLILLL.element;
            String strLIZ = C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_revenue_normal_1");
            final C259800zU<C1295960jpS> c259800zU2 = this.LLILLL;
            final C013C c013c = this.LLIZ;
            final CountDownLatch countDownLatch3 = this.LLILZ;
            final RedEnvelopeWidget redEnvelopeWidget = this.LLIZLLLIL;
            C1143680frq.LJIILL(c1295960jpS, strLIZ, "liveroom_portal_data_pushinto_ad_label.zip", false, new InterfaceC1143790fs1() { // from class: X.09Oe
                @Override // X.InterfaceC1143790fs1
                public final void onFinish(boolean z) {
                    C1295960jpS c1295960jpS2 = c259800zU2.element;
                    RedEnvelopeWidget redEnvelopeWidget2 = redEnvelopeWidget;
                    long j = jCurrentTimeMillis;
                    redEnvelopeWidget2.LLJILJIL.put(Integer.valueOf(c1295960jpS2.hashCode()), Boolean.valueOf(z));
                    redEnvelopeWidget2.LLJIJIL.put(Integer.valueOf(c1295960jpS2.hashCode()), Long.valueOf(System.currentTimeMillis() - j));
                    c013c.element = z;
                    countDownLatch3.countDown();
                }
            });
        } else {
            final C259800zU<C1295960jpS> c259800zU3 = this.LLILLL;
            C1295960jpS c1295960jpS2 = c259800zU3.element;
            final C013C c013c2 = this.LLIZ;
            final CountDownLatch countDownLatch4 = this.LLILZ;
            final RedEnvelopeWidget redEnvelopeWidget2 = this.LLIZLLLIL;
            C1143680frq.LJIILL(c1295960jpS2, "tiktok_live_revenue_normal_1", "liveroom_portal_data_pushinto_new.zip", false, new InterfaceC1143790fs1() { // from class: X.09Of
                @Override // X.InterfaceC1143790fs1
                public final void onFinish(boolean z) {
                    C1295960jpS c1295960jpS3 = c259800zU3.element;
                    RedEnvelopeWidget redEnvelopeWidget3 = redEnvelopeWidget2;
                    long j = jCurrentTimeMillis;
                    redEnvelopeWidget3.LLJILJIL.put(Integer.valueOf(c1295960jpS3.hashCode()), Boolean.valueOf(z));
                    redEnvelopeWidget3.LLJIJIL.put(Integer.valueOf(c1295960jpS3.hashCode()), Long.valueOf(System.currentTimeMillis() - j));
                    c013c2.element = z;
                    countDownLatch4.countDown();
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addPortalShortCutWithLottie$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
