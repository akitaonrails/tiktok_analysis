package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteListEmoteCell;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JWC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JWC extends C09AY implements Function1<C492830JUj, Unit> {
    public final /* synthetic */ SuggestEmoteListEmoteCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JWC(SuggestEmoteListEmoteCell suggestEmoteListEmoteCell) {
        super(1);
        this.LL = suggestEmoteListEmoteCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C492830JUj c492830JUj) {
        SuggestEmoteListEmoteCell suggestEmoteListEmoteCell = this.LL;
        new IHostSubscription.Params();
        SuggestEmoteListEmoteCell suggestEmoteListEmoteCell2 = this.LL;
        suggestEmoteListEmoteCell2.getClass();
        C2097908Jt.LIZJ(new Pair("show_entrance", suggestEmoteListEmoteCell2.LLILLJJLI));
        suggestEmoteListEmoteCell.getClass();
        return Unit.LIZ;
    }
}
