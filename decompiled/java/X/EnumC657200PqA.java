package X;

import android.util.Size;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC657200PqA {
    public static final EnumC657200PqA AUTO;
    public static final /* synthetic */ EnumC657200PqA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC657200PqA SQUARE;
    public static final EnumC657200PqA TALL;
    public static final EnumC657200PqA THREE_TO_FOUR;
    public static final EnumC657200PqA WIDE;
    public final Size LL;

    public static InterfaceC2044707zh<EnumC657200PqA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC657200PqA enumC657200PqA = new EnumC657200PqA("AUTO", 0, new Size(0, 0));
        AUTO = enumC657200PqA;
        EnumC657200PqA enumC657200PqA2 = new EnumC657200PqA("WIDE", 1, new Size(16, 9));
        WIDE = enumC657200PqA2;
        EnumC657200PqA enumC657200PqA3 = new EnumC657200PqA("SQUARE", 2, new Size(1, 1));
        SQUARE = enumC657200PqA3;
        EnumC657200PqA enumC657200PqA4 = new EnumC657200PqA("TALL", 3, new Size(5, 8));
        TALL = enumC657200PqA4;
        EnumC657200PqA enumC657200PqA5 = new EnumC657200PqA("THREE_TO_FOUR", 4, new Size(3, 4));
        THREE_TO_FOUR = enumC657200PqA5;
        EnumC657200PqA[] enumC657200PqAArr = {enumC657200PqA, enumC657200PqA2, enumC657200PqA3, enumC657200PqA4, enumC657200PqA5};
        LLILLJJLI = enumC657200PqAArr;
        LLILLL = new C2254308sP(enumC657200PqAArr);
    }

    public static EnumC657200PqA[] values() {
        return (EnumC657200PqA[]) LLILLJJLI.clone();
    }

    public final Size getValue() {
        return this.LL;
    }

    public static EnumC657200PqA valueOf(String str) {
        return (EnumC657200PqA) C08FF.LIZ(EnumC657200PqA.class, str);
    }

    public EnumC657200PqA(String str, int i, Size size) {
        this.LL = size;
    }
}
