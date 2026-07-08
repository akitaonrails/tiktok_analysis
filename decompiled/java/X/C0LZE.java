package X;

import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LZE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$onClickItem$1$2$1", f = "DraftFragment.kt", l = {1357, 1388, 1380}, m = "invokeSuspend")
public final class C0LZE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public AwemeDraft LL;
    public C0LZB LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public AIGCOfflineModel LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final /* synthetic */ C0M0P LLIZLLLIL;
    public final /* synthetic */ DraftFragment LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LZE(DraftFragment draftFragment, C0M0P c0m0p, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c0m0p;
        this.LLJ = draftFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LZE(this.LLJ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LZE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
