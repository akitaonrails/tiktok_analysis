package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439280HKk {
    public static final EnumC439280HKk GENERATING;
    public static final /* synthetic */ EnumC439280HKk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC439280HKk NOT_IN_WAITING;
    public static final EnumC439280HKk SUCCESS;
    public static final EnumC439280HKk UPLOADING;
    public static final EnumC439280HKk WAIT_QUEUE;

    public static InterfaceC2044707zh<EnumC439280HKk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC439280HKk enumC439280HKk = new EnumC439280HKk("NOT_IN_WAITING", 0);
        NOT_IN_WAITING = enumC439280HKk;
        EnumC439280HKk enumC439280HKk2 = new EnumC439280HKk("UPLOADING", 1);
        UPLOADING = enumC439280HKk2;
        EnumC439280HKk enumC439280HKk3 = new EnumC439280HKk("WAIT_QUEUE", 2);
        WAIT_QUEUE = enumC439280HKk3;
        EnumC439280HKk enumC439280HKk4 = new EnumC439280HKk("SUCCESS", 3);
        SUCCESS = enumC439280HKk4;
        EnumC439280HKk enumC439280HKk5 = new EnumC439280HKk("GENERATING", 4);
        GENERATING = enumC439280HKk5;
        EnumC439280HKk[] enumC439280HKkArr = {enumC439280HKk, enumC439280HKk2, enumC439280HKk3, enumC439280HKk4, enumC439280HKk5};
        LL = enumC439280HKkArr;
        LLILLJJLI = new C2254308sP(enumC439280HKkArr);
    }

    public static EnumC439280HKk[] values() {
        return (EnumC439280HKk[]) LL.clone();
    }

    public static EnumC439280HKk valueOf(String str) {
        return (EnumC439280HKk) C08FF.LIZ(EnumC439280HKk.class, str);
    }

    public EnumC439280HKk(String str, int i) {
    }
}
