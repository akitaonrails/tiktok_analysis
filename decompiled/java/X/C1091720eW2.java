package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0eW2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091720eW2 implements InterfaceLayoutInflaterFactory2C1091780eW8 {
    @Override // X.InterfaceLayoutInflaterFactory2C1091780eW8
    public final View LJLJJLL(Context context, String str, AttributeSet attributeSet) {
        if (TextUtils.equals(str, "FrameLayout")) {
            if (attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", FollowStatusChangeMethod.PARAM_UID, -1) == 16908290) {
                return new FrameLayout(context, attributeSet);
            }
            return new C1091700eW0(context, attributeSet);
        }
        if (TextUtils.equals(str, "LinearLayout")) {
            return new C1091740eW4(context, attributeSet);
        }
        if (TextUtils.equals(str, "RelativeLayout")) {
            return new C1091690eVz(context, attributeSet);
        }
        if (TextUtils.equals(str, ConstraintLayout.class.getName())) {
            return new C1091790eW9(context, attributeSet);
        }
        if (TextUtils.equals(str, CardView.class.getName())) {
            return new C1091710eW1(context, attributeSet);
        }
        if (TextUtils.equals(str, C1100290ejr.class.getName())) {
            return new C1090440eTy(context, attributeSet);
        }
        if (TextUtils.equals(str, C1090450eTz.class.getName())) {
            return new C1090430eTx(context, attributeSet);
        }
        if (TextUtils.equals(str, C1090460eU0.class.getName())) {
            return new C1090470eU1(context, attributeSet);
        }
        if (TextUtils.equals(str, "View")) {
            return new C1091840eWE(context, attributeSet);
        }
        if (C1105280eru.LIZJ.containsKey(str) && C1105280eru.LIZ(context, ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest())) {
            return C1105280eru.LIZLLL(str, context, attributeSet, ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest());
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return LJLJJLL(context, str, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return LJLJJLL(context, str, attributeSet);
    }
}
