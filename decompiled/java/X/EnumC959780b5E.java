package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b5E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC959780b5E {
    public static final EnumC959780b5E CO_HOST_FINISHED;
    public static final EnumC959780b5E ENGINE_DID_ENTER_NONE_STATUS;
    public static final /* synthetic */ EnumC959780b5E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public String LL;

    public static InterfaceC2044707zh<EnumC959780b5E> getEntries() {
        return LLILLL;
    }

    static {
        EnumC959780b5E enumC959780b5E = new EnumC959780b5E("ENGINE_DID_ENTER_NONE_STATUS", 0, "engine_did_enter_none_status");
        ENGINE_DID_ENTER_NONE_STATUS = enumC959780b5E;
        EnumC959780b5E enumC959780b5E2 = new EnumC959780b5E("CO_HOST_FINISHED", 1, "co_host_finished");
        CO_HOST_FINISHED = enumC959780b5E2;
        EnumC959780b5E[] enumC959780b5EArr = {enumC959780b5E, enumC959780b5E2};
        LLILLJJLI = enumC959780b5EArr;
        LLILLL = new C2254308sP(enumC959780b5EArr);
    }

    public static EnumC959780b5E[] values() {
        return (EnumC959780b5E[]) LLILLJJLI.clone();
    }

    public final String getSource() {
        return this.LL;
    }

    public static EnumC959780b5E valueOf(String str) {
        return (EnumC959780b5E) C08FF.LIZ(EnumC959780b5E.class, str);
    }

    public final void setSource(String str) {
        this.LL = str;
    }

    public EnumC959780b5E(String str, int i, String str2) {
        this.LL = str2;
    }
}
