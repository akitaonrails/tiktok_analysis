package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.audio.InstantCloneConsumptionModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.InstantCloneParser$parse$instantCloneConsumptionModelAsync$1", f = "InstantCloneParser.kt", l = {172}, m = "invokeSuspend")
public final class C1368205Xc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0MOS LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ C259800zU<InstantCloneConsumptionModel> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368205Xc(C0MOS c0mos, Context context, C259800zU<InstantCloneConsumptionModel> c259800zU, InterfaceC1364105Vn<? super C1368205Xc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0mos;
        this.LLILZ = context;
        this.LLILZIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1368205Xc(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstantCloneParser@3cac.parse$instantCloneConsumptionModelAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0MOS c0mos = this.LLILLL;
            this.LL = this.LLILZ;
            this.LLILLJJLI = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            c0mos.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1406205eu(c2252611DEt, null), 3);
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InstantCloneParser@3cac.parse$instantCloneConsumptionModelAsync$1");
                return objLJFF;
            }
        }
        this.LLILZIL.element = obj;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InstantCloneParser@3cac.parse$instantCloneConsumptionModelAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
