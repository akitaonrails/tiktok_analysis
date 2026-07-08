package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153650g7v {
    public static final /* synthetic */ EnumC1153650g7v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153650g7v USER_ADDED;
    public static final EnumC1153650g7v USER_LOADED;
    public static final EnumC1153650g7v USER_REMOVED;
    public static final EnumC1153650g7v USER_SWITCHED;
    public static final EnumC1153650g7v USER_UPDATED;

    public static InterfaceC2044707zh<EnumC1153650g7v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153650g7v enumC1153650g7v = new EnumC1153650g7v("USER_LOADED", 0);
        USER_LOADED = enumC1153650g7v;
        EnumC1153650g7v enumC1153650g7v2 = new EnumC1153650g7v("USER_ADDED", 1);
        USER_ADDED = enumC1153650g7v2;
        EnumC1153650g7v enumC1153650g7v3 = new EnumC1153650g7v("USER_REMOVED", 2);
        USER_REMOVED = enumC1153650g7v3;
        EnumC1153650g7v enumC1153650g7v4 = new EnumC1153650g7v("USER_UPDATED", 3);
        USER_UPDATED = enumC1153650g7v4;
        EnumC1153650g7v enumC1153650g7v5 = new EnumC1153650g7v("USER_SWITCHED", 4);
        USER_SWITCHED = enumC1153650g7v5;
        EnumC1153650g7v[] enumC1153650g7vArr = {enumC1153650g7v, enumC1153650g7v2, enumC1153650g7v3, enumC1153650g7v4, enumC1153650g7v5};
        LL = enumC1153650g7vArr;
        LLILLJJLI = new C2254308sP(enumC1153650g7vArr);
    }

    public static EnumC1153650g7v[] values() {
        return (EnumC1153650g7v[]) LL.clone();
    }

    public static EnumC1153650g7v valueOf(String str) {
        return (EnumC1153650g7v) C08FF.LIZ(EnumC1153650g7v.class, str);
    }

    public EnumC1153650g7v(String str, int i) {
    }
}
