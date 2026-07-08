package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.image.preview.CommentImageEditPreviewScene$showNleReadyView$1$1", f = "CommentImageEditPreviewScene.kt", l = {536}, m = "invokeSuspend")
public final class C1172120gbi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1451000nrW LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172120gbi(C1451000nrW c1451000nrW, InterfaceC1364105Vn<? super C1172120gbi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1451000nrW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1172120gbi(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentImageEditPreviewScene@ce71.showNleReadyView$1$1");
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
            C1451000nrW.LLLLLLZZ(this.LLILLJJLI);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("CommentImageEditPreviewScene@ce71.showNleReadyView$1$1");
                return objLJFF;
            }
        }
        C1322110kVd c1322110kVd = this.LLILLJJLI.LLJLLIL;
        if (c1322110kVd != null) {
            C1206770hVb.LIZ(c1322110kVd);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentImageEditPreviewScene@ce71.showNleReadyView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
