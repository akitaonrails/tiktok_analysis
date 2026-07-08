package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0q2J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534570q2J implements Function1<C1533790q13, Unit> {
    public final String LL;
    public final EnumC1533980q1M LLILLJJLI;
    public final C1533870q1B LLILLL;
    public final Function1<C1533790q13, Unit> LLILZ;
    public C1533790q13 LLILZIL;
    public boolean LLILZLL;
    public final List<Function1<C1533790q13, Unit>> LLIZ = new ArrayList();
    public volatile SoftReference<InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>>> LLIZLLLIL;

    public final void LIZ(final C1533790q13 c1533790q13) {
        final Uri uriBuild;
        File fileLIZJ;
        Unit unit;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload result:");
        sbLIZ.append(c1533790q13.LIZIZ);
        C1534250q1n.LIZIZ("PreLoader", C2188811AlT.LIZIZ(sbLIZ), null);
        String absolutePath = null;
        try {
            Function1<C1533790q13, Unit> function1 = this.LLILZ;
            if (function1 != null) {
                function1.invoke(c1533790q13);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (!c1533790q13.LJJ) {
            c1533790q13.LJIILJJIL(null);
        }
        if (this.LLILLJJLI == EnumC1533980q1M.LYNX_IMAGE) {
            final AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(this, 194);
            if (c1533790q13.LIZIZ) {
                Uri.Builder builderAuthority = new Uri.Builder().scheme("file").authority("");
                C1534000q1O c1534000q1OLJ = c1533790q13.LJ();
                if (c1534000q1OLJ != null && (fileLIZJ = c1534000q1OLJ.LIZJ()) != null) {
                    absolutePath = fileLIZJ.getAbsolutePath();
                }
                uriBuild = builderAuthority.path(absolutePath).build();
            } else {
                C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
                if (!c1533490q0Z.LJIIIZ) {
                    uriBuild = c1533490q0Z.LJJJJL;
                } else {
                    C1534250q1n.LJII("PreLoader", "preload image failed, cdn is disabled", false);
                    awS567S0100000_23.invoke();
                    LIZIZ(c1533790q13);
                    return;
                }
            }
            C1325710kbR c1325710kbRLIZ = C1325700kbQ.LIZLLL(uriBuild).LIZ();
            C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
            EnumC1320950kTl enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
            c1325540kbALIZ.getClass();
            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = new C1320160kSU(c1325540kbALIZ, c1325710kbRLIZ, enumC1320950kTl).get();
            this.LLIZLLLIL = new SoftReference<>(interfaceC1320200kSY);
            interfaceC1320200kSY.LIZJ(new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0q2K
                @Override // X.C0HWE, X.InterfaceC589510NAf
                public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preload image canceled, src = ");
                    sbLIZ2.append(this.LIZ.LL);
                    sbLIZ2.append(", redirectTo: ");
                    sbLIZ2.append(uriBuild);
                    C1534250q1n.LIZIZ("PreLoader", C2188811AlT.LIZIZ(sbLIZ2), null);
                    awS567S0100000_23.invoke();
                }

                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preload image failed, src = ");
                    sbLIZ2.append(this.LIZ.LL);
                    sbLIZ2.append(", redirectTo: ");
                    sbLIZ2.append(uriBuild);
                    C1534250q1n.LIZIZ("PreLoader", C2188811AlT.LIZIZ(sbLIZ2), null);
                    awS567S0100000_23.invoke();
                }

                @Override // X.C0HWE
                public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY2) {
                    if (interfaceC1320200kSY2 != null && interfaceC1320200kSY2.LIZ()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("preload image succeed, src = ");
                        sbLIZ2.append(this.LIZ.LL);
                        sbLIZ2.append(", redirectTo: ");
                        sbLIZ2.append(uriBuild);
                        C1534250q1n.LJII("PreLoader", C2188811AlT.LIZIZ(sbLIZ2), false);
                        C1323050kX9<AbstractC1327750kej> result = interfaceC1320200kSY2.getResult();
                        if (result != null && (result.get() instanceof AbstractC1325130kaV)) {
                            c1533790q13.LJJIJ = new SoftReference<>(result);
                        }
                    }
                    awS567S0100000_23.invoke();
                }
            }, new Executor() { // from class: X.0q32
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            });
            LIZIZ(c1533790q13);
            return;
        }
        LIZIZ(c1533790q13);
    }

    public final void LIZIZ(C1533790q13 c1533790q13) {
        synchronized (this) {
            try {
                this.LLILZIL = c1533790q13;
                if (!this.LLIZ.isEmpty()) {
                    this.LLILLL.getClass();
                    C1533870q1B.LIZLLL.remove(this.LL);
                    Iterator<Function1<C1533790q13, Unit>> it2 = this.LLIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke(c1533790q13);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(C1533790q13 c1533790q13) {
        LIZ(c1533790q13);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1534570q2J(String str, EnumC1533980q1M enumC1533980q1M, C1533870q1B c1533870q1B, Function1<? super C1533790q13, Unit> function1) {
        this.LL = str;
        this.LLILLJJLI = enumC1533980q1M;
        this.LLILLL = c1533870q1B;
        this.LLILZ = function1;
    }
}
