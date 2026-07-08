package X;

import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.BDImageXUploader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.persona.PrivilegeImageXUploadedToken;

/* JADX INFO: renamed from: X.143P, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C143P {
    public final Context LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final ExecutorService LIZLLL = C786410Ut5.i4(new ThreadFactory() { // from class: X.143Q
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread = new BPEAThread(runnable, "GuardianAutographUploader-IO");
            bPEAThread.setDaemon(true);
            return bPEAThread;
        }
    });
    public BDImageXUploader LJ;

    public final void LIZ() {
        this.LIZJ.set(true);
        BDImageXUploader bDImageXUploader = this.LJ;
        if (bDImageXUploader != null) {
            bDImageXUploader.close();
        }
        this.LJ = null;
        this.LIZIZ.removeCallbacksAndMessages(null);
        this.LIZLLL.shutdownNow();
    }

    public final void LIZIZ(Function0<Unit> function0) {
        if (this.LIZJ.get()) {
            return;
        }
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(this.LIZIZ, new RunnableC514801zW(function0, (Function0<Unit>) 137));
        }
    }

    public C143P(Context context, PrivilegeImageXUploadedToken privilegeImageXUploadedToken) {
        BDImageXUploader bDImageXUploader;
        this.LIZ = C786410Ut5.N3(context);
        try {
            bDImageXUploader = new BDImageXUploader();
            bDImageXUploader.setUploadDomain(privilegeImageXUploadedToken.uploadHostDomain);
            bDImageXUploader.setTopAccessKey(privilegeImageXUploadedToken.accessKeyId);
            bDImageXUploader.setTopSecretKey(privilegeImageXUploadedToken.secretAccessKey);
            bDImageXUploader.setTopSessionToken(privilegeImageXUploadedToken.sessionToken);
            bDImageXUploader.setServiceID(privilegeImageXUploadedToken.serviceId);
            bDImageXUploader.setNetworkType(403, 1);
            bDImageXUploader.setNetworkType(404, -1);
            bDImageXUploader.setFileRetryCount(3);
            bDImageXUploader.setEnableHttps(1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bDImageXUploader = null;
        }
        this.LJ = bDImageXUploader;
    }
}
