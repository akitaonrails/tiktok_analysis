package X;

import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.ailive.StoryAILiveButtonComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.ailive.StoryAILiveButtonComponent$initForMainCreation$1", f = "StoryAILiveButtonComponent.kt", l = {136}, m = "invokeSuspend")
public final class C716390S8f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryAILiveButtonComponent LLILLJJLI;
    public final /* synthetic */ AIAliveInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C716390S8f(StoryAILiveButtonComponent storyAILiveButtonComponent, AIAliveInfo aIAliveInfo, InterfaceC1364105Vn<? super C716390S8f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyAILiveButtonComponent;
        this.LLILLL = aIAliveInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C716390S8f(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String text;
        C1C7U.LIZ("StoryAILiveButtonComponent@c982.initForMainCreation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IAILiveService iAILiveServiceEp = this.LLILLJJLI.Ep();
            AIAliveInfo aIAliveInfo = this.LLILLL;
            if (aIAliveInfo != null) {
                text = aIAliveInfo.getText();
            } else {
                text = null;
            }
            this.LL = 1;
            if (iAILiveServiceEp.translateAnchorText(text, this) == objLJFF) {
                C1C7U.LIZIZ("StoryAILiveButtonComponent@c982.initForMainCreation$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryAILiveButtonComponent@c982.initForMainCreation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
