package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iiz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1253510iiz {
    public static final /* synthetic */ EnumC1253510iiz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1253510iiz ON_RESUME;
    public static final EnumC1253510iiz ON_UPDATE_EVENT;
    public static final EnumC1253510iiz TAB_CHANGE;

    public static InterfaceC2044707zh<EnumC1253510iiz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1253510iiz enumC1253510iiz = new EnumC1253510iiz("ON_RESUME", 0);
        ON_RESUME = enumC1253510iiz;
        EnumC1253510iiz enumC1253510iiz2 = new EnumC1253510iiz("TAB_CHANGE", 1);
        TAB_CHANGE = enumC1253510iiz2;
        EnumC1253510iiz enumC1253510iiz3 = new EnumC1253510iiz("ON_UPDATE_EVENT", 2);
        ON_UPDATE_EVENT = enumC1253510iiz3;
        EnumC1253510iiz[] enumC1253510iizArr = {enumC1253510iiz, enumC1253510iiz2, enumC1253510iiz3};
        LL = enumC1253510iizArr;
        LLILLJJLI = new C2254308sP(enumC1253510iizArr);
    }

    public static EnumC1253510iiz[] values() {
        return (EnumC1253510iiz[]) LL.clone();
    }

    public static EnumC1253510iiz valueOf(String str) {
        return (EnumC1253510iiz) C08FF.LIZ(EnumC1253510iiz.class, str);
    }

    public EnumC1253510iiz(String str, int i) {
    }
}
