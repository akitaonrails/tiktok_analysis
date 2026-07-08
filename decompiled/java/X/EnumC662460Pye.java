package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC662460Pye {
    public static final EnumC662460Pye EXTRA_STATUS_NONE;
    public static final EnumC662460Pye EXTRA_STATUS_PARENT_BLOCKED;
    public static final EnumC662460Pye EXTRA_STATUS_PARENT_UNBLOCK_REQUESTING;
    public static final /* synthetic */ EnumC662460Pye[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC662460Pye> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC662460Pye enumC662460Pye = new EnumC662460Pye("EXTRA_STATUS_NONE", 0);
        EXTRA_STATUS_NONE = enumC662460Pye;
        EnumC662460Pye enumC662460Pye2 = new EnumC662460Pye("EXTRA_STATUS_PARENT_BLOCKED", 1);
        EXTRA_STATUS_PARENT_BLOCKED = enumC662460Pye2;
        EnumC662460Pye enumC662460Pye3 = new EnumC662460Pye("EXTRA_STATUS_PARENT_UNBLOCK_REQUESTING", 2);
        EXTRA_STATUS_PARENT_UNBLOCK_REQUESTING = enumC662460Pye3;
        EnumC662460Pye[] enumC662460PyeArr = {enumC662460Pye, enumC662460Pye2, enumC662460Pye3};
        LL = enumC662460PyeArr;
        LLILLJJLI = new C2254308sP(enumC662460PyeArr);
    }

    public static EnumC662460Pye[] values() {
        return (EnumC662460Pye[]) LL.clone();
    }

    public static EnumC662460Pye valueOf(String str) {
        return (EnumC662460Pye) C08FF.LIZ(EnumC662460Pye.class, str);
    }

    public EnumC662460Pye(String str, int i) {
    }
}
