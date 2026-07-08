package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.15g3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM$init$1$2", f = "StoryThoughtAvatarCreationVM.kt", l = {}, m = "invokeSuspend")
public final class C20580515g3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryThoughtAvatarCreationVM LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20580515g3(StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM, String str, String str2, InterfaceC1364105Vn<? super C20580515g3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyThoughtAvatarCreationVM;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20580515g3(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1405120mfW enumC1405120mfWLIZ;
        boolean z;
        String str;
        C1C7U.LIZ("StoryThoughtAvatarCreationVM@cb29.init$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM = this.LL;
        String str2 = this.LLILLJJLI;
        boolean zLJFF = Intrinsics.LJFF(storyThoughtAvatarCreationVM.LLJLIL, true);
        String str3 = this.LLILLL;
        EnumC1405120mfW enumC1405120mfW = null;
        if (((Boolean) C287160BNi.LIZIZ.getValue()).booleanValue() && Keva.getRepo("story_thought").contains(storyThoughtAvatarCreationVM.BQ2())) {
            C1405110mfV c1405110mfV = EnumC1405120mfW.Companion;
            int i = Keva.getRepo("story_thought").getInt(storyThoughtAvatarCreationVM.BQ2(), EnumC1405120mfW.DEFAULT.getValue());
            c1405110mfV.getClass();
            enumC1405120mfWLIZ = C1405110mfV.LIZ(i);
        } else {
            enumC1405120mfWLIZ = null;
        }
        String str4 = storyThoughtAvatarCreationVM.LLJL;
        if (str4 != null && str4.length() > 0) {
            storyThoughtAvatarCreationVM.LLIZ.setValue(str4);
            if (Intrinsics.LJFF(storyThoughtAvatarCreationVM.LLJZIJLIL.getValue(), Boolean.TRUE)) {
                enumC1405120mfWLIZ = EnumC1405120mfW.SOCIAL_AVATAR;
            } else {
                storyThoughtAvatarCreationVM.LLLLLZ.setValue(Unit.LIZ);
            }
        } else if (str2 != null) {
            if (Intrinsics.LJFF(storyThoughtAvatarCreationVM.LLJZIJLIL.getValue(), Boolean.TRUE)) {
                storyThoughtAvatarCreationVM.LLIZ.setValue(str2);
                enumC1405120mfWLIZ = EnumC1405120mfW.SOCIAL_AVATAR;
            } else {
                storyThoughtAvatarCreationVM.LLLLLZ.setValue(Unit.LIZ);
            }
        }
        if (zLJFF || (Intrinsics.LJFF(storyThoughtAvatarCreationVM.LLJZIJLIL.getValue(), Boolean.TRUE) && !C1245160iVW.LIZ((User) storyThoughtAvatarCreationVM.LLJJI.getValue()))) {
            z = true;
        } else {
            z = false;
        }
        if (enumC1405120mfWLIZ == null) {
            if (z) {
                enumC1405120mfW = EnumC1405120mfW.SOCIAL_AVATAR;
            }
            enumC1405120mfWLIZ = enumC1405120mfW;
        }
        if (storyThoughtAvatarCreationVM.LLJLLIL) {
            enumC1405120mfWLIZ = EnumC1405120mfW.SOCIAL_AVATAR;
        }
        EnumC1405120mfW enumC1405120mfW2 = EnumC1405120mfW.SOCIAL_AVATAR;
        if (enumC1405120mfWLIZ == enumC1405120mfW2) {
            storyThoughtAvatarCreationVM.LLLF.setValue(enumC1405120mfWLIZ);
        }
        storyThoughtAvatarCreationVM.LLLJ.setValue(enumC1405120mfWLIZ);
        if (C298600Bn8.LIZ() && enumC1405120mfWLIZ == enumC1405120mfW2) {
            if (str3 != null) {
                storyThoughtAvatarCreationVM.XQ2(str3);
            } else {
                List list = (List) storyThoughtAvatarCreationVM.LLJILLL.getValue();
                if (list != null) {
                    storyThoughtAvatarCreationVM.LLJJ.setValue(Integer.valueOf(C13LZ.LJIIJ(AbstractC19994813Le.Default, C13LZ.LJIILJJIL(0, list.size()))));
                }
            }
        }
        if (Intrinsics.LJFF(storyThoughtAvatarCreationVM.LLJZIJLIL.getValue(), Boolean.TRUE) && storyThoughtAvatarCreationVM.LLILZLL != null && ((str = storyThoughtAvatarCreationVM.LLJL) == null || str.length() == 0)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("story_thought_avatar_thoughts_holiday_autofill_");
            sbLIZ.append(storyThoughtAvatarCreationVM.JQ2());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (Keva.getRepo("story_thought").getLong(strLIZIZ, -1L) != storyThoughtAvatarCreationVM.LLILZLL.startTimeInMillisecond) {
                Keva.getRepo("story_thought").storeLong(strLIZIZ, storyThoughtAvatarCreationVM.LLILZLL.startTimeInMillisecond);
                storyThoughtAvatarCreationVM.LLIZ.setValue(storyThoughtAvatarCreationVM.LLILZLL.getImmersiveViewGuidanceText(true));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarCreationVM@cb29.init$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
