package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x00, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1802220x00 {
    public static final EnumC1802220x00 LL;
    public static final EnumC1802220x00 LLILLJJLI;
    public static final EnumC1802220x00 LLILLL;
    public static final /* synthetic */ EnumC1802220x00[] LLILZ;

    static {
        EnumC1802220x00 enumC1802220x00 = new EnumC1802220x00("IDLE", 0);
        LL = enumC1802220x00;
        EnumC1802220x00 enumC1802220x002 = new EnumC1802220x00("EXPANDING", 1);
        LLILLJJLI = enumC1802220x002;
        EnumC1802220x00 enumC1802220x003 = new EnumC1802220x00("COLLAPSING", 2);
        LLILLL = enumC1802220x003;
        EnumC1802220x00[] enumC1802220x00Arr = {enumC1802220x00, enumC1802220x002, enumC1802220x003};
        LLILZ = enumC1802220x00Arr;
        new C2254308sP(enumC1802220x00Arr);
    }

    public static EnumC1802220x00[] values() {
        return (EnumC1802220x00[]) LLILZ.clone();
    }

    public static EnumC1802220x00 valueOf(String str) {
        return (EnumC1802220x00) C08FF.LIZ(EnumC1802220x00.class, str);
    }

    public EnumC1802220x00(String str, int i) {
    }
}
