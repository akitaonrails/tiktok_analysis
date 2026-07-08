package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.config.AITheaterConfigKt$AI_THEATER_CONFIG$5$5", f = "AITheaterConfig.kt", l = {127}, m = "invokeSuspend")
public final class C545920Lb4 extends C09AX implements Function2<CreativeModel, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C545920Lb4(InterfaceC1364105Vn<? super C545920Lb4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C545920Lb4 c545920Lb4 = new C545920Lb4(interfaceC1364105Vn);
        c545920Lb4.LLILLJJLI = obj;
        return c545920Lb4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJI;
        AITheaterCreationModel creationModel;
        AITheaterGenerationModel aITheaterGenerationModel;
        C1C7U.LIZ("AITheaterConfigKt@24ae.AI_THEATER_CONFIG$5$5");
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
            CreativeModel creativeModel = (CreativeModel) this.LLILLJJLI;
            this.LL = 1;
            AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
            if (aITheaterModel == null || (creationModel = aITheaterModel.getCreationModel()) == null || (aITheaterGenerationModel = creationModel.generationModel) == null || (objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C542150LOb(aITheaterGenerationModel, null))) != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("AITheaterConfigKt@24ae.AI_THEATER_CONFIG$5$5");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterConfigKt@24ae.AI_THEATER_CONFIG$5$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreativeModel creativeModel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(creativeModel, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
