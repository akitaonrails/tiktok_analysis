package X;

import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;

/* JADX INFO: renamed from: X.0IB8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IB8 {
    public static final FallbackStatusComponent LIZ(C0IBA c0iba) {
        for (FallbackStatusComponent fallbackStatusComponent : FallbackStatusComponent.values()) {
            if (fallbackStatusComponent.getValue() == c0iba.getValue()) {
                return fallbackStatusComponent;
            }
        }
        return FallbackStatusComponent.UNKNOWN;
    }
}
