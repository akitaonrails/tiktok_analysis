package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveSuggestEmoteEntrance;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19rR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21670319rR extends C09AY implements Function0<C426770GoN> {
    public final /* synthetic */ SubWaveSuggestEmoteEntrance LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21670319rR(SubWaveSuggestEmoteEntrance subWaveSuggestEmoteEntrance) {
        super(0);
        this.LL = subWaveSuggestEmoteEntrance;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0GoN, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C426770GoN invoke() {
        return this.LL.itemView.findViewById(R.id.wnz);
    }
}
