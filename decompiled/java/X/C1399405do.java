package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.api.DetailApiProxyImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.model.ECMixFeedAwemeListModel$refreshList$1$firstAweme$1", f = "ECMixFeedAwemeListModel.kt", l = {}, m = "invokeSuspend")
public final class C1399405do extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Aweme>, Object> {
    public final /* synthetic */ C2189821An6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1399405do(C2189821An6 c2189821An6, InterfaceC1364105Vn<? super C1399405do> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2189821An6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1399405do(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme awemeLIZ;
        String aid;
        C1C7U.LIZ("ECMixFeedAwemeListModel@943d.refreshList$1$firstAweme$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C2189821An6 c2189821An6 = this.LL;
            if (c2189821An6 == null || (aid = c2189821An6.getAid()) == null) {
                aid = "";
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C703302op.LIZ(aid)) {
            awemeLIZ = DetailApiProxyImpl.LIZIZ().LIZ(aid);
        } else {
            awemeLIZ = null;
        }
        C1C7U.LIZIZ("ECMixFeedAwemeListModel@943d.refreshList$1$firstAweme$1");
        return awemeLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Aweme> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
