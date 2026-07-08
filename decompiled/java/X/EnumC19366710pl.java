package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19366710pl {
    public static final /* synthetic */ EnumC19366710pl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19366710pl PHOTO;
    public static final EnumC19366710pl VIDEO;

    public static InterfaceC2044707zh<EnumC19366710pl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19366710pl enumC19366710pl = new EnumC19366710pl("PHOTO", 0);
        PHOTO = enumC19366710pl;
        EnumC19366710pl enumC19366710pl2 = new EnumC19366710pl("VIDEO", 1);
        VIDEO = enumC19366710pl2;
        EnumC19366710pl[] enumC19366710plArr = {enumC19366710pl, enumC19366710pl2};
        LL = enumC19366710plArr;
        LLILLJJLI = new C2254308sP(enumC19366710plArr);
    }

    public static EnumC19366710pl[] values() {
        return (EnumC19366710pl[]) LL.clone();
    }

    public static EnumC19366710pl valueOf(String str) {
        return (EnumC19366710pl) C08FF.LIZ(EnumC19366710pl.class, str);
    }

    public EnumC19366710pl(String str, int i) {
    }
}
