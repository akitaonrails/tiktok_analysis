package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteListEmoteCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JXL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JXL extends C09AY implements Function0<ConstraintLayout> {
    public final /* synthetic */ SuggestEmoteListEmoteCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JXL(SuggestEmoteListEmoteCell suggestEmoteListEmoteCell) {
        super(0);
        this.LL = suggestEmoteListEmoteCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final ConstraintLayout invoke() {
        return this.LL.itemView.findViewById(R.id.h12);
    }
}
