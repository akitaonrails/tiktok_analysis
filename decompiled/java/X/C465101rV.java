package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.common.utils.StickerIconCacheManager$clearStickerIconFileCache$1", f = "StickerIconCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C465101rV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C465101rV(List<String> list, InterfaceC1364105Vn<? super C465101rV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C465101rV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerIconCacheManager@d421.clearStickerIconFileCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Iterator<String> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            C465201rW.LIZ(new C0VSJ(it2.next()));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerIconCacheManager@d421.clearStickerIconFileCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
