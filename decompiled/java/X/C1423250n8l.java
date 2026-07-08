package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.favorite.TemplateFavoriteResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import r4m.k0;

/* JADX INFO: renamed from: X.0n8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCoreComponent$templateFavorite$2", f = "TemplateCoreComponent.kt", l = {294, 295}, m = "invokeSuspend")
public final class C1423250n8l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1423230n8j LLILLL;
    public final /* synthetic */ C1419590n2r LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1423250n8l(C1423230n8j c1423230n8j, C1419590n2r c1419590n2r, boolean z, Function1<? super Boolean, Unit> function1, String str, int i, InterfaceC1364105Vn<? super C1423250n8l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1423230n8j;
        this.LLILZ = c1419590n2r;
        this.LLILZIL = z;
        this.LLILZLL = function1;
        this.LLIZ = str;
        this.LLIZLLLIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1423250n8l(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Object objLIZ = obj;
        C1C7U.LIZ("TemplateCoreComponent@d4ef.templateFavorite$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TemplateCoreComponent@d4ef.templateFavorite$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = this.LL;
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            jCurrentTimeMillis = System.currentTimeMillis();
            k0 k0Var = this.LLILLL.LLILZIL;
            C1419590n2r c1419590n2r = this.LLILZ;
            boolean z = this.LLILZIL;
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            objLIZ = k0Var.LJ.LIZ(c1419590n2r.LIZ.getResource_id(), z, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("TemplateCoreComponent@d4ef.templateFavorite$2");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1423240n8k c1423240n8k = new C1423240n8k((TemplateFavoriteResponse) objLIZ, this.LLILLL, this.LLILZIL, this.LLILZ, this.LLILZLL, this.LLIZ, jCurrentTimeMillis, this.LLIZLLLIL, null);
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1423240n8k) == objLJFF) {
            C1C7U.LIZIZ("TemplateCoreComponent@d4ef.templateFavorite$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateCoreComponent@d4ef.templateFavorite$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
