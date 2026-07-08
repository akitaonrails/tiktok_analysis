package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1284920jXe {
    public static final EnumC1284920jXe CONTINUOUS;
    public static final /* synthetic */ EnumC1284920jXe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1284920jXe WHEN_DIRTY;

    public static InterfaceC2044707zh<EnumC1284920jXe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1284920jXe enumC1284920jXe = new EnumC1284920jXe("CONTINUOUS", 0);
        CONTINUOUS = enumC1284920jXe;
        EnumC1284920jXe enumC1284920jXe2 = new EnumC1284920jXe("WHEN_DIRTY", 1);
        WHEN_DIRTY = enumC1284920jXe2;
        EnumC1284920jXe[] enumC1284920jXeArr = {enumC1284920jXe, enumC1284920jXe2};
        LL = enumC1284920jXeArr;
        LLILLJJLI = new C2254308sP(enumC1284920jXeArr);
    }

    public static EnumC1284920jXe[] values() {
        return (EnumC1284920jXe[]) LL.clone();
    }

    public static EnumC1284920jXe valueOf(String str) {
        return (EnumC1284920jXe) C08FF.LIZ(EnumC1284920jXe.class, str);
    }

    public EnumC1284920jXe(String str, int i) {
    }
}
