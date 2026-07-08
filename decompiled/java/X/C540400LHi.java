package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.textpublish.TextPublishResolver$resolve$1$1", f = "TextPublishResolver.kt", l = {}, m = "invokeSuspend")
public final class C540400LHi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540400LHi(VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C540400LHi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540400LHi(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextPublishResolver@efa0.resolve$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CHQ.LIZ().getPublishService().LJJJLL();
        C1431870nMf.LJIIL(new C538590LAj(this.LL, new C0M2T(false, "TextPublishStart", null, 36, false, 28), false), new InterfaceC540360LHe() { // from class: X.0LHj
            @Override // X.InterfaceC540360LHe
            public final Function1<AwemeDraft, Unit> LIZ() {
                return null;
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZIZ(C540340LHc c540340LHc) {
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZJ(C540340LHc c540340LHc) {
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextPublishResolver@efa0.resolve$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
