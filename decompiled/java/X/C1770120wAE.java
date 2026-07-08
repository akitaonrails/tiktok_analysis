package X;

import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0wAE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem", f = "EcVideoGuideAssem.kt", l = {983, 412, 1019, 518, 518}, m = "startInterest")
public final class C1770120wAE extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ EcVideoGuideAssem LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770120wAE(EcVideoGuideAssem ecVideoGuideAssem, InterfaceC1364105Vn<? super C1770120wAE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = ecVideoGuideAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("EcVideoGuideAssem@5df3.startInterest$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objIq = this.LLJI.iq(this);
        C1C7U.LIZIZ("EcVideoGuideAssem@5df3.startInterest$1");
        return objIq;
    }
}
