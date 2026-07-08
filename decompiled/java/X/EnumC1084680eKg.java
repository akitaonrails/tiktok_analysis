package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1084680eKg {
    public static final EnumC1084680eKg LEFT;
    public static final /* synthetic */ EnumC1084680eKg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1084680eKg RIGHT;

    public static InterfaceC2044707zh<EnumC1084680eKg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1084680eKg enumC1084680eKg = new EnumC1084680eKg("LEFT", 0);
        LEFT = enumC1084680eKg;
        EnumC1084680eKg enumC1084680eKg2 = new EnumC1084680eKg("RIGHT", 1);
        RIGHT = enumC1084680eKg2;
        EnumC1084680eKg[] enumC1084680eKgArr = {enumC1084680eKg, enumC1084680eKg2};
        LL = enumC1084680eKgArr;
        LLILLJJLI = new C2254308sP(enumC1084680eKgArr);
    }

    public static EnumC1084680eKg[] values() {
        return (EnumC1084680eKg[]) LL.clone();
    }

    public static EnumC1084680eKg valueOf(String str) {
        return (EnumC1084680eKg) C08FF.LIZ(EnumC1084680eKg.class, str);
    }

    public EnumC1084680eKg(String str, int i) {
    }
}
