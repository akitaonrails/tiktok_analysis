package X;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.080c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20468080c extends C09AY implements InterfaceC1631620sYq<Map<String, String>, String, String, Unit> {
    public C20468080c() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Map<String, String> map, String str, String str2) {
        Map<String, String> map2 = map;
        if (str2 == null) {
            str2 = "";
        }
        map2.put(str, str2);
        return Unit.LIZ;
    }
}
