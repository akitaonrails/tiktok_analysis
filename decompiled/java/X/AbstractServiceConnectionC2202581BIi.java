package X;

import X.AbstractServiceConnectionC2202581BIi;
import X.C1C7U;
import X.C807660VmG;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.internal.PlatformServiceClient$1;
import com.facebook.login.GetTokenLoginMethodHandler;

/* JADX INFO: renamed from: X.1BIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractServiceConnectionC2202581BIi implements ServiceConnection {
    public final Context LL;
    public final PlatformServiceClient$1 LLILLJJLI;
    public C2202921BJq LLILLL;
    public boolean LLILZ;
    public Messenger LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;
    public final String LLJI;

    public final void LIZ(Bundle bundle) {
        if (!this.LLILZ) {
            return;
        }
        this.LLILZ = false;
        C2202921BJq c2202921BJq = this.LLILLL;
        if (c2202921BJq != null) {
            GetTokenLoginMethodHandler.LJIIJ(bundle, c2202921BJq.LIZ, c2202921BJq.LIZIZ);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LLILZIL = null;
        try {
            this.LL.unbindService(this);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ(null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/facebook/internal/PlatformServiceClient", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXiloOV7HWgI2mG9kwUzmTT0kl2ybJZIQ==", new String[]{"019e5"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 != null) {
                iBinder = (IBinder) obj2;
            }
        }
        this.LLILZIL = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("com.facebook.platform.extra.APPLICATION_ID", this.LLIZLLLIL, bundle);
        String str = this.LLJI;
        if (str != null) {
            C786410Ut5.LJJJI("com.facebook.platform.extra.NONCE", str, bundle);
        }
        Message messageObtain = Message.obtain((Handler) null, this.LLILZLL);
        messageObtain.arg1 = this.LLJ;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.LLILLJJLI);
        try {
            Messenger messenger = this.LLILZIL;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.internal.PlatformServiceClient$1] */
    public AbstractServiceConnectionC2202581BIi(Context context, String str, String str2) {
        Context contextN3 = C786410Ut5.N3(context);
        this.LL = contextN3 != null ? contextN3 : context;
        this.LLILZLL = 65536;
        this.LLIZ = 65537;
        this.LLIZLLLIL = str;
        this.LLJ = 20121101;
        this.LLJI = str2;
        this.LLILLJJLI = new BPEAHandler() { // from class: com.facebook.internal.PlatformServiceClient$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("PlatformServiceClient@4a58.<init>$1");
                if (C807660VmG.LIZ(this)) {
                    C1C7U.LIZIZ("PlatformServiceClient@4a58.<init>$1");
                    return;
                }
                try {
                    if (C807660VmG.LIZ(this)) {
                        C1C7U.LIZIZ("PlatformServiceClient@4a58.<init>$1");
                        return;
                    }
                    try {
                        AbstractServiceConnectionC2202581BIi abstractServiceConnectionC2202581BIi = this.LL;
                        abstractServiceConnectionC2202581BIi.getClass();
                        if (message.what == abstractServiceConnectionC2202581BIi.LLIZ) {
                            Bundle data = message.getData();
                            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                                abstractServiceConnectionC2202581BIi.LIZ(null);
                            } else {
                                abstractServiceConnectionC2202581BIi.LIZ(data);
                            }
                            try {
                                abstractServiceConnectionC2202581BIi.LL.unbindService(abstractServiceConnectionC2202581BIi);
                            } catch (IllegalArgumentException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        C1C7U.LIZIZ("PlatformServiceClient@4a58.<init>$1");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1C7U.LIZIZ("PlatformServiceClient@4a58.<init>$1");
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1C7U.LIZIZ("PlatformServiceClient@4a58.<init>$1");
                }
            }
        };
    }
}
