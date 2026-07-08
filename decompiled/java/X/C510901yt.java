package X;

import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectRestoreManager$observeBeautyData$1", f = "LiveEffectRestoreManager.kt", l = {123}, m = "invokeSuspend")
public final class C510901yt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILLL;
    public final /* synthetic */ DataChannel LLILZ;
    public final /* synthetic */ ComposerFilterViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C510901yt(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, DataChannel dataChannel, ComposerFilterViewModel composerFilterViewModel, InterfaceC1364105Vn<? super C510901yt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveSmallItemBeautyViewModel;
        this.LLILZ = dataChannel;
        this.LLILZIL = composerFilterViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C510901yt c510901yt = new C510901yt(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c510901yt.LLILLJJLI = obj;
        return c510901yt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectRestoreManager@d998.observeBeautyData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C2252331DDr c2252331DDr = this.LLILLL.LLILLL;
            C0U73 c0u73 = new C0U73(this.LLILZ, this.LLILZIL, interfaceC497601wk);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, c0u73, this) == objLJFF) {
                C1C7U.LIZIZ("LiveEffectRestoreManager@d998.observeBeautyData$1");
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
