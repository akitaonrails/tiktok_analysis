package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.PhotoModeImageLoader$fetchAndCacheImages$2$deferredList$1$1", f = "PhotoModeImageLoader.kt", l = {56}, m = "invokeSuspend")
public final class C445500HdU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1321600kUo LLILLJJLI;
    public final /* synthetic */ C1325710kbR LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445500HdU(C1321600kUo c1321600kUo, C1325710kbR c1325710kbR, InterfaceC1364105Vn<? super C445500HdU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1321600kUo;
        this.LLILLL = c1325710kbR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C445500HdU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoModeImageLoader@d16a.fetchAndCacheImages$2$deferredList$1$1");
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
            final C1321600kUo c1321600kUo = this.LLILLJJLI;
            final C1325710kbR c1325710kbR = this.LLILLL;
            this.LL = 1;
            c1321600kUo.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            if (C123100dR.LIZ(c1321600kUo.LIZIZ(c1325710kbR))) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                c2252611DEt.resumeWith(unit);
            } else {
                Class<?> cls = C1322200kVm.LIZ;
                AbstractC1321260kUG abstractC1321260kUGLJIIIIZZ = C1328130kfL.LJIILIIL().LJIIL().LJIIIIZZ(c1325710kbR, null);
                abstractC1321260kUGLJIIIIZZ.LIZJ(new C0HWE<C1323050kX9<InterfaceC1327060kdc>>() { // from class: X.0kaf
                    @Override // X.C0HWE
                    public final void LJ(InterfaceC1320200kSY<C1323050kX9<InterfaceC1327060kdc>> interfaceC1320200kSY) {
                        if (interfaceC1320200kSY != null) {
                            interfaceC1320200kSY.close();
                        }
                        InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                        Unit unit2 = Unit.LIZ;
                        C189200o6.m2constructorimpl(unit2);
                        interfaceC20236714Gf.resumeWith(unit2);
                    }

                    @Override // X.C0HWE
                    public final void LJFF(InterfaceC1320200kSY<C1323050kX9<InterfaceC1327060kdc>> interfaceC1320200kSY) throws Throwable {
                        if (interfaceC1320200kSY != null) {
                            C1323050kX9<InterfaceC1327060kdc> result = interfaceC1320200kSY.getResult();
                            if (result != null) {
                                C1321600kUo c1321600kUo2 = c1321600kUo;
                                C1325710kbR c1325710kbR2 = c1325710kbR;
                                Throwable th = null;
                                try {
                                    InterfaceC1327060kdc interfaceC1327060kdc = result.get();
                                    final byte[] bArr = new byte[interfaceC1327060kdc.size()];
                                    interfaceC1327060kdc.read(0, bArr, 0, interfaceC1327060kdc.size());
                                    InterfaceC1326920kdO interfaceC1326920kdO = c1321600kUo2.LIZ;
                                    C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
                                    c1324810kZzLJI.getClass();
                                    interfaceC1326920kdO.LJIIIIZZ(c1324810kZzLJI.LJ(c1325710kbR2.LIZIZ), new InterfaceC1327040kda() { // from class: X.0kah
                                        @Override // X.InterfaceC1327040kda
                                        public final void LIZ(C1335560krK c1335560krK) throws IOException {
                                            c1335560krK.write(bArr);
                                        }
                                    });
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Image has been downloaded successfully ");
                                    sbLIZ.append(c1325710kbR2.LIZIZ);
                                    sbLIZ.append(" and cached? ");
                                    sbLIZ.append(C123100dR.LIZ(c1321600kUo2.LIZIZ(c1325710kbR2)));
                                    sbLIZ.append(" and cached path is ");
                                    sbLIZ.append(c1321600kUo2.LIZIZ(c1325710kbR2));
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    C2107108Nh.LIZ(result, null);
                                } catch (Throwable th2) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th2);
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    try {
                                        throw th2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th2;
                                        while (true) {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                C2107108Nh.LIZ(result, th);
                                                throw th;
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                        }
                                    }
                                }
                            }
                            interfaceC1320200kSY.close();
                        }
                        InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                        Unit unit2 = Unit.LIZ;
                        C189200o6.m2constructorimpl(unit2);
                        interfaceC20236714Gf.resumeWith(unit2);
                    }
                }, C822700WPc.LL);
                c2252611DEt.LJJII(new AwS585S0100000_6(abstractC1321260kUGLJIIIIZZ, 210));
            }
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ != C099R.LJFF()) {
                objLJIJ = Unit.LIZ;
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("PhotoModeImageLoader@d16a.fetchAndCacheImages$2$deferredList$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PhotoModeImageLoader@d16a.fetchAndCacheImages$2$deferredList$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
