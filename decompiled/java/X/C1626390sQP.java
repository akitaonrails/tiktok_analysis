package X;

import androidx.lifecycle.FlowLiveDataConversions;
import com.ss.android.ugc.aweme.sticker.repository.params.FetchMode;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sQP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$observerHorizontalEffectFetchDataV1$1", f = "FullWidthEffectCarouselComponent.kt", l = {1474, 1477}, m = "invokeSuspend")
public final class C1626390sQP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ o LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626390sQP(o oVar, InterfaceC1364105Vn<? super C1626390sQP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = oVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626390sQP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.observerHorizontalEffectFetchDataV1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.kb()) {
                InterfaceC346201Wa interfaceC346201WaLJIIJJI = C09IC.LJIIJJI(FlowLiveDataConversions.asFlow(this.LLILLJJLI.U9().LJIIIZ(C539900LFk.LIZLLL(this.LLILLJJLI.getShortVideoContext()), false, FetchMode.DEFAULT, C2286608xc.LJ(2))));
                C1628070sT7 c1628070sT7 = new C1628070sT7(this.LLILLJJLI);
                this.LL = 1;
                if (interfaceC346201WaLJIIJJI.collect(c1628070sT7, this) == objLJFF) {
                    C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.observerHorizontalEffectFetchDataV1$1");
                    return objLJFF;
                }
            } else {
                InterfaceC346201Wa interfaceC346201WaLJIIJJI2 = C09IC.LJIIJJI(FlowLiveDataConversions.asFlow(this.LLILLJJLI.U9().LJIIIZ(C539900LFk.LIZLLL(this.LLILLJJLI.getShortVideoContext()), false, FetchMode.DEFAULT, null)));
                C1628080sT8 c1628080sT8 = new C1628080sT8(this.LLILLJJLI);
                this.LL = 2;
                if (interfaceC346201WaLJIIJJI2.collect(c1628080sT8, this) == objLJFF) {
                    C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.observerHorizontalEffectFetchDataV1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.observerHorizontalEffectFetchDataV1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
