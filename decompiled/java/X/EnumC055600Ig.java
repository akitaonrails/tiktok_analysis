package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC055600Ig {
    public static final /* synthetic */ EnumC055600Ig[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC055600Ig VOD_PRELOAD;

    public static InterfaceC2044707zh<EnumC055600Ig> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC055600Ig enumC055600Ig = new EnumC055600Ig();
        VOD_PRELOAD = enumC055600Ig;
        EnumC055600Ig[] enumC055600IgArr = {enumC055600Ig};
        LL = enumC055600IgArr;
        LLILLJJLI = new C2254308sP(enumC055600IgArr);
    }

    public static EnumC055600Ig[] values() {
        return (EnumC055600Ig[]) LL.clone();
    }

    public static EnumC055600Ig valueOf(String str) {
        return (EnumC055600Ig) C08FF.LIZ(EnumC055600Ig.class, str);
    }
}
