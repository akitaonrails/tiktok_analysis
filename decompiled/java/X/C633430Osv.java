package X;

import com.ss.android.ugc.aweme.music.fanspotlight.profilemusictab.detail.vm.FanSpotlightProfileDetailShareVM;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Osv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633430Osv extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1357705Tb LL;
    public final /* synthetic */ OriginMusicListViewModel LLILLJJLI;
    public final /* synthetic */ FanSpotlightProfileDetailShareVM LLILLL;
    public final /* synthetic */ InterfaceC346201Wa<Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633430Osv(C1357705Tb c1357705Tb, OriginMusicListViewModel originMusicListViewModel, FanSpotlightProfileDetailShareVM fanSpotlightProfileDetailShareVM, InterfaceC346201Wa<Unit> interfaceC346201Wa, int i) {
        super(2);
        this.LL = c1357705Tb;
        this.LLILLJJLI = originMusicListViewModel;
        this.LLILLL = fanSpotlightProfileDetailShareVM;
        this.LLILZ = interfaceC346201Wa;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C633810OtX.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1));
        return Unit.LIZ;
    }
}
