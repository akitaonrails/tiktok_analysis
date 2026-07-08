package X;

import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting;
import com.bytedance.android.livesdk.rank.api.model.Rank;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0es2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105360es2 {
    public static OnlineRankListResponse LIZ = new OnlineRankListResponse();
    public static String LIZIZ = "";
    public static final C1105530esJ LIZJ = new C1105530esJ(new ArrayList());
    public static int LIZLLL = 1;
    public static long LJ;
    public static long LJFF;

    public static boolean LIZ(DataChannel dataChannel) {
        String idStr;
        int i = 5;
        if (!C500260Jjc.LJIIZILJ(dataChannel)) {
            int i2 = OnlineAudienceDisplayStrategySetting.INSTANCE.getValue().displayNumberN + 5;
            long j = C1810700xDg.LJI;
            if (1 <= j && j <= i2) {
                return false;
            }
        }
        List<Rank> list = LIZ.ranks;
        if (list == null || Intrinsics.LJFF(LIZIZ, "")) {
            return false;
        }
        int size = list.size();
        int size2 = LIZJ.LIZ.size();
        if (size > size2) {
            size = size2;
        }
        if (size <= 5) {
            i = size;
            if (size == 0) {
                return false;
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            User user = ((Rank) ListProtector.get(list, i3)).user;
            if (user != null) {
                idStr = user.getIdStr();
            } else {
                idStr = null;
            }
            if (!Intrinsics.LJFF(idStr, ((User) ListProtector.get(LIZJ.LIZ, i3)).getIdStr())) {
                return false;
            }
        }
        return true;
    }

    public static void LIZIZ(OnlineRankListResponse onlineRankListResponse) {
        OnlineRankListResponse onlineRankListResponse2 = LIZ;
        LJ = System.currentTimeMillis();
        List<Rank> list = onlineRankListResponse.ranks;
        if (list != null) {
            int size = list.size();
            if (size > 5) {
                size = 5;
            }
            onlineRankListResponse2.ranks = list.subList(0, size);
        }
        Rank rank = onlineRankListResponse.selfInfo;
        if (rank != null) {
            onlineRankListResponse2.selfInfo = rank;
        }
        String str = onlineRankListResponse.currency;
        if (str != null) {
            onlineRankListResponse2.currency = str;
        }
        String str2 = onlineRankListResponse.ruleUrl;
        if (str2 != null) {
            onlineRankListResponse2.ruleUrl = str2;
        }
        onlineRankListResponse2.isBroadcastMENAT = onlineRankListResponse.isBroadcastMENAT;
        onlineRankListResponse2.total = onlineRankListResponse.total;
    }
}
