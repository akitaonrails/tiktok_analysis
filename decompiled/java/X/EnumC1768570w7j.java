package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1768570w7j {
    public static final EnumC1768570w7j HANDLE_RESPONSE;
    public static final /* synthetic */ EnumC1768570w7j[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1768570w7j TRIGGER_REQUEST;
    public static final EnumC1768570w7j UPDATE_FREQUENCY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1768570w7j> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1768570w7j enumC1768570w7j = new EnumC1768570w7j("TRIGGER_REQUEST", 0, "trigger_request");
        TRIGGER_REQUEST = enumC1768570w7j;
        EnumC1768570w7j enumC1768570w7j2 = new EnumC1768570w7j("HANDLE_RESPONSE", 1, "handle_response");
        HANDLE_RESPONSE = enumC1768570w7j2;
        EnumC1768570w7j enumC1768570w7j3 = new EnumC1768570w7j("UPDATE_FREQUENCY", 2, "update_frequency");
        UPDATE_FREQUENCY = enumC1768570w7j3;
        EnumC1768570w7j[] enumC1768570w7jArr = {enumC1768570w7j, enumC1768570w7j2, enumC1768570w7j3};
        LLILLJJLI = enumC1768570w7jArr;
        LLILLL = new C2254308sP(enumC1768570w7jArr);
    }

    public static EnumC1768570w7j[] values() {
        return (EnumC1768570w7j[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1768570w7j valueOf(String str) {
        return (EnumC1768570w7j) C08FF.LIZ(EnumC1768570w7j.class, str);
    }

    public EnumC1768570w7j(String str, int i, String str2) {
        this.LL = str2;
    }
}
