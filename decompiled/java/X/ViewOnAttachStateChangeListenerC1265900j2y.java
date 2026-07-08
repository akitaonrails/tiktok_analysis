package X;

import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationLoadingAssem;
import com.ss.android.ugc.aweme.notification.followrequest.vh.FollowRequestViewHolderInFollower;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem.RelationUserCellAssem;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0j2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class ViewOnAttachStateChangeListenerC1265900j2y implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
    }

    public static final void onViewDetachedFromWindow$5(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC1265900j2y(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
        ((C1390410mHn) viewOnAttachStateChangeListenerC1265900j2y.l0).LIZJ();
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
        FollowRequestViewHolderInFollower followRequestViewHolderInFollower = (FollowRequestViewHolderInFollower) viewOnAttachStateChangeListenerC1265900j2y.l0;
        User user = followRequestViewHolderInFollower.curUser;
        if (user == null) {
            return;
        }
        followRequestViewHolderInFollower.getClass();
        user.getUid();
        throw null;
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
        String uid;
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[FDUP] cell attached holder=");
        sbLIZ.append(((RelationUserCellAssem) viewOnAttachStateChangeListenerC1265900j2y.l0).Ap());
        sbLIZ.append(", position=");
        RelationUserCellAssem relationUserCellAssem = (RelationUserCellAssem) viewOnAttachStateChangeListenerC1265900j2y.l0;
        relationUserCellAssem.getClass();
        sbLIZ.append(C631370Opb.LIZIZ(relationUserCellAssem));
        sbLIZ.append(", currUid=");
        C1265420j2C c1265420j2C = ((RelationUserCellAssem) viewOnAttachStateChangeListenerC1265900j2y.l0).LLJJLIIIJLLLLLLLZ;
        if (c1265420j2C != null && (user = c1265420j2C.LLILLJJLI) != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        sbLIZ.append(uid);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
        AssemVMLazy assemVMLazy = ((GroupInvitationLoadingAssem) viewOnAttachStateChangeListenerC1265900j2y.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupInvitationLoadingAssem.LLJI;
        if (((C1230460i7o) assemVMLazy.getValue().getState()).LLILZIL) {
            ((C1390410mHn) ((GroupInvitationLoadingAssem) viewOnAttachStateChangeListenerC1265900j2y.l0).LLJ.getValue()).LIZJ();
        }
    }

    public static final void onViewAttachedToWindow$4(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
        ((SmartImageView) ((C1259680isw) viewOnAttachStateChangeListenerC1265900j2y.l0).LLILZIL.findViewById(R.id.ld7)).setAttached(true);
    }

    public static final void onViewAttachedToWindow$5(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
        ((I18nAbsProfileFragmentV2) viewOnAttachStateChangeListenerC1265900j2y.l0).LLILZ.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1265900j2y);
        ((I18nAbsProfileFragmentV2) viewOnAttachStateChangeListenerC1265900j2y.l0).VR(true);
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
        ((C1390410mHn) viewOnAttachStateChangeListenerC1265900j2y.l0).LIZLLL();
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
        String uid;
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[FDUP] cell detached holder=");
        sbLIZ.append(((RelationUserCellAssem) viewOnAttachStateChangeListenerC1265900j2y.l0).Ap());
        sbLIZ.append(", position=");
        RelationUserCellAssem relationUserCellAssem = (RelationUserCellAssem) viewOnAttachStateChangeListenerC1265900j2y.l0;
        relationUserCellAssem.getClass();
        sbLIZ.append(C631370Opb.LIZIZ(relationUserCellAssem));
        sbLIZ.append(", currUid=");
        C1265420j2C c1265420j2C = ((RelationUserCellAssem) viewOnAttachStateChangeListenerC1265900j2y.l0).LLJJLIIIJLLLLLLLZ;
        if (c1265420j2C != null && (user = c1265420j2C.LLILLJJLI) != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        sbLIZ.append(uid);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onViewDetachedFromWindow$4(ViewOnAttachStateChangeListenerC1265900j2y viewOnAttachStateChangeListenerC1265900j2y, View view) {
        ((SmartImageView) ((C1259680isw) viewOnAttachStateChangeListenerC1265900j2y.l0).LLILZIL.findViewById(R.id.ld7)).setAttached(false);
    }
}
