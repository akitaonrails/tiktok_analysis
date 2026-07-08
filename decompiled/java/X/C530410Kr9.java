package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsService;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0Kr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530410Kr9 extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1 {
    public final LifecycleOwner LLILZLL;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        boolean zLIZ;
        try {
            LiveRecordingsService.LIZ.getClass();
            LiveRecordingsService liveRecordingsServiceLIZ = C522560KeU.LIZ();
            if (liveRecordingsServiceLIZ == null || !liveRecordingsServiceLIZ.isEnable()) {
                return;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZLL), C0PEM.LIZJ.plus(C2296908zH.LIZ()), null, new C530390Kr7(null), 2);
        } finally {
            if (!zLIZ) {
            }
        }
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P0;
    }

    public C530410Kr9(C19A3 c19a3) {
        this.LLILZLL = c19a3;
        LJ(AFwS239S0000000_8.get$arr$(276));
    }
}
