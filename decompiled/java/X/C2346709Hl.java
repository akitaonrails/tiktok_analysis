package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.utils.VideoModeUtils$resizeBitmapForVideoMode$1", f = "VideoModeUtils.kt", l = {70, 84}, m = "invokeSuspend")
public final class C2346709Hl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ CreativeInfo LLILZIL;
    public final /* synthetic */ MvCreateVideoData LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ Pair<Integer, Integer> LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2346709Hl(CreativeInfo creativeInfo, MvCreateVideoData mvCreateVideoData, int i, Pair<Integer, Integer> pair, Function0<Unit> function0, InterfaceC1364105Vn<? super C2346709Hl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = creativeInfo;
        this.LLILZLL = mvCreateVideoData;
        this.LLIZ = i;
        this.LLIZLLLIL = pair;
        this.LLJ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2346709Hl c2346709Hl = new C2346709Hl(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c2346709Hl.LLILZ = obj;
        return c2346709Hl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIL;
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        C1C7U.LIZ("VideoModeUtils@afd2.resizeBitmapForVideoMode$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("VideoModeUtils@afd2.resizeBitmapForVideoMode$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            concurrentHashMap2 = (ConcurrentHashMap) this.LLILLJJLI;
            concurrentHashMap = (ConcurrentHashMap) this.LL;
            strLJIL = (String) this.LLILZ;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
            strLJIL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIL(this.LLILZIL);
            C570490MZb.LJFF(new C0VSJ(strLJIL));
            ArrayList arrayList = new ArrayList();
            concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap2 = new ConcurrentHashMap();
            Iterator<String> it2 = this.LLILZLL.selectMediaList.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C2346809Hm(strLJIL, i2, it2.next(), this.LLIZ, this.LLIZLLLIL, concurrentHashMap, concurrentHashMap2, null), 2));
                i2++;
            }
            this.LLILZ = strLJIL;
            this.LL = concurrentHashMap;
            this.LLILLJJLI = concurrentHashMap2;
            this.LLILLL = 1;
            if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("VideoModeUtils@afd2.resizeBitmapForVideoMode$1");
                return objLJFF;
            }
        }
        int i3 = this.LLIZ;
        Pair<Integer, Integer> pair = this.LLIZLLLIL;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIL);
            sbLIZ.append(((Number) entry.getValue()).intValue());
            sbLIZ.append(C1449640npK.LIZ(".bmp"));
            String strLIZ = C2347109Hp.LIZ((String) entry.getKey(), C2188811AlT.LIZIZ(sbLIZ), i3, pair);
            if (strLIZ != null) {
                concurrentHashMap2.put(entry.getKey(), strLIZ);
            }
        }
        ArrayList<String> arrayList2 = this.LLILZLL.selectMediaList;
        ArrayList arrayList3 = new ArrayList();
        Iterator<String> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object obj2 = concurrentHashMap2.get(it3.next());
            if (obj2 != null) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            this.LLILZLL.selectMediaList.clear();
            this.LLILZLL.selectMediaList.addAll(arrayList3);
        }
        C2238608ps c2238608ps = C2107608Nm.LIZ;
        C2346909Hn c2346909Hn = new C2346909Hn(this.LLILZLL, this.LLJ, null);
        this.LLILZ = null;
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = 2;
        if (C23250099c.LJI(this, c2238608ps, c2346909Hn) == objLJFF) {
            C1C7U.LIZIZ("VideoModeUtils@afd2.resizeBitmapForVideoMode$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("VideoModeUtils@afd2.resizeBitmapForVideoMode$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
