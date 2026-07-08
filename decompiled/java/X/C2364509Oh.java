package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Oh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$addPortalShortCutWithLottie$2", f = "RedEnvelopeWidget.kt", l = {517, 526, 585, 590}, m = "invokeSuspend")
public final class C2364509Oh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RedEnvelopeWidget LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;
    public final /* synthetic */ ImageModel LLILZ;
    public final /* synthetic */ C259800zU<ImageModel> LLILZIL;
    public final /* synthetic */ C259800zU<C1295960jpS> LLILZLL;
    public final /* synthetic */ CountDownLatch LLIZ;
    public final /* synthetic */ C259800zU<Bitmap> LLIZLLLIL;
    public final /* synthetic */ C259800zU<Bitmap> LLJ;
    public final /* synthetic */ C013C LLJI;
    public final /* synthetic */ C259800zU<String> LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ RedEnvelopeInfoModel4FE LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2364509Oh(RedEnvelopeWidget redEnvelopeWidget, Uri uri, ImageModel imageModel, C259800zU<ImageModel> c259800zU, C259800zU<C1295960jpS> c259800zU2, CountDownLatch countDownLatch, C259800zU<Bitmap> c259800zU3, C259800zU<Bitmap> c259800zU4, C013C c013c, C259800zU<String> c259800zU5, String str, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, boolean z, InterfaceC1364105Vn<? super C2364509Oh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = redEnvelopeWidget;
        this.LLILLL = uri;
        this.LLILZ = imageModel;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c259800zU2;
        this.LLIZ = countDownLatch;
        this.LLIZLLLIL = c259800zU3;
        this.LLJ = c259800zU4;
        this.LLJI = c013c;
        this.LLJIJIL = c259800zU5;
        this.LLJILJIL = str;
        this.LLJILJILJ = redEnvelopeInfoModel4FE;
        this.LLJILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2364509Oh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2364509Oh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
