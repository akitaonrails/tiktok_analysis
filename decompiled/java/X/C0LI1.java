package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LI1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.pugc.PUGCTemplateAutoSaveDraftComponet$saveDraftInternal$2", f = "PUGCTemplateAutoSaveDraftComponet.kt", l = {123}, m = "invokeSuspend")
public final class C0LI1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0LI2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LI1(C0LI2 c0li2, InterfaceC1364105Vn<? super C0LI1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0li2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LI1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("PUGCTemplateAutoSaveDraftComponet@1220.saveDraftInternal$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC545580LaW interfaceC545580LaWLIZIZ = C0CHQ.LIZ().LJI().LIZIZ();
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LLILLJJLI.LJJJLIIL();
            if (C1428520nHG.LJJJJJ(this.LLILLJJLI.LJJJLIIL())) {
                i = 22;
            } else {
                i = 19;
            }
            C538590LAj c538590LAj = new C538590LAj(videoPublishEditModelLJJJLIIL, new C0M2T(false, "PUGCTemplateAutoSaveDraftComponet", null, i, false, 28), false);
            this.LL = 1;
            obj = interfaceC545580LaWLIZIZ.LJI(c538590LAj, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PUGCTemplateAutoSaveDraftComponet@1220.saveDraftInternal$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.w2((C540340LHc) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PUGCTemplateAutoSaveDraftComponet@1220.saveDraftInternal$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
