package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$buildPropShowEffectMobFromArray$1", f = "FullWidthEffectCarouselComponent.kt", l = {826}, m = "invokeSuspend")
public final class C1371005Ye extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int[] LLILLJJLI;
    public final /* synthetic */ o LLILLL;
    public final /* synthetic */ InterfaceC1664360tPe<C1350505Qh> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371005Ye(int[] iArr, o oVar, InterfaceC1664360tPe<C1350505Qh> interfaceC1664360tPe, boolean z, int i, InterfaceC1364105Vn<? super C1371005Ye> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iArr;
        this.LLILLL = oVar;
        this.LLILZ = interfaceC1664360tPe;
        this.LLILZIL = z;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1371005Ye(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Effect effect;
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.buildPropShowEffectMobFromArray$1");
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
            int[] iArr = this.LLILLJJLI;
            int length = iArr.length;
            InterfaceC1664360tPe<C1350505Qh> interfaceC1664360tPe = this.LLILZ;
            o oVar = this.LLILLL;
            boolean z = this.LLILZIL;
            int i2 = this.LLILZLL;
            C13DV c13dv = new C13DV(length);
            for (int i3 : iArr) {
                C1350505Qh c1350505Qh = (C1350505Qh) C13LP.LJJJLZIJ(i3, interfaceC1664360tPe);
                if (c1350505Qh != null && (effect = c1350505Qh.LIZIZ) != null) {
                    c13dv.add(oVar.t5(effect, i3, z, i2));
                }
            }
            List<C1628480sTm> listLIZ = C1697820uHc.LIZ(c13dv);
            o oVar2 = this.LLILLL;
            this.LL = 1;
            if (oVar2.LLZZLLIL(listLIZ, this) == objLJFF) {
                C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.buildPropShowEffectMobFromArray$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.buildPropShowEffectMobFromArray$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
