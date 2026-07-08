package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0SZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723460SZk {
    public static void LIZ(ReusedAssem reusedAssem, List list) {
        ReusedAssem reusedAssem2;
        if (reusedAssem != null) {
            ((ArrayList) list).add(reusedAssem);
            List<AbstractC738140SxQ> children = reusedAssem.getChildren();
            if (children != null) {
                for (AbstractC738140SxQ abstractC738140SxQ : children) {
                    if (abstractC738140SxQ instanceof ReusedAssem) {
                        reusedAssem2 = (ReusedAssem) abstractC738140SxQ;
                    } else {
                        reusedAssem2 = null;
                    }
                    LIZ(reusedAssem2, list);
                }
            }
        }
    }
}
