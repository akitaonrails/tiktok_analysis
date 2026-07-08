package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0LqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftRemover", f = "DraftRemover.kt", l = {153, 161, 162}, m = "deleteDraft")
public final class C555480LqU extends AbstractC23140094w {
    public AwemeDraft LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C555490LqV LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555480LqU(C555490LqV c555490LqV, InterfaceC1364105Vn<? super C555480LqU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c555490LqV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftRemover@581a.deleteDraft$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("DraftRemover@581a.deleteDraft$1");
        return objLIZIZ;
    }
}
