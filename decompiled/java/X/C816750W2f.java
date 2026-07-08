package X;

import com.ss.android.ugc.aweme.relation.storage.model.LocalData;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0W2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {164, 172}, m = "handleResponse")
public final class C816750W2f extends AbstractC23140094w {
    public Object LL;
    public C0W2P LLILLJJLI;
    public C013C LLILLL;
    public Object LLILZ;
    public LocalData LLILZIL;
    public Object LLILZLL;
    public C013C LLIZ;
    public long LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C816720W2c LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816750W2f(C816720W2c c816720W2c, InterfaceC1364105Vn<? super C816750W2f> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c816720W2c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StorageDataSource@15ec.handleResponse$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLJI.LIZJ(null, null, 0L, this);
        C1C7U.LIZIZ("StorageDataSource@15ec.handleResponse$1");
        return objLIZJ;
    }
}
