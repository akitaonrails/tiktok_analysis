package X;

import android.content.Context;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.story.IStoryNoteService;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.15g1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment$initViews$13$1", f = "StoryThoughtAvatarCreationFragment.kt", l = {332}, m = "invokeSuspend")
public final class C20580315g1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20580115fz LLILLJJLI;
    public final /* synthetic */ StoryThoughtAvatarCreationFragment LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20580315g1(C20580115fz c20580115fz, StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment, View view, InterfaceC1364105Vn<? super C20580315g1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20580115fz;
        this.LLILLL = storyThoughtAvatarCreationFragment;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20580315g1(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        C1C7U.LIZ("StoryThoughtAvatarCreationFragment@ce9f.initViews$13$1");
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
            if (this.LLILLJJLI.LLJJJIL.getPrompt().LIZIZ != EnumC19387610t8.HOLIDAY && this.LLILLJJLI.LLJJJIL.getPrompt().LIZIZ != EnumC19387610t8.DYNAMIC) {
                z = false;
            } else {
                z = true;
            }
            String str2 = this.LLILLJJLI.LLJJJIL.getPrompt().LIZ;
            StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVMWR = this.LLILLL.WR();
            Context context = this.LLILZ.getContext();
            StoryNoteInfoModel storyNoteInfoModelXQ2 = storyThoughtAvatarCreationVMWR.xQ2(str2, z);
            C1404940mfE c1404940mfEWQ2 = storyThoughtAvatarCreationVMWR.wQ2();
            if (C298600Bn8.LIZ()) {
                c1404940mfEWQ2.LJI = storyThoughtAvatarCreationVMWR.LLLLL.getValue();
            }
            IStoryNoteService iStoryNoteService = (IStoryNoteService) PluggableExtentionKt.pluggableSpi$default(IStoryNoteService.class, false, false, false, 14, null);
            if (iStoryNoteService != null) {
                iStoryNoteService.publishStoryNote(context, storyNoteInfoModelXQ2, c1404940mfEWQ2);
            }
            if (((Boolean) C287160BNi.LIZIZ.getValue()).booleanValue()) {
                EnumC1405120mfW enumC1405120mfW = (EnumC1405120mfW) storyThoughtAvatarCreationVMWR.LLLJIL.getValue();
                if (enumC1405120mfW == EnumC1405120mfW.GENERATED_AVATAR) {
                    enumC1405120mfW = EnumC1405120mfW.SOCIAL_AVATAR;
                }
                Keva.getRepo("story_thought").storeInt(storyThoughtAvatarCreationVMWR.BQ2(), enumC1405120mfW.getValue());
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C751810TeN c751810TeN = new C751810TeN(this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c751810TeN) == objLJFF) {
                C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.initViews$13$1");
                return objLJFF;
            }
        }
        if (this.LLILLL.WR().LLJJLIIIJLLLLLLLZ) {
            C19EG activity = this.LLILLL.getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else {
            if (Intrinsics.LJFF(this.LLILLL.WR().LLJJL, "personal_homepage")) {
                str = "USER";
            } else {
                str = "NOTIFICATION";
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILLL.getActivity(), "//main");
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", str);
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.addFlags(536870912);
            smartRouteBuildRoute.open();
            C19EG activity2 = this.LLILLL.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.initViews$13$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
