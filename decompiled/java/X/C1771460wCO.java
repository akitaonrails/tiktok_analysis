package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0wCO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$requestChunk$1$1", f = "ShopMallRepository.kt", l = {}, m = "invokeSuspend")
public final class C1771460wCO extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C1771660wCi>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C259800zU<AbstractC1771170wBv> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771460wCO(C259800zU<AbstractC1771170wBv> c259800zU, InterfaceC1364105Vn<? super C1771460wCO> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.0wCQ] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallRepository@92e8.requestChunk$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        C259800zU<AbstractC1771170wBv> c259800zU = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("chunk convert data error:");
        String message = th.getMessage();
        if (message == null) {
            message = "unknown error";
        }
        sbLIZ.append(message);
        c259800zU.element = new C1771480wCQ(C2188811AlT.LIZIZ(sbLIZ), null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C1771660wCi> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1771460wCO c1771460wCO = new C1771460wCO(this.LLILLJJLI, interfaceC1364105Vn);
        c1771460wCO.LL = th;
        return c1771460wCO.invokeSuspend(Unit.LIZ);
    }
}
