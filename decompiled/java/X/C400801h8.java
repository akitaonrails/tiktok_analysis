package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01h8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchRewardEffectsWithCallback$1", f = "StickerEffectViewModel.kt", l = {585}, m = "invokeSuspend")
public final class C400801h8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StickerEffectViewModel LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ Function1<C767500U8u, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C400801h8(StickerEffectViewModel stickerEffectViewModel, Map<String, String> map, Function1<? super C767500U8u, Unit> function1, InterfaceC1364105Vn<? super C400801h8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = stickerEffectViewModel;
        this.LLILZ = map;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C400801h8 c400801h8 = new C400801h8(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c400801h8.LLILLJJLI = obj;
        return c400801h8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.fetchRewardEffectsWithCallback$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            StickerEffectViewModel stickerEffectViewModel = this.LLILLL;
            stickerEffectViewModel.LLJ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C400701h7(stickerEffectViewModel, this.LLILZ, null), 3);
            C099G c099g = this.LLILLL.LLJ;
            if (c099g != null) {
                this.LL = 1;
                obj = c099g.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchRewardEffectsWithCallback$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchRewardEffectsWithCallback$1");
            return unit;
        }
        C767500U8u c767500U8u = (C767500U8u) obj;
        if (c767500U8u != null) {
            StickerEffectViewModel stickerEffectViewModel2 = this.LLILLL;
            Function1<C767500U8u, Unit> function1 = this.LLILZIL;
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(stickerEffectViewModel2);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C400901h9(function1, c767500U8u, null), 2);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchRewardEffectsWithCallback$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
