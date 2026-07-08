package X;

import com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener;

/* JADX INFO: renamed from: X.0MBH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.SaveDraftByPath", f = "SaveDraftByPath.kt", l = {238}, m = "saveDraft")
public final class C0MBH extends AbstractC23140094w {
    public ISaveVideoToDraftListener LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0MBE LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MBH(C0MBE c0mbe, InterfaceC1364105Vn<? super C0MBH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0mbe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SaveDraftByPath@46c6.saveDraft$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, null, null, null, this);
        C1C7U.LIZIZ("SaveDraftByPath@46c6.saveDraft$1");
        return objLJ;
    }
}
