package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ynF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1871190ynF {
    public final /* synthetic */ AbstractC1871200ynG LIZ;
    public final /* synthetic */ InterfaceC1063920dnC LIZIZ;

    public C1871190ynF(AbstractC1871200ynG abstractC1871200ynG, InterfaceC1063920dnC interfaceC1063920dnC) {
        this.LIZ = abstractC1871200ynG;
        this.LIZIZ = interfaceC1063920dnC;
    }

    public final void LIZ(C1871170ynD c1871170ynD, String str) {
        if (c1871170ynD.LIZ == null) {
            AbstractC1871200ynG abstractC1871200ynG = this.LIZ;
            InterfaceC1063920dnC interfaceC1063920dnC = this.LIZIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            abstractC1871200ynG.getClass();
            AbstractC1064500do8.LIZJ(interfaceC1063920dnC, -5, "", linkedHashMap);
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Map<String, Object> map = c1871170ynD.LIZ;
        if (map != null) {
            linkedHashMap2.put("settings", map);
        }
        AbstractC1871200ynG abstractC1871200ynG2 = this.LIZ;
        InterfaceC1063920dnC interfaceC1063920dnC2 = this.LIZIZ;
        abstractC1871200ynG2.getClass();
        AbstractC1064500do8.LJ(interfaceC1063920dnC2, str, linkedHashMap2);
    }
}
