package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.android.live.effect.music.LiveBGMMiniWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.LiveBGMMiniWidget$initView$2", f = "LiveBGMMiniWidget.kt", l = {124}, m = "invokeSuspend")
public final class C762900TwG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveBGMMiniWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762900TwG(LiveBGMMiniWidget liveBGMMiniWidget, InterfaceC1364105Vn<? super C762900TwG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveBGMMiniWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762900TwG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBGMMiniWidget@67d4.initView$2");
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
            BGMSongListViewModel bGMSongListViewModel = this.LLILLJJLI.LLILZIL;
            if (bGMSongListViewModel == null) {
                bGMSongListViewModel = null;
            }
            C1DEK c1dek = bGMSongListViewModel.LLILLL;
            C763140Twe c763140Twe = C763140Twe.LIZ;
            this.LL = 1;
            if (c1dek.LJIJI(c763140Twe, this) == objLJFF) {
                C1C7U.LIZIZ("LiveBGMMiniWidget@67d4.initView$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBGMMiniWidget@67d4.initView$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
