package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC720020SMe {
    public static final EnumC720020SMe DESC;
    public static final /* synthetic */ EnumC720020SMe[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC720020SMe TITLE;
    public final int LL = 1;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC720020SMe> getEntries() {
        return LLILZ;
    }

    static {
        EnumC720020SMe enumC720020SMe = new EnumC720020SMe("TITLE", 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        TITLE = enumC720020SMe;
        EnumC720020SMe enumC720020SMe2 = new EnumC720020SMe("DESC", 1, 0);
        DESC = enumC720020SMe2;
        EnumC720020SMe[] enumC720020SMeArr = {enumC720020SMe, enumC720020SMe2};
        LLILLL = enumC720020SMeArr;
        LLILZ = new C2254308sP(enumC720020SMeArr);
    }

    public static EnumC720020SMe[] values() {
        return (EnumC720020SMe[]) LLILLL.clone();
    }

    public final int getMinLines() {
        return this.LL;
    }

    public final int getPaddingBottom() {
        return this.LLILLJJLI;
    }

    public static EnumC720020SMe valueOf(String str) {
        return (EnumC720020SMe) C08FF.LIZ(EnumC720020SMe.class, str);
    }

    public EnumC720020SMe(String str, int i, int i2) {
        this.LLILLJJLI = i2;
    }
}
