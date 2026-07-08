package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l4I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM$deleteComment$1", f = "CommentDeleteVM.kt", l = {193, 199, 251}, m = "invokeSuspend")
public final class C1343600l4I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ CommentDeleteVM LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ C1340400kz8 LLIZLLLIL;
    public final /* synthetic */ C20600815jK<InterfaceC1891350zJl> LLJ;
    public final /* synthetic */ CommentContextSource LLJI;
    public final /* synthetic */ Fragment LLJIJIL;
    public final /* synthetic */ CommentContextSource LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343600l4I(CommentDeleteVM commentDeleteVM, String str, int i, int i2, C1340400kz8 c1340400kz8, C20600815jK<InterfaceC1891350zJl> c20600815jK, CommentContextSource commentContextSource, Fragment fragment, CommentContextSource commentContextSource2, InterfaceC1364105Vn<? super C1343600l4I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = commentDeleteVM;
        this.LLILZIL = str;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = c1340400kz8;
        this.LLJ = c20600815jK;
        this.LLJI = commentContextSource;
        this.LLJIJIL = fragment;
        this.LLJILJIL = commentContextSource2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343600l4I(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1343600l4I.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
