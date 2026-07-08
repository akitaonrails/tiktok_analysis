package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC715150S3l {
    public static final EnumC715150S3l DRAGGING;
    public static final EnumC715150S3l IDLE;
    public static final /* synthetic */ EnumC715150S3l[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC715150S3l SELECTED;

    public static InterfaceC2044707zh<EnumC715150S3l> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC715150S3l enumC715150S3l = new EnumC715150S3l("IDLE", 0);
        IDLE = enumC715150S3l;
        EnumC715150S3l enumC715150S3l2 = new EnumC715150S3l("DRAGGING", 1);
        DRAGGING = enumC715150S3l2;
        EnumC715150S3l enumC715150S3l3 = new EnumC715150S3l("SELECTED", 2);
        SELECTED = enumC715150S3l3;
        EnumC715150S3l[] enumC715150S3lArr = {enumC715150S3l, enumC715150S3l2, enumC715150S3l3};
        LL = enumC715150S3lArr;
        LLILLJJLI = new C2254308sP(enumC715150S3lArr);
    }

    public static EnumC715150S3l[] values() {
        return (EnumC715150S3l[]) LL.clone();
    }

    public static EnumC715150S3l valueOf(String str) {
        return (EnumC715150S3l) C08FF.LIZ(EnumC715150S3l.class, str);
    }

    public EnumC715150S3l(String str, int i) {
    }
}
