package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154660g9Y {
    public static final /* synthetic */ EnumC1154660g9Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154660g9Y LOCAL;
    public static final EnumC1154660g9Y REMOTE;

    public static InterfaceC2044707zh<EnumC1154660g9Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154660g9Y enumC1154660g9Y = new EnumC1154660g9Y("LOCAL", 0);
        LOCAL = enumC1154660g9Y;
        EnumC1154660g9Y enumC1154660g9Y2 = new EnumC1154660g9Y("REMOTE", 1);
        REMOTE = enumC1154660g9Y2;
        EnumC1154660g9Y[] enumC1154660g9YArr = {enumC1154660g9Y, enumC1154660g9Y2};
        LL = enumC1154660g9YArr;
        LLILLJJLI = new C2254308sP(enumC1154660g9YArr);
    }

    public static EnumC1154660g9Y[] values() {
        return (EnumC1154660g9Y[]) LL.clone();
    }

    public static EnumC1154660g9Y valueOf(String str) {
        return (EnumC1154660g9Y) C08FF.LIZ(EnumC1154660g9Y.class, str);
    }

    public EnumC1154660g9Y(String str, int i) {
    }
}
