package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC716810S9v {
    public static final EnumC716810S9v LL;
    public static final EnumC716810S9v LLILLJJLI;
    public static final /* synthetic */ EnumC716810S9v[] LLILLL;

    static {
        EnumC716810S9v enumC716810S9v = new EnumC716810S9v("IDLE", 0);
        LL = enumC716810S9v;
        EnumC716810S9v enumC716810S9v2 = new EnumC716810S9v("ACTIVE", 1);
        LLILLJJLI = enumC716810S9v2;
        EnumC716810S9v[] enumC716810S9vArr = {enumC716810S9v, enumC716810S9v2};
        LLILLL = enumC716810S9vArr;
        new C2254308sP(enumC716810S9vArr);
    }

    public static EnumC716810S9v[] values() {
        return (EnumC716810S9v[]) LLILLL.clone();
    }

    public static EnumC716810S9v valueOf(String str) {
        return (EnumC716810S9v) C08FF.LIZ(EnumC716810S9v.class, str);
    }

    public EnumC716810S9v(String str, int i) {
    }
}
