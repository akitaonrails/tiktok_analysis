package Y;

import X.C05FZ;
import X.C09JN;
import X.C0IKQ;
import X.C1C7U;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C589140N8u;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.live.model.RoomStatsModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.live.liveshare.LiveShareStickerViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS405S0200000_4;

/* JADX INFO: loaded from: classes5.dex */
public class AfS0S1100100_4 implements C09JN {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S1100100_4 afS0S1100100_4, Object obj) {
        C1C7U.LIZ("PlaylistDetailRepository@69c.getPlaylistDetail$response$2");
        Throwable th = (Throwable) obj;
        C05FZ c05fz = C05FZ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - afS0S1100100_4.j2)), new Pair("reason", "failed"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
        c05fz.getClass();
        C05FZ.LIZLLL(mapLJIIIIZZ);
        C589140N8u c589140N8u = C589140N8u.LJ;
        String str = afS0S1100100_4.s0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed, error message: ");
        sbLIZ.append(th.getMessage());
        c589140N8u.LJIJJ(str, C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) afS0S1100100_4.l1;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("PlaylistDetailRepository@69c.getPlaylistDetail$response$2");
    }

    public static final void accept$1(AfS0S1100100_4 afS0S1100100_4, Object obj) {
        RoomStatsModel roomStatsModel;
        C1C7U.LIZ("LiveShareStickerViewModel@53d1.checkRoomState$dispose$1");
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        if (!C0IKQ.LIZ(baseListResponse.data) && (roomStatsModel = (RoomStatsModel) ListProtector.get(baseListResponse.data, 0)) != null) {
            LiveShareStickerViewModel liveShareStickerViewModel = (LiveShareStickerViewModel) afS0S1100100_4.l1;
            String str = afS0S1100100_4.s0;
            long j = afS0S1100100_4.j2;
            if (roomStatsModel.alive) {
                liveShareStickerViewModel.LL.setValue(Boolean.TRUE);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkRoomState is room end,  ownerName: ");
                sbLIZ.append(str);
                sbLIZ.append(" roomid : ");
                sbLIZ.append(Boolean.valueOf(roomStatsModel.alive));
                C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
                liveShareStickerViewModel.wQ2(Long.valueOf(j), str);
                liveShareStickerViewModel.LL.setValue(Boolean.FALSE);
                liveShareStickerViewModel.vQ2(Long.valueOf(j), str, Boolean.TRUE, new AwS405S0200000_4(liveShareStickerViewModel, roomStatsModel, 63));
            }
        }
        C1C7U.LIZIZ("LiveShareStickerViewModel@53d1.checkRoomState$dispose$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.AfS0S1100100_4) (LINE:67108867) Y.AfS0S1100100_4.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.String), (r0 I:Y.AfS0S1100100_4) (LINE:67108869) Y.AfS0S1100100_4.s0 java.lang.String, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AfS0S1100100_4, java.lang.Object] */
    public AfS0S1100100_4(long j, long j2, String str, Function1<? super Throwable, Unit> function1) {
        long j3;
        String str2;
        obj.$t = function1;
        obj.j2 = j3;
        obj.s0 = str2;
        obj.l1 = str;
        ?? obj = new Object();
    }
}
