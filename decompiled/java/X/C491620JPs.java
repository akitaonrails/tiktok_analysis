package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491620JPs extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SuggestEmotePageSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491620JPs(SuggestEmotePageSheet suggestEmotePageSheet) {
        super(0);
        this.LL = suggestEmotePageSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.dismissAllowingStateLoss();
        return Unit.LIZ;
    }
}
