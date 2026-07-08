package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.ranges.IntRange;
import njp.a;

/* JADX INFO: renamed from: X.15VI, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.image.ImagePreloadService$triggerPreloadInRange$1", f = "ImagePreloadService.kt", l = {}, m = "invokeSuspend")
public final class C15VI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15VE LL;
    public final /* synthetic */ IntRange LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15VI(C15VE c15ve, IntRange intRange, InterfaceC1364105Vn<? super C15VI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15ve;
        this.LLILLJJLI = intRange;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15VI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1334360kpO enumC1334360kpO;
        C1C7U.LIZ("ImagePreloadService@a19d.triggerPreloadInRange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C15VE c15ve = this.LL;
        Object obj2 = c15ve.LJIIIIZZ;
        IntRange intRange = this.LLILLJJLI;
        synchronized (obj2) {
            try {
                if (C15VE.LIZJ() <= 0) {
                    C20531115Vl c20531115Vl = c15ve.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("triggerPreloadInRange SKIP preloadCount<=0 window=[");
                    sbLIZ.append(intRange.LL);
                    sbLIZ.append("..");
                    sbLIZ.append(intRange.LLILLJJLI);
                    sbLIZ.append(']');
                    c20531115Vl.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ImagePreloadService@a19d.triggerPreloadInRange$1");
                    return unit;
                }
                int i = intRange.LL;
                if (i < 0) {
                    i = 0;
                }
                int i2 = intRange.LLILLJJLI + 1;
                int size = c15ve.LJI.size();
                if (i2 > size) {
                    i2 = size;
                }
                if (i >= i2) {
                    C20531115Vl c20531115Vl2 = c15ve.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("triggerPreloadInRange SKIP empty window after clamp, requested=[");
                    sbLIZ2.append(intRange.LL);
                    sbLIZ2.append("..");
                    sbLIZ2.append(intRange.LLILLJJLI);
                    sbLIZ2.append("] clamped=[");
                    sbLIZ2.append(i);
                    sbLIZ2.append("..");
                    sbLIZ2.append(i2 - 1);
                    sbLIZ2.append("] preloadDataList.size=");
                    sbLIZ2.append(c15ve.LJI.size());
                    c20531115Vl2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("ImagePreloadService@a19d.triggerPreloadInRange$1");
                    return unit2;
                }
                int i3 = i2 - i;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i4 = i; i4 < i2; i4++) {
                    C20530015Va c20530015Va = c15ve.LJI.get(i4);
                    int i5 = C15VV.LIZ[c20530015Va.LIZLLL.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            C20531115Vl c20531115Vl3 = c15ve.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("triggerPreloadInRange, idx=");
                            sbLIZ3.append(i4);
                            sbLIZ3.append(", aid=");
                            sbLIZ3.append(c20530015Va.LIZ);
                            sbLIZ3.append(", cover=");
                            sbLIZ3.append(c20530015Va.LIZIZ);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            boolean z = AbstractC1604130rqV.LIZLLL;
                            Context context = null;
                            c20531115Vl3.LIZ(strLIZIZ, null);
                            c20530015Va.LIZLLL = C15VQ.START;
                            if (C1335180kqi.LIZ()) {
                                enumC1334360kpO = EnumC1334360kpO.IMMEDIATE;
                            } else {
                                enumC1334360kpO = EnumC1334360kpO.HIGH;
                            }
                            Fragment fragment = c15ve.LIZIZ;
                            if (fragment != null) {
                                context = fragment.getContext();
                            }
                            InterfaceC469401sC interfaceC469401sCLIZJ = C15VJ.LIZJ(context, c20530015Va, enumC1334360kpO, new AwS397S0200000_31(c20530015Va, c15ve, 118));
                            if (interfaceC469401sCLIZJ != null) {
                                c15ve.LJII.add(new C20530915Vj(c20530015Va.LIZIZ, interfaceC469401sCLIZJ));
                                arrayList.add(C2286608xc.LJ(i4));
                            } else {
                                arrayList4.add(C2286608xc.LJ(i4));
                            }
                        } else {
                            arrayList3.add(C2286608xc.LJ(i4));
                        }
                    } else {
                        arrayList2.add(C2286608xc.LJ(i4));
                    }
                }
                C20531115Vl c20531115Vl4 = c15ve.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("triggerPreloadInRange DONE window=[");
                sbLIZ4.append(i);
                sbLIZ4.append("..");
                sbLIZ4.append(i2 - 1);
                sbLIZ4.append("](size=");
                sbLIZ4.append(i3);
                sbLIZ4.append(") preloaded=");
                sbLIZ4.append(arrayList.size());
                sbLIZ4.append('@');
                sbLIZ4.append(arrayList);
                sbLIZ4.append(" skipLoaded=");
                sbLIZ4.append(arrayList2.size());
                sbLIZ4.append('@');
                sbLIZ4.append(arrayList2);
                sbLIZ4.append(" skipStarted=");
                sbLIZ4.append(arrayList3.size());
                sbLIZ4.append('@');
                sbLIZ4.append(arrayList3);
                sbLIZ4.append(" taskNull=");
                sbLIZ4.append(arrayList4.size());
                sbLIZ4.append('@');
                sbLIZ4.append(arrayList4);
                c20531115Vl4.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4));
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("ImagePreloadService@a19d.triggerPreloadInRange$1");
                return unit3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
