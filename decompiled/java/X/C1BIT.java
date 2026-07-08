package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.1BIT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1BIT {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);

    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static C1BIT[] valuesCustom() {
        return (C1BIT[]) Arrays.copyOf(values(), 6);
    }

    public final boolean allowsCustomTabAuth() {
        return this.LLILZIL;
    }

    public final boolean allowsDeviceAuth() {
        return this.LLILZ;
    }

    public final boolean allowsFacebookLiteAuth() {
        return this.LLILZLL;
    }

    public final boolean allowsGetTokenAuth() {
        return this.LL;
    }

    public final boolean allowsInstagramAppAuth() {
        return this.LLIZ;
    }

    public final boolean allowsKatanaAuth() {
        return this.LLILLJJLI;
    }

    public final boolean allowsWebViewAuth() {
        return this.LLILLL;
    }

    C1BIT(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
        this.LLILZIL = z5;
        this.LLILZLL = z6;
        this.LLIZ = z7;
    }
}
