package X;

import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898880ZOc {
    public static final /* synthetic */ int LIZLLL = 0;
    public final SystemContent LIZ;
    public final C1622306Wv LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C898880ZOc)) {
            return false;
        }
        C898880ZOc c898880ZOc = (C898880ZOc) obj;
        return Intrinsics.LJFF(this.LIZ, c898880ZOc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c898880ZOc.LIZIZ) && this.LIZJ == c898880ZOc.LIZJ;
    }

    public final int hashCode() {
        SystemContent systemContent = this.LIZ;
        int iHashCode = (systemContent == null ? 0 : systemContent.hashCode()) * 31;
        C1622306Wv c1622306Wv = this.LIZIZ;
        return ((iHashCode + (c1622306Wv != null ? c1622306Wv.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SystemNoticeData(systemContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customerUIData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraBind=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C898880ZOc(SystemContent systemContent, C1622306Wv c1622306Wv, int i) {
        this(systemContent, (i & 2) != 0 ? null : c1622306Wv, false);
    }

    public C898880ZOc(SystemContent systemContent, C1622306Wv c1622306Wv, boolean z) {
        this.LIZ = systemContent;
        this.LIZIZ = c1622306Wv;
        this.LIZJ = z;
    }
}
