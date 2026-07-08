package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelDescAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.title.TitlePanelDescAssem$bindFollowView$1", f = "TitlePanelDescAssem.kt", l = {}, m = "invokeSuspend")
public final class C437790HEr extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ TitlePanelDescAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437790HEr(TitlePanelDescAssem titlePanelDescAssem, InterfaceC1364105Vn<? super C437790HEr> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = titlePanelDescAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437790HEr(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TitlePanelDescAssem@5c87.bindFollowView$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceKp = this.LL.kp();
        c1350920lG6.getClass();
        C1350920lG6.LJJIJIIJIL(commentContextSourceKp, "click_follow");
        C1C7U.LIZIZ("TitlePanelDescAssem@5c87.bindFollowView$1");
        return false;
    }
}
