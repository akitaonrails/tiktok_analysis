package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01hA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.EffectFirstPanelHelper$fetchEffectFirstPanelListNew$1$1", f = "EffectFirstPanelHelper.kt", l = {73}, m = "invokeSuspend")
public final class C401001hA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StickerEffectViewModel LLILLL;
    public final /* synthetic */ EnumC768840UDy LLILZ;
    public final /* synthetic */ Fragment LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ DataChannel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C401001hA(StickerEffectViewModel stickerEffectViewModel, EnumC768840UDy enumC768840UDy, Fragment fragment, long j, DataChannel dataChannel, InterfaceC1364105Vn<? super C401001hA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = stickerEffectViewModel;
        this.LLILZ = enumC768840UDy;
        this.LLILZIL = fragment;
        this.LLILZLL = j;
        this.LLIZ = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C401001hA c401001hA = new C401001hA(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c401001hA.LLILLJJLI = obj;
        return c401001hA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectFirstPanelHelper@4976.fetchEffectFirstPanelListNew$1$1");
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
            StickerEffectViewModel stickerEffectViewModel = this.LLILLL;
            stickerEffectViewModel.LLJJ.getClass();
            Map mapLIZ = C767760U9u.LIZ("reward");
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(stickerEffectViewModel);
            C1DFB c1dfb = C0PEM.LIZJ;
            C23250099c.LIZLLL(viewModelScope, c1dfb, null, new C400501h5(stickerEffectViewModel, mapLIZ, null), 2);
            StickerEffectViewModel stickerEffectViewModel2 = this.LLILLL;
            stickerEffectViewModel2.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel2), c1dfb, null, new C401101hB(stickerEffectViewModel2, null), 2);
            StickerEffectViewModel stickerEffectViewModel3 = this.LLILLL;
            stickerEffectViewModel3.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel3), c1dfb, null, new C402201hM(stickerEffectViewModel3, "", null), 2);
            StickerEffectViewModel stickerEffectViewModel4 = this.LLILLL;
            C2252331DDr c2252331DDr = stickerEffectViewModel4.LLILLL;
            C0U9Y c0u9y = new C0U9Y(this.LLILZ, this.LLILZIL, stickerEffectViewModel4, this.LLILZLL, interfaceC497601wk, this.LLIZ);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, c0u9y, this) == objLJFF) {
                C1C7U.LIZIZ("EffectFirstPanelHelper@4976.fetchEffectFirstPanelListNew$1$1");
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
