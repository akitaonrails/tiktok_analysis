package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteListEmoteCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493380JWm extends C09AY implements Function0<LiveIconView> {
    public final /* synthetic */ SubWaveEmoteListEmoteCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493380JWm(SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell) {
        super(0);
        this.LL = subWaveEmoteListEmoteCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.bytedance.android.live.design.view.icon.LiveIconView] */
    @Override // kotlin.jvm.functions.Function0
    public final LiveIconView invoke() {
        return this.LL.itemView.findViewById(R.id.h1n);
    }
}
