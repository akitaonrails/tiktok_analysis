package X;

/* JADX INFO: renamed from: X.0oui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1491420oui {
    APP_LOG(0),
    APM(1);

    public final long LL;

    public static EnumC1491420oui valueOf(String str) {
        return (EnumC1491420oui) C08FF.LIZ(EnumC1491420oui.class, str);
    }

    public final long getNativeValue() {
        return this.LL;
    }

    EnumC1491420oui(long j) {
        this.LL = j;
    }
}
