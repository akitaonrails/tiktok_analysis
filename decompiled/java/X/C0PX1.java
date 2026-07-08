package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchContextService;
import com.ss.android.ugc.aweme.search.ISearchService;
import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0PX1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PX1 implements C0PWT {
    public final long LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PX1) && this.LL == ((C0PX1) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicSearchUpdateSessionAction(currentSearchSession=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PX1() {
        this(0L);
    }

    static {
        ((ISearchContextService) ServiceManager.get().getService(ISearchService.class)).r().P60().LIZIZ(C13LE.LIZ(C0PX1.class), AFwS293S0000000_10.get$arr$(103));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PX1(long j) {
        this.LL = j;
    }
}
