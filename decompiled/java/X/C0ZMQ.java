package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.birthday.LightInteractionBirthdayServiceImpl;

/* JADX INFO: renamed from: X.0ZMQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.birthday.LightInteractionBirthdayServiceImpl", f = "LightInteractionBirthdayServiceImpl.kt", l = {144}, m = "fetchBirthdayInfo")
public final class C0ZMQ extends AbstractC23140094w {
    public Object LL;
    public Keva LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ LightInteractionBirthdayServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZMQ(LightInteractionBirthdayServiceImpl lightInteractionBirthdayServiceImpl, InterfaceC1364105Vn<? super C0ZMQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = lightInteractionBirthdayServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LightInteractionBirthdayServiceImpl@3436.fetchBirthdayInfo$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(0L, null, null, this);
        C1C7U.LIZIZ("LightInteractionBirthdayServiceImpl@3436.fetchBirthdayInfo$1");
        return objLIZJ;
    }
}
