package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779600wPW {
    public static final EnumC1779600wPW DRAG;
    public static final EnumC1779600wPW IDLE;
    public static final /* synthetic */ EnumC1779600wPW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779600wPW NONE;
    public static final EnumC1779600wPW SCALE;

    public static InterfaceC2044707zh<EnumC1779600wPW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779600wPW enumC1779600wPW = new EnumC1779600wPW("NONE", 0);
        NONE = enumC1779600wPW;
        EnumC1779600wPW enumC1779600wPW2 = new EnumC1779600wPW("IDLE", 1);
        IDLE = enumC1779600wPW2;
        EnumC1779600wPW enumC1779600wPW3 = new EnumC1779600wPW("DRAG", 2);
        DRAG = enumC1779600wPW3;
        EnumC1779600wPW enumC1779600wPW4 = new EnumC1779600wPW("SCALE", 3);
        SCALE = enumC1779600wPW4;
        EnumC1779600wPW[] enumC1779600wPWArr = {enumC1779600wPW, enumC1779600wPW2, enumC1779600wPW3, enumC1779600wPW4};
        LL = enumC1779600wPWArr;
        LLILLJJLI = new C2254308sP(enumC1779600wPWArr);
    }

    public static EnumC1779600wPW[] values() {
        return (EnumC1779600wPW[]) LL.clone();
    }

    public static EnumC1779600wPW valueOf(String str) {
        return (EnumC1779600wPW) C08FF.LIZ(EnumC1779600wPW.class, str);
    }

    public EnumC1779600wPW(String str, int i) {
    }
}
