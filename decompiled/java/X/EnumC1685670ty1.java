package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ty1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1685670ty1 {
    public static final EnumC1685670ty1 Attached;
    public static final EnumC1685670ty1 Blocking;
    public static final EnumC1685670ty1 Contrast;
    public static final EnumC1685670ty1 Floating;
    public static final EnumC1685670ty1 GlobalNotice;
    public static final /* synthetic */ EnumC1685670ty1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1685670ty1 Subtle;

    public static InterfaceC2044707zh<EnumC1685670ty1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1685670ty1 enumC1685670ty1 = new EnumC1685670ty1("Blocking", 0);
        Blocking = enumC1685670ty1;
        EnumC1685670ty1 enumC1685670ty12 = new EnumC1685670ty1("GlobalNotice", 1);
        GlobalNotice = enumC1685670ty12;
        EnumC1685670ty1 enumC1685670ty13 = new EnumC1685670ty1("Floating", 2);
        Floating = enumC1685670ty13;
        EnumC1685670ty1 enumC1685670ty14 = new EnumC1685670ty1("Attached", 3);
        Attached = enumC1685670ty14;
        EnumC1685670ty1 enumC1685670ty15 = new EnumC1685670ty1("Subtle", 4);
        Subtle = enumC1685670ty15;
        EnumC1685670ty1 enumC1685670ty16 = new EnumC1685670ty1("Contrast", 5);
        Contrast = enumC1685670ty16;
        EnumC1685670ty1[] enumC1685670ty1Arr = {enumC1685670ty1, enumC1685670ty12, enumC1685670ty13, enumC1685670ty14, enumC1685670ty15, enumC1685670ty16};
        LL = enumC1685670ty1Arr;
        LLILLJJLI = new C2254308sP(enumC1685670ty1Arr);
    }

    public static EnumC1685670ty1[] values() {
        return (EnumC1685670ty1[]) LL.clone();
    }

    public static EnumC1685670ty1 valueOf(String str) {
        return (EnumC1685670ty1) C08FF.LIZ(EnumC1685670ty1.class, str);
    }

    public EnumC1685670ty1(String str, int i) {
    }
}
