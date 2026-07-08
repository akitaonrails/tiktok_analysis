package X;

import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteContentDescriptionCell;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493210JVv extends C09AY implements Function1<C492830JUj, Unit> {
    public final /* synthetic */ SuggestEmoteContentDescriptionCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493210JVv(SuggestEmoteContentDescriptionCell suggestEmoteContentDescriptionCell) {
        super(1);
        this.LL = suggestEmoteContentDescriptionCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C492830JUj c492830JUj) {
        Pair<Integer, Integer> pair = c492830JUj.LLILLJJLI;
        ((TextView) this.LL.LLILLJJLI.getValue()).setText(C497740JfY.LJIJJ(2131852084, Integer.valueOf(pair.getFirst().intValue()), Integer.valueOf(pair.getSecond().intValue())));
        return Unit.LIZ;
    }
}
