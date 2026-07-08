package X;

import com.ss.android.ugc.aweme.aigc.aiplayground.navigate.AIPlaygroundNavigationService;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;

/* JADX INFO: renamed from: X.0Lsj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.navigate.AIPlaygroundNavigationService", f = "AIPlaygroundNavigationService.kt", l = {66, 70, 94}, m = "openEditPageWithAiPlaygroundData")
public final class C556870Lsj extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public EditorProAIGCMediaItemModel LLILZLL;
    public boolean LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ AIPlaygroundNavigationService LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556870Lsj(AIPlaygroundNavigationService aIPlaygroundNavigationService, InterfaceC1364105Vn<? super C556870Lsj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = aIPlaygroundNavigationService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPlaygroundNavigationService@311b.openEditPageWithAiPlaygroundData$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZ = this.LLJ.LIZ(null, null, null, false, this);
        C1C7U.LIZIZ("AIPlaygroundNavigationService@311b.openEditPageWithAiPlaygroundData$1");
        return objLIZ;
    }
}
