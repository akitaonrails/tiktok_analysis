package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MYW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftSaveOpKt$saveDraftInternal$2", f = "DraftSaveOp.kt", l = {}, m = "invokeSuspend")
public final class C0MYW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C540340LHc>, Object> {
    public final /* synthetic */ AwemeDraft LL;
    public final /* synthetic */ C0M2T LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MYW(AwemeDraft awemeDraft, C0M2T c0m2t, VideoPublishEditModel videoPublishEditModel, String str, InterfaceC1364105Vn<? super C0MYW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDraft;
        this.LLILLJJLI = c0m2t;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MYW(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Type inference failed for: r6v28, types: [T, com.ss.android.ugc.aweme.draft.model.DraftSaveResult] */
    /* JADX WARN: Type inference failed for: r6v57, types: [T, com.ss.android.ugc.aweme.draft.model.DraftSaveResult] */
    /* JADX WARN: Type inference failed for: r6v85, types: [T, com.ss.android.ugc.aweme.draft.model.DraftSaveResult] */
    /* JADX WARN: Type inference failed for: r8v10, types: [T, com.ss.android.ugc.aweme.draft.model.AwemeDraft] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, com.ss.android.ugc.aweme.draft.model.DraftSaveResult] */
    /* JADX WARN: Type inference failed for: r8v20, types: [T, com.ss.android.ugc.aweme.draft.model.DraftSaveResult] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) throws X.C0MYN {
        /*
            Method dump skipped, instruction units count: 2178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MYW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C540340LHc> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
