package X;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05iw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.iconfile.DefaultIconLoadManager$downloadIcon$2$1", f = "DefaultIconLoadManager.kt", l = {23}, m = "invokeSuspend")
public final class C1431205iw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC20236714Gf<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1431205iw(String str, boolean z, InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf, InterfaceC1364105Vn<? super C1431205iw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1431205iw(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIconLoadManager@f2b6.downloadIcon$2$1");
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
            C609790Nvt c609790Nvt = C609790Nvt.LIZ;
            String str = this.LLILLJJLI;
            boolean z = this.LLILLL;
            this.LL = 1;
            c609790Nvt.getClass();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            Set<String> set = C609790Nvt.LIZJ;
            if (set.contains(str)) {
                C189200o6.m2constructorimpl(true);
                c2252611DEt.resumeWith(true);
            }
            set.add(str);
            C609790Nvt.LJFF.put(str, C23250099c.LIZLLL(C609790Nvt.LIZIZ, null, null, new C609770Nvr(str, z, c2252611DEt, null), 3));
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultIconLoadManager@f2b6.downloadIcon$2$1");
                return objLJFF;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = this.LLILZ;
        C189200o6.m2constructorimpl(boolValueOf);
        interfaceC20236714Gf.resumeWith(boolValueOf);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIconLoadManager@f2b6.downloadIcon$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
