package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05h8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.request.PhotoSearchPreloadManager$preloadImage$1$1", f = "PhotoSearchPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C1420005h8 extends C09AX implements InterfaceC1631630sYr<InterfaceC497601wk, byte[], Long, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ byte[] LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420005h8(String str, InterfaceC1364105Vn<? super C1420005h8> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoSearchPreloadManager@8e33.preloadImage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        byte[] bArr = this.LL;
        C675950QfJ c675950QfJ = C675950QfJ.LIZ;
        String str = this.LLILLJJLI;
        c675950QfJ.getClass();
        C675950QfJ.LJ(str, bArr);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSearchPreloadManager@8e33.preloadImage$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, byte[] bArr, Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        l.longValue();
        C1420005h8 c1420005h8 = new C1420005h8(this.LLILLJJLI, interfaceC1364105Vn);
        c1420005h8.LL = bArr;
        return c1420005h8.invokeSuspend(Unit.LIZ);
    }
}
