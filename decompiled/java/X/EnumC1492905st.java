package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05st, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1492905st {
    public static final /* synthetic */ EnumC1492905st[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1492905st SLARDAR;
    public static final EnumC1492905st TEA;

    public static InterfaceC2044707zh<EnumC1492905st> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1492905st enumC1492905st = new EnumC1492905st("TEA", 0);
        TEA = enumC1492905st;
        EnumC1492905st enumC1492905st2 = new EnumC1492905st("SLARDAR", 1);
        SLARDAR = enumC1492905st2;
        EnumC1492905st[] enumC1492905stArr = {enumC1492905st, enumC1492905st2};
        LL = enumC1492905stArr;
        LLILLJJLI = new C2254308sP(enumC1492905stArr);
    }

    public static EnumC1492905st[] values() {
        return (EnumC1492905st[]) LL.clone();
    }

    public static EnumC1492905st valueOf(String str) {
        return (EnumC1492905st) C08FF.LIZ(EnumC1492905st.class, str);
    }

    public EnumC1492905st(String str, int i) {
    }
}
