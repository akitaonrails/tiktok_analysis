package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationAccessCriteriaAssem;
import com.ss.android.ugc.aweme.publicgroup.data.GroupJoinCheckItemResult;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0i9D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231330i9D extends C09AY implements Function2<UIAssem, C1230280i7W, Unit> {
    public final /* synthetic */ GroupInvitationAccessCriteriaAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1231330i9D(GroupInvitationAccessCriteriaAssem groupInvitationAccessCriteriaAssem) {
        super(2);
        this.LL = groupInvitationAccessCriteriaAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C1230280i7W c1230280i7W) {
        ConstraintLayout constraintLayout;
        UIAssem uIAssem2 = uIAssem;
        C1230280i7W c1230280i7W2 = c1230280i7W;
        GroupInvitationAccessCriteriaAssem groupInvitationAccessCriteriaAssem = this.LL;
        List<GroupJoinCheckItemResult> list = c1230280i7W2.LIZIZ;
        List<GroupJoinCheckItemResult> list2 = c1230280i7W2.LIZ;
        groupInvitationAccessCriteriaAssem.getClass();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        int i = 16;
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (GroupJoinCheckItemResult groupJoinCheckItemResult : list2) {
            linkedHashMap.put(Integer.valueOf(groupJoinCheckItemResult.checkItemType), groupJoinCheckItemResult);
        }
        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ2 >= 16) {
            i = iLIZIZ2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
        for (GroupJoinCheckItemResult groupJoinCheckItemResult2 : list) {
            linkedHashMap2.put(Integer.valueOf(groupJoinCheckItemResult2.checkItemType), groupJoinCheckItemResult2);
        }
        Integer numValueOf = null;
        for (GroupJoinCheckItemResult groupJoinCheckItemResult3 : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("access_criteria_cell_tag_");
            sbLIZ.append(groupJoinCheckItemResult3.checkItemType);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) groupInvitationAccessCriteriaAssem.Jo().findViewWithTag(strLIZIZ);
            if (constraintLayout2 != null) {
                groupInvitationAccessCriteriaAssem.Ho(constraintLayout2, groupJoinCheckItemResult3);
                GroupInvitationAccessCriteriaAssem.Go(groupInvitationAccessCriteriaAssem.Jo(), constraintLayout2, numValueOf);
                numValueOf = Integer.valueOf(constraintLayout2.getId());
            } else {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(groupInvitationAccessCriteriaAssem.getContext()), R.layout.cim, groupInvitationAccessCriteriaAssem.Jo(), false);
                if ((viewTd instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) viewTd) != null) {
                    constraintLayout.setId(View.generateViewId());
                    constraintLayout.setTag(strLIZIZ);
                    groupInvitationAccessCriteriaAssem.Ho(constraintLayout, groupJoinCheckItemResult3);
                    groupInvitationAccessCriteriaAssem.Jo().addView(constraintLayout);
                    GroupInvitationAccessCriteriaAssem.Go(groupInvitationAccessCriteriaAssem.Jo(), constraintLayout, numValueOf);
                    numValueOf = Integer.valueOf(constraintLayout.getId());
                }
            }
        }
        Iterator it2 = C15442062u.LJII(linkedHashMap.keySet(), linkedHashMap2.keySet()).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("access_criteria_cell_tag_");
            sbLIZ2.append(iIntValue);
            View viewFindViewWithTag = groupInvitationAccessCriteriaAssem.Jo().findViewWithTag(C2188811AlT.LIZIZ(sbLIZ2));
            if (viewFindViewWithTag != null) {
                C786410Ut5.LJJLI(viewFindViewWithTag, groupInvitationAccessCriteriaAssem.Jo());
            }
        }
        if (C866950Xzh.LIZIZ(c1230280i7W2.LIZIZ)) {
            C1584506Ih.LIZIZ(uIAssem2.LJJIJL());
        } else {
            C1584506Ih.LIZ(uIAssem2.LJJIJL());
        }
        return Unit.LIZ;
    }
}
