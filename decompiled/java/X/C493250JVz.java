package X;

import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteContentDescriptionCell;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493250JVz extends C09AY implements Function2<C03H5, Pair<? extends Integer, ? extends Integer>, Unit> {
    public final /* synthetic */ SuggestEmoteContentDescriptionCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493250JVz(SuggestEmoteContentDescriptionCell suggestEmoteContentDescriptionCell) {
        super(2);
        this.LL = suggestEmoteContentDescriptionCell;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, Pair<? extends Integer, ? extends Integer> pair) {
        Pair<? extends Integer, ? extends Integer> pair2 = pair;
        ((TextView) this.LL.LLILLJJLI.getValue()).setText(C497740JfY.LJIJJ(2131844381, Integer.valueOf(pair2.getFirst().intValue()), Integer.valueOf(pair2.getSecond().intValue())));
        return Unit.LIZ;
    }
}
