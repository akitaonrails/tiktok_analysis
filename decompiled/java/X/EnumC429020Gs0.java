package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gs0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429020Gs0 {
    public static final EnumC429020Gs0 LEFT;
    public static final /* synthetic */ EnumC429020Gs0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429020Gs0 MID;
    public static final EnumC429020Gs0 RIGHT;

    public static InterfaceC2044707zh<EnumC429020Gs0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429020Gs0 enumC429020Gs0 = new EnumC429020Gs0("LEFT", 0);
        LEFT = enumC429020Gs0;
        EnumC429020Gs0 enumC429020Gs02 = new EnumC429020Gs0("MID", 1);
        MID = enumC429020Gs02;
        EnumC429020Gs0 enumC429020Gs03 = new EnumC429020Gs0("RIGHT", 2);
        RIGHT = enumC429020Gs03;
        EnumC429020Gs0[] enumC429020Gs0Arr = {enumC429020Gs0, enumC429020Gs02, enumC429020Gs03};
        LL = enumC429020Gs0Arr;
        LLILLJJLI = new C2254308sP(enumC429020Gs0Arr);
    }

    public static EnumC429020Gs0[] values() {
        return (EnumC429020Gs0[]) LL.clone();
    }

    public static EnumC429020Gs0 valueOf(String str) {
        return (EnumC429020Gs0) C08FF.LIZ(EnumC429020Gs0.class, str);
    }

    public EnumC429020Gs0(String str, int i) {
    }
}
