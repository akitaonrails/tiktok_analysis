package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.publish.IAVMentionEditText;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400000mXG {
    public static final C1400000mXG LIZ = new C1400000mXG();

    public static void LIZ(InterfaceC1107590evd interfaceC1107590evd, IAVMentionEditText iAVMentionEditText) {
        try {
            String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "creator_name", "");
            if (strLJFF != null) {
                Unit unit = null;
                if (!a0.LJJJIL(strLJFF)) {
                    String strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "creator_uid", "");
                    if ((!a0.LJJJIL(strLJFF2)) && strLJFF2 != null) {
                        String strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd, "creator_sec_uid", "");
                        if ((!a0.LJJJIL(strLJFF3)) && strLJFF3 != null) {
                            if (iAVMentionEditText != null) {
                                iAVMentionEditText.addMentionUser(0, strLJFF, strLJFF2, strLJFF3);
                                unit = Unit.LIZ;
                            }
                            C189200o6.m2constructorimpl(unit);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        Uri uri = UriProtector.parse(str);
        Uri.Builder builderClearQuery = UriProtector.parse(str).buildUpon().clearQuery();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str2, "show_mask")) {
                builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
            }
        }
        iLiveOuterService.W3(context, builderClearQuery.appendQueryParameter("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()).appendQueryParameter("show_mask", "1").appendQueryParameter("mask_bg_color", "00000080").appendQueryParameter("enter_from", "video_post_page").build().toString(), AFwS259S0000000_21.get$arr$(5));
    }
}
