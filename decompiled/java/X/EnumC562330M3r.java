package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC562330M3r {
    public static final EnumC562330M3r LIVE_PHOTO;
    public static final /* synthetic */ EnumC562330M3r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC562330M3r PHOTO;
    public static final EnumC562330M3r TEXT;

    public static InterfaceC2044707zh<EnumC562330M3r> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC562330M3r enumC562330M3r = new EnumC562330M3r("TEXT", 0);
        TEXT = enumC562330M3r;
        EnumC562330M3r enumC562330M3r2 = new EnumC562330M3r("PHOTO", 1);
        PHOTO = enumC562330M3r2;
        EnumC562330M3r enumC562330M3r3 = new EnumC562330M3r("LIVE_PHOTO", 2);
        LIVE_PHOTO = enumC562330M3r3;
        EnumC562330M3r[] enumC562330M3rArr = {enumC562330M3r, enumC562330M3r2, enumC562330M3r3};
        LL = enumC562330M3rArr;
        LLILLJJLI = new C2254308sP(enumC562330M3rArr);
    }

    public static EnumC562330M3r[] values() {
        return (EnumC562330M3r[]) LL.clone();
    }

    public static EnumC562330M3r valueOf(String str) {
        return (EnumC562330M3r) C08FF.LIZ(EnumC562330M3r.class, str);
    }

    public EnumC562330M3r(String str, int i) {
    }
}
