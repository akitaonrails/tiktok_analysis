package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783410wVf {
    public static final EnumC1783410wVf HAS_RECENT_GROUP_CHAT;
    public static final /* synthetic */ EnumC1783410wVf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1783410wVf NO_RECENT_GROUP_CHAT;

    public static InterfaceC2044707zh<EnumC1783410wVf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1783410wVf enumC1783410wVf = new EnumC1783410wVf("HAS_RECENT_GROUP_CHAT", 0);
        HAS_RECENT_GROUP_CHAT = enumC1783410wVf;
        EnumC1783410wVf enumC1783410wVf2 = new EnumC1783410wVf("NO_RECENT_GROUP_CHAT", 1);
        NO_RECENT_GROUP_CHAT = enumC1783410wVf2;
        EnumC1783410wVf[] enumC1783410wVfArr = {enumC1783410wVf, enumC1783410wVf2};
        LL = enumC1783410wVfArr;
        LLILLJJLI = new C2254308sP(enumC1783410wVfArr);
    }

    public static EnumC1783410wVf[] values() {
        return (EnumC1783410wVf[]) LL.clone();
    }

    public static EnumC1783410wVf valueOf(String str) {
        return (EnumC1783410wVf) C08FF.LIZ(EnumC1783410wVf.class, str);
    }

    public EnumC1783410wVf(String str, int i) {
    }
}
