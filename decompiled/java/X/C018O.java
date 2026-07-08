package X;

import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.018O, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018O extends C09AY implements Function2<Map<?, ?>, String, List<? extends String>> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C018O(String str) {
        super(2);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ List<? extends String> invoke(Map<?, ?> map, String str) {
        String str2;
        Object obj = map.get(this.LL);
        if (obj == null || !(obj instanceof String) || (str2 = (String) obj) == null) {
            return null;
        }
        return a0.LJJLIIIJILLIZJL(str2, new String[]{File.separator}, 0, 6);
    }
}
