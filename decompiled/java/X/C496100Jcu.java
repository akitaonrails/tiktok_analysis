package X;

import com.bytedance.android.live.network.response.BaseResponse;

/* JADX INFO: renamed from: X.0Jcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.bean.LiveProfileDeferred", f = "LiveProfileDeferred.kt", l = {27, 29, 31}, m = "await")
public final class C496100Jcu extends AbstractC23140094w {
    public BaseResponse LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C496090Jct LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496100Jcu(C496090Jct c496090Jct, InterfaceC1364105Vn<? super C496100Jcu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c496090Jct;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveProfileDeferred@a5a5.await$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(this);
        C1C7U.LIZIZ("LiveProfileDeferred@a5a5.await$1");
        return objLIZ;
    }
}
