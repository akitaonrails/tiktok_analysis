package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518580KVk extends C09AY implements InterfaceC1631620sYq<String, JSONObject, Map<String, ? extends String>, Unit> {
    public C518580KVk() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, JSONObject jSONObject, Map<String, ? extends String> map) {
        InterfaceC518600KVm next;
        C518590KVl c518590KVlLIZ;
        String str2;
        String str3 = str;
        JSONObject jSONObject2 = jSONObject;
        Map<String, ? extends String> map2 = map;
        if (str3 != null) {
            C518590KVl c518590KVl = new C518590KVl(jSONObject2, str3, map2);
            Iterator<InterfaceC518600KVm> it2 = C518550KVh.LIZ.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
            } while (!next.LIZIZ(c518590KVl));
            InterfaceC518600KVm interfaceC518600KVm = next;
            List<InterfaceC518600KVm> list = C518550KVh.LIZ;
            if (interfaceC518600KVm != null && (c518590KVlLIZ = interfaceC518600KVm.LIZ(c518590KVl)) != null && (str2 = c518590KVlLIZ.LIZ) != null) {
                Map<String, String> map3 = c518590KVlLIZ.LIZJ;
                JSONObject jSONObject3 = c518590KVlLIZ.LIZIZ;
                if (map3 != null && !map3.isEmpty()) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
                    c474500IjALIZ.LJJIIZI(map3);
                    c474500IjALIZ.LIZ();
                } else if (jSONObject3 != null && jSONObject3.length() > 0) {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ(str2);
                    c474500IjALIZ2.LJJIIJZLJL(jSONObject3);
                    c474500IjALIZ2.LIZ();
                } else {
                    C0IJT.LIZ(str2).LIZ();
                }
            }
        }
        return Unit.LIZ;
    }
}
