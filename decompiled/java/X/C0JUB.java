package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUB extends C09AY implements Function1<C0JUV, Unit> {
    public final /* synthetic */ SubWaveEmotePageViewModel LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUB(SubWaveEmotePageViewModel subWaveEmotePageViewModel, Context context) {
        super(1);
        this.LL = subWaveEmotePageViewModel;
        this.LLILLJJLI = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0JUV c0juv) {
        SubWaveEmotePageViewModel subWaveEmotePageViewModel = this.LL;
        C500260Jjc.LJJJJJ(subWaveEmotePageViewModel, null, new C0JU7(c0juv, subWaveEmotePageViewModel, this.LLILLJJLI, null), 3);
        return Unit.LIZ;
    }
}
