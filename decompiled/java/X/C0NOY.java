package X;

import com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NOY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl$markExplosionConsumed$2", f = "AwemeEffectRepositoryImpl.kt", l = {176}, m = "invokeSuspend")
public final class C0NOY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public final /* synthetic */ AwemeEffectRepositoryImpl LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NOY(AwemeEffectRepositoryImpl awemeEffectRepositoryImpl, List<String> list, InterfaceC1364105Vn<? super C0NOY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeEffectRepositoryImpl;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NOY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("AwemeEffectRepositoryImpl@f694.markExplosionConsumed$2");
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
            InterfaceC593180NOi interfaceC593180NOiLJIIJJI = this.LLILLJJLI.LJIIJJI();
            if (interfaceC593180NOiLJIIJJI != null) {
                List<String> list = this.LLILLL;
                this.LL = 1;
                obj = interfaceC593180NOiLJIIJJI.LJIIIIZZ(list, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.markExplosionConsumed$2");
                    return objLJFF;
                }
            } else {
                iIntValue = 0;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("markExplosionConsumed: marked ");
                sbLIZ.append(iIntValue);
                sbLIZ.append(" rows");
                C2188811AlT.LIZIZ(sbLIZ);
                Integer numLJ = C2286608xc.LJ(iIntValue);
                C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.markExplosionConsumed$2");
                return numLJ;
            }
        }
        iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("markExplosionConsumed: marked ");
        sbLIZ2.append(iIntValue);
        sbLIZ2.append(" rows");
        C2188811AlT.LIZIZ(sbLIZ2);
        Integer numLJ2 = C2286608xc.LJ(iIntValue);
        C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.markExplosionConsumed$2");
        return numLJ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
