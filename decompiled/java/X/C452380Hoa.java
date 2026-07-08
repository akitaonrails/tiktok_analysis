package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelCommentCtxAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hoa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.title.TitlePanelCommentCtxAssem$SheetVisibilityCallback$onShow$3", f = "TitlePanelCommentCtxAssem.kt", l = {}, m = "invokeSuspend")
public final class C452380Hoa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TitlePanelCommentCtxAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452380Hoa(TitlePanelCommentCtxAssem titlePanelCommentCtxAssem, InterfaceC1364105Vn<? super C452380Hoa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = titlePanelCommentCtxAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452380Hoa(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TitlePanelCommentCtxAssem$SheetVisibilityCallback@7681.onShow$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        TitlePanelCommentCtxAssem titlePanelCommentCtxAssem = this.LL;
        C726120Se2 c726120Se2 = titlePanelCommentCtxAssem.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TitlePanelCommentCtxAssem.LLJILJILJ;
        CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(titlePanelCommentCtxAssem);
        c1350920lG6.getClass();
        C1350920lG6.LJLJL(commentContextSourceLIZ, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TitlePanelCommentCtxAssem$SheetVisibilityCallback@7681.onShow$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
