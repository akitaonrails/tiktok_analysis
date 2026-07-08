package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.01C6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01C6 {
    public static final C01C6 LIZ = new C01C6();

    public static final boolean LIZ(DataChannel dataChannel) {
        String str;
        n nVar;
        k kVarLJJIIZ;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Hashtag hashtag;
        UserAttr userAttr;
        if (dataChannel == null) {
            return false;
        }
        try {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            if (room == null || (str = room.roomCreateAbParam) == null || (nVar = (n) C19748512Ol.LIZJ.LJII(str, n.class)) == null || (kVarLJJIIZ = nVar.LJJIIZ("enable_revenue_tips_moderator_comment")) == null || kVarLJJIIZ.LJIIJJI() <= 0) {
                return false;
            }
            User user = (User) dataChannel.gg0(RoomUserChannel.class);
            LiveMode streamType = null;
            if (user != null && (userAttr = user.getUserAttr()) != null) {
                boolValueOf = Boolean.valueOf(userAttr.isAdmin);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIJIIJIL(boolValueOf) || C500260Jjc.LJJIJIIJIL((Boolean) dataChannel.gg0(C0TZM.class))) {
                return false;
            }
            if (room == null || (hashtag = room.hashtag) == null) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(hashtag.isUseGameTagAsHashTag());
            }
            if (C500260Jjc.LJJIJIIJIL(boolValueOf2)) {
                return false;
            }
            if (room != null) {
                streamType = room.getStreamType();
            }
            if (streamType == LiveMode.VIDEO) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(android.content.Context r4, com.bytedance.ies.sdk.datachannel.DataChannel r5) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r3 = "moderator_tips_v2"
            if (r5 == 0) goto L32
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r5.gg0(r0)     // Catch: java.lang.Exception -> L2e
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L32
            java.lang.String r2 = r0.roomCreateAbParam     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L32
            com.google.gson.Gson r1 = X.C19748512Ol.LIZJ     // Catch: java.lang.Exception -> L2e
            java.lang.Class<com.google.gson.n> r0 = com.google.gson.n.class
            java.lang.Object r0 = r1.LJII(r2, r0)     // Catch: java.lang.Exception -> L2e
            com.google.gson.n r0 = (com.google.gson.n) r0     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L32
            com.google.gson.k r0 = r0.LJJIIZ(r3)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L32
            java.lang.String r1 = r0.LJIL()     // Catch: java.lang.Exception -> L2e
            if (r1 != 0) goto L34
            goto L32
        L2e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L32:
            java.lang.String r1 = "0"
        L34:
            com.bytedance.android.livesdk.livesetting.game.GameLiveModeratorGuideSchemaSetting r0 = com.bytedance.android.livesdk.livesetting.game.GameLiveModeratorGuideSchemaSetting.INSTANCE
            java.lang.String r0 = r0.getValue()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r3, r1)
            android.net.Uri r0 = r0.build()
            java.lang.String r2 = r0.toString()
            java.lang.Class<com.bytedance.android.live.browser.IHybridContainerService> r0 = com.bytedance.android.live.browser.IHybridContainerService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.browser.IHybridContainerService r1 = (com.bytedance.android.live.browser.IHybridContainerService) r1
            r0 = 0
            r1.YC1(r4, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01C6.LIZIZ(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
