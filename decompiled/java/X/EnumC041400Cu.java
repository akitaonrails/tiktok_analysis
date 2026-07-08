package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC041400Cu {
    public static final /* synthetic */ EnumC041400Cu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC041400Cu SCROLL;
    public static final EnumC041400Cu START;

    public static InterfaceC2044707zh<EnumC041400Cu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC041400Cu enumC041400Cu = new EnumC041400Cu("START", 0);
        START = enumC041400Cu;
        EnumC041400Cu enumC041400Cu2 = new EnumC041400Cu("SCROLL", 1);
        SCROLL = enumC041400Cu2;
        EnumC041400Cu[] enumC041400CuArr = {enumC041400Cu, enumC041400Cu2};
        LL = enumC041400CuArr;
        LLILLJJLI = new C2254308sP(enumC041400CuArr);
    }

    public static EnumC041400Cu[] values() {
        return (EnumC041400Cu[]) LL.clone();
    }

    public static EnumC041400Cu valueOf(String str) {
        return (EnumC041400Cu) C08FF.LIZ(EnumC041400Cu.class, str);
    }

    public EnumC041400Cu(String str, int i) {
    }
}
