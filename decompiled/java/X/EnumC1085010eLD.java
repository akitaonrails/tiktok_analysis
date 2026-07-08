package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eLD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1085010eLD {
    public static final EnumC1085010eLD LEFT;
    public static final /* synthetic */ EnumC1085010eLD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1085010eLD RIGHT;

    public static InterfaceC2044707zh<EnumC1085010eLD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1085010eLD enumC1085010eLD = new EnumC1085010eLD("LEFT", 0);
        LEFT = enumC1085010eLD;
        EnumC1085010eLD enumC1085010eLD2 = new EnumC1085010eLD("RIGHT", 1);
        RIGHT = enumC1085010eLD2;
        EnumC1085010eLD[] enumC1085010eLDArr = {enumC1085010eLD, enumC1085010eLD2};
        LL = enumC1085010eLDArr;
        LLILLJJLI = new C2254308sP(enumC1085010eLDArr);
    }

    public static EnumC1085010eLD[] values() {
        return (EnumC1085010eLD[]) LL.clone();
    }

    public static EnumC1085010eLD valueOf(String str) {
        return (EnumC1085010eLD) C08FF.LIZ(EnumC1085010eLD.class, str);
    }

    public EnumC1085010eLD(String str, int i) {
    }
}
