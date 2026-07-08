package X;

import java.util.Iterator;
import java.util.List;
import webcast.api.pgc_sub.PGCTemplateInfo;

/* JADX INFO: renamed from: X.0K7B, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7B {
    public static final /* synthetic */ int LIZ = 0;

    public static PGCTemplateInfo LIZ(List list) {
        Object obj;
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                PGCTemplateInfo pGCTemplateInfo = (PGCTemplateInfo) next;
                if (pGCTemplateInfo.tplType == 2 && pGCTemplateInfo.renewalPeriod == 1) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PGCTemplateInfo pGCTemplateInfo2 = (PGCTemplateInfo) next;
        if (pGCTemplateInfo2 == null) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (((PGCTemplateInfo) next2).tplType == 1) {
                    obj = next2;
                    break;
                }
            }
            return (PGCTemplateInfo) obj;
        }
        return pGCTemplateInfo2;
    }
}
