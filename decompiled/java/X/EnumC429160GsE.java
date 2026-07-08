package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429160GsE {
    public static final EnumC429160GsE ALL_EMOJIS;
    public static final /* synthetic */ EnumC429160GsE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429160GsE RECENT;

    public static InterfaceC2044707zh<EnumC429160GsE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429160GsE enumC429160GsE = new EnumC429160GsE("RECENT", 0);
        RECENT = enumC429160GsE;
        EnumC429160GsE enumC429160GsE2 = new EnumC429160GsE("ALL_EMOJIS", 1);
        ALL_EMOJIS = enumC429160GsE2;
        EnumC429160GsE[] enumC429160GsEArr = {enumC429160GsE, enumC429160GsE2};
        LL = enumC429160GsEArr;
        LLILLJJLI = new C2254308sP(enumC429160GsEArr);
    }

    public static EnumC429160GsE[] values() {
        return (EnumC429160GsE[]) LL.clone();
    }

    public static EnumC429160GsE valueOf(String str) {
        return (EnumC429160GsE) C08FF.LIZ(EnumC429160GsE.class, str);
    }

    public EnumC429160GsE(String str, int i) {
    }
}
