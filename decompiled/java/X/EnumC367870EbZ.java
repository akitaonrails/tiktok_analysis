package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC367870EbZ {
    public static final EnumC367870EbZ LL;
    public static final EnumC367870EbZ LLILLJJLI;
    public static final /* synthetic */ EnumC367870EbZ[] LLILLL;

    static {
        EnumC367870EbZ enumC367870EbZ = new EnumC367870EbZ("LEFT", 0);
        LL = enumC367870EbZ;
        EnumC367870EbZ enumC367870EbZ2 = new EnumC367870EbZ("RIGHT", 1);
        LLILLJJLI = enumC367870EbZ2;
        EnumC367870EbZ[] enumC367870EbZArr = {enumC367870EbZ, enumC367870EbZ2};
        LLILLL = enumC367870EbZArr;
        new C2254308sP(enumC367870EbZArr);
    }

    public static EnumC367870EbZ[] values() {
        return (EnumC367870EbZ[]) LLILLL.clone();
    }

    public static EnumC367870EbZ valueOf(String str) {
        return (EnumC367870EbZ) C08FF.LIZ(EnumC367870EbZ.class, str);
    }

    public EnumC367870EbZ(String str, int i) {
    }
}
