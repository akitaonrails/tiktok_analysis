package X;

import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotUpdateResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04in, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1175504in implements InterfaceC1175604io {
    public final BotUpdateResponse LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1175504in) && Intrinsics.LJFF(this.LIZ, ((C1175504in) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ok(response=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1175504in(BotUpdateResponse botUpdateResponse) {
        this.LIZ = botUpdateResponse;
    }
}
