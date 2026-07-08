package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0IMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465360IMs {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z, List list) {
        if (list.isEmpty()) {
            return;
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C0IL2.LIZ.LIZLLL(EnterRoomLinkSession.LJ(enterRoomConfig));
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterFromMerge = "live_detail";
        roomsData.enterMethod = str;
        enterRoomConfig.mLogData.enterRoomId = ((Number) ListProtector.get(list, 0)).longValue();
        if (z) {
            enterRoomConfig.mLogData.interactType = 2;
        }
        C784440Upu.LIZ().LIZIZ(new C0IF8(enterRoomConfig, ((Number) ListProtector.get(list, 0)).longValue()));
    }
}
