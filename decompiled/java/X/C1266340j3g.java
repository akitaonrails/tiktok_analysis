package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;
import com.ss.android.ugc.profile.business.ur.platform.addfriends.ProfileNavbarAddFriendProtocol;
import com.ss.android.ugc.profile.platform.base.data.Describe;

/* JADX INFO: renamed from: X.0j3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266340j3g extends C20094213jo {
    public final int $t;
    public Object l0;

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.$t) {
            case 0:
                onInitializeAccessibilityNodeInfo$0(this, view, accessibilityNodeInfoCompat);
                break;
            case 1:
                onInitializeAccessibilityNodeInfo$1(this, view, accessibilityNodeInfoCompat);
                break;
            case 2:
                onInitializeAccessibilityNodeInfo$2(this, view, accessibilityNodeInfoCompat);
                break;
            case 3:
                onInitializeAccessibilityNodeInfo$3(this, view, accessibilityNodeInfoCompat);
                break;
            case 4:
                onInitializeAccessibilityNodeInfo$4(this, view, accessibilityNodeInfoCompat);
                break;
            case 5:
                onInitializeAccessibilityNodeInfo$5(this, view, accessibilityNodeInfoCompat);
                break;
            case 6:
                onInitializeAccessibilityNodeInfo$6(this, view, accessibilityNodeInfoCompat);
                break;
            case 7:
                onInitializeAccessibilityNodeInfo$7(this, view, accessibilityNodeInfoCompat);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                break;
        }
    }

    public C1266340j3g(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C1266340j3g c1266340j3g, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setRoleDescription(((InputCodeFragment) c1266340j3g.l0).getString(2131823161));
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C1266340j3g c1266340j3g, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String string;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        Context context = ((PhoneLoginFragment) c1266340j3g.l0).getContext();
        if (context != null) {
            string = context.getString(2131823161);
        } else {
            string = null;
        }
        accessibilityNodeInfoCompat.setRoleDescription(string);
    }

    public static final void onInitializeAccessibilityNodeInfo$2(C1266340j3g c1266340j3g, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setContentDescription(((C1255350ilx) c1266340j3g.l0).LLILZ.getText());
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$3(C1266340j3g c1266340j3g, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setContentDescription(((C1256160inG) c1266340j3g.l0).LIZ);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        String str = ((C1256160inG) c1266340j3g.l0).LIZIZ;
        if (str != null && str.length() != 0) {
            accessibilityNodeInfoCompat.addAction(new C20092413jW(16, ((C1256160inG) c1266340j3g.l0).LIZIZ));
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$4(C1266340j3g c1266340j3g, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setRoleDescription(((InputCodeFragmentV2) c1266340j3g.l0).getString(2131823161));
    }

    public static final void onInitializeAccessibilityNodeInfo$5(C1266340j3g c1266340j3g, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setRoleDescription(((C1257500ipQ) c1266340j3g.l0).getContext().getResources().getString(2131823349));
    }

    public static final void onInitializeAccessibilityNodeInfo$6(C1266340j3g c1266340j3g, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String text;
        Describe describe;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        T t = ((ProfileNavbarAddFriendProtocol) c1266340j3g.l0).LLJILJIL;
        if (t == 0 || (describe = t.getDescribe()) == null || (text = describe.getText()) == null) {
            text = "";
        }
        accessibilityNodeInfoCompat.setContentDescription(text);
    }

    public static final void onInitializeAccessibilityNodeInfo$7(C1266340j3g c1266340j3g, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setContentDescription(((C1216190hkn) c1266340j3g.l0).LLILZIL.getText());
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }
}
