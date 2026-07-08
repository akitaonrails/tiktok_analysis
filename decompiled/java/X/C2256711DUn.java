package X;

import com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager;

/* JADX INFO: renamed from: X.1DUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creation.sender.mediasendingsteps.PublishPhotoStep", f = "PublishPhotoStep.kt", l = {355}, m = "execute")
public final class C2256711DUn extends AbstractC23140094w {
    public IMediaPublishManager LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C2256611DUd LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2256711DUn(C2256611DUd c2256611DUd, InterfaceC1364105Vn<? super C2256711DUn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c2256611DUd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublishPhotoStep@44a1.execute$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZ = this.LLJ.LIZ(null, this);
        C1C7U.LIZIZ("PublishPhotoStep@44a1.execute$1");
        return objLIZ;
    }
}
