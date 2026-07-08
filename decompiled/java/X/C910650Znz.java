package X;

import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler;

/* JADX INFO: renamed from: X.0Znz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler$DefaultImpls", f = "UnreadHandler.kt", l = {190}, m = "getState")
public final class C910650Znz extends AbstractC23140094w {
    public UnreadHandler LL;
    public MessageListScrollAbility LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public int LLILZIL;

    public C910650Znz(InterfaceC1364105Vn<? super C910650Znz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnreadHandler@d611.getState$1");
        this.LLILZ = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = C910640Zny.LIZ(null, 0L, null, null, this);
        C1C7U.LIZIZ("UnreadHandler@d611.getState$1");
        return objLIZ;
    }
}
