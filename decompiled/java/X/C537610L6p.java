package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.SaveDraftByPath$genVideoPublishEditModel$3", f = "SaveDraftByPath.kt", l = {290, 290}, m = "invokeSuspend")
public final class C537610L6p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537610L6p(VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C537610L6p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537610L6p(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SaveDraftByPath@46c6.genVideoPublishEditModel$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SaveDraftByPath@46c6.genVideoPublishEditModel$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0MBE c0mbe = C0MBE.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
            this.LL = 1;
            c0mbe.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C0MBJ(videoPublishEditModel, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SaveDraftByPath@46c6.genVideoPublishEditModel$3");
                return objLJFF;
            }
        }
        this.LL = 2;
        if (((AnonymousClass0957) obj).LJLIIIL(this) == objLJFF) {
            C1C7U.LIZIZ("SaveDraftByPath@46c6.genVideoPublishEditModel$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SaveDraftByPath@46c6.genVideoPublishEditModel$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
