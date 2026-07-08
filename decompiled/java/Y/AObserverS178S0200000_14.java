package Y;

import X.AbstractC857240Xk2;
import X.C0LCS;
import X.C0S1B;
import X.C0ZI0;
import X.C11GO;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1722406oo;
import X.C857220Xk0;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import com.ss.android.ugc.aweme.im.messagelist.RecentActivityCardUISlot;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.EditPageDefaultPrivacySettingFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class AObserverS178S0200000_14 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS178S0200000_14 aObserverS178S0200000_14, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        if (Intrinsics.LJFF(followStatus.getUserId(), String.valueOf(((C1722406oo) aObserverS178S0200000_14.l0).creatorUserId)) && followStatus.getFollowStatus() != 2) {
            ((RecentActivityCardUISlot) aObserverS178S0200000_14.l1).tp().LIZIZ(((RecentActivityCardUISlot) aObserverS178S0200000_14.l1).sp().LL.getConversationId());
            ((RecentActivityCardUISlot) aObserverS178S0200000_14.l1).dismiss();
        }
    }

    public static final void onChanged$1(AObserverS178S0200000_14 aObserverS178S0200000_14, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((AbstractC857240Xk2) aObserverS178S0200000_14.l0).LIZIZ();
            ((AbstractC857240Xk2) aObserverS178S0200000_14.l0).LIZ((C857220Xk0) aObserverS178S0200000_14.l1);
            ((AbstractC857240Xk2) aObserverS178S0200000_14.l0).LLILLL.removeObserver(aObserverS178S0200000_14);
        }
    }

    public static final void onChanged$2(AObserverS178S0200000_14 aObserverS178S0200000_14, Object obj) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObserverS178S0200000_14.l0;
        Integer num = (Integer) aObserverS178S0200000_14.l1;
        if (videoPublishContainerScene.LLJLLL.aK0()) {
            if (videoPublishContainerScene.LLLIIL.getBackground() != null) {
                videoPublishContainerScene.LLLIIL.getBackground().setAlpha(255);
            }
            if (videoPublishContainerScene.LLLZL.getBackground() != null) {
                videoPublishContainerScene.LLLZL.getBackground().setAlpha(255);
            }
        } else {
            if (videoPublishContainerScene.LLLIIL.getBackground() != null) {
                videoPublishContainerScene.LLLIIL.getBackground().setAlpha(102);
            }
            if (videoPublishContainerScene.LLLZL.getBackground() != null) {
                videoPublishContainerScene.LLLZL.getBackground().setAlpha(102);
            }
        }
        if (obj != null) {
            videoPublishContainerScene.LLLZL.setText(2131858145);
            videoPublishContainerScene.LLLZL.setButtonStartIcon(Integer.valueOf(R.raw.icon_clock));
        } else {
            videoPublishContainerScene.LLLZL.setText(2131845588);
            if (num != null) {
                videoPublishContainerScene.LLLZL.setButtonStartIcon(num);
            } else {
                videoPublishContainerScene.LLLZL.setButtonStartIcon(null);
            }
            videoPublishContainerScene.z();
        }
        videoPublishContainerScene.h0(videoPublishContainerScene.LLLIIL);
    }

    public static final void onChanged$3(AObserverS178S0200000_14 aObserverS178S0200000_14, Object obj) {
        C0ZI0 c0zi0 = (C0ZI0) aObserverS178S0200000_14.l0;
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = (ViewTreeObserver.OnWindowFocusChangeListener) aObserverS178S0200000_14.l1;
        if (((Boolean) obj).booleanValue() && !c0zi0.LLJILJILJ) {
            c0zi0.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$4(AObserverS178S0200000_14 aObserverS178S0200000_14, Object obj) {
        C11GO c11go;
        if (((Number) ((Pair) ((C0LCS) obj).LIZ).getFirst()).intValue() == 4) {
            C127K c127k = ((EditPageDefaultPrivacySettingFragment) aObserverS178S0200000_14.l0).LLLIL;
            C127M accessory = null;
            if (c127k != null) {
                accessory = c127k.getAccessory();
            }
            if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                c11go.LJIILJJIL(false);
            }
            ((VideoPublishEditModel) aObserverS178S0200000_14.l1).creativeModel.privacySettingModel.allowAIRemix = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$5(AObserverS178S0200000_14 aObserverS178S0200000_14, Object obj) {
        C11GO c11go;
        if (((Number) ((Pair) ((C0LCS) obj).LIZ).getFirst()).intValue() == 4) {
            C127K c127k = ((EditPageDefaultPrivacySettingFragment) aObserverS178S0200000_14.l0).LLLIILIL;
            C127M accessory = null;
            if (c127k != null) {
                accessory = c127k.getAccessory();
            }
            if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                c11go.LJIILJJIL(false);
            }
            ((VideoPublishEditModel) aObserverS178S0200000_14.l1).creativeModel.privacySettingModel.contentReusePermission = 2;
        }
    }

    public static final void onChanged$6(AObserverS178S0200000_14 aObserverS178S0200000_14, Object obj) {
        long jLongValue;
        Long l;
        Long l2;
        Pair pair = (Pair) obj;
        User user = (User) aObserverS178S0200000_14.l0;
        if (pair != null && (l2 = (Long) pair.getFirst()) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        user.roomId = jLongValue;
        SingleTitleBarCenterAssem singleTitleBarCenterAssem = (SingleTitleBarCenterAssem) aObserverS178S0200000_14.l1;
        if (singleTitleBarCenterAssem.LLLFF == null && pair != null) {
            singleTitleBarCenterAssem.Bp((Long) pair.getFirst());
        }
        SingleTitleBarCenterAssem singleTitleBarCenterAssem2 = (SingleTitleBarCenterAssem) aObserverS178S0200000_14.l1;
        String str = null;
        if (pair != null) {
            l = (Long) pair.getFirst();
        } else {
            l = null;
        }
        singleTitleBarCenterAssem2.LLLFF = l;
        SingleTitleBarCenterAssem singleTitleBarCenterAssem3 = (SingleTitleBarCenterAssem) aObserverS178S0200000_14.l1;
        if (pair != null) {
            str = (String) pair.getSecond();
        }
        singleTitleBarCenterAssem3.LLLFFI = str;
        AvatarComponentView avatarComponentView = ((SingleTitleBarCenterAssem) aObserverS178S0200000_14.l1).LLJLLL;
        if (avatarComponentView != null) {
            String uid = ((User) aObserverS178S0200000_14.l0).getUid();
            if (uid == null) {
                uid = "";
            }
            C0S1B.LIZ(avatarComponentView, uid, (User) aObserverS178S0200000_14.l0, (SingleTitleBarCenterAssem) aObserverS178S0200000_14.l1, false, null, 56);
        }
    }

    public AObserverS178S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
