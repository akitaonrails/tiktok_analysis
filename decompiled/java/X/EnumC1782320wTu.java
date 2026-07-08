package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782320wTu {
    public static final EnumC1782320wTu ERROR;
    public static final /* synthetic */ EnumC1782320wTu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782320wTu RUNNING;
    public static final EnumC1782320wTu SUCCESS;
    public static final EnumC1782320wTu UNSCHEDULED;

    public static InterfaceC2044707zh<EnumC1782320wTu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782320wTu enumC1782320wTu = new EnumC1782320wTu("UNSCHEDULED", 0);
        UNSCHEDULED = enumC1782320wTu;
        EnumC1782320wTu enumC1782320wTu2 = new EnumC1782320wTu("RUNNING", 1);
        RUNNING = enumC1782320wTu2;
        EnumC1782320wTu enumC1782320wTu3 = new EnumC1782320wTu("SUCCESS", 2);
        SUCCESS = enumC1782320wTu3;
        EnumC1782320wTu enumC1782320wTu4 = new EnumC1782320wTu("ERROR", 3);
        ERROR = enumC1782320wTu4;
        EnumC1782320wTu[] enumC1782320wTuArr = {enumC1782320wTu, enumC1782320wTu2, enumC1782320wTu3, enumC1782320wTu4};
        LL = enumC1782320wTuArr;
        LLILLJJLI = new C2254308sP(enumC1782320wTuArr);
    }

    public static EnumC1782320wTu[] values() {
        return (EnumC1782320wTu[]) LL.clone();
    }

    public static EnumC1782320wTu valueOf(String str) {
        return (EnumC1782320wTu) C08FF.LIZ(EnumC1782320wTu.class, str);
    }

    public EnumC1782320wTu(String str, int i) {
    }
}
