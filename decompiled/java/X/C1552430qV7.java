package X;

import android.os.Message;
import com.bytedance.geckox.task.HandlerTimerTask;

/* JADX INFO: renamed from: X.0qV7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552430qV7 {
    public final HandlerTimerTask LIZ = new HandlerTimerTask();

    public final void LIZ(AbstractC1552990qW1 abstractC1552990qW1, long j) {
        HandlerTimerTask handlerTimerTask = this.LIZ;
        if (j < 0) {
            handlerTimerTask.getClass();
            return;
        }
        handlerTimerTask.LIZ();
        int iLIZIZ = abstractC1552990qW1.LIZIZ();
        abstractC1552990qW1.LIZ = 0L;
        Message messageObtainMessage = handlerTimerTask.LIZ.obtainMessage(iLIZIZ);
        messageObtainMessage.obj = abstractC1552990qW1;
        messageObtainMessage.what = iLIZIZ;
        C786410Ut5.LJLJLJ(handlerTimerTask.LIZ, messageObtainMessage, j);
    }
}
