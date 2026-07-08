package X;

import java.util.Iterator;
import java.util.List;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0JyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509410JyN {
    public static final /* synthetic */ int LIZ = 0;

    public static TemplateInfo LIZ(List list) {
        Object obj;
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                TemplateInfo templateInfo = (TemplateInfo) next;
                if (templateInfo.tplType == 2 && templateInfo.renewalPeriod == 1) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TemplateInfo templateInfo2 = (TemplateInfo) next;
        if (templateInfo2 == null) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (((TemplateInfo) next2).tplType == 1) {
                    obj = next2;
                    break;
                }
            }
            return (TemplateInfo) obj;
        }
        return templateInfo2;
    }
}
