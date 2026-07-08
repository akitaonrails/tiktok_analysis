package X;

import Y.AgS208S0200000_25;
import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.screen.HighlightsPreviewScreenKt$HighlightsPreviewScreen$2$1$1", f = "HighlightsPreviewScreen.kt", l = {107, 110}, m = "invokeSuspend")
public final class C1674350tfl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsCreationVM LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674350tfl(StoryHighlightsCreationVM storyHighlightsCreationVM, Activity activity, InterfaceC1364105Vn<? super C1674350tfl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsCreationVM;
        this.LLILLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1674350tfl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<StoryHighlightAwemePreview> listLJIILL;
        C1C7U.LIZ("HighlightsPreviewScreenKt@88bb.HighlightsPreviewScreen$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StoryHighlightsCreationVM storyHighlightsCreationVM = this.LLILLJJLI;
            storyHighlightsCreationVM.getClass();
            IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
            if (iStoryHighlightsMyDataManager != null && iStoryHighlightsMyDataManager.LIZIZ()) {
                C2252321DDq c2252321DDq = storyHighlightsCreationVM.LL;
                C1674360tfm c1674360tfm = (C1674360tfm) c2252321DDq.getValue();
                IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager2 = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
                if (iStoryHighlightsMyDataManager2 == null || (listLJIILL = iStoryHighlightsMyDataManager2.LJIILL()) == null) {
                    listLJIILL = C13BV.INSTANCE;
                }
                c2252321DDq.setValue(C1674360tfm.LIZ(c1674360tfm, listLJIILL, null, null, null, null, 30));
            }
            StoryHighlightsCreationVM storyHighlightsCreationVM2 = this.LLILLJJLI;
            this.LL = 1;
            if (storyHighlightsCreationVM2.AQ2(this) == objLJFF) {
                C1C7U.LIZIZ("HighlightsPreviewScreenKt@88bb.HighlightsPreviewScreen$2$1$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.zQ2()) {
            StoryHighlightsCreationVM storyHighlightsCreationVM3 = this.LLILLJJLI;
            C2252331DDr c2252331DDr = storyHighlightsCreationVM3.LLIZLLLIL;
            AgS208S0200000_25 agS208S0200000_25 = new AgS208S0200000_25(this.LLILLL, storyHighlightsCreationVM3, 15);
            this.LL = 2;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS208S0200000_25, this) == objLJFF) {
                C1C7U.LIZIZ("HighlightsPreviewScreenKt@88bb.HighlightsPreviewScreen$2$1$1");
                return objLJFF;
            }
            throw new C2197108jB();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HighlightsPreviewScreenKt@88bb.HighlightsPreviewScreen$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
