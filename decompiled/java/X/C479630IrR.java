package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteHintCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IrR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479630IrR extends C09AY implements Function0<C16F5> {
    public final /* synthetic */ SuggestEmoteHintCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C479630IrR(SuggestEmoteHintCell suggestEmoteHintCell) {
        super(0);
        this.LL = suggestEmoteHintCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.16F5, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C16F5 invoke() {
        return this.LL.itemView.findViewById(R.id.upload_emotes_hint_tv);
    }
}
