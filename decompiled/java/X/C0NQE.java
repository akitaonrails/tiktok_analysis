package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0NQE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel$loadMoods$1", f = "MusicGiftDetailViewModel.kt", l = {534}, m = "invokeSuspend")
public final class C0NQE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusicGiftDetailViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQE(MusicGiftDetailViewModel musicGiftDetailViewModel, InterfaceC1364105Vn<? super C0NQE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicGiftDetailViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NQE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailViewModel@deb0.loadMoods$1");
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
            InterfaceC346201Wa<AbstractC1147530fy3<List<C1147390fxp>>> interfaceC346201WaLIZIZ = this.LLILLJJLI.LLILZ.LIZIZ();
            final MusicGiftDetailViewModel musicGiftDetailViewModel = this.LLILLJJLI;
            InterfaceC346701Wf<? super AbstractC1147530fy3<List<C1147390fxp>>> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0fxt
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    AbstractC1147530fy3 abstractC1147530fy3 = (AbstractC1147530fy3) obj2;
                    if (abstractC1147530fy3 instanceof C1147590fy9) {
                        MusicGiftDetailViewModel musicGiftDetailViewModel2 = musicGiftDetailViewModel;
                        musicGiftDetailViewModel2.LLJIJIL = (List) ((C1147590fy9) abstractC1147530fy3).LIZ;
                        musicGiftDetailViewModel2.QQ2();
                    } else if (!Intrinsics.LJFF(abstractC1147530fy3, C1147570fy7.LIZ) && !(abstractC1147530fy3 instanceof C1147540fy4) && !Intrinsics.LJFF(abstractC1147530fy3, C1147580fy8.LIZ)) {
                        throw new C1954807lC();
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLIZIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.loadMoods$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.loadMoods$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
