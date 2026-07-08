package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429580Gsu {
    public static final EnumC429580Gsu LEFT;
    public static final /* synthetic */ EnumC429580Gsu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429580Gsu RIGHT;

    public static InterfaceC2044707zh<EnumC429580Gsu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429580Gsu enumC429580Gsu = new EnumC429580Gsu("LEFT", 0);
        LEFT = enumC429580Gsu;
        EnumC429580Gsu enumC429580Gsu2 = new EnumC429580Gsu("RIGHT", 1);
        RIGHT = enumC429580Gsu2;
        EnumC429580Gsu[] enumC429580GsuArr = {enumC429580Gsu, enumC429580Gsu2};
        LL = enumC429580GsuArr;
        LLILLJJLI = new C2254308sP(enumC429580GsuArr);
    }

    public static EnumC429580Gsu[] values() {
        return (EnumC429580Gsu[]) LL.clone();
    }

    public static EnumC429580Gsu valueOf(String str) {
        return (EnumC429580Gsu) C08FF.LIZ(EnumC429580Gsu.class, str);
    }

    public EnumC429580Gsu(String str, int i) {
    }
}
