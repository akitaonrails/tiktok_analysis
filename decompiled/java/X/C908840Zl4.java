package X;

import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908840Zl4 {
    public final String LIZ;
    public final Function1<SmartImageView, Unit> LIZIZ;
    public final Function1<C1331670kl3, C1331670kl3> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C908840Zl4)) {
            return false;
        }
        C908840Zl4 c908840Zl4 = (C908840Zl4) obj;
        return Intrinsics.LJFF(this.LIZ, c908840Zl4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c908840Zl4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c908840Zl4.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Function1<SmartImageView, Unit> function1 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C1331670kl3, C1331670kl3> function12 = this.LIZJ;
        return iHashCode2 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteIcon(iconUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", configure=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", builderExt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C908840Zl4(String str, Function1 function1, int i) {
        this(str, (Function1<? super SmartImageView, Unit>) null, (Function1<? super C1331670kl3, ? extends C1331670kl3>) ((i & 4) != 0 ? null : function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C908840Zl4(String str, Function1<? super SmartImageView, Unit> function1, Function1<? super C1331670kl3, ? extends C1331670kl3> function12) {
        this.LIZ = str;
        this.LIZIZ = function1;
        this.LIZJ = function12;
    }
}
