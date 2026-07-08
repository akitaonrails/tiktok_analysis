package X;

import Y.AgS195S0200000_4;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.LoadMoreResponse;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM$requestSourceData$1$1", f = "TakoNimbleVM.kt", l = {98, 99, 105}, m = "invokeSuspend")
public final class C328970Cv1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC328990Cv3 LLILLJJLI;
    public final /* synthetic */ TakoNimbleVM LLILLL;
    public final /* synthetic */ C329020Cv6 LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Integer>> LLILZLL;
    public final /* synthetic */ Function1<LoadMoreResponse, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328970Cv1(EnumC328990Cv3 enumC328990Cv3, TakoNimbleVM takoNimbleVM, C329020Cv6 c329020Cv6, int i, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn, Function1<? super LoadMoreResponse, Unit> function1, InterfaceC1364105Vn<? super C328970Cv1> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = enumC328990Cv3;
        this.LLILLL = takoNimbleVM;
        this.LLILZ = c329020Cv6;
        this.LLILZIL = i;
        this.LLILZLL = interfaceC1364105Vn;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328970Cv1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa interfaceC346201Wa;
        C1C7U.LIZ("TakoNimbleVM@c644.requestSourceData$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("TakoNimbleVM@c644.requestSourceData$1$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                interfaceC346201Wa = (InterfaceC346201Wa) obj;
            } else {
                C155000ia.LIZIZ(obj);
                interfaceC346201Wa = (InterfaceC346201Wa) obj;
            }
        } else {
            C155000ia.LIZIZ(obj);
            int i2 = C328980Cv2.LIZ[this.LLILLJJLI.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    C329070CvB c329070CvB = this.LLILLL.LL;
                    C329020Cv6 c329020Cv6 = this.LLILZ;
                    int i3 = this.LLILZIL;
                    this.LL = 2;
                    c329070CvB.getClass();
                    obj = new C095D(new C329000Cv4(c329070CvB, c329020Cv6, i3, null, null));
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("TakoNimbleVM@c644.requestSourceData$1$1");
                        return objLJFF;
                    }
                    interfaceC346201Wa = (InterfaceC346201Wa) obj;
                } else {
                    throw new C1954807lC();
                }
            } else {
                C329070CvB c329070CvB2 = this.LLILLL.LL;
                C329020Cv6 c329020Cv62 = this.LLILZ;
                this.LL = 1;
                c329070CvB2.getClass();
                obj = new C095D(new C329000Cv4(c329070CvB2, c329020Cv62, 0, null, null));
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoNimbleVM@c644.requestSourceData$1$1");
                    return objLJFF;
                }
                interfaceC346201Wa = (InterfaceC346201Wa) obj;
            }
        }
        C2501109r7 c2501109r7 = new C2501109r7(new C328920Cuw(this.LLILZLL, null), interfaceC346201Wa, 0);
        AgS195S0200000_4 agS195S0200000_4 = new AgS195S0200000_4(this.LLILZLL, this.LLIZ, 4);
        this.LL = 3;
        if (c2501109r7.collect(agS195S0200000_4, this) == objLJFF) {
            C1C7U.LIZIZ("TakoNimbleVM@c644.requestSourceData$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoNimbleVM@c644.requestSourceData$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
