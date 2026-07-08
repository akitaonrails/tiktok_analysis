package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0I99, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I99 {
    public static final void LIZ(List list, int i, boolean z, final Function0 function0) {
        EnumC1331380kka enumC1331380kka;
        if (list.isEmpty()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                enumC1331380kka = EnumC1331380kka.LOW;
            } else {
                enumC1331380kka = EnumC1331380kka.HIGH;
            }
        } else {
            enumC1331380kka = EnumC1331380kka.MEDIUM;
        }
        C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (!a0.LJJJIL(str)) {
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                c1325700kbQLIZLLL.LJIIL = enumC1331380kka;
                if (z) {
                    c1325700kbQLIZLLL.LJI = EnumC1325560kbC.CUSTOM;
                    c1325700kbQLIZLLL.LJIJI = "search_cache";
                }
                c1325540kbALIZ.LJIJI(c1325700kbQLIZLLL.LIZ(), "tako_video_cover_prefetch", enumC1331380kka).LIZJ(new C0HWE<Void>() { // from class: X.0HWC
                    @Override // X.C0HWE, X.InterfaceC589510NAf
                    public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                        abstractC1321260kUG.close();
                    }

                    @Override // X.C0HWE
                    public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                        interfaceC1320200kSY.close();
                    }

                    @Override // X.C0HWE
                    public final void LJFF(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                        if (!interfaceC1320200kSY.LIZ()) {
                            return;
                        }
                        try {
                            Function0<Unit> function02 = function0;
                            if (function02 != null) {
                                function02.invoke();
                            }
                            interfaceC1320200kSY.close();
                        } catch (Throwable th) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                interfaceC1320200kSY.close();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                interfaceC1320200kSY.close();
                                throw th2;
                            }
                        }
                    }
                }, C822700WPc.LL);
            }
        }
    }
}
