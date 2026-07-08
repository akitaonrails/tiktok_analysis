package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0WWH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WWH {
    public final Integer LIZ;
    public final Integer LIZIZ;

    public final Bundle LIZ() {
        Bundle bundle = new Bundle();
        Integer num = this.LIZ;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.LIZIZ;
        if (num2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        return bundle;
    }

    public C0WWH(Integer num, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = num2;
    }
}
