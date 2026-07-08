package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class RunnableC966310bFl implements Runnable {
    public final /* synthetic */ Function0 LL;

    public RunnableC966310bFl(Function0 function0) {
        this.LL = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TrionesTheadExtKt@6a6b.sam$i$java_lang_Runnable$0");
        try {
            this.LL.invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TrionesTheadExtKt@6a6b.sam$i$java_lang_Runnable$0");
    }
}
