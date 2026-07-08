package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0J5O, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0J5O {
    void LIZ(Context context, Map map, String str, List list, int i, C1A58 c1a58);

    void LIZIZ(Context context, NewLiveRoomStruct newLiveRoomStruct, EnterRoomConfig enterRoomConfig);

    void LIZJ(Context context, User user, NewLiveRoomStruct newLiveRoomStruct, Bundle bundle);

    void LIZLLL(Context context, LiveRoomStruct liveRoomStruct, EnterRoomConfig enterRoomConfig);

    void LJ(Context context, SlimRoom slimRoom, String str);

    void LJFF(Context context, User user, boolean z, String str, SlimRoom slimRoom, String str2, String str3);

    void LJI(Context context, EnterRoomConfig enterRoomConfig, LiveRoomStruct liveRoomStruct, List<Long> list, Map<String, String> map);

    void LJII(EnterRoomConfig enterRoomConfig, String str);

    boolean LJIIIIZZ(Context context, User user, EnterRoomConfig enterRoomConfig);

    void LJIIIZ(Boolean bool, Integer num, String str, List list);

    void LJIIJ(Context context, EnterRoomConfig enterRoomConfig, Aweme aweme, List<Aweme> list, InterfaceC486070J4j interfaceC486070J4j, InterfaceC486120J4o interfaceC486120J4o);

    void LJIIJJI(Context context, EnterRoomConfig enterRoomConfig, LiveRoomStruct liveRoomStruct, List<LiveRoomStruct> list, InterfaceC486070J4j interfaceC486070J4j, InterfaceC486120J4o interfaceC486120J4o);

    void LJIIL(Context context, long j, EnterRoomConfig enterRoomConfig, String str, ArrayList<Long> arrayList, String str2);

    C0IOU getSearchComponent(String str);

    void watchLive(Context context, EnterRoomConfig enterRoomConfig);

    boolean watchLive(Context context, EnterRoomConfig enterRoomConfig, String str);

    DialogFragment xd();
}
