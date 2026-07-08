package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gF0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1158040gF0 implements Serializable {
    public static final /* synthetic */ EnumC1158040gF0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1158040gF0 SQUARE;
    public static final EnumC1158040gF0 TEXT;

    public static InterfaceC2044707zh<EnumC1158040gF0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1158040gF0 enumC1158040gF0 = new EnumC1158040gF0("SQUARE", 0);
        SQUARE = enumC1158040gF0;
        EnumC1158040gF0 enumC1158040gF02 = new EnumC1158040gF0("TEXT", 1);
        TEXT = enumC1158040gF02;
        EnumC1158040gF0[] enumC1158040gF0Arr = {enumC1158040gF0, enumC1158040gF02};
        LL = enumC1158040gF0Arr;
        LLILLJJLI = new C2254308sP(enumC1158040gF0Arr);
    }

    public static EnumC1158040gF0[] values() {
        return (EnumC1158040gF0[]) LL.clone();
    }

    public static EnumC1158040gF0 valueOf(String str) {
        return (EnumC1158040gF0) C08FF.LIZ(EnumC1158040gF0.class, str);
    }

    public EnumC1158040gF0(String str, int i) {
    }
}
