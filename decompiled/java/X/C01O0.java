package X;

import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.01O0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01O0 extends C09AY implements InterfaceC1631620sYq<Map<?, ?>, String, List<? extends String>, Map<?, ?>> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01O0(String str) {
        super(3);
        this.LL = str;
    }

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Map<?, ?> invoke(Map<?, ?> map, String str, List<? extends String> list) {
        Map<?, ?> map2 = map;
        String str2 = this.LL;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(list, File.separator, null, null, 0, null, null, 62);
        if (strLJJLIIIJ != null) {
            map2.put(str2, strLJJLIIIJ);
        }
        return map2;
    }
}
