package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.065n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC15513065n {
    public static final EnumC15513065n COMPENSATION;
    public static final EnumC15513065n FETCH_REQUEST;
    public static final /* synthetic */ EnumC15513065n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC15513065n ONLINE_PUSH;
    public static final EnumC15513065n SILENT_PUSH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC15513065n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC15513065n enumC15513065n = new EnumC15513065n("FETCH_REQUEST", 0, "fetch_request");
        FETCH_REQUEST = enumC15513065n;
        EnumC15513065n enumC15513065n2 = new EnumC15513065n("COMPENSATION", 1, "activity_status_compensation");
        COMPENSATION = enumC15513065n2;
        EnumC15513065n enumC15513065n3 = new EnumC15513065n("ONLINE_PUSH", 2, "online_push");
        ONLINE_PUSH = enumC15513065n3;
        EnumC15513065n enumC15513065n4 = new EnumC15513065n("SILENT_PUSH", 3, "silent_push");
        SILENT_PUSH = enumC15513065n4;
        EnumC15513065n[] enumC15513065nArr = {enumC15513065n, enumC15513065n2, enumC15513065n3, enumC15513065n4};
        LLILLJJLI = enumC15513065nArr;
        LLILLL = new C2254308sP(enumC15513065nArr);
    }

    public static EnumC15513065n[] values() {
        return (EnumC15513065n[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC15513065n valueOf(String str) {
        return (EnumC15513065n) C08FF.LIZ(EnumC15513065n.class, str);
    }

    public EnumC15513065n(String str, int i, String str2) {
        this.LL = str2;
    }
}
