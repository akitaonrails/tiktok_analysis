package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0loK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.business.AwemeShare$prepareParallel$2$addActionConfigDeferred$1", f = "AwemeShare.kt", l = {}, m = "invokeSuspend")
public final class C1372140loK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1371740lng LL;
    public final /* synthetic */ AwemeSharePackage LLILLJJLI;
    public final /* synthetic */ C1371600lnS LLILLL;
    public final /* synthetic */ ShareConfiguration<BaseSharePackage> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1372140loK(C1371600lnS c1371600lnS, C1371740lng c1371740lng, ShareConfiguration shareConfiguration, AwemeSharePackage awemeSharePackage, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1371740lng;
        this.LLILLJJLI = awemeSharePackage;
        this.LLILLL = c1371600lnS;
        this.LLILZ = shareConfiguration;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1372140loK(this.LLILLL, this.LL, this.LLILZ, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeShare@413d.prepareParallel$2$addActionConfigDeferred$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeShare@413d.prepareParallel$2$addActionConfigDeferred$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
