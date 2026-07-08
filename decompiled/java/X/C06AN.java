package X;

import com.ss.android.ugc.aweme.im.service.DmHelper;

/* JADX INFO: renamed from: X.06AN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.DmHelper", f = "DmHelper.kt", l = {204}, m = "saveLastReadMessageReactionTimestampKv")
public final class C06AN extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ DmHelper LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06AN(DmHelper dmHelper, InterfaceC1364105Vn<? super C06AN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = dmHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DmHelper@d68.saveLastReadMessageReactionTimestampKv$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILZ.LJIILIIL(null, null, this);
        C1C7U.LIZIZ("DmHelper@d68.saveLastReadMessageReactionTimestampKv$1");
        return objLJIILIIL;
    }
}
