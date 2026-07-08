package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SnP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731930SnP extends C09AY implements Function1<C730490Sl5, C730490Sl5> {
    public final /* synthetic */ VideoDiggVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C731930SnP(VideoDiggVM videoDiggVM) {
        super(1);
        this.LL = videoDiggVM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final C730490Sl5 invoke(C730490Sl5 c730490Sl5) {
        C731910SnN c731910SnNLIZ;
        C730490Sl5 c730490Sl52 = c730490Sl5;
        C731910SnN c731910SnN = ((C730490Sl5) this.LL.getState()).LLILLJJLI;
        if (c731910SnN != null) {
            c731910SnNLIZ = C731910SnN.LIZ(c731910SnN, this.LL.getForceTextShow());
        } else {
            c731910SnNLIZ = null;
        }
        return C730490Sl5.LIZ(c730490Sl52, c731910SnNLIZ, null, null, null, null, 61);
    }
}
