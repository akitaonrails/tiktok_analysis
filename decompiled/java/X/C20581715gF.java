package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15gF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM$init$1$4", f = "StoryThoughtAvatarCreationVM.kt", l = {}, m = "invokeSuspend")
public final class C20581715gF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryThoughtAvatarCreationVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20581715gF(StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM, InterfaceC1364105Vn<? super C20581715gF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyThoughtAvatarCreationVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20581715gF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("StoryThoughtAvatarCreationVM@cb29.init$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM = this.LL;
        T value = storyThoughtAvatarCreationVM.LLLJL.getValue();
        EnumC1405120mfW enumC1405120mfW = EnumC1405120mfW.GENERATED_AVATAR;
        if (value == enumC1405120mfW && storyThoughtAvatarCreationVM.LLLILZ.getValue() == EnumC339980DUm.IN_PROGRESS) {
            str = "generating_thought_avatar";
        } else if (storyThoughtAvatarCreationVM.LLLJL.getValue() == enumC1405120mfW && storyThoughtAvatarCreationVM.LLLILZ.getValue() == EnumC339980DUm.FINISHED) {
            str = "generated_thought_avatar";
        } else if (storyThoughtAvatarCreationVM.LLLJL.getValue() == EnumC1405120mfW.SOCIAL_AVATAR) {
            str = "avatar_head";
        } else {
            str = "pic_head";
        }
        storyThoughtAvatarCreationVM.LLJJJJLIIL = str;
        C20581815gG c20581815gG = C20581815gG.LIZ;
        C20583215gU c20583215gUAQ2 = this.LL.AQ2();
        boolean zGQ2 = this.LL.GQ2();
        int iFQ2 = this.LL.FQ2();
        c20581815gG.getClass();
        C0LAB c0labLIZ = C20581815gG.LIZ(c20583215gUAQ2);
        c0labLIZ.LIZ(zGQ2 ? 1 : 0, "is_draft");
        c0labLIZ.LIZ(iFQ2, "draft_status");
        C20684815ws.LJIILLIIL("enter_thought_edit_page", c0labLIZ.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarCreationVM@cb29.init$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
