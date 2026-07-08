package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1204140hRM {
    public static final EnumC1204140hRM EMPTY_DATA;
    public static final /* synthetic */ EnumC1204140hRM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1204140hRM LOC_UNAVAILABLE;
    public static final EnumC1204140hRM MANUAL_CANCEL;
    public static final EnumC1204140hRM NO_NETWORK;
    public static final EnumC1204140hRM OTHER_EXCEPTION;

    public static InterfaceC2044707zh<EnumC1204140hRM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1204140hRM enumC1204140hRM = new EnumC1204140hRM("NO_NETWORK", 0);
        NO_NETWORK = enumC1204140hRM;
        EnumC1204140hRM enumC1204140hRM2 = new EnumC1204140hRM("EMPTY_DATA", 1);
        EMPTY_DATA = enumC1204140hRM2;
        EnumC1204140hRM enumC1204140hRM3 = new EnumC1204140hRM("LOC_UNAVAILABLE", 2);
        LOC_UNAVAILABLE = enumC1204140hRM3;
        EnumC1204140hRM enumC1204140hRM4 = new EnumC1204140hRM("OTHER_EXCEPTION", 3);
        OTHER_EXCEPTION = enumC1204140hRM4;
        EnumC1204140hRM enumC1204140hRM5 = new EnumC1204140hRM("MANUAL_CANCEL", 4);
        MANUAL_CANCEL = enumC1204140hRM5;
        EnumC1204140hRM[] enumC1204140hRMArr = {enumC1204140hRM, enumC1204140hRM2, enumC1204140hRM3, enumC1204140hRM4, enumC1204140hRM5};
        LL = enumC1204140hRMArr;
        LLILLJJLI = new C2254308sP(enumC1204140hRMArr);
    }

    public static EnumC1204140hRM[] values() {
        return (EnumC1204140hRM[]) LL.clone();
    }

    public static EnumC1204140hRM valueOf(String str) {
        return (EnumC1204140hRM) C08FF.LIZ(EnumC1204140hRM.class, str);
    }

    public EnumC1204140hRM(String str, int i) {
    }
}
