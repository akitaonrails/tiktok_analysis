package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0QfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.request.PhotoSearchPreloadManager$preload$1$1", f = "PhotoSearchPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C675880QfC extends C09AX implements InterfaceC1631630sYr<InterfaceC497601wk, byte[], Long, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ InterfaceC497601wk LL;
    public /* synthetic */ byte[] LLILLJJLI;
    public /* synthetic */ long LLILLL;
    public final /* synthetic */ C676340Qfw LLILZ;
    public final /* synthetic */ PhotoSearchEnterParams LLILZIL;
    public final /* synthetic */ SearchResultParam LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C675880QfC(C676340Qfw c676340Qfw, PhotoSearchEnterParams photoSearchEnterParams, SearchResultParam searchResultParam, InterfaceC1364105Vn<? super C675880QfC> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = c676340Qfw;
        this.LLILZIL = photoSearchEnterParams;
        this.LLILZLL = searchResultParam;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoSearchPreloadManager@8e33.preload$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = this.LL;
        byte[] bArr = this.LLILLJJLI;
        long j = this.LLILLL;
        this.LLILZ.LIZJ = C2286608xc.LJFF(j);
        if (((Boolean) C142400gY.LIZ.getValue()).booleanValue()) {
            C675950QfJ c675950QfJ = C675950QfJ.LIZ;
            String str = this.LLILZIL.imageKey;
            c675950QfJ.getClass();
            C675950QfJ.LJ(str, bArr);
        }
        C675310QeH.LIZ(bArr, this.LLILZIL, this.LLILZ, this.LLILZLL, interfaceC497601wk);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSearchPreloadManager@8e33.preload$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, byte[] bArr, Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long jLongValue = l.longValue();
        C675880QfC c675880QfC = new C675880QfC(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c675880QfC.LL = interfaceC497601wk;
        c675880QfC.LLILLJJLI = bArr;
        c675880QfC.LLILLL = jLongValue;
        return c675880QfC.invokeSuspend(Unit.LIZ);
    }
}
