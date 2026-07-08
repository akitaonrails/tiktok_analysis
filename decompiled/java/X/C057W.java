package X;

import com.ss.android.ugc.aweme.story.userpanel.service.mention.IMentionAfterPublishApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.057W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishListContentAssem$executeMentionRequest$1", f = "MentionAfterPublishListContentAssem.kt", l = {}, m = "invokeSuspend")
public final class C057W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05FG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C057W(C05FG c05fg, InterfaceC1364105Vn<? super C057W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05fg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C057W(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionAfterPublishListContentAssem@9f01.executeMentionRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((IMentionAfterPublishApiService) C04TU.LIZIZ.getValue()).LIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionAfterPublishListContentAssem@9f01.executeMentionRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
