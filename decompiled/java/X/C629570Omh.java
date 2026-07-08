package X;

import com.ss.android.ugc.aweme.detail.prefab.HeaderAdvanceInfoAssem;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: renamed from: X.0Omh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629570Omh extends C09AY implements Function1<C628830OlV, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ MusicDetailFragment LLILLL;
    public final /* synthetic */ MusicDetail LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C629570Omh(boolean z, boolean z2, MusicDetailFragment musicDetailFragment, MusicDetail musicDetail) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = musicDetailFragment;
        this.LLILZ = musicDetail;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C628830OlV c628830OlV) {
        C628830OlV c628830OlV2 = c628830OlV;
        c628830OlV2.LL = C13LE.LIZ(HeaderAdvanceInfoAssem.class);
        c628830OlV2.LLJIJIL = C1163440gNi.LIZJ;
        if (this.LL) {
            c628830OlV2.LJII("reuse_music_info", AFwS240S0000000_9.get$arr$(793));
        }
        if (this.LLILLJJLI) {
            c628830OlV2.LJII("pgc_meta_info", new AwS375S0200000_9(this.LLILLL, this.LLILZ, 126));
        }
        return Unit.LIZ;
    }
}
