package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.03kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC934003kw {
    CLOSED("closed"),
    EXPIRED("expired"),
    INIT("init"),
    SUCCESS("success"),
    FAILED("failed"),
    UNKNOW("unknow");

    public final String LL;

    public String getStatus() {
        return this.LL;
    }

    public static EnumC934003kw getOrderStatus(String str) {
        for (EnumC934003kw enumC934003kw : values()) {
            if (TextUtils.equals(enumC934003kw.LL, str)) {
                return enumC934003kw;
            }
        }
        return UNKNOW;
    }

    public static EnumC934003kw valueOf(String str) {
        return (EnumC934003kw) C08FF.LIZ(EnumC934003kw.class, str);
    }

    EnumC934003kw(String str) {
        this.LL = str;
    }
}
