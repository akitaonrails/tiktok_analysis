package X;

import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l71, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$publishComment$4$1$resp$1", f = "CommentPublishViewModel.kt", l = {434, 440, 477}, m = "invokeSuspend")
public final class C1345290l71 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CommentResponse>, Object> {
    public AudioCommentModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1345120l6k LLILLL;
    public final /* synthetic */ CommentPublishViewModel LLILZ;
    public final /* synthetic */ Comment LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ Aweme LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1345290l71(C1345120l6k c1345120l6k, CommentPublishViewModel commentPublishViewModel, Comment comment, C259800zU<String> c259800zU, Aweme aweme, InterfaceC1364105Vn<? super C1345290l71> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1345120l6k;
        this.LLILZ = commentPublishViewModel;
        this.LLILZIL = comment;
        this.LLILZLL = c259800zU;
        this.LLIZ = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1345290l71(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x044b A[PHI: r2
      0x044b: PHI (r2v62 java.lang.String) = (r2v56 java.lang.String), (r2v64 java.lang.String) binds: [B:210:0x0417, B:204:0x0405] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f4  */
    /* JADX WARN: Type inference failed for: r2v110, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0l6z, X.0lMy] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 1565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345290l71.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CommentResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
