package com.bytedance.android.live.effect.karaoke.api;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import tikcast.api.anchor.KaraokeQueueListResponse;
import tikcast.api.anchor.KaraokeReqListResponse;
import tikcast.api.anchor.KaraokeSearchResponse;
import tikcast.api.anchor.KaraokeTabListResponse;
import tikcast.api.anchor.KaraokeTabsListResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface KaraokeApi {
    @InterfaceC1501160pAQ("/webcast/anchor/karaoke/queue/list/")
    Object getQueueSongList(@InterfaceC1501070pAH("role") int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("offset") int i2, @InterfaceC1501070pAH("host_id") String str, InterfaceC1364105Vn<? super C470590Icr<KaraokeQueueListResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/karaoke/requests/list/")
    Object getRequestSongList(@InterfaceC1501070pAH("role") int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("offset") int i2, @InterfaceC1501070pAH("timestamp") long j2, @InterfaceC1501070pAH("host_id") String str, @InterfaceC1501070pAH("list_type") int i3, InterfaceC1364105Vn<? super C470590Icr<KaraokeReqListResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/karaoke/tab/list/")
    Object getSongListByOffset(@InterfaceC1501070pAH("role") int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("tab_id") long j2, @InterfaceC1501070pAH("offset") int i2, @InterfaceC1501070pAH("host_id") String str, InterfaceC1364105Vn<? super C470590Icr<KaraokeTabListResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/karaoke/tabs/list/")
    Object getTabWithSongList(@InterfaceC1501070pAH("role") int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("host_id") String str, InterfaceC1364105Vn<? super C470590Icr<KaraokeTabsListResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/karaoke/queue/update/")
    Object nextQueueOnlyOne(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("song_id") long j2, @InterfaceC1501050pAF("update_type") int i, @InterfaceC1501050pAF("host_id") String str, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/karaoke/requests/update/")
    Object requestSong(@InterfaceC1501050pAF("song_id") long j, @InterfaceC1501050pAF("update_type") int i, @InterfaceC1501050pAF("room_id") long j2, @InterfaceC1501050pAF("host_id") String str, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/karaoke/search/")
    Object searchSong(@InterfaceC1501070pAH("role") int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("keywords") String str, @InterfaceC1501070pAH("offset") int i2, InterfaceC1364105Vn<? super C470590Icr<KaraokeSearchResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/karaoke/favorite/update/")
    Object updateFavoriteStatus(@InterfaceC1501050pAF("song_id") long j, @InterfaceC1501050pAF("update_type") int i, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/karaoke/status/")
    Object updateKaraokeState(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("op_type") int i, @InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i2, @InterfaceC1501050pAF("host_id") String str, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/karaoke/queue/update/")
    Object updateQueueList(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("current_song_id") long j2, @InterfaceC1501050pAF("update_type") int i, @InterfaceC1501050pAF("next_song_id") long j3, @InterfaceC1501050pAF("role") int i2, @InterfaceC1501050pAF("host_id") String str, @InterfaceC1501050pAF("current_song_singer_id") long j4, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);
}
