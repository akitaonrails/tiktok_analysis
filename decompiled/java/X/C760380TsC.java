package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C760380TsC {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Fragment fragment, boolean z) {
        Context context;
        if (z) {
            if (fragment != null) {
                context = fragment.getContext();
            } else {
                context = null;
            }
            return (C465640INu.LIZIZ(context) * 622) / 375;
        }
        return -1;
    }

    public static void LIZIZ(Uri uri, Fragment fragment, boolean z) {
        int iLIZ;
        int iLJIIIZ;
        Context context;
        View view;
        View view2;
        if (fragment != null && (view2 = fragment.getView()) != null) {
            iLIZ = view2.getHeight();
        } else {
            iLIZ = LIZ(fragment, z);
        }
        Uri uriLJJL = C500260Jjc.LJJL(uri, "height", String.valueOf((int) C497740JfY.LJJI(iLIZ)));
        if (fragment != null && (view = fragment.getView()) != null) {
            iLJIIIZ = view.getWidth();
        } else if (z) {
            iLJIIIZ = -1;
        } else {
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.arw);
        }
        String strValueOf = String.valueOf((int) C497740JfY.LJJI(iLJIIIZ));
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        Uri.Builder builderAppendQueryParameter = uriLJJL.buildUpon().appendQueryParameter("width", strValueOf).appendQueryParameter("rank_height_unit", "rank_dp_unit");
        if (!z) {
            builderAppendQueryParameter.appendQueryParameter("landscape_width", strValueOf);
            builderAppendQueryParameter.appendQueryParameter("landscape_transition_animation", "end");
            builderAppendQueryParameter.appendQueryParameter("landscape_gravity", "end");
        }
        if (!z || TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJJL, "height"))) {
            builderAppendQueryParameter.appendQueryParameter("height", String.valueOf((int) C497740JfY.LJJI(LIZ(fragment, z))));
        }
        iActionHandlerService.handle(context, builderAppendQueryParameter.build());
    }
}
