package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS29S0202000_31;
import njp.a;

/* JADX INFO: renamed from: X.15VH, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.image.ImagePreloadService$triggerPreloadImage$1", f = "ImagePreloadService.kt", l = {149}, m = "invokeSuspend")
public final class C15VH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15VE LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15VH(C15VE c15ve, int i, InterfaceC1364105Vn<? super C15VH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15ve;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15VH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        EnumC1334360kpO enumC1334360kpO;
        boolean z7;
        C1C7U.LIZ("ImagePreloadService@a19d.triggerPreloadImage$1");
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
            if (!C20530215Vc.LIZ().isEnable()) {
                j = -1;
            } else {
                j = C20530215Vc.LIZ().delayPreloadImageWhenLoadMore;
            }
            if (j > 0) {
                C013C c013c = new C013C();
                C15VE c15ve = this.LLILLJJLI;
                synchronized (c15ve.LJIIIIZZ) {
                    try {
                        List<C20530015Va> list = c15ve.LJI;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (C20530015Va c20530015Va : list) {
                                if (c20530015Va.LJ && c20530015Va.LIZLLL == C15VQ.START) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c013c.element = z3;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (this.LLILLL > 0) {
                    C15VE c15ve2 = this.LLILLJJLI;
                    if (c15ve2.LJIIIZ <= c15ve2.LJIIJ) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && c013c.element) {
                        LJIIJJI(AFwS221S0000000_31.get$arr$(501));
                        this.LL = 1;
                        if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                            C1C7U.LIZIZ("ImagePreloadService@a19d.triggerPreloadImage$1");
                            return objLJFF;
                        }
                    }
                }
            }
        }
        C15VE c15ve3 = this.LLILLJJLI;
        Object obj2 = c15ve3.LJIIIIZZ;
        int i2 = this.LLILLL;
        synchronized (obj2) {
            try {
                int size = c15ve3.LJI.size();
                if (c15ve3.LJIIIZ != size - 1 && size > 0) {
                    if (C15VE.LIZJ() <= 0) {
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ImagePreloadService@a19d.triggerPreloadImage$1");
                        return unit;
                    }
                    if (C20530215Vc.LIZ().isEnable() && C20530215Vc.LIZ().forcePreloadNetworkImage) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5 || i2 == -1) {
                        if (c15ve3.LJIIIZ == 0) {
                            i2 = 0;
                        } else {
                            i2 = c15ve3.LJIIIZ + 1;
                        }
                    }
                    int iMin = Math.min(C15VE.LIZJ() + i2, size);
                    if (i2 <= iMin && iMin <= size) {
                        if (i2 == 0) {
                            c15ve3.LJIIJ = iMin;
                        }
                        List<C20530015Va> listSubList = c15ve3.LJI.subList(i2, iMin);
                        ArrayList arrayList = new ArrayList();
                        for (C20530015Va c20530015Va2 : listSubList) {
                            C15VQ c15vq = c20530015Va2.LIZLLL;
                            if (c15vq != C15VQ.LOADED && c15vq != C15VQ.START) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                arrayList.add(c20530015Va2);
                            }
                        }
                        int i3 = 0;
                        for (Object obj3 : arrayList) {
                            int i4 = i3 + 1;
                            Context context = null;
                            if (i3 >= 0) {
                                C20530015Va c20530015Va3 = (C20530015Va) obj3;
                                C20531115Vl c20531115Vl = c15ve3.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("preload image, startIndex = ");
                                sbLIZ.append(i2 + i3);
                                sbLIZ.append(", aid = ");
                                sbLIZ.append(c20530015Va3.LIZ);
                                sbLIZ.append(", cover = ");
                                sbLIZ.append(c20530015Va3.LIZIZ);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                boolean z8 = AbstractC1604130rqV.LIZLLL;
                                c20531115Vl.LIZ(strLIZIZ, null);
                                c20530015Va3.LIZLLL = C15VQ.START;
                                if (C1335180kqi.LIZ()) {
                                    enumC1334360kpO = EnumC1334360kpO.IMMEDIATE;
                                } else {
                                    if (c15ve3.LJIIIZ == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        enumC1334360kpO = EnumC1334360kpO.IMMEDIATE;
                                    } else {
                                        enumC1334360kpO = EnumC1334360kpO.HIGH;
                                    }
                                }
                                Fragment fragment = c15ve3.LIZIZ;
                                if (fragment != null) {
                                    context = fragment.getContext();
                                }
                                InterfaceC469401sC interfaceC469401sCLIZJ = C15VJ.LIZJ(context, c20530015Va3, enumC1334360kpO, new AwS29S0202000_31(c15ve3, c20530015Va3, i2, i3, 2));
                                if (interfaceC469401sCLIZJ != null) {
                                    c15ve3.LJII.add(new C20530915Vj(c20530015Va3.LIZIZ, interfaceC469401sCLIZJ));
                                }
                                i3 = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("ImagePreloadService@a19d.triggerPreloadImage$1");
                        return unit2;
                    }
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("ImagePreloadService@a19d.triggerPreloadImage$1");
                    return unit3;
                }
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("ImagePreloadService@a19d.triggerPreloadImage$1");
                return unit4;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
