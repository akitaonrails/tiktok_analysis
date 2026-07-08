package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteListEmoteCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JXN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JXN extends C09AY implements Function0<LiveIconView> {
    public final /* synthetic */ SuggestEmoteListEmoteCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JXN(SuggestEmoteListEmoteCell suggestEmoteListEmoteCell) {
        super(0);
        this.LL = suggestEmoteListEmoteCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.bytedance.android.live.design.view.icon.LiveIconView] */
    @Override // kotlin.jvm.functions.Function0
    public final LiveIconView invoke() {
        return this.LL.itemView.findViewById(R.id.h14);
    }
}
