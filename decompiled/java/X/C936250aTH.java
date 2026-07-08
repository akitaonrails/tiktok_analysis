package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.api.IAvatarAPI;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarDeleteReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarListResp;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarConfigSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.Charsets;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aTH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936250aTH {
    public static final long LIZ;
    public static final boolean LIZIZ;
    public static AvatarListResp.ResponseData LIZJ;
    public static final Map<Long, Avatar> LIZLLL;
    public static final Map<String, String> LJ;
    public static final long LJFF;
    public static final long LJI;
    public static long LJII;
    public static final long LJIIIIZZ;
    public static AnonymousClass0114 LJIIIZ;
    public static long LJIIJ;

    static {
        MultiGuestAvatarConfigSetting multiGuestAvatarConfigSetting = MultiGuestAvatarConfigSetting.INSTANCE;
        LIZ = multiGuestAvatarConfigSetting.getValue().cacheDuration;
        LIZIZ = multiGuestAvatarConfigSetting.getValue().cacheEnable;
        LIZLLL = new LinkedHashMap();
        LJ = new LinkedHashMap();
        LJFF = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
        LJI = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        LJII = roomLJJLI != null ? roomLJJLI.getId() : 0L;
        LJIIIIZZ = UserService.getInstance().user().getCurrentUserId();
    }

    public static void LIZ() {
        if (LIZIZ) {
            LIZJ = null;
            C20441214yg.LIZIZ("AvatarDataManager", "cacheAvatarListResp");
        }
    }

    public static LinkCommon LIZLLL() {
        LinkCommon linkCommon = new LinkCommon(0, 0L, 0L, null, "", "", 0, "");
        linkCommon.scene = 4;
        linkCommon.appId = LJFF;
        linkCommon.live_id = LJI;
        return linkCommon;
    }

    public static Player LJ() {
        return new Player(LJII, LJIIIIZZ);
    }

    public static C11KQ LIZIZ(final long j) {
        AvatarDeleteReq avatarDeleteReq = new AvatarDeleteReq();
        avatarDeleteReq.avatarId = j;
        avatarDeleteReq.applier = LJ();
        avatarDeleteReq.common = LIZLLL();
        C480460Ism.LIZ().getClass();
        return C01NB.LIZ(((IAvatarAPI) C480460Ism.LIZLLL(IAvatarAPI.class)).deleteAvatar(avatarDeleteReq).LJJIJIIJI(C11S5.LIZ()).LJJ(C953780avY.LIZIZ).LJIILL(new C09JN() { // from class: X.00SR
            @Override // X.C09JN
            public final void accept(Object obj) {
                List<Avatar> list;
                C1C7U.LIZ("AvatarDataManager@42e9.delete$1");
                C930480aJy.LIZ.getClass();
                if (C930480aJy.LJJIFFI((C470590Icr) obj)) {
                    boolean z = C936250aTH.LIZIZ;
                    final long j2 = j;
                    if (C936250aTH.LIZJ != null && C936250aTH.LIZIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("removeCache ");
                        sbLIZ.append(j2);
                        C20441214yg.LIZIZ("AvatarDataManager", C2188811AlT.LIZIZ(sbLIZ));
                        AvatarListResp.ResponseData responseData = C936250aTH.LIZJ;
                        if (responseData != null && (list = responseData.avatars) != null) {
                            list.removeIf(new Predicate() { // from class: X.00SS
                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj2) {
                                    if (((Avatar) obj2).avatarId == j2) {
                                        return true;
                                    }
                                    return false;
                                }
                            });
                        }
                    }
                }
                C1C7U.LIZIZ("AvatarDataManager@42e9.delete$1");
            }
        }));
    }

    public static String LIZJ(long j, String str) {
        CharSequence charSequenceSubSequence = C13LQ.LJJIJIL(MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8)), "", AFwS231S0000000_3.get$arr$(235)).subSequence(0, 8);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) charSequenceSubSequence);
        sbLIZ.append('_');
        sbLIZ.append(j);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
