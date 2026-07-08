package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;

/* JADX INFO: renamed from: X.0LZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowManagerAdapter", f = "AIGCWorkflowManagerAdapter.kt", l = {30, 32}, m = "updateCreationIdByOldId")
public final class C545000LZa extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public AIGCWorkflowCreationService LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0LZZ LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545000LZa(C0LZZ c0lzz, InterfaceC1364105Vn<? super C545000LZa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0lzz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowManagerAdapter@c1ff.updateCreationIdByOldId$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowManagerAdapter@c1ff.updateCreationIdByOldId$1");
        return objLIZ;
    }
}
