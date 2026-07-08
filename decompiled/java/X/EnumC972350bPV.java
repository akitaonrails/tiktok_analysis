package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC972350bPV {
    public static final EnumC972350bPV CHOOSE;
    public static final EnumC972350bPV LEAVE;
    public static final /* synthetic */ EnumC972350bPV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC972350bPV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC972350bPV enumC972350bPV = new EnumC972350bPV("CHOOSE", 0, "choose");
        CHOOSE = enumC972350bPV;
        EnumC972350bPV enumC972350bPV2 = new EnumC972350bPV("LEAVE", 1, "leave");
        LEAVE = enumC972350bPV2;
        EnumC972350bPV[] enumC972350bPVArr = {enumC972350bPV, enumC972350bPV2};
        LLILLJJLI = enumC972350bPVArr;
        LLILLL = new C2254308sP(enumC972350bPVArr);
    }

    public static EnumC972350bPV[] values() {
        return (EnumC972350bPV[]) LLILLJJLI.clone();
    }

    public final String getDisplayName() {
        return this.LL;
    }

    public static EnumC972350bPV valueOf(String str) {
        return (EnumC972350bPV) C08FF.LIZ(EnumC972350bPV.class, str);
    }

    public EnumC972350bPV(String str, int i, String str2) {
        this.LL = str2;
    }
}
