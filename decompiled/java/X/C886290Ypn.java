package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatlist.impl.core.refactor.prbocessor.IMUnreadMsgPortraitObserver;

/* JADX INFO: renamed from: X.0Ypn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886290Ypn {
    public static IMUnreadMsgPortraitObserver.UnreadConvMetaData LIZ(String str) {
        try {
            return (IMUnreadMsgPortraitObserver.UnreadConvMetaData) C051M.LIZIZ(IMUnreadMsgPortraitObserver.UnreadConvMetaData.class, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
