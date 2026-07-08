package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockActionComponent;

/* JADX INFO: renamed from: X.0Zgv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C906270Zgv {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[StreamBlockActionComponent.values().length];
        try {
            iArr[StreamBlockActionComponent.UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[StreamBlockActionComponent.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
