package X;

import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteContentDescriptionCell;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493220JVw extends C09AY implements Function1<C0JUV, Unit> {
    public final /* synthetic */ SubWaveEmoteContentDescriptionCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493220JVw(SubWaveEmoteContentDescriptionCell subWaveEmoteContentDescriptionCell) {
        super(1);
        this.LL = subWaveEmoteContentDescriptionCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0JUV c0juv) {
        Pair<Integer, Integer> pair = c0juv.LLILLL;
        ((TextView) this.LL.LLILLJJLI.getValue()).setText(C497740JfY.LJIJJ(2131844381, Integer.valueOf(pair.getFirst().intValue()), Integer.valueOf(pair.getSecond().intValue())));
        return Unit.LIZ;
    }
}
