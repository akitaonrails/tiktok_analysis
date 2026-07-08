package X;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09NA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageDownloader$saveImageToGallery$1", f = "SearchImageDownloader.kt", l = {}, m = "invokeSuspend")
public final class C09NA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ File LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09NA(Context context, File file, InterfaceC1364105Vn<? super C09NA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09NA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchImageDownloader@68d6.saveImageToGallery$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Uri uriLIZ = C2400409as.LIZ(this.LL, this.LLILLJJLI.getName());
            C844470XAv.LIZ.getClass();
            ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(C844470XAv.LIZ().getContentResolver(), uriLIZ, "w");
            if (parcelFileDescriptorLIZLLL != null) {
                C09N1.LIZJ(this.LLILLJJLI, new C0VSV(parcelFileDescriptorLIZLLL.getFileDescriptor()));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchImageDownloader@68d6.saveImageToGallery$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
