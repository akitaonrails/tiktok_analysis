package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0U0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeRequestMessageActionHandler$handle$3", f = "KaraokeRequestMessageActionHandler.kt", l = {118, 124}, m = "invokeSuspend")
public final class C765340U0m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C765320U0k LLILLJJLI;
    public final /* synthetic */ C0U0N LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765340U0m(C765320U0k c765320U0k, C0U0N c0u0n, long j, InterfaceC1364105Vn<? super C765340U0m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c765320U0k;
        this.LLILLL = c0u0n;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C765340U0m(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listLLIIII;
        C0U22 c0u22;
        C0U22 c0u22LJI;
        List<C0U22> list;
        C0U22 next;
        C1C7U.LIZ("KaraokeRequestMessageActionHandler@773c.handle$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C765320U0k c765320U0k = this.LLILLJJLI;
            C765390U0r c765390U0r = (C765390U0r) this.LLILLL;
            c765320U0k.LJI = c765390U0r.LIZJ;
            c765320U0k.LIZJ.LJIIJJI = c765390U0r.LIZ;
            if (!((C765390U0r) this.LLILLL).LIZLLL.isEmpty()) {
                C765690U1v c765690U1vLJIIL = this.LLILLJJLI.LIZJ.LJIIL(this.LLILZ);
                List<C0U22> list2 = ((C765390U0r) this.LLILLL).LIZLLL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (C0U22 c0u222 : list2) {
                    if (c765690U1vLJIIL != null && (list = c765690U1vLJIIL.LIZJ) != null) {
                        Iterator<C0U22> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next, c0u222)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        c0u22 = next;
                    } else {
                        c0u22 = null;
                    }
                    if (c0u22 != null) {
                        c0u22LJI = c0u222.LIZIZ(c0u22.LJIIJJI, c0u22.LJIIL, c0u222.LJIILIIL);
                    } else {
                        c0u22LJI = c0u222.LJI(false);
                    }
                    arrayList.add(c0u22LJI);
                }
                listLLIIII = C13LP.LLIIII(arrayList);
            } else {
                listLLIIII = C13BV.INSTANCE;
            }
            C0U2Y c0u2y = this.LLILLJJLI.LIZJ;
            long j = this.LLILZ;
            C765690U1v c765690U1vLIZ = C765530U1f.LIZ(listLLIIII.size(), false, listLLIIII);
            synchronized (c0u2y) {
                c0u2y.LJ.put(Long.valueOf(j), c765690U1vLIZ);
            }
            if (this.LLILLJJLI.LJIIIIZZ == this.LLILZ) {
                if (!listLLIIII.isEmpty()) {
                    C097O c097o = this.LLILLJJLI.LIZ;
                    C765030Tzh c765030Tzh = new C765030Tzh(this.LLILZ, listLLIIII);
                    this.LL = 1;
                    if (c097o.LIZ(c765030Tzh, this) == objLJFF) {
                        C1C7U.LIZIZ("KaraokeRequestMessageActionHandler@773c.handle$3");
                        return objLJFF;
                    }
                } else {
                    C097O c097o2 = this.LLILLJJLI.LIZ;
                    C765080Tzm c765080Tzm = new C765080Tzm(this.LLILZ);
                    this.LL = 2;
                    if (c097o2.LIZ(c765080Tzm, this) == objLJFF) {
                        C1C7U.LIZIZ("KaraokeRequestMessageActionHandler@773c.handle$3");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeRequestMessageActionHandler@773c.handle$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
