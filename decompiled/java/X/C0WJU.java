package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS24S0101000_13;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: renamed from: X.0WJU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WJU implements InterfaceC821120WJa {
    public WeakReference<Context> LIZLLL;
    public Messenger LJ;
    public final ARunnableS113S0100000_13 LIZ = new ARunnableS113S0100000_13(this, 235);
    public long LIZIZ = 0;
    public long LIZJ = 0;
    public final LinkedBlockingDeque<C0WJY> LJFF = new LinkedBlockingDeque<>();

    public final synchronized void LJ(ComponentName componentName) {
        if (this.LJ == null) {
            LJFF(componentName);
        } else {
            LJI(componentName);
        }
    }

    public final void LJFF(ComponentName componentName) {
        WeakReference<Context> weakReference = this.LIZLLL;
        if (weakReference != null && weakReference.get() != null) {
            Context context = weakReference.get();
            Logger.debug();
            if (componentName == null) {
                return;
            }
            try {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                C786410Ut5.s3(context, intent);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                Intent intent2 = new Intent();
                intent2.setComponent(componentName);
                ServiceConnection serviceConnection = new ServiceConnection() { // from class: X.0WJV
                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName2) {
                        if (componentName2 == null) {
                            return;
                        }
                        Logger.debug();
                        try {
                            C0WJU c0wju = this.LL;
                            c0wju.LJ = null;
                            c0wju.LJFF.clear();
                            synchronized (this.LL) {
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                        C0WJU c0wju2 = this.LL;
                        SystemClock.uptimeMillis();
                        c0wju2.getClass();
                        C0WJZ bindWsChannelServiceListener = WsConstants.getBindWsChannelServiceListener();
                        if (bindWsChannelServiceListener != null) {
                            bindWsChannelServiceListener.LIZ();
                        }
                    }

                    @Override // android.content.ServiceConnection
                    public final void onServiceConnected(ComponentName componentName2, IBinder iBinder) throws Throwable {
                        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/bytedance/common/wschannel/client/WsChannelMultiProcessImpl$MessengerServiceConnection", "onServiceConnected", this, new Object[]{componentName2, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6vqhP7qaw8W4KJ9DCZoRlVNDexe6izENM+GNi+3lEHIV", null)));
                        if (c0wsuLIZIZ.LIZ) {
                            return;
                        }
                        Object[] objArr = c0wsuLIZIZ.LIZJ;
                        if (objArr != null) {
                            Object obj = objArr[0];
                            if (obj != null) {
                                componentName2 = (ComponentName) obj;
                            }
                            Object obj2 = objArr[1];
                            if (obj2 != null) {
                                iBinder = (IBinder) obj2;
                            }
                        }
                        if (componentName2 != null && iBinder != null) {
                            Logger.debug();
                            try {
                                Messenger messenger = new Messenger(iBinder);
                                C0WJU c0wju = this.LL;
                                c0wju.LJ = messenger;
                                c0wju.LJ(componentName2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                            this.LL.LIZJ = SystemClock.uptimeMillis();
                            C0WJU c0wju2 = this.LL;
                            SystemClock.uptimeMillis();
                            c0wju2.getClass();
                            C0WJZ bindWsChannelServiceListener = WsConstants.getBindWsChannelServiceListener();
                            if (bindWsChannelServiceListener != null) {
                                bindWsChannelServiceListener.LIZ();
                            }
                        }
                    }
                };
                this.LIZIZ = SystemClock.uptimeMillis();
                if (WsConstants.getBindWsChannelServiceListener() != null) {
                    C808520Vne.LIZ().getClass();
                    C808520Vne.LLILLJJLI.postDelayed(this.LIZ, 10000L);
                }
                C2204961BRm.LJJJJ(context, intent2, serviceConnection, 1, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6vqhP7qaw8W4KJ9DCZoRlVNDexe6izENM+GNi+3lEHIV", null));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public final void LJI(ComponentName componentName) {
        C0WJY c0wjyPoll;
        if (componentName == null) {
            return;
        }
        while (this.LJFF.peek() != null && (c0wjyPoll = this.LJFF.poll()) != null) {
            try {
                Message message = new Message();
                message.what = c0wjyPoll.LIZJ;
                C786410Ut5.LJJIJL(message.getData(), c0wjyPoll.LIZ, c0wjyPoll.LIZIZ);
                try {
                    boolean zLJI = MethodIDManager.LJI(137749);
                    Logger.debug();
                    Messenger messenger = this.LJ;
                    if (messenger == null) {
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                    } else {
                        messenger.send(message);
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                    }
                } catch (DeadObjectException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LJ = null;
                    this.LJFF.offerFirst(c0wjyPoll);
                    SystemClock.uptimeMillis();
                    C0WJZ bindWsChannelServiceListener = WsConstants.getBindWsChannelServiceListener();
                    if (bindWsChannelServiceListener != null) {
                        bindWsChannelServiceListener.LIZ();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return;
            }
        }
    }

    @Override // X.InterfaceC821120WJa
    public final void LIZ(Context context, SsWsApp ssWsApp) {
        if (context == null) {
            return;
        }
        WeakReference<Context> weakReference = this.LIZLLL;
        if (weakReference == null || weakReference.get() == null) {
            this.LIZLLL = new WeakReference<>(C786410Ut5.N3(context));
        }
        if (C0WFY.LIZIZ(context).LIZJ() && ssWsApp != null) {
            WeakReference<Context> weakReference2 = this.LIZLLL;
            if (weakReference2 == null || weakReference2.get() == null) {
                this.LIZLLL = new WeakReference<>(C786410Ut5.N3(context));
            }
            Logger.debug();
            if (C0WFY.LIZIZ(context).LIZJ()) {
                try {
                    ComponentName componentName = new ComponentName(context, (Class<?>) WsChannelService.class);
                    C0WJY c0wjy = new C0WJY();
                    c0wjy.LIZ = "ws_app";
                    c0wjy.LIZIZ = ssWsApp;
                    c0wjy.LIZJ = 0;
                    this.LJFF.offer(c0wjy);
                    LJ(componentName);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    @Override // X.InterfaceC821120WJa
    public final void LIZIZ(int i, Context context) {
        if (context == null) {
            return;
        }
        Logger.debug();
        WeakReference<Context> weakReference = this.LIZLLL;
        if (weakReference == null || weakReference.get() == null) {
            this.LIZLLL = new WeakReference<>(C786410Ut5.N3(context));
        }
        Logger.debug();
        try {
            ComponentName componentName = new ComponentName(context, (Class<?>) WsChannelService.class);
            C0WJY c0wjy = new C0WJY();
            c0wjy.LIZ = "ws_app";
            c0wjy.LIZIZ = new IntegerParcelable(i);
            c0wjy.LIZJ = 1;
            this.LJFF.offer(c0wjy);
            LJ(componentName);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC821120WJa
    public final void LIZJ(Context context, SsWsApp ssWsApp) {
        if (context != null) {
            WeakReference<Context> weakReference = this.LIZLLL;
            if (weakReference == null || weakReference.get() == null) {
                this.LIZLLL = new WeakReference<>(C786410Ut5.N3(context));
            }
            Logger.debug();
            if (!C0WFY.LIZIZ(context).LIZJ()) {
                return;
            }
            WeakReference<Context> weakReference2 = this.LIZLLL;
            if (weakReference2 == null || weakReference2.get() == null) {
                this.LIZLLL = new WeakReference<>(C786410Ut5.N3(context));
            }
            Logger.debug();
            if (C0WFY.LIZIZ(context).LIZJ()) {
                try {
                    ComponentName componentName = new ComponentName(context, (Class<?>) WsChannelService.class);
                    C0WJY c0wjy = new C0WJY();
                    c0wjy.LIZ = "ws_app";
                    c0wjy.LIZIZ = ssWsApp;
                    c0wjy.LIZJ = 4;
                    this.LJFF.offer(c0wjy);
                    LJ(componentName);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    @Override // X.InterfaceC821120WJa
    public final void LIZLLL(Context context, WsChannelMsg wsChannelMsg) {
        if (context != null) {
            WeakReference<Context> weakReference = this.LIZLLL;
            if (weakReference == null || weakReference.get() == null) {
                this.LIZLLL = new WeakReference<>(C786410Ut5.N3(context));
            }
            Logger.debug();
            if (!C0WFY.LIZIZ(context).LIZJ()) {
                return;
            }
            try {
                ComponentName componentName = new ComponentName(context, (Class<?>) WsChannelService.class);
                C0WJY c0wjy = new C0WJY();
                c0wjy.LIZ = "payload";
                c0wjy.LIZIZ = wsChannelMsg;
                c0wjy.LIZJ = 5;
                this.LJFF.offer(c0wjy);
                LJ(componentName);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJII(int i, Context context) {
        if (context != null && i > 0 && i <= 3) {
            WeakReference<Context> weakReference = this.LIZLLL;
            if (weakReference == null || weakReference.get() == null) {
                this.LIZLLL = new WeakReference<>(C786410Ut5.N3(context));
            }
            Logger.debug();
            if (!C0WFY.LIZIZ(context).LIZJ()) {
                return;
            }
            RunnableC823120WQs.LIZIZ(new ARunnableS24S0101000_13(i, context, 11));
        }
    }
}
