package X;

import com.ss.android.ugc.aweme.story.api.IStoryViewerListImService;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import com.ss.android.ugc.aweme.story.service.StoryViewerListImServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel$setStateAfterGetResponse$1", f = "StoryViewerEntranceViewModel.kt", l = {131}, m = "invokeSuspend")
public final class C331270Cyj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC330550CxZ LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC330550CxZ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331270Cyj(InterfaceC330550CxZ interfaceC330550CxZ, InterfaceC1364105Vn<? super C331270Cyj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC330550CxZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331270Cyj(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<StoryInteractionUser> interactionUserList;
        InterfaceC330550CxZ interfaceC330550CxZ;
        C1C7U.LIZ("StoryViewerEntranceViewModel@1bc.setStateAfterGetResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                interfaceC330550CxZ = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC330550CxZ interfaceC330550CxZ2 = this.LLILLL;
            if (interfaceC330550CxZ2 != null && (interactionUserList = interfaceC330550CxZ2.getInteractionUserList()) != null) {
                interfaceC330550CxZ = this.LLILLL;
                IStoryViewerListImService iStoryViewerListImServiceLIZIZ = StoryViewerListImServiceImpl.LIZIZ();
                this.LL = interfaceC330550CxZ;
                this.LLILLJJLI = 1;
                obj = iStoryViewerListImServiceLIZIZ.LIZ(interactionUserList, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StoryViewerEntranceViewModel@1bc.setStateAfterGetResponse$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryViewerEntranceViewModel@1bc.setStateAfterGetResponse$1");
            return unit;
        }
        interfaceC330550CxZ.setInteractionUserList((List) obj);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryViewerEntranceViewModel@1bc.setStateAfterGetResponse$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
