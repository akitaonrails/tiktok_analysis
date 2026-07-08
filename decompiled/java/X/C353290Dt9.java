package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Dt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.video.layer.FreeLayerPanelUISlotComponent$onSeekPositionChange$2", f = "FreeLayerPanelUISlotComponent.kt", l = {}, m = "invokeSuspend")
public final class C353290Dt9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<List<C352700DsC>> LL;
    public final /* synthetic */ C0E1I LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C013C LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353290Dt9(C259800zU<List<C352700DsC>> c259800zU, C0E1I c0e1i, long j, C013C c013c, InterfaceC1364105Vn<? super C353290Dt9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c0e1i;
        this.LLILLL = j;
        this.LLILZ = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353290Dt9(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        T tLIZ;
        C1C7U.LIZ("FreeLayerPanelUISlotComponent@c5ab.onSeekPositionChange$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU<List<C352700DsC>> c259800zU = this.LL;
        InterfaceC353300DtA interfaceC353300DtA = this.LLILLJJLI.LLLFF;
        if (interfaceC353300DtA != null) {
            tLIZ = interfaceC353300DtA.LIZ(this.LLILLL);
        } else {
            tLIZ = 0;
        }
        c259800zU.element = tLIZ;
        if (!Intrinsics.LJFF(this.LL.element, this.LLILLJJLI.LLLFFI)) {
            this.LLILZ.element = true;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FreeLayerPanelUISlotComponent@c5ab.onSeekPositionChange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
