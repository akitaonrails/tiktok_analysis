package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.actionbar.CommentPageActionBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.actionbar.CommentPageActionBarAssem$updateUserInfo$1$1", f = "CommentPageActionBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C437760HEo extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ CommentPageActionBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437760HEo(CommentPageActionBarAssem commentPageActionBarAssem, InterfaceC1364105Vn<? super C437760HEo> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = commentPageActionBarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437760HEo(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentPageActionBarAssem@5db4.updateUserInfo$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceKp = this.LL.kp();
        c1350920lG6.getClass();
        C1350920lG6.LJJIJIIJIL(commentContextSourceKp, "click_follow");
        C1C7U.LIZIZ("CommentPageActionBarAssem@5db4.updateUserInfo$1$1");
        return false;
    }
}
