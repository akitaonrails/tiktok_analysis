package X;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0180, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0180 extends C09AY implements Function0<Set<String>> {
    public final /* synthetic */ C01CU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0180(C01CU c01cu) {
        super(0);
        this.LL = c01cu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Set<String> invoke() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C01CU c01cu = this.LL;
        Uri uri = c01cu.LJI.LIZ;
        if (uri == null) {
            uri = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getAuthority());
        sbLIZ.append(uri.getPath());
        Iterator it2 = a0.LJJLIIIJILLIZJL(C2188811AlT.LIZIZ(sbLIZ), new String[]{"/"}, 0, 6).iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(it2.next());
        }
        AnonymousClass0181 anonymousClass0181 = c01cu.LJI;
        Uri uri2 = anonymousClass0181.LIZIZ;
        if (uri2 == null) {
            Uri uri3 = anonymousClass0181.LIZ;
            uri2 = uri3 != null ? uri3 : null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(uri2.getAuthority());
        sbLIZ2.append(uri2.getPath());
        Iterator it3 = a0.LJJLIIIJILLIZJL(C2188811AlT.LIZIZ(sbLIZ2), new String[]{"/"}, 0, 6).iterator();
        while (it3.hasNext()) {
            linkedHashSet.add(it3.next());
        }
        AnonymousClass0181 anonymousClass01812 = c01cu.LJI;
        anonymousClass01812.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it4 = C13LP.LJLLLL(new C512401z8(24), anonymousClass01812.LIZIZ().keySet()).iterator();
        while (it4.hasNext()) {
            Map<String, String> map = anonymousClass01812.LIZIZ().get(it4.next());
            if (map != null) {
                linkedHashMap.putAll(map);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashSet.add(C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(entry.getKey(), entry.getValue()), "_", null, null, 0, null, null, 62));
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(AnonymousClass0181.LIZJ(c01cu.LJI, "trackParams"));
        if (mapLJIIJ != null) {
            for (Map.Entry<String, Object> entry2 : mapLJIIJ.entrySet()) {
                linkedHashSet.add(C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(entry2.getKey(), entry2.getValue()), "_", null, null, 0, null, null, 62));
            }
        }
        return linkedHashSet;
    }
}
