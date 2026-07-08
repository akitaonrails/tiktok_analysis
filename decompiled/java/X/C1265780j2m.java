package X;

import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsTabActivity;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseAvatarFragment;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseStyleFragment;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcProgressAssem;
import com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabActivity;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchAssem;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1265780j2m extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            case 4:
                LIZIZ$4(this);
                break;
            case 5:
                LIZIZ$5(this);
                break;
            case 6:
                LIZIZ$6(this);
                break;
            case 7:
                LIZIZ$7(this);
                break;
            case 8:
                LIZIZ$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZIZ$9(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C1265780j2m c1265780j2m) {
        ((Function1) c1265780j2m.l0).invoke(c1265780j2m);
    }

    public static final void LIZIZ$1(C1265780j2m c1265780j2m) {
        FindFriendsTabActivity findFriendsTabActivity = (FindFriendsTabActivity) c1265780j2m.l0;
        findFriendsTabActivity.withState((JediViewModel) findFriendsTabActivity.LLILZ.getValue(), new AwS598S0100000_19((FindFriendsTabActivity) c1265780j2m.l0, 223));
        ((FindFriendsTabActivity) c1265780j2m.l0).finish();
    }

    public static final void LIZIZ$2(C1265780j2m c1265780j2m) {
        ((ProfileAigcChooseAvatarFragment) c1265780j2m.l0).onBackPressed();
    }

    public static final void LIZIZ$3(C1265780j2m c1265780j2m) {
        C1221880hty.LIZ.getClass();
        C1221880hty.LIZ(null, "back");
        C19EG activity = ((ProfileAigcChooseStyleFragment) c1265780j2m.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void LIZIZ$4(C1265780j2m c1265780j2m) {
        ((ProfileAigcProgressAssem) c1265780j2m.l0).Vo();
    }

    public static final void LIZIZ$5(C1265780j2m c1265780j2m) {
        FollowRelationTabActivity followRelationTabActivity = (FollowRelationTabActivity) c1265780j2m.l0;
        AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(followRelationTabActivity, 370);
        followRelationTabActivity.getClass();
        if (C300120Bpa.LIZ()) {
            AssemVMLazy assemVMLazy = followRelationTabActivity.LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FollowRelationTabActivity.LLIZ;
            C736680Sv4.LJIJJ(assemVMLazy.getValue(), new AwS598S0100000_19(awS598S0100000_19, 921));
        } else {
            followRelationTabActivity.withState((JediViewModel) followRelationTabActivity.LLILLJJLI.getValue(), new AwS598S0100000_19(awS598S0100000_19, 922));
        }
        Activity activityLIZ = C1388190mED.LIZ((FollowRelationTabActivity) c1265780j2m.l0);
        if (activityLIZ != null) {
            activityLIZ.finish();
        }
    }

    public static final void LIZIZ$6(C1265780j2m c1265780j2m) {
        Boolean bool = ((RelationSearchAssem) c1265780j2m.l0).LLJJIJIIJIL;
        Boolean bool2 = Boolean.FALSE;
        if (!Intrinsics.LJFF(bool, bool2)) {
            ((RelationSearchAssem) c1265780j2m.l0).Jo(bool2);
        }
    }

    public static final void LIZIZ$7(C1265780j2m c1265780j2m) {
        I18nAbsProfileFragmentV2 i18nAbsProfileFragmentV2 = (I18nAbsProfileFragmentV2) ((WeakReference) c1265780j2m.l0).get();
        if (i18nAbsProfileFragmentV2 != null && i18nAbsProfileFragmentV2.getActivity() != null) {
            c1265780j2m.LJFF(false);
            c1265780j2m.LJ();
            i18nAbsProfileFragmentV2.getActivity().getOnBackPressedDispatcher().LJ();
            i18nAbsProfileFragmentV2.RR();
        }
    }

    public static final void LIZIZ$8(C1265780j2m c1265780j2m) {
        if (((I18nAbsProfileFragmentV2) c1265780j2m.l0).getActivity() != null) {
            c1265780j2m.LJFF(false);
            c1265780j2m.LJ();
            ((I18nAbsProfileFragmentV2) c1265780j2m.l0).getActivity().getOnBackPressedDispatcher().LJ();
            ((I18nAbsProfileFragmentV2) c1265780j2m.l0).RR();
        }
    }

    public static final void LIZIZ$9(C1265780j2m c1265780j2m) {
        if (((I18nAbsProfileFragmentV2) c1265780j2m.l0).getActivity() != null) {
            c1265780j2m.LJFF(false);
            c1265780j2m.LJ();
            ((I18nAbsProfileFragmentV2) c1265780j2m.l0).getActivity().getOnBackPressedDispatcher().LJ();
            ((I18nAbsProfileFragmentV2) c1265780j2m.l0).RR();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265780j2m(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265780j2m(Object obj, boolean z, int i) {
        super(z);
        this.$t = i;
        this.l0 = obj;
    }
}
