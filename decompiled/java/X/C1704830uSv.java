package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.DefaultResourceProvider$downloadEffect$3", f = "DefaultResourceProvider.kt", l = {774, 775}, m = "invokeSuspend")
public final class C1704830uSv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1705310uTh LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ InterfaceC1705380uTo<Effect> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1704830uSv(C1705310uTh c1705310uTh, Effect effect, InterfaceC1705380uTo<? super Effect> interfaceC1705380uTo, InterfaceC1364105Vn<? super C1704830uSv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1705310uTh;
        this.LLILLL = effect;
        this.LLILZ = interfaceC1705380uTo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704830uSv(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultResourceProvider@b5b8.downloadEffect$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DefaultResourceProvider@b5b8.downloadEffect$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1705310uTh c1705310uTh = this.LLILLJJLI;
            Effect effect = this.LLILLL;
            this.LL = 1;
            obj = c1705310uTh.LJJIFFI(effect, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultResourceProvider@b5b8.downloadEffect$3");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1704820uSu c1704820uSu = new C1704820uSu((C1704730uSl) obj, this.LLILZ, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1704820uSu) == objLJFF) {
            C1C7U.LIZIZ("DefaultResourceProvider@b5b8.downloadEffect$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DefaultResourceProvider@b5b8.downloadEffect$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
