package X;

import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotUpdateResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04ip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1175704ip implements InterfaceC1175604io {
    public final int LIZ;
    public final BotUpdateResponse LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1175704ip)) {
            return false;
        }
        C1175704ip c1175704ip = (C1175704ip) obj;
        return this.LIZ == c1175704ip.LIZ && Intrinsics.LJFF(this.LIZIZ, c1175704ip.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HttpFail(statusCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1175704ip(int i, BotUpdateResponse botUpdateResponse) {
        this.LIZ = i;
        this.LIZIZ = botUpdateResponse;
    }
}
