package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS604S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.qrcode.compose.QrCodeCenterComposeKt$TikTokLogoView$1$1$1", f = "QrCodeCenterCompose.kt", l = {}, m = "invokeSuspend")
public final class C1671440tb4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1671450tb5 LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ C05P0<Bitmap> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671440tb4(InterfaceC1671450tb5 interfaceC1671450tb5, C05P0<Boolean> c05p0, C05P0<Bitmap> c05p02, InterfaceC1364105Vn<? super C1671440tb4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1671450tb5;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1671440tb4(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QrCodeCenterComposeKt@1ebf.TikTokLogoView$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LLILLJJLI.getValue().booleanValue()) {
            this.LL.LIZ("img_scan_logo_new", new AwS604S0100000_25((C05P0) this.LLILLL, (C05P0<Boolean>) 613));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QrCodeCenterComposeKt@1ebf.TikTokLogoView$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
