package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JTL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JTL extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ SubWaveEmotePageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JTL(SubWaveEmotePageFragment subWaveEmotePageFragment) {
        super(1);
        this.LL = subWaveEmotePageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        SubWaveEmotePageFragment subWaveEmotePageFragment = this.LL;
        c062p.LIZ = new C0JTU(subWaveEmotePageFragment.LLILLL, subWaveEmotePageFragment.LLILZ, subWaveEmotePageFragment.LLILZIL);
        return Unit.LIZ;
    }
}
