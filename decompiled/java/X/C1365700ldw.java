package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ToastHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ldw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ToastHelper$showToast$1", f = "ToastHelper.kt", l = {357, 67, 78, 87}, m = "invokeSuspend")
public final class C1365700ldw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public EnumC1365740le0 LLILLJJLI;
    public ToastHelper LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Function0 LLILZLL;
    public C0ZTY LLIZ;
    public long LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public final /* synthetic */ ToastHelper LLJILJILJ;
    public final /* synthetic */ EnumC1365740le0 LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ long LLJJI;
    public final /* synthetic */ boolean LLJJIII;
    public final /* synthetic */ int LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;
    public final /* synthetic */ boolean LLJJIJIL;
    public final /* synthetic */ Function0<Unit> LLJJJ;
    public final /* synthetic */ C0ZTY LLJJJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365700ldw(ToastHelper toastHelper, EnumC1365740le0 enumC1365740le0, String str, long j, boolean z, int i, String str2, boolean z2, Function0<Unit> function0, C0ZTY c0zty, InterfaceC1364105Vn<? super C1365700ldw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJILJ = toastHelper;
        this.LLJILLL = enumC1365740le0;
        this.LLJJ = str;
        this.LLJJI = j;
        this.LLJJIII = z;
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = str2;
        this.LLJJIJIL = z2;
        this.LLJJJ = function0;
        this.LLJJJIL = c0zty;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1365700ldw(this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ToastHelper toastHelper;
        InterfaceC383701eN interfaceC383701eN;
        EnumC1365740le0 enumC1365740le0;
        String str;
        long j;
        boolean z;
        int i;
        String str2;
        boolean z2;
        Function0<Unit> function0;
        C0ZTY c0zty;
        boolean z3;
        C1C7U.LIZ("ToastHelper@5030.showToast$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLJILJIL;
        try {
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3 && i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC383701eN = this.LL;
                        C155000ia.LIZIZ(obj);
                        interfaceC383701eN.LIZIZ(null);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ToastHelper@5030.showToast$1");
                        return unit;
                    }
                    z2 = this.LLJI;
                    i = this.LLJIJIL;
                    z = this.LLJ;
                    j = this.LLIZLLLIL;
                    c0zty = this.LLIZ;
                    function0 = this.LLILZLL;
                    str2 = (String) this.LLILZIL;
                    str = (String) this.LLILZ;
                    toastHelper = this.LLILLL;
                    enumC1365740le0 = this.LLILLJJLI;
                    interfaceC383701eN = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    toastHelper = this.LLJILJILJ;
                    interfaceC383701eN = toastHelper.LJ;
                    enumC1365740le0 = this.LLJILLL;
                    str = this.LLJJ;
                    j = this.LLJJI;
                    z = this.LLJJIII;
                    i = this.LLJJIJI;
                    str2 = this.LLJJIJIIJIL;
                    z2 = this.LLJJIJIL;
                    function0 = this.LLJJJ;
                    c0zty = this.LLJJJIL;
                    this.LL = interfaceC383701eN;
                    this.LLILLJJLI = enumC1365740le0;
                    this.LLILLL = toastHelper;
                    this.LLILZ = str;
                    this.LLILZIL = str2;
                    this.LLILZLL = function0;
                    this.LLIZ = c0zty;
                    this.LLIZLLLIL = j;
                    this.LLJ = z;
                    this.LLJIJIL = i;
                    this.LLJI = z2;
                    this.LLJILJIL = 1;
                    if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                        C1C7U.LIZIZ("ToastHelper@5030.showToast$1");
                        return objLJFF;
                    }
                }
                int i3 = C1365730ldz.LIZ[enumC1365740le0.ordinal()];
                boolean z4 = true;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            C1DFH c1dfh = C0PEM.LIZ;
                            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                            if (!z) {
                                z4 = false;
                            }
                            Function0<Unit> function02 = function0;
                            long j2 = j;
                            ToastHelper toastHelper2 = toastHelper;
                            String str3 = str;
                            C1365710ldx c1365710ldx = new C1365710ldx(toastHelper2, str3, j2, function02, z4, i, str2, c0zty, null);
                            this.LL = interfaceC383701eN;
                            this.LLILLJJLI = null;
                            this.LLILLL = null;
                            this.LLILZ = null;
                            this.LLILZIL = null;
                            this.LLILZLL = null;
                            this.LLIZ = null;
                            this.LLJILJIL = 4;
                            if (C23250099c.LJI(this, abstractC2238408pq, c1365710ldx) == objLJFF) {
                                C1C7U.LIZIZ("ToastHelper@5030.showToast$1");
                                return objLJFF;
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        C1DFH c1dfh2 = C0PEM.LIZ;
                        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                        if (z2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C1365670ldt c1365670ldt = new C1365670ldt(toastHelper, str, j, str2, z3, null);
                        this.LL = interfaceC383701eN;
                        this.LLILLJJLI = null;
                        this.LLILLL = null;
                        this.LLILZ = null;
                        this.LLILZIL = null;
                        this.LLILZLL = null;
                        this.LLIZ = null;
                        this.LLJILJIL = 3;
                        if (C23250099c.LJI(this, abstractC2238408pq2, c1365670ldt) == objLJFF) {
                            C1C7U.LIZIZ("ToastHelper@5030.showToast$1");
                            return objLJFF;
                        }
                    }
                } else {
                    C1DFH c1dfh3 = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq3 = C2107308Nj.LIZ;
                    if (!z2) {
                        z4 = false;
                    }
                    C1365680ldu c1365680ldu = new C1365680ldu(toastHelper, str, j, z, i, str2, z4, null);
                    this.LL = interfaceC383701eN;
                    this.LLILLJJLI = null;
                    this.LLILLL = null;
                    this.LLILZ = null;
                    this.LLILZIL = null;
                    this.LLILZLL = null;
                    this.LLIZ = null;
                    this.LLJILJIL = 2;
                    if (C23250099c.LJI(this, abstractC2238408pq3, c1365680ldu) == objLJFF) {
                        C1C7U.LIZIZ("ToastHelper@5030.showToast$1");
                        return objLJFF;
                    }
                }
                interfaceC383701eN.LIZIZ(null);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ToastHelper@5030.showToast$1");
                return unit2;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                interfaceC383701eN.LIZIZ(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
