package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0Y3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867960Y3e {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("s:message_index_is_local", "a:mentioned", "s:sdk_ref_msg_id", "s:temp_msg_create_time");

    public static final HashMap<String, String> LIZ(C869590Y9l c869590Y9l, List<String> list) {
        HashMap<String, String> map = new HashMap<>(list.size());
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        for (String str : list) {
            map.put(str, localExt.get(str));
        }
        return map;
    }

    public static final boolean LIZIZ(InterfaceC869780YAe interfaceC869780YAe, C869590Y9l c869590Y9l, C07ZY c07zy, boolean z, boolean z2) {
        Map<String, String> map = c07zy.LIZ;
        Set<String> set = null;
        if (map.isEmpty()) {
            map = null;
        }
        Set<String> set2 = c07zy.LIZIZ;
        if (!set2.isEmpty()) {
            set = set2;
        }
        return interfaceC869780YAe.LIZ(c869590Y9l, map, set, z, z2);
    }
}
