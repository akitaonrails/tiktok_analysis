package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0Ctt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328270Ctt implements InterfaceC497601wk {
    public static final C328270Ctt LL = new C328270Ctt();
    public static final C1DFB LLILLJJLI = C0PEM.LIZJ;
    public static final Map<String, Map<IMContact, InterfaceC332260D0u<EnumC328260Cts>>> LLILLL = new LinkedHashMap();
    public static final Map<String, Map<IMContact, C1363340la8>> LLILZ = new LinkedHashMap();

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return LLILLJJLI;
    }

    public static InterfaceC332260D0u LIZ(IMContact iMContact, String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) LLILLL;
        Object linkedHashMap2 = linkedHashMap.get(str);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(str, linkedHashMap2);
        }
        Map map = (Map) linkedHashMap2;
        Object objLIZ = map.get(iMContact);
        if (objLIZ == null) {
            objLIZ = C1BNE.LIZ(EnumC328260Cts.INIT);
            map.put(iMContact, objLIZ);
        }
        return (InterfaceC332260D0u) objLIZ;
    }
}
