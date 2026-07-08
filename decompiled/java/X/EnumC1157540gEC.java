package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gEC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1157540gEC implements Serializable {
    public static final /* synthetic */ EnumC1157540gEC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1157540gEC RATING;
    public static final EnumC1157540gEC REASON_FEEDBACK;

    public static InterfaceC2044707zh<EnumC1157540gEC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1157540gEC enumC1157540gEC = new EnumC1157540gEC("RATING", 0);
        RATING = enumC1157540gEC;
        EnumC1157540gEC enumC1157540gEC2 = new EnumC1157540gEC("REASON_FEEDBACK", 1);
        REASON_FEEDBACK = enumC1157540gEC2;
        EnumC1157540gEC[] enumC1157540gECArr = {enumC1157540gEC, enumC1157540gEC2};
        LL = enumC1157540gECArr;
        LLILLJJLI = new C2254308sP(enumC1157540gECArr);
    }

    public static EnumC1157540gEC[] values() {
        return (EnumC1157540gEC[]) LL.clone();
    }

    public static EnumC1157540gEC valueOf(String str) {
        return (EnumC1157540gEC) C08FF.LIZ(EnumC1157540gEC.class, str);
    }

    public EnumC1157540gEC(String str, int i) {
    }
}
