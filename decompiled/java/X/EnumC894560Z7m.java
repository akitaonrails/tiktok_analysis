package X;

import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC894560Z7m {
    public static final EnumC894560Z7m BLOCK;
    public static final C894570Z7n Companion;
    public static final /* synthetic */ EnumC894560Z7m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC894560Z7m REPORT;
    public static final EnumC894560Z7m SETTING_PAGE;
    public static final C01GW<Map<Integer, EnumC894560Z7m>> map$delegate;

    public static InterfaceC2044707zh<EnumC894560Z7m> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Z7n] */
    static {
        EnumC894560Z7m enumC894560Z7m = new EnumC894560Z7m("BLOCK", 0);
        BLOCK = enumC894560Z7m;
        EnumC894560Z7m enumC894560Z7m2 = new EnumC894560Z7m("REPORT", 1);
        REPORT = enumC894560Z7m2;
        EnumC894560Z7m enumC894560Z7m3 = new EnumC894560Z7m("SETTING_PAGE", 2);
        SETTING_PAGE = enumC894560Z7m3;
        EnumC894560Z7m[] enumC894560Z7mArr = {enumC894560Z7m, enumC894560Z7m2, enumC894560Z7m3};
        LL = enumC894560Z7mArr;
        LLILLJJLI = new C2254308sP(enumC894560Z7mArr);
        Companion = new Object() { // from class: X.0Z7n
        };
        map$delegate = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(591));
    }

    public static EnumC894560Z7m[] values() {
        return (EnumC894560Z7m[]) LL.clone();
    }

    public static EnumC894560Z7m valueOf(String str) {
        return (EnumC894560Z7m) C08FF.LIZ(EnumC894560Z7m.class, str);
    }

    public EnumC894560Z7m(String str, int i) {
    }
}
