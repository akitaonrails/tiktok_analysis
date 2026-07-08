package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelCommentCtxAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HoZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.title.TitlePanelCommentCtxAssem$sendCloseCommentEvent$1", f = "TitlePanelCommentCtxAssem.kt", l = {}, m = "invokeSuspend")
public final class C452370HoZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TitlePanelCommentCtxAssem LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C1343080l3S LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452370HoZ(TitlePanelCommentCtxAssem titlePanelCommentCtxAssem, long j, String str, long j2, C1343080l3S c1343080l3S, long j3, long j4, InterfaceC1364105Vn<? super C452370HoZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = titlePanelCommentCtxAssem;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = j2;
        this.LLILZIL = c1343080l3S;
        this.LLILZLL = j3;
        this.LLIZ = j4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452370HoZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TitlePanelCommentCtxAssem@8017.sendCloseCommentEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TitlePanelCommentCtxAssem titlePanelCommentCtxAssem = this.LL;
        C726120Se2 c726120Se2 = titlePanelCommentCtxAssem.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TitlePanelCommentCtxAssem.LLJILJILJ;
        CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(titlePanelCommentCtxAssem);
        long j = this.LLILLJJLI;
        String str = this.LLILLL;
        if (str == null) {
            str = "";
        }
        C1350920lG6.LJJLIIIJLJLI(commentContextSourceLIZ, j, str, null, this.LLILZ, 0L, this.LLILZIL, this.LLILZLL, this.LLIZ, -1L, 72);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TitlePanelCommentCtxAssem@8017.sendCloseCommentEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
