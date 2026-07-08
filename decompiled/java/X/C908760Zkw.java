package X;

import com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908760Zkw extends AbstractC908770Zkx {
    public final List<ActionBarButtonConf> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C908760Zkw) && Intrinsics.LJFF(this.LIZ, ((C908760Zkw) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonConfListData(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C908760Zkw(List<ActionBarButtonConf> list) {
        this.LIZ = list;
    }
}
