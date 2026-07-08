package X;

import Y.ARunnableS104S0100000_4;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS405S0200000_4;

/* JADX INFO: renamed from: X.0CLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312250CLv extends C09AY implements Function2<CopyOnWriteArrayList<C0CM8>, C0CME, Unit> {
    public C312250CLv() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CopyOnWriteArrayList<C0CM8> copyOnWriteArrayList, C0CME c0cme) {
        boolean z;
        final CopyOnWriteArrayList<C0CM8> copyOnWriteArrayList2 = copyOnWriteArrayList;
        Iterator<C0CM8> it2 = copyOnWriteArrayList2.iterator();
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList();
        while (true) {
            if (it2 != null && it2.hasNext()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            final C0CM8 next = it2.next();
            Runnable runnable = new Runnable() { // from class: X.0CLy
                public final void LIZ() {
                    Function0<Boolean> function0;
                    if (!((Boolean) C0CMX.LJIIJ.getValue()).booleanValue() || (function0 = C312230CLt.LJIL) == null || !function0.invoke().booleanValue()) {
                        C312230CLt.LJII(next, copyOnWriteArrayList2);
                        return;
                    }
                    C0CM3 c0cm3 = new C0CM3();
                    C0CM8 c0cm8 = next;
                    CopyOnWriteArrayList<C0CM8> copyOnWriteArrayList5 = copyOnWriteArrayList2;
                    c0cm3.LIZ = C0CME.SCROLL_END;
                    c0cm3.LIZIZ = true;
                    c0cm3.LJFF = c0cm8.LLILLJJLI;
                    c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
                    c0cm3.LJI = new AwS405S0200000_4(c0cm8, (C0CM8) copyOnWriteArrayList5, (CopyOnWriteArrayList<C0CM8>) 60);
                    C312240CLu.LIZ(c0cm3);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DowngradeAbility@31d1.initCommonLogic$1$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DowngradeAbility@31d1.initCommonLogic$1$1$1");
                }
            };
            if (!next.LLILLL) {
                if (((Number) C0CMX.LJIIJJI.getValue()).longValue() > 0 && next.LLILZ != C0CME.FIRST_UI_FRAME) {
                    copyOnWriteArrayList4.add(runnable);
                } else {
                    runnable.run();
                }
            } else {
                copyOnWriteArrayList3.add(runnable);
            }
        }
        ((C0CMH) C312230CLt.LJIJJ.getValue()).LIZIZ();
        ((C0CMH) C312230CLt.LJIJJLI.getValue()).LIZIZ();
        if (!copyOnWriteArrayList4.isEmpty()) {
            C312230CLt.LJIIIIZZ(C0CMJ.HIGH_PRIORITY.getType(), copyOnWriteArrayList4);
        }
        while (!copyOnWriteArrayList3.isEmpty()) {
            long jLongValue = ((Number) C0CMX.LJIILIIL.getValue()).longValue();
            if (jLongValue > 0) {
                final Runnable runnable2 = (Runnable) copyOnWriteArrayList3.remove(0);
                C786410Ut5.LJLIIL(jLongValue, C312230CLt.LIZLLL(), new Runnable() { // from class: X.0CKz
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("DowngradeAbility@31d1.initCommonLogic$1$2$1");
                        try {
                            runnable2.run();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("DowngradeAbility@31d1.initCommonLogic$1$2$1");
                    }
                });
            } else {
                C786410Ut5.LJL(C312230CLt.LIZLLL(), new ARunnableS104S0100000_4((Runnable) copyOnWriteArrayList3.remove(copyOnWriteArrayList3.size() - 1), 165));
            }
        }
        if (C1218004pe.LIZ()) {
            C786410Ut5.LJJZZIII(C312230CLt.LIZLLL(), new Runnable() { // from class: X.0CKy
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DowngradeAbility@31d1.initCommonLogic$1$4");
                    try {
                        C311900CKm.LIZLLL.LJFF();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DowngradeAbility@31d1.initCommonLogic$1$4");
                }
            });
        }
        return Unit.LIZ;
    }
}
