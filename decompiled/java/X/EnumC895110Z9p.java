package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC895110Z9p {
    public static final /* synthetic */ EnumC895110Z9p[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC895110Z9p NUDGE;
    public final String LL = "nudge";

    public static InterfaceC2044707zh<EnumC895110Z9p> getEntries() {
        return LLILLL;
    }

    static {
        EnumC895110Z9p enumC895110Z9p = new EnumC895110Z9p();
        NUDGE = enumC895110Z9p;
        EnumC895110Z9p[] enumC895110Z9pArr = {enumC895110Z9p};
        LLILLJJLI = enumC895110Z9pArr;
        LLILLL = new C2254308sP(enumC895110Z9pArr);
    }

    public static EnumC895110Z9p[] values() {
        return (EnumC895110Z9p[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC895110Z9p valueOf(String str) {
        return (EnumC895110Z9p) C08FF.LIZ(EnumC895110Z9p.class, str);
    }
}
