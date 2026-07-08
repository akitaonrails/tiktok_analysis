package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00y7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC251300y7 implements Runnable {
    public final /* synthetic */ C01BC LL;
    public final /* synthetic */ C20743716Ff LLILLJJLI;
    public final /* synthetic */ boolean LLILLL = true;
    public final /* synthetic */ int LLILZ = 2;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    public RunnableC251300y7(C01BC c01bc, C20743716Ff c20743716Ff, Function0 function0) {
        this.LL = c01bc;
        this.LLILLJJLI = c20743716Ff;
        this.LLILZIL = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SubOnlyChatModuleController@df9b.setSubOnlyChatEnabledDelay$1");
        try {
            this.LL.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubOnlyChatModuleController@df9b.setSubOnlyChatEnabledDelay$1");
    }
}
