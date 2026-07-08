package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0LmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.AIGCWorkflowNodeSpec", f = "AIGCWorkflowNodeSpec.kt", l = {65, 66, 67}, m = "tryPreloadOutput")
public final class C552910LmL extends AbstractC23140094w {
    public Object LL;
    public InterfaceC551900Lki LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C552890LmJ<InterfaceC551900Lki<Object>, Serializable, Object, Object> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C552910LmL(C552890LmJ<InterfaceC551900Lki<Object>, Serializable, Object, Object> c552890LmJ, InterfaceC1364105Vn<? super C552910LmL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c552890LmJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowNodeSpec@a941.tryPreloadOutput$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowNodeSpec@a941.tryPreloadOutput$1");
        return objLIZIZ;
    }
}
