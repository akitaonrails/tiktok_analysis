package X;

import android.os.Message;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.082R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C082R {
    public final Method LIZ;
    public final Method LIZIZ;
    public final Object LIZJ;

    public C082R(Class cls, Object obj) {
        this.LIZ = cls.getDeclaredMethod("messageDispatchStarting", new Class[0]);
        this.LIZIZ = cls.getDeclaredMethod("messageDispatched", Object.class, Message.class);
        this.LIZJ = obj;
    }
}
