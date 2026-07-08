package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteListEmoteCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493340JWi extends C09AY implements Function0<ConstraintLayout> {
    public final /* synthetic */ SubWaveEmoteListEmoteCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493340JWi(SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell) {
        super(0);
        this.LL = subWaveEmoteListEmoteCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final ConstraintLayout invoke() {
        return this.LL.itemView.findViewById(R.id.h17);
    }
}
