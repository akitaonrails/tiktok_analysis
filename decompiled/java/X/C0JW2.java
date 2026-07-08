package X;

import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteContentDescriptionCell;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JW2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JW2 extends C09AY implements Function2<C03H5, Pair<? extends Integer, ? extends Integer>, Unit> {
    public final /* synthetic */ SubWaveEmoteContentDescriptionCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JW2(SubWaveEmoteContentDescriptionCell subWaveEmoteContentDescriptionCell) {
        super(2);
        this.LL = subWaveEmoteContentDescriptionCell;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, Pair<? extends Integer, ? extends Integer> pair) {
        Pair<? extends Integer, ? extends Integer> pair2 = pair;
        ((TextView) this.LL.LLILLJJLI.getValue()).setText(C497740JfY.LJIJJ(2131844381, Integer.valueOf(pair2.getFirst().intValue()), Integer.valueOf(pair2.getSecond().intValue())));
        return Unit.LIZ;
    }
}
