package X;

import X.AbstractC1136060ffY;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageDefaultPrioritySetting;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0f2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1111980f2i<T extends AbstractC1136060ffY> implements InterfaceC1112610f3j<T> {
    public static final long LIZ = LivePublicScreenMessageDefaultPrioritySetting.getDefaultPriorityForAnchor();
    public static final long LIZIZ = LivePublicScreenMessageDefaultPrioritySetting.getDefaultPriorityForAudience();

    public PublicAreaMessageCommon LIZJ(T t) {
        return null;
    }

    public boolean LJ(C1109770ez9 c1109770ez9, AbstractC1136060ffY abstractC1136060ffY) {
        return false;
    }

    public boolean LJFF(AbstractC1136060ffY abstractC1136060ffY) {
        return false;
    }

    public boolean LJIIIZ(AbstractC1136060ffY abstractC1136060ffY, boolean z) {
        return false;
    }

    public boolean LJIIJ(T t) {
        return false;
    }

    public boolean LIZLLL(C1109770ez9 c1109770ez9, AbstractC1136060ffY abstractC1136060ffY) {
        if (abstractC1136060ffY.isHistoryMessage || !LJI(c1109770ez9.LJIIIIZZ, abstractC1136060ffY)) {
            return false;
        }
        return true;
    }

    public final boolean LJI(User user, AbstractC1136060ffY abstractC1136060ffY) {
        long id;
        User userLIZ = LIZ(user, abstractC1136060ffY);
        if (userLIZ != null) {
            id = userLIZ.getId();
        } else {
            id = 0;
        }
        if (id == UserService.getInstance().user().getCurrentUserId()) {
            return true;
        }
        return false;
    }

    public final boolean LJII(C1109770ez9 c1109770ez9, AbstractC1136060ffY abstractC1136060ffY) {
        if (c1109770ez9.LJI) {
            InterfaceC1110780f0m<? extends AbstractC1136060ffY> interfaceC1110780f0mLJIILL = c1109770ez9.LJIIJJI.LJIILL(abstractC1136060ffY);
            if ((interfaceC1110780f0mLJIILL instanceof InterfaceC1110780f0m) && interfaceC1110780f0mLJIILL != null && interfaceC1110780f0mLJIILL.LIZ(abstractC1136060ffY)) {
                return false;
            }
        }
        if (LJI(c1109770ez9.LJIIIIZZ, abstractC1136060ffY)) {
            return LJIIJ(abstractC1136060ffY);
        }
        return LJIIIIZZ(c1109770ez9, abstractC1136060ffY);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJIIIIZZ(X.C1109770ez9 r9, T r10) {
        /*
            r8 = this;
            com.bytedance.android.livesdkapi.message.CommonMessageData r2 = r10.baseMessage
            boolean r0 = r9.LJI
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L1f
            if (r2 == 0) goto L4a
            java.lang.Long r0 = r2.anchorFoldType
            if (r0 == 0) goto L4a
            long r3 = r0.longValue()
        L13:
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4a
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L1e
            r5 = 0
        L1e:
            return r5
        L1f:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r9.LJIIIZ
            if (r1 == 0) goto L45
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomUserChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomUserChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            if (r0 == 0) goto L45
            com.bytedance.android.livesdk.model.UserAttr r0 = r0.getUserAttr()
            if (r0 == 0) goto L45
            boolean r0 = r0.isAdmin
            if (r0 != r5) goto L45
            com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon r0 = r8.LIZJ(r10)
            if (r0 == 0) goto L40
            long r3 = r0.adminFoldType
            goto L13
        L40:
            if (r2 == 0) goto L4a
            long r3 = r2.foldType
            goto L13
        L45:
            if (r2 == 0) goto L4a
            long r3 = r2.foldType
            goto L13
        L4a:
            boolean r0 = r9.LJI
            boolean r0 = r8.LJIIIZ(r10, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1111980f2i.LJIIIIZZ(X.0ez9, X.0ffY):boolean");
    }

    public boolean LJIIJJI(C1109770ez9 c1109770ez9, T t) {
        if (t.isHistoryMessage) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
    
        if (r7 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long LIZIZ(X.AbstractC1136060ffY r6, boolean r7, com.bytedance.android.livesdkapi.message.CommonMessageData r8) {
        /*
            r5 = this;
            r3 = 0
            if (r7 == 0) goto L11
            if (r8 == 0) goto Le
            long r0 = r8.anchorPriorityScore
        L8:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L10
            if (r7 == 0) goto L16
        Le:
            long r0 = X.AbstractC1111980f2i.LIZ
        L10:
            return r0
        L11:
            if (r8 == 0) goto L16
            long r0 = r8.priorityScore
            goto L8
        L16:
            long r0 = X.AbstractC1111980f2i.LIZIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1111980f2i.LIZIZ(X.0ffY, boolean, com.bytedance.android.livesdkapi.message.CommonMessageData):long");
    }
}
