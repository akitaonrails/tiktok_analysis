package X;

import com.ss.android.ugc.aweme.service.IMentionMixSearchService;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel$performMixSearchRefresh$2$localDeferred$1", f = "StoryUserListViewModel.kt", l = {388}, m = "invokeSuspend")
public final class C317230Cc5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C225300tv>, Object> {
    public int LL;
    public final /* synthetic */ IMentionMixSearchService LLILLJJLI;
    public final /* synthetic */ StoryUserListViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317230Cc5(IMentionMixSearchService iMentionMixSearchService, StoryUserListViewModel storyUserListViewModel, InterfaceC1364105Vn<? super C317230Cc5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMentionMixSearchService;
        this.LLILLL = storyUserListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317230Cc5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryUserListViewModel@f7dd.performMixSearchRefresh$2$localDeferred$1");
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
            IMentionMixSearchService iMentionMixSearchService = this.LLILLJJLI;
            String str = this.LLILLL.LLILZ;
            this.LL = 1;
            obj = iMentionMixSearchService.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryUserListViewModel@f7dd.performMixSearchRefresh$2$localDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StoryUserListViewModel@f7dd.performMixSearchRefresh$2$localDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C225300tv> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
