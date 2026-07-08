package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteContentDescriptionCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19rH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21669319rH extends C09AY implements Function0<C16F5> {
    public final /* synthetic */ SuggestEmoteContentDescriptionCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21669319rH(SuggestEmoteContentDescriptionCell suggestEmoteContentDescriptionCell) {
        super(0);
        this.LL = suggestEmoteContentDescriptionCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.16F5, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C16F5 invoke() {
        return this.LL.itemView.findViewById(R.id.h15);
    }
}
