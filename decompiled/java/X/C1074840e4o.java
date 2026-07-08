package X;

import com.ss.android.ugc.aweme.relation.auth.model.RegisteredContactUser;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074840e4o implements Serializable {
    public final Map<String, String> hashContactNameMap;
    public final Map<String, C1074830e4n> hashNationalNumberMap;
    public final List<RegisteredContactUser> registerItemList;
    public final List<C1074830e4n> unregisterItemList;

    public C1074840e4o() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1074840e4o)) {
            return false;
        }
        C1074840e4o c1074840e4o = (C1074840e4o) obj;
        return Intrinsics.LJFF(this.unregisterItemList, c1074840e4o.unregisterItemList) && Intrinsics.LJFF(this.registerItemList, c1074840e4o.registerItemList) && Intrinsics.LJFF(this.hashNationalNumberMap, c1074840e4o.hashNationalNumberMap) && Intrinsics.LJFF(this.hashContactNameMap, c1074840e4o.hashContactNameMap);
    }

    public C1074840e4o(List<C1074830e4n> list, List<RegisteredContactUser> list2, Map<String, C1074830e4n> map, Map<String, String> map2) {
        this.unregisterItemList = list;
        this.registerItemList = list2;
        this.hashNationalNumberMap = map;
        this.hashContactNameMap = map2;
    }

    public C1074840e4o(List list, List list2, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C2097608Jq.LJ() : map, (i & 8) != 0 ? C2097608Jq.LJ() : map2);
    }
}
