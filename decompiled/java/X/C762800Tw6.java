package X;

import Y.AgS293S0100000_12;
import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.android.live.effect.music.LiveBGMMiniWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.LiveBGMMiniWidget$observeViewModel$1", f = "LiveBGMMiniWidget.kt", l = {206}, m = "invokeSuspend")
public final class C762800Tw6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveBGMMiniWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762800Tw6(LiveBGMMiniWidget liveBGMMiniWidget, InterfaceC1364105Vn<? super C762800Tw6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveBGMMiniWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762800Tw6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBGMMiniWidget@67d4.observeViewModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            LiveBGMMiniWidget liveBGMMiniWidget = this.LLILLJJLI;
            BGMSongListViewModel bGMSongListViewModel = liveBGMMiniWidget.LLILZIL;
            if (bGMSongListViewModel == null) {
                bGMSongListViewModel = null;
            }
            C2252331DDr c2252331DDr = bGMSongListViewModel.LLILZ;
            AgS293S0100000_12 agS293S0100000_12 = new AgS293S0100000_12(liveBGMMiniWidget, 23);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS293S0100000_12, this) == objLJFF) {
                C1C7U.LIZIZ("LiveBGMMiniWidget@67d4.observeViewModel$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
