package X;

import android.content.Context;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCommon;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228910i5J {
    public static final C1228910i5J LIZ = new C1228910i5J();

    public static final boolean LIZ(GroupCompositeType groupCompositeType) {
        C1229040i5W c1229040i5W = C1229040i5W.LL;
        if (!Intrinsics.LJFF(groupCompositeType.groupCategory, EnumC1228990i5R.PUBLIC_GROUP.getValue())) {
            C1759206uk c1759206uk = C1759206uk.LIZ;
            return C1759206uk.LIZ();
        }
        if (C123100dR.LIZ(groupCompositeType.groupType)) {
            GroupEntrance groupEntrance = (GroupEntrance) ((LinkedHashMap) C1229040i5W.LJII(Collections.singletonList(groupCompositeType))).get(groupCompositeType);
            if (groupEntrance != null) {
                return groupEntrance.canCreate;
            }
            return false;
        }
        GroupEntranceCommon groupEntranceCommon = C1229040i5W.LJI(Collections.singletonList(groupCompositeType)).LIZJ;
        if (groupEntranceCommon != null && groupEntranceCommon.canCreate) {
            return true;
        }
        return false;
    }

    public static final C1228560i4k LIZJ(List<GroupCompositeType> list) {
        C1229040i5W c1229040i5W = C1229040i5W.LL;
        return C1229040i5W.LJI(list);
    }

    public static final void LIZIZ(List<GroupCompositeType> list, EnumC1229060i5Y enumC1229060i5Y) {
        C1229040i5W c1229040i5W = C1229040i5W.LL;
        C1229040i5W.LJ(list, enumC1229060i5Y);
    }

    public static final String LIZLLL(Context context, GroupAccessCriteriaCollection groupAccessCriteriaCollection) {
        GroupAccessCriteria groupAccessCriteria;
        if (groupAccessCriteriaCollection == null || (groupAccessCriteria = groupAccessCriteriaCollection.selectedAccessCriteria) == null) {
            groupAccessCriteria = new GroupAccessCriteria(EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_UNKNOWN.getValue(), "", "");
        }
        if (groupAccessCriteriaCollection == null) {
            return "";
        }
        if (!groupAccessCriteriaCollection.hasMultipleAccessCriteria) {
            return groupAccessCriteriaCollection.name;
        }
        if (groupAccessCriteria.description.length() <= 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(groupAccessCriteriaCollection.name);
        sbLIZ.append(' ');
        sbLIZ.append(context.getString(2131827514, groupAccessCriteria.description));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
