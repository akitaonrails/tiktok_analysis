package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelNavAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.title.TitlePanelNavAssem$initUserLayout$4$1", f = "TitlePanelNavAssem.kt", l = {}, m = "invokeSuspend")
public final class C437750HEn extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ TitlePanelNavAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437750HEn(TitlePanelNavAssem titlePanelNavAssem, InterfaceC1364105Vn<? super C437750HEn> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = titlePanelNavAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437750HEn(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TitlePanelNavAssem@9357.initUserLayout$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceJo = this.LL.Jo();
        c1350920lG6.getClass();
        C1350920lG6.LJJIJIIJIL(commentContextSourceJo, "click_follow");
        C1C7U.LIZIZ("TitlePanelNavAssem@9357.initUserLayout$4$1");
        return false;
    }
}
