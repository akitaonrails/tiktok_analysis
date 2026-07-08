package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0W8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC818510W8z {
    public static final C0W90 Companion;
    public static final EnumC818510W8z HOMEPAGE_FOLLOW;
    public static final /* synthetic */ EnumC818510W8z[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC818510W8z MY_PROFILE;
    public final String LL;
    public final EnumC805430Vif LLILLJJLI;
    public final EnumC804170Vgd LLILLL;
    public final Function0<Boolean> LLILZ;
    public final Function0<Long> LLILZIL;

    public static InterfaceC2044707zh<EnumC818510W8z> getEntries() {
        return LLIZ;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0W90] */
    static {
        EnumC818510W8z enumC818510W8z = new EnumC818510W8z("HOMEPAGE_FOLLOW", 0, "homepage_follow", EnumC805430Vif.FOLLOW, EnumC804170Vgd.FOLLOW_PAGE_LOAD_TIME, AFwS200S0000000_13.get$arr$(284), AFwS200S0000000_13.get$arr$(285));
        HOMEPAGE_FOLLOW = enumC818510W8z;
        EnumC818510W8z enumC818510W8z2 = new EnumC818510W8z("MY_PROFILE", 1, "my_profile", EnumC805430Vif.PROFILE_HOME, EnumC804170Vgd.PROFILE_SELF_PAGE_LOAD_TIME, AFwS200S0000000_13.get$arr$(286), AFwS200S0000000_13.get$arr$(287));
        MY_PROFILE = enumC818510W8z2;
        EnumC818510W8z[] enumC818510W8zArr = {enumC818510W8z, enumC818510W8z2};
        LLILZLL = enumC818510W8zArr;
        LLIZ = new C2254308sP(enumC818510W8zArr);
        Companion = new Object() { // from class: X.0W90
        };
    }

    public static EnumC818510W8z[] values() {
        return (EnumC818510W8z[]) LLILZLL.clone();
    }

    public final boolean isEnabled() {
        return this.LLILZ.invoke().booleanValue();
    }

    public final long threshold() {
        return this.LLILZIL.invoke().longValue();
    }

    public final EnumC804170Vgd getExceptionType() {
        return this.LLILLL;
    }

    public final EnumC805430Vif getScene() {
        return this.LLILLJJLI;
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC818510W8z valueOf(String str) {
        return (EnumC818510W8z) C08FF.LIZ(EnumC818510W8z.class, str);
    }

    public EnumC818510W8z(String str, int i, String str2, EnumC805430Vif enumC805430Vif, EnumC804170Vgd enumC804170Vgd, Function0 function0, Function0 function02) {
        this.LL = str2;
        this.LLILLJJLI = enumC805430Vif;
        this.LLILLL = enumC804170Vgd;
        this.LLILZ = function0;
        this.LLILZIL = function02;
    }
}
