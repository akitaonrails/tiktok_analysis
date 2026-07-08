package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.feed.collection.sub.component.VideoAccessibilityComponent;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;

/* JADX INFO: renamed from: X.0Syu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C739060Syu extends C20094213jo {
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
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                break;
        }
    }

    @Override // X.C20094213jo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.$t != 0 ? super.performAccessibilityAction(view, i, bundle) : performAccessibilityAction$0(this, view, i, bundle);
    }

    public C739060Syu(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C739060Syu c739060Syu, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        String str = ((VideoAccessibilityComponent) c739060Syu.l0).LLJJLIIIJLLLLLLLZ;
        if (str != null) {
            accessibilityNodeInfoCompat.setStateDescription(str);
        }
        C20092413jW c20092413jW = ((VideoAccessibilityComponent) c739060Syu.l0).LLJL;
        if (c20092413jW != null) {
            accessibilityNodeInfoCompat.addAction(c20092413jW);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C739060Syu c739060Syu, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String string;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        Context context = ((C726880SfG) c739060Syu.l0).getContext();
        if (context != null) {
            string = context.getString(2131823173);
        } else {
            string = null;
        }
        accessibilityNodeInfoCompat.setContentDescription(string);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$2(C739060Syu c739060Syu, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        String keyword = ((AnchorCommonStruct) c739060Syu.l0).getKeyword();
        if (keyword == null) {
            keyword = "";
        }
        accessibilityNodeInfoCompat.setContentDescription(keyword);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.addAction(16);
    }

    public static final boolean performAccessibilityAction$0(C739060Syu c739060Syu, View view, int i, Bundle bundle) {
        if (i == 16) {
            VideoAccessibilityComponent videoAccessibilityComponent = (VideoAccessibilityComponent) c739060Syu.l0;
            if (videoAccessibilityComponent.LLJJL) {
                IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) videoAccessibilityComponent.LLJLILLLLZIIL.getValue();
                if (iPlayerComponentAbility != null) {
                    iPlayerComponentAbility.tryResumePlay();
                }
            } else {
                IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) videoAccessibilityComponent.LLJLILLLLZIIL.getValue();
                if (iPlayerComponentAbility2 != null) {
                    iPlayerComponentAbility2.LLLLLLLLLL();
                }
            }
            ((VideoAccessibilityComponent) c739060Syu.l0).fw2(!r1.LLJJL);
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
