package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.view.PostModeUserComponent$doInit$4$2", f = "PostModeUserComponent.kt", l = {}, m = "invokeSuspend")
public final class C437740HEm extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C0SW9 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437740HEm(C0SW9 c0sw9, InterfaceC1364105Vn<? super C437740HEm> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c0sw9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437740HEm(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PostModeUserComponent@d361.doInit$4$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceLIZ = this.LL.LIZ();
        c1350920lG6.getClass();
        C1350920lG6.LJJIJIIJIL(commentContextSourceLIZ, "click_follow");
        C1C7U.LIZIZ("PostModeUserComponent@d361.doInit$4$2");
        return false;
    }
}
