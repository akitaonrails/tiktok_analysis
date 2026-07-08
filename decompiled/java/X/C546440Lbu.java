package X;

import com.ss.android.ugc.aweme.aigc.DraftServiceImpl;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;

/* JADX INFO: renamed from: X.0Lbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.DraftServiceImpl", f = "DraftServiceImpl.kt", l = {276}, m = "onLocalDraftDeleted")
public final class C546440Lbu extends AbstractC23140094w {
    public CreativeModel LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ DraftServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546440Lbu(DraftServiceImpl draftServiceImpl, InterfaceC1364105Vn<? super C546440Lbu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = draftServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftServiceImpl@2753.onLocalDraftDeleted$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(null, this);
        C1C7U.LIZIZ("DraftServiceImpl@2753.onLocalDraftDeleted$1");
        return objLIZIZ;
    }
}
