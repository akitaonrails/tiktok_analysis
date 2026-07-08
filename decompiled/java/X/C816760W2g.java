package X;

import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0W2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {232}, m = "assembleMafInfo")
public final class C816760W2g<T extends User> extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C816720W2c LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816760W2g(C816720W2c c816720W2c, InterfaceC1364105Vn<? super C816760W2g> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c816720W2c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StorageDataSource@15ec.assembleMafInfo$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(null, null, this);
        C1C7U.LIZIZ("StorageDataSource@15ec.assembleMafInfo$1");
        return objLIZ;
    }
}
