package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.1BIP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1BIP {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");

    public final String LL;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static C1BIP[] valuesCustom() {
        return (C1BIP[]) Arrays.copyOf(values(), 4);
    }

    public final String getNativeProtocolAudience() {
        return this.LL;
    }

    C1BIP(String str) {
        this.LL = str;
    }
}
