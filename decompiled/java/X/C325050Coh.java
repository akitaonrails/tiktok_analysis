package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.tako.network.TakoNetworkState;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Coh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325050Coh {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(313));
    public final C2252321DDq LIZIZ;
    public final AnonymousClass0951 LIZJ;
    public volatile boolean LIZLLL;
    public volatile EnumC325100Com LJ;
    public final C325060Coi LJFF;

    public final TakoNetworkState LIZ() {
        EnumC325100Com networkStatus = ((INetworkStateService) this.LIZ.getValue()).getNetworkStatus();
        if (networkStatus == EnumC325100Com.NOT_AVAILABLE) {
            return TakoNetworkState.OFFLINE;
        }
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                return LIZIZ(networkStatus);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return (networkStatus == EnumC325100Com.STRONG || networkStatus == EnumC325100Com.WEAK) ? LIZIZ(networkStatus) : TakoNetworkState.OFFLINE;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Coi] */
    public C325050Coh() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(LIZ());
        this.LIZIZ = c2252321DDqLIZ;
        this.LIZJ = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LJFF = new C0CSC() { // from class: X.0Coi
            @Override // X.C0CSC
            public final void LIZ(EnumC325100Com enumC325100Com) {
                if (this.LIZ.LJ == enumC325100Com) {
                    return;
                }
                this.LIZ.LIZIZ.getValue();
                this.LIZ.LJ = enumC325100Com;
                this.LIZ.LIZIZ.setValue(this.LIZ.LIZ());
            }
        };
    }

    public static TakoNetworkState LIZIZ(EnumC325100Com enumC325100Com) {
        int i = C325090Col.LIZ[enumC325100Com.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return TakoNetworkState.FAKE;
                    }
                    throw new C1954807lC();
                }
                return TakoNetworkState.OFFLINE;
            }
            return TakoNetworkState.WEAK;
        }
        return TakoNetworkState.STRONG;
    }
}
