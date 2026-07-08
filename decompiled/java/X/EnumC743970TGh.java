package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC743970TGh {
    public static final EnumC743970TGh BNPL;
    public static final EnumC743970TGh FOUNDATION;
    public static final /* synthetic */ EnumC743970TGh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC743970TGh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC743970TGh enumC743970TGh = new EnumC743970TGh("BNPL", 0);
        BNPL = enumC743970TGh;
        EnumC743970TGh enumC743970TGh2 = new EnumC743970TGh("FOUNDATION", 1);
        FOUNDATION = enumC743970TGh2;
        EnumC743970TGh[] enumC743970TGhArr = {enumC743970TGh, enumC743970TGh2};
        LL = enumC743970TGhArr;
        LLILLJJLI = new C2254308sP(enumC743970TGhArr);
    }

    public static EnumC743970TGh[] values() {
        return (EnumC743970TGh[]) LL.clone();
    }

    public static EnumC743970TGh valueOf(String str) {
        return (EnumC743970TGh) C08FF.LIZ(EnumC743970TGh.class, str);
    }

    public EnumC743970TGh(String str, int i) {
    }
}
