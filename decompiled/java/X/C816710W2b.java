package X;

import com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0W2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource$performFullUpdate$3", f = "StorageDataSource.kt", l = {}, m = "invokeSuspend")
public final class C816710W2b extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super LocalListResponse>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C816710W2b(InterfaceC1364105Vn<? super C816710W2b> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageDataSource@15ec.performFullUpdate$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1327105Hh.LIZ("DataSource", "getAllPagingFlow error", (Throwable) this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StorageDataSource@15ec.performFullUpdate$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super LocalListResponse> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C816710W2b c816710W2b = new C816710W2b(interfaceC1364105Vn);
        c816710W2b.LL = th;
        return c816710W2b.invokeSuspend(Unit.LIZ);
    }
}
