package X;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.086U, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C086U {
    public static final Set<Integer> LIZ;
    public static Boolean LIZIZ;
    public static boolean LIZJ;

    static {
        HashSet hashSet = new HashSet();
        LIZ = hashSet;
        LIZIZ = null;
        LIZJ = false;
        hashSet.add(113);
        hashSet.add(114);
        hashSet.add(115);
        hashSet.add(116);
        hashSet.add(121);
        hashSet.add(122);
        hashSet.add(100);
        hashSet.add(159);
        hashSet.add(123);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00de A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:29:0x009b, B:31:0x00b0, B:33:0x00c0, B:35:0x00c6, B:37:0x00d6, B:39:0x00dc, B:41:0x00de, B:43:0x00eb, B:45:0x00f3, B:47:0x0103, B:49:0x0109, B:51:0x0119, B:53:0x011f, B:55:0x0122), top: B:68:0x009b, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ() {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C086U.LIZIZ():boolean");
    }

    public static boolean LIZ(Message message) {
        ComponentName component;
        int i = message.what;
        if (i != 100) {
            if (i != 113) {
                if (i == 159) {
                    return false;
                }
            } else if (!"intent".isEmpty() && HandlerHook.getMessageObj(message.obj) != null) {
                try {
                    Field declaredField = HandlerHook.getMessageObj(message.obj).getClass().getDeclaredField("intent");
                    declaredField.setAccessible(true);
                    Intent intent = (Intent) declaredField.get(HandlerHook.getMessageObj(message.obj));
                    if (intent != null && (component = intent.getComponent()) != null) {
                        LIZJ = component.getClassName().equals("com.google.firebase.iid.FirebaseInstanceIdReceiver");
                        return true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
