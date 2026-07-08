package X;

import Y.AgS284S0100000_3;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.096U, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.core.SmartMovieMediaProcessor$compressMetaAsFlow$1$forwardJob$1", f = "SmartMovieMediaProcessor.kt", l = {208}, m = "invokeSuspend")
public final class C096U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MetaExt LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ CreativeInfo LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ C094D<C096Q> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C096U(MetaExt metaExt, String str, String str2, CreativeInfo creativeInfo, boolean z, long j, C094D<? super C096Q> c094d, InterfaceC1364105Vn<? super C096U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = metaExt;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = creativeInfo;
        this.LLILZLL = z;
        this.LLIZ = j;
        this.LLIZLLLIL = c094d;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C096U(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1$forwardJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C096N c096n = C096N.LIZ;
            MetaExt metaExt = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            CreativeInfo creativeInfo = this.LLILZIL;
            boolean z = this.LLILZLL;
            long j = this.LLIZ;
            c096n.getClass();
            b bVarLJ = C09IC.LJ(new C096T(z, metaExt, str, creativeInfo, str2, j, null));
            AgS284S0100000_3 agS284S0100000_3 = new AgS284S0100000_3(this.LLIZLLLIL, 21);
            this.LL = 1;
            if (bVarLJ.collect(agS284S0100000_3, this) == objLJFF) {
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1$forwardJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1$forwardJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
