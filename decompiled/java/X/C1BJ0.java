package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.1BJ0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1BJ0 {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);

    public final boolean LL;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static C1BJ0[] valuesCustom() {
        return (C1BJ0[]) Arrays.copyOf(values(), 12);
    }

    public final boolean fromInstagram() {
        int i = C1BJX.LIZ[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public final boolean canExtendToken() {
        return this.LL;
    }

    C1BJ0(boolean z) {
        this.LL = z;
    }
}
