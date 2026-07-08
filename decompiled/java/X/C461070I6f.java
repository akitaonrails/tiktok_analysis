package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;

/* JADX INFO: renamed from: X.0I6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C461070I6f {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[AttachmentTypeComponent.values().length];
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_POST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_REPOST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC461080I6g.values().length];
        try {
            iArr2[EnumC461080I6g.RECENT_ACTIVITY_POST.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC461080I6g.RECENT_ACTIVITY_REPOST.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZIZ = iArr2;
    }
}
