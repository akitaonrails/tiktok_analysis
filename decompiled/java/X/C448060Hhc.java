package X;

import android.view.View;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hhc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew$updateDataWhenLynxReady$1$1$1", f = "DynamicSingleIntermediateFragmentNew.kt", l = {}, m = "invokeSuspend")
public final class C448060Hhc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ DynamicSingleIntermediateFragmentNew LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448060Hhc(Function0<Unit> function0, long j, String str, boolean z, DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew, InterfaceC1364105Vn<? super C448060Hhc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = dynamicSingleIntermediateFragmentNew;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C448060Hhc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DynamicSingleIntermediateFragmentNew@4e1a.updateDataWhenLynxReady$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.LLILLJJLI);
        C0Q2Q<C448080Hhe> c0q2q = new C0Q2Q<C448080Hhe>() { // from class: X.0Hhe
        };
        c0q2q.LJ(Scene.SCENE_SERVICE, this.LLILLL);
        c0q2q.LJI("is_count_down_latch_time_out", !this.LLILZ);
        int iHashCode = 0;
        if (iCurrentTimeMillis < 0) {
            iCurrentTimeMillis = 0;
        }
        c0q2q.LIZLLL(iCurrentTimeMillis, "wait_duration");
        c0q2q.LJIILJJIL();
        DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew = this.LLILZIL;
        boolean z = this.LLILZ;
        dynamicSingleIntermediateFragmentNew.getClass();
        if (!z) {
            C649290PdP c649290PdP = dynamicSingleIntermediateFragmentNew.LLJZ;
            View viewLIZIZ = null;
            if (c649290PdP == null) {
                c649290PdP = null;
            }
            if ((c649290PdP instanceof C649300PdQ) && c649290PdP != null) {
                viewLIZIZ = c649290PdP.LIZIZ();
            }
            Boolean bool = Boolean.TRUE;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C649390PdZ.LIZ.getValue();
            if (viewLIZIZ != null) {
                iHashCode = viewLIZIZ.hashCode();
            }
            concurrentHashMap.put(Integer.valueOf(iHashCode), bool);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DynamicSingleIntermediateFragmentNew@4e1a.updateDataWhenLynxReady$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
