package X;

import com.ss.android.ugc.aweme.im.service.impl.deeplink.IMDeepLinkHandlerAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.064m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15486064m extends C09AY implements InterfaceC1631620sYq<Integer, Integer, Object, Unit> {
    public final /* synthetic */ IMDeepLinkHandlerAssem LL;
    public final /* synthetic */ AnonymousClass0653 LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15486064m(IMDeepLinkHandlerAssem iMDeepLinkHandlerAssem, AnonymousClass0653 anonymousClass0653, C19EG c19eg) {
        super(3);
        this.LL = iMDeepLinkHandlerAssem;
        this.LLILLJJLI = anonymousClass0653;
        this.LLILLL = c19eg;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Integer num2, Object obj) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        if (iIntValue == 1 && iIntValue2 == 1) {
            IMDeepLinkHandlerAssem iMDeepLinkHandlerAssem = this.LL;
            AnonymousClass0653 anonymousClass0653 = this.LLILLJJLI;
            C19EG c19eg = this.LLILLL;
            iMDeepLinkHandlerAssem.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C15485064l(anonymousClass0653, iMDeepLinkHandlerAssem, c19eg, null), 3);
        }
        return Unit.LIZ;
    }
}
