package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0ymY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1870760ymY {
    public final /* synthetic */ AbstractC1870770ymZ LIZ;
    public final /* synthetic */ InterfaceC1063920dnC LIZIZ;

    public C1870760ymY(AbstractC1870770ymZ abstractC1870770ymZ, InterfaceC1063920dnC interfaceC1063920dnC) {
        this.LIZ = abstractC1870770ymZ;
        this.LIZIZ = interfaceC1063920dnC;
    }

    public final void LIZ(C1870740ymW c1870740ymW, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = c1870740ymW.LIZ;
        if (obj != null) {
            linkedHashMap.put("data", obj);
        }
        AbstractC1870770ymZ abstractC1870770ymZ = this.LIZ;
        InterfaceC1063920dnC interfaceC1063920dnC = this.LIZIZ;
        abstractC1870770ymZ.getClass();
        AbstractC1064500do8.LJ(interfaceC1063920dnC, str, linkedHashMap);
    }
}
