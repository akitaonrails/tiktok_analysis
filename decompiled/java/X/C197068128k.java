package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.128k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197068128k extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C197066128i LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C197068128k(boolean z, C197066128i c197066128i, String str) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c197066128i;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            C197066128i c197066128i = this.LLILLJJLI;
            String str = this.LLILLL;
            C197067128j c197067128j = c197066128i.LIZ;
            synchronized (c197067128j.LIZJ) {
                try {
                    c197067128j.LIZLLL.remove(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return Unit.LIZ;
    }
}
