package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01t4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.utils.MinisGuidanceSheetUtil$loadLottieComposition$1$1", f = "MinisGuidanceSheetUtil.kt", l = {74}, m = "invokeSuspend")
public final class C474801t4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0VSP LL;
    public int LLILLJJLI;
    public final /* synthetic */ File LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474801t4(File file, InterfaceC1364105Vn<? super C474801t4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C474801t4(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0VSP c0vsp;
        String name;
        C1C7U.LIZ("MinisGuidanceSheetUtil@389c.loadLottieComposition$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        Throwable th = null;
        if (i != 0) {
            if (i == 1) {
                c0vsp = this.LL;
                try {
                    C155000ia.LIZIZ(obj);
                    C2107108Nh.LIZ(c0vsp, null);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MinisGuidanceSheetUtil@389c.loadLottieComposition$1$1");
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsp, th);
                                throw th;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c0vsp = new C0VSP(this.LLILLL);
            File file = this.LLILLL;
            if (file == null) {
                name = null;
            } else {
                try {
                    name = file.getName();
                } catch (Throwable th6) {
                    th = th6;
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1292000jj4<C1294720jnS> c1292000jj4LJFF = C1294250jmh.LJFF(c0vsp, name);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C474901t5 c474901t5 = new C474901t5(c1292000jj4LJFF, null);
            this.LL = c0vsp;
            this.LLILLJJLI = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c474901t5) == objLJFF) {
                C1C7U.LIZIZ("MinisGuidanceSheetUtil@389c.loadLottieComposition$1$1");
                return objLJFF;
            }
            C2107108Nh.LIZ(c0vsp, null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MinisGuidanceSheetUtil@389c.loadLottieComposition$1$1");
            return unit2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
