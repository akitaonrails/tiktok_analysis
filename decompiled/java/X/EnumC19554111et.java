package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19554111et {
    public static final EnumC19554111et COLLECT;
    public static final EnumC19554111et DOWNLOAD;
    public static final /* synthetic */ EnumC19554111et[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19554111et PREVIEW;
    public static final EnumC19554111et SELECT;

    public static InterfaceC2044707zh<EnumC19554111et> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19554111et enumC19554111et = new EnumC19554111et("SELECT", 0);
        SELECT = enumC19554111et;
        EnumC19554111et enumC19554111et2 = new EnumC19554111et("PREVIEW", 1);
        PREVIEW = enumC19554111et2;
        EnumC19554111et enumC19554111et3 = new EnumC19554111et("DOWNLOAD", 2);
        DOWNLOAD = enumC19554111et3;
        EnumC19554111et enumC19554111et4 = new EnumC19554111et("COLLECT", 3);
        COLLECT = enumC19554111et4;
        EnumC19554111et[] enumC19554111etArr = {enumC19554111et, enumC19554111et2, enumC19554111et3, enumC19554111et4};
        LL = enumC19554111etArr;
        LLILLJJLI = new C2254308sP(enumC19554111etArr);
    }

    public static EnumC19554111et[] values() {
        return (EnumC19554111et[]) LL.clone();
    }

    public static EnumC19554111et valueOf(String str) {
        return (EnumC19554111et) C08FF.LIZ(EnumC19554111et.class, str);
    }

    public EnumC19554111et(String str, int i) {
    }
}
