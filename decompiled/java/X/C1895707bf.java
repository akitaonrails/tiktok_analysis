package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1895707bf {
    public final Function1<CreativeModel, Boolean> LIZ;
    public final Function1<Aweme, Boolean> LIZIZ;

    public C1895707bf() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1895707bf)) {
            return false;
        }
        C1895707bf c1895707bf = (C1895707bf) obj;
        return Intrinsics.LJFF(this.LIZ, c1895707bf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1895707bf.LIZIZ);
    }

    public final int hashCode() {
        Function1<CreativeModel, Boolean> function1 = this.LIZ;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<Aweme, Boolean> function12 = this.LIZIZ;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoVisibilityConfig(provideCameoVisibilityTitleInPublish=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", provideCameoVisibilityTitleInFeed=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1895707bf(Function1<? super CreativeModel, Boolean> function1, Function1<? super Aweme, Boolean> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
    }
}
