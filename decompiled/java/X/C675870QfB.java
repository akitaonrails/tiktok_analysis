package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0QfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.request.PhotoSearchPreloadManager$preload$1", f = "PhotoSearchPreloadManager.kt", l = {107}, m = "invokeSuspend")
public final class C675870QfB extends C09AX implements InterfaceC1631630sYr<InterfaceC497601wk, Bitmap, Long, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C676340Qfw LLILLL;
    public final /* synthetic */ PhotoSearchEnterParams LLILZ;
    public final /* synthetic */ SearchResultParam LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C675870QfB(C676340Qfw c676340Qfw, PhotoSearchEnterParams photoSearchEnterParams, SearchResultParam searchResultParam, InterfaceC1364105Vn<? super C675870QfB> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILLL = c676340Qfw;
        this.LLILZ = photoSearchEnterParams;
        this.LLILZIL = searchResultParam;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("PhotoSearchPreloadManager@8e33.preload$1");
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
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = C675310QeH.LIZ;
            C675310QeH.LIZ = System.currentTimeMillis();
            long j2 = jCurrentTimeMillis - j;
            this.LLILLL.LIZIZ = j2;
            Long lLJFF = C2286608xc.LJFF(j2);
            PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = this.LLILZ.businessParams;
            if (photoSearchBusinessEnterParams != null) {
                numLJ = C2286608xc.LJ(photoSearchBusinessEnterParams.rootEnterFromType);
            } else {
                numLJ = null;
            }
            C675840Qf8.LIZ("image_load_success", "search_result_preload", lLJFF, numLJ, null, null, 1008);
            C675950QfJ c675950QfJ = C675950QfJ.LIZ;
            String str = this.LLILZ.imageKey;
            c675950QfJ.getClass();
            C675950QfJ.LIZLLL(bitmap, str);
            Uri localPathUri = this.LLILZ.getLocalPathUri();
            C675880QfC c675880QfC = new C675880QfC(this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            if (C1325290kal.LIZJ(bitmap, localPathUri, c675880QfC, this) == objLJFF) {
                C1C7U.LIZIZ("PhotoSearchPreloadManager@8e33.preload$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSearchPreloadManager@8e33.preload$1");
        return unit;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Bitmap bitmap, Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        l.longValue();
        C675870QfB c675870QfB = new C675870QfB(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c675870QfB.LLILLJJLI = bitmap;
        return c675870QfB.invokeSuspend(Unit.LIZ);
    }
}
