package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.ability.SuppressPanelAutoSwitchAbility;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.share.IMixStudioShareDMAbility;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserFragment;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IDZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDZ implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
        }
    }

    public C0IDZ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(C0IDZ c0idz, DialogInterface dialogInterface) {
        StoryNotePanelUserVM storyNotePanelUserVMUR = ((StoryNotePanelUserFragment) c0idz.l0).UR();
        storyNotePanelUserVMUR.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyNotePanelUserVMUR), null, null, new C438270HGn(storyNotePanelUserVMUR, null), 3);
    }

    public static final void onDismiss$1(C0IDZ c0idz, DialogInterface dialogInterface) {
        SuppressPanelAutoSwitchAbility suppressPanelAutoSwitchAbility;
        Fragment fragment = (Fragment) c0idz.l0;
        if (fragment != null && (suppressPanelAutoSwitchAbility = (SuppressPanelAutoSwitchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), SuppressPanelAutoSwitchAbility.class, null)) != null) {
            suppressPanelAutoSwitchAbility.rq0(false);
        }
    }

    public static final void onDismiss$2(C0IDZ c0idz, DialogInterface dialogInterface) {
        C1371590lnR c1371590lnRZ2 = null;
        IMixStudioShareDMAbility iMixStudioShareDMAbility = (IMixStudioShareDMAbility) C1558520qew.LIZ(C1558360qeg.LJFF((MixStudioShareFragment) c0idz.l0, null), IMixStudioShareDMAbility.class, null);
        if (iMixStudioShareDMAbility != null) {
            c1371590lnRZ2 = iMixStudioShareDMAbility.Z2();
        }
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJ(((MixStudioShareFragment) c0idz.l0).LLJIJIL, c1371590lnRZ2);
    }

    public static final void onDismiss$3(C0IDZ c0idz, DialogInterface dialogInterface) {
        if (Intrinsics.LJFF(((StoryThoughtAvatarCreationFragment) c0idz.l0).WR().LLL.getValue(), Boolean.FALSE)) {
            ((StoryThoughtAvatarCreationFragment) c0idz.l0).WR().LQ2("close");
        } else {
            ((StoryThoughtAvatarCreationFragment) c0idz.l0).WR().PQ2("close");
        }
    }

    public static final void onDismiss$4(C0IDZ c0idz, DialogInterface dialogInterface) {
        if (Intrinsics.LJFF(((StoryThoughtAvatarCreationFragment) c0idz.l0).WR().LLL.getValue(), Boolean.FALSE)) {
            ((StoryThoughtAvatarCreationFragment) c0idz.l0).WR().LQ2("close");
        } else {
            ((StoryThoughtAvatarCreationFragment) c0idz.l0).WR().PQ2("close");
        }
    }

    public static final void onDismiss$5(C0IDZ c0idz, DialogInterface dialogInterface) {
        InterfaceC455470HtZ interfaceC455470HtZ;
        C705930RmZ c705930RmZ = ((C19599711mF) c0idz.l0).LLILLL;
        if (c705930RmZ != null && (interfaceC455470HtZ = c705930RmZ.LJIILLIIL) != null) {
            interfaceC455470HtZ.LJIILLIIL();
        }
    }

    public static final void onDismiss$6(C0IDZ c0idz, DialogInterface dialogInterface) {
        InterfaceC455470HtZ interfaceC455470HtZ;
        C705930RmZ c705930RmZ = (C705930RmZ) c0idz.l0;
        if (c705930RmZ != null && (interfaceC455470HtZ = c705930RmZ.LJIILLIIL) != null) {
            interfaceC455470HtZ.LJIILLIIL();
        }
    }
}
