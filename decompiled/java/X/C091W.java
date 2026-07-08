package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postHotStickers$1", f = "DefaultStickerSource.kt", l = {674}, m = "invokeSuspend")
public final class C091W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FetchHotEffectResponse LLILLJJLI;
    public final /* synthetic */ d0 LLILLL;
    public final /* synthetic */ C1641640sp0<FetchHotEffectResponse> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C091W(FetchHotEffectResponse fetchHotEffectResponse, d0 d0Var, C1641640sp0<FetchHotEffectResponse> c1641640sp0, InterfaceC1364105Vn<? super C091W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fetchHotEffectResponse;
        this.LLILLL = d0Var;
        this.LLILZ = c1641640sp0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C091W(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerSource@cf79.postHotStickers$1");
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
            ArrayList arrayList = new ArrayList(this.LLILLJJLI.getEffects());
            this.LLILLL.LIZ.getValue().LIZ("", arrayList);
            this.LLILLJJLI.setEffects(arrayList);
            List<Effect> collection = this.LLILLJJLI.getCollection();
            if (collection != null && !collection.isEmpty()) {
                this.LLILLL.LJIJ(this.LLILLJJLI.getCollection());
            }
            C2238608ps c2238608ps = C2107708Nn.LIZ;
            C091X c091x = new C091X(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c091x) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerSource@cf79.postHotStickers$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.postHotStickers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
