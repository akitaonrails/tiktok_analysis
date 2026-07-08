package X;

import Y.AfS101S0300000_3;
import Y.AfS172S0100000_3;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.090W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.portal.PortalLeaf$notifyPortal$4$3", f = "PortalLeaf.kt", l = {}, m = "invokeSuspend")
public final class C090W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC420801kM>, Object> {
    public final /* synthetic */ ImageModel LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C259800zU<Bitmap> LLILLL;
    public final /* synthetic */ CountDownLatch LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C090W(ImageModel imageModel, C013C c013c, C259800zU<Bitmap> c259800zU, CountDownLatch countDownLatch, InterfaceC1364105Vn<? super C090W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = imageModel;
        this.LLILLJJLI = c013c;
        this.LLILLL = c259800zU;
        this.LLILZ = countDownLatch;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C090W(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PortalLeaf@b89.notifyPortal$4$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19482711Kf c19482711KfLJ = C1121670fIL.LJ(this.LL);
        C013C c013c = this.LLILLJJLI;
        C259800zU<Bitmap> c259800zU = this.LLILLL;
        CountDownLatch countDownLatch = this.LLILZ;
        InterfaceC420801kM interfaceC420801kMLJJLL = c19482711KfLJ.LJJLL(new AfS101S0300000_3(c013c, c259800zU, countDownLatch, 4), new AfS172S0100000_3(countDownLatch, 83));
        C1C7U.LIZIZ("PortalLeaf@b89.notifyPortal$4$3");
        return interfaceC420801kMLJJLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC420801kM> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
