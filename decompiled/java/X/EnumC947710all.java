package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0all, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC947710all {
    public static final EnumC947710all LL;
    public static final EnumC947710all LLILLJJLI;
    public static final EnumC947710all LLILLL;
    public static final /* synthetic */ EnumC947710all[] LLILZ;

    static {
        EnumC947710all enumC947710all = new EnumC947710all("LIVE_SHOW", 0);
        LL = enumC947710all;
        EnumC947710all enumC947710all2 = new EnumC947710all("MODERATOR", 1);
        LLILLJJLI = enumC947710all2;
        EnumC947710all enumC947710all3 = new EnumC947710all("STATUS", 2);
        LLILLL = enumC947710all3;
        EnumC947710all[] enumC947710allArr = {enumC947710all, enumC947710all2, enumC947710all3};
        LLILZ = enumC947710allArr;
        new C2254308sP(enumC947710allArr);
    }

    public static EnumC947710all[] values() {
        return (EnumC947710all[]) LLILZ.clone();
    }

    public static EnumC947710all valueOf(String str) {
        return (EnumC947710all) C08FF.LIZ(EnumC947710all.class, str);
    }

    public EnumC947710all(String str, int i) {
    }
}
