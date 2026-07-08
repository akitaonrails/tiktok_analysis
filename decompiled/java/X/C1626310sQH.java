package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.control.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import njp.a;

/* JADX INFO: renamed from: X.0sQH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.control.FullHorizontalCarrouselRecordDockBarScene$initStickerModule$2$1", f = "FullHorizontalCarrouselRecordDockBarScene.kt", l = {}, m = "invokeSuspend")
public final class C1626310sQH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ h LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626310sQH(h hVar, InterfaceC1364105Vn<? super C1626310sQH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = hVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626310sQH(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullHorizontalCarrouselRecordDockBarScene@605b.initStickerModule$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1449210nod c1449210nod = C1449210nod.LIZ;
        ShortVideoContext shortVideoContextLLLLIL = this.LL.LLLLIL();
        q qVarLLLLJ = this.LL.LLLLJ();
        h hVar = this.LL;
        boolean zLJFF = Intrinsics.LJFF(((InterfaceC1648570t0B) hVar.LLJJL.getValue(hVar, h.LLLLII[4])).ec().LIZJ(), true);
        c1449210nod.getClass();
        C1449210nod.LIZ(shortVideoContextLLLLIL, qVarLLLLJ, zLJFF, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullHorizontalCarrouselRecordDockBarScene@605b.initStickerModule$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
