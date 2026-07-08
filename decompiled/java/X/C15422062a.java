package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.062a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15422062a implements InterfaceC111300bX {
    public final ConvertStyle LL;

    public C15422062a() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15422062a) && Intrinsics.LJFF(this.LL, ((C15422062a) obj).LL);
    }

    public final int hashCode() {
        ConvertStyle convertStyle = this.LL;
        if (convertStyle == null) {
            return 0;
        }
        return convertStyle.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConvertStyleData(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15422062a(ConvertStyle convertStyle) {
        this.LL = convertStyle;
    }
}
