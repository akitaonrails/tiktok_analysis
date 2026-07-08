package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01h5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchRewardEffects$1", f = "StickerEffectViewModel.kt", l = {}, m = "invokeSuspend")
public final class C400501h5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StickerEffectViewModel LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C400501h5(StickerEffectViewModel stickerEffectViewModel, Map<String, String> map, InterfaceC1364105Vn<? super C400501h5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stickerEffectViewModel;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C400501h5 c400501h5 = new C400501h5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c400501h5.LL = obj;
        return c400501h5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.fetchRewardEffects$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        StickerEffectViewModel stickerEffectViewModel = this.LLILLJJLI;
        stickerEffectViewModel.LLJ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C400601h6(stickerEffectViewModel, this.LLILLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchRewardEffects$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
