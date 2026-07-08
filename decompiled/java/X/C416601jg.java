package X;

import java.util.Map;

/* JADX INFO: renamed from: X.01jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C416601jg extends C09AY implements InterfaceC1631620sYq<Map<?, ?>, String, String, Map<?, ?>> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C416601jg(String str) {
        super(3);
        this.LL = str;
    }

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Map<?, ?> invoke(Map<?, ?> map, String str, String str2) {
        Map<?, ?> map2 = map;
        String str3 = this.LL;
        if (str2 != null) {
            map2.put(str3, str2);
        }
        return map2;
    }
}
