package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.0W2O, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.perf.DBEntireDiffer", f = "DBEntireDiffer.kt", l = {48}, m = "beforeFullUpdate")
public final class C0W2O extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0W2M LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W2O(C0W2M c0w2m, InterfaceC1364105Vn<? super C0W2O> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0w2m;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("DBEntireDiffer@2cad.beforeFullUpdate$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(this);
        C1C7U.LIZIZ("DBEntireDiffer@2cad.beforeFullUpdate$1");
        return objLIZIZ;
    }
}
