package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.IAIGCArchNewFrameworkDraftService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Law, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ugc.ProfileDraftTaskProgress$restoreDraftProgressWithNewArchAsyncTask$1", f = "ProfileDraftTaskProgress.kt", l = {142, 147, 151, 158}, m = "invokeSuspend")
public final class C545840Law extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public IAIGCArchNewFrameworkDraftService LL;
    public int LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;
    public final /* synthetic */ C545930Lb5 LLILZ;
    public final /* synthetic */ C553680Lna LLILZIL;
    public final /* synthetic */ Function1<C553680Lna, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C545840Law(AwemeDraft awemeDraft, C545930Lb5 c545930Lb5, C553680Lna c553680Lna, Function1<? super C553680Lna, Unit> function1, InterfaceC1364105Vn<? super C545840Law> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = awemeDraft;
        this.LLILZ = c545930Lb5;
        this.LLILZIL = c553680Lna;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C545840Law(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545840Law.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
