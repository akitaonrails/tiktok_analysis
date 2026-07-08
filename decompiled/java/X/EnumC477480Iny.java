package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Iny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC477480Iny {
    public static final EnumC477480Iny DIRECT_ACCEPT_ENTRY;
    public static final EnumC477480Iny INVITE_PANEL_ENTRY;
    public static final /* synthetic */ EnumC477480Iny[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC477480Iny> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC477480Iny enumC477480Iny = new EnumC477480Iny("INVITE_PANEL_ENTRY", 0);
        INVITE_PANEL_ENTRY = enumC477480Iny;
        EnumC477480Iny enumC477480Iny2 = new EnumC477480Iny("DIRECT_ACCEPT_ENTRY", 1);
        DIRECT_ACCEPT_ENTRY = enumC477480Iny2;
        EnumC477480Iny[] enumC477480InyArr = {enumC477480Iny, enumC477480Iny2};
        LL = enumC477480InyArr;
        LLILLJJLI = new C2254308sP(enumC477480InyArr);
    }

    public static EnumC477480Iny[] values() {
        return (EnumC477480Iny[]) LL.clone();
    }

    public static EnumC477480Iny valueOf(String str) {
        return (EnumC477480Iny) C08FF.LIZ(EnumC477480Iny.class, str);
    }

    public EnumC477480Iny(String str, int i) {
    }
}
