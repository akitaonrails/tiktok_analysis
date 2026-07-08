package X;

/* JADX INFO: renamed from: X.0X7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC843700X7w {
    LynxSecurityErrorCodeOk(0),
    LynxSecurityErrorCodeUnSigned(1),
    LynxSecurityErrorCodeErrorSign(2),
    LynxSecurityErrorCodeReadBlockFailed(3),
    LynxSecurityErrorCodePKNotFound(4),
    LynxSecurityErrorCodeDebugCertExpired(5),
    LynxSecurityErrorCodeDebugCertVerifyFailed(6),
    LynxSecurityErrorCodeDebugCertInvalid(7);

    public static final C843710X7x Companion = new C843710X7x();
    public final int LL;

    public static EnumC843700X7w valueOf(String str) {
        return (EnumC843700X7w) C08FF.LIZ(EnumC843700X7w.class, str);
    }

    public final int getCode() {
        return this.LL;
    }

    EnumC843700X7w(int i) {
        this.LL = i;
    }
}
