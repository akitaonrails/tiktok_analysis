package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.083d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20547083d {
    public static final BPEAHandler LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("OutreachReportHandlerV2");
        handlerThread.start();
        LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
