package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08rR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationRepo$preloadUIResource$2$1$1$onSuccessed$1", f = "CelebrationRepo.kt", l = {}, m = "invokeSuspend")
public final class C2248308rR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2248308rR(String str, InterfaceC1364105Vn<? super C2248308rR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2248308rR c2248308rR = new C2248308rR(this.LLILLJJLI, interfaceC1364105Vn);
        c2248308rR.LL = obj;
        return c2248308rR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("CelebrationRepo@2cdd.preloadUIResource$2$1$1$onSuccessed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C0VSP c0vsp = new C0VSP(this.LLILLJJLI);
            try {
                c098200Yq = C1294250jmh.LJFF(c0vsp, "eoy_create_tab_lottie");
                C2107108Nh.LIZ(c0vsp, null);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(c0vsp, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Lottie] create tab preload lottie success, filePath = ");
            sbLIZ.append(str);
            sbLIZ.append(", cost = ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ.append("ms");
            C201955140j.LJIILL(c554890LpX, "CeleRepo", C2188811AlT.LIZIZ(sbLIZ));
        }
        String str2 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[Lottie] create tab preload lottie fail, filePath = ");
            sbLIZ2.append(str2);
            sbLIZ2.append(", cost = ");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ2.append("ms, error = ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C201955140j.LJIILL(c554890LpX2, "CeleRepo", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CelebrationRepo@2cdd.preloadUIResource$2$1$1$onSuccessed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
