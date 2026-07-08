package X;

/* JADX INFO: renamed from: X.18Ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21250718Ef {
    System,
    ManualForward,
    ManualBack,
    ManualNotSure,
    UserVisibleHint,
    HybridRegister,
    BackInternal,
    Background,
    BackActivity,
    BackProcess;

    public static EnumC21250718Ef valueOf(String str) {
        return (EnumC21250718Ef) C08FF.LIZ(EnumC21250718Ef.class, str);
    }

    public final boolean isManual() {
        return ordinal() == ManualForward.ordinal() || ordinal() == ManualBack.ordinal() || ordinal() == ManualNotSure.ordinal();
    }
}
