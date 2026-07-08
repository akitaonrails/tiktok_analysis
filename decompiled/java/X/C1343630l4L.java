package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l4L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM$deleteComment$1$2$1", f = "CommentDeleteVM.kt", l = {}, m = "invokeSuspend")
public final class C1343630l4L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentDeleteVM LL;
    public final /* synthetic */ C1340400kz8 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C20600815jK<InterfaceC1891350zJl> LLILZ;
    public final /* synthetic */ CommentContextSource LLILZIL;
    public final /* synthetic */ Fragment LLILZLL;
    public final /* synthetic */ CommentContextSource LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343630l4L(CommentDeleteVM commentDeleteVM, C1340400kz8 c1340400kz8, String str, C20600815jK<InterfaceC1891350zJl> c20600815jK, CommentContextSource commentContextSource, Fragment fragment, CommentContextSource commentContextSource2, InterfaceC1364105Vn<? super C1343630l4L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentDeleteVM;
        this.LLILLJJLI = c1340400kz8;
        this.LLILLL = str;
        this.LLILZ = c20600815jK;
        this.LLILZIL = commentContextSource;
        this.LLILZLL = fragment;
        this.LLIZ = commentContextSource2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343630l4L(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2 A[PHI: r6 r9
      0x01e2: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v6 java.lang.String) binds: [B:75:0x01de, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v5 java.lang.String) binds: [B:75:0x01de, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.09AY, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1343630l4L.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
