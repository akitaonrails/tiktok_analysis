package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.lite.LiteLynx$appendHybridContext$3", f = "LiteLynx.kt", l = {93, 93}, m = "invokeSuspend")
public final class C372901cd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SparkContext LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C372901cd(SparkContext sparkContext, InterfaceC1364105Vn<? super C372901cd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sparkContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C372901cd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiteLynx@f7a2.appendHybridContext$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiteLynx@f7a2.appendHybridContext$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            SparkContext sparkContext = this.LLILLJJLI;
            this.LL = 1;
            obj = C1536900q64.LIZ(sparkContext, null, Boolean.TRUE);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiteLynx@f7a2.appendHybridContext$3");
                return objLJFF;
            }
        }
        this.LL = 2;
        if (((AnonymousClass0957) obj).LJLIIIL(this) == objLJFF) {
            C1C7U.LIZIZ("LiteLynx@f7a2.appendHybridContext$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiteLynx@f7a2.appendHybridContext$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
