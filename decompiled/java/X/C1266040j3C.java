package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.relation.ffp.util.RouteAddFriendsPageController;
import com.ss.android.ugc.profile.business.ur.platform.business.INotifyAbility;
import com.ss.android.ugc.profile.business.ur.platform.business.RelationFollowingProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266040j3C implements OnActivityResultCallback {
    public final int $t;
    public Object l0;

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (this.$t) {
            case 0:
                onActivityResult$0(this, i, i2, intent);
                break;
            case 1:
                onActivityResult$1(this, i, i2, intent);
                break;
            case 2:
                onActivityResult$2(this, i, i2, intent);
                break;
            case 3:
                onActivityResult$3(this, i, i2, intent);
                break;
            case 4:
                onActivityResult$4(this, i, i2, intent);
                break;
            case 5:
                onActivityResult$5(this, i, i2, intent);
                break;
        }
    }

    public C1266040j3C(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onActivityResult$0(C1266040j3C c1266040j3C, int i, int i2, Intent intent) {
        boolean z;
        boolean z2 = true;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (i2 != -1) {
            z2 = false;
        }
        if (z & z2) {
            ((RouteAddFriendsPageController) c1266040j3C.l0).getClass();
        }
    }

    public static final void onActivityResult$1(C1266040j3C c1266040j3C, int i, int i2, Intent intent) {
        OnActivityResultCallback onActivityResultCallback = (OnActivityResultCallback) c1266040j3C.l0;
        if (onActivityResultCallback != null) {
            onActivityResultCallback.onActivityResult(i, i2, intent);
        }
    }

    public static final void onActivityResult$2(C1266040j3C c1266040j3C, int i, int i2, Intent intent) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z & z2) {
            RelationFollowingProtocol relationFollowingProtocol = (RelationFollowingProtocol) c1266040j3C.l0;
            if (intent == null || !intent.getBooleanExtra("following_page_extra_key", false)) {
                z3 = false;
            }
            relationFollowingProtocol.LLJJJJ = z3;
            INotifyAbility iNotifyAbility = (INotifyAbility) C1558520qew.LIZ(C1558420qem.LIZIZ((RelationFollowingProtocol) c1266040j3C.l0), INotifyAbility.class, null);
            if (iNotifyAbility != null) {
                iNotifyAbility.El1(((RelationFollowingProtocol) c1266040j3C.l0).LLJJJJ);
            }
        }
    }

    public static final void onActivityResult$3(C1266040j3C c1266040j3C, int i, int i2, Intent intent) {
        ((Function0) c1266040j3C.l0).invoke();
    }

    public static final void onActivityResult$4(C1266040j3C c1266040j3C, int i, int i2, Intent intent) {
        if (i == 1846 && i2 == 102) {
            ((C1238900iLQ) c1266040j3C.l0).kD("auth_check_code_fail");
        }
    }

    public static final void onActivityResult$5(C1266040j3C c1266040j3C, int i, int i2, Intent intent) {
        if (i == 1846 && i2 == 102) {
            ((Function0) c1266040j3C.l0).invoke();
        }
    }
}
