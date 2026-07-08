package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1380570m1v {
    public static final EnumC1380570m1v HORIZONTAL;
    public static final /* synthetic */ EnumC1380570m1v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1380570m1v VERTICAL;

    public static InterfaceC2044707zh<EnumC1380570m1v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1380570m1v enumC1380570m1v = new EnumC1380570m1v("HORIZONTAL", 0);
        HORIZONTAL = enumC1380570m1v;
        EnumC1380570m1v enumC1380570m1v2 = new EnumC1380570m1v("VERTICAL", 1);
        VERTICAL = enumC1380570m1v2;
        EnumC1380570m1v[] enumC1380570m1vArr = {enumC1380570m1v, enumC1380570m1v2};
        LL = enumC1380570m1vArr;
        LLILLJJLI = new C2254308sP(enumC1380570m1vArr);
    }

    public static EnumC1380570m1v[] values() {
        return (EnumC1380570m1v[]) LL.clone();
    }

    public static EnumC1380570m1v valueOf(String str) {
        return (EnumC1380570m1v) C08FF.LIZ(EnumC1380570m1v.class, str);
    }

    public EnumC1380570m1v(String str, int i) {
    }
}
