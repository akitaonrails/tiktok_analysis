package X;

import android.util.Pair;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0ISe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC466780ISe {
    void LIZ(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2);

    C11O8 LIZIZ(long[] jArr, EnterRoomConfig enterRoomConfig);

    C11NZ<C0ITM<Pair<List<FeedItem>, FeedExtra>>> LIZJ(String str, C466790ISf c466790ISf, long j);

    C11NZ<C0ITM<Pair<List<FeedItem>, FeedExtra>>> LIZLLL(String str, C466790ISf c466790ISf, long j);

    void LJ(EnterRoomConfig enterRoomConfig, boolean z);
}
