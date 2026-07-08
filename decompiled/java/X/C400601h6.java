package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01h6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchRewardEffects$1$1", f = "StickerEffectViewModel.kt", l = {574}, m = "invokeSuspend")
public final class C400601h6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C767500U8u>, Object> {
    public int LL;
    public final /* synthetic */ StickerEffectViewModel LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C400601h6(StickerEffectViewModel stickerEffectViewModel, Map<String, String> map, InterfaceC1364105Vn<? super C400601h6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stickerEffectViewModel;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C400601h6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.fetchRewardEffects$1$1");
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
            InterfaceC401501hF interfaceC401501hF = this.LLILLJJLI.LLILZ;
            Map<String, String> map = this.LLILLL;
            this.LL = 1;
            obj = interfaceC401501hF.LJIILJJIL(map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchRewardEffects$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchRewardEffects$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C767500U8u> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
