package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0CvP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoAwemeDetailRepository", f = "TakoAIVideoAwemeDetailRepository.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "queryBatchAweme")
public final class C329210CvP extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C329200CvO LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329210CvP(C329200CvO c329200CvO, InterfaceC1364105Vn<? super C329210CvP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c329200CvO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoAwemeDetailRepository@e877.queryBatchAweme$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, 0, this);
        C1C7U.LIZIZ("TakoAIVideoAwemeDetailRepository@e877.queryBatchAweme$1");
        return objLIZ;
    }
}
