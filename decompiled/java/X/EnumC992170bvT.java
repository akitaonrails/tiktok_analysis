package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992170bvT {
    public static final /* synthetic */ EnumC992170bvT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992170bvT PUBLISH_OPTIONS;
    public static final EnumC992170bvT PUBLISH_UI;

    public static InterfaceC2044707zh<EnumC992170bvT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992170bvT enumC992170bvT = new EnumC992170bvT("PUBLISH_UI", 0);
        PUBLISH_UI = enumC992170bvT;
        EnumC992170bvT enumC992170bvT2 = new EnumC992170bvT("PUBLISH_OPTIONS", 1);
        PUBLISH_OPTIONS = enumC992170bvT2;
        EnumC992170bvT[] enumC992170bvTArr = {enumC992170bvT, enumC992170bvT2};
        LL = enumC992170bvTArr;
        LLILLJJLI = new C2254308sP(enumC992170bvTArr);
    }

    public static EnumC992170bvT[] values() {
        return (EnumC992170bvT[]) LL.clone();
    }

    public static EnumC992170bvT valueOf(String str) {
        return (EnumC992170bvT) C08FF.LIZ(EnumC992170bvT.class, str);
    }

    public EnumC992170bvT(String str, int i) {
    }
}
