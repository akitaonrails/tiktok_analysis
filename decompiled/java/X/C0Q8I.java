package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q8I, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q8I {
    public static final C0Q8I INSTANCE;
    public static final /* synthetic */ C0Q8I[] LLILLL;
    public final Map<Class, Object> LL = new HashMap();
    public final ExecutorService executorService = C823050WQl.LIZ(new C2123508Tp(new C2123408To(C0WQX.SERIAL)));
    public final ConcurrentLinkedQueue<Future> LLILLJJLI = new ConcurrentLinkedQueue<>();

    static {
        C0Q8I c0q8i = new C0Q8I();
        INSTANCE = c0q8i;
        LLILLL = new C0Q8I[]{c0q8i};
    }

    public static C0Q8I[] values() {
        return (C0Q8I[]) LLILLL.clone();
    }

    public void await() {
        Iterator<Future> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().get();
            } catch (InterruptedException | ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLILLJJLI.clear();
    }

    public static C0Q8I valueOf(String str) {
        return (C0Q8I) C08FF.LIZ(C0Q8I.class, str);
    }

    public void async(Runnable runnable) {
        this.LLILLJJLI.offer(this.executorService.submit(runnable));
    }

    public <T> T computeIfAbsent(Class<T> cls, InterfaceC649880PeM<Class<T>, T> interfaceC649880PeM) {
        T t = (T) ((HashMap) this.LL).get(cls);
        if (t == null) {
            return interfaceC649880PeM.apply(cls);
        }
        ((HashMap) this.LL).remove(cls);
        return t;
    }

    public View getView(Context context, int i, ViewGroup viewGroup) {
        return C0J4D.INSTANCE.inflate(context, i, viewGroup);
    }

    public View getView(LayoutInflater layoutInflater, Context context, int i, ViewGroup viewGroup) {
        return C0J4D.INSTANCE.inflate(layoutInflater, context, i, viewGroup);
    }
}
