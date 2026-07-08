package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import njp.a;

/* JADX INFO: renamed from: X.15VG, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.image.ImagePreloadService$cancelPreloadOutsideRange$1", f = "ImagePreloadService.kt", l = {}, m = "invokeSuspend")
public final class C15VG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15VE LL;
    public final /* synthetic */ IntRange LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15VG(C15VE c15ve, IntRange intRange, InterfaceC1364105Vn<? super C15VG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15ve;
        this.LLILLJJLI = intRange;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15VG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ImageUrlModel imageUrlModel;
        C1C7U.LIZ("ImagePreloadService@a19d.cancelPreloadOutsideRange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C15VE c15ve = this.LL;
        Object obj2 = c15ve.LJIIIIZZ;
        IntRange intRange = this.LLILLJJLI;
        synchronized (obj2) {
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    int size = c15ve.LJI.size();
                    for (int i = 0; i < size; i++) {
                        int i2 = intRange.LL;
                        if (i > intRange.LLILLJJLI || i2 > i) {
                            C20530015Va c20530015Va = c15ve.LJI.get(i);
                            if (c20530015Va.LIZLLL == C15VQ.START && (imageUrlModel = c20530015Va.LIZIZ) != null) {
                                Iterator<C20530915Vj> it2 = c15ve.LJII.iterator();
                                int i3 = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    if (Intrinsics.LJFF(it2.next().LIZ, imageUrlModel)) {
                                        if (i3 >= 0) {
                                            InterfaceC469401sC interfaceC469401sC = c15ve.LJII.get(i3).LIZIZ;
                                            if (interfaceC469401sC != null) {
                                                interfaceC469401sC.cancel();
                                            }
                                            c15ve.LJII.remove(i3);
                                            c20530015Va.LIZLLL = C15VQ.IDLE;
                                            arrayList.add(C2286608xc.LJ(i));
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C20531115Vl c20531115Vl = c15ve.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Cancel outside keepRange=[");
                        sbLIZ.append(intRange.LL);
                        sbLIZ.append("..");
                        sbLIZ.append(intRange.LLILLJJLI);
                        sbLIZ.append("] cnt=");
                        sbLIZ.append(arrayList.size());
                        sbLIZ.append(" positions=");
                        sbLIZ.append(arrayList);
                        c20531115Vl.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImagePreloadService@a19d.cancelPreloadOutsideRange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
