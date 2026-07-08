package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Spr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733450Spr extends C09AY implements Function0<Unit> {
    public C733450Spr() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Keva repoFromSp;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "share_count_memory_fix", true, false)) {
            if (C733500Spw.LIZ == null) {
                try {
                    C844470XAv.LIZ.getClass();
                    repoFromSp = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "video_share_repo", 0);
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    repoFromSp = null;
                }
                C733500Spw.LIZ = repoFromSp;
            }
            Keva keva = C733500Spw.LIZ;
            if (keva != null) {
                keva.clear();
            }
        }
        return Unit.LIZ;
    }
}
