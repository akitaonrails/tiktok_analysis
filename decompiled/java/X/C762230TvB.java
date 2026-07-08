package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.live.effect.music.LiveBGMFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.LiveBGMFragment$initView$2$1", f = "LiveBGMFragment.kt", l = {243}, m = "invokeSuspend")
public final class C762230TvB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveBGMFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762230TvB(LiveBGMFragment liveBGMFragment, InterfaceC1364105Vn<? super C762230TvB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveBGMFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762230TvB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBGMFragment@9bf2.initView$2$1");
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
            BGMPlaylistViewModel bGMPlaylistViewModel = this.LLILLJJLI.LLJI;
            if (bGMPlaylistViewModel == null) {
                bGMPlaylistViewModel = null;
            }
            C1DEK c1dek = bGMPlaylistViewModel.LLILLJJLI;
            C762430TvV c762430TvV = C762430TvV.LIZ;
            this.LL = 1;
            if (c1dek.LJIJI(c762430TvV, this) == objLJFF) {
                C1C7U.LIZIZ("LiveBGMFragment@9bf2.initView$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBGMFragment@9bf2.initView$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
