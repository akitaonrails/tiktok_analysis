package X;

import com.ss.android.ugc.nearby.roaming.RegionAllListAssem;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.roaming.RegionAllListAssem$processAllRegions$1", f = "RegionAllListAssem.kt", l = {172}, m = "invokeSuspend")
public final class C1201880hNi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<InterfaceC1891350zJl[]> LLILLJJLI;
    public final /* synthetic */ List<C1201840hNe> LLILLL;
    public final /* synthetic */ List<C1272804yU> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ HashMap<String, String> LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ RegionAllListAssem LLIZLLLIL;
    public final /* synthetic */ Collator LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201880hNi(C259800zU<InterfaceC1891350zJl[]> c259800zU, List<C1201840hNe> list, List<C1272804yU> list2, boolean z, HashMap<String, String> map, boolean z2, RegionAllListAssem regionAllListAssem, Collator collator, InterfaceC1364105Vn<? super C1201880hNi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = z;
        this.LLILZLL = map;
        this.LLIZ = z2;
        this.LLIZLLLIL = regionAllListAssem;
        this.LLJ = collator;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1201880hNi(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object[]] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("RegionAllListAssem@c16d.processAllRegions$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C259800zU<InterfaceC1891350zJl[]> c259800zU = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            List<C1201840hNe> list = this.LLILLL;
            List<C1272804yU> list2 = this.LLILZ;
            arrayList.addAll(list);
            arrayList.addAll(list2);
            c259800zU.element = arrayList.toArray(new InterfaceC1891350zJl[0]);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1201890hNj c1201890hNj = new C1201890hNj(this.LLILLJJLI, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c1201890hNj);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("RegionAllListAssem@c16d.processAllRegions$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("RegionAllListAssem@c16d.processAllRegions$1");
        return objLJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
