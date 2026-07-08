package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08aW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.PopularStickerListManager$deleteTabFileCache$2", f = "PopularStickerListManager.kt", l = {}, m = "invokeSuspend")
public final class C2143408aW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C452680Hp4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2143408aW(C452680Hp4 c452680Hp4, InterfaceC1364105Vn<? super C2143408aW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c452680Hp4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2143408aW(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopularStickerListManager@7b34.deleteTabFileCache$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        C452680Hp4.LIZJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PopularStickerListManager@7b34.deleteTabFileCache$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
