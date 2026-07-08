package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchCategoryList$2$categoryListTask$1", f = "StickerEffectViewModel.kt", l = {283}, m = "invokeSuspend")
public final class C399401gu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0UBH>>, Object> {
    public int LL;
    public final /* synthetic */ StickerEffectViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C399401gu(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C399401gu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stickerEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C399401gu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.fetchCategoryList$2$categoryListTask$1");
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
            this.LL = 1;
            obj = interfaceC401501hF.LJJIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchCategoryList$2$categoryListTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchCategoryList$2$categoryListTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0UBH>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
