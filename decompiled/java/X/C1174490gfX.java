package X;

import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM$handleRetry$1", f = "PoiMapModePageVM.kt", l = {251}, m = "invokeSuspend")
public final class C1174490gfX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiMapModePageVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1174490gfX(PoiMapModePageVM poiMapModePageVM, InterfaceC1364105Vn<? super C1174490gfX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiMapModePageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1174490gfX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapModePageVM@49e4.handleRetry$1");
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
            C1174480gfW c1174480gfW = this.LLILLJJLI.LL;
            EnumC1174570gff enumC1174570gff = c1174480gfW.LIZIZ;
            if (enumC1174570gff != null) {
                enumC1174570gff.onRetry(c1174480gfW);
            }
            PoiMapModePageVM poiMapModePageVM = this.LLILLJJLI;
            C1174650gfn c1174650gfn = poiMapModePageVM.LLIZLLLIL;
            if (c1174650gfn != null) {
                this.LL = 1;
                if (poiMapModePageVM.zQ2(c1174650gfn, false, this) == objLJFF) {
                    C1C7U.LIZIZ("PoiMapModePageVM@49e4.handleRetry$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapModePageVM@49e4.handleRetry$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
