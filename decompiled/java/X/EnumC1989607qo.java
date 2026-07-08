package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1989607qo {
    public static final EnumC1989607qo EMOJI;
    public static final EnumC1989607qo IMAGE;
    public static final /* synthetic */ EnumC1989607qo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1989607qo MEME;
    public static final EnumC1989607qo STICKER;
    public static final EnumC1989607qo TEXT;
    public static final EnumC1989607qo UNKNWON;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1989607qo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1989607qo enumC1989607qo = new EnumC1989607qo("UNKNWON", 0, 0);
        UNKNWON = enumC1989607qo;
        EnumC1989607qo enumC1989607qo2 = new EnumC1989607qo("EMOJI", 1, 1);
        EMOJI = enumC1989607qo2;
        EnumC1989607qo enumC1989607qo3 = new EnumC1989607qo("TEXT", 2, 2);
        TEXT = enumC1989607qo3;
        EnumC1989607qo enumC1989607qo4 = new EnumC1989607qo("IMAGE", 3, 3);
        IMAGE = enumC1989607qo4;
        EnumC1989607qo enumC1989607qo5 = new EnumC1989607qo("MEME", 4, 4);
        MEME = enumC1989607qo5;
        EnumC1989607qo enumC1989607qo6 = new EnumC1989607qo("STICKER", 5, 5);
        STICKER = enumC1989607qo6;
        EnumC1989607qo[] enumC1989607qoArr = {enumC1989607qo, enumC1989607qo2, enumC1989607qo3, enumC1989607qo4, enumC1989607qo5, enumC1989607qo6};
        LLILLJJLI = enumC1989607qoArr;
        LLILLL = new C2254308sP(enumC1989607qoArr);
    }

    public static EnumC1989607qo[] values() {
        return (EnumC1989607qo[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1989607qo valueOf(String str) {
        return (EnumC1989607qo) C08FF.LIZ(EnumC1989607qo.class, str);
    }

    public EnumC1989607qo(String str, int i, int i2) {
        this.LL = i2;
    }
}
