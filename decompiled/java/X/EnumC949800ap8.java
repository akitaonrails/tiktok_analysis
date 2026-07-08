package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ap8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC949800ap8 {
    public static final EnumC949800ap8 GRANTED;
    public static final /* synthetic */ EnumC949800ap8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC949800ap8 REQUESTING;

    public static InterfaceC2044707zh<EnumC949800ap8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC949800ap8 enumC949800ap8 = new EnumC949800ap8("GRANTED", 0);
        GRANTED = enumC949800ap8;
        EnumC949800ap8 enumC949800ap82 = new EnumC949800ap8("REQUESTING", 1);
        REQUESTING = enumC949800ap82;
        EnumC949800ap8[] enumC949800ap8Arr = {enumC949800ap8, enumC949800ap82};
        LL = enumC949800ap8Arr;
        LLILLJJLI = new C2254308sP(enumC949800ap8Arr);
    }

    public static EnumC949800ap8[] values() {
        return (EnumC949800ap8[]) LL.clone();
    }

    public static EnumC949800ap8 valueOf(String str) {
        return (EnumC949800ap8) C08FF.LIZ(EnumC949800ap8.class, str);
    }

    public EnumC949800ap8(String str, int i) {
    }
}
