package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import njp.a;

/* JADX INFO: renamed from: X.0nes, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.draft.ImageEditAutoSaveDraftComponent$recoverDraft$1$1", f = "ImageEditAutoSaveDraftComponent.kt", l = {98}, m = "invokeSuspend")
public final class C1443160nes extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ C1443180neu LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1443160nes(VideoPublishEditModel videoPublishEditModel, C1443180neu c1443180neu, InterfaceC1364105Vn<? super C1443160nes> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = c1443180neu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1443160nes(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageEditAutoSaveDraftComponent@4f55.recoverDraft$1$1");
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
            InterfaceC545580LaW interfaceC545580LaWLIZIZ = C0CHQ.LIZ().LJI().LIZIZ();
            C538590LAj c538590LAj = new C538590LAj(this.LLILLJJLI, new C0M2T(false, "ImageEditAutoSaveDraftComponent", null, 20, false, 28), false);
            AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(171);
            this.LL = 1;
            obj = interfaceC545580LaWLIZIZ.LJI(c538590LAj, aFwS261S0000000_22, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImageEditAutoSaveDraftComponent@4f55.recoverDraft$1$1");
                return objLJFF;
            }
        }
        this.LLILLL.m3((C540340LHc) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditAutoSaveDraftComponent@4f55.recoverDraft$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
