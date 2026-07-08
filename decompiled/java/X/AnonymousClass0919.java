package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.0919, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$1$1$3$list$1", f = "DefaultStickerSource.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0919 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends EffectCategoryModel>>, Object> {
    public final /* synthetic */ d0 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0919(d0 d0Var, InterfaceC1364105Vn<? super AnonymousClass0919> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = d0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0919(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerSource@cf79.<init>$1$1$3$list$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<EffectCategoryModel> listLJFF = C23117093z.LJFF(this.LL);
        C1C7U.LIZIZ("DefaultStickerSource@cf79.<init>$1$1$3$list$1");
        return listLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends EffectCategoryModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
