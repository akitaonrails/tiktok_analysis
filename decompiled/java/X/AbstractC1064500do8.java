package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0do8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1064500do8 implements InterfaceC1063690dmp {
    public C1059860dge LIZ;

    @Override // X.InterfaceC1063690dmp
    public Class<? extends AbstractC1871160ynC> provideParamModel() {
        return null;
    }

    @Override // X.InterfaceC1063690dmp
    public Class<? extends AbstractC1870540ymC> provideResultModel() {
        return null;
    }

    @Override // X.InterfaceC1063690dmp
    public void release() {
    }

    @Override // X.InterfaceC1063690dmp
    public EnumC1063570dmd getAccess() {
        return EnumC1063570dmd.PRIVATE;
    }

    @Override // X.InterfaceC1063690dmp
    public final void LIZ(C1059860dge c1059860dge) {
        this.LIZ = c1059860dge;
    }

    public final <T> T LJFF(Class<T> cls) {
        C1059860dge c1059860dge = this.LIZ;
        if (c1059860dge != null) {
            return (T) c1059860dge.LIZ(cls);
        }
        return null;
    }

    public static void LJ(InterfaceC1063920dnC interfaceC1063920dnC, String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", 1);
        linkedHashMap.put("msg", str);
        linkedHashMap.put("data", map);
        interfaceC1063920dnC.LIZ(linkedHashMap);
    }

    public static void LIZJ(InterfaceC1063920dnC interfaceC1063920dnC, int i, String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i));
        linkedHashMap.put("msg", str);
        linkedHashMap.put("data", map);
        interfaceC1063920dnC.LIZ(linkedHashMap);
    }
}
