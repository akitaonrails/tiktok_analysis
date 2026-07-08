package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.TiktokLiveLocationBubbleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0JhI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498820JhI {
    public static final long LJII = TiktokLiveLocationBubbleSetting.getValue().interval;
    public static final long LJIIIIZZ = TiktokLiveLocationBubbleSetting.getValue().delay;
    public static final int LJIIIZ = TiktokLiveLocationBubbleSetting.getValue().maxTimes;
    public static final int LJIIJ = TiktokLiveLocationBubbleSetting.getValue().maxGapTimes;
    public static final int LJIIJJI = TiktokLiveLocationBubbleSetting.getValue().bubbleDelayTime;
    public final C19EG LIZ;
    public final Room LIZIZ;
    public final View LIZJ;
    public final DataChannel LIZLLL;
    public final LifecycleOwner LJ;
    public boolean LJFF;
    public final BPEAHandler LJI;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C498820JhI(X.C19EG r18, com.bytedance.android.livesdkapi.depend.model.live.Room r19, android.view.View r20, com.bytedance.ies.sdk.datachannel.DataChannel r21, androidx.lifecycle.LifecycleOwner r22) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C498820JhI.<init>(X.19EG, com.bytedance.android.livesdkapi.depend.model.live.Room, android.view.View, com.bytedance.ies.sdk.datachannel.DataChannel, androidx.lifecycle.LifecycleOwner):void");
    }
}
