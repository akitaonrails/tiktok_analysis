package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Lvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.TemplateAutoCutAIComponent$observeAICreateI2ITaskStatus$job$1$1", f = "TemplateAutoCutAIComponent.kt", l = {}, m = "invokeSuspend")
public final class C558840Lvu extends C09AX implements Function2<List<? extends C0LSZ>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C559060LwG LLILLL;
    public final /* synthetic */ C559020LwC LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C558840Lvu(C559060LwG c559060LwG, C559020LwC c559020LwC, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c559060LwG;
        this.LLILZ = c559020LwC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C558840Lvu c558840Lvu = new C558840Lvu(this.LLILLL, this.LLILZ, this.LLILLJJLI, interfaceC1364105Vn);
        c558840Lvu.LL = obj;
        return c558840Lvu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        Object next;
        int i;
        Integer num;
        C1C7U.LIZ("TemplateAutoCutAIComponent@a1d6.observeAICreateI2ITaskStatus$job$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = (List) this.LL;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.LJFF(((C0LSZ) obj2).LIZLLL, C0LQP.TEMPLATE_I2I.getTypeName())) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TemplateAutoCutAIComponent@a1d6.observeAICreateI2ITaskStatus$job$1$1");
            return unit;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.LJFF(((C0LSZ) it2.next()).LJ, "FINISHED")) {
                    z = false;
                    break;
                }
            }
            z = true;
        } else {
            z = true;
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(((C0LSZ) it3.next()).LJ, "FAILED")) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sb = new StringBuilder("TemplateAutoCutAIComponent#observeI2I: templateId=");
        sb.append(this.LLILLJJLI);
        sb.append(", taskCount=");
        sb.append(arrayList.size());
        sb.append(", tasks=");
        String str = null;
        sb.append(C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AFwS239S0000000_8.get$arr$(64), 31));
        C201955140j.LIZJ(c1398350mUb, sb.toString());
        Integer numLJ = this.LLILLL.LJIILJJIL;
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            Long lLJFF = C2286608xc.LJFF(((C0LSZ) it4.next()).LJIL);
            while (it4.hasNext()) {
                Long lLJFF2 = C2286608xc.LJFF(((C0LSZ) it4.next()).LJIL);
                if (lLJFF.compareTo(lLJFF2) < 0) {
                    lLJFF = lLJFF2;
                }
            }
            if (lLJFF != null) {
                long jLongValue = lLJFF.longValue();
                if (jLongValue > 0) {
                    long j = jLongValue / ((long) C538540LAe.LLJJJIL);
                    if (j < 1) {
                        j = 1;
                    }
                    numLJ = C2286608xc.LJ((int) j);
                    this.LLILLL.LJIILJJIL = numLJ;
                }
            }
        }
        if (numLJ != null && numLJ.intValue() > 0) {
            this.LLILZ.T6(this.LLILLJJLI, numLJ.intValue());
        }
        if (z) {
            C558860Lvw c558860Lvw = this.LLILLL.LJIILL;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C559060LwG c559060LwG = this.LLILLL;
            c558860Lvw.LIZIZ = jCurrentTimeMillis - c559060LwG.LJIILL.LIZ;
            this.LLILZ.F4(c559060LwG, arrayList);
            C559060LwG c559060LwG2 = this.LLILLL;
            c559060LwG2.LIZLLL = C559050LwF.LIZ(c559060LwG2.LIZLLL, EnumC558870Lvx.COMPLETED, null, 0, 61);
            this.LLILZ.m6(this.LLILLL, C377880Eri.LIZJ(this.LLILLL.LIZ), 0, 0, null);
        } else if (z2) {
            C558860Lvw c558860Lvw2 = this.LLILLL.LJIILL;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C559060LwG c559060LwG3 = this.LLILLL;
            c558860Lvw2.LIZIZ = jCurrentTimeMillis2 - c559060LwG3.LJIILL.LIZ;
            c559060LwG3.LIZLLL = C559050LwF.LIZ(c559060LwG3.LIZLLL, EnumC558870Lvx.FAILED, null, 0, 61);
            Iterator it5 = arrayList.iterator();
            while (true) {
                if (it5.hasNext()) {
                    next = it5.next();
                    if (Intrinsics.LJFF(((C0LSZ) next).LJ, "FAILED")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0LSZ c0lsz = (C0LSZ) next;
            int iLIZJ = C377880Eri.LIZJ(this.LLILLL.LIZ);
            C559020LwC c559020LwC = this.LLILZ;
            C559060LwG c559060LwG4 = this.LLILLL;
            if (c0lsz != null) {
                i = c0lsz.LJIILL;
                str = c0lsz.LJIILLIIL;
            } else {
                i = 0;
            }
            c559020LwC.m6(c559060LwG4, iLIZJ, 1, i, str);
            if (c0lsz != null && c0lsz.LJIILL == 5 && (num = c0lsz.LJJIFFI.quota) != null) {
                C559060LwG c559060LwG5 = this.LLILLL;
                C559020LwC c559020LwC2 = this.LLILZ;
                int iIntValue = num.intValue();
                c559060LwG5.LJIIJJI = c559020LwC2.getActivity().getResources().getQuantityString(2131755754, iIntValue, C2286608xc.LJ(iIntValue));
            }
        }
        this.LLILZ.H5(this.LLILLJJLI);
        this.LLILZ.S6();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateAutoCutAIComponent@a1d6.observeAICreateI2ITaskStatus$job$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends C0LSZ> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
