package X;

import android.nfc.tech.IsoDep;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.ccdc.nfc.EMVReader$intentListener$2$1$accept$1", f = "EMVReader.kt", l = {58}, m = "invokeSuspend")
public final class C593440NPi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1722550uvV LLILLJJLI;
    public final /* synthetic */ IsoDep LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593440NPi(IsoDep isoDep, C1722550uvV c1722550uvV, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1722550uvV;
        this.LLILLL = isoDep;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593440NPi(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EMVReader@4b4e.intentListener$2$1$accept$1");
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
            C1722550uvV c1722550uvV = this.LLILLJJLI;
            IsoDep isoDep = this.LLILLL;
            this.LL = 1;
            c1722550uvV.getClass();
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C1722510uvR(isoDep, c1722550uvV, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("EMVReader@4b4e.intentListener$2$1$accept$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EMVReader@4b4e.intentListener$2$1$accept$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
