package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.0MNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.openstory.processor.OpenStoryImageProcessor", f = "OpenStoryImageProcessor.kt", l = {64}, m = "prepareShareImageData")
public final class C567380MNc extends AbstractC23140094w {
    public CreativeInfo LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C567400MNe LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567380MNc(C567400MNe c567400MNe, InterfaceC1364105Vn<? super C567380MNc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c567400MNe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenStoryImageProcessor@2bdc.prepareShareImageData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, null, this);
        C1C7U.LIZIZ("OpenStoryImageProcessor@2bdc.prepareShareImageData$1");
        return objLIZ;
    }
}
