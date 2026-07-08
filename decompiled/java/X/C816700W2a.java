package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0W2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource$performFullUpdate$2", f = "StorageDataSource.kt", l = {}, m = "invokeSuspend")
public final class C816700W2a extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super LocalListResponse>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C0W2P LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816700W2a(C013C c013c, C0W2P c0w2p, InterfaceC1364105Vn<? super C816700W2a> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = c0w2p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        boolean z;
        C1C7U.LIZ("StorageDataSource@15ec.performFullUpdate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        C013C c013c = this.LLILLJJLI;
        if (th == null) {
            z = true;
        } else {
            z = false;
        }
        c013c.element = z;
        C0W2P c0w2p = this.LLILLL;
        c0w2p.LJFF.put("api_sum_cost", c0w2p.LIZIZ.invoke().longValue() - c0w2p.LJI);
        if (th != null) {
            c0w2p.LJFF.put("is_api_succeed", CardStruct.IStatusCode.DEFAULT);
            c0w2p.LJFF.put("api_error_msg", th.getMessage());
        } else {
            c0w2p.LJFF.put("is_api_succeed", "1");
        }
        c0w2p.LJFF.put("is_db_succeed", CardStruct.IStatusCode.DEFAULT);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StorageDataSource@15ec.performFullUpdate$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super LocalListResponse> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C816700W2a c816700W2a = new C816700W2a(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c816700W2a.LL = th;
        return c816700W2a.invokeSuspend(Unit.LIZ);
    }
}
