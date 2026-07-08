package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19j3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21618319j3 {
    public final LinkedList<C21618619j6> LIZ;
    public long LIZIZ;

    public final void LIZ(float f) {
        int size = this.LIZ.size() - 1;
        for (int i = 0; i < size; i++) {
            if (f <= this.LIZ.get(i).LIZ && f > this.LIZ.get(i + 1).LIZ) {
                this.LIZIZ = this.LIZ.get(i).LIZIZ;
                return;
            }
        }
        this.LIZIZ = this.LIZ.get(r1.size() - 1).LIZIZ;
    }

    public C21618319j3(float f, Context context) {
        float fLIZ = C0T83.LIZ(64.0f, context);
        LinkedList<C21618619j6> linkedList = new LinkedList<>();
        this.LIZ = linkedList;
        linkedList.add(new C21618619j6(10000000 / fLIZ, 10000000L));
        linkedList.add(new C21618619j6(1000000 / fLIZ, 1000000L));
        linkedList.add(new C21618619j6(500000 / fLIZ, 500000L));
        linkedList.add(new C21618619j6(100000 / fLIZ, 100000L));
        linkedList.add(new C21618619j6(50000 / fLIZ, 50000L));
        linkedList.add(new C21618619j6(20000 / fLIZ, 20000L));
        linkedList.add(new C21618619j6(10000 / fLIZ, 10000L));
        linkedList.add(new C21618619j6(LivePreCreateNextRoomPlayer.ENABLE / fLIZ, 3000L));
        linkedList.add(new C21618619j6(2000 / fLIZ, 2000L));
        linkedList.add(new C21618619j6(LSPassThroughRecordSizeConfig.DEFAULT / fLIZ, 1000L));
        linkedList.add(new C21618619j6(500 / fLIZ, 500L));
        linkedList.add(new C21618619j6(200 / fLIZ, 200L));
        linkedList.add(new C21618619j6(100 / fLIZ, 100L));
        LIZ(f);
    }
}
