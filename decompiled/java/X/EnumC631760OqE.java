package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC631760OqE {
    public static final EnumC631760OqE FAIL;
    public static final /* synthetic */ EnumC631760OqE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC631760OqE SUCCESS;

    public static InterfaceC2044707zh<EnumC631760OqE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC631760OqE enumC631760OqE = new EnumC631760OqE("SUCCESS", 0);
        SUCCESS = enumC631760OqE;
        EnumC631760OqE enumC631760OqE2 = new EnumC631760OqE("FAIL", 1);
        FAIL = enumC631760OqE2;
        EnumC631760OqE[] enumC631760OqEArr = {enumC631760OqE, enumC631760OqE2};
        LL = enumC631760OqEArr;
        LLILLJJLI = new C2254308sP(enumC631760OqEArr);
    }

    public static EnumC631760OqE[] values() {
        return (EnumC631760OqE[]) LL.clone();
    }

    public static EnumC631760OqE valueOf(String str) {
        return (EnumC631760OqE) C08FF.LIZ(EnumC631760OqE.class, str);
    }

    public EnumC631760OqE(String str, int i) {
    }
}
