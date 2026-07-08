package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ds6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.qrcode.util.InstagramStoryShareImageRenderer$renderStoryShareImage$composed$1", f = "InstagramStoryShareImageRenderer.kt", l = {}, m = "invokeSuspend")
public final class C352640Ds6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ C350270DoH LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352640Ds6(C350270DoH c350270DoH, Bitmap bitmap, InterfaceC1364105Vn<? super C352640Ds6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c350270DoH;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352640Ds6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapLIZ;
        C1C7U.LIZ("InstagramStoryShareImageRenderer@a4ae.renderStoryShareImage$composed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1388510mEj c1388510mEj = C1388510mEj.LIZ;
            C350270DoH c350270DoH = this.LL;
            Bitmap bitmap = this.LLILLJJLI;
            c1388510mEj.getClass();
            bitmapLIZ = C1388510mEj.LIZ(c350270DoH, bitmap);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof CancellationException)) {
                bitmapLIZ = null;
            } else {
                throw th;
            }
        }
        C1C7U.LIZIZ("InstagramStoryShareImageRenderer@a4ae.renderStoryShareImage$composed$1");
        return bitmapLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
