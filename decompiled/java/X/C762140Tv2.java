package X;

import Y.AgS293S0100000_12;
import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel$handleAction$1", f = "BGMPlaylistViewModel.kt", l = {105}, m = "invokeSuspend")
public final class C762140Tv2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BGMPlaylistViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762140Tv2(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC1364105Vn<? super C762140Tv2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bGMPlaylistViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762140Tv2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistViewModel@a4b3.handleAction$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIIL = C09IC.LJIIL(this.LLILLJJLI.LLILLJJLI);
            AgS293S0100000_12 agS293S0100000_12 = new AgS293S0100000_12(this.LLILLJJLI, 15);
            this.LL = 1;
            if (interfaceC346201WaLJIIL.collect(agS293S0100000_12, this) == objLJFF) {
                C1C7U.LIZIZ("BGMPlaylistViewModel@a4b3.handleAction$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BGMPlaylistViewModel@a4b3.handleAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
