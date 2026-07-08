package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.CommentTopBarPriorityConfig;
import com.ss.android.ugc.aweme.experiment.CommentTopBarRefactorBizSettingsModel;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0lFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350400lFG {
    public static final CommentTopBarRefactorBizSettingsModel LIZ;

    static {
        CommentTopBarRefactorBizSettingsModel commentTopBarRefactorBizSettingsModel = new CommentTopBarRefactorBizSettingsModel(Collections.singletonList(3));
        CommentTopBarRefactorBizSettingsModel commentTopBarRefactorBizSettingsModel2 = (CommentTopBarRefactorBizSettingsModel) SettingsManager.LIZLLL().LJIIIIZZ("comment_top_bar_refactor_biz_settings", CommentTopBarRefactorBizSettingsModel.class, commentTopBarRefactorBizSettingsModel);
        if (commentTopBarRefactorBizSettingsModel2 != null) {
            commentTopBarRefactorBizSettingsModel = commentTopBarRefactorBizSettingsModel2;
        }
        LIZ = commentTopBarRefactorBizSettingsModel;
    }

    public static boolean LIZ(Integer num) {
        CommentTopBarRefactorBizSettingsModel commentTopBarRefactorBizSettingsModel = LIZ;
        List<Integer> list = commentTopBarRefactorBizSettingsModel.bizTypeList;
        if (list != null && list.contains(-1)) {
            return true;
        }
        if (num == null) {
            return false;
        }
        num.intValue();
        CommentTopBarPriorityConfig.LIZ.getClass();
        if (CommentTopBarPriorityConfig.LIZ()) {
            List<Integer> list2 = CommentTopBarPriorityConfig.LIZIZ().typePriorityList;
            if (list2 != null && list2.contains(num)) {
                return true;
            }
            return false;
        }
        List<Integer> list3 = commentTopBarRefactorBizSettingsModel.bizTypeList;
        if (list3 == null) {
            return false;
        }
        return list3.contains(num);
    }

    public static boolean LIZIZ(List list) {
        List<Integer> list2 = LIZ.bizTypeList;
        if (list2 != null && list2.contains(-1)) {
            return true;
        }
        if (list != null) {
            for (Object obj : list) {
                List<Integer> list3 = LIZ.bizTypeList;
                if (list3 != null && C13LP.LJJJJ(obj, list3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
