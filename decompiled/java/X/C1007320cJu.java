package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.playablecomponent.AnolePlayableComponentExtKt$parseGeckoAndLoadUrl$1", f = "AnolePlayableComponentExt.kt", l = {294, 298}, m = "invokeSuspend")
public final class C1007320cJu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1013880cUU LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007320cJu(C1013880cUU c1013880cUU, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1013880cUU;
        this.LLILZ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007320cJu(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnolePlayableComponentExtKt@32dd.parseGeckoAndLoadUrl$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AnolePlayableComponentExtKt@32dd.parseGeckoAndLoadUrl$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseGeckoAndLoadUrl, fromPreRender: ");
            sbLIZ.append(this.LLILLJJLI);
            C1022620cia.LJ("AnolePlayableComponent", C2188811AlT.LIZIZ(sbLIZ));
            C1007340cJw c1007340cJw = new C1007340cJw(this.LLILLL, null);
            this.LL = 1;
            obj = C099A.LIZJ(1500L, c1007340cJw, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AnolePlayableComponentExtKt@32dd.parseGeckoAndLoadUrl$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("parseGeckoAndLoadUrl, result: ");
        sbLIZ2.append(obj);
        C1022620cia.LJ("AnolePlayableComponent", C2188811AlT.LIZIZ(sbLIZ2));
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1007330cJv c1007330cJv = new C1007330cJv(this.LLILLL, null, this.LLILLJJLI, this.LLILZ);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1007330cJv) == objLJFF) {
            C1C7U.LIZIZ("AnolePlayableComponentExtKt@32dd.parseGeckoAndLoadUrl$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AnolePlayableComponentExtKt@32dd.parseGeckoAndLoadUrl$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
