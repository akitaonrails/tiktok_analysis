package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153470g7d {
    public static final EnumC1153470g7d BROADCAST;
    public static final /* synthetic */ EnumC1153470g7d[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153470g7d PREVIEW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1153470g7d> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153470g7d enumC1153470g7d = new EnumC1153470g7d("PREVIEW", 0, "live_host_enter_preview");
        PREVIEW = enumC1153470g7d;
        EnumC1153470g7d enumC1153470g7d2 = new EnumC1153470g7d("BROADCAST", 1, "live_host_enter_broadcast");
        BROADCAST = enumC1153470g7d2;
        EnumC1153470g7d[] enumC1153470g7dArr = {enumC1153470g7d, enumC1153470g7d2};
        LLILLJJLI = enumC1153470g7dArr;
        LLILLL = new C2254308sP(enumC1153470g7dArr);
    }

    public static EnumC1153470g7d[] values() {
        return (EnumC1153470g7d[]) LLILLJJLI.clone();
    }

    public final String getSceneName() {
        return this.LL;
    }

    public static EnumC1153470g7d valueOf(String str) {
        return (EnumC1153470g7d) C08FF.LIZ(EnumC1153470g7d.class, str);
    }

    public EnumC1153470g7d(String str, int i, String str2) {
        this.LL = str2;
    }
}
