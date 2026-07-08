package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C830150WhR extends HashMap<String, String> {
    public final /* synthetic */ C830090WhL LL;

    public C830150WhR(C830090WhL c830090WhL) {
        this.LL = c830090WhL;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String lowerCase;
        String str = (String) obj;
        Map<String, String> map = this.LL.LLILZLL;
        if (str == null) {
            lowerCase = str;
        } else {
            lowerCase = str.toLowerCase();
        }
        ((HashMap) map).put(lowerCase, obj2);
        return super.put(str, obj2);
    }
}
