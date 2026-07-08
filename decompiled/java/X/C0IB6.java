package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;

/* JADX INFO: renamed from: X.0IB6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C0IB6 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[C0IB7.values().length];
        try {
            iArr[C0IB7.LIKE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0IB7.FAVOURITE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0IB7.REPOST.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        int[] iArr2 = new int[AttachmentTypeComponent.values().length];
        try {
            iArr2[AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_LIKE.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_FAVOURITE.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_REPOST.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZIZ = iArr2;
    }
}
