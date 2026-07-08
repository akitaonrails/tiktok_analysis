package X;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HNC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.view.AliveButtonView$1$1", f = "AliveButtonView.kt", l = {338, 348}, m = "invokeSuspend")
public final class C0HNC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C440750HQb LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C440750HQb LLILZ;
    public final /* synthetic */ C440830HQj LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HNC(C440750HQb c440750HQb, C440830HQj c440830HQj, int i, boolean z, InterfaceC1364105Vn<? super C0HNC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c440750HQb;
        this.LLILZIL = c440830HQj;
        this.LLILZLL = i;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HNC(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C440750HQb c440750HQb;
        boolean z;
        boolean zBooleanValue;
        Object objLIZIZ = obj;
        C1C7U.LIZ("AliveButtonView@476a.<init>$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AliveButtonView@476a.<init>$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.LLILLJJLI;
            c440750HQb = this.LL;
            C155000ia.LIZIZ(objLIZIZ);
            zBooleanValue = ((Boolean) objLIZIZ).booleanValue();
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            c440750HQb = this.LLILZ;
            InterfaceC440090HNn interfaceC440090HNn = c440750HQb.LLJILJIL;
            String str = this.LLILZIL.LIZLLL;
            int i2 = this.LLILZLL;
            z = this.LLIZ;
            if (interfaceC440090HNn != null && str != null) {
                MixStudioStatusRepository taskStatusDataService = c440750HQb.getTaskStatusDataService();
                if (taskStatusDataService != null) {
                    String str2 = c440750HQb.LLJIJIL;
                    C441470HSv c441470HSv = c440750HQb.LLILLJJLI;
                    this.LL = c440750HQb;
                    this.LLILLJJLI = z;
                    this.LLILLL = 1;
                    objLIZIZ = taskStatusDataService.LIZIZ(str2, str, i2, interfaceC440090HNn, c441470HSv, 1, this);
                    if (objLIZIZ == objLJFF) {
                        C1C7U.LIZIZ("AliveButtonView@476a.<init>$1$1");
                        return objLJFF;
                    }
                    zBooleanValue = ((Boolean) objLIZIZ).booleanValue();
                } else {
                    zBooleanValue = false;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AliveButtonView@476a.<init>$1$1");
            return unit2;
        }
        c440750HQb.LIZIZ(zBooleanValue, EnumC440870HQn.STATIC, EnumC440870HQn.ANIMATED);
        if (c440750HQb.isAttachedToWindow()) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0HNB c0hnb = new C0HNB(zBooleanValue, z, c440750HQb, null);
            this.LL = null;
            this.LLILLL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c0hnb) == objLJFF) {
                C1C7U.LIZIZ("AliveButtonView@476a.<init>$1$1");
                return objLJFF;
            }
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("AliveButtonView@476a.<init>$1$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
