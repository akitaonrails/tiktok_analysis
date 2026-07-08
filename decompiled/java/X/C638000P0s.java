package X;

import com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0P0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638000P0s extends C09AY implements Function0<InteractInfoDescAbility> {
    public final /* synthetic */ VideoMusicTitleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C638000P0s(VideoMusicTitleAssem videoMusicTitleAssem) {
        super(0);
        this.LL = videoMusicTitleAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractInfoDescAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), InteractInfoDescAbility.class, null);
    }
}
