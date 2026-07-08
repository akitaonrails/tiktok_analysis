package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;

/* JADX INFO: renamed from: X.0ZaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C902240ZaQ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[IconTypeComponent.values().length];
        try {
            iArr[IconTypeComponent.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[IconTypeComponent.MODERATION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
