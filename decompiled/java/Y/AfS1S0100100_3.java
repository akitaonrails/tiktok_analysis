package Y;

import X.C09JN;
import X.C1492560owY;
import X.C1C7U;
import X.C2177208fy;
import com.ss.android.ugc.aweme.feed.api.HotMusicListResp;
import com.ss.android.ugc.aweme.feed.assem.music.RequestHotMusicListTask;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class AfS1S0100100_3 implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

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

    public static final void accept$0(AfS1S0100100_3 afS1S0100100_3, Object obj) {
        C1C7U.LIZ("RequestHotMusicListTask@1720.run$1");
        HotMusicListResp hotMusicListResp = (HotMusicListResp) obj;
        if (hotMusicListResp.statusCode == 0 && !hotMusicListResp.musicId.isEmpty()) {
            C1492560owY.LIZ.getClass();
            ((ArrayList) C1492560owY.LIZIZ).addAll(hotMusicListResp.musicId);
            RequestHotMusicListTask requestHotMusicListTask = (RequestHotMusicListTask) afS1S0100100_3.l0;
            int size = hotMusicListResp.musicId.size();
            long j = afS1S0100100_3.j1;
            requestHotMusicListTask.getClass();
            RequestHotMusicListTask.LIZ(0, size, 0, "", j);
        } else {
            RequestHotMusicListTask requestHotMusicListTask2 = (RequestHotMusicListTask) afS1S0100100_3.l0;
            int size2 = hotMusicListResp.musicId.size();
            long j2 = afS1S0100100_3.j1;
            int i = hotMusicListResp.statusCode;
            String str = hotMusicListResp.message;
            requestHotMusicListTask2.getClass();
            RequestHotMusicListTask.LIZ(1, size2, i, str, j2);
        }
        C1C7U.LIZIZ("RequestHotMusicListTask@1720.run$1");
    }

    public static final void accept$1(AfS1S0100100_3 afS1S0100100_3, Object obj) {
        C1C7U.LIZ("RequestHotMusicListTask@1720.run$2");
        Throwable th = (Throwable) obj;
        RequestHotMusicListTask requestHotMusicListTask = (RequestHotMusicListTask) afS1S0100100_3.l0;
        long j = afS1S0100100_3.j1;
        int iLIZ = C2177208fy.LIZ(th);
        String message = th.getMessage();
        requestHotMusicListTask.getClass();
        RequestHotMusicListTask.LIZ(1, 0, iLIZ, message, j);
        C1C7U.LIZIZ("RequestHotMusicListTask@1720.run$2");
    }

    public AfS1S0100100_3(RequestHotMusicListTask requestHotMusicListTask, long j, int i) {
        this.$t = i;
        this.l0 = requestHotMusicListTask;
        this.j1 = j;
    }
}
