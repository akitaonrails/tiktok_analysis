package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517400KQw extends AbstractC517420KQy {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        UserAttr userAttr;
        Map<Integer, Integer> map;
        UserAttr userAttr2;
        Boolean boolValueOf = null;
        InterfaceC517410KQx interfaceC517410KQx = (InterfaceC517410KQx) C1909107dp.LIZJ(InterfaceC517410KQx.class, null);
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null && (userAttr2 = userLIZIZ.getUserAttr()) != null) {
            boolValueOf = Boolean.valueOf(userAttr2.isAdmin);
        }
        interfaceC517410KQx.setAdmin(Boolean.valueOf(C500260Jjc.LJJJI(boolValueOf)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        User userLIZIZ2 = C0KXJ.LIZIZ();
        if (userLIZIZ2 != null && (userAttr = userLIZIZ2.getUserAttr()) != null && (map = userAttr.adminPermissions) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap2.put(((Integer) entry.getKey()).toString(), entry.getValue());
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        interfaceC517410KQx.setPermissions(linkedHashMap);
        completionBlock.onSuccess(interfaceC517410KQx, "");
    }
}
