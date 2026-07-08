package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.04sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1236804sg {
    public static final void LIZ(AbstractC738140SxQ abstractC738140SxQ, List<AbstractC738140SxQ> list) {
        List<AbstractC738140SxQ> children = abstractC738140SxQ.getChildren();
        if (children == null || children.isEmpty()) {
            return;
        }
        for (AbstractC738140SxQ abstractC738140SxQ2 : children) {
            ((ArrayList) list).add(abstractC738140SxQ2);
            LIZ(abstractC738140SxQ2, list);
        }
    }
}
