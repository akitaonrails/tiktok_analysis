package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.062i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl$shareProfileQrToInstagramStory$uri$1", f = "ShareLinkServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C15430062i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Uri>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ C19EG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15430062i(Bitmap bitmap, C19EG c19eg, InterfaceC1364105Vn<? super C15430062i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15430062i(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Uri uriLIZIZ;
        C1C7U.LIZ("ShareLinkServiceImpl@e626.shareProfileQrToInstagramStory$uri$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            uriLIZIZ = C1375700lu4.LIZIZ(this.LLILLJJLI, this.LL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!(e instanceof CancellationException)) {
                uriLIZIZ = null;
            } else {
                throw e;
            }
        }
        C1C7U.LIZIZ("ShareLinkServiceImpl@e626.shareProfileQrToInstagramStory$uri$1");
        return uriLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Uri> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
