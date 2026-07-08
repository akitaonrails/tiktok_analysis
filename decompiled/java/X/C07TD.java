package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07TD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TD {
    public final Function1<Aweme, Boolean> LIZ;
    public final Function1<Aweme, Boolean> LIZIZ;
    public final Function1<Aweme, Boolean> LIZJ;

    public C07TD() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07TD)) {
            return false;
        }
        C07TD c07td = (C07TD) obj;
        return Intrinsics.LJFF(this.LIZ, c07td.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07td.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c07td.LIZJ);
    }

    public final int hashCode() {
        Function1<Aweme, Boolean> function1 = this.LIZ;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<Aweme, Boolean> function12 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1<Aweme, Boolean> function13 = this.LIZJ;
        return iHashCode2 + (function13 != null ? function13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedConfig(enablePostDelete=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", supportReEditAfterPost=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", useCustomPrivateUnavailableText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C07TD(Function1<? super Aweme, Boolean> function1, Function1<? super Aweme, Boolean> function12, Function1<? super Aweme, Boolean> function13) {
        this.LIZ = function1;
        this.LIZIZ = function12;
        this.LIZJ = function13;
    }
}
