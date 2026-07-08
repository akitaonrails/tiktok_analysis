package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NFN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.component.ReachBottomCachePoolDelegate$CallbackWrapper$handleResult$1", f = "ReachBottomCachePoolDelegate.kt", l = {}, m = "invokeSuspend")
public final class C0NFN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C591480NHu LL;
    public final /* synthetic */ C0NFS LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NFN(C591480NHu c591480NHu, C0NFS c0nfs, InterfaceC1364105Vn<? super C0NFN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c591480NHu;
        this.LLILLJJLI = c0nfs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NFN(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0NHH c0nhh;
        C1C7U.LIZ("ReachBottomCachePoolDelegate$CallbackWrapper@2481.handleResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C591480NHu c591480NHu = this.LL;
        if (c591480NHu.LIZ && (c0nhh = c591480NHu.LIZIZ) != null) {
            Aweme aweme = c0nhh.LIZLLL;
            if (aweme != null) {
                AwemeBizOptExtKt.setAwemeCacheType(aweme, 2);
            }
            Aweme aweme2 = c0nhh.LIZLLL;
            if (aweme2 != null) {
                C0OBE.LIZIZ(aweme2, "common_cache_item", c0nhh);
            }
        }
        this.LLILLJJLI.LIZ.LIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReachBottomCachePoolDelegate$CallbackWrapper@2481.handleResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
