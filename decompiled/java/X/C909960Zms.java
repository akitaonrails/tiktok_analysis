package X;

import com.ss.android.ugc.aweme.im.strategy.track.data.SCPQueryData;
import com.ss.android.ugc.aweme.im.strategy.track.data.SCPTrackTree;
import java.util.Set;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Zms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909960Zms implements InterfaceC909980Zmu {
    public static final C01GW<C909960Zms> LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(432));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(433));

    @Override // X.InterfaceC909980Zmu
    public final void LIZ(AbstractC909800Zmc abstractC909800Zmc) {
        if (abstractC909800Zmc instanceof SCPQueryData) {
            ((Set) this.LIZ.getValue()).add(abstractC909800Zmc);
        } else if (!(abstractC909800Zmc instanceof SCPTrackTree)) {
        }
    }
}
