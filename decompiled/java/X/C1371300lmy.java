package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler;

/* JADX INFO: renamed from: X.0lmy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler", f = "LongPressShareButtonHandler.kt", l = {75}, m = "getShareLink")
public final class C1371300lmy extends AbstractC23140094w {
    public BaseSharePackage LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LongPressShareButtonHandler LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371300lmy(LongPressShareButtonHandler longPressShareButtonHandler, InterfaceC1364105Vn<? super C1371300lmy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = longPressShareButtonHandler;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LongPressShareButtonHandler@f385.getShareLink$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLL.LJIIIZ(null, null, this);
        C1C7U.LIZIZ("LongPressShareButtonHandler@f385.getShareLink$1");
        return objLJIIIZ;
    }
}
