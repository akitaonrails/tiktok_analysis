package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.140O, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PAAIGCManager", f = "C2PAAIGCManager.kt", l = {983}, m = "writeAIEffectC2PAToEffectPhoto")
public final class C140O extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C140D LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140O(C140D c140d, InterfaceC1364105Vn<? super C140O> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c140d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("C2PAAIGCManager@54f1.writeAIEffectC2PAToEffectPhoto$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIL = this.LLILLJJLI.LJJIL(null, this);
        C1C7U.LIZIZ("C2PAAIGCManager@54f1.writeAIEffectC2PAToEffectPhoto$1");
        return objLJJIL;
    }
}
