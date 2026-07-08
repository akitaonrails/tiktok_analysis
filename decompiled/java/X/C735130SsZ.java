package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.ExternalService;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryToPostShareVM;
import com.ss.android.ugc.aweme.story.model.SwitchToStoryResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import njp.a;

/* JADX INFO: renamed from: X.0SsZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryToPostShareVM$convertStoryToPost$1", f = "StoryToPostShareVM.kt", l = {52}, m = "invokeSuspend")
public final class C735130SsZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public StoryToPostShareVM LL;
    public Aweme LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ Aweme LLIZ;
    public final /* synthetic */ StoryToPostShareVM LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C735130SsZ(Aweme aweme, StoryToPostShareVM storyToPostShareVM, String str, String str2, String str3, InterfaceC1364105Vn<? super C735130SsZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = aweme;
        this.LLIZLLLIL = storyToPostShareVM;
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C735130SsZ(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        StoryToPostShareVM storyToPostShareVM;
        Aweme aweme;
        String str;
        String str2;
        String str3;
        SwitchToStoryResponse switchToStoryResponse;
        Object objSwitchStoryToNormal = obj;
        C1C7U.LIZ("StoryToPostShareVM@1e14.convertStoryToPost$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    str3 = (String) this.LLILZIL;
                    str2 = (String) this.LLILZ;
                    str = (String) this.LLILLL;
                    aweme = this.LLILLJJLI;
                    storyToPostShareVM = this.LL;
                    C155000ia.LIZIZ(objSwitchStoryToNormal);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objSwitchStoryToNormal);
                Aweme aweme2 = this.LLIZ;
                if (aweme2 == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoryToPostShareVM@1e14.convertStoryToPost$1");
                    return unit;
                }
                Long lLJIILIIL = C2095008Iq.LJIILIIL(aweme2.getAid());
                if (lLJIILIIL != null) {
                    long jLongValue = lLJIILIIL.longValue();
                    this.LLIZLLLIL.setState(new AwS590S0100000_11(this.LLIZ, 583));
                    storyToPostShareVM = this.LLIZLLLIL;
                    aweme = this.LLIZ;
                    str = this.LLJ;
                    str2 = this.LLJI;
                    str3 = this.LLJIJIL;
                    StoryApi storyApi = StoryApi.LIZIZ;
                    Long lLJFF = C2286608xc.LJFF(jLongValue);
                    ExternalService externalService = ExternalService.INSTANCE;
                    Integer numLJ = C2286608xc.LJ(externalService.getCommentSettingCache());
                    Integer numLJ2 = C2286608xc.LJ(externalService.getPermissionSettingCache());
                    this.LL = storyToPostShareVM;
                    this.LLILLJJLI = aweme;
                    this.LLILLL = str;
                    this.LLILZ = str2;
                    this.LLILZIL = str3;
                    this.LLILZLL = 1;
                    objSwitchStoryToNormal = storyApi.switchStoryToNormal(lLJFF, numLJ, numLJ2, this);
                    if (objSwitchStoryToNormal == objLJFF) {
                        C1C7U.LIZIZ("StoryToPostShareVM@1e14.convertStoryToPost$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("StoryToPostShareVM@1e14.convertStoryToPost$1");
                    return unit2;
                }
            }
            switchToStoryResponse = (SwitchToStoryResponse) objSwitchStoryToNormal;
            switchToStoryResponse.checkValid();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (switchToStoryResponse.getAweme() == null) {
            storyToPostShareVM.setState(new AwS590S0100000_11(aweme, 584));
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("StoryToPostShareVM@1e14.convertStoryToPost$1");
            return unit3;
        }
        storyToPostShareVM.setState(new AwS377S0200000_11(aweme, switchToStoryResponse, 167));
        StoryToPostShareVM.vQ2(aweme, "story_to_post_success_bubble_show", str, str2, str3);
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        StoryToPostShareVM storyToPostShareVM2 = this.LLIZLLLIL;
        Aweme aweme3 = this.LLIZ;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            storyToPostShareVM2.setState(new AwS590S0100000_11(aweme3, 585));
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("StoryToPostShareVM@1e14.convertStoryToPost$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
