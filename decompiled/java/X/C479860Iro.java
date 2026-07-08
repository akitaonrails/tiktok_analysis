package X;

import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479860Iro {
    public static final CopyOnWriteArrayList<InterfaceC479850Irn> LIZ;

    static {
        CopyOnWriteArrayList<InterfaceC479850Irn> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LIZ = copyOnWriteArrayList;
        copyOnWriteArrayList.addIfAbsent(C1BZJ.LIZ);
        copyOnWriteArrayList.addIfAbsent(new InterfaceC479850Irn() { // from class: X.0Irp
            public static WeakReference<Object> LIZIZ;

            @Override // X.InterfaceC479850Irn
            public final void LIZ() {
            }

            @Override // X.InterfaceC479850Irn
            public final void LIZLLL() {
            }

            public static void LJ(WeakReference weakReference, boolean z) {
                Object obj;
                if (z) {
                    LIZIZ = weakReference;
                    IHostPerformanceOpt iHostPerformanceOpt = (IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class);
                    if (iHostPerformanceOpt != null) {
                        iHostPerformanceOpt.ue1();
                        return;
                    }
                    return;
                }
                WeakReference<Object> weakReference2 = LIZIZ;
                if (weakReference2 != null) {
                    obj = weakReference2.get();
                } else {
                    obj = null;
                }
                if (!Intrinsics.LJFF(obj, weakReference.get())) {
                    return;
                }
                LIZIZ = null;
                IHostPerformanceOpt iHostPerformanceOpt2 = (IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class);
                if (iHostPerformanceOpt2 == null) {
                    return;
                }
                iHostPerformanceOpt2.ue1();
            }

            @Override // X.InterfaceC479850Irn
            public final void LIZIZ(WeakReference<Object> weakReference, EnumC479890Irr enumC479890Irr) {
                if (C479880Irq.LIZ[enumC479890Irr.ordinal()] == 1) {
                    LJ(weakReference, false);
                }
            }

            @Override // X.InterfaceC479850Irn
            public final void LIZJ(WeakReference<Object> weakReference, EnumC479890Irr enumC479890Irr) {
                if (C479880Irq.LIZ[enumC479890Irr.ordinal()] == 1) {
                    LJ(weakReference, true);
                }
            }
        });
    }

    public static void LIZ(Object obj, EnumC479890Irr enumC479890Irr) {
        try {
            WeakReference<Object> weakReference = new WeakReference<>(obj);
            Iterator<InterfaceC479850Irn> it2 = LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(weakReference, enumC479890Irr);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(Object obj, EnumC479890Irr enumC479890Irr) {
        try {
            WeakReference<Object> weakReference = new WeakReference<>(obj);
            Iterator<InterfaceC479850Irn> it2 = LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(weakReference, enumC479890Irr);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
