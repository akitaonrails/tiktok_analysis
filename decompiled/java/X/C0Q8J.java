package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q8J, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q8J {
    public static final C0Q8J INSTANCE;
    public static final /* synthetic */ C0Q8J[] LLILLJJLI;
    public final LinkedList<Future> LL;
    public final ExecutorService executorService;

    static {
        C0Q8J c0q8j = new C0Q8J();
        INSTANCE = c0q8j;
        LLILLJJLI = new C0Q8J[]{c0q8j};
    }

    public C0Q8J() {
        new HashMap();
        this.executorService = C823050WQl.LIZ(new C2123508Tp(new C2123408To(C0WQX.SERIAL)));
        this.LL = new LinkedList<>();
    }

    public static C0Q8J[] values() {
        return (C0Q8J[]) LLILLJJLI.clone();
    }

    public static C0Q8J valueOf(String str) {
        return (C0Q8J) C08FF.LIZ(C0Q8J.class, str);
    }

    public void async(Runnable runnable) {
        this.LL.add(this.executorService.submit(runnable));
    }

    public View getView(Context context, int i, ViewGroup viewGroup) {
        return C0J4C.INSTANCE.inflate(context, i, viewGroup);
    }
}
