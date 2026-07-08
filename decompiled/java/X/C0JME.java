package X;

import com.ss.android.ugc.aweme.editpost.EditPostBizPermissionStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0JME, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JME {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ(EditPostPermission editPostPermission) {
        List<EditPostBizPermissionStruct> list;
        EditPostBizPermissionStruct next;
        if (editPostPermission != null && (list = editPostPermission.bizPermission) != null) {
            Iterator<EditPostBizPermissionStruct> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    int i = next.bizType;
                    if (i == 3 || i == 4) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EditPostBizPermissionStruct editPostBizPermissionStruct = next;
            if (editPostBizPermissionStruct != null) {
                return editPostBizPermissionStruct.bizStatus;
            }
        }
        return C0JMD.NO_SHOW.getValue();
    }
}
