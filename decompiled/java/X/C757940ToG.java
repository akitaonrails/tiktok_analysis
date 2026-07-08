package X;

import com.bytedance.android.live.settings.LiveHostReplayUISettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import njp.a;

/* JADX INFO: renamed from: X.0ToG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.spriteimage.ScrollHandleConfiguration$queryThumbnails$3", f = "ScrollHandleConfiguration.kt", l = {}, m = "invokeSuspend")
public final class C757940ToG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1836150xsj LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757940ToG(C1836150xsj c1836150xsj, int i, int i2, InterfaceC1364105Vn<? super C757940ToG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1836150xsj;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C757940ToG(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int i;
        C1C7U.LIZ("ScrollHandleConfiguration@13e2.queryThumbnails$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1836150xsj c1836150xsj = this.LL;
        int i2 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        c1836150xsj.getClass();
        IntRange intRange = new IntRange(i2, i3);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = intRange.iterator();
        while (((C531650Kt9) it2).hasNext()) {
            Object next = ((AbstractC2098408Jy) it2).next();
            int iIntValue2 = ((Number) next).intValue();
            if (iIntValue2 < c1836150xsj.LJIJJLI.LIZIZ.size() && (i = iIntValue2 + 1) < c1836150xsj.LJIL.LIZIZ.size() && ((CharSequence) ListProtector.get(c1836150xsj.LJIL.LIZIZ, i)).length() == 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((Number) it3.next()).intValue() / c1836150xsj.LJIILJJIL));
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList2);
        ArrayList<Pair> arrayList3 = new ArrayList(C15438062q.LJIJJ(setLLIIJI, 10));
        Iterator it4 = setLLIIJI.iterator();
        while (it4.hasNext()) {
            int iIntValue3 = ((Number) it4.next()).intValue();
            long j = LiveHostReplayUISettings.getValue().screenWithTotalSeconds;
            long j2 = ((long) iIntValue3) * j;
            arrayList3.add(new Pair(Long.valueOf(j2), Long.valueOf(Math.min(j2 + j, c1836150xsj.LIZIZ.LIZIZ.longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)))));
        }
        C1836150xsj c1836150xsj2 = this.LL;
        for (Pair pair : arrayList3) {
            long jLongValue = ((Number) pair.getFirst()).longValue();
            long jLongValue2 = ((Number) pair.getSecond()).longValue();
            Integer num = (Integer) ((LinkedHashMap) c1836150xsj2.LJJ).get(C2286608xc.LJFF(jLongValue));
            if (num != null) {
                iIntValue = num.intValue() + 1;
            } else {
                iIntValue = 0;
            }
            c1836150xsj2.LJJ.put(C2286608xc.LJFF(jLongValue), C2286608xc.LJ(iIntValue));
            if (iIntValue == 0 || iIntValue > 3) {
                c1836150xsj2.LJJ.put(C2286608xc.LJFF(jLongValue), C2286608xc.LJ(1));
                c1836150xsj2.LJ(null, jLongValue, jLongValue2, true);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScrollHandleConfiguration@13e2.queryThumbnails$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
