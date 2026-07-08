package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo;
import com.ss.android.ugc.aweme.im.service.impl.relationlabel.IMRelationLabelServiceImpl;

/* JADX INFO: renamed from: X.065s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.relationlabel.IMRelationLabelServiceImpl", f = "IMRelationLabelServiceImpl.kt", l = {79}, m = "fetchFromServer")
public final class C15518065s extends AbstractC23140094w {
    public IMRelationLabelInfo LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ IMRelationLabelServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15518065s(IMRelationLabelServiceImpl iMRelationLabelServiceImpl, InterfaceC1364105Vn<? super C15518065s> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = iMRelationLabelServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMRelationLabelServiceImpl@abc5.fetchFromServer$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, null, this);
        C1C7U.LIZIZ("IMRelationLabelServiceImpl@abc5.fetchFromServer$1");
        return objLIZLLL;
    }
}
