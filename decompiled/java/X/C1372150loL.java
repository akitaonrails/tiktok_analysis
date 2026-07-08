package X;

import android.util.Log;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0loL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.business.AwemeShare$prepareParallel$2", f = "AwemeShare.kt", l = {851}, m = "invokeSuspend")
public final class C1372150loL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1371740lng LLILZ;
    public final /* synthetic */ AwemeSharePackage LLILZIL;
    public final /* synthetic */ C1371600lnS LLILZLL;
    public final /* synthetic */ ShareConfiguration<BaseSharePackage> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1372150loL(C1371600lnS c1371600lnS, C1371740lng c1371740lng, ShareConfiguration shareConfiguration, AwemeSharePackage awemeSharePackage, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1371740lng;
        this.LLILZIL = awemeSharePackage;
        this.LLILZLL = c1371600lnS;
        this.LLIZ = shareConfiguration;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1372150loL c1372150loL = new C1372150loL(this.LLILZLL, this.LLILZ, this.LLIZ, this.LLILZIL, interfaceC1364105Vn);
        c1372150loL.LLILLL = obj;
        return c1372150loL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        C1C7U.LIZ("AwemeShare@413d.prepareParallel$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            jCurrentTimeMillis = System.currentTimeMillis();
            C1DFB c1dfb = C0PEM.LIZJ;
            AnonymousClass0957[] anonymousClass0957Arr = {C23250099c.LIZIZ(interfaceC497601wk, c1dfb, null, new C1372160loM(this.LLILZLL, this.LLILZ, this.LLIZ, this.LLILZIL, null), 2), C23250099c.LIZIZ(interfaceC497601wk, c1dfb, null, new C1372140loK(this.LLILZLL, this.LLILZ, this.LLIZ, this.LLILZIL, null), 2)};
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            if (C1D9F.LIZIZ(anonymousClass0957Arr, this) == objLJFF) {
                C1C7U.LIZIZ("AwemeShare@413d.prepareParallel$2");
                return objLJFF;
            }
        }
        this.LLILZ.LIZIZ(this.LLILZIL, this.LLILZLL, this.LLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareParallel: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        Integer numLJ = C2286608xc.LJ(Log.d("zmy_share_test", C2188811AlT.LIZIZ(sbLIZ)));
        C1C7U.LIZIZ("AwemeShare@413d.prepareParallel$2");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
