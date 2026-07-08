package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Sff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC727130Sff {
    public static final EnumC727130Sff ALL_VIEWED;
    public static final EnumC727130Sff EMPTY;
    public static final EnumC727130Sff HAS_UNREAD;
    public static final /* synthetic */ EnumC727130Sff[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC727130Sff NULL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC727130Sff> getEntries() {
        return LLILLL;
    }

    static {
        EnumC727130Sff enumC727130Sff = new EnumC727130Sff("NULL", 0, -1);
        NULL = enumC727130Sff;
        EnumC727130Sff enumC727130Sff2 = new EnumC727130Sff("EMPTY", 1, 0);
        EMPTY = enumC727130Sff2;
        EnumC727130Sff enumC727130Sff3 = new EnumC727130Sff("HAS_UNREAD", 2, 1);
        HAS_UNREAD = enumC727130Sff3;
        EnumC727130Sff enumC727130Sff4 = new EnumC727130Sff("ALL_VIEWED", 3, 2);
        ALL_VIEWED = enumC727130Sff4;
        EnumC727130Sff[] enumC727130SffArr = {enumC727130Sff, enumC727130Sff2, enumC727130Sff3, enumC727130Sff4};
        LLILLJJLI = enumC727130SffArr;
        LLILLL = new C2254308sP(enumC727130SffArr);
    }

    public static EnumC727130Sff[] values() {
        return (EnumC727130Sff[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC727130Sff valueOf(String str) {
        return (EnumC727130Sff) C08FF.LIZ(EnumC727130Sff.class, str);
    }

    public EnumC727130Sff(String str, int i, int i2) {
        this.LL = i2;
    }
}
