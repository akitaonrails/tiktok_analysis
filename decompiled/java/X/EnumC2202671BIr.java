package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.1BIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2202671BIr {
    SUCCESS("success"),
    CANCEL("cancel"),
    ERROR("error");

    public final String LL;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC2202671BIr[] valuesCustom() {
        return (EnumC2202671BIr[]) Arrays.copyOf(values(), 3);
    }

    public final String getLoggingValue() {
        return this.LL;
    }

    EnumC2202671BIr(String str) {
        this.LL = str;
    }
}
