package X;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05h7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.request.PhotoSearchPreloadManager$preloadImage$1", f = "PhotoSearchPreloadManager.kt", l = {52}, m = "invokeSuspend")
public final class C1419905h7 extends C09AX implements InterfaceC1631630sYr<InterfaceC497601wk, Bitmap, Long, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419905h7(Uri uri, String str, InterfaceC1364105Vn<? super C1419905h7> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILLL = uri;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoSearchPreloadManager@8e33.preloadImage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Bitmap bitmap = (Bitmap) this.LLILLJJLI;
            Uri uri = this.LLILLL;
            C1420005h8 c1420005h8 = new C1420005h8(this.LLILZ, null);
            this.LL = 1;
            if (C1325290kal.LIZJ(bitmap, uri, c1420005h8, this) == objLJFF) {
                C1C7U.LIZIZ("PhotoSearchPreloadManager@8e33.preloadImage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSearchPreloadManager@8e33.preloadImage$1");
        return unit;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Bitmap bitmap, Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        l.longValue();
        C1419905h7 c1419905h7 = new C1419905h7(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1419905h7.LLILLJJLI = bitmap;
        return c1419905h7.invokeSuspend(Unit.LIZ);
    }
}
