package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154180g8m {
    public static final EnumC1154180g8m DOWNLOADING;
    public static final /* synthetic */ EnumC1154180g8m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154180g8m PENDING;

    public static InterfaceC2044707zh<EnumC1154180g8m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154180g8m enumC1154180g8m = new EnumC1154180g8m("PENDING", 0);
        PENDING = enumC1154180g8m;
        EnumC1154180g8m enumC1154180g8m2 = new EnumC1154180g8m("DOWNLOADING", 1);
        DOWNLOADING = enumC1154180g8m2;
        EnumC1154180g8m[] enumC1154180g8mArr = {enumC1154180g8m, enumC1154180g8m2};
        LL = enumC1154180g8mArr;
        LLILLJJLI = new C2254308sP(enumC1154180g8mArr);
    }

    public static EnumC1154180g8m[] values() {
        return (EnumC1154180g8m[]) LL.clone();
    }

    public static EnumC1154180g8m valueOf(String str) {
        return (EnumC1154180g8m) C08FF.LIZ(EnumC1154180g8m.class, str);
    }

    public EnumC1154180g8m(String str, int i) {
    }
}
