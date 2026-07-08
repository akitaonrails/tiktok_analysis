package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class RunnableC966320bFm implements Runnable {
    public final /* synthetic */ Function0 LL;

    public RunnableC966320bFm(Function0 function0) {
        this.LL = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TrionesThreadHandler@9ade.sam$java_lang_Runnable$0");
        try {
            this.LL.invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TrionesThreadHandler@9ade.sam$java_lang_Runnable$0");
    }
}
