package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0W2U, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W2U {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZLLL;
    public final C12849051b LIZ;
    public final C12849051b LIZIZ;
    public final C12849051b LIZJ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C0W2U.class, "storageInfoVersion", "getStorageInfoVersion()J", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(C0W2U.class, "fullUpdateTimestamp", "getFullUpdateTimestamp()J", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR3 = new C2217371BqR(C0W2U.class, "pushUpdateTimestamp", "getPushUpdateTimestamp()J", 0);
        c09r3.getClass();
        LIZLLL = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2, c2217371BqR3};
    }

    public final long LIZ() {
        C12849051b c12849051b = this.LIZIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZLLL;
        return ((Number) c12849051b.LIZ()).longValue();
    }

    public final long LIZIZ() {
        C12849051b c12849051b = this.LIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZLLL;
        return ((Number) c12849051b.LIZ()).longValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StorageStatus(infoVersion: ");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(",fullUpdateTimestamp: ");
        sbLIZ.append(LIZ());
        sbLIZ.append(",pushUpdateTimestamp: ");
        C12849051b c12849051b = this.LIZJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZLLL;
        sbLIZ.append(((Number) c12849051b.LIZ()).longValue());
        sbLIZ.append(",)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0W2U(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("relation_storage_status_");
        sbLIZ.append(str);
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = new C12849051b(repo, 0L, "storage_info_version");
        this.LIZIZ = new C12849051b(repo, -1L, "full_update_timestamp");
        this.LIZJ = new C12849051b(repo, -1L, "push_update_timestamp");
    }
}
