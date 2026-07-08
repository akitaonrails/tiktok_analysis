package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993880byE {
    public static final EnumC993880byE CLICK_COMMENT_TRANSLATION_TOGGLE;
    public static final /* synthetic */ EnumC993880byE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993880byE SYNCED_FROM_SERVER;
    public static final EnumC993880byE TRIGGER_BY_CLICK_SEE_TRANSLATION_SOMETIMES;

    public static InterfaceC2044707zh<EnumC993880byE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993880byE enumC993880byE = new EnumC993880byE("TRIGGER_BY_CLICK_SEE_TRANSLATION_SOMETIMES", 0);
        TRIGGER_BY_CLICK_SEE_TRANSLATION_SOMETIMES = enumC993880byE;
        EnumC993880byE enumC993880byE2 = new EnumC993880byE("CLICK_COMMENT_TRANSLATION_TOGGLE", 1);
        CLICK_COMMENT_TRANSLATION_TOGGLE = enumC993880byE2;
        EnumC993880byE enumC993880byE3 = new EnumC993880byE("SYNCED_FROM_SERVER", 2);
        SYNCED_FROM_SERVER = enumC993880byE3;
        EnumC993880byE[] enumC993880byEArr = {enumC993880byE, enumC993880byE2, enumC993880byE3};
        LL = enumC993880byEArr;
        LLILLJJLI = new C2254308sP(enumC993880byEArr);
    }

    public static EnumC993880byE[] values() {
        return (EnumC993880byE[]) LL.clone();
    }

    public static EnumC993880byE valueOf(String str) {
        return (EnumC993880byE) C08FF.LIZ(EnumC993880byE.class, str);
    }

    public EnumC993880byE(String str, int i) {
    }
}
