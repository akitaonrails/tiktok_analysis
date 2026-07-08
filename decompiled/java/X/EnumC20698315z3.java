package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15z3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20698315z3 {
    public static final EnumC20698315z3 CAPTIONS;
    public static final EnumC20698315z3 DIRECT_MESSAGE;
    public static final EnumC20698315z3 LANDSCAPE_CAPTIONS;
    public static final /* synthetic */ EnumC20698315z3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20698315z3 PHOTO_MODE;
    public static final EnumC20698315z3 TRANSLATION;

    public static InterfaceC2044707zh<EnumC20698315z3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20698315z3 enumC20698315z3 = new EnumC20698315z3("CAPTIONS", 0);
        CAPTIONS = enumC20698315z3;
        EnumC20698315z3 enumC20698315z32 = new EnumC20698315z3("LANDSCAPE_CAPTIONS", 1);
        LANDSCAPE_CAPTIONS = enumC20698315z32;
        EnumC20698315z3 enumC20698315z33 = new EnumC20698315z3("TRANSLATION", 2);
        TRANSLATION = enumC20698315z33;
        EnumC20698315z3 enumC20698315z34 = new EnumC20698315z3("PHOTO_MODE", 3);
        PHOTO_MODE = enumC20698315z34;
        EnumC20698315z3 enumC20698315z35 = new EnumC20698315z3("DIRECT_MESSAGE", 4);
        DIRECT_MESSAGE = enumC20698315z35;
        EnumC20698315z3[] enumC20698315z3Arr = {enumC20698315z3, enumC20698315z32, enumC20698315z33, enumC20698315z34, enumC20698315z35};
        LL = enumC20698315z3Arr;
        LLILLJJLI = new C2254308sP(enumC20698315z3Arr);
    }

    public static EnumC20698315z3[] values() {
        return (EnumC20698315z3[]) LL.clone();
    }

    public static EnumC20698315z3 valueOf(String str) {
        return (EnumC20698315z3) C08FF.LIZ(EnumC20698315z3.class, str);
    }

    public EnumC20698315z3(String str, int i) {
    }
}
