package X;

import com.ss.android.ugc.aweme.services.external.CacheQuota;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MCW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MCW extends AbstractC2255721DQs<C0L31> implements C0L31, InterfaceC379610EuV {
    public static final int LLILZIL = 8;
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(259));
    public CacheQuota LLILLL = bV();
    public final C0L31 LLILZ = this;

    private final String getSource() {
        return (String) this.LLILLJJLI.getValue();
    }

    @Override // X.C0L31
    public int rz0() {
        return this.LLILLL.quotaRemain;
    }

    @Override // X.C0L31
    public CacheQuota bV() {
        CacheQuota cacheQuotaLIZ = C0LXU.LIZ(getSource(), true);
        this.LLILLL = cacheQuotaLIZ;
        return cacheQuotaLIZ;
    }

    public C0L31 W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0MCW(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
