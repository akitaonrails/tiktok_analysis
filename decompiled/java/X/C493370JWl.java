package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteListEmoteCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493370JWl extends C09AY implements Function0<C1324720kZq> {
    public final /* synthetic */ SubWaveEmoteListEmoteCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493370JWl(SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell) {
        super(0);
        this.LL = subWaveEmoteListEmoteCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kZq, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C1324720kZq invoke() {
        return this.LL.itemView.findViewById(R.id.wnx);
    }
}
