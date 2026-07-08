package X;

/* JADX INFO: renamed from: X.18Ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21251218Ek {
    System,
    ManualForward,
    ManualBack,
    ManualNotSure,
    PausePre,
    EnterBackground,
    HybridJump;

    public static EnumC21251218Ek valueOf(String str) {
        return (EnumC21251218Ek) C08FF.LIZ(EnumC21251218Ek.class, str);
    }

    public final boolean isManual() {
        return ordinal() == ManualForward.ordinal() || ordinal() == ManualBack.ordinal() || ordinal() == ManualNotSure.ordinal();
    }
}
