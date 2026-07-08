package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarSheetFragment;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarSheetFragment$onViewCreated$5", f = "StoryThoughtAvatarSheetFragment.kt", l = {114}, m = "invokeSuspend")
public final class C433620GzQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryThoughtAvatarSheetFragment LLILLJJLI;
    public final /* synthetic */ C0HCH LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433620GzQ(StoryThoughtAvatarSheetFragment storyThoughtAvatarSheetFragment, C0HCH c0hch, InterfaceC1364105Vn<? super C433620GzQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyThoughtAvatarSheetFragment;
        this.LLILLL = c0hch;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433620GzQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtAvatarSheetFragment@7f43.onViewCreated$5");
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
            ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) this.LLILLJJLI.LLJ.getValue();
            if (iSocialAvatarService != null) {
                this.LL = 1;
                obj = iSocialAvatarService.LIZJ("social_avatar_intro_thought", this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StoryThoughtAvatarSheetFragment@7f43.onViewCreated$5");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryThoughtAvatarSheetFragment@7f43.onViewCreated$5");
            return unit;
        }
        String str = (String) obj;
        if (str != null) {
            C0HCH c0hch = this.LLILLL;
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(c0hch.LLILZIL);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarSheetFragment@7f43.onViewCreated$5");
        return unit2;
    }
}
