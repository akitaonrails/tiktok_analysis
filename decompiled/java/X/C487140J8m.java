package X;

import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.mix.MixLiveCardViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0J8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487140J8m extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C487140J8m() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0J3Q] */
    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        C512350K7l c512350K7l = C512350K7l.LIZ;
        View view = c0rf02.LIZ;
        String str = c0rf02.LJIIIZ;
        Fragment fragment = c0rf02.LIZJ;
        c512350K7l.getClass();
        return new MixLiveCardViewHolder(view, fragment, new C0J4V(str, new C0J3S() { // from class: X.0J3Q
            @Override // X.C0J4T
            public final void LIZ() {
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.C0J4T
            public final EnterRoomConfig LIZIZ(Aweme aweme, Fragment fragment2, C2189821An6 c2189821An6) {
                Map<String, String> map;
                Map<String, String> extra;
                Map<String, String> map2;
                if (aweme == null) {
                    return null;
                }
                boolean zLIZ = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LJJLIL().LIZ(fragment2, aweme);
                C0J3N.LIZ.getClass();
                if (c2189821An6 == null || (map = c2189821An6.getExtra()) == null) {
                    map = new HashMap<>();
                }
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                User author = aweme.getAuthor();
                String str2 = "draw";
                if (author != null) {
                    enterRoomConfig.mRoomsData.userId = author.getUid();
                    enterRoomConfig.mRoomsData.isSecret = Integer.valueOf((int) author.secret);
                    enterRoomConfig.mLogData.list_item_id = String.valueOf(C486180J4u.LIZ(author));
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                    C487710JAr.LIZ.getClass();
                    roomsData.followStatus = String.valueOf(C487710JAr.LIZIZ(author));
                    EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                    String str3 = map.get("enter_method");
                    if (str3 == null) {
                        str3 = "live_bottom_bar_mix";
                    }
                    roomsData2.enterMethod = str3;
                    EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                    String str4 = map.get("enter_from_merge");
                    if (str4 == null) {
                        str4 = "mix_live";
                    }
                    roomsData3.enterFromMerge = str4;
                    EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
                    String str5 = map.get("mix_live_enter_type");
                    if (str5 == null) {
                        str5 = "draw";
                    }
                    roomsData4.enterType = str5;
                }
                String str6 = enterRoomConfig.mRoomsData.userId;
                C485990J4b.LIZLLL(aweme, enterRoomConfig);
                if (!TextUtils.isEmpty(str6) && !TextUtils.equals(str6, CardStruct.IStatusCode.DEFAULT)) {
                    String str7 = enterRoomConfig.mRoomsData.userId;
                    if (TextUtils.isEmpty(str7) || TextUtils.equals(str7, CardStruct.IStatusCode.DEFAULT)) {
                        enterRoomConfig.mRoomsData.userId = str6;
                    }
                }
                EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
                if (streamData != null && streamData.disablePrePullStream) {
                    EnterRoomConfig.StreamData streamData2 = new EnterRoomConfig.StreamData(null, 0L, 0, null, null, null, null, null, null, false, false, 0, -1, false, -1L, false, 0L, false, false);
                    streamData2.disablePrePullStream = true;
                    enterRoomConfig.mStreamData = streamData2;
                }
                EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
                roomsData5.isMixLive = true;
                roomsData5.isMixLiveHasMore = zLIZ;
                if (TextUtils.isEmpty(C0J3N.LIZIZ)) {
                    String str8 = enterRoomConfig.mRoomsData.enterType;
                    if (str8 != null) {
                        str2 = str8;
                    }
                    C0J3N.LIZIZ = str2;
                }
                enterRoomConfig.mRoomsData.enterType = C0J3N.LIZIZ;
                EnterRoomLinkSession.LJ(enterRoomConfig);
                if (c2189821An6 != null && (extra = c2189821An6.getExtra()) != null) {
                    EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig.mRoomsData;
                    if (roomsData6.gameLiveExtra == null) {
                        roomsData6.gameLiveExtra = new LinkedHashMap();
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, String> entry : extra.entrySet()) {
                        if (entry.getKey() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        Object key = entry2.getKey();
                        if (key != null && (map2 = enterRoomConfig.mRoomsData.gameLiveExtra) != null) {
                            map2.put((String) key, (String) entry2.getValue());
                        }
                    }
                    Map<String, String> map3 = enterRoomConfig.mRoomsData.gameLiveExtra;
                    if (map3 != null) {
                        map3.put("is_mix_live", "true");
                    }
                }
                return enterRoomConfig;
            }
        }));
    }
}
