package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Inh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC477310Inh {
    public static final EnumC477310Inh COUNTDOWN;
    public static final EnumC477310Inh GUIDE;
    public static final /* synthetic */ EnumC477310Inh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC477310Inh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC477310Inh enumC477310Inh = new EnumC477310Inh("GUIDE", 0);
        GUIDE = enumC477310Inh;
        EnumC477310Inh enumC477310Inh2 = new EnumC477310Inh("COUNTDOWN", 1);
        COUNTDOWN = enumC477310Inh2;
        EnumC477310Inh[] enumC477310InhArr = {enumC477310Inh, enumC477310Inh2};
        LL = enumC477310InhArr;
        LLILLJJLI = new C2254308sP(enumC477310InhArr);
    }

    public static EnumC477310Inh[] values() {
        return (EnumC477310Inh[]) LL.clone();
    }

    public static EnumC477310Inh valueOf(String str) {
        return (EnumC477310Inh) C08FF.LIZ(EnumC477310Inh.class, str);
    }

    public EnumC477310Inh(String str, int i) {
    }
}
