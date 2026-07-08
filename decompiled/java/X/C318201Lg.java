package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.ChooseCoverCompressUtils$setImageBitmapCompressed$2$result$1$1", f = "ChooseCoverCompressUtils.kt", l = {}, m = "invokeSuspend")
public final class C318201Lg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318201Lg(String str, C118300cf c118300cf, C118300cf c118300cf2, InterfaceC1364105Vn<? super C318201Lg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = c118300cf2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318201Lg(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ChooseCoverCompressUtils@c033.setImageBitmapCompressed$2$result$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapLIZ = C2477909nN.LIZ(this.LL, this.LLILLJJLI.element, this.LLILLL.element, Bitmap.Config.RGB_565);
        C1C7U.LIZIZ("ChooseCoverCompressUtils@c033.setImageBitmapCompressed$2$result$1$1");
        return bitmapLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
