package com.bef.effectsdk.message;

import X.C1C7U;
import X.C786410Ut5;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class MessageCenter {
    public static HandlerThread sMessageCenterThread;
    public static Handler sMessageHandler;
    public static final Object sMessageCenterThreadLock = new Object();
    public static final List<Listener> sListeners = new ArrayList();

    public interface Listener {
        void onMessageReceived(int i, int i2, int i3, String str);
    }

    public static void destroy() {
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    synchronized (sMessageCenterThreadLock) {
                        try {
                            Handler handler = sMessageHandler;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                                sMessageHandler = null;
                            }
                            HandlerThread handlerThread = sMessageCenterThread;
                            if (handlerThread != null) {
                                handlerThread.quit();
                                sMessageCenterThread = null;
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void init() {
        synchronized (sMessageCenterThreadLock) {
            try {
                HandlerThread handlerThread = sMessageCenterThread;
                if (handlerThread == null || !handlerThread.isAlive() || C786410Ut5.W2(sMessageCenterThread) == null) {
                    HandlerThread handlerThread2 = new HandlerThread("MessageCenter");
                    sMessageCenterThread = handlerThread2;
                    handlerThread2.start();
                    sMessageHandler = new MessageHandler(C786410Ut5.W2(sMessageCenterThread));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void removeAllListener() {
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                list.clear();
                destroy();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static class MessageHandler extends BPEAHandler {
        public MessageHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1C7U.LIZ("MessageCenter$MessageHandler@ea71.handleMessage");
            MessageCenter.handleMessage(message);
            C1C7U.LIZIZ("MessageCenter$MessageHandler@ea71.handleMessage");
        }
    }

    public static void addListener(Listener listener) {
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    init();
                }
                list.add(listener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void handleMessage(Message message) {
        int size;
        Listener[] listenerArr;
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                size = list.size();
                listenerArr = new Listener[size];
                list.toArray(listenerArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (size <= 0) {
            return;
        }
        int i = 0;
        do {
            listenerArr[i].onMessageReceived(message.what, message.arg1, message.arg2, (String) HandlerHook.getMessageObj(message.obj));
            i++;
        } while (i < size);
    }

    public static void removeListener(Listener listener) {
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                list.remove(listener);
                if (list.isEmpty()) {
                    destroy();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void setListener(Listener listener) {
        synchronized (sListeners) {
            try {
                addListener(listener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void postMessage(int i, int i2, int i3, String str) {
        synchronized (sMessageCenterThreadLock) {
            try {
                Handler handler = sMessageHandler;
                if (handler == null) {
                    return;
                }
                Message.obtain(handler, i, i2, i3, str).sendToTarget();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
