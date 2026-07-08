package X;

import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18Dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21249518Dt {
    public static final Map<String, PageInfoStack> LIZ = new LinkedHashMap();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C21249418Ds());

    public static void LIZIZ(Object obj, PageProp pageProp) {
        String name;
        Object obj2;
        if (pageProp != null && pageProp.getSingleton() && (obj2 = ((LinkedHashMap) LIZ).get((name = obj.getClass().getName()))) != null) {
            ((C18EH) LIZIZ.getValue()).LIZLLL(obj2, name, true);
        }
    }

    public static void LIZ(Object obj, PageProp pageProp, boolean z) {
        if (!pageProp.getSingleton()) {
            return;
        }
        C21248618Dk.LIZ.getClass();
        PageInfoStack pageInfoStackLJIIL = C21248618Dk.LJIIL(obj, z);
        String name = obj.getClass().getName();
        Map<String, PageInfoStack> map = LIZ;
        PageInfoStack pageInfoStack = (PageInfoStack) ((LinkedHashMap) map).get(name);
        if (pageInfoStack == null) {
            map.put(name, pageInfoStackLJIIL);
            return;
        }
        String btmPre = pageInfoStackLJIIL.getBtmPre();
        if (btmPre != null && btmPre.length() != 0) {
            map.put(name, pageInfoStackLJIIL);
            ((C18EH) LIZIZ.getValue()).LIZLLL(pageInfoStackLJIIL, name, false);
        } else {
            pageInfoStack.setRecoveryFrom(EnumC21244218Bs.SINGLETON_CACHE);
            C21248618Dk.LIZLLL.put(new C589920NBu<>(obj), pageInfoStack);
        }
    }
}
