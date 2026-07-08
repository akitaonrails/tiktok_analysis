package X;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0XGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractRunnableC845900XGi implements InterfaceC845920XGk, Runnable, Comparable<InterfaceC845920XGk>, WeakHandler.IHandler {
    public static C845890XGh LLIZ = C845890XGh.LIZ();
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public final WeakHandler LLILLL = new WeakHandler(Looper.getMainLooper(), this);
    public int LLILZ;
    public final String LLILZIL;
    public final EnumC845870XGf LLILZLL;

    @Override // java.lang.Runnable
    public void run() {
        C1C7U.LIZ("ApiThread@986e.run");
        C1C7U.LIZIZ("ApiThread@986e.run");
    }

    @Override // X.InterfaceC845920XGk
    public final int LIZJ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC845920XGk
    public final EnumC845870XGf getPriority() {
        return this.LLILZLL;
    }

    public AbstractRunnableC845900XGi(EnumC845870XGf enumC845870XGf) {
        this.LLILZLL = enumC845870XGf;
        this.LLILZIL = C2093608Ic.LJ(null) ? getClass().getSimpleName() : null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC845920XGk interfaceC845920XGk) {
        InterfaceC845920XGk interfaceC845920XGk2 = interfaceC845920XGk;
        EnumC845870XGf enumC845870XGf = this.LLILZLL;
        EnumC845870XGf priority = interfaceC845920XGk2.getPriority();
        if (enumC845870XGf == null) {
            enumC845870XGf = EnumC845870XGf.NORMAL;
        }
        if (priority == null) {
            priority = EnumC845870XGf.NORMAL;
        }
        if (enumC845870XGf == priority) {
            return this.LLILZ - interfaceC845920XGk2.LIZJ();
        }
        return priority.ordinal() - enumC845870XGf.ordinal();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        try {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    LLIZ.LIZIZ();
                    return;
                }
                return;
            }
            LLIZ.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
