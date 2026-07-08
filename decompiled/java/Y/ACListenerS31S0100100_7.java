package Y;

import X.C0K4Z;
import X.C0K54;
import X.C0KWU;
import X.C1086960eOM;
import X.C197039127h;
import X.C19EG;
import X.C19EH;
import X.C2097608Jq;
import X.C500260Jjc;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.interaction.AudienceInteractionFeaturesDialog;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.setting.view.fragment.SubSpaceSettingFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.spacemember.view.fragment.SubSpaceMemberListFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS31S0100100_7 implements View.OnClickListener {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS31S0100100_7 aCListenerS31S0100100_7, View view) {
        long j = aCListenerS31S0100100_7.j1;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - C500260Jjc.LIZ >= j) {
            C500260Jjc.LIZ = jUptimeMillis;
            ((Function1) aCListenerS31S0100100_7.l0).invoke(view);
        }
    }

    public static final void onClick$1(ACListenerS31S0100100_7 aCListenerS31S0100100_7, View view) {
        long j = aCListenerS31S0100100_7.j1;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - C500260Jjc.LIZ >= j) {
            C500260Jjc.LIZ = jUptimeMillis;
            ((View.OnClickListener) aCListenerS31S0100100_7.l0).onClick(view);
        }
    }

    public static final void onClick$2(ACListenerS31S0100100_7 aCListenerS31S0100100_7, View view) {
        FragmentManager supportFragmentManager;
        C19EG activity = ((SubSpaceSettingFragment) aCListenerS31S0100100_7.l0).getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            SubSpaceSettingFragment subSpaceSettingFragment = (SubSpaceSettingFragment) aCListenerS31S0100100_7.l0;
            long j = aCListenerS31S0100100_7.j1;
            C0K4Z c0k4z = SubSpaceMemberListFragment.LLJ;
            int i = subSpaceSettingFragment.LLILZ;
            c0k4z.getClass();
            SubSpaceMemberListFragment subSpaceMemberListFragment = new SubSpaceMemberListFragment();
            subSpaceMemberListFragment.LLIZLLLIL = j;
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJJ(R.anim.mg, R.anim.f487ms);
            c19ehLJIIJ.LIZJ(i, subSpaceMemberListFragment, "SubOnlySpaceMemberListFragment");
            c19ehLJIIJ.LJII("SubOnlySpaceMemberListFragment");
            c19ehLJIIJ.LJIIJ();
        }
    }

    public static final void onClick$3(ACListenerS31S0100100_7 aCListenerS31S0100100_7, View view) {
        ((AudienceInteractionFeaturesDialog) aCListenerS31S0100100_7.l0).dismiss();
        C1086960eOM c1086960eOM = C1086960eOM.LL;
        long j = aCListenerS31S0100100_7.j1;
        c1086960eOM.getClass();
        C1086960eOM.LJIILLIIL(j);
        C0KWU.LIZJ(((AudienceInteractionFeaturesDialog) aCListenerS31S0100100_7.l0).dataChannel, "toolbar_interact");
    }

    public static final void onClick$4(ACListenerS31S0100100_7 aCListenerS31S0100100_7, View view) {
        C0K54.LIZ().LJFF(((C197039127h) aCListenerS31S0100100_7.l0).getContext(), aCListenerS31S0100100_7.j1, C2097608Jq.LJ());
    }

    public ACListenerS31S0100100_7(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
