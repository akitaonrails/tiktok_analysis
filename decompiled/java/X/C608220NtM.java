package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NtM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager$tryUpdateScore$2$callBack$1", f = "OfflineModeManager.kt", l = {186, 192, 198}, m = "invokeSuspend")
public final class C608220NtM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C608220NtM(InterfaceC1364105Vn<? super C608220NtM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C608220NtM(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeManager@8800.tryUpdateScore$2$callBack$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C610460Nwy.LIZIZ(C610460Nwy.LIZ, e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("OfflineModeManager@8800.tryUpdateScore$2$callBack$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("OfflineModeManager@8800.tryUpdateScore$2$callBack$1");
                return objLJFF;
            }
        }
        C610460Nwy.LIZ.getClass();
        if (!C610460Nwy.LJ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C625530OgB.LIZ.getClass();
            List<String> listLJIIZILJ = C625530OgB.LJIIZILJ();
            C610460Nwy.LIZ(System.currentTimeMillis() - jCurrentTimeMillis, "getUnwatchedAid");
            C625470Og5 c625470Og5 = C625470Og5.LL;
            this.LL = 2;
            if (c625470Og5.M0("callback", listLJIIZILJ, this) == objLJFF) {
                C1C7U.LIZIZ("OfflineModeManager@8800.tryUpdateScore$2$callBack$1");
                return objLJFF;
            }
        } else {
            if ((C297260Bky.LIZ() & 4) != 4 || !C297260Bky.LIZIZ()) {
                z = false;
            }
            if (z) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C625530OgB.LIZ.getClass();
                List<String> listLJIIZILJ2 = C625530OgB.LJIIZILJ();
                C610460Nwy.LIZ(System.currentTimeMillis() - jCurrentTimeMillis2, "getUnwatchedAid");
                C625470Og5 c625470Og52 = C625470Og5.LL;
                this.LL = 3;
                if (c625470Og52.M0("callback_internal", listLJIIZILJ2, this) == objLJFF) {
                    C1C7U.LIZIZ("OfflineModeManager@8800.tryUpdateScore$2$callBack$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeManager@8800.tryUpdateScore$2$callBack$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C608220NtM(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
