package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchStickerList$1", f = "StickerEffectViewModel.kt", l = {359, 361, 364}, m = "invokeSuspend")
public final class C399501gv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ StickerEffectViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C399501gv(StickerEffectViewModel stickerEffectViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C399501gv(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005d -> B:31:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.fetchStickerList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2252331DDr c2252331DDr = this.LLILLL.LLILLL;
            C396401gQ c396401gQ = new C396401gQ(true, "fetchCategoryList failed");
            this.LL = 3;
            if (c2252331DDr.emit(c396401gQ, this) == objLJFF) {
                C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchStickerList$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchStickerList$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (Intrinsics.LJFF(this.LLILLJJLI, "livereward")) {
                StickerEffectViewModel stickerEffectViewModel = this.LLILLL;
                this.LL = 1;
                if (stickerEffectViewModel.KQ2(this) == objLJFF) {
                    C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchStickerList$1");
                    return objLJFF;
                }
            } else {
                StickerEffectViewModel stickerEffectViewModel2 = this.LLILLL;
                String str = this.LLILLJJLI;
                this.LL = 2;
                if (stickerEffectViewModel2.JQ2(str, this) == objLJFF) {
                    C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchStickerList$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchStickerList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
