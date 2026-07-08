package X;

import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06M6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06M6 implements InterfaceC111300bX {
    public final ChatFeatureListConf LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C06M6) && Intrinsics.LJFF(this.LL, ((C06M6) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatConfigHierarchyData(config=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06M6(ChatFeatureListConf chatFeatureListConf) {
        this.LL = chatFeatureListConf;
    }
}
