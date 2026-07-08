package X;

import com.bytedance.ies.im.core.proxy.multi.DefaultIMClientProcessor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YHY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YHY extends C09AY implements Function0<C0YH4> {
    public final /* synthetic */ C0YHW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YHY(C0YHW c0yhw) {
        super(0);
        this.LL = c0yhw;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0YH4 invoke() {
        C0YHW c0yhw = this.LL;
        C0YHV c0yhv = c0yhw.LJI;
        if (c0yhv == null) {
            synchronized (c0yhw) {
                c0yhv = c0yhw.LJI;
                if (c0yhv == null) {
                    c0yhv = (C0YHV) C1807670x8n.LJJIIZI();
                    c0yhw.LJI = c0yhv;
                }
            }
        }
        c0yhv.LIZ.getClass();
        return DefaultIMClientProcessor.LIZ();
    }
}
