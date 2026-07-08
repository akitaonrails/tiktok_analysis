package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mXF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399990mXF {
    public static final C1399990mXF LIZ = new C1399990mXF();
    public static String LIZIZ;

    public static String LIZ(Context context) {
        AnchorPublishStruct anchorPublishStruct;
        String str;
        Resources resources;
        String string;
        String str2 = LIZIZ;
        if (str2 != null) {
            return str2;
        }
        AnchorListManager.LIZ.getClass();
        Map mapLJII = AnchorListManager.LJII();
        String str3 = null;
        if (mapLJII != null) {
            Iterator it2 = mapLJII.keySet().iterator();
            while (it2.hasNext()) {
                anchorPublishStruct = (AnchorPublishStruct) mapLJII.get(it2.next());
                if (anchorPublishStruct != null && anchorPublishStruct.type == EnumC1430380nKG.GO_LIVE_STUDIO_ANCHOR.getTYPE()) {
                    str = anchorPublishStruct.title;
                    break;
                }
            }
            anchorPublishStruct = null;
            str = null;
        } else {
            anchorPublishStruct = null;
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (anchorPublishStruct != null) {
                str3 = anchorPublishStruct.title;
            }
            LIZIZ = str3;
        }
        String str4 = LIZIZ;
        if (str4 == null) {
            if (context == null || (resources = context.getResources()) == null || (string = resources.getString(2131851040)) == null) {
                return "";
            }
            return string;
        }
        return str4;
    }

    public static void LIZIZ(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        Uri uri = UriProtector.parse(str);
        Uri.Builder builderClearQuery = UriProtector.parse(str).buildUpon().clearQuery();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str2, "show_mask")) {
                builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
            }
        }
        String string = builderClearQuery.appendQueryParameter("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()).appendQueryParameter("show_mask", "1").appendQueryParameter("mask_bg_color", "00000080").appendQueryParameter("enter_from", "video_post_page").build().toString();
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            iLiveOuterService.W3(context, string, AFwS259S0000000_21.get$arr$(6));
        }
    }
}
