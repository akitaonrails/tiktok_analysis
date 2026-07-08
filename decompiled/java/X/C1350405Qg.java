package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$buildPropShowEffectMob$1", f = "FullWidthEffectCarouselComponent.kt", l = {800}, m = "invokeSuspend")
public final class C1350405Qg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ o LLILLJJLI;
    public final /* synthetic */ List<Integer> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350405Qg(o oVar, List<Integer> list, boolean z, InterfaceC1364105Vn<? super C1350405Qg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = oVar;
        this.LLILLL = list;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1350405Qg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Effect effect;
        C1628480sTm c1628480sTmT5;
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.buildPropShowEffectMob$1");
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
            int iZ7 = o.Z7(this.LLILLJJLI, null, 1, null);
            List<Integer> list = this.LLILLL;
            o oVar = this.LLILLJJLI;
            boolean z = this.LLILZ;
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                C1350505Qh c1350505Qh = (C1350505Qh) C13LP.LJJJLZIJ(iIntValue, oVar.LLLF.getValue());
                if (c1350505Qh != null && (effect = c1350505Qh.LIZIZ) != null && (c1628480sTmT5 = oVar.t5(effect, iIntValue, z, iZ7)) != null) {
                    arrayList.add(c1628480sTmT5);
                }
            }
            o oVar2 = this.LLILLJJLI;
            this.LL = 1;
            if (oVar2.LLZZLLIL(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.buildPropShowEffectMob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.buildPropShowEffectMob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
