package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.assem.PostTopicListAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment.SubSpaceCustomPostEditFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501870JmD extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ PostTopicListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501870JmD(PostTopicListAssem postTopicListAssem) {
        super(2);
        this.LL = postTopicListAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        String str;
        String str2;
        C501820Jm8 c501820Jm8;
        SpaceTopicCategory spaceTopicCategory;
        FragmentManager childFragmentManager;
        UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c291001Au2.LIZ).booleanValue());
            PostTopicListAssem postTopicListAssem = this.LL;
            boolValueOf.booleanValue();
            Fragment fragmentLJI = C724240Sb0.LJI(uIAssem2);
            if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
                SubSpaceNewPostVM subSpaceNewPostVMHo = postTopicListAssem.Ho();
                C501810Jm7 c501810Jm7Go = postTopicListAssem.Go();
                SubSpaceCustomPostEditFragment subSpaceCustomPostEditFragment = new SubSpaceCustomPostEditFragment();
                subSpaceCustomPostEditFragment.LLILZ = subSpaceNewPostVMHo;
                subSpaceCustomPostEditFragment.LLILZIL = c501810Jm7Go;
                subSpaceCustomPostEditFragment.show(childFragmentManager, "SubSpaceCustomPostEditFragment");
            }
            C501810Jm7 c501810Jm7Go2 = postTopicListAssem.Go();
            if (c501810Jm7Go2 == null || (c501820Jm8 = c501810Jm7Go2.LL) == null || (spaceTopicCategory = c501820Jm8.LIZIZ) == null || (str = spaceTopicCategory.topicCategoryText) == null) {
                str = "";
            }
            C501810Jm7 c501810Jm7Go3 = postTopicListAssem.Go();
            if (c501810Jm7Go3 != null) {
                str2 = c501810Jm7Go3.LLILLJJLI;
            } else {
                str2 = null;
            }
            C502520JnG.LIZJ("edit", str, str2);
        }
        return Unit.LIZ;
    }
}
