package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1994207rY {
    public static final EnumC1994207rY EMOJI;
    public static final /* synthetic */ EnumC1994207rY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1994207rY NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1994207rY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1994207rY enumC1994207rY = new EnumC1994207rY("NORMAL", 0, 0);
        NORMAL = enumC1994207rY;
        EnumC1994207rY enumC1994207rY2 = new EnumC1994207rY("EMOJI", 1, 1);
        EMOJI = enumC1994207rY2;
        EnumC1994207rY[] enumC1994207rYArr = {enumC1994207rY, enumC1994207rY2};
        LLILLJJLI = enumC1994207rYArr;
        LLILLL = new C2254308sP(enumC1994207rYArr);
    }

    public static EnumC1994207rY[] values() {
        return (EnumC1994207rY[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1994207rY valueOf(String str) {
        return (EnumC1994207rY) C08FF.LIZ(EnumC1994207rY.class, str);
    }

    public EnumC1994207rY(String str, int i, int i2) {
        this.LL = i2;
    }
}
