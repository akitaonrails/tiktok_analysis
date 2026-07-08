package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JTT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JTT extends C09AY implements Function1<C0JUV, Unit> {
    public final /* synthetic */ SubWaveEmotePageViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JTT(SubWaveEmotePageViewModel subWaveEmotePageViewModel, String str) {
        super(1);
        this.LL = subWaveEmotePageViewModel;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0JUV c0juv) {
        SubWaveEmotePageViewModel subWaveEmotePageViewModel = this.LL;
        C500260Jjc.LJJJJJ(subWaveEmotePageViewModel, null, new C0JUJ(this.LLILLJJLI, c0juv, subWaveEmotePageViewModel, null), 3);
        return Unit.LIZ;
    }
}
