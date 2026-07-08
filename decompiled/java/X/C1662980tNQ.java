package X;

import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;

/* JADX INFO: renamed from: X.0tNQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.normal.MobileEffectUploadTask", f = "MobileEffectUploadTask.kt", l = {206}, m = "buildPublishEventTrackingData")
public final class C1662980tNQ extends AbstractC23140094w {
    public UploadableDraftEffect LL;
    public long LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1662990tNR LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1662980tNQ(C1662990tNR c1662990tNR, InterfaceC1364105Vn<? super C1662980tNQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1662990tNR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectUploadTask@45ee.buildPublishEventTrackingData$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILZIL.LJIILJJIL(null, this);
        C1C7U.LIZIZ("MobileEffectUploadTask@45ee.buildPublishEventTrackingData$1");
        return objLJIILJJIL;
    }
}
