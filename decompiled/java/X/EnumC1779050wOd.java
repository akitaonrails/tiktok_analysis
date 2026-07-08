package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779050wOd {
    public static final EnumC1779050wOd EDIT;
    public static final /* synthetic */ EnumC1779050wOd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779050wOd NEW;

    public static InterfaceC2044707zh<EnumC1779050wOd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779050wOd enumC1779050wOd = new EnumC1779050wOd("NEW", 0);
        NEW = enumC1779050wOd;
        EnumC1779050wOd enumC1779050wOd2 = new EnumC1779050wOd("EDIT", 1);
        EDIT = enumC1779050wOd2;
        EnumC1779050wOd[] enumC1779050wOdArr = {enumC1779050wOd, enumC1779050wOd2};
        LL = enumC1779050wOdArr;
        LLILLJJLI = new C2254308sP(enumC1779050wOdArr);
    }

    public static EnumC1779050wOd[] values() {
        return (EnumC1779050wOd[]) LL.clone();
    }

    public static EnumC1779050wOd valueOf(String str) {
        return (EnumC1779050wOd) C08FF.LIZ(EnumC1779050wOd.class, str);
    }

    public EnumC1779050wOd(String str, int i) {
    }
}
