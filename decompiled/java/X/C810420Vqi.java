package X;

import Y.ARunnableS92S0000000_13;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.awemepushlib.interaction.PushSheduler;

/* JADX INFO: renamed from: X.0Vqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810420Vqi {
    public static volatile boolean LIZ;

    public static void LIZIZ() {
        try {
            Reflect reflectCall = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
            Class<?> cls = Class.forName("android.app.ActivityThread$H");
            if (reflectCall != null) {
                synchronized (cls) {
                    try {
                        Reflect reflectOn = Reflect.on(cls);
                        final int iIntValue = ((Integer) reflectOn.field("SCHEDULE_CRASH", new Class[0]).get()).intValue();
                        final int iIntValue2 = ((Integer) reflectOn.field("RECEIVER", new Class[0]).get()).intValue();
                        final int iIntValue3 = ((Integer) reflectOn.field("CREATE_SERVICE", new Class[0]).get()).intValue();
                        final int iIntValue4 = ((Integer) reflectOn.field("BIND_SERVICE", new Class[0]).get()).intValue();
                        final int iIntValue5 = ((Integer) reflectOn.field("SERVICE_ARGS", new Class[0]).get()).intValue();
                        Handler handler = (Handler) reflectCall.field("mH", new Class[0]).get();
                        if (handler != null) {
                            Reflect reflectOn2 = Reflect.on(handler);
                            final Handler.Callback callback = (Handler.Callback) reflectOn2.field("mCallback", Handler.Callback.class).get();
                            reflectOn2.set("mCallback", new Handler.Callback() { // from class: X.0NwA
                                @Override // android.os.Handler.Callback
                                public final boolean handleMessage(Message message) {
                                    int i;
                                    int i2 = iIntValue;
                                    int i3 = iIntValue2;
                                    int i4 = iIntValue3;
                                    int i5 = iIntValue4;
                                    int i6 = iIntValue5;
                                    Handler.Callback callback2 = callback;
                                    if (message == null) {
                                        return false;
                                    }
                                    int i7 = message.what;
                                    Object messageObj = HandlerHook.getMessageObj(message.obj);
                                    if (i7 == i2 && Build.VERSION.SDK_INT < 28 && (messageObj instanceof String)) {
                                        String str = (String) messageObj;
                                        if (str.contains("Bad notification posted from package")) {
                                            C2241008qG c2241008qG = new C2241008qG();
                                            c2241008qG.LIZ.put("message", str);
                                            C794240VDq.LIZJ("type_badnotification_error", c2241008qG.LJ());
                                            return true;
                                        }
                                    }
                                    if (!PushSheduler.LIZJ && ((i = message.what) == i3 || i == i4 || i == i6 || i == i5)) {
                                        try {
                                            String string = message.toString();
                                            if (string.contains("com.ss.android.newmedia.message") || string.contains("com.amazon") || string.contains("com.fcm") || string.contains("com.adm")) {
                                                C810890VrT c810890VrT = C810890VrT.LIZIZ;
                                                c810890VrT.LJFF("initPushByFlag_in_ifNeedStartPushImmediately");
                                                c810890VrT.LJIIL("initPushByFlag_in_ifNeedStartPushImmediately");
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("ifNeedStartPushImmdiately(), msgStr valid, calls initPushByFlag(), msgStr: ");
                                                sbLIZ.append(string);
                                                c810890VrT.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                                                PushSheduler.LIZ(3);
                                                c810890VrT.LJI("initPushByFlag_in_ifNeedStartPushImmediately");
                                                c810890VrT.LJIIJJI("initPushByFlag_in_ifNeedStartPushImmediately");
                                            }
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            C810890VrT.LIZIZ.LJFF("initPushByFlag_catch_error");
                                            C810890VrT.LIZIZ.LJIIL("initPushByFlag_catch_error");
                                            C810890VrT.LIZIZ.LJIIIZ("ifNeedStartPushImmdiately() catch exception, calls initPushByFlag()");
                                            PushSheduler.LIZ(3);
                                            C810890VrT.LIZIZ.LJI("initPushByFlag_catch_error");
                                            C810890VrT.LIZIZ.LJIIJJI("initPushByFlag_catch_error");
                                        }
                                    }
                                    if (callback2 == null) {
                                        return false;
                                    }
                                    return callback2.handleMessage(message);
                                }
                            });
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C810890VrT.LIZIZ.LIZIZ("exception_performHookActivityThreadForPush", th2);
        }
    }

    public static void LIZ(boolean z) {
        if (z) {
            C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new ARunnableS92S0000000_13(25));
            PushSheduler.LIZ.execute(new ARunnableS92S0000000_13(26));
        } else {
            LIZIZ();
        }
    }
}
