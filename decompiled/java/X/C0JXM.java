package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteListEmoteCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JXM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JXM extends C09AY implements Function0<C16F5> {
    public final /* synthetic */ SuggestEmoteListEmoteCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JXM(SuggestEmoteListEmoteCell suggestEmoteListEmoteCell) {
        super(0);
        this.LL = suggestEmoteListEmoteCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.16F5, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C16F5 invoke() {
        return this.LL.itemView.findViewById(R.id.f0d);
    }
}
