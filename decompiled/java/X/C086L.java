package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.childhook.MajorComponentsAllowList;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.086L, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C086L {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
            Field declaredField = objInvoke.getClass().getDeclaredField("mH");
            declaredField.setAccessible(true);
            Handler handler = (Handler) declaredField.get(objInvoke);
            Field declaredField2 = Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            final Handler.Callback callback = (Handler.Callback) declaredField2.get(handler);
            declaredField2.set(handler, new Handler.Callback() { // from class: X.086M
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    String str;
                    if (message.what == 113) {
                        try {
                            Field declaredField3 = HandlerHook.getMessageObj(message.obj).getClass().getDeclaredField("info");
                            declaredField3.setAccessible(true);
                            Object obj = declaredField3.get(HandlerHook.getMessageObj(message.obj));
                            Field field = obj.getClass().getField("name");
                            field.setAccessible(true);
                            str = (String) field.get(obj);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJFF(e, "ChildBroadcastReceiverHook.getClassName");
                            str = "";
                        }
                        try {
                            Field declaredField4 = HandlerHook.getMessageObj(message.obj).getClass().getDeclaredField("intent");
                            declaredField4.setAccessible(true);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C1AF0.LJFF(e2, "ChildBroadcastReceiverHook.getIntent");
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C086N() { // from class: X.08Id
                            @Override // X.C086N
                            public final boolean LIZIZ() {
                                return true;
                            }

                            @Override // X.C086N
                            public final boolean LIZ(String str2) {
                                List list;
                                C2093808Ie.LIZ.getClass();
                                MajorComponentsAllowList majorComponentsAllowList = C2093808Ie.LIZIZ;
                                if (majorComponentsAllowList == null || (list = majorComponentsAllowList.broadcastReceivers) == null) {
                                    list = C13BV.INSTANCE;
                                }
                                if (!list.isEmpty()) {
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (C2093608Ic.LIZJ((String) it2.next(), str2)) {
                                            return true;
                                        }
                                    }
                                    return false;
                                }
                                return false;
                            }
                        });
                        arrayList.add(new C086N() { // from class: X.086O
                            @Override // X.C086N
                            public final boolean LIZ(String str2) {
                                return true;
                            }

                            @Override // X.C086N
                            public final boolean LIZIZ() {
                                return false;
                            }
                        });
                        if (arrayList.size() > 0) {
                            int size = arrayList.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                if (((C086N) ListProtector.get(arrayList, i)).LIZ(str)) {
                                    if (((C086N) ListProtector.get(arrayList, i)).LIZIZ()) {
                                        Handler.Callback callback2 = callback;
                                        if (callback2 == null) {
                                            return false;
                                        }
                                        return callback2.handleMessage(message);
                                    }
                                } else {
                                    i++;
                                }
                            }
                        }
                        return true;
                    }
                    Handler.Callback callback3 = callback;
                    if (callback3 == null) {
                        return false;
                    }
                    return callback3.handleMessage(message);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "ChildBroadcastReceiverHook.startHook");
        }
    }
}
