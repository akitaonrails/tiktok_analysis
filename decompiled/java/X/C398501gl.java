package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchEffectList$1$1", f = "StickerEffectViewModel.kt", l = {}, m = "invokeSuspend")
public final class C398501gl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<LiveEffect> LL;
    public final /* synthetic */ Function1<List<? extends LiveEffect>, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C398501gl(List list, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C398501gl(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("StickerEffectViewModel@d809.fetchEffectList$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callback: ");
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("StickerEffectViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Function1<List<? extends LiveEffect>, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(this.LL);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchEffectList$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
