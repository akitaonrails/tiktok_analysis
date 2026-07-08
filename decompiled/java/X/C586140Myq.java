package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Myq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586140Myq {
    public final Aweme LIZ;
    public final Integer LIZIZ;
    public final Context LIZJ;
    public final InterfaceC1011390cQT LIZLLL;
    public final boolean LJ;

    public C586140Myq() {
        this(null, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C586140Myq)) {
            return false;
        }
        C586140Myq c586140Myq = (C586140Myq) obj;
        return Intrinsics.LJFF(this.LIZ, c586140Myq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c586140Myq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c586140Myq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c586140Myq.LIZLLL) && this.LJ == c586140Myq.LJ;
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Context context = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (context == null ? 0 : context.hashCode())) * 31;
        InterfaceC1011390cQT interfaceC1011390cQT = this.LIZLLL;
        return ((iHashCode3 + (interfaceC1011390cQT != null ? interfaceC1011390cQT.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiSummaryCardSubModuleData(bindAweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", awemeIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ability=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isLastAd=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C586140Myq(Aweme aweme, Integer num, Context context, InterfaceC1011390cQT interfaceC1011390cQT, boolean z) {
        this.LIZ = aweme;
        this.LIZIZ = num;
        this.LIZJ = context;
        this.LIZLLL = interfaceC1011390cQT;
        this.LJ = z;
    }
}
