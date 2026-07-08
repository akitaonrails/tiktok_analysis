package X;

import android.os.Handler;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;

/* JADX INFO: renamed from: X.0jU5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282710jU5 implements InterfaceC1282900jUO {
    public SafeHandlerThread LIZ;

    @Override // X.InterfaceC1282900jUO
    public final SafeHandlerThread LIZIZ() {
        SafeHandlerThread safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(0, "LiveCoreWorkUploadBWProbeThread");
        this.LIZ = safeHandlerThreadLIZIZ;
        safeHandlerThreadLIZIZ.start();
        return this.LIZ;
    }

    @Override // X.InterfaceC1282900jUO
    public final Handler LIZ() {
        return this.LIZ.getHandler();
    }
}
