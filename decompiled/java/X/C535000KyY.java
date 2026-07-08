package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0KyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiofflineeffect.AiOfflineEffectContentDataSource", f = "AiOfflineEffectContentDataSource.kt", l = {91}, m = "toAiContent")
public final class C535000KyY extends AbstractC23140094w {
    public AwemeDraft LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LPK LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535000KyY(C0LPK c0lpk, InterfaceC1364105Vn<? super C535000KyY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lpk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiOfflineEffectContentDataSource@24a7.toAiContent$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        C1C7U.LIZIZ("AiOfflineEffectContentDataSource@24a7.toAiContent$1");
        return objLJ;
    }
}
