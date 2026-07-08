package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1087340eOy {
    public static final EnumC1087340eOy DRAGGING;
    public static final EnumC1087340eOy IDLE;
    public static final /* synthetic */ EnumC1087340eOy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1087340eOy SETTLING;

    public static InterfaceC2044707zh<EnumC1087340eOy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1087340eOy enumC1087340eOy = new EnumC1087340eOy("IDLE", 0);
        IDLE = enumC1087340eOy;
        EnumC1087340eOy enumC1087340eOy2 = new EnumC1087340eOy("DRAGGING", 1);
        DRAGGING = enumC1087340eOy2;
        EnumC1087340eOy enumC1087340eOy3 = new EnumC1087340eOy("SETTLING", 2);
        SETTLING = enumC1087340eOy3;
        EnumC1087340eOy[] enumC1087340eOyArr = {enumC1087340eOy, enumC1087340eOy2, enumC1087340eOy3};
        LL = enumC1087340eOyArr;
        LLILLJJLI = new C2254308sP(enumC1087340eOyArr);
    }

    public static EnumC1087340eOy[] values() {
        return (EnumC1087340eOy[]) LL.clone();
    }

    public static EnumC1087340eOy valueOf(String str) {
        return (EnumC1087340eOy) C08FF.LIZ(EnumC1087340eOy.class, str);
    }

    public EnumC1087340eOy(String str, int i) {
    }
}
