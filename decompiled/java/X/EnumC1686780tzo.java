package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1686780tzo {
    public static final EnumC1686780tzo Inherit;
    public static final /* synthetic */ EnumC1686780tzo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1686780tzo SecureOff;
    public static final EnumC1686780tzo SecureOn;

    public static InterfaceC2044707zh<EnumC1686780tzo> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1686780tzo valueOf(String str) {
        return (EnumC1686780tzo) C08FF.LIZ(EnumC1686780tzo.class, str);
    }

    public static EnumC1686780tzo[] values() {
        return (EnumC1686780tzo[]) LL.clone();
    }

    static {
        EnumC1686780tzo enumC1686780tzo = new EnumC1686780tzo("Inherit", 0);
        Inherit = enumC1686780tzo;
        EnumC1686780tzo enumC1686780tzo2 = new EnumC1686780tzo("SecureOn", 1);
        SecureOn = enumC1686780tzo2;
        EnumC1686780tzo enumC1686780tzo3 = new EnumC1686780tzo("SecureOff", 2);
        SecureOff = enumC1686780tzo3;
        EnumC1686780tzo[] enumC1686780tzoArr = {enumC1686780tzo, enumC1686780tzo2, enumC1686780tzo3};
        LL = enumC1686780tzoArr;
        LLILLJJLI = new C2254308sP(enumC1686780tzoArr);
    }

    public EnumC1686780tzo(String str, int i) {
    }
}
