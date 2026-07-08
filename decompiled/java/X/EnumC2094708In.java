package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08In, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2094708In {
    public static final EnumC2094708In BACKGROUND;
    public static final /* synthetic */ EnumC2094708In[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2094708In MAIN;

    public static InterfaceC2044707zh<EnumC2094708In> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2094708In enumC2094708In = new EnumC2094708In("MAIN", 0);
        MAIN = enumC2094708In;
        EnumC2094708In enumC2094708In2 = new EnumC2094708In("BACKGROUND", 1);
        BACKGROUND = enumC2094708In2;
        EnumC2094708In[] enumC2094708InArr = {enumC2094708In, enumC2094708In2};
        LL = enumC2094708InArr;
        LLILLJJLI = new C2254308sP(enumC2094708InArr);
    }

    public static EnumC2094708In[] values() {
        return (EnumC2094708In[]) LL.clone();
    }

    public static EnumC2094708In valueOf(String str) {
        return (EnumC2094708In) C08FF.LIZ(EnumC2094708In.class, str);
    }

    public EnumC2094708In(String str, int i) {
    }
}
