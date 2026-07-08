package X;

import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.fanspotlight.profilemusictab.detail.vm.FanSpotlightProfileDetailShareVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Osu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.compose.FanSpotlightBlockContentKt$FanSpotlightBlockContent$1$1", f = "FanSpotlightBlockContent.kt", l = {}, m = "invokeSuspend")
public final class C633420Osu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FanSpotlightProfileDetailShareVM LL;
    public final /* synthetic */ C1357705Tb LLILLJJLI;
    public final /* synthetic */ OriginMusicArg LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633420Osu(FanSpotlightProfileDetailShareVM fanSpotlightProfileDetailShareVM, C1357705Tb c1357705Tb, OriginMusicArg originMusicArg, InterfaceC1364105Vn<? super C633420Osu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fanSpotlightProfileDetailShareVM;
        this.LLILLJJLI = c1357705Tb;
        this.LLILLL = originMusicArg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C633420Osu(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FanSpotlightBlockContentKt@432.FanSpotlightBlockContent$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FanSpotlightProfileDetailShareVM fanSpotlightProfileDetailShareVM = this.LL;
        C1357705Tb c1357705Tb = this.LLILLJJLI;
        fanSpotlightProfileDetailShareVM.getClass();
        fanSpotlightProfileDetailShareVM.LLILZIL = c1357705Tb.LL;
        fanSpotlightProfileDetailShareVM.LLILZLL = c1357705Tb.LLILLJJLI;
        fanSpotlightProfileDetailShareVM.manualListRefresh();
        FanSpotlightProfileDetailShareVM fanSpotlightProfileDetailShareVM2 = this.LL;
        OriginMusicArg originMusicArg = this.LLILLL;
        if (originMusicArg != null) {
            originMusicArg.isMe();
        }
        fanSpotlightProfileDetailShareVM2.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FanSpotlightBlockContentKt@432.FanSpotlightBlockContent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
