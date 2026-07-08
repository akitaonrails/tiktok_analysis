package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteListEmoteCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493440JWs extends C09AY implements Function0<C19R6> {
    public final /* synthetic */ SubWaveEmoteListEmoteCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493440JWs(SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell) {
        super(0);
        this.LL = subWaveEmoteListEmoteCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19R6, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C19R6 invoke() {
        return this.LL.itemView.findViewById(R.id.h19);
    }
}
