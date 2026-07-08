package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392580mLI extends C09AY implements Function0<String> {
    public final /* synthetic */ C1392530mLD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392580mLI(C1392530mLD c1392530mLD) {
        super(0);
        this.LL = c1392530mLD;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Aweme awemeLJJLIIIJJIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL.LL;
        if (interfaceC1392640mLO == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) == null) {
            return null;
        }
        return awemeLJJLIIIJJIZ.getRequestId();
    }
}
