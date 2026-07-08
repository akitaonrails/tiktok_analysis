package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0h2W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailPreloadManager$triggerPreloadWhenAnchorShow$1", f = "PoiDetailPreloadManager.kt", l = {161, 183}, m = "invokeSuspend")
public final class C1188740h2W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiAnchorExtra LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188740h2W(PoiAnchorExtra poiAnchorExtra, String str, Aweme aweme, String str2, InterfaceC1364105Vn<? super C1188740h2W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiAnchorExtra;
        this.LLILLL = str;
        this.LLILZ = aweme;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1188740h2W(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(1:64)|(1:(1:(3:6|62|63)(2:7|8))(1:14))(3:9|10|(2:12|13))|15|65|16|(1:18)(1:21)|22|(1:24)(1:25)|26|(1:28)(1:29)|30|(1:32)|33|(1:(3:55|(1:57)|(1:59))(1:54))(3:37|(1:45)(3:41|(1:43)|44)|(2:47|(2:49|50))(0))|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        X.C1205490hTX.LIZ.LJ(X.C1EMR.FEED_ANCHOR_CTR_SCORE_PARSE_ERROR, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1188740h2W.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
