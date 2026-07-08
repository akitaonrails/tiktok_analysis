package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778340wNU {
    public static final /* synthetic */ EnumC1778340wNU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778340wNU OPEN_CAMERA;
    public static final EnumC1778340wNU OPEN_MIC;

    public static InterfaceC2044707zh<EnumC1778340wNU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778340wNU enumC1778340wNU = new EnumC1778340wNU("OPEN_CAMERA", 0);
        OPEN_CAMERA = enumC1778340wNU;
        EnumC1778340wNU enumC1778340wNU2 = new EnumC1778340wNU("OPEN_MIC", 1);
        OPEN_MIC = enumC1778340wNU2;
        EnumC1778340wNU[] enumC1778340wNUArr = {enumC1778340wNU, enumC1778340wNU2};
        LL = enumC1778340wNUArr;
        LLILLJJLI = new C2254308sP(enumC1778340wNUArr);
    }

    public static EnumC1778340wNU[] values() {
        return (EnumC1778340wNU[]) LL.clone();
    }

    public static EnumC1778340wNU valueOf(String str) {
        return (EnumC1778340wNU) C08FF.LIZ(EnumC1778340wNU.class, str);
    }

    public EnumC1778340wNU(String str, int i) {
    }
}
