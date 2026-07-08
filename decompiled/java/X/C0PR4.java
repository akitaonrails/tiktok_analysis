package X;

import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PR4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PR4 implements C0PWT {
    public final List<FeedbackContents> LL;
    public final HashMap<String, Object> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PR4)) {
            return false;
        }
        C0PR4 c0pr4 = (C0PR4) obj;
        return Intrinsics.LJFF(this.LL, c0pr4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pr4.LLILLJJLI);
    }

    public final int hashCode() {
        List<FeedbackContents> list = this.LL;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalDoodleConfigChangeAction(feedbackSurvey=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", feelGoodToken=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PR4() {
        this(new HashMap(), C13BV.INSTANCE);
    }

    static {
        C0Q3E.LJFF().Ph1().LIZIZ(C13LE.LIZ(C0PR4.class), AFwS293S0000000_10.get$arr$(91));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PR4(HashMap map, List list) {
        this.LL = list;
        this.LLILLJJLI = map;
    }
}
