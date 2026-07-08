package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wDK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKDataRequestOperator$start$3", f = "ECMMKDataOperator.kt", l = {214, 217}, m = "invokeSuspend")
public final class C1772040wDK extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super AbstractC1771170wBv>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1771590wCb LLILLL;
    public final /* synthetic */ C1772030wDJ LLILZ;
    public final /* synthetic */ EnumC1771830wCz LLILZIL;
    public final /* synthetic */ AbstractC1772170wDX LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772040wDK(C1771590wCb c1771590wCb, C1772030wDJ c1772030wDJ, EnumC1771830wCz enumC1771830wCz, AbstractC1772170wDX abstractC1772170wDX, InterfaceC1364105Vn<? super C1772040wDK> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c1771590wCb;
        this.LLILZ = c1772030wDJ;
        this.LLILZIL = enumC1771830wCz;
        this.LLILZLL = abstractC1772170wDX;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        C1C7U.LIZ("ECMMKDataRequestOperator@ed96.start$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th = (Throwable) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            th = (Throwable) this.LLILLJJLI;
            String message = th.getMessage();
            if (message == null) {
                message = "flow catch unknown error";
            }
            this.LLILLL.LJ = true;
            this.LLILZ.LIZ();
            if (this.LLILZIL == EnumC1771830wCz.REFRESH) {
                this.LLILZ.LIZJ.LJIIIZ(false, new C1772200wDa(this.LLILZLL.LIZ, message, false), false);
            } else {
                this.LLILZ.LIZJ.LJIIIIZZ(false, new C1772190wDZ(this.LLILLL));
            }
            if (Intrinsics.LJFF(this.LLILZLL.LIZ.LJFF, "first_fetch")) {
                this.LLILZ.LJII = true;
            }
            int i2 = C1771850wD1.LIZ[this.LLILZIL.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    C2252321DDq c2252321DDq = this.LLILZ.LIZIZ.LLJJI;
                    C1772330wDn c1772330wDn = new C1772330wDn(this.LLILLL, message);
                    this.LLILLJJLI = th;
                    this.LL = 2;
                    c2252321DDq.setValue(c1772330wDn);
                    if (Unit.LIZ == objLJFF) {
                        C1C7U.LIZIZ("ECMMKDataRequestOperator@ed96.start$3");
                        return objLJFF;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C2252321DDq c2252321DDq2 = this.LLILZ.LIZIZ.LLJJIII;
                C1772300wDk c1772300wDk = new C1772300wDk(EnumC863080XtS.REFRESH_ERROR);
                this.LLILLJJLI = th;
                this.LL = 1;
                c2252321DDq2.setValue(c1772300wDk);
                if (Unit.LIZ == objLJFF) {
                    C1C7U.LIZIZ("ECMMKDataRequestOperator@ed96.start$3");
                    return objLJFF;
                }
            }
        }
        C1768370w7P.LIZ(th, EnumC1771210wBz.REQUEST_ERROR, "ECMMKDataRequestOperator:start", null);
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKDataRequestOperator@ed96.start$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super AbstractC1771170wBv> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1772040wDK c1772040wDK = new C1772040wDK(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1772040wDK.LLILLJJLI = th;
        return c1772040wDK.invokeSuspend(Unit.LIZ);
    }
}
